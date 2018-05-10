$(function(){
    //页面基本信息
    checkManage.initCheckManage();
    //option content
    var selectData =[{key:"24_1",value:"国内海洋渔船"},{key:"24_2",value:"远洋渔船"},{key:"24_3",value:"内河渔船"}];
    $("#time-checkManage-1-1").initDateFilter(checkManage.showTotalShipInfos);
    $("#time-checkManage-1-2").initDateFilter(checkManage.shipCheckWorks);
    $("#time-checkManage-2-1").initDateFilterSingle(checkManage.newShipChecks);
    $("#time-checkManage-2-2").initDateFilterLi(function(data){
        checkManage.shipYearsOld(data.value);
    },selectData);
    $("#time-checkManage-3-2").initDateFilter(checkManage.oceanShipFirPassRate);
    $("#time-checkManage-3-3").initDateFilterSingle(checkManage.oceanEntFirPassRate);
    $("#time-checkManage-4-1").initDateFilterSingle(checkManage.oceanShipSecurityScore);
    $("#time-checkManage-4-2").initDateFilterSingle(checkManage.oceanShipSecurityScoreDes);
    $("#time-checkManage-4-3").initDateFilterSingle(checkManage.showShipNumbers);
    
    $('#dowebok').fullpage({
        navigation: true,
        afterRender : function(){
            //控制iframe高度
            $('#nav_iframe', window.parent.document).css({
                minHeight : 650
            });
            //渔船拥有量分析图
            checkManage.showTotalShipInfos();
            //渔船检验工作量分析图
            checkManage.shipCheckWorks();
        },
        afterLoad : function(anchorLink, index){
            //index ： 当前跳转的页面
            if(index==2){
                //新建渔船检验工作量分析
                checkManage.newShipChecks();
                //渔船船龄统计分析
                checkManage.shipYearsOld("24_1");
            }else if(index==3){
                //渔船检验工作完成率
                checkManage.shipCheckWorkRate();

                //远洋渔船一次检验合格率分析
                checkManage.oceanShipFirPassRate();

                // 远洋渔船企业一次检验合格率分析
                checkManage.oceanEntFirPassRate();

            }else if(index==4){
                //远洋渔船综合安全系数分析图
                checkManage.oceanShipSecurityScore();
                //远洋渔船综合安全指数高位分布
                checkManage.oceanShipSecurityScoreDes();
                checkManage.showShipNumbers();

            }else if(index == 1){
                //渔船拥有量分析图
                checkManage.showTotalShipInfos();

                //渔船检验工作量分析图
                checkManage.shipCheckWorks();

            }else if(index == 1){
                //渔船拥有量分析图
                checkManage.showTotalShipInfos();
                
                //渔船检验工作量分析图
                checkManage.shipCheckWorks();
               
            }
            scrollTo(0,0);
        }
    });
})
var checkManage={
    /**
     * 初始页面基本信息
     */
    initCheckManage:function(){
        $.ajax({
            url: get_root + '/ship/bi/getCheckManageInfo',
            type: 'post',
            // data: {pid: entPid},
            datatype: 'json',
            success: function (data) {
                var obj = JSON.parse(data).result;
                $("#checkShips").text( system.toThousands(obj.checkShips) );
                $("#checkShipsText").text(obj.year+"年渔船检验量");
                $("#buildShips").text(system.toThousands(obj.buildShips));
                $("#buildShipsText").text(obj.year+"年新建渔船数量");
                $("#checkWorkRate").text(system.toThousands(obj.checkWorkRate));
                $("#checkWorkRateText").text(obj.year+"年受检率");
                // $("#yyShipFirtPassRate").text(obj.yyShipFirtPassRate);//todo:暂无数据
                $("#yyShipFirtPassRate").text(95);
            }
        });
    },

    /**
     * 渔船拥有量分析图
     */
    showTotalShipInfos:function(tdata){
        var bYear = '';
        var eYear = '';
        if (tdata) {
            bYear = tdata.startT;
            eYear = tdata.endT;
            if( eYear-bYear>5){
                alert("时间范围请选择5年之内");
                return;
            }
        }
        $("#checkManage-1-1-1").showLoading();
        $("#checkManage-1-1-2").showLoading();
        $("#checkManage-1-1-3").showLoading();
        $.ajax({
            url: get_root + '/ship/bi/getShipInfos',
            type: 'post',
            data: {bYear:bYear,eYear:eYear},
            datatype: 'json',
            success: function (data) {
                var obj = JSON.parse(data).result;

                var timeList = obj.timeList;
                var totalShips = obj.totalShips;
                var totalTonnages = obj.totalTonnages;
                var totalPowers = obj.totalPowers;

                $("#checkManage-1-1-1").initBIOption({
                    yAxis: {name: "艘"},
                    xAxis:{data:timeList},
                    grid:{
                        top:'15%',
                        left: '3%',
                        right: '8%',
                        bottom: '3%',
                        containLabel: true
                    },
                    series : [
                        {
                            name:"渔船总数",
                            data:totalShips
                        }
                    ]
                },20,{click:".nav li"});
                $("#checkManage-1-1-2").initBIOption({
                    yAxis: {name: "吨"},
                    xAxis:{data:timeList},
                    grid:{
                        top:'15%',
                        left: '3%',
                        right: '8%',
                        bottom: '3%',
                        containLabel: true
                    },
                    series : [
                        {
                            name:"总吨位",
                            data:totalTonnages
                        }
                    ]
                },20,{click:".nav li"});
                $("#checkManage-1-1-3").initBIOption({
                    yAxis: {name: "kw"},
                    xAxis:{data:timeList},
                    grid:{
                        top:'15%',
                        left: '3%',
                        right: '8%',
                        bottom: '3%',
                        containLabel: true
                    },
                    series : [
                        {
                            name:"总功率",
                            data:totalPowers
                        }
                    ]
                },20,{click:".nav li"});

            }
        })
    },

    /**
     * 渔船检验工作量分析图
     * @param tdata
     */
    shipCheckWorks:function(tdata){
        var bYear = '';
        var eYear = '';
        if (tdata) {
            bYear = tdata.startT;
            eYear = tdata.endT;
        }
        $("#checkManage-1-2-1").showLoading();
        $("#checkManage-1-2-2").showLoading();
        $("#checkManage-1-2-3").showLoading();
        $.ajax({
            url: get_root + '/ship/bi/shipCheckWorks',
            type: 'post',
            data: {bYear:bYear,eYear:eYear},
            dataType: 'json',
            success: function (data) {
                var obj = data.result;
                var timeList = obj.timeList;
                var totalShips = obj.totalShips;
                var totalTonnages = obj.totalTonnages;
                var totalPowers = obj.totalPowers;

                $("#checkManage-1-2-1").initBIOption({
                    yAxis: {name: "艘"},
                    xAxis:{data:timeList},
                    grid:{
                        top:'15%',
                        left: '3%',
                        right: '8%',
                        bottom: '3%',
                        containLabel: true
                    },
                    series : [
                        {
                            name:"渔船总数",
                            data:totalShips
                        }
                    ]
                },20,{click:".nav li"});
                $("#checkManage-1-2-2").initBIOption({
                    yAxis: {name: "吨"},
                    xAxis:{data:timeList},
                    grid:{
                        top:'15%',
                        left: '3%',
                        right: '8%',
                        bottom: '3%',
                        containLabel: true
                    },
                    series : [
                        {
                            name:"渔船总吨位",
                            data:totalTonnages
                        }
                    ]
                },20,{click:".nav li"});
                $("#checkManage-1-2-3").initBIOption({
                    yAxis: {name: "kw"},
                    xAxis:{data:timeList},
                    grid:{
                        top:'15%',
                        left: '3%',
                        right: '8%',
                        bottom: '3%',
                        containLabel: true
                    },
                    series : [
                        {
                            name:"渔船总功率",
                            data:totalPowers
                        }
                    ]
                },20,{click:".nav li"});
            }
        })
    },

    /**
     * 新建渔船检验工作量分析
     * @param tdata
     * TODO：无数据
     */
    newShipChecks:function (tdata){
        var bYear = '';
        if (tdata) {
            bYear = tdata.startT;
        }
        $("#checkManage-2-1").showLoading();
        $.ajax({
            url: get_root + '/ship/bi/getNewShipChecks',
            type: 'post',
            data: {year:bYear},
            dataType: 'json',
            success: function (data) {
                var obj = data.result;
                var oceanShips = obj.oceanShips;
                var domesticOceanShips = obj.domesticOceanShips;
                var inlandRiverShips = obj.inlandRiverShips;
                var oceanData = [0,0,0,0];
                var domesticOceanData = [0,0,0,0];
                var inlandRiverData  = [0,0,0,0];

                var xData = ['玻璃钢质','钢质','木质','其他'];
                for (var i in oceanShips) {
                    var oceanShip =oceanShips[i];
                    for (var j in xData){
                        if (oceanShip["meterial"]==xData[j]) {
                            oceanData[j] = oceanShip["nums"];
                        }
                    }
                }

                for (var i in domesticOceanShips) {
                    var domesticOceanShip =domesticOceanShips[i];
                    for (var j in xData){
                        if (domesticOceanShip["meterial"]==xData[j]) {
                            domesticOceanData[j] = domesticOceanShip["nums"];
                        }
                    }
                }

                for (var i in inlandRiverShips) {
                    var inlandRiverShip =inlandRiverShips[i];
                    for (var j in xData){
                        if (inlandRiverShip["meterial"]==xData[j]) {
                            inlandRiverData[j] = inlandRiverShip["nums"];
                        }
                    }
                }
                $("#checkManage-2-1").initBIOption({
                    legend: {
                        data:['远洋渔船','国内海洋渔船','内河渔船'],
                    },
                    yAxis: {
                        name: "艘",
                        minInterval:1
                    },
                    xAxis:{data:xData},
                    series:[
                        {
                            name:'远洋渔船',
                            type:'bar',
                            data:oceanData
                        },
                        {
                            name:'国内海洋渔船',
                            type:'bar',
                            data:domesticOceanData
                        },
                        {
                            name:'内河渔船',
                            type:'bar',
                            data:inlandRiverData
                        }
                    ]
                } ,11,{})

                //======测试用数据 ==========
                // if(curr_org == '中华人民共和国浙江渔业船舶检验局'){
                //     //浙江省
                //     $("#checkManage-2-1").initBIOption({
                //         legend: {
                //             data:['远洋渔船','国内海洋渔船','内河渔船'],
                //         },
                //         yAxis: {
                //             name: "艘",
                //             minInterval:1
                //         },
                //         xAxis:{data:xData},
                //         series:[
                //             {
                //                 name:'远洋渔船',
                //                 type:'bar',
                //                 data:[38,0,2,0]
                //             },
                //             {
                //                 name:'国内海洋渔船',
                //                 type:'bar',
                //                 data:[261,105,77,1]
                //             },
                //             {
                //                 name:'内河渔船',
                //                 type:'bar',
                //                 data:[1247,431,98,49]
                //             }
                //         ]
                //     } ,11,{})
                // }else if(curr_org == '农业部渔业船舶检验局'){
                //     //全国
                //     $("#checkManage-2-1").initBIOption({
                //         legend: {
                //             data:['远洋渔船','国内海洋渔船','内河渔船'],
                //         },
                //         yAxis: {
                //             name: "艘",
                //             minInterval:1
                //         },
                //         xAxis:{data:xData},
                //         series:[
                //             {
                //                 name:'远洋渔船',
                //                 type:'bar',
                //                 data:[218,0,2,0]
                //             },
                //             {
                //                 name:'国内海洋渔船',
                //                 type:'bar',
                //                 data:[2185,995,839,3]
                //             },
                //             {
                //                 name:'内河渔船',
                //                 type:'bar',
                //                 data:[9044,4399,962,528]
                //             }
                //         ]
                //     } ,11,{})
                // }
                //==============
            }
        })
    },

    /**
     * 渔船船龄统计分析
     * TODO：数据传递问题
     */
    shipYearsOld:function (type) {
        $("#checkManage-2-2").showLoading();
        // console.log(type);
        $.ajax({
            url: get_root + '/ship/bi/getShipYearsOld',
            type: 'post',
            data: {jobArea:type},
            dataType: 'json',
            success: function (data) {
                var obj = data.result;
                // console.log(obj);
                var xData = [];
                var yData = [];
                for(var i in obj){
                    if(obj[i].age == '1'){
                        obj[i].age = "10年以下"
                    }else if(obj[i].age == '2'){
                        obj[i].age = '10-15年'
                    }else if(obj[i].age == '3'){
                        obj[i].age = '16-20年'
                    }else if(obj[i].age == '4'){
                        obj[i].age = '21-25年'
                    }else if(obj[i].age == '5'){
                        obj[i].age = '26-30年'
                    }else if(obj[i].age == '6'){
                        obj[i].age = '30年以上'
                    }
                    xData.push(obj[i].age);
                    yData.push(obj[i].num);
                }
                $("#checkManage-2-2").initBIOption({
                    xAxis :{ name:"船龄",data :xData} ,
                    yAxis :{ name:"（艘）"},
                    series : [{
                        name:'渔船数量', //名称
                        data:yData
                    }
                    ]
                } ,20,{})
            }
        })
    },
    /**
     * 远洋渔船一次检验合格率分析
     * @param tdata
     * todo：数据不全，未默认展示5年数据
     */
    oceanShipFirPassRate:function(tdata){
        var bYear = '';
        var eYear = '';
        if (tdata) {
            bYear = tdata.startT;
            eYear = tdata.endT;
        }
        $("#checkManage-3-2").showLoading();
        $("#checkManage-3-22").showLoading();
        $.ajax({
            url: get_root + '/ship/bi/getOceanShipFirPassRate',
            type: 'post',
            data: {bYear:bYear,eYear:eYear},
            dataType: 'json',
            success: function (data) {
                var obj = data.result;
                var xdata = obj.xdata;
                var ydata = obj.ydata;
                var domesticXData=obj.domesticXData;
                var domesticYdata=obj.domesticYdata;
                // console.log(obj);
                $("#checkManage-3-2").initBIOption({
                    yAxis: {name: "%"},
                    xAxis:{data:xdata},
                    grid:{
                        top:'12%',
                        left: '3%',
                        right: '8%',
                        bottom: '3%',
                        containLabel: true
                    },
                    tooltip : {
                        formatter:function(a) {
                            var relVal = '';
                            for(var i in a){
                                if(i<2){
                                    var domain=a[i]  ;
                                    relVal +=domain.seriesName+ '&nbsp;:&nbsp;<span style="color:#FAFB02">'+domain.value+'%'+'</span><br/>';
                                }
                            }
                            return relVal;
                        }
                    },
                    series : [
                        {
                            name:"合格率",
                            data:ydata
                        }
                    ]
                },20,{click:".nav li"});

                //国内
                //TODO
                // 数据在写，参考检验工作量分析
                $("#checkManage-3-22").initBIOption({
                    yAxis: {name: "%"},
                    xAxis:{data:domesticXData},
                    grid:{
                        top:'12%',
                        left: '3%',
                        right: '8%',
                        bottom: '3%',
                        containLabel: true
                    },
                    tooltip : {
                        formatter:function(a) {
                            var relVal = '';
                            for(var i in a){
                                if(i<2){
                                    var domain=a[i]  ;
                                    relVal +=domain.seriesName+ '&nbsp;:&nbsp;<span style="color:#FAFB02">'+domain.value+'%'+'</span><br/>';
                                }
                            }
                            return relVal;
                        }
                    },
                    series : [
                        {
                            name:"合格率",
                            data:domesticYdata
                        }
                    ]
                },20,{click:".nav li"})

            }
        })
    },


    /**
     * 渔船企业一次检验合格率分析
     * @param tdata
     * todo:没有数据
     */
    oceanEntFirPassRate:function(tdata){
        var bYear = '';
        if (tdata) {
            bYear = tdata.startT;
        }
        $("#checkManage-3-3").showLoading();
        $("#checkManage-3-33").showLoading();

        //测试数据

        // if(curr_org == '中华人民共和国浙江渔业船舶检验局'){
        //     //浙江省
        //     $("#checkManage-3-3").initBIOption({
        //             yAxis: {name: "%"},
        //             tooltip : {
        //                 formatter:function(a) {
        //                     var relVal = '';
        //                     for(var i in a){
        //                         if(i<2){
        //                             var domain=a[i]  ;
        //                             relVal +=domain.value;
        //                         }
        //                     }
        //                     return relVal;
        //                 }
        //             },
        //             xAxis:{
        //                 data:['扬帆集团', '浙江凯灵', '舟山增洲', '浙江正和', '舟山和泰', '舟山海天', '浙江东鹏', '浙江恒宇', '岱山南峰', '浙江神洲', '宁波振鹤', '宁波博大', '宁波建业', '奉化新联', '象山蒲港'],
        //                 name:"企业"},
        //             series:[{
        //                 data: [93,91,92,95,97,98,99,90,96,97,91,91,95,92,95]
        //             }] }
        //         ,20,{});
        //     //远洋
        //     $("#checkManage-3-33").initBIOption({
        //             yAxis: {name: "%"},
        //             xAxis:{
        //                 data:['扬帆集团', '浙江东鹏', '浙江恒宇', '岱山南峰', '浙江神洲', '宁波振鹤', '宁波博大', '宁波建业', '奉化新联', '象山蒲港'],
        //                 name:"企业"},
        //             tooltip : {
        //                 formatter:function(a) {
        //                     var relVal = '';
        //                     for(var i in a){
        //                         if(i<2){
        //                             var domain=a[i]  ;
        //                             relVal +=domain.value;
        //                         }
        //                     }
        //                     return relVal;
        //                 }
        //             },
        //             series:[{
        //                 data: [91,90,92,95,94,98,93,96,94,92]
        //             }] }
        //         ,20,{});
        // }else if(curr_org == '农业部渔业船舶检验局'){
        //     //全国的
        //     $("#checkManage-3-3").initBIOption({
        //             yAxis: {name: "%"},
        //             xAxis:{
        //                 data:['南京高精', '启东新洲', '天津新港', '东台新曹', '石狮天发', '龙岩东宝', '东莞华顺', '黄埔文冲', '台州正文', '江苏源友', '辽宁金轮', '大连孟鑫', '兴化大营', '东台龙达', '大丰三兴'],
        //                 name:"企业"},
        //             tooltip : {
        //                 formatter:function(a) {
        //                     var relVal = '';
        //                     for(var i in a){
        //                         if(i<2){
        //                             var domain=a[i]  ;
        //                             relVal +=domain.value;
        //                         }
        //                     }
        //                     return relVal;
        //                 }
        //             },
        //             series:[{
        //                 data: [91,91,92,95,94,98,90,90,96,93,91,91,94,92,92]
        //             }] }
        //         ,20,{});
        //     //远洋
        //     $("#checkManage-3-33").initBIOption({
        //             yAxis: {name: "%"},
        //             xAxis:{
        //                 data:['中船重工', '广船国际', '天津新港', '大连重工', '石狮天发', '龙岩东宝', '东莞华顺', '黄埔文冲', '东台龙达', '大丰三兴'],
        //                 name:"企业"},
        //             series:[{
        //                 data: [91,91,92,95,94,98,93,91,94,92]
        //             }] ,
        //             tooltip : {
        //                 formatter:function(a) {
        //                     var relVal = '';
        //                     for(var i in a){
        //                         if(i<2){
        //                             var domain=a[i]  ;
        //                             relVal +=domain.value;
        //                         }
        //                     }
        //                     return relVal;
        //                 }
        //             }}
        //
        //         ,20,{});
        // }
        $.ajax({
            url: get_root + '/ship/bi/getOceanEntFirPassRate',
            type: 'post',
            data: {year:bYear},
            dataType: 'json',
            success: function (data) {
                var obj = data.result;
                //var xdata = obj.xdata;
                var xdata = ["广东兴海麒麟远洋渔业有限公司","广东协盛远洋渔业有限公司","广东广远渔业集团有限公司","广州远洋渔业公司","深圳市联成远洋渔业有限公司"];
                //var ydata = obj.ydata;
                var  ydata = ["83","85","80","95","81","90"];
                var domesticXData = ["青岛长海远洋渔业有限公司","青岛凯航水产有限公司","青岛巨容远洋渔业有限公司","青岛荣昌远洋渔业有限公司","日照市景昌渔业有限公司"];
                var domesticYdata = ["90","83","82","90","92","85"]
                //var domesticXData=obj.domesticXData;
                //var domesticYdata=obj.domesticYdata;

                console.log(obj);
                $("#checkManage-3-3").initBIOption({
                    yAxis: {name: "%"},
                    xAxis:{
                        data:xdata,
                        name:"企业",
                        axisLabel: {
                            interval: 0,//横轴信息全部显示
                            // rotate:-30,//-30度角倾斜显示
                            formatter:function(value,index)
                            {
                                var ret = "";
                                var maxLength = 4;
                                var valLength = value.length;
                                var rowN = Math.ceil(valLength / maxLength);
                                if (rowN > 1){
                                    for (var i = 0; i < rowN; i++) {
                                        var temp = "";
                                        var start = i * maxLength;
                                        var end = start + maxLength;
                                        temp = value.substring(start, end) + "\n";
                                        ret += temp; //凭借最终的字符串
                                    }
                                    return ret;
                                }else {
                                    return value;
                                }
                            }
                        }
                    },
                    grid:{
                        top:'12%',
                        left: '3%',
                        right: '8%',
                        bottom: '3%',
                        containLabel: true
                    },
                    tooltip : {
                        formatter:function(a) {
                            var relVal = '';
                            for(var i in a){
                                if(i<2){
                                    var domain=a[i]  ;
                                    relVal +=domain.seriesName+ '&nbsp;:&nbsp;<span style="color:#FAFB02">'+domain.value+'%'+'</span><br/>';
                                }
                            }
                            return relVal;
                        }
                    },
                    series : [
                        {
                            name:"合格率",
                            data:ydata
                        }
                    ]
                },20,{click:".nav li"});

                //国内
                $("#checkManage-3-33").initBIOption({
                    yAxis: {name: "%"},
                    xAxis:{
                        data:domesticXData,
                        name:"企业",
                        axisLabel: {
                            interval: 0,//横轴信息全部显示
                            // rotate:-30,//-30度角倾斜显示
                            formatter:function(value,index)
                            {
                                var ret = "";
                                var maxLength = 4;
                                var valLength = value.length;
                                var rowN = Math.ceil(valLength / maxLength);
                                if (rowN > 1){
                                    for (var i = 0; i < rowN; i++) {
                                        var temp = "";
                                        var start = i * maxLength;
                                        var end = start + maxLength;
                                        temp = value.substring(start, end) + "\n";
                                        ret += temp; //凭借最终的字符串
                                    }
                                    return ret;
                                }else {
                                    return value;
                                }
                            }
                        }
                    },
                    grid:{
                        top:'12%',
                        left: '3%',
                        right: '8%',
                        bottom: '3%',
                        containLabel: true
                    },
                    tooltip : {
                        formatter:function(a) {
                            var relVal = '';
                            for(var i in a){
                                if(i<2){
                                    var domain=a[i]  ;
                                    relVal +=domain.seriesName+ '&nbsp;:&nbsp;<span style="color:#FAFB02">'+domain.value+'%'+'</span><br/>';
                                }
                            }
                            return relVal;
                        }
                    },
                    series : [
                        {
                            name:"合格率",
                            data:domesticYdata
                        }
                    ]
                },20,{click:".nav li"});

            }
        })
    },

    /**
     * 渔船检验工作完成率
     * @param tdata
     */
    shipCheckWorkRate:function(){

        //$("#checkManage-3-1").showLoading();

        $.ajax({
            url: get_root + '/ship/bi/getshipCheckWorkRate',
            type: 'post',
            datatype: 'json',
            success: function (data) {
                var obj = JSON.parse(data).result;
                console.log(obj);
                var myChart = echarts.init(document.getElementById("checkManage-3-1"));
                var option = {
                    tooltip: {
                        formatter:  "{b}:<span style='color:#FAFB02'>{c}%</span>"
                    },
                    toolbox: {
                        // feature: {
                        //     restore: {},
                        //     saveAsImage: {}
                        // }
                    },
                    series: [
                        {
                            name: '工作量',
                            type: 'gauge',
                            radius: '95%',
                            center: ['50%', '55%'],    // 默认全局居中
                            data: [{value: obj, name: '检验完成率'}],
                            axisLine: {            // 坐标轴线
                                lineStyle: {       // 属性lineStyle控制线条样式
                                    color: [[0.2, '#ff4500'], [0.8, '#1e90ff'], [1, 'lime']],
                                    width: 10
                                }
                            },

                            title: {
                                show: false,
                                textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
                                    fontWeight: 'bolder',
                                    fontSize: 10,
                                    color: '#fff',
                                    shadowColor: '#fff', //默认透明
                                    shadowBlur: 10
                                }
                            },
                            splitLine: {           // 分隔线
                                length: 15},
                            detail: {
                                formatter: '{value}%',
                                offsetCenter: [0, '60%'],       // x, y，单位px
                                textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
                                    fontWeight: 'bolder',
                                    fontSize:20
                                }
                            },
                        }
                    ]
                };
                myChart.setOption(option, true);
            }
        })
    },

    /**
     * 渔船综合安全系数分析图
     * @param tdata
     * TODO:无数据
     */
    oceanShipSecurityScore:function(tdata){
        var bYear = '';
        if (tdata) {
            bYear = tdata.startT;
        }
        $("#checkManage-4-1").showLoading();
        $("#checkManage-4-11").showLoading();
        $.ajax({
            url: get_root + '/ship/bi/getOceanShipSecurityScore',
            type: 'post',
            data: {year:bYear},
            datatype: 'json',
            success: function (data) {
                var legendData=["渔船安全技术低","渔船安全技术中","渔船安全技术高"];
                var seriesData=[];
                // var domesticLegendData=[];
                var domesticSeriesData=[];

                var obj= JSON.parse(data).result;
                // console.log(obj);
                seriesData=obj.oceanDate;
                domesticSeriesData=obj.domesticDate;
                //暂时屏蔽
                // for (var i in seriesData) {
                //     legendData[i]=seriesData[i]["name"];
                // }
                //
                // for(var i in domesticSeriesData){
                //     domesticLegendData[i]=domesticSeriesData[i]["name"];
                // }

                $("#checkManage-4-1").initBIOption({
                    color: ['#ED3F49','#00AEFF','#00699A','#405272'],
                    legend: {
                        data: legendData
                    },
                    series: [{
                        itemStyle: {normal: {label: {formatter: '{c}艘\n({d}%)'}}},
                        data: [{name:"渔船安全技术中",value:896},{name:"渔船安全技术高",value:2236},{name:"渔船安全技术低",value:212}]
                        // data:seriesData
                    }]
                }, 30, {});
                //国内
                $("#checkManage-4-11").initBIOption({
                    color: ['#ED3F49','#00AEFF','#00699A','#405272'],
                    legend: {
                        data: legendData
                    },
                    series: [{
                        itemStyle: {normal: {label: {formatter: '{c}艘\n({d}%)'}}},
                        data: [{name:"渔船安全技术中",value:82341},{name:"渔船安全技术高",value:116743},{name:"渔船安全技术低",value:341}]
                        // data: domesticSeriesData
                    }]
                },30,{});
            }
        })
    },

    /**
     * 远洋渔船综合安全指数高位分布
     * @param tdata
     * TODO：数据取前三
     */
    oceanShipSecurityScoreDes:function(tdata){
        var year = '';
        if (tdata) {
            year = tdata.startT;
        }
//暂时屏蔽
        $("#checkManage-4-2").showLoading();
        $("#checkManage-4-22").showLoading();
        $.ajax({
            url: get_root + '/ship/bi/getOceanShipSecurityScoreDes',
            type: 'post',
            data: {year:year},
            datatype: 'json',
            success: function (data) {
                var seriesData = [];
                var xData = []
                var domesticSeriesData=[];
                var domesticXdate=[];

                var obj= JSON.parse(data).result;
                var oceanDate=obj.oceanDate;
                var domesticDate=obj.domesticDate;

                for (var i in oceanDate) {
                    if (i==5) {//只显示排名前5的省份数据
                        break;
                    }
                    xData[i] = oceanDate[i]["entname"];
                    seriesData[i] = oceanDate[i]["score"];
                }

                for (var i in domesticDate) {
                    if (i==5) {//只显示排名前5的省份数据
                        break;
                    }
                    domesticXdate[i] = domesticDate[i]["entname"];
                    domesticSeriesData[i] = domesticDate[i]["score"];
                }

                $("#checkManage-4-2").initBIOption({yAxis: {name: "分"},
                        xAxis:{data:xData,name:"企业"},grid:{right: '9%'},series:[{data:seriesData}] }
                    ,10,{});
                //国内
                $("#checkManage-4-22").initBIOption({yAxis: {name: "分"},
                        xAxis:{data:domesticXdate,name:"企业"},grid:{right: '9%'},series:[{data:domesticSeriesData}] }
                    ,10,{});
            }
        })
                //  $("#checkManage-4-2").initBIOption({yAxis: {name: "分"},
                //         xAxis:{
                //             axisLabel: {
                //                 interval: 0,//横轴信息全部显示
                //                 // rotate:-30,//-30度角倾斜显示
                //                 formatter:function(value,index)
                //                 {
                //                     var ret = "";//拼接加\n返回的类目项
                //                     var maxLength = 4;//每项显示文字个数
                //                     var valLength = value.length;//X轴类目项的文字个数
                //                     var rowN = Math.ceil(valLength / maxLength); //类目项需要换行的行数
                //                     if (rowN > 1)//如果类目项的文字大于3,
                //                     {
                //                         for (var i = 0; i < rowN; i++) {
                //                             var temp = "";//每次截取的字符串
                //                             var start = i * maxLength;//开始截取的位置
                //                             var end = start + maxLength;//结束截取的位置
                //                             //这里也可以加一个是否是最后一行的判断，但是不加也没有影响，那就不加吧
                //                             temp = value.substring(start, end) + "\n";
                //                             ret += temp; //凭借最终的字符串
                //                         }
                //                         return ret;
                //                     }
                //                     else {
                //                         return value;
                //                     }
                //                 }
                //             },
                //      data:["宏东远洋渔业有限公司","平太荣远洋渔业集团有限公司","靖海集团有限公司","深蓝远洋渔业有限公司"],name:"企业"},
                //
                //         series:[{data:["96","94","92","90"]}] }
                //         // xAxis:{data:xData,name:"企业"},series:[{data:seriesData}] }
                //     ,10,{});
                // //国内
                // $("#checkManage-4-22").initBIOption({yAxis: {name: "分"},
                //         xAxis:{
                //             axisLabel: {
                //                 interval: 0,//横轴信息全部显示
                //                 // rotate:-30,//-30度角倾斜显示
                //                 formatter:function(value,index)
                //                 {
                //                     var ret = "";//拼接加\n返回的类目项
                //                     var maxLength = 4;//每项显示文字个数
                //                     var valLength = value.length;//X轴类目项的文字个数
                //                     var rowN = Math.ceil(valLength / maxLength); //类目项需要换行的行数
                //                     if (rowN > 1)//如果类目项的文字大于3,
                //                     {
                //                         for (var i = 0; i < rowN; i++) {
                //                             var temp = "";//每次截取的字符串
                //                             var start = i * maxLength;//开始截取的位置
                //                             var end = start + maxLength;//结束截取的位置
                //                             //这里也可以加一个是否是最后一行的判断，但是不加也没有影响，那就不加吧
                //                             temp = value.substring(start, end) + "\n";
                //                             ret += temp; //凭借最终的字符串
                //                         }
                //                         return ret;
                //                     }
                //                     else {
                //                         return value;
                //                     }
                //                 }
                //             },
                //     data:["靖海集团有限公司","宏远洋渔业有限公司","深蓝远洋渔业有限公司","平太荣远洋渔业集团有限公司"],name:"企业"},
                //         series:[{data:["97","93","87","85"]}] }
                //         // xAxis:{data:domesticXdate,name:"企业"},series:[{data:domesticSeriesData}] }
                //     ,10,{});
    },


    /**
     * 渔业船舶拥有量分析图
     * @param tdata
     */
    showShipNumbers:function (tdata){
        var bYear = '';
        if (tdata) {
            bYear = tdata.startT;
        }
        $("#checkManage-4-3").showLoading();
        $.ajax({
            url: get_root + '/ship/bi/getShipNumsGroups',
            type: 'post',
            data: {year:bYear},
            dataype: 'json',
            success: function (data) {
                var obj = JSON.parse(data).result;
                console.log(obj);
                var xData = [];
                var legendData=[];
                var serizeData1 = [0,0,0];
                var serizeData2 = [0,0,0];
                var serizeData3 = [0,0,0];

                for(var i = 0;i<obj.length;i++){
                    xData.push(obj[i].jobArea);
                    legendData.push(obj[i].length);
                }
                $.unique(xData);
                for (var i in xData) {
                    var idata = xData[i];
                    for(var k in obj){
                        var kdata = obj[k];
                        if (kdata.jobArea ==idata) {
                            if (kdata["length"] =="L<12米") {
                                serizeData1[i] = kdata.nums;
                            }else if(kdata["length"] =="12米≤L<24米"){
                                serizeData2[i] = kdata.nums;
                            }else if(kdata["length"] =="L≥24米"){
                                serizeData3[i] = kdata.nums;
                            }
                        }
                    }
                }
                console.log(serizeData1)
                $("#checkManage-4-3").initBIOption({
                    legend: {
                        data:legendData,
                    },
                    yAxis: {name: "艘"},
                    xAxis:{data:xData},
                    series:[
                        {
                            name:'L<12米',
                            type:'bar',
                            data:serizeData1
                        },
                        {
                            name:'12米≤L<24米',
                            type:'bar',
                            data:serizeData2
                        },
                        {
                            name:'L≥24米',
                            type:'bar',
                            data:serizeData3
                        }
                    ]
                } ,11,{})
            }
        })
    }
}