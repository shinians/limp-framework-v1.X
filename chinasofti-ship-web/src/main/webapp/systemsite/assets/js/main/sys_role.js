$(function(){
    // 加载效果
    $("#load").show();
     setTimeout(function(){
         SysRole.getRoleList(1);
     },1000)

    //保存角色
    $("#save-role").click(function(){
        system.saveDomain("#role-form",false);
        //关闭弹框
        main.closeOpenWin();
        //重新加载
        SysRole.getRoleList(1);
    })
    //取消操作
    $("#cancel-opt").click(function(){
        main.closeOpenWin();
    })

    //设置选中状态
    $(".list-btn-mail").click(function(){
        $(this).addClass("active").siblings().removeClass("active");
    })
})

var SysRole={
    /**
     * 新增角色
     */
    toAddRole:function(){
        $("#id").val('');
        $('#role-form')[0].reset()  ;
        $("#open-role-form").click();
        $("#role-form").attr("action",get_root+"/system/role/save.action");

    },
    /**
     * 修改角色
     */
    toUpdateRole:function(){
        //判断是否选中用户
        var ids=new Array();
        $("input:checkbox[name='roleCKB']:checked").each(function () {
            var id=$(this).val();
            ids.push(id);
        })
        if(system.isBlank(ids)){
            main.tip("请选择用户",0);
            return;
        } if(ids.length>1){
            main.tip("不可批量修改",0);
            return;
        }
        $("#open-role-form").click();
        $("#role-form").attr("action",get_root+"/system/role/updateRole.action");
        system.post(get_root+"/system/role/getRoleByID.action",{roleId:ids[0]},function(data){
           if(!system.isBlank(data.result)){
                var domain=data.result;
               $("#id").val(domain.id);
               $("#ureName").val(domain.ureName);
               $("#ureRemarks").val(domain.ureRemarks);
               $("#ureRc3").val(domain.ureRc3);
               $("#ureRc0").val(domain.ureRc0);
           }
        })
    },
    /**
     * 删除 role
     * @param type 1为新增 其他为修改
     */
    delRole:function(inputName){
        var roleIds=system.getCheckboxValues(inputName);
        //
        if(system.isBlank(roleIds)){
            main.tip("请选择角色",0);
            return;
        }
        //不允许批量
        if(roleIds.indexOf(",")>-1){
            main.tip("不可批量操作",0);
            return;
        }

        if(confirm("是否删除该用户")) {
             var ids="";
            $("input:checkbox[name='"+inputName+"']:checked").each(function () {
                var id=$(this).val();
                $(this).parent().parent().remove();
                system.post(get_root + "/system/role/delRole.action", {id:id,ureState:"-1"}, function (data) {
                    if("200"==data.code){
                        main.tip("删除成功",1);
                    }
                },false)
            })

        }
    } ,
    /**
     * 角色列表
     */
    getRoleList:function(page){
        var roleTypeMap={1:"超级管理员角色",2:"管理角色", 3:"普通角色"}
        var roleTable=$("#roleTable").html('');  //角色列表
        console.log("加载");
        $("#load").show();
        system.post(get_root+system.action["getRoleList"]["url"],{},function(data){
            $("#load").hide();
            var trs="";
            for(var i in data.result){
                var domain=data.result[i];
                main.roleMap[domain.id]=domain;
                var trRole=$('<tr class="odd gradeX"></tr>');
                trRole.append('<td><input type="checkbox" name="roleCKB" value="'+domain.id+'"></td>');
                trRole.append('<td>'+i+'</td>');
                trRole.append('<td>'+domain.ureName+'</td>');
                trRole.append('<td>' + roleTypeMap[domain.ureRc3] + ' </td>');
                trRole.append('<td>'+system.dealBlank(domain.ureRc0,"无")+'</td>');

                trRole.append('<td class="center">'+domain.ureRemarks+'</td>');
                roleTable.append(trRole);
            }
        },false)
    }  ,
    /**
     * 打开角色权限配置弹框 【角色配置菜单】
     * @param usrIdName
     */
    openMenuAuth:function(roleName){
        var roleId=system.getCheckboxValues('roleCKB');
        if(system.isBlank(roleId)){
            main.tip("请选择角色",0);
            return;
        }if(roleId.split(",").length>1){
            main.tip("不可批量操作",0);
            return;
        }
        $("#commonWin").click();
        system.post(get_root + "/system/role/getMenusByRoleId.action", {rid:roleId}, function (data) {
            var menuids=data.result.join(",");
            main.roleMenuMap[roleId]=menuids;//该角色含有的菜单
            SysRole.initTreeAuto(menuids);
        },false)

    },
    /**
     * 打开元素权限配置弹框 【元素权限配置】
     * @param usrIdName
     */
    openPermissionAuth:function(){
        var roleId=system.getCheckboxValues('roleCKB');
        if(system.isBlank(roleId)){
            main.tip("请选择角色",0);
            return;
        }if(roleId.split(",").length>1){
            main.tip("不可批量操作",0);
            return;
        }
        $("#rolePerWin").click();
        system.post(get_root + "/system/permission/getPermByRoleId.action", {rid:roleId}, function (data) {
            var arrId=new Array();
            for(var i in data.result){
                var domain=data.result[i];
                arrId.push(domain.sprmPerid);
            }
             main.rolePerMap[roleId]=arrId.join(",");//该角色含有的菜单
             SysRole.initTreePer(arrId.join(","));
        } ,false )

    },
    /**
     * 打开指派角色对话框
     */
    openRoleRange:function(){
        var roleId=system.getCheckboxValues('roleCKB');
        if(system.isBlank(roleId)){
            main.tip("请选择角色",0);
            return;
        }if(roleId.split(",").length>1){
            main.tip("不可批量操作",0);
            return;
        }
        if(3==main.roleMap[roleId].ureRc3){
            main.tip("普通角色类型不可指派角色",0);
            return;
        }
        $("#roleRangeWin").click();
        system.post(get_root + "/system/kv/getKVList.action", {key:roleId}, function (data) {
            var arrId=new Array();
            for(var i in data.result){
                var domain=data.result[i];
                arrId.push(domain.value);
            }
            main.keyKVMap[roleId]=arrId.join(",");//该角色含有的菜单
          SysRole.initTreeRoleRange(arrId.join(","));
        } ,false )

    },
    /**
     *  初始化 角色的菜单
     * @param menuIds
     */
    initTreeAuto: function (menuIds) {
        $("#loadMenu").show();
        function beforeCheck(treeId, treeNode) {
            console.debug(" beforeCheck " + treeNode.name );
            return (treeNode.doCheck !== false);
        }
        function onCheck(e, treeId, treeNode) {
            console.debug(" onCheck" + treeNode.name );
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
                console.debug(arr)
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
//                enable: true
                enable: true,
                chkboxType:  { "Y": "", "N": "" }//不关联
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
            // zNodes=zNodes.concat(nodes)
            $.fn.zTree.init($("#treeAuth"), setting, nodes);
            $("#loadMenu").hide();
        },false)

    } ,
    /**
     * 树形结构
     * @param checkIds
     */
    initTreeRoleRange: function (checkIds) {
        $("#loadRange").show();
        function beforeCheck(treeId, treeNode) {
            return (treeNode.doCheck !== false);
        }
        function onCheck(e, treeId, treeNode) {
            console.debug(" onCheck" + treeNode.name );
        }

        function checkNode(e) {
            var zTree = $.fn.zTree.getZTreeObj("treePer");
            type = e.data.type;

            if (type == "checkAllTrue") {
                zTree.checkAllNodes(true);
            } else if (type == "checkAllFalse") {
                zTree.checkAllNodes(false);
            }else if("submitRoleMenu"==type){//提交role配置的men
                var arr=zTree.getCheckedNodes();
                console.debug(arr)
            } else {

            }
        }

        function setAutoTrigger(e) {
            var zTree = $.fn.zTree.getZTreeObj("treeRoleRange");
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
        system.post(get_root+system.action["getRoleList"]["url"],{},function(data){
            for(var i in data.result){
                var domain=data.result[i];
                main.roleMap[domain.id]=domain;
                var node={};
                node["id"]=domain.id+"";
                node["pId"]="-";
                node["name"]=domain.ureName+"";
                node["t"]=domain.ureName+"";
                node["open"]=false;

                var checkArr=checkIds.split(",");
                if(checkArr.indexOf(domain.id)>-1){
                    node["checked"] = true;
                }
                nodes.push(node);
            }
            $.fn.zTree.init($("#treeRoleRange"), setting, nodes);
            $("#loadRange").hide();

        },false)


    }  ,

    /**
     *
     * @param roleIds
     */
    initTreePer: function (permIds) {
        $("#loadPer").show();
        function beforeCheck(treeId, treeNode) {
            console.debug(" beforeCheck " + treeNode.name );
            return (treeNode.doCheck !== false);
        }
        function onCheck(e, treeId, treeNode) {
            console.debug(" onCheck" + treeNode.name );
        }

        function checkNode(e) {
            var zTree = $.fn.zTree.getZTreeObj("treePer");
            type = e.data.type;

            if (type == "checkAllTrue") {
                zTree.checkAllNodes(true);
            } else if (type == "checkAllFalse") {
                zTree.checkAllNodes(false);
            }else if("submitRoleMenu"==type){//提交role配置的men
                var arr=zTree.getCheckedNodes();
                console.debug(arr)
            } else {

            }
        }

        function setAutoTrigger(e) {
            var zTree = $.fn.zTree.getZTreeObj("treePer");
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
            $.fn.zTree.init($("#treePer"), setting, nodes);
            $("#loadPer").hide();

        },false)

    }
    ,
    /**
     * 保存角色的元素权限
     */
    saveRolePer:function(){
        var roleId=system.getCheckboxValues("roleCKB");
        var zTree = $.fn.zTree.getZTreeObj("treePer");
        var nodes = zTree.getCheckedNodes();
        if(nodes.length==0){
            alert("请选择元素权限");
            return;
        }
        var perIds="";
        for(var m in nodes){
            perIds+=","+nodes[m].id;
        }
        perIds=perIds.substr(1,perIds.length);
        system.post(get_root + "/system/permission/saveRolePerms.action", {rid:roleId,
            "permIdsOld":main.rolePerMap[roleId],"permIds":perIds}, function (data) {
            main.tip(data.msg,1);
            $("#perWinClose").click();
        },false)
    },
    /**
     * 保存角色菜单
     */
    saveRoleMenu:function(){
        var roleId=system.getCheckboxValues("roleCKB");
        var zTree = $.fn.zTree.getZTreeObj("treeAuth");
        var nodes = zTree.getCheckedNodes();
        if(nodes.length==0){
            alert("选择菜单！");
            return;
        }
        var menuIds="";
        for(var m in nodes){
            menuIds+=","+nodes[m].id;
        }
        menuIds=menuIds.substr(1,menuIds.length);
        system.post(get_root + "/system/role/saveRoleMenus.action", {rid:roleId,
            "menuIds1":main.roleMenuMap[roleId],"menuIds":menuIds}, function (data) {
            if("200"==data.code){
                main.tip("权限分派成功",1);
            }
            $("#commonClose").click();
        })
    } ,
    /**
     * 更新kv值
     */
    saveRoleRang:function(){
        var roleId=system.getCheckboxValues("roleCKB");
        var zTree = $.fn.zTree.getZTreeObj("treeRoleRange");
        var nodes = zTree.getCheckedNodes();
        if(nodes.length==0){
            alert("选择角色！");
            return;
        }
        var roleRangeIds="";
        for(var m in nodes){
            roleRangeIds+=","+nodes[m].id;
        }
        roleRangeIds=roleRangeIds.substr(1,roleRangeIds.length);
        system.post(get_root +system.action["updateKV"]["url"], {kid:roleId,
            "valueOld":main.keyKVMap[roleId],"value":roleRangeIds}, function (data) {
            if("200"==data.code){
                main.tip("角色指派成功",1);
            }
            $("#roleRWinClose").click();
        })
    }

}
/*******************点击按钮事件************************************************/

/**
 *问题描述：解决多次点击 “角色管理”，会绑定重复事件多次执行
 * KeyWord:多次执行、重复执行
 * 解决方法: 1、加上off解绑事件$(document).off("click",选择) 2、$(document)变为局部如$(".modal-footer")
  *
 */

 //点击保存角色-菜单权限
$(document).off("click","#commonBtn").delegate("#commonBtn", "click", function () {
        SysRole.saveRoleMenu();//更新
})
 //点击保存角色-元素权限
$(".modal-footer").delegate("#commonPerBtn", "click", function () {
     SysRole.saveRolePer();//更新
})
//点击保存指派角色
$(document).off("click","#commonRoleRangeBtn").delegate("#commonRoleRangeBtn", "click", function () {
    SysRole.saveRoleRang();//更新
})