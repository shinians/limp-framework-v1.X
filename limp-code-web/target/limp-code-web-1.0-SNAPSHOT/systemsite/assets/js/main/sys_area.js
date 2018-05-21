/*
  地区码表管理
 * @type {string}
 * Copyright (c) 2018. 北京中软国际信息技术有限公司 .
 */

var treeId = "0";  //用于获取选中的企业组织编号
$(function(){
    setTimeout(function(){
        sysArea.initTree();
        sysArea.getDomainList(1,0);
        //事件监听
        sysArea.listenFun();
    },1000)
//按回车键 进行查询
//    system.submitById("searchDictBtn");
})

var sysArea = {
    listenFun:function(){
        //修改：按钮
        $(document).off("click",".lp-area-del").delegate(".lp-area-del","click",function() {
            system.post(get_root+"/system/area/delete",{code:$(this).attr("data-value")},function(data){
                if("200"==data.code){
                    main.tip(data.msg,1);
                    sysArea.getDomainList($("#sysAreaList .active a").attr("data-value"),treeId);
                }else{
                    main.tip(data.msg,0);
                }
            })
        })
        //修改：按钮
        $(document).off("click",".lp-area-edit").delegate(".lp-area-edit","click",function() {
            sysArea.update($(this).attr("data-value"));
        })

        /****************绑定工具栏按钮**********************/
        var update_vm =new Vue({
            el:"#area-info .table-tools",
            data:{},
            methods:{
                //提交
                handleAddDomain:function(){
                    sysArea.add(treeId);
                }
            }
        })
    },
    /**
     * 新增地区
     * @param treeId
     */
    add:function(treeId){
        layer.open({
            skin: 'lp-skin-fir',
            title:'<span class="modal-title-logo"><span style="color: #f8bb2b" class="entypo-plus-circled"></span></span>新增地区码表',
            type: 1,
            area: ['580px','338px'],
            content: "<div id='lp'>"+$('#tkAddDomain').html()+"</div>" //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响：
            //可设置为隐藏状态，在结合vue初始化数据，获取当前div情况
        });
        //初始化加载
        var update_vm =new Vue({
            el:"#lp",
            data:{domain:{"pcode":treeId,"state":"1"}},
            methods:{
                //提交
                handleAdd:function(){
                    console.log("参数如下....");
                    console.log($("#lp .lpform").serialize());
                    console.log(this.domain);
                    system.post(get_root+"/system/area/save",$("#lp .lpform").serialize(),function(data){
                        if("200"==data.code){
                            main.tip(data.msg,1);
                            layer.closeAll();
                            sysArea.getDomainList($("#sysAreaList .active a").attr("data-value"),treeId);
                        }else{
                            main.tip(data.msg,0);
                        }
                    })
                }
            }
        })

    },
    /**
     * 步骤：1、定义动态ID，在vue取时，因为id存在之前div和layer组装的div中【2个ID】，导致取不到值{纠结了一天呀&&^_^}
     *        layer.open{content:"<div id="lp">"+content+"</div>"}
     *     2、当vue需要加载数据多或者网络慢时，加载数据时候会先出现vue模板（例如item.name），用户体验特别不好
              可以通过VUE内置的指令v-cloak解决这个问题（推荐） ：CSS中添加 [v-cloak]{ display: none; }
           3、input 通过 v-model=""  赋值
           4、Vue  methods可以通过this.domain 获取对象，一并提交
     * 更新dic信息
     */
    update:function(dictKey){
        console.log(dictKey);
        var domainInfo=system.cache[dictKey];
        if(system.isBlank(domainInfo)){
            return;
        }
        layer.open({
            skin: 'lp-skin-fir',
            title:'<span class="modal-title-logo"><span style="color: #f8bb2b" class="fontawesome-edit"></span></span>修改地区码表',
            type: 1,
            area: ['580px','338px'],
            content: "<div id='lp'>"+$('#tkUpdateDomain').html()+"</div>" //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响：
            //可设置为隐藏状态，在结合vue初始化数据，获取当前div情况
        });
        //初始化加载
        var update_vm =new Vue({
            el:"#lp",
            data:{domain:domainInfo},
            methods:{
                //提交
                handleSubmit:function(){
                    console.log("参数如下....");
                    console.log($("#lp .lpform").serialize());
                    console.log(this.domain);
                    system.post(get_root+"/system/area/update",$("#lp .lpform").serialize(),function(data){
                        if("200"==data.code){
                            main.tip(data.msg,1);
                            layer.closeAll();
                            sysArea.getDomainList($("#sysAreaList .active a").attr("data-value"),treeId);
                        }else{
                            main.tip(data.msg,0);
                        }
                    })
                }
            }
        })
    },


    /**
     *  重新刷新所有
     */
    refresh:function(){
        sysArea.getDomainList(1);//获取碼表信息
        sysArea.initTree();//获取企业组织树
    },

    /**
     *  加载企业用户组织树
     */
    initTree: function(){
        var setting = {
            //异步加载
            async: {
                //是否异步加载
                enable: true,
                type:"post",
                url:get_root + "/system/api/getAreaCodeByDomain",
                //autoParam:["id=code", "name=name","parentId=pcode","level=lv","isParent=true"],
                autoParam:["id=pcode"],
                otherParam:{"lv":"1","Lpsort":"CODE ASC"},
                //otherParam:{"lv":"1",pcode:"0"},
                dataFilter: filter
            },
            data : {
            key : {
                name : "name"
            },
            simpleData : {
                enable : true,
                    idKey : "id",
                    pIdKey : "parentId",
                    rootPId : 0
            }
        },
          /*  data: {
                key: {
                    title:"name"
                },
                simpleData: {
                    enable: true
                }
            },*/
            callback: {
                beforeClick: beforeClick,
                //onAsyncSuccess : ztreeOnAsyncSuccess,
                onClick: onClick
            }
        };
        function ztreeOnAsyncSuccess(event, treeId, treeNode){
            return;
            var treeObj = $.fn.zTree.getZTreeObj("treeInfo");
            console.log("异步加载")
            console.log(treeId)
            console.log(treeNode)
            //设置父类ID
            var pcode="0";
            if(treeNode == undefined){
                pcode= "0";
            } else {
                pcode= treeNode.id;
            }
            system.post(get_root+"/system/api/getAreaCodeByDomain",{pcode:pcode},function(data){
                if (data.code=="200") {
                    /**********************************************/
                    var nodes = new Array();
                    for(var i in data.result){
                        var domain = data.result[i];
                        //区域代码 北京、山海等
                        var node = {};
                        node["parentId"] = domain.pcode;
                        node["id"] = domain.code;
                        node["name"] = domain.name;

                        if("1"==node["rc3"]){
                            node["isParent"] = true;
                        }else{
                            node["isParent"] = false;
                        }
                        nodes.push(node);
                        //初始化子节点
                    }
                    /**********************************************/
                    if(nodes != null && nodes.length != 0){
                        if(treeNode == undefined){
                            treeObj.addNodes(null,nodes,true);// 如果是根节点，那么就在null后面加载数据
                        }
                        else{
                            treeObj.addNodes(treeNode,nodes,true);//如果是加载子节点，那么就是父节点下面加载
                        }
                    }
                    treeObj.expandNode(treeNode,true, false, false);// 将新获取的子节点展开
                }
            })

        };
        function filter(treeId, parentNode, childNodes) {
            console.log("000-->filter<--000")
            console.log(treeId);
            console.log(parentNode);
            console.log(childNodes);
            if (!childNodes) return null;
            childNodes=childNodes.result;
            console.log(childNodes)

            var nodes=new Array();
            for (var i=0, l=childNodes.length; i<l; i++) {
                childNodes[i].name = childNodes[i].name.replace(/\.n/g, '.');
                childNodes[i].id = childNodes[i].code;
                childNodes[i].parentId = childNodes[i].pcode;
                var  node={};
                node.id=childNodes[i].code;
                node.parentId=childNodes[i].pcode;
                node.name=childNodes[i].name.replace(/\.n/g, '.');
                if(1==childNodes[i].rc3){
                    node.isParent=true;
                }else{
                    node.isParent=false;
                }

                nodes.push(node);
            }
            console.log(nodes);

            return nodes;
        }
        function beforeClick(treeId, treeNode) {
            console.debug(" beforeCheck " + treeNode.name );
            return (treeNode.doCheck !== false);
        }
        /**
         *clickFlag===1: 普通选中;clickFlag===0:取消选中 ;追加选中
         * @param event
         * @param treeId
         * @param treeNode
         * @param clickFlag
         */
        function onClick(event, treeId2, treeNode, clickFlag) {
            if(1 == clickFlag) {
                treeId = treeNode.id;
                sysArea.getDomainList(1,treeId);
            }
        }

                $.fn.zTree.init($("#treeInfo"), setting);
                $("#loadTree").hide();
    },
    /**
     * 企业用户列表页面:修正后
     */
    getDomainList:function(page,cateId){
        var params_1={};
        params_1["page"]=page;

        //key
        var code = $("#code").val();
        if(!system.isBlank(code)) {
            params_1["code"] = code;
        }
        //分类名称
        var name = $("#name").val();
        if(!system.isBlank(name)) {
            params_1["name"] = name;
        }

        console.log("查询参数...");
        if(!system.isBlank(cateId)){
            params_1["pcode"] = cateId;
        }
        if(system.isBlank(params_1["Lpsort"])){
            params_1["Lpsort"] = "CODE ASC";

        }

        console.log(params_1);
        $("#pageload").show();

//***********************************************************************************************
        var option= {
            cache:true,//是否需要缓存  会缓存到system.cache[""]
            cacheKey:"code",
            colModel : [
                {key :'NO.',name : '序号',styleTh:"text-align:center;white-space: nowrap;"},

                {key :'code',name : '地区编码',sort:"CODE",styleTh:"cursor: pointer;",formatter:function(cellvalue){
                    return cellvalue;
                }},
                {key :'name',name : '地区名称',sort:"NAME",styleTh:"cursor: pointer;"},
                {key :'state',name : '状态',formatter:function(cellvalue){
                    return    cellvalue == 1 ? "正常" : "删除";
                }},
               /* {key :'dictKey',name : 'KEY',formatter:function(val){
                    return system.isBlank(val)? "--":val;
                }},*/
                {key :'pcode',name : '父类编码'},
                //{key :'companyUserCreatedate',name : '创建时间'},
                {key :'OPT.',name : '操作',align : "right",formatters:function(domain){

                    var opt='<li><a href="javascript:void(0)" class="lp-area-del" data-value="'+domain.code+'">' +
                        '<span class="opera-layer-logo"><span class="entypo-trash"  style="color: #428bca; font-size: 17px" title="刪除"></span></span></div>删除</li> </a>' +
                    //' <li role="separator" class="divider"></li>' +
                    ' <li><a href="javascript:void(0)" class="lp-area-edit" data-value="'+domain.code+'">' +
                        '<span class="opera-layer-logo">' +
                        '<span class="icon-document-edit" style="color: #428bca; font-size: 17px" title="修改"></span></span>修改</a></li>';
                    return opt;
                }},
            ]
        };
        //企业用户
            $("#sysAreaList").LPTable(get_root + "/system/area/getAreaPageList",params_1,option);
        return;
    }
}/*
 * Copyright (c) 2017. 北京中软国际信息技术有限公司 .
 */

