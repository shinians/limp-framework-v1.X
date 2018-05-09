/**
 * 日志管理
 * @type {string}
 */

/*
 * Copyright (c) 2017. 北京中软国际信息技术有限公司 .
 */

$(function(){
    setTimeout(function(){
        sysLog.getLogList(1);//获取企业人员信息
    },1000)
//按回车键 进行查询 todo:回车回到了首页 待核查原因
//    system.submitById("searchLogBtn");


})

var sysLog = {

    /**
     *  重新刷新所有
     */
    refresh:function(){
        sysLog.getLogList(1);//获取企业人员信息
    },


    /**
     * 日志管理列表
     */
    getLogList:function(page,cateId){


        var params_1={};
        params_1["page"]=page;

        //key
        var logAccount = $("#logAccount").val();
        if(!system.isBlank(logAccount)) {
            params_1["account"] = logAccount;
        }
        //分类名称
        var logType = $("#logType").val();
        if(!system.isBlank(logType)) {
            params_1["otlType"] = logType;
        }
        var logParam = $("#logParam").val();
        if(!system.isBlank(logParam)) {
            params_1["otlParams"] = logParam;
        }
        console.log("查询参数...");
        console.log(params_1);
        $("#pageload").show();

//***********************************************************************************************

        var option= {
            cache:false,//是否需要缓存  会缓存到system.cache[""]
            cacheKey:"id",
            colModel : [
                {key :'NO.',name : '序号',styleTh:"text-align:center;white-space: nowrap;"},
                {key :'account',name : '操作账号',formatter:function(cellvalue){
                    return cellvalue;
                }},
                {key :'otlType',name : '操作类型'},
                {key :'otlUrl',name : '访问URL地址',style:"text-align:left",styleTh:"text-align:center"},
                {key :'otlRc1',name : '日志详情',formatter:function(cellVal){
                    return system.dealBlank(cellVal,"-");
                }},
                {key :'otlParams',name : '参数',formatter:function(cellvalue){
                    return    "<span style='cursor: pointer;' title='"+cellvalue+"'>详情</span>";
                }},


                {key :'otlTime',name : '操作时间',formatter:function(cellvalue){
                    return    cellvalue;
                }},
                {key :'otlRc0',name : '访问IP',formatter:function(val){
                    return val;
                }}
            ]

        };
        //企业用户

            $("#sysLogList").LPTable(get_root + "/system/log/getList",params_1,option);

        return;

    }

}/*
 * Copyright (c) 2017. 北京中软国际信息技术有限公司 .
 */

