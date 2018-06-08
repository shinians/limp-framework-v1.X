/**
 * 码表管理
 * @type {string}
 */
var dictTreeId = "0";  //用于获取选中的企业组织编号
$(function(){
    setTimeout(function(){
        sysDict.initTree();
        sysDict.getDictList(1);
        //事件监听
        sysDict.listenFun();
    },1000)
//按回车键 进行查询
//    system.submitById("searchDictBtn");

    //取消修改密码操作
    $("#cancel-opt-pass,#cancel-add-user,#cancel-opt-upd").click(function(){
        main.closeOpenWin();
    })

    $("#addUser").click(function(){
        $("#saveUserForm")[0].reset();
        $("#open-addUser-form").click();
    })

})

var sysDict = {
    listenFun:function(){
        //修改：按钮
        $(document).off("click",".lp-dict-del").delegate(".lp-dict-del","click",function() {
            console.log($(this).attr("data-value"));
            system.post(get_root+"/system/dict/delete",{dictKey:$(this).attr("data-value")},function(data){
                if("200"==data.code){
                    main.tip(data.msg,1);
                }else{
                    main.tip(data.msg,0);
                }
            })
        })
        //修改：按钮
        $(document).off("click",".lp-dict-edit").delegate(".lp-dict-edit","click",function() {
            sysDict.update($(this).attr("data-value"));
        })

        /****************绑定工具栏按钮**********************/
        var update_vm =new Vue({
            el:"#dic-info .table-tools",
            data:{},
            methods:{
                //提交
                handleAddDict:function(){
                    sysDict.add(dictTreeId);
                }
            }
        })
    },

    add:function(dictTreeId){
        layer.open({
            skin: 'lp-skin-fir',
            title:'<span class="modal-title-logo"><i style="color: #f8bb2b" class="entypo-flow-tree"></i></span>新增码表',
            type: 1,
            area: ['580px','338px'],
            content: "<div id='lp'>"+$('#tkAddDict').html()+"</div>" //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响：
            //可设置为隐藏状态，在结合vue初始化数据，获取当前div情况
        });
        //初始化加载
        var update_vm =new Vue({
            el:"#lp",
            data:{domain:{"dictCate":dictTreeId,"dictStatue":"1"}},
            methods:{
                //提交
                handleAdd:function(){
                    console.log("参数如下....");
                    console.log($("#lp .lpform").serialize());
                    console.log(this.domain);
                    system.post(get_root+"/system/dict/save",$("#lp .lpform").serialize(),function(data){
                        if("200"==data.code){
                            main.tip(data.msg,1);
                            layer.closeAll();
                            sysDict.getDictList($("#sysDictList .active a").attr("data-value"),dictTreeId);
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
        var domainInfo=system.cache[dictKey];
        //判断是否为空
        if(system.isBlank(domainInfo)){
            return;
        }
        layer.open({
            skin: 'lp-skin-fir',
            title:'<span class="modal-title-logo"><i style="color: #f8bb2b" class="entypo-flow-tree"></i></span>修改码表',
            type: 1,
            area: ['580px','338px'],
            content: "<div id='lp'>"+$('#tkUpdateDict').html()+"</div>" //这里content是一个DOM，注意：最好该元素要存放在body最外层，否则可能被其它的相对元素所影响：
            //可设置为隐藏状态，在结合vue初始化数据，获取当前div情况
        });
        //初始化加载
        var update_vm =new Vue({
            el:"#lp",
            data:{domain:domainInfo},
            methods:{
                //提交
                handleSubmit:function(){
                    system.post(get_root+"/system/dict/update",$("#lp .lpform").serialize(),function(data){
                        if("200"==data.code){
                            main.tip(data.msg,1);
                            layer.closeAll();
                            sysDict.getDictList($("#sysDictList .active a").attr("data-value"),dictTreeId);
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
        sysDict.getDictList(1);//获取碼表信息
        sysDict.initTree();//获取企业组织树
    },

    /**
     *  加载企业用户组织树
     */
    initTree: function(onClick){
        var setting = {
            data: {
                key: {
                    title:"name"
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
        function onClick(event, treeId, treeNode, clickFlag) {
            if(1 == clickFlag) {
                dictTreeId = treeNode.id;
                var cateId="";
                if("1"==treeNode.lv){
                    cateId=treeNode.id;
                }
                sysDict.getDictList(1,cateId);
            }
        }
        var nodes = new Array();
        system.post(get_root + "/system/api/getListMap",{method:"selectDictGroupByCate"},function(data){
            for(var i in data.result){
                var domain = data.result[i];
                if(domain.code=="000000"){
                    continue;
                }
                //区域代码 北京、山海等
                var node = {};
                node["pId"] = "000000";
                node["id"] = system.isBlank(domain.CATE)?domain.cate:domain.CATE;
                node["name"] = system.isBlank(domain.NAME)?domain.name:domain.NAME;
                node["lv"] = "1";
                node["open"] = false;
                if("0" == domain.parentId) {
                    node["open"] = true;
                }

                node["iconOpen"] = get_root + '/systemsite/ztree/img/1_close.png';
                node["iconClose"] = get_root + '/systemsite/ztree/img/1_open.png';
                node["icon"] = get_root + '/systemsite/ztree/img/1_close.png';
                nodes.push(node);
                //初始化子节点
            }
            console.log("8888888888888")
            console.log(data)
            console.log(nodes)
            $.fn.zTree.init($("#treeInfo_scode"), setting, nodes);
            $("#loadTree_scode").hide();
        })
    },



    /**
     * 企业用户列表页面:修正后
     */
    getDictList:function(page,cateId){
        var params_1={};
        params_1["page"]=page;

        //key
        var dictKey = $("#dictKey").val();
        if(!system.isBlank(dictKey)) {
            params_1["dictKey"] = dictKey;
        }
        //分类名称
        var dictdataName = $("#dictdataName").val();
        if(!system.isBlank(dictdataName)) {
            params_1["dictdataName"] = dictdataName;
        }
        //分类介绍
        var dictIntro = $("#dictIntro").val();
        if(!system.isBlank(dictIntro)) {
            params_1["dictIntro"] = dictIntro;
        }


        console.log("查询参数...");
        if(!system.isBlank(cateId)){
            params_1["dictCate"] = cateId;
        }
        console.log(params_1);
        $("#pageload").show();

//***********************************************************************************************
        var option= {
            cache:true,//是否需要缓存  会缓存到system.cache[""]
            cacheKey:"dictKey",
            colModel : [
                {key :'NO.',name : '序号',styleTh:"text-align:center;white-space: nowrap;"},

                {key :'dictdataValue',name : '小分类码',formatter:function(cellvalue){
                    return cellvalue;
                }},
                {key :'dictdataName',name : '分类名称'},
                {key :'dictStatue',name : '状态',formatter:function(cellvalue){
                    return    cellvalue == "1" ? "正常" : "删除";
                }},
                {key :'dictKey',name : 'KEY',formatter:function(val){
                    return system.isBlank(val)? "--":val;
                }},
                {key :'dictCate',name : '大分类码'},

                {key :'dictIntro',name :'分类描述',formatter:function(val){
                    return system.isBlank(val)? "--":val;
                }},
                //{key :'companyUserCreatedate',name : '创建时间'},
                {key :'OPT.',name : '操作',align : "right",formatters:function(domain){

                    var opt='<li><a href="javascript:void(0)" class="lp-dict-del" data-value="'+domain.dictKey+'">' +
                        '<span class="opera-layer-logo"><span class="entypo-trash"  style="color: #428bca; font-size: 17px" title="刪除"></span></span></div>删除</li> </a>' +
                            //' <li role="separator" class="divider"></li>' +
                        ' <li><a href="javascript:void(0)" class="lp-dict-edit" data-value="'+domain.dictKey+'">' +
                        '<span class="opera-layer-logo">' +
                        '<span class="icon-document-edit" style="color: #428bca; font-size: 17px" title="修改"></span></span>修改</a></li>';
                    return opt;
                }},
            ]
        };
        //企业用户
        $("#sysDictList").LPTable(get_root + "/system/dict/getDictList",params_1,option);
        return;
    }
}/*
 * Copyright (c) 2017. 北京中软国际信息技术有限公司 .
 */

