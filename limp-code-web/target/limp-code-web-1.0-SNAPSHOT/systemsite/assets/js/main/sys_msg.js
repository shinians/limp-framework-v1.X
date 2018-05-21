$(function(){
    // 加载菜单
   setTimeout(function(){
       SysMsg.getMsgList(1,1,1,1);
   },1000)
})

var SysMsg={
    getMsgList:function(page,ordertype,orderName,orderType){
        var params={};
        if(!system.isBlank(page)) {
            params["page"]=page;
        }else{
            params["page"]=1;
        }
        if(!system.isBlank(ordertype)){
            params["ordertype"]=ordertype;
        }
        if(!system.isBlank(orderName)){
            params["orderName"]=orderName;
        }if(!system.isBlank(orderType)){
            params["orderType"]=orderType;
        }if(!system.isBlank($("#msgZT").val())){
            params["type"]=$("#msgZT").val();
        }
        log.info("params")
        log.info(params) ;
        var option= {
            cache:true,//是否需要缓存  会缓存到system.cache[""]
            cacheKey:"id",
            table:{thStyle:"text-align:center;white-space: nowrap;cursor:pointer",tdStyle:"text-align:left;"},
            //控制全局table样式，td和th；优先级低于单个表格设置的样式
            colModel : [
                //{key :'id',name:"checkbox",width : 55},
                {key :'NO.',style:"text-align:center;",name:"序号",width : 55},
                {key :'title',name : '标题'},//,style:"background-color: red;font-size: 16px;"
                {key :'usrAccountTo',name : '收件人'},
                {key :'usridfrom',name : '发件人',formatter:function(val){
                    return system.isBlank(val)?"--":val;
                }},
                {key :'idt',name : '发件时间'},
                {key :'read',name : '消息状态',formatter:function(val){
                    return "0"==val?"<span style='color:red;'>未读</span>":"已读";
                }},

                {key :'type',name : '消息'},
                {key :'intro',name : '内容'}

            ]

        };

        $("#sysMsgList").LPTable(get_root+"/system/msg/getMsgList",params,option);

    }

}