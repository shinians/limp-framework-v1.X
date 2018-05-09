$(function(){
    //页面基本信息
    $("#time-techDevelop-1-1").initDateFilterSingle(techDevelop.drawNumsFunc);
    $("#time-techDevelop-1-2").initDateFilterSingle(techDevelop.drawCheckNumsFunc);
    $("#time-techDevelop-2-1").initDateFilterSingle(techDevelop.entNumsFun);
    $("#time-techDevelop-2-2").initDateFilterSingle(techDevelop.newShipCapacityfun);
    $("#time-techDevelop-3-1").initDateFilter(techDevelop.drawFirPassRateFun);
    $("#time-techDevelop-3-2").initDateFilterSpace(techDevelop.drawNumsGroupYearFun);
    $("#time-techDevelop-3-3").initDateFilterSingle(techDevelop.repaireBuildEntNumsFun);

    $.ajax({
        url: get_root + '/ship/bi/getTechDeveLopInfo',
        type: 'post',
        // data: {pid: entPid},
        dataType: 'json',
        success: function (data) {

            if(curr_org == '中华人民共和国浙江渔业船舶检验局'){
                $("#drawNums").text("171");
                $("#drawEntNums").text("13");
                $("#repairBuidlEntNums").text("106");
                $("#repairEntNums").text("51");
                $("#standardScore").text("11");
            }else if(curr_org == '农业部渔业船舶检验局'){
                $("#drawNums").text("364");
                $("#drawEntNums").text("102");
                $("#repairBuidlEntNums").text("850");
                $("#repairEntNums").text("409");
                $("#standardScore").text("89.75");
            }
            //暂时屏蔽 11.21 by Liangpeng 最终解释权归清华所有
            // var obj = JSON.parse(data).result;
            // $("#drawNums").text(obj.drawNums);
            // $("#drawEntNums").text(obj.drawEntNums);
            // $("#repairBuidlEntNums").text(obj.repairBuidlEntNums);
            // $("#repairEntNums").text(obj.repairEntNums);
            // $("#standardScore").text(obj.standardScore);
        }
    })
    //各省图纸审查数量分析图
    // techDevelop.drawNumsFunc();


    //图纸审查数量比例图
    // techDevelop.drawCheckNumsFunc();


    $('#dowebok').fullpage({
        navigation: true,
        afterRender : function(){
            //控制iframe高度
            // $('#nav_iframe', window.parent.document).css({
            //     minHeight : 650
            // });
            //各省图纸审查数量分析图
           techDevelop.drawNumsFunc();
            //图纸审查数量比例图
           // techDevelop.drawCheckNumsFunc();
        },
        afterLoad : function(anchorLink, index){
            //index ： 当前跳转的页面
            if(index==2){
                //设计单位数量分析图
                techDevelop.entNumsFun();
                //新建渔船标准化分析图
                techDevelop.newShipCapacityfun();


            }else if(index==3){
                //审图中心图纸审查一次合格率
                techDevelop.drawFirPassRateFun();
                //图纸审查数量分析图
                techDevelop.drawNumsGroupYearFun();


                //渔船修造企业数量分析图
                techDevelop.repaireBuildEntNumsFun();


            }else if(index==1){
                //各省图纸审查数量分析图
                //techDevelop.drawNumsFunc();
                //图纸审查数量比例图
                //techDevelop.drawCheckNumsFunc();
            }
            scrollTo(0,0);
        }
    });


})
var techDevelop =  {
    //图一：各省图纸审查数量分析图
    //默认展示某年数据？
    drawNumsFunc:function (tdata){
         var year = '';
        //
        if (tdata) {
            year = tdata.startT;
        }
         $('#provincePaperNum').html(year);
         $("#techDevelop-1-1").showLoading();
         $("#techDevelop-1-2").showLoading();
        $.ajax({
            url: get_root + '/ship/bi/getDrawNumsGroupPrv',
            type: 'post',
            data: {year: year},//年份
            datatype: 'json',
            success: function (data) {
                var today = new Date();//获得当前日期
                var getYear = today.getFullYear();//获得年份
                getYear=getYear-1;
                $("#provincePaperNum").html("("+getYear+")")
                var seriesData = [];
                var seriesData_qg = [];
                var xData = [];
                var xData_qg = [];
                var obj= JSON.parse(data).result;
                // console.log(obj);
                for (var i in obj) {
                    if (i<5) {//非弹出框只显示排名前5的省份数据,弹出框显示所有省份数据
                        xData[i] = obj[i]["provname"];
                        seriesData[i] = obj[i]["drawNums"];
                    }
                    xData_qg[i] = obj[i]["provname"];
                    seriesData_qg[i] = obj[i]["drawNums"];
                }
                //暂时屏蔽
                //排名前5的省份
                $("#techDevelop-1-1").initBIOption({
                    yAxis: {name: "套"},
                    xAxis:{data:xData},
                    series:[{data:seriesData}]
                },10,{})
                //全国的省份 弹窗
                $("#techDevelop-1-2").initBIOption({
                    yAxis: {name: "套"},
                    xAxis:{data:xData_qg},
                    series:[{data:seriesData_qg}]
                },10,{})
            }
        })
    },
    //图二：图纸审查数量比例图
    drawCheckNumsFunc:function (tdata){
        var year = '';
        if (tdata) {
            year = tdata.startT;
        }

        $("#techDevelop-1-2").showLoading();
        // $.ajax({
        //     url: get_root + '/ship/bi/getDrawCheckNumsByYear',
        //     type: 'post',
        //     data: {year: year},//年份
        //     datatype: 'json',
        //     success: function (data) {
        //         console.log(data);
        //         var legendData=[];
        //         var myData=[];
        //         var seriesData=[];
        //         myData= JSON.parse(data).result;
        //         for (var i in myData) {
        //             legendData[i]=myData[i]["JOBAREA"];
        //             seriesData.push({value:myData[i]["NUM"],name:legendData[i]})
        //
        //         }
        //         $("#techDevelop-1-2").initBIOption({
        //             color:BO.pieBiOptionColor(legendData.length) ,
        //             legend: {
        //                 data: legendData
        //             },
        //             series: [{
        //                 itemStyle: {normal: {label: {formatter: '{c}套\n({d}%)'}}},
        //                 data: seriesData
        //             }]
        //         }, 30, {});
        //     }
        // })
    },
    //图三：设计单位数量分析图
    entNumsFun:function (tdata){
        var year = '';
        if (tdata){
            year = tdata.startT;
        }
        $("#techDevelop-2-1").showLoading();
        $.ajax({
            url: get_root + '/ship/bi/getEntNumsGroupPrv',
            type: 'post',
            data: {entcate: "2",year:year},
            datatype: 'json',
            success: function (data) {
                var seriesData = [];
                var xData = []
                var obj= JSON.parse(data).result;

                for (var i in obj) {
                    if (i==5) {//只显示排名前5的省份数据
                        break;
                    }
                    xData[i] = obj[i]["PRVNAME"];
                    seriesData[i] = obj[i]["ENTNUMS"];
                }

                // if(curr_org == '中华人民共和国浙江渔业船舶检验局'){
                //     //暂无
                //     $("#techDevelop-2-1").initBIOption({yAxis: {name: "家"},
                //         xAxis:{data:["杭州","温州","嘉兴","湖州","绍兴","金华","衢州","舟山","台州","丽水"]},series:[{data:[3,5,2,1,1,2,4,7,2,1]}],
                //         tooltip : {
                //             trigger: 'axis',           // 触发类型，默认数据触发，见下图，可选为：'item' | 'axis'
                //             showDelay: 20,             // 显示延迟，添加显示延迟可以避免频繁切换，单位ms
                //             hideDelay: 100,            // 隐藏延迟，单位ms
                //             transitionDuration : 0.4,  // 动画变换时间，单位s
                //             formatter:function(a) {
                //                 var str = "";
                //                 for(var  i = 0 ;i < a.length ; i++){
                //                     str  =  "地区:"+a[i].axisValue+"<br>"+"设计单位数量:"+a[i].data+"家";
                //                 }
                //                 return str;
                //             }
                //         }
                //     },10,{});
                // }else if(curr_org == '农业部渔业船舶检验局'){
                //     $("#techDevelop-2-1").initBIOption({yAxis: {name: "家"},
                //         xAxis:{data:["浙江","上海","辽宁","江苏","湖北","河北","广西","福建"]},series:[{data:[15,10,11,7,2,1,4,13]}],
                //         tooltip : {
                //             trigger: 'axis',           // 触发类型，默认数据触发，见下图，可选为：'item' | 'axis'
                //             showDelay: 20,             // 显示延迟，添加显示延迟可以避免频繁切换，单位ms
                //             hideDelay: 100,            // 隐藏延迟，单位ms
                //             transitionDuration : 0.4,  // 动画变换时间，单位s
                //             formatter:function(a) {
                //                 var str = "";
                //                 for(var  i = 0 ;i < a.length ; i++){
                //                     str  =  "省份:"+a[i].axisValue+"<br>"+"设计单位数量:"+a[i].data+"家";
                //                 }
                //                 return str;
                //             }
                //         }
                //     },10,{});
                // }

                $("#techDevelop-2-1").initBIOption({yAxis: {name: "家"},
                        xAxis:{data:xData},series:[{data:seriesData}] }
                    ,10,{});
            }
        })
    },
    //图四：新建渔船标准化分析图
    newShipCapacityfun:function (tdata){
        var year = '';
        if (tdata) {
            year = tdata.startT;
        }
        // $("#techDevelop-2-2").showLoading();
        $.ajax({
            url: get_root + '/ship/bi/getNewShipCapacityScore',
            type: 'post',
            data: {year:year},
            datatype: 'json',
            success: function (data) {
                var obj = JSON.parse(data).result;

                var provs=["浙江","山东"];
                var example=["不推荐船型","普通船型","推荐船型","优秀船型"];
                var exampleRang=[60,70,90,100];
                var data=[];
                for(var m in example){
                    //m 循环4中类型的数组
                    var arr=[];
                    for(var n in provs){
                        var prov=provs[n];
                        var eveArr=[];
                        eveArr.push(prov)  ;//y
                        eveArr.push(exampleRang[m]);//X 轴
                        if (m==0) {
                            eveArr.push(obj["score0_60"][prov]["nums"]);//第三个 参数：圈的大小
                            eveArr.push("渔船数量:"+obj["score0_60"][prov]["nums"]);
                        }else if (m==1){
                            eveArr.push(obj["score60_70"][prov]["nums"]);//第三个 参数：圈的大小
                            eveArr.push("渔船数量:"+obj["score60_70"][prov]["nums"]);
                        }else if (m==2){
                            eveArr.push(obj["score70_90"][prov]["nums"]);//第三个 参数：圈的大小
                            eveArr.push("渔船数量:"+obj["score70_90"][prov]["nums"]);
                        }else if (m==3){
                            eveArr.push(obj["score90_100"][prov]["nums"]);//第三个 参数：圈的大小
                            eveArr.push("渔船数量:"+obj["score90_100"][prov]["nums"]);
                        }
                        eveArr.push(example[m]) ;//四类
                        arr.push(eveArr);
                    }
                    data.push(arr);
                }
                /***
                 * 拼装data的过程
                 * @type {Array}
                 */
                function fun1(){
                    var arr=[];
                    for(var m in data[0]){
                        var domain=data[0][m];
                        domain[1]=obj["score0_60"][domain[0]]["score"];
//                              domain[4]=guiG[Math.floor(Math.random()*3)];
                        arr.push(domain)
                    }
                    return arr;
                }
                function fun2(){
                    var arr=[];
                    for(var m in data[1]){
                        var domain=data[1][m];
                        domain[1]=obj["score60_70"][domain[0]]["score"];
                        arr.push(domain);
                    }
                    return arr;
                }
                function fun3(){
                    var arr=[];
                    for(var m in data[2]){
                        var domain=data[2][m];
                        domain[1]=obj["score70_90"][domain[0]]["score"];
                        arr.push(domain)
                    }
                    return arr;
                }
                function fun4(){
                    var arr=[];
                    for(var m in data[3]){
                        var domain=data[3][m];
                        domain[1]=obj["score90_100"][domain[0]]["score"];
                        arr.push(domain);
                    }
                    return arr;
                }
                var myChart = echarts.init(document.getElementById('techDevelop-2-2'));

                var data = [

                    [["辽宁省",12,773200000,'7732',"合格"],["河北省",12,284600000,'2846',"合格"],["天津市",12,14100000,'141',"合格"],["山东省",12,863600000,'8636',"合格"],["江苏省",12,386200000,'3862',"合格"],["上海市",12,11500000,'115',"合格"],["浙江省",12,872500000,'8725 ',"合格"],["福建省",12,311390000,'3139',"合格"],["广东省",12,572200000,'5722',"合格"],["广西省",12,197100000,'1971',"合格"],["海南省",12,187400000,'1874',"合格"],["江西省",12,145300000,'1453',"合格"]]
                    ,[["辽宁省",24,174000000,'1740',"良"],["河北省",24,6400000,'640',"良"],["天津市",24,3200000,'32',"良"],["山东省",24,194300000,'1943',"良"],["江苏省",24,86900000,'869',"良"],["上海市",24,2600000,'26',"良"],["浙江省",24,196300000,'1963',"良"],["福建省",24,250600000,'2506',"良"],["广东省",24,128700000,'1287',"良"],["广西省",24,44400000,'444',"良"],["海南省",24,42200000,'422',"良"],["江西省",24,32700000,'327',"良"]],
                    [["辽宁省",45,19300000,'193',"优"],["河北省",45,710000,'71',"优"],["天津市",45,160000000,'1600',"优"],["山东省",45,21600000,'216',"优"],["江苏省",45,9700000,'97',"优"],["上海市",45,300000,'3',"优"],["浙江省",45,21800000,'218',"优"],["福建省",45,27800000,'278',"优"],["广东省",45,14300000,'143',"优"],["广西省",45,4900000,'49',"优"],["海南省",45,4700000,'47',"优"],["江西省",45,3600000,'36',"优"]]
                    // X轴  Y轴 ，圈的半径（船的数量） 显示名称   类别（标准化程度）
                ];
                var guiG=["合格","良","优"];

                function fun1(){
                    var arr=[];
                    for(var m in data[0]){
                        var domain=data[0][m];
                        domain[1]=Math.floor(Math.random()*12)+12;
//                          domain[4]=guiG[Math.floor(Math.random()*3)];
                        arr.push(domain)
                    }
                    return arr;
                }
                function fun2(){
                    var arr=[];
                    for(var m in data[1]){
                        var domain=data[1][m];
                        domain[1]=Math.floor(Math.random()*21)+24;
                        arr.push(domain)
                    }
                    return arr;
                }
                function fun3(){
                    var arr=[];
                    for(var m in data[2]){
                        var domain=data[2][m];
                        if(domain[0]=="天津市"){
                            domain[1]=55;;
                        } else{
                            domain[1]=Math.floor(Math.random()*5)+45;
                        }
                        arr.push(domain)
                    }
                    return arr;
                }

                var  option = {
                    legend: {
                        y: '10px',
                        data: ['不推荐船型','普通船型','推荐船型','优秀船型'],
                        textStyle: {
                            color: '#00C6FF'          // 图例文字颜色
                        },
                        x:"center"
                    },
                    /* legend: {
                     right: 10,
                     data: ['1990', '2015']
                     },*/
                    xAxis: {
                        name: '省份',
                        type: 'value',
                        type : 'category',
                        boundaryGap : false,
                        data : ['辽宁省','河北省','天津市','山东省','江苏省','上海市','浙江省','福建省','广东省','广西省','海南省','江西省'],
                        axisLine:{
                            lineStyle:{
                                color:'#00C6FF',
                                width:1
                            }
                        }
                    },
                    yAxis: {
                        name:"得分",
                        splitNumber:5,
                        type : 'value',
                        //  name: '船长',
                        nameLocation: 'end',
                        nameGap: 20,
                        min:0,
                        max: 100,
                        axisLine:{
                            lineStyle:{
                                color:'#00C6FF',
                                width:1

                            }
                        },
                        axisLabel: {
                            show: true,
                            interval: 'auto',
                            formatter: '{value}'
                        },
                        splitLine: {
                            lineStyle: {
                                type: 'dashed'
                            }
                        },

                        splitLine: {
                            show: true
                        }
                    },
                    series: [
                        {
                            name: '不推荐船型',
                            data:[],
                            type: 'scatter',
                            symbolSize: function (data) {
                                return Math.sqrt(data[2]) / 5e2;
                            },
                            label: {
                                emphasis: {
                                    show: true,
                                    formatter: function (param) {
                                        return param.data[3];
                                    },
                                    position: 'top'
                                }
                            },
                            itemStyle: {
                                normal: {
                                    shadowBlur: 10,
                                    shadowColor: '#00AE60',
                                    shadowOffsetY: 5,
                                    color:'#00AE60'
                                }
                            }
                        },
                        {
                            name: '普通船型',
                            data:fun1(),
                            type: 'scatter',
                            symbolSize: function (data) {
                                return Math.sqrt(data[2]) / 5e2;
                            },
                            label: {
                                emphasis: {
                                    show: true,
                                    formatter: function (param) {
                                        return param.data[3];
                                    },
                                    position: 'top'
                                }
                            },
                            itemStyle: {
                                normal: {
                                    shadowBlur: 10,
                                    shadowColor: '#00BCFF',
                                    shadowOffsetY: 5,
                                    color: '#00BCFF'
                                }
                            }
                        },
                        {
                            name: '推荐船型',
                            data: fun2(),
                            type: 'scatter',
                            symbolSize: function (data) {
                                return Math.sqrt(data[2]) / 5e2;
                            },
                            label: {
                                emphasis: {
                                    show: true,
                                    formatter: function (param) {
                                        return param.data[3];
                                    },
                                    position: 'top'
                                }
                            },
                            itemStyle: {
                                normal: {
                                    shadowBlur: 10,
                                    shadowColor: '#ED3F49',
                                    shadowOffsetY: 5,
                                    color: '#ED3F49'
                                }
                            }
                        },
                        {
                            name: '优秀船型',
                            data: fun3(),
                            type: 'scatter',
                            symbolSize: function (data) {
                                return Math.sqrt(data[2]) / 5e2;
                            },
                            label: {
                                emphasis: {
                                    show: true,
                                    formatter: function (param) {
                                        return param.data[3];
                                    },
                                    position: 'top'
                                }
                            },
                            itemStyle: {
                                normal: {
                                    shadowBlur: 10,
                                    shadowColor: '#FED61C',
                                    shadowOffsetY: 5,
                                    color:'#FED61C'
                                }
                            }
                        }]

                };

                //暂且屏蔽
                // option = {
                //     // backgroundColor: '#2A456B',//背景色
                //     legend: {
                //         y: '10px',
                //         data: example,
                //         textStyle: {
                //             color: '#00C6FF'          // 图例文字颜色
                //         },
                //         x:"center"
                //     },
                //
                //     xAxis: {
                //         name:"省份",
                //         type: 'value',
                //         type : 'category',
                //         boundaryGap : true,
                //         color:'#0E9ACD',
                //         data :provs,
                //         axisLine:{
                //             lineStyle:{
                //                 color:'#00C6FF',
                //                 width:1
                //
                //             }
                //         }
                //
                //     },
                //     yAxis: {
                //         name:"得分",
                //         splitNumber:8,
                //         type : 'value',
                //         //  name: '船长',
                //         nameLocation: 'end',
                //         nameGap: 20,
                //         min:0,
                //         max: 100,
                //         axisLine:{
                //             lineStyle:{
                //                 color:'#00C6FF',
                //                 width:1
                //
                //             }
                //         },
                //         axisLabel: {
                //             show: true,
                //             interval: 'auto',
                //             formatter: '{value}'
                //         },
                //         splitLine: {
                //             lineStyle: {
                //                 type: 'dashed'
                //             }
                //         },
                //
                //         splitLine: {
                //             show: true
                //         }
                //     },
                //
                //     series: [
                //         {
                //             name: '不推荐船型',
                //             data:fun1(),
                //             type: 'scatter',
                //             symbolSize: function (data) {
                //                 return Math.sqrt(data[2])*2.5e3/ 5e2;
                //             },
                //             label: {
                //                 emphasis: {
                //                     show: true,
                //                     formatter: function (param) {
                //                         return param.data[3];
                //                     },
                //                     position: 'top'
                //                 }
                //             },
                //             itemStyle: {
                //                 normal: {
                //                     shadowBlur: 10,
                //                     shadowColor: '#00AE60',
                //                     shadowOffsetY: 5,
                //                     color:'#00AE60'
                //                 }
                //             }
                //         },
                //         {
                //             name: '普通船型',
                //             data:fun2(),
                //             type: 'scatter',
                //             symbolSize: function (data) {
                //                 return Math.sqrt(data[2])*2.5e3 / 5e2;
                //             },
                //             label: {
                //                 emphasis: {
                //                     show: true,
                //                     formatter: function (param) {
                //                         return param.data[3];
                //                     },
                //                     position: 'top'
                //                 }
                //             },
                //             itemStyle: {
                //                 normal: {
                //                     shadowBlur: 10,
                //                     shadowColor: '#00699A',
                //                     shadowOffsetY: 5,
                //                     color: '#00699A'
                //                 }
                //             }
                //         },
                //         {
                //             name: '推荐船型',
                //             data: fun3(),
                //             type: 'scatter',
                //             symbolSize: function (data) {
                //                 return Math.sqrt(data[2])*2.5e3 / 5e2;
                //             },
                //             label: {
                //                 emphasis: {
                //                     show: true,
                //                     formatter: function (param) {
                //                         return param.data[3];
                //                     },
                //                     position: 'top'
                //                 }
                //             },
                //             itemStyle: {
                //                 normal: {
                //                     shadowBlur: 10,
                //                     shadowColor: '#ED3F49',
                //                     shadowOffsetY: 5,
                //                     color: '#ED3F49'
                //                 }
                //             }
                //         },
                //         {
                //             name: '优秀船型',
                //             data: fun4(),
                //             type: 'scatter',
                //             symbolSize: function (data) {
                //                 return Math.sqrt(data[2])*2.5e3 / 5e2;
                //             },
                //             label: {
                //                 emphasis: {
                //                     show: true,
                //                     formatter: function (param) {
                //                         return param.data[3];
                //                     },
                //                     position: 'top'
                //                 }
                //             },
                //             itemStyle: {
                //                 normal: {
                //                     shadowBlur: 10,
                //                     shadowColor: '#FED61C',
                //                     shadowOffsetY: 5,
                //                     color:'#FED61C'
                //                 }
                //             }
                //         }]
                //
                // };
                myChart.setOption(option);
            }
        });
    },
    drawFirPassRateFun:function (tdata){
        var bYear = '';
        var eYear = '';
        if (tdata) {
            bYear = tdata.startT;
            eYear = tdata.endT;
        }
        $("#techDevelop-3-1").showLoading();
        $.ajax({
            url: get_root + '/ship/bi/getDrawFirPassRate',
            type: 'post',
            data: {bYear:bYear,eYear:eYear},
            datatype: 'json',
            success: function (data) {
                var obj= JSON.parse(data).result;
                var listSD=obj.listSD;
                var listSH=obj.listSH;

                var sdData = [];
                var shData = [];
                var xData = obj.timeList;//年份
                //对象排序
                var compare = function (prop) {
                    return function (obj1, obj2) {
                        var val1 = obj1[prop];
                        var val2 = obj2[prop];
                        if (val1 < val2) {
                            return -1;
                        } else if (val1 > val2) {
                            return 1;
                        } else {
                            return 0;
                        }
                    }
                }

                listSD.sort(compare("year"));

                listSH.sort(compare("year"));

                for(var i = 0;i<xData.length;i++){
                    if(String(xData[i]) == String(listSD[i].year)){
                        sdData.push(listSD[i].rates)
                    }

                    if(String(xData[i]) == String(listSH[i].year)){
                        shData.push(listSH[i].rates)
                    }

                }

                $("#techDevelop-3-1").initBIOption({
                    legend: {
                        data:['山东审图中心','上海审图中心'],
                    },
                    yAxis: {name: "%"},
                    xAxis:{data:xData},
                    series:[
                        {
                            name:'山东审图中心',
                            type:'bar',
                            data:sdData
                        },
                        {
                            name:'上海审图中心',
                            type:'bar',
                            data:shData
                        }
                    ]
                } ,11,{})
            }
        })
    },
    drawNumsGroupYearFun:function (tdata){
        var bYear = '';
        var eYear = '';
        if (tdata) {
            bYear = tdata.startT;
            eYear = tdata.endT;
        }
        $("#techDevelop-3-2").showLoading();
        $.ajax({
            url: get_root + '/ship/bi/getDrawNumsGroupYear',
            type: 'post',
            data: {bYear:bYear,eYear:eYear},
            datatype: 'json',
            success: function (data) {
                var obj= JSON.parse(data).result;
                var domesticOceanData =[];
                var oceanData = [];
                var inlandRiverData = [];
                var xData = [];//年份
                for(var i=0;i<obj.domesticOcean.length;i++){
                    domesticOceanData.push(obj.domesticOcean[i].nums);
                    xData.push(obj.domesticOcean[i].year)
                }
                for(var i=0;i<obj.ocean.length;i++){
                    oceanData.push(obj.ocean[i].nums);
                }
                for(var i=0;i<obj.inlandRiver.length;i++){
                    inlandRiverData.push(obj.inlandRiver[i].nums);
                }

                

                //暂时屏蔽
                $("#techDevelop-3-2").initBIOption({
                    yAxis: {name: "套"},
                    xAxis:{data:xData},
                    series:[
                        {
                            name:'远洋渔业船舶',
                            type:'line',
                            data:oceanData
                        },
                        {
                            name:'国内海洋渔业船舶',
                            type:'line',
                            data:domesticOceanData
                        },
                        {
                            name:'内河渔业船舶',
                            type:'line',
                            data:inlandRiverData
                        }
                    ]
                } ,21,{})
            }
        })
    },
    repaireBuildEntNumsFun:function (tdata){
        var year = '';
        if (tdata) {
            year = tdata.startT;
        }

        $("#techDevelop-3-3").showLoading();
        $.ajax({
            url: get_root + '/ship/bi/getEntNumsGroupPrv',
            type: 'post',
            data: {entcate: "3",year:year},
            datatype: 'json',
            success: function (data) {
                var seriesData = [];
                var xData = []
                var obj= JSON.parse(data).result;

                if(curr_org == '中华人民共和国浙江渔业船舶检验局'){
                    $("#techDevelop-3-3").initBIOption({yAxis: {name: "家"},
                            xAxis:{data:["杭州","温州","嘉兴","湖州","绍兴","金华","衢州","舟山","台州","丽水"]},series:[{data:[703,284,173,863,306,115,872,113,571,197]}] }
                        ,10,{});
                }else if(curr_org == '农业部渔业船舶检验局'){
                    $("#techDevelop-3-3").initBIOption({yAxis: {name: "家"},
                            xAxis:{data:["辽宁","河北","天津","山东","江苏","上海","浙江","福建","广东","广西","海南","江西"]},series:[{data:[7731,2846,173,8636,3862,115,8725,1139,5712,1971,1874,1453]}] }
                        ,10,{});
                }

                // for (var i in obj) {
                //     if (i==5) {//只显示排名前5的省份数据
                //         break;
                //     }
                //     xData[i] = obj[i]["provname"];
                //     seriesData[i] = obj[i]["entnums"];
                // }
                //暂时屏蔽
                // $("#techDevelop-3-3").initBIOption({yAxis: {name: "家"},
                //         xAxis:{data:xData},series:[{data:seriesData}] }
                //     ,10,{});
            }
        })

        $("#techDevelop-3-4").showLoading();
        $.ajax({
            url: get_root + '/ship/bi/getEntNumsGroupPrv',
            type: 'post',
            data: {entcate: "4",year:year},
            datatype: 'json',
            success: function (data) {
                var seriesData = [];
                var xData = []
                var obj= JSON.parse(data).result;
                if(curr_org == '中华人民共和国浙江渔业船舶检验局'){
                    $("#techDevelop-3-4").initBIOption({yAxis: {name: "家"},
                            xAxis:{data:["杭州","温州","嘉兴","湖州","绍兴","金华","衢州","舟山","台州","丽水"]},series:[{data:[422,104,307,160,172,22,214,103,213,162]}] }
                        ,10,{click:".nav li"});
                }else if(curr_org == '农业部渔业船舶检验局'){
                    $("#techDevelop-3-4").initBIOption({yAxis: {name: "家"},
                            xAxis:{data:["辽宁","河北","天津","山东","江苏","上海","浙江","福建","广东","广西","海南","江西"]},series:[{data:[4220,1246,3173,1600,1722,105,4201,1039,2132,1621,1671,1251]}] }
                        ,10,{click:".nav li"});
                }
                //暂时屏蔽
                // for (var i in obj) {
                //     if (i==5) {//只显示排名前5的省份数据
                //         break;
                //     }
                //     xData[i] = obj[i]["provname"];
                //     seriesData[i] = obj[i]["entnums"];
                // }
                // $("#techDevelop-3-4").initBIOption({yAxis: {name: "家"},
                //         xAxis:{data:xData},series:[{data:seriesData}] }
                //     ,10,{});
            }
        })
    }
}