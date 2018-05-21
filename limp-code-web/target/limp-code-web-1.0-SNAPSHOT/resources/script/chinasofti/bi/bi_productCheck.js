$(function(){
    var flag = false;
    var flag2 = false;
    //当前时间
    var nowtime = new Date();

    $("#time-pck-1-1").initDateFilterSpace(function (data) {
        $("#PCK-1-1").showLoading();
        pck.initEchats1(data.startT,data.endT);
    });

    //暂时屏蔽时间筛选功能
    // $("#time-pck-1-2").initDateFilterSingle(function (data) {
    //     $("#PCK-1-2").showLoading();
    //     pck.initEchats2(data.startT);
    // });

    var id = $("#proAproAnaly .active").attr('id');
    switch (id){
        case 'PCK-1-2-1':
            pck.initEchats3();
            break;
        case 'PCK-1-2-2':
            pck.initEchats3("1");
            break;
    }
    var tid = $("#productCheckNums-ul .active").attr('id');
    switch (tid){
        case 'PCK-2-1-1':
            pck.initEchats3("0");
            break;
        case 'PCK-2-1-2':
            pck.initEchats3("1");
            break;
        case 'PCK-2-1-3':
            pck.initEchats3("2");
            break;
        case 'PCK-2-1-4':
            pck.initEchats3("3");
            break;
    };
    $("#time-pck-2-1").initDateFilter(function (data) {
        $("#PCK-2-1").showLoading();
        pck.initEchats3("0",data.startT,data.endT);
        var id = $("#productCheckNums-ul .active").attr('id');
        console.log(id);
        switch (id){
            case 'PCK-2-1-1':
                pck.initEchats3("0",data.startT,data.endT);
                break;
            case 'PCK-2-1-2':
                pck.initEchats3("1",data.startT,data.endT);
                break;
            case 'PCK-2-1-3':
                pck.initEchats3("2",data.startT,data.endT);
                break;
            case 'PCK-2-1-4':
                pck.initEchats3("3",data.startT,data.endT);
                break;
        }
    });
    $("#time-pck-2-2").initDateFilter(function (data) {
        $("#PCK-2-2").showLoading();
        var id = $("#productCheck-ul .active").attr('id');
        switch (id){
            case 'PCK-2-2-1':
                pck.initEchats4("#PCK-2-2","5",data.startT,data.endT);
                break;
            case 'PCK-2-2-2':
                pck.initEchats4("#PCK-2-2","6",data.startT,data.endT);
                break;
            case 'PCK-2-2-3':
                pck.initEchats4("#PCK-2-2","7",data.startT,data.endT);
                break;
        }
    });
    $("#time-pck-2-3").initDateFilter(function (data) {
        $("#PCK-2-3").showLoading();
        pck.initEchats5(data.startT,data.endT);
    });
    $("#time-pck-2-4").initDateFilter(function (data) {
        $("#PCK-2-4").showLoading();
        pck.initEchats6(data.startT,data.endT);
    });
    $('#dowebok').fullpage({
        navigation: true,
        afterRender : function(){
            //控制iframe高度
            $('#nav_iframe', window.parent.document).css({
                minHeight : 650
            })
            pck.initKeyNum("");
            $("#PCK-1-1").showLoading();
            //传近5年数据
            pck.initEchats1(nowtime.getFullYear()-4,nowtime.getFullYear());

            $("#PCK-1-2").showLoading();
            pck.initEchats2();
            $("#PCK-1-2-1").on("click",function () {
                $("#PCK-1-2").showLoading();
                pck.initEchats2();
            });
            $("#PCK-1-2-2").on("click",function () {
                $("#PCK-1-2").showLoading();
                pck.initEchats2("1");
            });
        },
        afterLoad : function(anchorLink, index){
            //index ： 当前跳转的页面
           if(index == 1){
               if(index== 1 && flag == false){
                   flag = true;
                   $("#PCK-2-2").showLoading();
                   pck.initEchats4("#PCK-2-2","5","","");
                   $("#PCK-2-2-1").on("click",function () {
                       $("#PCK-2-2").showLoading();
                       pck.initEchats4("#PCK-2-2","5","","");
                   });
                   $("#PCK-2-2-2").on("click",function () {
                       $("#PCK-2-2").showLoading();
                       pck.initEchats4("#PCK-2-2","6","","");
                   });
                   $("#PCK-2-2-3").on("click",function () {
                       $("#PCK-2-2").showLoading();
                       pck.initEchats4("#PCK-2-2","7","","");
                   });


               }
           }else if( index == 2){
               $("#PCK-2-1").showLoading();
               pck.initEchats3("0");
               $("#PCK-2-1-1").on("click",function () {
                   $("#PCK-2-1").showLoading();
                   pck.initEchats3("0");
               });
               $("#PCK-2-1-2").on("click",function () {
                   $("#PCK-2-1").showLoading();
                   pck.initEchats3("1");
               });
               $("#PCK-2-1-3").on("click",function () {
                   $("#PCK-2-1").showLoading();
                   pck.initEchats3("2");
               });
               $("#PCK-2-1-4").on("click",function () {
                   $("#PCK-2-1").showLoading();
                   pck.initEchats3("3");
               });


               flag2 =true;
               $("#PCK-2-3").showLoading();
               pck.initEchats5("","");

               $("#PCK-2-4").showLoading();
               pck.initEchats6("","");

           }
        }
    });

     //改成上面的结构
    // $(".bi-ul-slide li").click(function(){
    //     var index=$(this).attr("data-to");
    //     if(index=="1" && flag == false){
    //         flag = true;
    //         $("#PCK-2-1").showLoading();
    //         pck.initEchats3("","");
    //         $("#time-pck-2-1").initDateFilter(function (data) {
    //             $("#PCK-2-1").showLoading();
    //             pck.initEchats3(data.startT,data.endT);
    //         });
    //
    //         $("#PCK-2-2").showLoading();
    //         pck.initEchats4("#PCK-2-2","5","","");
    //         $("#PCK-2-2-1").on("click",function () {
    //             $("#PCK-2-2").showLoading();
    //             pck.initEchats4("#PCK-2-2","5","","");
    //         });
    //         $("#PCK-2-2-2").on("click",function () {
    //             $("#PCK-2-2").showLoading();
    //             pck.initEchats4("#PCK-2-2","6","","");
    //         });
    //         $("#PCK-2-2-3").on("click",function () {
    //             $("#PCK-2-2").showLoading();
    //             pck.initEchats4("#PCK-2-2","6","","");
    //         });
    //
    //         $("#time-pck-2-2").initDateFilter(function (data) {
    //             $("#PCK-2-2").showLoading();
    //             var id = $("#productCheck-ul .active").attr('id');
    //             switch (id){
    //                 case 'PCK-2-2-1':
    //                     pck.initEchats4("#PCK-2-2","5",data.startT,data.endT);
    //                 break;
    //                 case 'PCK-2-2-2':
    //                     pck.initEchats4("#PCK-2-2","6",data.startT,data.endT);
    //                 break;
    //                 case 'PCK-2-2-3':
    //                     pck.initEchats4("#PCK-2-2","7",data.startT,data.endT);
    //                 break;
    //             }
    //             });
    //     }else if(index=="2" && flag2 == false){
    //         flag2 =true;
    //         $("#PCK-2-3").showLoading();
    //         pck.initEchats5("","");
    //         $("#time-pck-2-3").initDateFilter(function (data) {
    //             $("#PCK-2-3").showLoading();
    //             pck.initEchats5(data.startT,data.endT);
    //         });
    //         $("#PCK-2-4").showLoading();
    //         pck.initEchats6("","");
    //         $("#time-pck-2-4").initDateFilter(function (data) {
    //             $("#PCK-2-4").showLoading();
    //             pck.initEchats6(data.startT,data.endT);
    //         });
    //     }
    // });


});
var pck={
    /**
     * 关键信息
     */
    initKeyNum:function(id) {
        var param = {};
        if (system.isBlank(id)) {
            id = "0000000";
        }
        param.uid= id;
        system.post(get_root+"/ship/bi/getProCheckData",param,function (data) {
            var obj = data.result;
            $("#PCK_KV1").countTo({from:0,to:obj.cpzzCount,speed:1000});
            $("#PCK_KV1").text(obj.cpzzCount);
            $("#PCK_KV2").countTo({from:0,to:obj.repairCount,speed:1000});
            $("#PCK_KV2").text(obj.repairCount);
            $("#PCK_KV3_DES").text(obj.checkPercent.year+"年监督抽查合格率");
            $("#PCK_KV3").countTo({from:0,to:obj.checkPercent.checkPercent,speed:1000});
            $("#PCK_KV3").text(obj.checkPercent);
            $("#PCK_KV4_DES").text(obj.checkCount.year+"年产品检验数量");
            $("#PCK_KV4").countTo({from:0,to:obj.checkCount.checkCount,speed:1000});
            $("#PCK_KV4").text(obj.checkCount);

            setTimeout(function(){
                $("#PCK_KV1").html(system.toThousands(obj.cpzzCount));
                $("#PCK_KV2").html(system.toThousands(obj.repairCount));
                $("#PCK_KV3").html(system.toThousands(obj.checkPercent.checkPercent));
                $("#PCK_KV4").html(system.toThousands(obj.checkCount.checkCount));
            },"1000")


        })
    },
    /**
     * 图一：产品制造企业认可数量分析图
     */
    initEchats1:function(startYear,endYear) {
        var param = {};
        param.startYear = startYear;
        param.endYear = endYear;
        system.post(get_root+"/ship/bi/echatsCpzzData",param,function (data) {
            var obj = data.result;
            // console.log(obj);
            var option = {
                xAxis:{data:obj.xAxis},
                grid:{
                    top:'10%',
                    left: '3%',
                    right: '8%',
                    bottom: '3%',
                    containLabel: true
                },
                yAxis :{name:"家"},
                series:[
                    {name:'认可数量',
                    data:obj.data}
                    ]
            };
            $("#PCK-1-1").initBIOption(option,20,"");
        })

    },
    /**
     * 图二：产品检测机构认可数量分析图
     */
    initEchats2:function(type) {
        var param = {};
        param.allOrgFlag= type;
        system.post(get_root+"/ship/bi/echatsCheckCountData",param,function (data) {
            var obj = data.result;
            var validTerm = [];
            var allTerm = [];
            for(var i in obj.data){
                if(!(obj.data[i].hasOwnProperty("allOrgFlag"))){
                    validTerm.push(obj.data[i])
                }else{
                    allTerm.push(obj.data[i]);
                }
            }
            var leg =[];
            var legAll =[];
            for(var j in validTerm){
                leg.push(validTerm[j].name);
            }
            for(var k in allTerm){
                legAll.push(allTerm[k].name);
            }
            // 有效期内
            var option = {
                color: ['#ED3F49','#00AEFF','#00699A','#405272'],
                legend:{data:leg},
                series:[
                    {
                        data:validTerm,
                        itemStyle:{normal:{
                           label:{formatter: ' {c}({d}%) '}
                        }}
                    }
                ]
            };
            //全部
            var option2 = {
                color: ['#ED3F49','#00AEFF','#00699A','#405272'],
                legend:{data:legAll},
                series:[
                    {
                        data:allTerm,
                        itemStyle:{normal:{
                            label:{formatter: ' {c}({d}%) '}
                        }}
                    }
                ]
            };
            $("#pcc-title").html("("+obj.year+")");

            if( param.allOrgFlag == "1"){
                $("#PCK-1-2").initBIOption(option2,30,"");
            }else{
                $("#PCK-1-2").initBIOption(option,30,"");
            }
        })

    },
    /**
     * 图三：产品设备类检验数量分析图
     * TODO: 数据传递时参数type未定义, 数据？
     *
     */
    initEchats3:function(type,startYear,endYear) {
        var param = {};
        param.startYear = startYear;
        param.endYear = endYear;
        param.typ = type;
        system.post(get_root+"/ship/bi/echatsCheckData",param,function (data) {
            var obj = data.result;
            var option0 =[];
            var option1 =[];
            var option2 =[];
            var option3 =[];
            for(var i=0;i<obj.data.length;i++){
                if(obj.data[i].typ == "0"){
                    option0 ={
                        xAxis:{data:obj.data[i].xAxis},
                        yAxis:{name:"台"},
                        series:[
                            {
                                name:"检验数量",
                                data:obj.data[i].data
                            }
                        ]
                    }

                }else if(obj.data[i].typ == "1"){
                    option1 ={
                        xAxis:{data:obj.data[i].xAxis},
                        yAxis:{name:"台"},
                        series:[
                            {
                                name:"检验数量",
                                data:obj.data[i].data
                            }
                        ]
                    }
                }else if(obj.data[i].typ == "2"){
                    option2 ={
                        xAxis:{data:obj.data[i].xAxis},
                        yAxis:{name:"台"},
                        series:[
                            {
                                name:"检验数量",
                                data:obj.data[i].data
                            }
                        ]
                    }
                }else{
                    option3 ={
                        xAxis:{data:obj.data[i].xAxis},
                        yAxis:{name:"台"},
                        series:[
                            {
                                name:"检验数量",
                                data:obj.data[i].data
                            }
                        ]
                    }
                }
            }


            if( param.typ == "0"){
                $("#PCK-2-1").initBIOption(option0,20,"");
            }else if( param.typ == "1"){
                $("#PCK-2-1").initBIOption(option1,20,"");
            }else if(param.typ == "2"){
                $("#PCK-2-1").initBIOption(option2,20,"");
            }else{
                $("#PCK-2-1").initBIOption(option3,20,"");
            }

        })


    },
    /**
     * 图四：产品设备类维修数量分析图
     */
    initEchats4:function(id,type,startYear,endYear) {
        var param = {};
        param.type=type;
        param.startYear = startYear;
        param.endYear = endYear;
        // console.log(param);
        system.post(get_root+"/ship/bi/echatsRepairData",param,function (data) {
            var obj = data.result;
            // console.log(obj);
            var option = {
                xAxis:{data:obj.xAxis},
                yAxis:{name:"台"},
                series:[{
                    name:"维修数量",
                    data:obj.data}]
            };
            $(id).initBIOption(option,10,"");
        })

    },
    /**
     * 图五：产品质量监督抽查合格率分析图
     */
    initEchats5:function(startYear,endYear) {
        var param = {};
        param.startYear = startYear;
        param.endYear = endYear;
        system.post(get_root+"/ship/bi/echatsCheckPersentData",param,function (data) {
            var obj = data.result;
            var option = {
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    top:"20%",
                    containLabel: true
                },
                legend:{data:["救生筏抽查合格率","GMDSS抽查合格率","消防设备合格率"]},
                tooltip :{ formatter:function(a) {
                    var relVal = '';
                    for(var i in a){
                        var domain=a[i]  ;
                        relVal +=domain.seriesName+ '&nbsp;:&nbsp;<span style="color:#FAFB02">'+domain.value+'%</span><br/>';
                    }
                    return relVal;
                } },
                xAxis:{data:obj.xAxis},
                yAxis:{name:"%"},
                series:[
                    {
                        name:'救生筏抽查合格率',
                        type:'line',
                        //stack: '总量',
                        symbol:'emptycircle',    //设置折线图中表示每个坐标点的符号；emptycircle：空心圆；emptyrect：空心矩形；circle：实心圆；emptydiamond：菱形
                        symbolSize: 8,//圈的大小
                        areaStyle: {normal: {
                        }},
                        //线的样式
                        itemStyle: {
                            normal:{
                                color: new echarts.graphic.LinearGradient(0, 0, 0, 1,
                                    [
                                        {offset: 0, color: '#0193DC'},
                                        {offset: 0.8, color: '#082B72'},
                                        {offset: 1, color: 'rgba(25,35,89,0.1)'}
                                    ]
                                )
                            },
                            emphasis: {
                                color: '#ffff00',//黄色
                                symbolSize: 28,
                                borderColor: '#f9f900',
                                borderWidth: 4,
                                shadowBlur: 10,
                                shadowColor: '#333'
                            }
                        },
                        data:obj.data[0]
                    },
                    {
                        name:'GMDSS抽查合格率',
                        type:'line',
                        areaStyle: {normal: {}},
                        data:obj.data[1],
                        symbol:'emptycircle',    //设置折线图中表示每个坐标点的符号；emptycircle：空心圆；emptyrect：空心矩形；circle：实心圆；emptydiamond：菱形
                        symbolSize: 8,//圈的大小
                        areaStyle: {normal: {
                            areaStyle: {
                            }
                        }},
                        itemStyle: {
                            normal:{
                                color: new echarts.graphic.LinearGradient(0, 0, 0, 1,
                                    [
                                        {offset: 0, color: '#02E6ED'},
                                        {offset: 0.2, color: 'rgba(2,230,237,0.5)'},
                                        {offset: 1, color: 'rgba(2,230,237,0.1)'}
                                    ]
                                )
                            },
                            emphasis: {
                                color: '#ffff00',//黄色
                                symbolSize: 28,
                                borderColor: '#f9f900',
                                borderWidth: 4,
                                shadowBlur: 10,
                                shadowColor: '#333'
                            }
                        }
                    }, {
                        name:'消防设备合格率',
                        type:'line',
                        areaStyle: {normal: {}},
                        data:obj.data[2],
                        symbol:'emptycircle',    //设置折线图中表示每个坐标点的符号；emptycircle：空心圆；emptyrect：空心矩形；circle：实心圆；emptydiamond：菱形
                        symbolSize: 8,//圈的大小
                        areaStyle: {normal: {
                            areaStyle: {
                            }
                        }},
                        itemStyle: {
                            normal:{
                                color: new echarts.graphic.LinearGradient(0, 0, 0, 1,
                                    [
                                        {offset: 0, color: '#01f79d'},
                                        {offset: 0.2, color: 'rgba(1,247,157,0.5'},
                                        {offset: 1, color: 'rgba(1,247,157,0.1)'}
                                    ]
                                )
                            },
                            emphasis: {
                                color: '#ffff00',//黄色
                                symbolSize: 28,
                                borderColor: '#f9f900',
                                borderWidth: 4,
                                shadowBlur: 10,
                                shadowColor: '#333'
                            }
                        }
                    }
                    // {data:obj.data[0]},{data:obj.data[1]},{data:obj.data[2]}
                ]
            };
            // console.log(option);
            $("#PCK-2-3").initBIOption(option,21,"");
        })
    },
    /**
     * 图六：救生筏海滩救助情况统计
     */
    initEchats6:function(startYear,endYear) {
        var param = {};
        param.startYear = startYear;
        param.endYear = endYear;
        // console.log(param);
        system.post(get_root+"/ship/bi/echatsHelpData",param,function (data) {
            var obj = data.result;
            var option = {
                legend:{data:["海滩数量","救助数量"]},
                xAxis:{data:obj.xAxis},
                series:[
                    {
                        name:'海滩数量',
                        type:'bar',
                        barWidth:20,
                        data:obj.data[0]
                    },
                    {
                        name:'救助数量',
                        type:'bar',
                        barWidth:20,

                        data:obj.data[1]
                    }
                    // {data:obj.data[0]},{data:obj.data[1]},{data:[]}
                    ]
            };
            $("#PCK-2-4").initBIOption(option,11,"");
        })
    }

}