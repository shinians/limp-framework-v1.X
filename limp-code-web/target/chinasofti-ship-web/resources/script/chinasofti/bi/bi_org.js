$(function(){
    //获取当前年份
    var myDate = new Date();
    var nowYear=myDate.getFullYear(); //获取完整的年份(4位,1970-????)
    $(".nowYear").html("("+nowYear+")");
    //获取orgcode
    var orgcode = $("#orgcode").val();
    org.initDatePlugin(orgcode);
    //    翻屏事件
    var currIndex=parseInt($('.bi-ul-slide').find('.active').attr('data-to')) ;
    var nextIndex;
    var preIndex;

    //如果不需要每次进来都重新加载，则需要用到以下三个flag
    var flag2 = false;
    var flag3 = false;
    var flag4 = false;
    
    $('#dowebok').fullpage({
        navigation: true,
        afterRender : function(){
            //控制iframe高度
            $('#nav_iframe', window.parent.document).css({
                minHeight : 650
            })
            org.initKeyNum();
            //========机构数量统计图
            $("#ORG-1-1").showLoading();
            // org.initOrgEcharts1("");
            org.initOrgEcharts1(orgcode,"");

            //========机构类型分析图
            org.initOrgEcharts2("CO_PARTTYPE",2017);
            $("#ORG-1-2-1").click(function () {
                org.initOrgEcharts2("CO_PARTTYPE",2017);
            });
            $("#ORG-1-2-2").click(function () {
                org.initOrgEcharts2("CO_FUNTYPE",2017);
            });
            $("#ORG-1-2-3").click(function () {
                org.initOrgEcharts2("CO_FINASOURCE",2017);

            });


        },
        afterLoad : function(anchorLink, index){
            //index ： 当前跳转的页面

            if(index==1 && flag2 == false){
                //org.initKeyNum();

                // $("#ORG-1-1").showLoading();
                // org.initOrgEcharts1(orgcode);
                // $("#ORG-1-2").showLoading();
                // $("#ORG-1-2").initBIOption({legend:{ data: ['公务员管理机构','参公管理机构','事业单位管理机构']
                // },series:[{itemStyle:{normal:{label:{formatter: '{c}个\n({d}%)'}}},data:[ {value:120, name:'公务员管理机构'}, {value:423, name:'参公管理机构'}, {value:551, name:'事业单位管理机构'}, {value:'', name:''} ] } ] },30,{});


            }else if(index==2 && flag3 ==false){
                //==========机构能力平均分走势图
                $("#ORG-2-1").showLoading();
                org.initOrgEcharts3();

                //=======机构数量和能力分析图（按地区）
                org.initOrgEcharts10();

            }else if(index==3 && flag4 == false){
                org.initOrgEcharts5(orgcode);
                //====加载3——2图形 检验工作完成率趋势图
                org.initOrgEcharts6(orgcode);

                //====加载3——3图形 检验工作完成率分析图（按地区）
                $('#currYear').html(nowYear);
                org.initOrgEcharts7(orgcode,nowYear);
                flag3 = true;

            }else if(index ==4){
                //========机构业务复核数量分析图（按地区）
                $('#orgCurYear').html("("+nowYear+")");
                org.initOrgEcharts8(orgcode);

                //========未来几年机构业务复核数量预测图
                org.initOrgEcharts9(orgcode,nowYear+1,nowYear+10);
                flag4 =true;
            }
            scrollTo(0,0);
        }
    });

    // $("#1-4-1").click(function () {
    //     $(this).addClass("active").siblings().removeClass("active");
    //     $("#ORG-1-2").initBIOption({
    //         legend: {
    //             data: ['公务员管理机构', '参公管理机构', '事业单位管理机构']
    //         },
    //         series: [{
    //             itemStyle: {normal: {label: {formatter: '{c}个\n({d}%)'}}},
    //             data: [{value: 120, name: '公务员管理机构'}, {value: 423, name: '参公管理机构'}, {
    //                 value: 551,
    //                 name: '事业单位管理机构'
    //             }, {value: '', name: ''}]
    //         }]
    //     }, 30, {});
    //
    // });
    // $("#1-4-2").click(function () {
    //     $("#ORG-1-2").initBIOption({
    //         legend: {
    //             data: ['独立设置机构', '“二合一”机构', '“三合一”机构']
    //         },
    //         series: [{itemStyle:{normal:{label:{formatter: '{c}个\n({d}%)'}}},
    //             data: [{value: 93, name: '独立设置机构'}, {value: 98, name: '“二合一”机构'}, {
    //                 value: 270,
    //                 name: '“三合一”机构'
    //             }, {value: '', name: ''}]
    //         }]
    //     }, 30, {});
    //
    // });
    // $("#1-4-3").click(function () {
    //     $("#ORG-1-2").initBIOption({
    //         legend: {
    //             data: ['全额拨款单位', '差额拨款单位', '自收自支单位']
    //         },
    //         series: [{itemStyle:{normal:{label:{formatter: '{c}个\n({d}%)'}}},
    //             data: [{value: 40, name: '全额拨款单位'}, {value: 58, name: '差额拨款单位'}, {
    //                 value: 46,
    //                 name: '自收自支单位'
    //             }, {value: '', name: ''}]
    //         }]
    //     }, 30, {});
    //
    // });



//    added by mengnalisha  to show table
//     $('.icon-more').on('click',function(){
//         var i = $('.icon-more').index(this);
//         var boxTxt = $('.box-text').eq(i).text();
//         switch (boxTxt){
//             case '机构总数':
//                 org.orgSum(i);
//                 break;
//             case '机构业务复核数量':
//                 org.orgServiceNums(i);
//                 break;
//             case '检验工作完成率':
//                 org.checkCompletionRate(i);
//                 break;
//             case '机构能力平均分':
//                 org.orgAbilityAverage(i);
//                 break;
//         }
//     })

})
/**
     * 机构业务复核数量
     */
var org={
    //关键信息加载
    initKeyNum:function () {
        // var param ={};
        // param.uid = id;
        // console.log(param.uid);     
        system.post(get_root+"/ship/bi/getOrgData",{},function (data) {
            var obj = data.result;
            console.log(obj)
            $("#ORG_KV1").countTo({from:0,to:obj.organCount,speed:1000});
            $("#ORG_KV2").countTo({from:0,to:obj.toCheckCount,speed:1000});
            $("#ORG_KV22").countTo({from:0,to:obj.checkAgainCount,speed:1000});
            $("#ORG_KV3").countTo({from:0,to:obj.checkPercent,speed:1000});
            $("#ORG_KV4").countTo({from:0,to:obj.organScore,speed:1000});

            var newObj  = {
                checkAgainCount : system.toThousands(obj.checkAgainCount),
                checkPercent : system.toThousands(obj.checkPercent),
                organCount : system.toThousands(obj.organCount),
                organScore : system.toThousands(obj.organScore),
                toCheckCount : system.toThousands(obj.toCheckCount)
            }
            setTimeout(function(){
                $("#ORG_KV1").html(newObj.organCount);
                $("#ORG_KV2").html(newObj.toCheckCount);
                $("#ORG_KV22").html(newObj.checkAgainCount);
                $("#ORG_KV3").html(newObj.checkPercent);
                $("#ORG_KV4").html(newObj.organScore);
            },"1000")



        })

    },
    //时间插件的加载
    initDatePlugin:function(orgcode){
        $('#time-org-1-1').initDateFilterSingle(function(data){
            $("#ORG-1-1").showLoading();
            org.initOrgEcharts1(orgcode,data.startT);
        });

        $('#time-org-1-2').initDateFilterSingle(function(data){
            $("#ORG-1-2").showLoading();
            // org.initOrgEcharts2(data.startT);
            var id = $("#orgTypeSys .active").attr('id');
            console.log(data);
            switch (id){
                case 'ORG-1-2-1':
                    org.initOrgEcharts2("CO_PARTTYPE",data.startT);
                    break;
                case 'ORG-1-2-2':
                    org.initOrgEcharts2("CO_FUNTYPE",data.startT);
                    break;
                case 'ORG-1-2-3':
                    org.initOrgEcharts2("CO_FINASOURCE",data.startT);
                    break;
            }



        });

        $("#time-org-2-1").initDateFilter(function(data){
            org.initOrgEcharts3(data.startT,data.endT);
        });

        $("#time-org-2-2").initDateFilterSingle(function(data){

            org.initOrgEcharts10(data);
        });

        $('#time-org-3-2').initDateFilterSpace(function(data){
            $('#ORG-3-2').showLoading();
            org.initOrgEcharts6(orgcode,data.startT,data.endT);
        });

        $('#time-org-3-3').initDateFilterSingle(function(data){
            $('#ORG-3-3').showLoading();
            org.initOrgEcharts7(orgcode,data.startT);
        });

        $('#time-org-3-4').initDateFilterBetween(function(data){
            org.initOrgEcharts9(orgcode,data.startT,data.endT);
        });
    },
    //第一个echart图：机构数量统计图
    initOrgEcharts1:function (uid,year) {
        var param ={};
        param.uid = uid;
        param.year = year;
        system.post(get_root+"/ship/bi/orgEchartsData1",param,function (data) {
            var obj = data.result;
            var objArr=[];
            var objData=[];
            for(var i=0;i<obj.dataList.length;i++){
                objArr.push(obj.dataList[i]["name"]);
                objData.push(obj.dataList[i]["value"]);
            }
            var option ={
                yAxis: {name: "个"},
                xAxis:{
                    data:objArr,
                    axisLabel: {
                interval: 0,
                // rotate: 60,
                formatter:function(value,index)
                {
                    var ret = "";//拼接加\n返回的类目项
                    var maxLength = 2;//每项显示文字个数
                    var valLength = value.length;//X轴类目项的文字个数
                    var rowN = Math.ceil(valLength / maxLength); //类目项需要换行的行数
                    if (rowN > 1)//如果类目项的文字大于3,
                    {
                        for (var i = 0; i < rowN; i++) {
                            var temp = "";//每次截取的字符串
                            var start = i * maxLength;//开始截取的位置
                            var end = start + maxLength;//结束截取的位置
                            //这里也可以加一个是否是最后一行的判断，但是不加也没有影响，那就不加吧
                            temp = value.substring(start, end) + "\n";
                            ret += temp; //凭借最终的字符串
                        }
                        return ret;
                    }
                    else {
                        return value;
                    }
                }
            }},series:[{data:objData}] };
            $("#yearOrgNums").html("("+obj.year+")");
            $("#time-org-1-1").initDateFilterSingle(function (data) {
                $("#ORG-1-1").showLoading();
                org.initOrgEcharts1($("#orgcode").val(),data.startT);
            });
            $("#ORG-1-1").initBIOption(option,10,{})
        })

    },
    //第二个echart图：三种不同的展示图
    initOrgEcharts2:function (group,date) {
        var param ={};
        param.group = group;
        param.date =date;
        $('#yearTypeSy').html("("+date+")");
        system.post(get_root+"/ship/bi/orgEchartsData2",param,function (data) {
            var obj = data.result;
            var legName = [];
            var pieData = [];
            var arr =[];
            for(var i in obj){
                legName.push(obj[i].NAME);
                pieData.push(obj[i].NUM);
                arr.push({name:legName[i],value:pieData[i]});
            }
            if(param.group == "CO_PARTTYPE"){
                var option = {
                    color:BO.pieBiOptionColor(legName.length),
                    legend: {
                        data:legName
                    } ,
                    series:[{
                        type: 'pie',
                        itemStyle:{
                            normal:{
                                label:{
                                    formatter: '{c} 个\n({d}%)'
                                }
                            }
                        },
                        data: arr
                    },{}]
                };
                $("#ORG-1-2").initBIOption(option,30,"");
            }else if(param.group == "CO_FUNTYPE"){
                $("#ORG-1-2").initBIOption({
                    color: BO.pieBiOptionColor(legName.length),
                    legend: {
                        data:legName
                    } ,
                    series:[{
                        radius:[0,'50%'],
                        itemStyle:{
                            normal:{
                                label:{
                                    formatter: '{c} 个\n({d}%)'
                                }
                            }
                        },
                        data: arr
                    },{
                        radius: ['59%', '65%'],
                    }]
                },30,"");
            }else{
                $("#ORG-1-2").initBIOption({
                    color: BO.pieBiOptionColor(legName.length),
                    legend: {
                        data:legName
                    } ,
                    series:[{
                        radius:[0,'50%'],
                        itemStyle:{
                            normal:{
                                label:{
                                    formatter: '{c} 个\n({d}%)'
                                }
                            }
                        },
                        data: arr
                    },{
                        radius: ['59%', '65%'],
                    }]
                },30,"");
            }

        })
    },
    //第三个echart图：机构能力平均分走势图  modify in 2017.12.1
    initOrgEcharts3:function(startYear,endYear){
        var param ={};
        param.startYear = startYear;
        param.endYear = endYear;
        param.uid = '';
        $("#ORG-2-1").showLoading();
        system.post(get_root+"/ship/bi/orgEchartsData3",param,function (data) {
            var obj = data.result;
            //机构数量
            var option = {yAxis: {name: "个"},
                xAxis: {data: obj.xAxis},series:[{
                    name: '机构数量',
                    data: obj.numData,
                    formatter: '{c}\n({d}%)'
                }] };
            //机构能力
            var option2 = {yAxis: {name: "分"},
                xAxis: {data: obj.xAxis},series:[{
                    name: '平均分',
                    data: obj.data,
                    formatter: '{c}分\n({d}%)'
                }] };
            var id = $("#orgabilityAver .active").attr('id');
            switch (id){
                case '2-1':
                    $("#ORG-2-1").initBIOption(option,20,{});
                    break;
                case '2-2':
                    $("#ORG-2-1").initBIOption(option2,20,{});
                    break;
            }
            $('#2-1').on('click',function(){
                $("#ORG-2-1").initBIOption(option,20,{});
            })
            $('#2-2').on('click',function(){
                $("#ORG-2-1").initBIOption(option2,20,{});
            })
        });

    },
    //气泡图
    initOrgEcharts4:function (uid) {
        var param ={};
        param.uid = uid;
        system.post(get_root+"",param,function (data) {
            var obj = data.result;
            console.log(data);
        })
    },
    //图表5：渔船检验机构检验工作量的完成情况
    initOrgEcharts5:function (uid) {
        var param ={};
        param.uid = uid;
        $("#ORG-3-1").showLoading();
        system.post(get_root+"/ship/bi/getOrgData",param,function (data) {
            var obj = data.result;
            // var myChart = echarts.init(document.getElementById("ORG-3-1"));
            $("#ORG-3-1").initBIOption({
                toolbox: {
                    feature: {
                        restore : {show: false},
                        saveAsImage : {show: false}}},
                series:[{
                    data:[{value: obj.checkPercent, name: '检验完成率'}]}]

            },40,{})
        })
    },
    //图表6：近五年检验工作完成率趋势图
    initOrgEcharts6:function (uid,startY,endT) {
        var date = new Date();
        var param ={};
        param.uid = uid;
        if(system.isBlank(startY) || system.isBlank(endT)){
            endT = date.getFullYear() - 1;
            startY = endT -4;
        }
        param.startYear = startY;
        param.endYear = endT;
        $('#yearSpace').html("("+startY+'-'+endT+")");
        $("#ORG-3-2").showLoading();
        system.post(get_root+"/ship/bi/orgEchartsData6",param,function (data) {
            var obj = data.result;
             console.log(obj);
            $("#ORG-3-2").initBIOption({
                tooltip: {
                    formatter: function (a) {
                        var relVal = '';
                        for (var i in a) {
                            if (i < 2) {var domain = a[i]; relVal += domain.seriesName + '&nbsp;:&nbsp;<span style="color:#FAFB02">' + domain.value + '%</span><br/>';
                            }}return relVal;}},
                yAxis: {name: "%"},
                xAxis: {data:obj.xAxis},
                grid:{
                    top:'10%',
                    left: '3%',
                    right: '8%',
                    bottom: '3%',
                    containLabel: true
                },
                series: [
                    {name: '完成率', data: obj.data,
                        markLine : {
                            lineStyle : {
                                normal : {
                                    color : "#e4393c"
                                }
                            },
                            data : [
                                {
                                    name: '平均值',
                                    // 支持 'average', 'min', 'max'
                                    type: 'average'
                                }
                                // [{
                                //     // 固定起点的 x 像素位置，用于模拟一条指向最大值的水平线
                                //     yAxis: 'max',
                                //     x: '90%'                     
                                // }, {
                                //     type: 'max'
                                // }],
                            ]

                        },
                        
                    },
                ]
            }, 20, {});

        })
    },
    //图表7：检验工作完成率分析图（按地区）
    initOrgEcharts7:function (uid,year) {
        var param ={};
        param.year = year;
        param.uid = uid;
        //添加参数：时间
        $('#currYear').html("("+param.year+")");
        $("#ORG-3-3").showLoading();
        system.post(get_root+"/ship/bi/orgEchartsData7",param,function (data) {
            var obj = data.result;
            $("#ORG-3-3").initBIOption({
                tooltip: {
                    formatter: function (a) {
                        var relVal = '';
                        for (var i in a) {
                            if (i < 2) {var domain = a[i]; relVal += domain.seriesName + '&nbsp;:&nbsp;<span style="color:#FAFB02">' + domain.value + '%</span><br/>';
                            }}return relVal;}},
                yAxis: {name: "%"},
                xAxis: {
                    name:"地区",
                    data: obj.xAxis,
                    axisLabel: {
                        interval: 0,
                        // rotate: 60,
                        formatter:function(value,index)
                        {
                            var ret = "";//拼接加\n返回的类目项
                            var maxLength = 4;//每项显示文字个数
                            var valLength = value.length;//X轴类目项的文字个数
                            var rowN = Math.ceil(valLength / maxLength); //类目项需要换行的行数
                            if (rowN > 1)//如果类目项的文字大于3,
                            {
                                for (var i = 0; i < rowN; i++) {
                                    var temp = "";//每次截取的字符串
                                    var start = i * maxLength;//开始截取的位置
                                    var end = start + maxLength;//结束截取的位置
                                    //这里也可以加一个是否是最后一行的判断，但是不加也没有影响，那就不加吧
                                    temp = value.substring(start, end) + "\n";
                                    ret += temp; //凭借最终的字符串
                                }
                                return ret;
                            }
                            else {
                                return value;
                            }
                        }
                    }
                },
                grid:{
                    top:'10%',
                    left: '3%',
                    right: '8%',
                    bottom: '3%',
                    containLabel: true
                },
                series:[{name:'完成率',data:obj.data}]},20,{})
        })
    },
    //图表8：各地区机构复核数量
    initOrgEcharts8:function (uid) {
        var param ={};
        param.uid = uid;
        $("#ORG-4-1").showLoading();
        system.post(get_root+"/ship/bi/orgEchartsData8",param,function (data) {
            var obj = data.result;
            var toChNum =[];
            var totalNum =[];
            var orgName = [];

            for(var i=0;i<obj.length;i++){
                if(i<=10){
                    toChNum.push(obj[i].toBeChcNum);
                    totalNum.push(obj[i].totalNum);
                    orgName.push(obj[i].orgname);
                }
            }
            $("#ORG-4-1").initBIOption({
                yAxis: {name: "个"},
                grid:{
                    right:'5%'
                },
                xAxis: {
                    name: "地区 ",
                    data: orgName,
                    axisLabel: {
                        interval: 0,
                        formatter:function(value,index)
                        {
                            var ret = "";//拼接加\n返回的类目项
                            var maxLength = 4;//每项显示文字个数
                            var valLength = value.length;//X轴类目项的文字个数
                            var rowN = Math.ceil(valLength / maxLength); //类目项需要换行的行数
                            if (rowN > 1)//如果类目项的文字大于3,
                            {
                                for (var i = 0; i < rowN; i++) {
                                    var temp = "";//每次截取的字符串
                                    var start = i * maxLength;//开始截取的位置
                                    var end = start + maxLength;//结束截取的位置
                                    //这里也可以加一个是否是最后一行的判断，但是不加也没有影响，那就不加吧
                                    temp = value.substring(start, end) + "\n";
                                    ret += temp; //凭借最终的字符串
                                }
                                return ret;
                            }
                            else {
                                return value;
                            }
                        }
                    }
                },
                series: [
                    {
                        name:'已复核数量',
                        type:'bar',
                        barWidth:'47px',
                        itemStyle:{
                            normal:{
                                borderWidth:'1',
                                // color:'#ae70c1'
                            }

                        },
                        barGap:'-97%',
                        data: toChNum
                    },
                    {
                        name: '业务复核总量',
                        type: 'bar',
                        barWidth:'50px',
                        label: {
                            normal: {
                                show: false,
                                position: 'insideRight'
                            }
                        },
                        itemStyle:{
                            color:'#334',
                            normal:{
                                color: 'transparent',
                                barBorderColor: '#ff0',
                                barBorderWidth:1,
                                barBorderRadius:0,
                                // borderType:"dashed"
                            }
                        },
                        data: totalNum
                    }
                    ]
            }, 10, {});
        })
    },
    //图表9：未来几年机构业务复核数量预测图
    initOrgEcharts9:function (uid,startYear,endYear) {
        var param ={};
        param.uid = uid;
        param.bYear = startYear;
        param.eYear = endYear;
        $('#futureYear').html("("+startYear+"-"+endYear+")");
        $("#ORG-4-2").showLoading();
        system.post(get_root+"/ship/bi/orgEchartsData9",param,function (data) {
            var obj = data.result;
            /********************************************/
            var mapObj={};//{2012:{},2013：{}}
            for(var m in obj){
                var domain=obj[m];
                mapObj[domain['year']]=domain;
            }
            //
            var newArr=[];
            for(var m=startYear;m<=endYear;m++){
                if(!system.isBlank(mapObj[m])){
                    newArr.push(mapObj[m]);
                }else{
                    newArr.push({year:m,num:0});
                }

            }
            /********************************************/
            var xData = [];
            var yData = [];
            for(var i in newArr){
                xData.push(newArr[i].year);
                yData.push(newArr[i].num);
            }
            //======测试用数据 ==========
            // if(curr_org == '中华人民共和国浙江渔业船舶检验局'){
            //     //浙江省
            //     $("#ORG-4-2").initBIOption({
            //         yAxis: {name: "个"},
            //         xAxis: {
            //             name: " ",
            //             data:obj.xAxis},
            //         series: [{data: [7,5,3,3,8,6,3,2,8,7]}]
            //     }, 10, {});
            // }else if(curr_org == '农业部渔业船舶检验局'){
            //     //全国
            //     $("#ORG-4-2").initBIOption({
            //         yAxis: {name: "个"},
            //         xAxis: {
            //             name: " ",
            //             data:obj.xAxis},
            //         series: [{data: [89,66,28,25,95,71,30,29,99,75]}]
            //     }, 10, {});
            // }
            //==============
            $("#ORG-4-2").initBIOption({
                yAxis: {name: "个"},
                grid:{
                    right:'5%'
                },
                xAxis: {name: "年份",data: xData},
                series: [{data: yData}
                ]
            }, 10, {});
        })
    },

    //机构数量和能力分析气泡图
    initOrgEcharts10:function (tdata) {
        console.log(tdata);
        var date = new Date();
        $('#yearOrgAbil').html("("+date.getFullYear()+")");
        var param ={};
        if (!system.isBlank(tdata)) {
            param.year = tdata.startT;
            $('#yearOrgAbil').html(param.year);
        }
        param.uid = '';

        system.post(get_root+"/ship/bi/orgEchartsData4",param,function (data) {
            var obj = data.result;
            console.log(obj);
            var myChart = echarts.init(document.getElementById("ORG-2-2"));
            var xArr = [];
            var dataArr = [];
            for (var i in obj.dataList) {
                var domain = obj.dataList[i];
                var arr=[];
                xArr.push(domain.NAME);

                arr.push(domain.NAME);
                arr.push(domain.SCORE);
                arr.push(domain.NUMS);
                dataArr.push(arr);
            }
            var option = {
                backgroundColor: "#0F2353",
                legend: {
                },
                tooltip: {
                    formatter: function (data) {
                        var obj = data.value;
                        return '地区：<span style="color:#FAFB02">' + obj[0] + '</span></br>能力得分：<span style="color:#FAFB02">' + obj[1] + '</span></br>机构数量：<span style="color:#FAFB02">' + obj[2]+'</span>'
                    },
                    show:true
                },
                grid: {
                    top: "13%",
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                xAxis: {
                    // name: '地区',
                    data: xArr,
                    axisLabel: {
                        interval: 0//横轴信息全部显示
                        // rotate:-30,//-30度角倾斜显示
                    },
                    splitLine: {
                        lineStyle: {
                            color: '#00C6FF',
                            type: 'dashed'
                        }
                    },
                    axisLine: {
                        lineStyle: {
                            color: '#00C6FF',
                            width: 1
                        }
                    }

                },
                yAxis: {
                    min:0,
                    max:100,
                    name: '分',
                    color: '#00C6FF',
                    axisLine: {
                        lineStyle: {
                            color: '#00C6FF',
                            width: 1
                        }
                    },
                    splitLine: {
                        lineStyle: {
                            // type: 'dashed'
                        }
                    }
                },
                series: [{
                    name: '机构数量(个)',
                    data: dataArr,
                    type: 'scatter',
                    symbolSize: function (data) {
                        return Math.sqrt(data[2]) * 5;
                    },
                    itemStyle: {
                        normal: {
                            shadowBlur: 10,
                            shadowColor: '#0D84CA',
                            shadowOffsetY: 5,
                            color: new echarts.graphic.RadialGradient(0.4, 0.3, 1, [{
                                offset: 0,
                                color: '#0D84CA'
                            }, {
                                offset: 1,
                                color: '#0D84CA'
                            }])
                        },
                        emphasis: {
                            color: '#00FCD1',//黄色
                            symbolSize: 28,
                            borderColor: '#00FCD1',
                            borderWidth: 4,
                            shadowBlur: 10,
                            shadowColor: '#00FCD1'
                        }
                    }
                }]
            };
            myChart.setOption(option);
        })
    },

    /**
     *
     * @param id 加载图Id
     * @param rangVal   类型
     * @param backgroundcolor 图形背景颜色
     */
    initSurNumBox:function(id,rangVal,backgroundcolor){
        var xarry=[];
        var yarry=[];
        var option = {
            color: ['#02B4F7','#0083A3','#00FCD1'],
            backgroundColor:backgroundcolor,// '#18204B',//背景色
            /* title: {
             text: '近5年渔业船舶验船师人数走势图',
             x : '20px' ,
             y:'-1px',
             textStyle: {
             fontSize: 20,
             fontWeight: 'bolder',
             color: '#FFF'          // 主标题文字颜色
             }
             },*/
            tooltip : {
                trigger: 'axis',           // 触发类型，默认数据触发，见下图，可选为：'item' | 'axis'
                showDelay: 20,             // 显示延迟，添加显示延迟可以避免频繁切换，单位ms
                hideDelay: 100,            // 隐藏延迟，单位ms
                transitionDuration : 0.4,  // 动画变换时间，单位s
                formatter:function(a) {
                    var relVal = '';
                    for(var i in a){
                        console.log(i)
                        if(i<2){
                            var domain=a[i]  ;
                            relVal +=domain.seriesName+ '&nbsp;:&nbsp;<span style="color:#FAFB02">'+domain.value+'</span><br/>';
                        }
                    }
                    //relVal =a[0].seriesName+ '&nbsp;:&nbsp;<span style="color:#FAFB02">'+a[0].value+'</span><br/>';
                    // relVal += a[1]+'°C';
                    return relVal;
                } ,

                axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                    type : 'line',         // 默认为直线，可选为：'line' | 'shadow'
                    lineStyle : {          // 直线指示器样式设置
                        color: '#FAFB02',
                        width: 1,
                        type: 'dashed'
                    },
                    shadowStyle : {                       // 阴影指示器样式设置
                        width: 'auto',                   // 阴影大小
                        color: 'rgba(150,150,150,0.3)'  // 阴影颜色
                    }
                },
                textStyle: {
                    color: '#fff'
                }
            },

            toolbox: {
                /* feature: {
                 saveAsImage: {}
                 }*/
            },
            grid: {
                top:"10%",
                left: '3%',
                right: '10%',
                bottom: '3%',
                containLabel: true
            },
            xAxis :
                {

                    type : 'category',
                    boundaryGap : false,
                    data :xarry ,
                    axisLabel:{
                        interval:0//横轴信息全部显示
                        // rotate:-30,//-30度角倾斜显示
                    },
                    axisLine:{
                        lineStyle:{
                            color:'#00C6FF',
                            width:1//这里是为了突出显示加上的

                        }
                    }
                }
            ,
            /////////////////////////////////
            yAxis :
                {
                    name:"（人）",
                    color:'#ffff00',
                    type : 'value',
                    axisLine:{
                        lineStyle:{
                            color:'#00C6FF',
                            width:1//这里是为了突出显示加上的
                        }
                    }
                }
            ,
            series : [
                {
                    name:'验船师数量',
                    type:'line',
                    //stack: '总量',
                    symbol:'emptycircle',    //设置折线图中表示每个坐标点的符号；emptycircle：空心圆；emptyrect：空心矩形；circle：实心圆；emptydiamond：菱形
                    symbolSize: 8,//圈的大小
                    areaStyle: {normal: {
                        areaStyle: {

                        }
                    }},

                    //线的样式
                    itemStyle: {
                        normal:{
                            color: new echarts.graphic.LinearGradient(0, 0, 0, 1,
                                [
                                    {offset: 0, color: '#02B4F7'},
                                    {offset: 0.5, color: '#213871'},
                                    {offset: 1, color: '#192359'}
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

                    data:yarry
                }]


        };
        var myChart = echarts.init(document.getElementById(id));
        var param = {};
        param['year'] = '2017,2016，2015,2014,2013'
        if (!system.isBlank(rangVal)) {
            param['rangetype'] = rangVal;
        }

        system.post(get_root+"/ship/bi/getYcsNumGroupByYear",param,function(data){
            var  date=new Date();
            var curYear = date.getFullYear()+"";
            var month=parseInt(date.getMonth().toString());
            for(var m in data.result){
                var domain=data.result[m];
                if(!system.isBlank(domain.YEAR)&&!system.isBlank(domain.NUM)){
                    if(curYear==domain.YEAR) {
                        var yearNow=month!="0"?domain.YEAR+"年"+month+"月": domain.YEAR;
                        xarry.push(yearNow)
                    }else{
                        xarry.push(domain.YEAR)
                    }
                    yarry.push(domain.NUM);
                }

            }
            myChart.setOption(option);
        })
    }   ,
    initSurXLBox:function(id,rangVal,backgroundcolor){
        var seriesData=[];
        var xdata=[]; // ['高级验船师','中级验船师','普通验船师'],
        var legendDdata=[];//['本科','专科','高中']=[];
        var myChart = echarts.init(document.getElementById(id));
        var param = {};
        param['year'] = '2017,2016，2015,2014,2013'
        if (!system.isBlank(rangVal)) {
            param['rangetype'] = rangVal;
        }
        system.post(get_root+"/ship/bi/getYcsXLGroupIndex",param,function(data){
            //学历 ：  大学专科  大学本科   硕士及以上
            var dataXL={"中专及以下":{},"大学专科":{},大学本科:{},"硕士及以上":{}};
            var lvArr=['高级验船师','中级验船师','验船员','助理验船师'];
            /**
             *  传入学历计算 各等级数量
             * @param xlType
             * @returns {Array}
             */
            function getXLNum(xlType) {
                var arry = [];
                for (var lv in lvArr) {
                    var lvName = lvArr[lv];
                    var num = dataXL[xlType][lvName];
                    num = system.isBlank(num) ? 0 : num;
                    arry.push(num);
                }
                return arry;
            }
            console.log(data)
            for(var m in data.result){
                var domain=data.result[m];

                //x坐标轴
                if(xdata.indexOf(domain.LV)==-1) {
                    xdata.push(domain.LV) ;
                }
                //图例
                if(legendDdata.indexOf(domain.EDUCERTCODE)==-1) {
                    legendDdata.push(domain.EDUCERTCODE) ;//x坐标轴
                }
                //
                dataXL[domain.EDUCERTCODE][domain.LV]=domain.NUM;
            }
            xdata=['高级验船师','中级验船师','验船员','助理验船师']; //todo 注释掉此段

            //组装ser
            for(var xl in dataXL){
                seriesData.push({ name: xl, type: 'bar', barWidth: 40, stack: '验船师学历',
                    data: getXLNum(xl)
                })
            }
            /*  seriesData.push({ name: '中专及以下', type: 'bar', barWidth: 40, stack: '验船师学历',
             data: [dataXL['中专及以下']['高级验船师'], 332, 301]
             })*/

            var  option = {
                color: ['#00AEFF','#00699A','#fed61c'],
                backgroundColor:backgroundcolor,// '#2A456B',//背景色
                tooltip : {
                    trigger: 'axis',
                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                        type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                    }
                },
                /* title: {
                 text: '各级持证验船师学历结构情况',
                 x : '20px' ,
                 y:'-1px',
                 textStyle: {
                 fontSize: 20,
                 fontWeight: 'bolder',
                 color: '#FFF'          // 主标题文字颜色
                 },

                 },*/
                legend: {
                    top:"2px",
                    left: 'right',
                    textStyle: {
                        color: '#00C6FF'          // 图例文字颜色
                    },
                    y: '30px',
                    data:legendDdata
                },

                grid: {
                    top:'10%',
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                xAxis :
                    {
                        type : 'category',
                        boundaryGap : true,
                        data :xdata,

                        axisLine:{
                            lineStyle:{
                                color:'#00C6FF',
                                width:1//这里是为了突出显示加上的

                            }
                        }
                    }
                ,
                yAxis :
                    {
                        name:'人',
                        type : 'value',
                        axisLine:{
                            lineStyle:{
                                color:'#00C6FF',
                                width:1,//这里是为了突出显示加上的
                            }
                        }
                    }
                ,
                series : seriesData
            };
            myChart.setOption(option);
        })
    }   ,
    initSurLVBox:function(id,rangVal,backgroundcolor){
        var rangVal=1;//$("#rang-select option:selected").val();
        var typeStr=1;//$("#cate-select option:selected").val();
        var chartType=1;//$("#chart-select option:selected").val();
        var legendData=[];
        var seriesData=[];
        var  option3 ="";
        if(chartType=="1"){
            option3={
                color: ['#ED3F49','#00AEFF','#00699A','#FED61c','rgba(64, 82, 114, 0.6)','#405272'],
                backgroundColor:backgroundcolor,// '#2A456B',//背景色
                tooltip: {
                    trigger: 'none',
                    //  trigger: 'item',
                    formatter: "{a} <br/>{b}: {c} ({d}%)"
                },
                /*  title: {
                 text: '验船师类别',
                 x : '20px' ,
                 y:'-1px',
                 textStyle: {
                 fontSize: 20,
                 fontWeight: 'bolder',
                 color: '#FFF'          // 主标题文字颜色
                 }

                 },*/
                legend: {
                    orient: 'vertical',
                    left: 'left',
                    textStyle: {
                        color: '#00C6FF'          // 图例文字颜色
                    },
                    y: 'bottom',
                    data:legendData// ['验船员','助理验船师','中级验船师','高级验船师']
                },

                grid: {
                    top:'10%',
                    left: '23%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                series: [
                    {
                        name:'验船师数量',
                        type:'pie',
                        selectedMode: 'single',
                        radius: [0, '60%'],

                        label: {
                            normal: {
                                position: 'outer'
                            }
                        },
                        labelLine: {
                            normal: {
                                show: true
                            }
                        },
                        data:seriesData
                        ,
                        itemStyle: {
                            normal: {
                                // color: '各异',
                                borderColor: '#405272',
                                borderWidth: 1,
                                label: {
                                    show: true,
                                    position: 'outer',
                                    formatter: ' {c} ({d}%) '
                                    //{b} \n  ({d}%)
                                    // textStyle: null      // 默认使用全局文本样式，详见TEXTSTYLE
                                    ,textStyle:{
                                        fontSize:16
                                    }
                                },
                                labelLine: {
                                    show: true,
                                    length: 20,
                                    lineStyle: {
                                        //  color: '各异',
                                        width: 2,
                                        type: 'solid'
                                    }
                                }
                            },
                            emphasis: {
                                // color: 各异,
                                borderColor: '#405272',
                                borderWidth: 2,//鼠标移动上去的宽度
                                label: {
                                    show: true,
                                    position: 'outer'
                                    // textStyle: null      // 默认使用全局文本样式，详见TEXTSTYLE
                                },
                                labelLine: {
                                    show: true,
                                    length: 1,
                                    lineStyle: {
                                        // color: 各异,
                                        width: 1, ////鼠标移动上线的宽度
                                        type: 'solid'
                                    }
                                }
                            }
                        }
                    }

                    ,
                    //外侧圆圈设置
                    {
                        name:'外侧圆圈设置',
                        type:'pie',
                        radius: ['69%', '78%'],
                        data:[
                            {value:788, name:''}
                        ],
                        labelLine: {
                            normal: {
                                show: false
                            }
                        },
                        tooltip: {
                            trigger: 'none'
                        },
                        itemStyle: {
                            normal: {
                                //设置透明色
                                borderColor: 'rgba(97, 117, 137, 0.1)',//#405272
                                borderWidth: 7,
                                emphasis: {

                                }
                            }
                        }}
                ]
            }
        };
        if(chartType=="2"){
            option3 = {
                color: ['#00AEFF','#00699A','#fed61c'],
                backgroundColor:backgroundcolor,// '#2A456B',//背景色
                tooltip : {
                    trigger: 'axis',
                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                        type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                    }
                },
                /*   title: {
                 text: '各级持证验船师学历结构情况',
                 x : '20px' ,
                 y:'-1px',
                 textStyle: {
                 fontSize: 20,
                 fontWeight: 'bolder',
                 color: '#FFF'          // 主标题文字颜色
                 },

                 }
                 ,*/
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                xAxis :
                    {
                        type : 'category',
                        boundaryGap : true,
                        data : legendData,

                        axisLine:{
                            lineStyle:{
                                color:'#00C6FF',
                                width:1,//这里是为了突出显示加上的

                            }
                        }
                    }
                ,
                yAxis :
                    {
                        name:'人',
                        type : 'value',
                        axisLine:{
                            lineStyle:{
                                color:'#00C6FF',
                                width:1,//这里是为了突出显示加上的
                            }
                        }
                    }
                ,
                series : [
                    {
                        type:'bar',
                        barWidth:40,
                        stack: '验船师学历',
                        data:seriesData
                    }

                ]
            };

        }
//            $("#sur-person-chart").html('');
        var myChart = echarts.init(document.getElementById(id));
        var param = {};
        param['year'] = '2017,2016，2015,2014,2013'
        if (!system.isBlank(rangVal)) {
            param['rangetype'] = rangVal;
        }
        param['typeStr'] =typeStr;


        system.post(get_root+"/ship/bi/getYcsCateIndex",param,function(data){
            for(var m in data.result){
                var domain=data.result[m];
                if(m==0){
                    seriesData.push({value:domain.NUM, name:domain.TYPE,selected:true});
                }else{
                    seriesData.push({value:domain.NUM, name:domain.TYPE});
                }
                legendData.push(domain.TYPE);
            }
            console.log("-------ycs---")
            console.log(data)
            myChart.setOption(option3,true);
        })
    },
    /**
     * 各级学历
     * @param id
     * @param rangVal
     * @param backgroundcolor
     */
    initSurXLCateBox:function(id,rangVal,backgroundcolor){
        var rangVal=1;//$("#rang-select option:selected").val();
        var typeStr=2;//$("#cate-select option:selected").val();
        var chartType=1;//$("#chart-select option:selected").val();
        var legendData=[];
        var seriesData=[];
        var  option3 ="";
        if(chartType=="1"){

//            option3={
//                color: ['#ED3F49','#00AEFF','#00699A','#FED61c','rgba(64, 82, 114, 0.6)','#405272'],
//                backgroundColor:backgroundcolor,// '#2A456B',//背景色
//                tooltip: {
//                    trigger: 'none',
//                    //  trigger: 'item',
//                    formatter: "{a} <br/>{b}: {c} ({d}%)"
//                },
//              /*  title: {
//                    text: '验船师类别',
//                    x : '20px' ,
//                    y:'-1px',
//                    textStyle: {
//                        fontSize: 20,
//                        fontWeight: 'bolder',
//                        color: '#FFF'          // 主标题文字颜色
//                    }
//
//                },*/
//                legend: {
//                    orient: 'vertical',
//                    left: 'left',
//                    textStyle: {
//                        color: '#00C6FF'          // 图例文字颜色
//                    },
//                    y: 'bottom',
//                    data:legendData// ['验船员','助理验船师','中级验船师','高级验船师']
//                },
//
//                grid: {
//                    top:'10%',
//                    left: '23%',
//                    right: '4%',
//                    bottom: '3%',
//                    containLabel: true
//                },
//                series: [
//                    {
//                        name:'验船师数量',
//                        type:'pie',
//                        selectedMode: 'single',
//                        radius: [0, '60%'],
//
//                        label: {
//                            normal: {
//                                position: 'outer'
//                            }
//                        },
//                        labelLine: {
//                            normal: {
//                                show: true
//                            }
//                        },
//                        data:seriesData
//                        ,
//                        itemStyle: {
//                            normal: {
//                                // color: '各异',
//                                borderColor: '#405272',
//                                borderWidth: 1,
//                                label: {
//                                    show: true,
//                                    position: 'outer',
//                                    formatter: ' {c} ({d}%) '
//                                           //{b} \n  ({d}%)
//                                    // textStyle: null      // 默认使用全局文本样式，详见TEXTSTYLE
//                                    ,textStyle:{
//                                        fontSize:16
//                                    }
//                                },
//                                labelLine: {
//                                    show: true,
//                                    length: 20,
//                                    lineStyle: {
//                                        //  color: '各异',
//                                        width: 2,
//                                        type: 'solid'
//                                    }
//                                }
//                            },
//                            emphasis: {
//                                // color: 各异,
//                                borderColor: '#405272',
//                                borderWidth: 2,//鼠标移动上去的宽度
//                                label: {
//                                    show: true,
//                                    position: 'outer'
//                                    // textStyle: null      // 默认使用全局文本样式，详见TEXTSTYLE
//                                },
//                                labelLine: {
//                                    show: true,
//                                    length: 1,
//                                    lineStyle: {
//                                        // color: 各异,
//                                        width: 1, ////鼠标移动上线的宽度
//                                        type: 'solid'
//                                    }
//                                }
//                            }
//                        }
//                    }
//
//                    ,
//                    //外侧圆圈设置
//                    {
//                        name:'外侧圆圈设置',
//                        type:'pie',
//                        radius: ['69%', '78%'],
//                        data:[
//                            {value:788, name:''}
//                        ],
//                        labelLine: {
//                            normal: {
//                                show: false
//                            }
//                        },
//                        tooltip: {
//                            trigger: 'none'
//                        },
//                        itemStyle: {
//                            normal: {
//                                //设置透明色
//                                borderColor: 'rgba(97, 117, 137, 0.1)',//#405272
//                                borderWidth: 7,
//                                emphasis: {
//
//                                }
//                            }
//                        }}
//                ]
//            }
        };
        if(chartType=="2"){
            option3 = {
                color: ['#00AEFF','#00699A','#fed61c'],
                backgroundColor:backgroundcolor,// '#2A456B',//背景色
                tooltip : {
                    trigger: 'axis',
                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                        type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                    }
                },
                /*   title: {
                 text: '各级持证验船师学历结构情况',
                 x : '20px' ,
                 y:'-1px',
                 textStyle: {
                 fontSize: 20,
                 fontWeight: 'bolder',
                 color: '#FFF'          // 主标题文字颜色
                 },

                 }
                 ,*/
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    containLabel: true
                },
                xAxis :
                    {
                        type : 'category',
                        boundaryGap : true,
                        data : legendData,

                        axisLine:{
                            lineStyle:{
                                color:'#00C6FF',
                                width:1,//这里是为了突出显示加上的

                            }
                        }
                    }
                ,
                yAxis :
                    {
                        name:'人',
                        type : 'value',
                        axisLine:{
                            lineStyle:{
                                color:'#00C6FF',
                                width:1,//这里是为了突出显示加上的
                            }
                        }
                    }
                ,
                series : [
                    {
                        type:'bar',
                        barWidth:40,
                        stack: '验船师学历',
                        data:seriesData
                    }

                ]
            };

        }
//            $("#sur-person-chart").html('');
        var myChart = echarts.init(document.getElementById(id));
        var param = {};
        param['year'] = '2017,2016，2015,2014,2013'
        if (!system.isBlank(rangVal)) {
            param['rangetype'] = rangVal;
        }
        param['typeStr'] =typeStr;


        system.post(get_root+"/ship/bi/getYcsCateIndex",param,function(data){
            for(var m in data.result){
                var domain=data.result[m];
                if(m==0){
                    seriesData.push({value:domain.NUM, name:domain.TYPE,selected:true});
                }else{
                    seriesData.push({value:domain.NUM, name:domain.TYPE});
                }
                legendData.push(domain.TYPE);
            }
            console.log("-------ycs---")
            console.log(data)

//            myChart.setOption(option3,true);
        })
    },

    /**
     * 机构总数弹窗
     */
    orgSum:function(i){
        var data={
            th : [1,2,3,4,5,6,7,8]
        }
        var con = template("orgnums",data);
        layer.open({
            type: 1,
            skin: 'lis1',
            closeBtn: '2',
            area: ['1140px', '500px'],
            shadeClose: false,
            content: con,
            shade: [0.7, '#000'],
            title: $('.box-text').eq(i).text()
        })
    },
    /**
     * 机构业务复核数量
     */
    orgServiceNums:function(i){
        var data={
            th : [1,2,3,4,5,6,7,8]
        }
        var con = template("orgservice",data);
        layer.open({
            type: 1,
            skin: 'lis1',
            closeBtn: '2',
            area: ['1140px', '500px'],
            shadeClose: false,
            content: con,
            shade: [0.7, '#000'],
            title: $('.box-text').eq(i).text()
        })

    },
    /**
     * 检验工作完成率
     */
    checkCompletionRate:function(i){
        var data={
            th : [1,2,3,4,5,6,7,8]
        }
        var con = template("orgcomplete",data);
        layer.open({
            type: 1,
            skin: 'lis1',
            closeBtn: '2',
            area: ['1140px', '500px'],
            shadeClose: false,
            content: con,
            shade: [0.7, '#000'],
            title: $('.box-text').eq(i).text()
        })
    },
    /**
     * 机构能力平均分
     */
    orgAbilityAverage:function(i) {
        var data = {
            th: [1, 2, 3, 4, 5, 6, 7, 8]
        }
        var con = template("orgability", data);
        layer.open({
            type: 1,
            skin: 'lis1',
            closeBtn: '2',
            area: ['1140px', '500px'],
            shadeClose: false,
            content: con,
            shade: [0.7, '#000'],
            title: $('.box-text').eq(i).text()
        })
    }

}