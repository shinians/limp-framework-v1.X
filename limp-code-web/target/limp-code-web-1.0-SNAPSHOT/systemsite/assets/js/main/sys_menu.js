$(function(){

    // 加载菜单   ||这样加载会存在问题  todo 需要延时加载菜单
   setTimeout(function(){
       SysMenu.initTree();
       SysMenu.getMenuPageList(1,"0");
   },1000)
})

var SysMenu={
    clickTreeId:"",
    fresh:function(){
            SysMenu.initTree();
        SysMenu.getMenuPageList(1,"0");
    },
    expandTreeNode:function(type){
        $("#expand0").hide();
        $("#expand1").hide();
        var treeObj = $.fn.zTree.getZTreeObj("treeDemo");
        if("1"==type){
            treeObj.expandAll(false);
            $("#expand0").show();

        }else{
            $("#expand1").show();

            treeObj.expandAll(true);
        }

    },

    /**
     * 数据同步，用来同步不同服务器和本数据的菜单权限，提高数据维护效率
     */
    synData:function(){

         layer.open({
         skin: 'lp-skin-fir lp-opacity',
         title:'<span class="modal-title-logo"><span style="color: #f8bb2b" class="fontawesome-retweet"></span></span>数据同步',
         type: 2,
         shade: 0, //不显示遮罩
         maxmin: true,
         resize:true,
         offset: 'rt',
         area: ['900px','438px'],
         content: get_root+"/system/nav/menuSyn" //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响：
         //可设置为隐藏状态，在结合vue初始化数据，获取当前div情况
         });


    },
    /**
     * 加载菜单管理 属性结构
     */
    initTree:function(){
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
                onClick: onClick,
                onRightClick: OnRightClick
            }
        };
        function OnRightClick(event, treeId, treeNode, clickFlag) {
            if(!system.isBlank(treeNode)){
                $("#mId").val(treeNode.id);
                //SysMenu.initMenu(treeNode.id);
            }
            if (!treeNode && event.target.tagName.toLowerCase() != "button" && $(event.target).parents("a").length == 0) {
                $.fn.zTree.getZTreeObj("treeDemo").cancelSelectedNode();
                showRMenu("root", event.clientX, event.clientY);
            } else if (treeNode && !treeNode.noR) {
                $.fn.zTree.getZTreeObj("treeDemo").selectNode(treeNode);
                showRMenu("node", event.clientX, event.clientY);
            }
        }
        function onBodyMouseDown(event){
            if (!(event.target.id == "rMenu" || $(event.target).parents("#rMenu").length>0)) {
                $("#rMenu").css({"visibility" : "hidden"});
            }
        }

        /**
         * 显示右键菜单选项
         * @param type
         * @param x
         * @param y
         */
        function showRMenu(type, x, y) {
            $("#rMenu ul").show();
            if (type=="root") {
                $("#m_del").hide();
                $("#m_check").hide();
                $("#m_unCheck").hide();
            } else {
                $("#m_del").show();
                $("#m_check").show();
                $("#m_unCheck").show();
            }
            $("#rMenu").css({"top":(y-40)+"px", "left":(x-100)+"px", "visibility":"visible"});

            $("body").bind("mousedown", onBodyMouseDown);
        }
        //右键菜单点击后则消失右击选项
        $(document).off("click","#rMenu ul").delegate("#rMenu ul","click",function() {
            hideRMenu();
        })

                /**
         * 隐藏右键菜单选项
         */
        function hideRMenu() {
            $("#rMenu").css({"visibility": "hidden"});
            $("body").unbind("mousedown", onBodyMouseDown);
        }


        function beforeClick(treeId, treeNode, clickFlag) {
            log.info("[beforeClick ]" + treeNode.name );
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
            if(1==clickFlag){
                //SysMenu.initMenu(main.menuData[treeNode.id]);
                SysMenu.clickTreeId=treeNode.id;
                SysMenu.getMenuPageList(1,treeNode.id);

            }
        }
        var nodes=new Array();
        system.post(get_root+system.action["getMenuList"]["url"],{},function(data){
            console.log("meun--data")
            console.log(data)
        for(var i in data.result){
            var domain=data.result[i];
            //bak menu数据
            main.menuData[domain.id]=domain;
            var node={};
            node["id"]=domain.id+"";
            node["pId"]=domain.menFatherid+"";
            node["name"]=domain.menName+"";
            node["t"]=domain.menName+"";
            node["open"]=false;
            if("0"==domain.menFatherid){
                node["open"]=true;
            }
            //node["iconOpen"] = get_root + '/systemsite/ztree/img/1_close.png';
            //node["iconClose"] = get_root + '/systemsite/ztree/img/1_open.png';
            //node["icon"] = get_root + '/systemsite/ztree/img/1_close.png';
            nodes.push(node);
        }
            $("#mId").val('');//父级菜单制成空
        // zNodes=zNodes.concat(nodes)
        $.fn.zTree.init($("#treeDemo"), setting, nodes);
        $("#load").hide();
    })
}  ,
    /**
     * 菜单
     */
    getMenuPageList:function(page,treeId){


        var params_1={};
        params_1["page"]=page;

        //key
        var menKeyword = $("#menKeyword").val();
        if(!system.isBlank(menKeyword)) {
            params_1["menKeyword"] = menKeyword;
        }
        //分类名称
        var menName = $("#menName").val();
        if(!system.isBlank(menName)) {
            params_1["menName"] = menName;
        }



        console.log("查询参数...");
        if(!system.isBlank(treeId)){
            params_1["menFatherid"] = treeId;
        }
        console.log(params_1);

//***********************************************************************************************

        var option= {
            cache:true,//是否需要缓存  会缓存到system.cache[""] //white-space: nowrap;
            cacheKey:"id",
            table:{thStyle:"text-align:center;cursor:pointer",tdStyle:"text-align:left;"},
            colModel : [
                {key :'NO.',name : '序号',style:"text-align:center;"},

                {key :'menName',name : '菜单名称',sort:'MEN_NAME',formatter:function(cellvalue){

                    return cellvalue;
                }},
                {key :'menKeyword',sort:'MEN_KEYWORD',name : '权限标识'},
                //{key :'menRc0',name : '标识VALUE'},
                {key :'menSort',name : '排序',sort:"MEN_SORT",formatter:function(val){
                    return system.isBlank(val)? "--":val;
                }},

                {key :'menType',name :'菜单类型',formatter:function(val){
                   var menType={"0":"系统","1":"菜单","2" :"页面","3":"Tab标签","4":"新窗口（页面新窗口打开）","5":"隐藏",
                       "6":"iframe控制","10":"功能按钮"};
                    return system.isBlank(menType[val])? "--":menType[val];
                }},
                {key :'menImgUrl',name : '样式',formatter:function(val){
                    return system.isBlank(val)? "--":"<span class='"+val+"'>&nbsp;</span>"+val;
                }},

                {key :'menUrl',name :'URL地址',formatter:function(val){
                    val=system.isBlank(val)? "--":val
                    val=val.length>30?val.substr(0,30)+"...":val;
                    return system.isBlank(val)? "--":val;
                }},
                //{key :'companyUserCreatedate',name : '创建时间'},
                {key :'OPT.',name : '操作',formatters:function(domain){
                    var bt1='<li><a href="javascript:void(0)" onclick=SysMenu.initMenu("'+domain.id+'");><span class="opera-layer-logo"><span class="icon-document-edit" style="color: #428bca; font-size: 17px" title="修改"></span></span>修改 </a></li>';
                        //bt1='<a href="javascript:void(0)" onclick=SysMenu.initMenu("'+domain.id+'");></span></a>&nbsp;&nbsp;' ;
                    return bt1;
                }},
            ]

        };
        $("#sysMenuList").LPTable(get_root + "/system/menu/getMenuPageList",params_1,option);

        return;

    },
    /**
     * 初始化菜单选项
     * @param menu
     */
    initMenu:function(mId){
        var menu;
        if(system.isBlank(mId)){
            var mid=$("#mId").val();
            if(system.isBlank(mid)){
                mid="0";
            }
             menu={menRc0:"",menName:"",menKeyword:"",menImgUrl:"",menCreatedate:"",menSort:"",menUrl:"",menDesc:"",id:"",menFatherid:mid,menType:""};
        }else{
            menu =main.menuData[mId];
        }

        var fmenuName="";    //父级菜单名称
        try{
            fmenuName=main.menuData[menu.menFatherid].menName;
        }catch (e){
            fmenuName="一级目录";
        }
        $("#mName").val(menu.menName);
        $("#menKeyword1").val(system.dealBlank(menu.menKeyword,""));
        $("#menRc01").val(system.dealBlank(menu.menRc0,""));
        $("#fname").val(system.dealBlank(fmenuName,""));
        $("#menSort1").val(system.dealBlank(menu.menSort,""));
        $("#menUrl1").val(system.dealBlank(menu.menUrl,""));
        $("#menDesc1").val(system.dealBlank(menu.menDesc,""));
        $("#menImgUrl1").val(system.dealBlank(menu.menImgUrl,""));
        $("#menType").val(system.dealBlank(menu.menType,"1"));
        $("#mId").val(menu.id);
        $("#fId").val(menu.menFatherid);

        $("#commonWin").click();
    } ,
    /**
     * 保存menu
     */
    saveMenu:function (){
        if (system.isBlank($("#mName").val())) {
            main.tip("请完善菜单！",0);
            return;
        }
        var url=get_root + "/system/menu/addMenu.action";
        if(!system.isBlank($("#mId").val())){
            url=get_root + "/system/menu/updateMenu.action";
        }
        system.post(url, $("#menuForm").serialize(), function (data) {
            console.debug(data.msg);
            if("200"==data.code){
                main.tip(data.msg,1);
                main.closeOpenWin();
                SysMenu.initTree();//更新
                SysMenu.getMenuPageList(1,SysMenu.clickTreeId);
            }else{
                main.tip(data.msg,0);
            }
        })
    },
    /************************菜单管理*******begin***********************************/
    /**
     * 新增菜单
     */
    tosaveMenu: function(){
      SysMenu.initMenu();
    },

    /**
     * 删除 menu
     * @param type 1为新增 其他为修改
     */
    delMenu:function(){
        var sid=$("#mId").val();
        if(system.isBlank(sid)){
            main.tip("请选择菜单",0);
            return;
        }
        system.post(get_root + "/system/menu/delMenu.action", {id:sid,menState:"-1"}, function (data) {
            if(data.code="200"){
                main.tip(data.msg,1);
                SysMenu.initTree();//更新
            }else{
                main.tip(data.msg,0);
            }
        })
    }
}