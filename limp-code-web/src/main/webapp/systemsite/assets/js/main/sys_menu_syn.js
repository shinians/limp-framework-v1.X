/*
 * Copyright (c) 2018. 北京中软国际信息技术有限公司 .
 */

$(function(){

    // 加载菜单   ||这样加载会存在问题  todo 需要延时加载菜单
   setTimeout(function(){
       SysMenuSyn.synData();
   },1000)
})

var SysMenuSyn={
    /**
     * 存放数据库读取的菜单信息
     */
    synMenu:{},

    /**
     * 点击：异步加载数据
     */
    initClickParse:function(){
       $("#synMbt").click();
        return;
    },
    /**
     * 数据同步，用来同步不同服务器和本数据库的菜单权限，提高数据维护效率
     */
    synData:function(){
        //初始化加载
        var update_vm =new Vue({
            el:"#lp-syn",
            data:{domain:{"url":"http://www.shinians.com/system/menu/getChild3LvMenu","keyWord":"SYS_API_SET"}},
            methods:{
                //提交
                parseWebData:function(){
                    console.log("0000000000000000");
                    console.log(this.domain.keyWord);
                    if(system.isBlank(this.domain.url)&&this.domain.url.indexOf("http")==-1){
                        alert("URL不可为空!")
                        return;
                    }
                    if(this.domain.url.indexOf("http")==-1){
                        alert("URL不符合规范!")
                        return;
                    }
                    if(system.isBlank(this.domain.keyWord)){
                        alert("KEY不可为空!")
                        return;
                    }
                    //NAV_ROLE NAV_ROLE
                    console.log("参数如下....");
                    system.post(get_root+"/system/menu/httpUrl",{url:this.domain.url,"paramStr":"keyWord="+this.domain.keyWord},function(data){
                        console.log("返回数据----")
                        console.log(data)
                        if("200"==data.code){
                            var nodes=new Array();
                            for(var m in data.result){
                                var domain=data.result[m];
                                //bak menu数据
                                var node={};
                                node["id"]=domain.id+"";
                                node["pId"]=domain.menFatherid+"";
                                node["name"]=domain.menName+"";
                                node["t"]=domain.menName+"";
                                node["open"]=true;

                                nodes.push(node);
                                SysMenuSyn.synMenu[domain.id]=domain;
                            }
                            SysMenuSyn.initSynDataTree(nodes);
                        }else{
                            main.tip(data.msg,0);
                        }
                    })
                }
            }
        })
    },
    /**
     * 初始化菜单【form表单】
     * @param menuId
     */
    synMenuData:function(menuId){
        if(system.isBlank(menuId)){
            alert("菜单ID错误！");
            return;
        }
        $(".synForm").html($("#synFormScr").html())
        var domain=SysMenuSyn.synMenu[menuId];
        var domainF=SysMenuSyn.synMenu[domain.menFatherid];
        if(!system.isBlank(domainF)){
            domain.menFKeyword=domainF.menKeyword;
        }
        var vue=new Vue({
            el:".synForm #synForm",
            data:{"domain":domain},
            methods:{
                //提交
                submitMenu:function() {
                    console.log("提交数据。。。");
                    console.log(this.domain);
                    if (system.isBlank(this.domain.menKeyword)) {
                        main.tip("权限标识Key不可为空！",0);
                        return;
                    }
                    //开始同步数据
                    system.post(get_root+"/system/menu/synMenuByKeyWord",this.domain,function(data){
                        console.log(data);
                        if(data.code=="200"){
                            main.tip("同步完成！",1);
                        }
                    })
                }
            }
    })
    },
    /**
     * 加载展示菜单树
     * @param nodes 需要展示的节点信息
     */
    initSynDataTree:function(nodes){
        var setting= {
            data: {
                key: {
                    title:"t"
                },
                simpleData: {
                    enable: true
                }
            },
            callback: {
                //beforeClick: beforeClick,
                onClick: onClick
                //onRightClick: OnRightClick
            }
        };
        function onClick(event, treeId, treeNode, clickFlag) {
            if(1==clickFlag){
              console.log(treeNode);
                SysMenuSyn.synMenuData(treeNode.id);
            }
        }
        $.fn.zTree.init($("#synTree"), setting, nodes);
    },
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
                SysMenuSyn.initTree();//更新
                SysMenuSyn.getMenuPageList(1,SysMenuSyn.clickTreeId);
            }else{
                main.tip(data.msg,0);
            }
        })
    }
    /************************菜单管理*******begin***********************************/


}