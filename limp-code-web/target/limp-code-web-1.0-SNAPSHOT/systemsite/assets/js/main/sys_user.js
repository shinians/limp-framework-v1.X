/***
 * 业务说明： 操作用户组模块
 * @type {{getLeftMenus: Function}}
 */
 $(function(){
     //自动查询第一页用户
     setTimeout(function(){
         SysUser.getUserListForTemp(1);
         SysUser.initUnitTree();
     },1000)
     //按回车键 进行查询
    system.submitById("searchUserBtn");

     /************************用户组_事件*************************/
         //点击userWinForm  确定更新用户基本信息
     $("#usrBtn").click(function(){
         system.post(get_root+"/system/user/updates.action",$("#userForm").serialize(),function(data){
             if("200"==data.code){
                 main.closeOpenWin();
                 main.tip(data.msg,1);
                 SysUser.getUserListForTemp($("#userTablePage .active a").attr("data-value"));
             }else{
                 main.tip(data.msg,0);
             }

         })
     })
     $("#user-basic").click(function(){
         SysUser.openUserForm();
     })
     //新增用户
     $("#user-to-add").click(function(){
         $('#userAddForm')[0].reset()  ;
         $("#userAddWin").click();

     })
     //保存用户信息
     $("#usr-add-btn").click(function(){
         system.saveDomainCall("#userAddForm",function(data){
             if("200"==data.code){
                 main.tip("添加成功",1);
                 main.closeOpenWin();
                 setTimeout(function(){
                     SysUser.getUserListForTemp(1);
                 },2000)
             }else{
                 main.tip(data.msg,0);
             }
         });
     })

     //重置密码
     $("#pwd").click(function(){
         SysUser.userPwdReset();
     })
     //权限菜单
     $("#userMenu").click(function(){
         log.info("配置权限菜单")
         SysUser.openUMenuAuth();
     })
     //元素权限配置
     $("#userPerm").click(function(){
         SysUser.openUPermAuth();
     })
     //删除
     $("#udel").click(function(){
         if(confirm("是否删除该用户")){
             SysUser.userDel();
         }
     }) //审批通过
     $("#uCheck").click(function(){
         SysUser.userCheck();
     })
     //配置次数
     $("#timeSet").click(function(){
         SysUser.openAuthForm();
     })
     //取消邮件发送
     $("#canle-email").click(function(){
         main.closeOpenWin();
     })
     $("#myModal a,#myModal span").click(function(){
         var ids=system.getCheckboxValues(SysUser.userIdChecked);
         if(!system.isBlank(ids)&&ids.indexOf(",")==-1){
             $("#usridto").val(ids);
             log.info(system.cache[ids]);
             $("#toName").val(system.cache[ids]["usrAccount"]);
             $("#emailWin").click();
         }else{
             main.tip("请选择用户(单个用户)","0");
         }
     }) /**/
     //发送邮件
     $("#send-email").click(function(){
        system.saveDomain("#email-form");
         main.closeOpenWin();
     })
     //***************设置角色***************************
     $("#usrRoleBtn").click(function(){
         system.post(get_root+"/system/user/updateUserRoleMap.action",{
             roleIdDel:$("#roleSet").attr("data-value"),uid:$("#uAccount").attr("data-value"),roleIdAdd:$("#role-select").attr("data-value")},function(data){
             if("200"==data.code){
                 main.tip("角色设置成功","1");
                 main.closeOpenWin();
             }else{
                 main.tip(system.isBlank(data.msg)?"角色设置成功":data.msg,"0");
             }
         },false)
     })
     //设置用户角色
     $("#user-role-set").click(function(){
         $(".ul-choose").hide();
         SysUser.openUserRoleForm();
     })
     $("#roleSet").click(function(){
         $(".ul-choose").slideToggle(300);
     })
     //点击 角色列表
     //$(document).off("click","#commonRoleRangeBtn").delegate("#commonRoleRangeBtn", "click", function () {

     $(document).off("click",".ul-choose li").delegate(".ul-choose li","click",function(){
         console.log($(this))
         if($(this).hasClass("li-click")){
             $(this).removeClass("li-click");
         }else{
             $(this).addClass("li-click");
         }
         var roleName="";
         var roleIds="";
         $(".ul-choose .li-click ").each(function(){
             roleName+=","+$(this).text();
             roleIds+=","+$(this).attr("data-value");
         })
         roleName=roleName.substr(1);
         roleIds=roleIds.substr(1);
         $("#role-select").val(roleName);
         $("#role-select").attr("data-value",roleIds);
     });

 })
var SysUser={
    //是否是演示账号
    DemoType:"",
    //定义用户——id
    userIdChecked:"userTableChecked",
    reset:function(){
      $("#seaAccount").val();
    },


/************************用户单位***********************************/
    /**
     * 加载菜单管理 属性结构
     */
    initUnitTree:function(){
        var setting = {
            data: {
                key: {
                    title:"t"
                },
                simpleData: {
                    enable: true
                }
            },
            callback: {
                beforeClick: beforeClick,
                onClick: onClick
            }
        };


        function beforeClick(treeId, treeNode, clickFlag) {
            log.info("[beforeClick ]" + treeNode.name );
            $("#unitId").html(treeNode.id); //单位id

            return (treeNode.click != false);
        }
        /**
         *clickFlag===1: 普通选中;clickFlag===0:取消选中 ;追加选中
         * @param event
         * @param treeId
         * @param treeNode
         * @param clickFlag
         */
        function onClick(event, treeId, treeNode, clickFlag) {
            log.info( clickFlag + " ");
            log.info( treeNode);
            if(1==clickFlag){
              SysUser.getUserListForTemp(1);
            }
        }
        var nodes=new Array();
        system.post(get_root+system.action["getUnitList"]["url"],{},function(data){
            for(var i in data.result){
                var domain=data.result[i];
                //bak menu数据
                main.menuData[domain.id]=domain;
                var node={};
                node["id"]=domain.id+"";
                node["pId"]=domain.fatherid+"";
                node["name"]=domain.name+"";
                node["t"]=domain.name+"";
                node["open"]=false;
                if("0"==domain.fatherid){
                    node["open"]=true;
                }
                nodes.push(node);
            }
//            $("#mId").val('');//父级菜单制成空
            // zNodes=zNodes.concat(nodes)
            $.fn.zTree.init($("#treeUnitDemo"), setting, nodes);
            $("#loadTree").hide();
        })
    }  ,

    getUserListForTemp:function(page){
        console.log("lllllllllll")
        console.log(1==SysUser.DemoType)
        console.log(parseInt(page)>1)
        if(1==SysUser.DemoType&&parseInt(page)>1){
            main.tip("演示账号暂无权限",0);
            return;
        }
        //$("#uinput").show();//输入框
        var params={};
        params["page"]=page;
        var account= $("#seaAccount").val();
        var statue= $("#statue").val();
        var rc1= $("#unitId").html(); //单位id
        if(account!=""&&account!=null){
            params["usrAccount"]=account;
        }if(!system.isBlank(rc1)){
            params["usrRc1"]=rc1;
        }
        if(!system.isBlank(statue)){
            params["usrState"]=statue;
        }
        var  options={
            cache:true,
            cacheKey:"id",
            table:{thStyle:"text-align:left;white-space: nowrap;cursor:pointer",tdStyle:"text-align:left;"},
            colModel : [{key: 'id', name:"checkbox",width : 60,style:"text-align: center;",styleTh:"text-align:center;white-space: nowrap;"},
                {key :'NO.',name : '序号',styleTh:"text-align:center;white-space: nowrap;",style:"text-align: center;"},
                {key :'usrAccount',name : '账号',sort:"USR_ACCOUNT",style:"text-align:left",styleTh:"cursor:pointer;text-align:center;white-space: nowrap;"},
                {key :'usrName',name : '昵称',sort:"USR_NAME",style:"text-align:left",styleTh:"cursor:pointer;text-align:center;white-space: nowrap;"},
                {key :'usrRc3',name : '类型',sort:"USR_RC3",style:"text-align:left",styleTh:"cursor:pointer;text-align:center;white-space: nowrap;",formatter:function(cellvalue){
                    var Acctype=cellvalue=="3"? "企业": (cellvalue=="2"?"检验机构":"验船师");
                    return cellvalue;
                }},
                {key :'usrRc0',name : '身份证号',style:"text-align:left",styleTh:"text-align:center;white-space: nowrap;",formatter:function(cellvalue){
                    return system.dealBlank(cellvalue,"-");
                }},
                {key :'usrRc1',name : '单位编码',style:"text-align:left",styleTh:"text-align:center;white-space: nowrap;",formatter:function(cellvalue){
                    return system.dealBlank(cellvalue,"-");
                }},
                {key :'usrEmail',name : '邮箱',style:"text-align:left",styleTh:"text-align:center;white-space: nowrap;",formatter:function(cellvalue){
                    return system.dealBlank(cellvalue,"-");
                }},
                {key :'usrRc2',name : '手机号',style:"text-align:left",styleTh:"text-align:center;white-space: nowrap;",formatter:function(cellvalue){
                    return system.dealBlank(cellvalue,"-");
                }},

                {key :'usrState',name :'状态',style:"text-align:left",styleTh:"text-align:center;white-space: nowrap;",formatter:function(cellvalue){
                    var zt=cellvalue=="-1"? "<span style='color: red'>已删除</span>": (cellvalue=="1"?"正常":"待审核");
                    return zt;
                }},
            ]
        };

        $("#userTable").LPTable(get_root+system.action["getUserList"]["url"],params,options);
         return;
    } ,
    /**
     * 配置用户-菜单 弹出框
     * @param userName
     */
    openUMenuAuth:function(userName){
        var userId=system.getCheckboxValues(SysUser.userIdChecked);
        if(system.isBlank(userId)){
            main.tip("请选择用户","0");
            return;
        } if (userId.split(",").length>1){
            main.tip("不可批量操作","0");
            return;
        }
        $("#commonWin").click();
        system.post(get_root + "/system/user/getMenusByUserId.action", {rid:userId}, function (data) {
            var menuids=data.result.join(",");
            main.userMenuMap[userId]=menuids ;
            SysUser.initTreeAuto(menuids);
        }  )

    } ,
    /**
     * 配置用户-元素权限 弹出框
     * @param userName
     */
    openUPermAuth:function(userName){
        var userId=system.getCheckboxValues(SysUser.userIdChecked);
        if(system.isBlank(userId)){
            main.tip("请选择用户","0");
            return;
        } if (userId.split(",").length>1){
            main.tip("不可批量操作","0");
            return;
        }
        $("#commonPermWin").click();
        system.post(get_root + "/system/permission/getPermByUserId.action", {uid:userId}, function (data) {
            var arrId=new Array();
            for(var i in data.result){
                arrId.push(data.result[i].perid);
            }
            main.userPermMap[userId]=arrId.join(",");//该角色含有的菜单
            SysUser.initTreePerm(arrId.join(","));
        }  )

    } ,

    /**
     *  初始化 角色的菜单 :标记被选中的
     * @param menuIds
     */
    initTreeAuto: function (menuIds) {
        $("#loadMenu").show();
        function beforeCheck(treeId, treeNode) {
            return (treeNode.doCheck !== false);
        }
        function onCheck(e, treeId, treeNode) {
        }
        function checkNode(e) {
            var zTree = $.fn.zTree.getZTreeObj("treeAuth");
            type = e.data.type;

            if (type == "checkAllTrue") {
                zTree.checkAllNodes(true);
            } else if (type == "checkAllFalse") {
                zTree.checkAllNodes(false);
            }else if("submitRoleMenu"==type){//提交role配置的men
                var arr=zTree.getCheckedNodes();
            } else {
            }
        }

        function setAutoTrigger(e) {
            var zTree = $.fn.zTree.getZTreeObj("treeAuth");
            zTree.setting.check.autoCheckTrigger = $("#autoCallbackTrigger").attr("checked");
            $("#autoCheckTriggerValue").html(zTree.setting.check.autoCheckTrigger ? "true" : "false");
        }

        var setting = {
            view: {
                selectedMulti: false
            },
            check: {
                enable: true
            },
            data: {
                simpleData: {
                    enable: true
                }
            },
            callback: {
                beforeCheck: beforeCheck,
                onCheck: onCheck
            }
        };
        var nodes = new Array();

        system.post(get_root + "/system/menu/getMenuList.action", {}, function (data) {
            for (var i in data.result) {
                var domain = data.result[i];
                //bak menu数据
                main.menuData[domain.id] = domain;
                var node = {};
                node["id"] = domain.id + "";
                node["pId"] = domain.menFatherid + "";
                node["name"] = domain.menName + "";
                node["t"] = domain.menName + "";
                node["open"] = false;
                if ("0" == domain.menFatherid) {
                    node["open"] = true;
                }
                var arr=menuIds.split(",");
                if(arr.indexOf(domain.id)>-1){
                    node["checked"] = true;
                }
                nodes.push(node);
            }
            $.fn.zTree.init($("#treeAuth"), setting, nodes);
            $("#loadMenu").hide();

        },false)

    },
    /**
     *  初始化 用户-元素权限菜单 :标记被选中的
     * @param permIds
     */
    initTreePerm: function (permIds) {
        $("#loadPerm").show();
        function beforeCheck(treeId, treeNode) {
            return (treeNode.doCheck !== false);
        }
        function onCheck(e, treeId, treeNode) {
        }
        function checkNode(e) {
            var zTree = $.fn.zTree.getZTreeObj("treeAuth");
            type = e.data.type;

            if (type == "checkAllTrue") {
                zTree.checkAllNodes(true);
            } else if (type == "checkAllFalse") {
                zTree.checkAllNodes(false);
            }else if("submitRoleMenu"==type){//提交role配置的men
                var arr=zTree.getCheckedNodes();
            } else {
            }
        }

        function setAutoTrigger(e) {
            var zTree = $.fn.zTree.getZTreeObj("treeAuth");
            zTree.setting.check.autoCheckTrigger = $("#autoCallbackTrigger").attr("checked");
            $("#autoCheckTriggerValue").html(zTree.setting.check.autoCheckTrigger ? "true" : "false");
        }

        var setting = {
            view: {
                selectedMulti: false
            },
            check: {
                enable: true
            },
            data: {
                simpleData: {
                    enable: true
                }
            },
            callback: {
                beforeCheck: beforeCheck,
                onCheck: onCheck
            }
        };
        var nodes = new Array();
        system.post(get_root+system.action["getPermissionList"]["url"],{},function(data){
                for(var i in data.result){
                    var domain=data.result[i];
                    main.permissionData[domain.id+""]=domain;
                    var node={};
                    node["id"]=domain.id+"";
                    node["pId"]=domain.fatherid+"";
                    node["name"]=domain.name+"";
                    node["t"]=domain.name+"";
                    node["open"]=false;
                    if("0"==domain.fatherid){
                        node["open"]=true;
                    }
                    var permArr=permIds.split(",");
                    if(permArr.indexOf(domain.id)>-1){
                        node["checked"] = true;
                    }
                    nodes.push(node);
                }
            $.fn.zTree.init($("#treePermAuth"), setting, nodes);
            $("#loadPerm").hide();

        })

    },
    /**
     * 保存-用户-菜单权限
     */
    saveUserMenu:function(){
        var userId=system.getCheckboxValues("userCKB");
        var zTree = $.fn.zTree.getZTreeObj("treeAuth");
        var nodes = zTree.getCheckedNodes();
        if(nodes.length==0){
            main.tip("选择菜单！",0);
            return;
        }
        var menuIds="";
        for(var m in nodes){
            menuIds+=","+nodes[m].id;
        }
        menuIds=menuIds.substr(1,menuIds.length);
        system.post(get_root + "/system/user/saveUserMenuMap.action", {uid:userId,
            "menuIdsDel":main.userMenuMap[userId],"menuIdsAdd":menuIds}, function (data) {
            $("#commonClose").click();  //menuIdsDel
            main.tip("更新成功",1);
        })
    },
    /**
     * 保存-用户元素权限
     */
    saveUserPerm:function(){
        var userId=system.getCheckboxValues("userCKB");
        var zTree = $.fn.zTree.getZTreeObj("treePermAuth");
        var nodes = zTree.getCheckedNodes();
        if(nodes.length==0){
            main.tip("选择元素权限！",0);
            return;
        }
        var permsIds="";
        for(var m in nodes){
            permsIds+=","+nodes[m].id;
        }
        permsIds=permsIds.substr(1,permsIds.length);
        system.post(get_root + "/system/permission/saveUserPerms.action", {uid:userId,
            "permIdsOld":main.userPermMap[userId],"permIds":permsIds}, function (data) {
            $("#commonPermClose").click();  //menuIdsDel
                main.tip(data.msg,1);
        },false)
    }
    ,
    /**
     * 删除用户
     * @param span
     */
    userDel:function(span){
        var ids="";
        $("input:checkbox[name="+SysUser.userIdChecked+"]:checked").each(function () {
            var id=$(this).val();
            ids=ids+","+id;
            //$(this).parent().parent().remove();
            system.post(get_root + "/system/user/delUser.action", {"id": id, "usrState": "-1"}, function (data) {
                if("200"==data.code){
                    main.tip("删除成功",1);
                }else{
                    main.tip(data.msg,0);
                }
            },false)
        })
        if(system.isBlank(ids)){
            main.tip("请选择用户","0");
            return;
        }else{
            SysUser.getUserListForTemp($("#userTablePage .active a").attr("data-value"));

        }
    },
    userCheck:function(span){
        var ids="";
        $("input:checkbox[name="+SysUser.userIdChecked+"]:checked").each(function () {
            var id=$(this).val();
            ids=ids+","+id;
            $(this).parent().parent().remove();
            system.post(get_root + "/system/user/updates.action", {"id": id, "usrState": "1"}, function (data) {
                main.tip("审核通过","1");
            })
        })
        if(system.isBlank(ids)){
            main.tip("请选择用户","0");
            return;
        }
    },
    /**
     * 密码重置
     * @param span
     */
    userPwdReset:function(){
        var ids = system.getCheckboxValues(SysUser.userIdChecked);
        if(system.isBlank(ids)){
            main.tip("请选择用户",0);
            return;
        }
        if(confirm("是否重置该用户密码:初始密码123456")){
            system.post(get_root + "/system/user/resetPwd.action", {"id": ids, "usrPassword": "123456"}, function (data) {
                if("200"==data.code){
                    main.tip("密码重置成功:123456","1");
                }else{
                    main.tip(data.msg,0);
                }

            })

        }

    },


    /**
     * 用户信息弹出框
     * @param usrIdName
     */
    openUserForm:function(){
        var usrids=system.getCheckboxValues(SysUser.userIdChecked);
        if(system.isBlank(usrids)){
            main.tip("请选择用户",0);
            return;
        }if(usrids.split(",").length>1){
            main.tip("不可批量操作",0);
            return;
        }
        var domain=system.cache[usrids];
        log.info(domain);
        $('#userForm')[0].reset()  ;
        $("#userId").val("");
        $("#userWin").click();

        $("#usrAccount").val(domain.usrAccount);
        $("#usrName").val(domain.usrName);
        $("#usrEmail").val(domain.usrEmail);
        $("#usrState").val(domain.usrState);
        $("#usrRc3").val(domain.usrRc3);
        $("#userId").val(domain.id);
        $("#usrExpire").val(domain.usrExpire);
        $("#rc0").val(domain.usrRc0);
        $("#rc1").val(domain.usrRc1);
        $("#rc2").val(domain.usrRc2);
        $("#usrIsautoexpire").val(domain.usrIsautoexpire);
    },
    /**
     * 用户-角色-弹出框
     * @param usrIdName
     */
    openUserRoleForm:function(usrIdName){
        var usrids=system.getCheckboxValues(SysUser.userIdChecked);
        if(system.isBlank(usrids)){
            main.tip("请选择用户",0);
            return;
        }
        if(usrids.split(",").length>1){
            main.tip("不可批量操作",0);
            return;
        }
        var domain=system.cache[usrids];
       // $('#userForm')[0].reset()  ;
         $("#uAccount").val(domain.usrAccount);
         $("#uAccount").attr("data-value",domain.id);
        var ul=$(".ul-choose").html('');
        system.post(get_root+system.action["getRoleListByKid"]["url"],{},function(data){//获得角色列表
            console.log(data);
            for(var m in data.result){
                var domain=data.result[m];
                main.roleMap[domain.id]=domain.ureName;
                ul.append('<li  data-value="'+domain.id+'">'+domain.ureName+'</li>');  //class="li-click"
            }
            system.post(get_root+"/system/role/getRoleByUser.action",{uid:usrids},function(data){//获得此用户角色
                var arr=[];
                var arrName=[];
                for(var n in data.result){
                    arr.push(data.result[n]);
                    if(!system.isBlank(main.roleMap[data.result[n]])){
                        arrName.push(main.roleMap[data.result[n]]);
                    }
                }
                $("#role-select").attr("data-value",arr.join(","));//初始化现有id
                $("#roleSet").attr("data-value",arr.join(","));//备份更新前的id
                $("#role-select").val(arrName.join(","));
                //如果是此角色，则为选中状态
                ul.children().each(function(){
                    if(arr.indexOf($(this).attr("data-value"))>-1){
                        $(this).addClass("li-click");
                    }
                })
                $("#user-role-Win").click();

            },false)


        },false)
    }  ,
    openAuthForm:function(ckname){
        var ids=system.getCheckboxValues("userCKB");
        if(system.isBlank(ids)){
            main.tip("请选择用户",0);
            return;
        }if(ids.split(",").length>1){
            main.tip("不可批量操作",0);
            return;
        }
        var uDomain=system.cache[ids];
        system.post(get_root+"/system/user/getAuthSet.action",{"userId":ids},function(data){
            if("200"==data.code){
                var trs="";
                for(var i=0;i<data.result.length;i++){
                    var domain=data.result[i];
                    trs+='<tr> <td>'+i+'</td> <td>'+domain["MEN_NAME"]+'</td> ' +
                        '<td>'+domain["MEN_KEYWORD"]+'</td> <td>'+domain["LUS_TOTAL_COUNT"]+'</td>' +
                        '<td>'+domain["LUS_USED_COUNT"] + '</td><td>'+domain["LUS_RETAIN_COUNT"] + '</td>' +
                        '<td><input type="text" style="width: 40px; border-radius: 5px" ></td>' +
                        '<td style="cursor: pointer;color: #0000ff" class="authOpt" data="'+domain["LUS_MENUID"] + '">更新</td></tr>';
                }
                $("#authT tbody").html(trs);
                $(".authOpt").click(function () {
                    var input=$(this).prev().find("input").val();
                    var total=$(this).prev().prev().prev().prev().text();
                    var retain=$(this).prev().prev().text();
                    if(!system.isNum(input)){
                        alert("请输入数字");
                        return;
                    }
                    total=parseInt(total)+parseInt(input);
                    retain=parseInt(retain)+parseInt(input);
                    $(this).prev().prev().text(retain) ;
                    $(this).prev().prev().prev().prev().text(total) ;
                    $(this).prev().find("input").val("");
                    system.post(get_root + "/system/user/updateSet.action", {"userid": uDomain.id,"menuid":$(this).attr("data"),
                        "totalCount":total,"retainCount":retain}, function (data) {
                        main.tip(data.msg,1);
                    })
                })
                $("#setWinForm").click();
            }else{
                main.tip(data.msg,0);
            }
        });

    }

}
 /*******************点击按钮事件************************************************/

 //点击保存用户-元素权限
$(document).off("click","#commonPermBtn").delegate("#commonPermBtn", "click", function () {
    SysUser.saveUserPerm();//更新
})

//点击保存用户-菜单权限
$(document).off("click","#commonBtn").delegate("#commonBtn","click",function(){
    SysUser.saveUserMenu();//更新
})

//设置选中状态
$(document).delegate(".list-btn-mail","click",function(){
    $(this).addClass("active").siblings().removeClass("active");
})
