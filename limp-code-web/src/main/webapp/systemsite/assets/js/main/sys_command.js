/**
 * 日志管理
 * @type {string}
 */

/*
 * Copyright (c) 2017. 北京中软国际信息技术有限公司 .
 */

$(function(){
    setTimeout(function(){
        sysCommand.getCommandList(1);//获取企业人员信息
    },1000)
//按回车键 进行查询 todo:回车回到了首页 待核查原因
//    system.submitById("searchLogBtn");


})

var sysCommand = {
    toSave:function(){
      $("#commandForm")[0].reset();
        $("#id").val('');
      $("#commonWin_commond").click();
    },
    toUpdate:function(id){
        $("#commandForm")[0].reset();
        var domain=system.cache[id];
        $("#cname").val(domain.cname);
        $("#ccode").val(domain.ccode);
        $("#ctype").val(domain.ctype);
        $("#csql").val(domain.csql);
        $("#cintro").val(domain.cintro);
        $("#id").val(id);
        $("#commonWin_commond").click();
    },
    /**
     * 保存系统命令
     */
    save:function(){

        var id = $("#id").val();
        if (system.isBlank(id)) {
            system.post(get_root + "/system/command/save", $("#commandForm").serialize(), function (data) {
                console.log(data);
                if ("200" == data.code) {
                    main.tips("添加成功",1);
                    main.closeOpenWin();
                    sysCommand.getCommandList($("#sysCommandListPage .active li").attr("data-value"));
                }
            })

        } else {
            //更新操作
            system.post(get_root + "/system/command/update", $("#commandForm").serialize(), function (data) {
                console.log(data);
                if ("200" == data.code) {
                    main.tips("修改成功","1");
                    main.closeOpenWin();
                    sysCommand.getCommandList($("#sysCommandListPage .active li").attr("data-value"));
                }else{
                    main.tips("请重试","0");

                }
            })

        }
},

    /**
     *  重新刷新所有
     */
    refresh:function(){
        sysCommand.getLogList(1);//获取企业人员信息
    },


    /**
     * 日志管理列表
     */
    getCommandList:function(page){


        var params_1={};
        params_1["page"]=page;

        //key
        var sname = $("#sname").val();
        if(!system.isBlank(sname)) {
            params_1["cname"] = sname;
        }
        //分类名称
        var scode = $("#scode").val();
        if(!system.isBlank(scode)) {
            params_1["ccode"] = scode;
        }
        console.log("查询参数...");
        console.log(params_1);

//***********************************************************************************************

        var option= {
            cache:true,//是否需要缓存  会缓存到system.cache[""]
            cacheKey:"id",
            colModel : [
                {key :'NO.',name : '序号',styleTh:"text-align:center;white-space: nowrap;"},
                {key :'cname',name : '命令名称',styleTh:"text-align:center;white-space: nowrap;",style:"text-align:left",formatter:function(cellvalue){
                    return cellvalue;
                }},
                {key :'ctype',name : '操作类型'},
                {key :'ccode',name : '命令编码',styleTh:"text-align:center;white-space: nowrap;",style:"text-align:left"},
                {key :'optuser',name : '操作人',formatter:function(cellVal){
                    return system.dealBlank(cellVal,"-");
                }},
                {key :'udt',name : '更新时间',formatter:function(cellvalue){
                    return   cellvalue;
                }},

                {key :'OPT.',name : '操作',formatters:function(domain){
                    var opt='<li><a href=javascript:void(0) onclick=sysCommand.runCommand("'+domain.ccode+'")><span class="opera-layer-logo"><span class="fontawesome-play" style="color: forestgreen"></span></span>运行命令</a></li>' +
                        '<li><a href=javascript:void(0) style="margin-top: 10px" onclick=sysCommand.toUpdate("'+domain.id+'")><span class="opera-layer-logo"><span class="icon icon-document-edit" style="color: forestgreen"></span></span>修改命令</a></li>' ;
                    return opt;

                }}
            ]

        };
        //企业用户
            $("#sysCommandList").LPTable(get_root + "/system/command/getPageList",params_1,option);
        return;

    },
    runCommand:function(code){
        $("#commonWin1").click();
        if(system.isBlank(code)){
            main.tips("0","命令编码不可为空")
        }
        $("#cont").LPshowLoading();
        system.post(get_root+"/system/command/run.action",{code:code},function(data){
            var str=JSON.stringify(data,null);

            var option={dom:'#cont',imgCollapsed: get_root+"/systemsite/plug/json-plug/images/Collapsed.gif",imgExpanded: get_root+"/systemsite/plug/json-plug/images/Expanded.gif"};
            var jf=new JsonFormater(option);
            jf.doFormat(str)  ;
            jf.collapseLevel(5);


            console.log(data)
        })

    }

}/*
 * Copyright (c) 2017. 北京中软国际信息技术有限公司 .
 */

