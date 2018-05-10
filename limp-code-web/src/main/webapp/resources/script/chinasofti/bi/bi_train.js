$(function () {
    console.log("培训一张图：bi_train.js");
    $("#trainingNumStatisticsFilter").initDateFilter(train.trainingNumStatisticsFilter);
    $("#trainingNumStatisticsByYearFilter").initDateFilterSingle(train.trainingNumStatisticsByYearFilter);
    $("#srcByTrainplaceAndYearFilter").initDateFilterSingle(train.srcByTrainplaceAndYearFilter);

   // $("#trainingNumStatisticsByYearFilter").initDateFilterSingle(train.trainingNumStatisticsByYearFilter);
    $("#teacherNumFilter").initDateFilterSingle(train.teacherNumFilter);
    $('#dowebok').fullpage({
        navigation: true,
        afterRender : function(){
            //控制iframe高度
            $('#nav_iframe', window.parent.document).css({
                minHeight : 650
            });
            train.dataTo0Onclick();
        },
        afterLoad : function(anchorLink, index){
            //index ： 当前跳转的页面
            if (index ==1) {
                //train.dataTo0Onclick();
            } else if (index == 2) {
                train.dataTo1Onclick();
            } else if (index ==3) {
                train.dataTo2Onclick();
            } else if (index ==4) {
                train.dataTo3Onclick();
            } else {
                //train.dataTo0Onclick();
            }
        }
    });
})
var train = {
    getCoreNum: function () {
        // console.log("培训一张图：获取4个核心指标");
        system.post(get_root + "/ship/bi/getCoreNum.action", {}, function (data) {

            var trainingNum = data.result["trainingNum"];

            if (parseInt(trainingNum)) {
                $("#trainingNum").countTo({to: trainingNum, speed: 1000});
            }
            


            var countPersonNum = data.result["countPersonNum"];
             if (!system.isBlank(countPersonNum)) {
                $("#countPersonNum").countTo({to: parseInt(countPersonNum), speed: 1000});
             }

            var percent = data.result["percent"];
            if (parseInt(percent)) {
                $("#percent").countTo({to: percent, speed: 1000});
            }

            var planNum = data.result["planNum"];
            if (parseInt(planNum)) {
                $("#planNum").countTo({to: planNum, speed: 1000});
            }

            setTimeout(function(){
                $("#trainingNum").html(system.toThousands(trainingNum));
                $("#countPersonNum").html(system.toThousands(countPersonNum));
                $("#percent").html(system.toThousands(percent));
                $("#planNum").html(system.toThousands(planNum));
            },"1000")




        })
    },
    // 单折线图
    initSingleLineEcharts: function (valueUnit, xname, xarry, yname, sname, yarry, id, boundaryGap) {
        var option = {
            tooltip: {
                formatter: function (a) {
                    var relVal = '';
                    for (var i in a) {
                        if (i < 2) {
                            var domain = a[i];
                            // console.log(domain.seriesName + '&nbsp;:&nbsp;<span style="color:#FAFB02">' + domain.value + '</span><br/>');
                            relVal += domain.seriesName + '&nbsp;:&nbsp;<span style="color:#FAFB02">' + domain.value + valueUnit + '</span><br/>';
                        }
                    }
                    return relVal;
                }
            },
            xAxis: {
                name: xname,
                boundaryGap: boundaryGap,
                data: xarry
            },
            yAxis: {
                name: yname
            },
            series: [
                {
                    name: sname,
                    data: yarry
                }]
        };
        $("#" + id).initBIOption(option, 20, {});
    },
    // 横柱形图
    initHorizontalBarEcharts: function (larry, sname, yname, yarry, sarry, id) {
        var option = {
            color: ['#7AC3DB','#7AA9DB','#7A85DB','#7A40DB','#7A40A9'],
            tooltip: {
                trigger: 'axis',
                axisPointer: {            // 坐标轴指示器，坐标轴触发有效
                    type: 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                }
            },
            legend: {
                left: 'center',
                data: larry,
                textStyle: {
                    color: '#00C6FF'          // 图例文字颜色
                }
            },
            grid: {
                left: '3%',
                right: '4%',
                bottom: '3%',
                containLabel: true
            },
            xAxis: {
                name: sname,
                show: false,
                type: 'value'
            },
            yAxis: {
                name: yname,
                type: 'category',
                data: yarry,
                axisLine: {
                    //坐标轴的颜色
                    lineStyle: {
                        color: '#00C6FF',
                        width: 1//这里是为了突出显示加上的

                    }
                }
            },
            series: sarry
        };
        var myChart = echarts.init(document.getElementById(id));
        myChart.setOption(option);
        myChart.hideLoading();
        // $("#" + id).initBIOption(option, , {});
    },
    // 柱形图
    initBarEcharts: function (xname, xarry, yname, sname, yarry, id) {
        var option = {
            xAxis: {
                name: xname,
                data: xarry
            },
            yAxis: {
                name: yname
            },
            series: [
                {
                    stack: '',
                    data: yarry
                }

            ]
        };
        $("#" + id).initBIOption(option, 10, {});
    },
    // 多柱形图
    initHowBarEcharts: function (color, larry, xname, xarry, yname, series, id) {
        var option = {
            color: color,
            legend: {
                // left: 'center',
                data: larry
            },
            xAxis: {
                name: xname,
                data: xarry,
                axisLabel :{
                    interval:0,
                    formatter : function(params){
                        var newParamsName = "";
                        var paramsNameNumber = params.length;
                        var provideNumber = 6;
                        var rowNumber = Math.ceil(paramsNameNumber / provideNumber);
                        if (paramsNameNumber > provideNumber){
                            for (var p = 0; p < rowNumber; p++){
                                var tempStr = "";
                                var start = p * provideNumber;
                                var end = start + provideNumber;
                                if (p == rowNumber - 1){
                                    tempStr = params.substring(start, paramsNameNumber);
                                }else{
                                    tempStr = params.substring(start, end) + "\n";
                                }
                                newParamsName += tempStr;
                            }
                        }else{
                            newParamsName = params;
                        }

                        return newParamsName

                    }
                }
            },
            yAxis: {
                name: yname,
                minInterval: 1
            },
            series: series
        };
        $("#" + id).initBIOption(option, 11, {});
    },
    // 多折线图
    initHowLineEcharts: function (valueUnit, larry, xname, xarry, yname, series, id, boundaryGap) {
        var option = {
            color: [
                // 下列颜色越多越好，建议不少于五个。
                new echarts.graphic.LinearGradient(0, 0, 0, 1,
                    [
                        {offset: 0, color: '#62BCD6'},
                        {offset: 0.2, color: 'rgba(98,188,214,0.5)'},
                        {offset: 1, color: 'rgba(98,188,214,0.1)'}
                    ]
                ),
                new echarts.graphic.LinearGradient(0, 0, 0, 1,
                    [
                        {offset: 0, color: '#78B7D6'},
                        {offset: 0.2, color: 'rgba(120,183,214,0.5)'},
                        {offset: 1, color: 'rgba(120,183,214,0.1)'}
                    ]
                ),
                new echarts.graphic.LinearGradient(0, 0, 0, 1,
                    [
                        {offset: 0, color: '#43AED7'},
                        {offset: 0.2, color: 'rgba(67,174,215,0.5)'},
                        {offset: 1, color: 'rgba(67,174,215,0.1)'}
                    ]
                ),
                new echarts.graphic.LinearGradient(0, 0, 0, 1,
                    [
                        {offset: 0, color: '#2AA5CE'},
                        {offset: 0.2, color: 'rgba(42,165,206,0.5)'},
                        {offset: 1, color: 'rgba(42,165,206,0.1)'}
                    ]
                ),
                new echarts.graphic.LinearGradient(0, 0, 0, 1,
                    [
                        {offset: 0, color: '#3DA2CD'},
                        {offset: 0.2, color: 'rgba(61,162,205,0.5)'},
                        {offset: 1, color: 'rgba(61,162,205,0.1)'}
                    ]
                ),
                new echarts.graphic.LinearGradient(0, 0, 0, 1,
                    [
                        {offset: 0, color: '#3997C3'},
                        {offset: 0.2, color: 'rgba(57,151,195,0.5)'},
                        {offset: 1, color: 'rgba(57,151,195,0.1)'}
                    ]
                ),
                new echarts.graphic.LinearGradient(0, 0, 0, 1,
                    [
                        {offset: 0, color: '#5B9DB7'},
                        {offset: 0.2, color: 'rgba(91,157,183,0.5)'},
                        {offset: 1, color: 'rgba(91,157,183,0.1)'}
                    ]
                ),
                new echarts.graphic.LinearGradient(0, 0, 0, 1,
                    [
                        {offset: 0, color: '#2D89B3'},
                        {offset: 0.2, color: 'rgba(45,137,179,0.5)'},
                        {offset: 1, color: 'rgba(45,137,179,0.1)'}
                    ]
                )
            ],
            tooltip: {
                formatter: function (a) {
                    var relVal = '';
                    for (var i in a) {
                        var domain = a[i];
                        relVal += domain.seriesName + '&nbsp;:&nbsp;<span style="color:#FAFB02">' + domain.value + valueUnit + '</span><br/>';
                    }
                    return relVal;
                }
            },
            //图例设置
            legend: {
                data: larry

            },
            xAxis: {
                name: xname,
                boundaryGap: boundaryGap,
                data: xarry
            },
            yAxis: {
                name: yname,
                minInterval: 1
            },
            series: series
        };
        $("#" + id).initBIOption(option, 21, {});
    },
    getTrainingNumStatistics: function (startDate, endDate) {
        $("#TRAINING_NUM_BOX").showLoading();
        // console.log("培训一张图：获取培训人次统计图统计数据");

        var xarry = [];
        var yarry = [];
        var param = {};
        if (!system.isBlank(startDate)) {
            param['startDate'] = startDate;
        }
        if (!system.isBlank(endDate)) {
            param['endDate'] = endDate;
        }

        system.post(get_root + "/ship/bi/getTrainingNumStatistics.action", param, function (data) {
            // console.log(data);

            for (var i in data.result) {
                var domain = data.result[i];
                if (!system.isBlank(domain.year)) {
                    xarry.push(domain.year);
                    yarry.push(system.isBlank(domain.count) ? "0" : domain.count);
                }
            }

            //======测试用数据 ==========
            if(curr_org == '中华人民共和国浙江渔业船舶检验局'){
                //浙江省
                yarry =[3760,3980,4012,4119,4221];
                train.initSingleLineEcharts("", "", xarry, "（人次）", '培训人次', yarry, "TRAINING_NUM_BOX", false);
            }else if(curr_org == '农业部渔业船舶检验局'){
                //全国
                yarry =[1012,1035,1167,1285,1345];
                train.initSingleLineEcharts("", "", xarry, "（人次）", '培训人次', yarry, "TRAINING_NUM_BOX", false);
            }

            // train.initSingleLineEcharts("", "", xarry, "（人次）", '培训人次', yarry, "TRAINING_NUM_BOX", false);
        })
    },
    trainingNumStatisticsFilter: function (data) {
        // console.log("获取培训人次统计图统计数据：起始时间检索");
        if (!system.isBlank(data.startT) || !system.isBlank(data.endT)) {
            train.getTrainingNumStatistics(data.startT, data.endT);
        }
    },
    getPercentStatistics: function (orderBy) {
        $("#PERCENT_BOX").showLoading();
        // console.log("培训一张图：获取培训完成率统计图统计数据");

        var xarry = [];
        var yarry = [];
        var param = {};
        if (!system.isBlank(orderBy)) {
            param['orderBy'] = orderBy;
        }
        system.post(get_root + "/ship/bi/getPercentStatistics.action", param, function (data) {
            for (var i in data.result) {
                var domain = data.result[i];
                if (!system.isBlank(domain.TRAINNAME)) {
                    var do01 = domain.TRAINNAME.substring(0, 10) + "\n";
                    var do02 = domain.TRAINNAME.substring(10, 21) + "\n";
                    var do03 = domain.TRAINNAME.substring(21, domain.TRAINNAME.length);
                    domain.TRAINNAME = do01 + do02 + do03;
                    xarry.push(domain.TRAINNAME);
                    yarry.push(domain.PERCENT);
                }
            }
            // console.log("xarry" + xarry);
            // console.log("yarry" + yarry);

            train.initSingleLineEcharts("%", "", xarry, "（%）", '培训完成率', yarry, "PERCENT_BOX", true);
        })
    },
    percentStatisticsTab: function () {
        // console.log("获取培训完成率统计图统计数据：切换检索");
        var orderBy = $("#percentStatisticsTab").val();
        train.getPercentStatistics(orderBy);
        if ("desc" == orderBy) {
            $("#percentStatisticsTab").val("asc");
        } else {
            $("#percentStatisticsTab").val("desc");
        }
    },
    getTrainRateStatistics: function (idsString) {
        $("#TRAIN_RATE_BOX").showLoading();
        // console.log("培训一张图：获取培训执行进度表统计数据");

        var larry = ['培训计划','发起培训', '报名', '培训', '结业/考核'];
        var valueUnit = {0: '培训计划', 1: '发起培训', 2: '报名', 3: '培训', 4: '结业/考核'};
        var yarry = [];
        var sarry = [];

        var param = {};
        if (!system.isBlank(idsString)) {
            param['idsString'] = idsString;
        }

        system.post(get_root + "/ship/bi/getTrainRateStatistics.action", param, function (data) {
            console.log(data);
            var trainRateIds = [];
            for (var i in data.result) {
                var domain = data.result[i];
                if (!system.isBlank(domain.NAME)) {
                    // console.log(domain.ID);
                    trainRateIds.push(domain.ID);
                    var do01 = domain.NAME.substring(0, 7) + "\n";
                    var do02 = domain.NAME.substring(7, 15) + "\n";
                    var do03 = domain.NAME.substring(15, domain.NAME.length);
                    domain.NAME = do01 + do02 + do03;
                    yarry.push(domain.NAME);
                    // console.log(domain.CODE);
                }
            }
            // console.log("trainRateIds.toString()===" + trainRateIds.toString());
            $("#trainRateIds").val(trainRateIds.toString());
            // console.log("valueUnit.length===" + Object.keys(valueUnit).length);
            for (var j = 0; j < Object.keys(valueUnit).length; j++) {
                var xarry = {};
                xarry['type'] = 'bar';
                xarry['stack'] = '总量';
                xarry['label'] = {normal: {show: true, position: 'inside', formatter: '{a}'}};
                xarry['name'] = valueUnit[j];
                xarry['data'] = [];
                for (var i in data.result) {
                    var domain = data.result[i];
                    // console.log(domain)
                    if (!system.isBlank(domain.NAME)) {
                        if (j <= domain.CODE) {
                            xarry['data'].push(100);
                        }
                    }
                }
                // console.log(xarry);
                sarry.push(xarry);
            }
       train.initHorizontalBarEcharts(larry, "培训进度状态", "培训班名称", yarry, sarry, "TRAIN_RATE_BOX");
        })
    },
    trainRateStatisticsFilter: function () {
        //console.log("获取培训执行进度表统计数据：培训班名称检索");
        var param = "?appendName=getTrainNames&strs=" + $("#trainRateIds").val();
        $("#open-iframe").attr("src", get_root + "/ship/bi/trainPage" + param);
        // $(".modal-title").html("选择需要检索的培训班");
        $(".modal-title").html("培训执行进度表：选择需要展示的培训班");
    },
    getTrainingNumStatisticsByYear: function (year, idsString) {
        $("#TRAINING_NUM_BY_YEAR_BOX").showLoading();
        // console.log("培训一张图：获取实际培训统计图统计数据");

        var xarry = [];
        var yarry = [];
        var param = {};
        if (!system.isBlank(year)) {
            param['year'] = year;
        }
        if (!system.isBlank(idsString)) {
            param['idsString'] = idsString;
        }

        system.post(get_root + "/ship/bi/getTrainingNumStatisticsByYear.action", param, function (data){
            if(data.result ==""){
                //测试数据
                xarry= ["海洋上岗班","内陆上岗班","远洋培训班","海洋规则宣贯","远洋能力提高班","海洋长训班","内陆长训班"];
                yarry = [100,110,96,98,104,100,92];
                train.initSingleLineEcharts("人", "", xarry, "（人）", '培训人次', yarry, "TRAINING_NUM_BY_YEAR_BOX", true);
                return;
            }else{
                var trainingNumIds = [];
                for (var i in data.result) {
                    var domain = data.result[i];
                    if (!system.isBlank(domain.trainname)) {
                        trainingNumIds.push(domain.trainid);
                        var do01 = domain.trainname.substring(0, 10) + "\n";
                        var do02 = domain.trainname.substring(10, 21) + "\n";
                        var do03 = domain.trainname.substring(21, domain.trainname.length);
                        domain.trainname = do01 + do02 + do03;
                        xarry.push(domain.trainname);
                        yarry.push(domain.count);
                    }
                }
                // console.log("trainingNumIds.toString()===" + trainingNumIds.toString());
                $("#trainingNumIds").val(trainingNumIds.toString());

                train.initSingleLineEcharts("人", "", xarry, "（人）", '培训人次', yarry, "TRAINING_NUM_BY_YEAR_BOX", true);
            }
        });

    },
    trainingNumStatisticsByYearFilter: function (data) {
        // console.log("获取实际培训统计图统计数据：年份检索");
        if (!system.isBlank(data.startT)) {
            $("#trainingNumYear").val(data.startT);
            train.getTrainingNumStatisticsByYear(data.startT, '');
        }
    },
    trainingNumStatisticsByYearAndNamesFilter: function () {
        // console.log("获取实际培训统计图统计数据：年份、培训班名称检索");
        var param = "?appendName=getTrainingNamesStatisticsByYear&strs=" + $("#trainingNumIds").val() + "&year=" + $("#trainingNumYear").val();
        $("#open-iframe").attr("src", get_root + "/ship/bi/trainPage" + param);
        // $(".modal-title").html("选择需要检索的培训班");
        $(".modal-title").html("实际培训统计图：选择需要展示的培训班");
    },
    getSRCByTrainplaceAndYear: function (year) {
        $("#SRC_TRAINPLACE_YEAR_BOX").showLoading();
        // console.log("培训一张图：获取培训基地培训人次统计图统计数据");

        var xarry = [];
        var yarry = [];
        var param = {};
        if (!system.isBlank(year)) {
            param['year'] = year;
        }
        system.post(get_root + "/ship/bi/getSRCByTrainplaceAndYear.action", param, function (data) {
            console.log(data);
            for (var i in data.result) {
                var domain = data.result[i];
                if (!system.isBlank(domain.trainbase)) {
                    xarry.push(domain.trainbase);
                    yarry.push(domain.count);
                }
            }

        //====测试数据====
            //yarry =[245,367,56];
        //======

            train.initBarEcharts("", xarry, "（人）", '培训人次', yarry, "SRC_TRAINPLACE_YEAR_BOX");
        })

    },
    srcByTrainplaceAndYearFilter: function (data) {
        // console.log("获取培训基地培训人次统计图统计数据：年份检索");
        if (!system.isBlank(data.startT)) {
            train.getSRCByTrainplaceAndYear(data.startT);
        }
    },
    getTeacherNumStatistics: function (year) {
        $("#TEACHER_NUM_BOX").showLoading();
        // console.log("培训一张图：获取培训基地教师统计图统计数据");

        var larry = ['验船师', '大学教师'];
        var valueUnit = {1: '验船师', 2: '大学教师'};
        var typeNum = {1: "type1Num", 2: "type2Num"};
        var xarry = [];
        var series = [];
        var param = {};
        if (!system.isBlank(year)) {
            param['year'] = year;
        }
        system.post(get_root + "/ship/bi/getTeacherNumStatistics.action", param, function (data) {
            // console.log(data);

            for (var i in data.result) {
                var domain = data.result[i];
                if (!system.isBlank(domain.trainbase)) {
                    xarry.push(domain.trainbase);
                }
            }

            // console.log("valueUnit.length===" + Object.keys(valueUnit).length);
            for (var j = 1; j < Object.keys(valueUnit).length + 1; j++) {
                var yarry = {};
                yarry['type'] = 'bar';
                yarry['barWidth'] = 20;
                yarry['name'] = valueUnit[j];
                yarry['data'] = [];
                for (var i in data.result) {
                    var domain = data.result[i];
                    if (!system.isBlank(domain.trainbase)) {
                        yarry['data'].push(domain[typeNum[j]]);
                    }
                }
                // console.log(yarry);
                series.push(yarry);
            }
            //=========测试用数据=========
            xarry = ['大连海洋大学', '上海海洋大学', '厦门海洋职业技术学院', '浙江海洋大学'];
            series = [
                {
                    name:'验船师',
                    type:'bar',
                    barWidth:'20',
                    data:[45, 42, 11, 45]
                },
                {
                    name:'大学教师',
                    type:'bar',
                    barWidth:'20',
                    data:[22, 18, 12, 26]
                }
            ];
            //==========================
            train.initHowBarEcharts(['#fed61c', '#00AEFF'], larry, "", xarry, "（人）", series, "TEACHER_NUM_BOX");
        })

    },
    teacherNumFilter: function (data) {
        // console.log("获取培训基地教师统计图统计数据：年份检索");
        if (!system.isBlank(data.startT)) {
            train.getTeacherNumStatistics(data.startT);
        }
    },
    getTrainEvaluateStatistics: function (year, idsString) {
        $("#TRAIN_EVALUATE_BOX").showLoading();
        // console.log("培训一张图：获取培训评价分析图统计数据");

        var param = {};
        if (!system.isBlank(year)) {
            param['year'] = year;
        }
        if (!system.isBlank(idsString)) {
            param['idsString'] = idsString;
        }

        var CTETypenames = {};
        system.post(get_root + "/ship/bi/getCTETypenames.action", param, function (data) {

            for (var i in data.result) {
                var name = data.result[i];
                if (!system.isBlank(name)) {
                    CTETypenames[i] = name;
                }
            }
            // console.log(CTETypenames);
        }, false)

        var larry = [];
        var xarry = [];
        var series = [];
        system.post(get_root + "/ship/bi/getTrainEvaluateStatistics.action", param, function (data) {
            // console.log(data);

            var trainEvaluateIds = [];
            for (var i in data.result) {
                var domain = data.result[i];
                if (!system.isBlank(domain.name)) {
                    trainEvaluateIds.push(domain.id);
                    var do01 = domain.name.substring(0, 7) + "\n";
                    var do02 = domain.name.substring(7, 15) + "\n";
                    var do03 = domain.name.substring(15, domain.name.length);
                    domain.name = do01 + do02 + do03;
                    xarry.push(domain.name);
                }
            }
            // console.log("trainEvaluateIds.toString()===" + trainEvaluateIds.toString());
            $("#trainEvaluateIds").val(trainEvaluateIds.toString());

            // console.log("CTETypenames.length===" + Object.keys(CTETypenames).length);
            for (var j = 0; j < Object.keys(CTETypenames).length; j++) {
                larry.push(CTETypenames[j]);
                var yarry = {};
                yarry['type'] = 'line';
                yarry['symbol'] = 'emptycircle';
                yarry['symbolSize'] = 8;
                yarry['itemStyle'] = {
                    emphasis: {
                        color: '#ffff00',//黄色
                        symbolSize: 28,
                        borderColor: '#f9f900',
                        borderWidth: 4,
                        shadowBlur: 10,
                        shadowColor: '#333'
                    }, normal: {areaStyle: {type: 'default'}}
                };
                yarry['name'] = CTETypenames[j];
                yarry['data'] = [];
                for (var i in data.result) {
                    var domain = data.result[i];
                    if (!system.isBlank(domain.name)) {
                        yarry['data'].push(domain['typename' + j]);
                    }
                }
                // console.log(yarry);
                series.push(yarry);
            }
            // console.log(larry);
            // console.log(xarry);
            // console.log(series);

            train.initHowLineEcharts("分", larry, "", xarry, "（分）", series, "TRAIN_EVALUATE_BOX", true);
        })

    },
    trainEvaluateStatisticsByNamesFilter: function () {
        // console.log("获取培训评价分析图统计数据：培训班名称检索");
        var param = "?appendName=getCTENames&strs=" + $("#trainEvaluateIds").val();
        $("#open-iframe").attr("src", get_root + "/ship/bi/trainPage" + param);
        // $(".modal-title").html("选择需要检索的培训班");
        $(".modal-title").html("培训评价分析图：选择需要展示的培训班");
    },
    getTrainDemandAnalysisStatistics: function () {
        $("#TRAIN_DEMAND_ANALYSIS_BOX").showLoading();
        // console.log("培训一张图：获取培训需求分析图统计数据");

        var larry = ['船体', '机电', '其它'];
        var xarry = [];
        var y1arry = {};
        y1arry['name'] = '船体';
        y1arry['type'] = 'line';
        y1arry['symbol'] = 'emptycircle';
        y1arry['symbolSize'] = 8;
        y1arry['itemStyle'] = {
            normal: {
                color: new echarts.graphic.LinearGradient(0, 0, 0, 1,
                    [
                        {offset: 0, color: '#0193DC'},
                        {offset: 0.8, color: '#082B72'},
                        {offset: 1, color: 'rgba(25,35,89,0.1)'}
                    ]
                ), areaStyle: {type: 'default'}
            },
            emphasis: {
                color: '#ffff00',//黄色
                symbolSize: 28,
                borderColor: '#f9f900',
                borderWidth: 4,
                shadowBlur: 10,
                shadowColor: '#333'
            }
        };
        var y2arry = {};
        y2arry['name'] = '机电';
        y2arry['type'] = 'line';
        y2arry['symbol'] = 'emptycircle';
        y2arry['symbolSize'] = 8;
        y2arry['itemStyle'] = {
            normal: {
                color: new echarts.graphic.LinearGradient(0, 0, 0, 1,
                    [
                        {offset: 0, color: '#02E6ED'},
                        {offset: 0.2, color: 'rgba(2,230,237,0.5)'},
                        {offset: 1, color: 'rgba(2,230,237,0.1)'}
                    ]
                ), areaStyle: {type: 'default'}
            },
            emphasis: {
                color: '#ffff00',//黄色
                symbolSize: 28,
                borderColor: '#f9f900',
                borderWidth: 4,
                shadowBlur: 10,
                shadowColor: '#333'
            }
        };
        var y3arry = {};
        y3arry['name'] = '其它';
        y3arry['type'] = 'line';
        y3arry['symbol'] = 'emptycircle';
        y3arry['symbolSize'] = 8;
        y3arry['itemStyle'] = {
            normal: {
                color: new echarts.graphic.LinearGradient(0, 0, 0, 1,
                    [
                        {offset: 0, color: '#01f79d'},
                        {offset: 0.2, color: 'rgba(1,247,157,0.5)'},
                        {offset: 1, color: 'rgba(1,247,157,0.1)'}
                    ]
                ), areaStyle: {type: 'default'}
            },
            emphasis: {
                color: '#ffff00',//黄色
                symbolSize: 28,
                borderColor: '#f9f900',
                borderWidth: 4,
                shadowBlur: 10,
                shadowColor: '#333'
            }
        };
        var series = [];

        system.post(get_root + "/ship/bi/getTrainDemandAnalysisStatistics.action", {}, function (data) {
            // console.log(data);

            var majortype0 = [];
            var majortype1 = [];
            var majortype2 = [];
            for (var i in data.result) {
                var domain = data.result[i];
                if (!system.isBlank(domain.provname)) {
                    xarry.push(domain.provname);
                    majortype0.push(domain.majortype0);
                    majortype1.push(domain.majortype1);
                    majortype2.push(domain.majortype2);
                }
            }
            y1arry['data'] = majortype0;
            y2arry['data'] = majortype1;
            y3arry['data'] = majortype2;
            series.push(y1arry);
            series.push(y2arry);
            series.push(y3arry);

            train.initHowLineEcharts("人", larry, "", xarry, "（人）", series, "TRAIN_DEMAND_ANALYSIS_BOX", false);
        })

    },
    getSurveyorGapStatistics: function () {
        $("#SURVEYOR_GAP_BOX").showLoading();
        // console.log("培训一张图：获取验船师缺口统计图统计数据");

        var larry = ['船体', '机电', '其它'];
        var valueUnit = {0: '船体', 1: '机电', 2: '其它'};
        var xarry = [];
        var series = [];
        system.post(get_root + "/ship/bi/getSurveyorGapStatistics.action", {}, function (data) {
            // console.log(data);

            for (var i in data.result) {
                var domain = data.result[i];
                if (!system.isBlank(domain.provname)) {
                    xarry.push(domain.provname);
                    // console.log(domain.majortype0);
                    // console.log(domain.majortype1);
                    // console.log(domain.majortype2);
                }
            }

            // console.log("valueUnit.length===" + Object.keys(valueUnit).length);
            for (var j = 0; j < Object.keys(valueUnit).length; j++) {
                var yarry = {};
                yarry['type'] = 'bar';
                yarry['barWidth'] = 20;
                yarry['name'] = valueUnit[j];
                yarry['data'] = [];
                for (var i in data.result) {
                    var domain = data.result[i];
                    // console.log(domain)
                    if (!system.isBlank(domain.provname)) {
                        yarry['data'].push(domain['majortype' + j]);
                    }
                }
                // console.log(yarry);
                series.push(yarry);
            }
            // console.log(xarry);
            // console.log(series);

            train.initHowBarEcharts(['#fed61c', '#00AEFF', '#00699A'], larry, "", xarry, "（人）", series, "SURVEYOR_GAP_BOX");
        })

    },
    getTrainPlanningStatistics: function () {
        $("#TRAIN_PLANNING_BOX").showLoading();
        // console.log("培训一张图：获取培训规划统计图统计数据");

        var larry = ['船体', '机电', '其它'];
        var xarry = [];
        var y1arry = {};
        y1arry['name'] = '船体';
        y1arry['type'] = 'line';
        y1arry['symbol'] = 'emptycircle';
        y1arry['symbolSize'] = 8;
        y1arry['itemStyle'] = {
            normal: {
                color: new echarts.graphic.LinearGradient(0, 0, 0, 1,
                    [
                        {offset: 0, color: '#0193DC'},
                        {offset: 0.8, color: '#082B72'},
                        {offset: 1, color: 'rgba(25,35,89,0.1)'}
                    ]
                ), areaStyle: {type: 'default'}
            },
            emphasis: {
                color: '#ffff00',//黄色
                symbolSize: 28,
                borderColor: '#f9f900',
                borderWidth: 4,
                shadowBlur: 10,
                shadowColor: '#333'
            }
        };
        var y2arry = {};
        y2arry['name'] = '机电';
        y2arry['type'] = 'line';
        y2arry['symbol'] = 'emptycircle';
        y2arry['symbolSize'] = 8;
        y2arry['itemStyle'] = {
            normal: {
                color: new echarts.graphic.LinearGradient(0, 0, 0, 1,
                    [
                        {offset: 0, color: '#02E6ED'},
                        {offset: 0.2, color: 'rgba(2,230,237,0.5)'},
                        {offset: 1, color: 'rgba(2,230,237,0.1)'}
                    ]
                ), areaStyle: {type: 'default'}
            },
            emphasis: {
                color: '#ffff00',//黄色
                symbolSize: 28,
                borderColor: '#f9f900',
                borderWidth: 4,
                shadowBlur: 10,
                shadowColor: '#333'
            }
        };
        var y3arry = {};
        y3arry['name'] = '其它';
        y3arry['type'] = 'line';
        y3arry['symbol'] = 'emptycircle';
        y3arry['symbolSize'] = 8;
        y3arry['itemStyle'] = {
            normal: {
                color: new echarts.graphic.LinearGradient(0, 0, 0, 1,
                    [
                        {offset: 0, color: '#01f79d'},
                        {offset: 0.2, color: 'rgba(1,247,157,0.5'},
                        {offset: 1, color: 'rgba(1,247,157,0.1)'}
                    ]
                ), areaStyle: {type: 'default'}
            },
            emphasis: {
                color: '#ffff00',//黄色
                symbolSize: 28,
                borderColor: '#f9f900',
                borderWidth: 4,
                shadowBlur: 10,
                shadowColor: '#333'
            }
        };
        var series = [];

        system.post(get_root + "/ship/bi/getTrainPlanningStatistics.action", {}, function (data) {
            // console.log(data);

            var majortype0 = [];
            var majortype1 = [];
            var majortype2 = [];
            for (var i in data.result) {
                var domain = data.result[i];
                if (!system.isBlank(domain.year)) {
                    xarry.push(domain.year);
                    majortype0.push(domain.majortype0);
                    majortype1.push(domain.majortype1);
                    majortype2.push(domain.majortype2);
                }
            }
            y1arry['data'] = majortype0;
            y2arry['data'] = majortype1;
            y3arry['data'] = majortype2;
            series.push(y1arry);
            series.push(y2arry);
            series.push(y3arry);

            train.initHowLineEcharts("人", larry, "", xarry, "（人）", series, "TRAIN_PLANNING_BOX", false);
        })

    },
    dataTo0Onclick: function () {
        // console.log("培训一张图：data-to:0");
        //加载时间插件

        train.getCoreNum();
        setTimeout(train.getTrainingNumStatistics(), 100);
        setTimeout(train.getTrainRateStatistics(), 200);
    },
    dataTo1Onclick: function () {
        // console.log("培训一张图：data-to:1");
        // 加载时间插件，已取消

        train.getPercentStatistics();
        setTimeout(train.getTrainingNumStatisticsByYear(), 100);
    },
    dataTo2Onclick: function () {
        // console.log("培训一张图：data-to:2");
        //加载时间插件


        train.getSRCByTrainplaceAndYear();
        setTimeout(train.getTeacherNumStatistics(), 100);
        setTimeout(train.getSurveyorGapStatistics(), 200);
    },
    dataTo3Onclick: function () {
        // console.log("培训一张图：data-to:3");
        train.getTrainEvaluateStatistics();
        setTimeout(train.getTrainPlanningStatistics(), 100);
        setTimeout(train.getTrainDemandAnalysisStatistics(), 200);
    }
}