//2017.8.23  by mengnalisha
$(document).ready(function(){
//    动态法规库访问情况统计
    $('#dowebok').fullpage({
        navigation: true,
        afterRender : function(){
            //控制iframe高度
            $('#nav_iframe', window.parent.document).css({
                minHeight : 650
            });
            //法规宣贯情况统计
            $('#ORG-2-1').initBIOption({
                color: ['#02B4F7','#0083A3','#00FCD1'],
                grid:{
                    top:'10%',
                    left: '3%',
                    right: '8%',
                    bottom: '3%',
                    containLabel: true
                },
                tooltip : {
                    trigger: 'axis',           // 触发类型，默认数据触发，见下图，可选为：'item' | 'axis'
                    showDelay: 20,             // 显示延迟，添加显示延迟可以避免频繁切换，单位ms
                    hideDelay: 100,            // 隐藏延迟，单位ms
                    transitionDuration : 0.4,  // 动画变换时间，单位s
                    formatter:function(a) {
                        var relVal = '';
                        for(var i in a){
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
                xAxis :
                    {
                        type : 'category',
                        boundaryGap : false,
                        //数据填充
                        data :[] ,
                        data :[2011,2012,2013,2014,2015] ,
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
                    },
                yAxis :
                    {
                        name:"",
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
                        name:'人数', //名称
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
                        data:[1230, 1246, 1256, 1389, 1412]
                    }
                ]
            },20,{})
//    动态法规库热搜词语统计图
            $('#ORG-3-1').initBIOption({
                xAxis :[{
                    type : 'category',
                    data : ['吨位丈量', '证书签发', '载重线标志', '无线电配备'],
                    axisLine:{
                        //坐标轴的颜色
                        lineStyle:{
                            color:'#00C6FF',
                            width:1
                        }
                    }
                }],
                yAxis:[{
                    name:"",
                    color:'#ffff00',
                    type : 'value',
                    axisLine:{
                        lineStyle:{
                            color:'#00C6FF',
                            width:1//这里是为了突出显示加上的
                        }
                    }
                }],
                series: [{
                    itemStyle: {normal: {label: {formatter: '{c}个({d}%)'}}},
                    data: [43433,34134,31432,29432]
                }]
            },10,{})
        },
        afterLoad : function(anchorLink, index){
            //index ： 当前跳转的页面
            if (index ==1) {

                //法规宣贯情况统计
                $('#ORG-2-1').initBIOption({
                    color: ['#02B4F7','#0083A3','#00FCD1'],
                    grid:{
                        top:'10%',
                        left: '3%',
                        right: '8%',
                        bottom: '3%',
                        containLabel: true
                    },
                    tooltip : {
                        trigger: 'axis',           // 触发类型，默认数据触发，见下图，可选为：'item' | 'axis'
                        showDelay: 20,             // 显示延迟，添加显示延迟可以避免频繁切换，单位ms
                        hideDelay: 100,            // 隐藏延迟，单位ms
                        transitionDuration : 0.4,  // 动画变换时间，单位s
                        formatter:function(a) {
                            var relVal = '';
                            for(var i in a){
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
                    xAxis :
                        {
                            type : 'category',
                            boundaryGap : false,
                            //数据填充
                            data :[] ,
                            data :[2011,2012,2013,2014,2015] ,
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
                        },
                    yAxis :
                        {
                            name:"",
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
                            name:'人数', //名称
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
                            data:[1230, 1246, 1256, 1389, 1412]
                        }
                    ]
                },20,{})
//    动态法规库热搜词语统计图
                $('#ORG-3-1').initBIOption({
                    xAxis :[{
                        type : 'category',
                        data : ['吨位丈量', '证书签发', '载重线标志', '无线电配备'],
                        axisLine:{
                            //坐标轴的颜色
                            lineStyle:{
                                color:'#00C6FF',
                                width:1
                            }
                        }
                    }],
                    yAxis:[{
                        name:"",
                        color:'#ffff00',
                        type : 'value',
                        axisLine:{
                            lineStyle:{
                                color:'#00C6FF',
                                width:1//这里是为了突出显示加上的
                            }
                        }
                    }],
                    series: [{
                        itemStyle: {normal: {label: {formatter: '{c}个({d}%)'}}},
                        data: [43433,34134,31432,29432]
                    }]
                },10,{})
            } else if (index == 2) {
                $('#ORG-1-1').initBIOption({
                    color:['#00AEFF','#ED3F49','#FED61C','#00699A','#33FF00','#00CC99','rgba(64, 82, 114, 0.2)'],
                    legend: {
                        left : "2%",
                        data: ['渔船法定检验规则（2008）', '渔船检验指南（第三册）', '渔船检验指南（第五册）', '渔船检验指南（第一册）', '船用产品检验管理规定', '钢质渔船建造规范']
                    },
                    series: [{
                        itemStyle: {normal: {label: {formatter: '{c}个\n({d}%)'}}},
                        radius: '65%',
                        data: [{value: 3536729, name: '渔船法定检验规则（2008）'}, {value: 3136754, name: '渔船检验指南（第三册）'}, {value: 2837409, name: '渔船检验指南（第五册）'}, {value: 2630743, name: '渔船检验指南（第一册）'}, {value: 2394785, name: '船用产品检验管理规定'}, {value: 2190483, name: '钢质渔船建造规范'}]
                    },{
                        radius: ['75%', '75%'],
                        center: ['50%', '50%']
                    }]
                },30,{click : ".nav li"})
                $('#ORG-1-2').initBIOption({
                    color:['#00AEFF','#ED3F49','#FED61C','#00699A','#33FF00','#00CC99','#FFBD00','rgba(64, 82, 114, 0.2)'],
                    legend: {
                        left:'2%',
                        data: ['渔船法定检验规则（2008）', '渔船检验指南（第三册）', '渔船检验指南（第二册）', '渔船检验指南（第五册）', '渔船检验指南（第一册）', '船用产品检验管理规定', '钢质渔船建造规范']
                    },
                    series: [{
                        itemStyle: {normal: {label: {formatter: '{c}个\n({d}%)'}}},
                        radius: '50%',
                        data: [{value: 1536729, name: '渔船法定检验规则（2008）'}, {value: 1136754, name: '渔船检验指南（第三册）'},{value: 837409, name: '渔船检验指南（第二册）'}, {value: 1633092, name: '渔船检验指南（第五册）'}, {value: 630743, name: '渔船检验指南（第一册）'}, {value: 394785, name: '船用产品检验管理规定'}, {value: 190483, name: '钢质渔船建造规范'}]
                    },{
                        radius: ['60%', '60%'],
                        center: ['50%', '50%']
                    }]
                },30,{click : ".nav li"})
                $('#ORG-1-3').initBIOption({
                    color:['#00AEFF','#ED3F49','#FED61C','#00699A','#33FF00','#00CC99','rgba(64, 82, 114, 0.2)'],
                    legend: {
                        left:'2%',
                        data: ['渔船法定检验规则（2008）', '渔船检验指南（第三册）', '渔船检验指南（第五册）', '渔船检验指南（第二册）', '船用产品检验管理规定', '钢质渔船建造规范']
                    },
                    series: [{
                        itemStyle: {normal: {label: {formatter: '{c}个\n({d}%)'}}},
                        radius: '65%',
                        data: [{value: 2536729, name: '渔船法定检验规则（2008）'}, {value: 2136754, name: '渔船检验指南（第三册）'}, {value: 1630743, name: '渔船检验指南（第五册）'}, {value: 1837409, name: '渔船检验指南（第二册）'}, {value: 1394785, name: '船用产品检验管理规定'}, {value: 1190483, name: '钢质渔船建造规范'}]
                    },{
                        radius: ['75%', '75%'],
                        center: ['50%', '50%']
                    }]
                },30,{click : ".nav li"})
                //    法规讨论问题情况统计
                $('#ORG-4-1').initBIOption({
                    grid: {
                        // left: '10%',
                        bottom:'25%'
                    },
                    xAxis :[{
                        type : 'category',
                        data : ['渔船检验指南3-2-14', '渔船检验指南2-2-15', '钢质渔船建造规范2-3-12', '钢质渔船建造规范2-4-11', '渔船检验指南1-3-16', '渔船检验指南1-4-11'],
                        axisLine:{
                            //坐标轴的颜色
                            lineStyle:{
                                color:'#00C6FF',
                                width:1
                            }
                        },
                        axisLabel:{
                            interval: 0,
                            formatter:function(params)
                            {
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
                    }],
                    yAxis:[{
                        name:"",
                        color:'#ffff00',
                        type : 'value',
                        axisLine:{
                            lineStyle:{
                                color:'#00C6FF',
                                width:1//这里是为了突出显示加上的
                            }
                        },
                        // axisLabel: {
                        //     interval: 0,
                        //     rotate: 345
                        // }
                    }],
                    series: [{
                        itemStyle: {normal: {label: {formatter: '{c}条({d}%)'}}},
                        data: [34323,21243,20123,19230,18232,12234]
                    }]
                },10,{click : ".nav li"})
                $('#ORG-4-2').initBIOption({
                    grid: {
                        // left: '10%',
                        bottom:'25%'
                    },
                    xAxis :[{
                        type : 'category',
                        data : ['渔船检验指南3-2-14', '渔船检验指南2-2-15', '钢质渔船建造规范2-3-12', '钢质渔船建造规范2-4-11', '渔船检验指南1-3-16', '渔船检验指南1-4-11'],
                        axisLine:{
                            //坐标轴的颜色
                            lineStyle:{
                                color:'#00C6FF',
                                width:1
                            }
                        },
                        axisLabel: {
                            interval: 0,
                            formatter:function(params)
                            {
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
                    }],
                    yAxis:[{
                        name:"",
                        color:'#ffff00',
                        type : 'value',
                        axisLine:{
                            lineStyle:{
                                color:'#00C6FF',
                                width:1//这里是为了突出显示加上的
                            }
                        }
                    }],
                    series: [{
                        itemStyle: {normal: {label: {formatter: '{c}条({d}%)'}}},
                        data: [34323,21243,20123,19230,18232,12234]
                    }]
                },10,{click : ".nav li"})
                $('#ORG-4-3').initBIOption({
                    grid: {
                        // left: '10%',
                        bottom:'25%'
                    },
                    xAxis :[{
                        type : 'category',
                        data : ['渔船检验指南3-2-14', '渔船检验指南2-2-15', '钢质渔船建造规范2-3-12', '钢质渔船建造规范2-4-11', '渔船检验指南1-3-16', '渔船检验指南1-4-11'],
                        axisLine:{
                            //坐标轴的颜色
                            lineStyle:{
                                color:'#00C6FF',
                                width:1
                            }
                        },
                        axisLabel: {
                            interval: 0,
                            formatter:function(params)
                            {
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
                    }],
                    yAxis:[{
                        name:"",
                        color:'#ffff00',
                        type : 'value',
                        axisLine:{
                            lineStyle:{
                                color:'#00C6FF',
                                width:1//这里是为了突出显示加上的
                            }
                        }
                    }],
                    series: [{
                        itemStyle: {normal: {label: {formatter: '{c}条({d}%)'}}},
                        data: [34323,21243,20123,19230,18232,12234]
                    }]
                },10,{click : ".nav li"})
            } else if (index ==3) {
                //各省动态法规库访问情况统计
                $('#ORG-5-1').initBIOption({
                    xAxis :[{
                        type : 'category',
                        data : ['山东', '浙江', '江苏', '广东', '福建', '广西', '辽宁', '河北', '海南', '上海', '湖南',
                            '湖北', '内蒙古', '黑龙江', '新疆', '河南'],
                        axisLine:{
                            //坐标轴的颜色
                            lineStyle:{
                                color:'#00C6FF',
                                width:1
                            }
                        }
                    }],
                    yAxis:[{
                        name:"",
                        color:'#ffff00',
                        type : 'value',
                        axisLine:{
                            lineStyle:{
                                color:'#00C6FF',
                                width:1//这里是为了突出显示加上的
                            }
                        }
                    }],
                    series: [{
                        itemStyle: {normal: {label: {formatter: '{c}条({d}%)'}}},
                        data: [232113,214533,201232,182309,164231,123234,108343,93832,89203,78312,67738,66321,56782,55232,43121,12321]
                    }]
                },10,{click : ".nav li"})
                //各省参加宣贯人次统计图
                $('#ORG-6-1').initBIOption({
                    xAxis :[{
                        type : 'category',
                        name:"省",
                        data : ['山东', '浙江', '江苏', '广东','福建'],
                        axisLine:{
                            //坐标轴的颜色
                            lineStyle:{
                                color:'#00C6FF',
                                width:1
                            }
                        }
                    }],
                    yAxis:[{
                        name:"人",
                        color:'#ffff00',
                        type : 'value',
                        axisLine:{
                            lineStyle:{
                                color:'#00C6FF',
                                width:1//这里是为了突出显示加上的
                            }
                        }
                    }],
                    series: [{
                        itemStyle: {normal: {label: {formatter: '{c}人({d}%)'}}},
                        data: [79,69,58,48,40]
                    }]
                },10,{})
//渔船安全综合指数分析图
                $('#ORG-6-2').initBIOption({
                    tooltip: {
                        trigger: 'axis'
                    },
                    grid:{
                        top:'10%',
                        left: '3%',
                        right: '8%',
                        bottom: '3%',
                        containLabel: true
                    },
                    legend:{
                        data: ['远洋渔船', '国内海洋渔船','内河渔船'],
                        textStyle:{
                            color: '#fff'
                        }
                    },
                    tooltip:{
                        axisLabel:{
                            label:{
                                formatter:''
                            }
                        }
                    },
                    xAxis:{
                        type: 'category',
                        axisLabel: {
                            textStyle: {
                                color: '#4DC2E1'
                            }
                        },
                        axisLine:{
                            lineStyle:{
                                color:'#385181'
                            }
                        },
                        data : ['2012','2013','2014','2015','2016']
                    },
                    yAxis: [
                        {
                            type: 'value',
                            name: '%',
                            axisLabel: {
                                formatter: '{value} '
                            } ,
                            axisLine:{
                                lineStyle:{
                                    color:'#00C6FF',
                                }
                            }
                        }
                    ],
                    series : [
                        {
                            name:'远洋渔船',
                            type:'line',
                            //stack: '总量',
                            symbol:'emptycircle',
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
                            data:[96.22, 95.33, 93.14, 92.11, 90.56]
                        },
                        {
                            name:'国内海洋渔船',
                            type:'line',
                            //stack: '总量',
                            symbol:'emptycircle',
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
                            },
                            data:[91.09, 90.22, 89.76, 88.21, 85.34]
                        },
                        {
                            name:'内河渔船',
                            type:'line',
                            //stack: '总量',
                            symbol:'emptycircle',
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
                            },
                            data:[88.74, 87.65, 86.25, 84.39, 82.67]
                        }
                    ]
                },20,{})
            } else if (index ==4) {
                //远洋渔船企业渔船安全综合指数分析
                $('#ORG-7-1').initBIOption({
                    xAxis :[{
                        type : 'category',
                        data : ['中国远洋渔业公司', '天津滨海渔业有限公司', '大连獐子岛渔业有限公司', '青岛海鑫渔业公司','广东文贤渔业公司'],
                        axisLine:{
                            //坐标轴的颜色
                            lineStyle:{
                                color:'#00C6FF',
                                width:1
                            }
                        },
                        axisLabel : {
                            interval: 0,
                            formatter:function(params)
                            {
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
                    }],
                    yAxis:[{
                        name:"",
                        color:'#ffff00',
                        type : 'value',
                        axisLine:{
                            lineStyle:{
                                color:'#00C6FF',
                                width:1//这里是为了突出显示加上的
                            }
                        }
                    }],
                    series: [{
                        itemStyle: {normal: {label: {formatter: '{c}({d}%)'}}},
                        data: [93.22,91.27,90.32,88.32,87.58]
                    }]
                },10,{})
                //各省渔船综合安全指数分析图
                var myChart = echarts.init(document.getElementById("ORG-7-2"));

                var arr = [
                    ['辽宁', 96.23, 4891],['辽宁', 84.22, 2100],['辽宁', 71.56, 690],['辽宁', 66.32, 119],
                    ['河北', 92.67, 2190],['河北',87.23, 1067],['河北', 76.24, 562],['河北', 61.23, 189],
                    ['山东', 94.36, 6653],['山东', 88.34, 2210],['山东', 75.39,1175],['山东',60.33,987],
                    ['天津',95.26,543], ['天津', 81.21,226], ['天津', 71.34,145], ['天津', 66.23,123],
                    ['江苏',97.22,8928], ['江苏',82.14,2930], ['江苏',72.45,1983], ['江苏', 65.33,903],
                    ['浙江', 97.28,8774],['浙江', 85.23,3021],['浙江', 72.14,2210],['浙江',66.29,1034],
                    ['福建',94.28,4892],['福建', 82.34,2039],['福建', 76.34,219],['福建', 67.33,572],
                    ['广东', 96.73,7268],['广东', 88.34,2034],['广东', 76.11,783],['广东',66.39,892],
                    ['海南', 90.23,3210],['海南',80.23,1029],['海南',70.25,762],['海南', 60.23,421],
                    ['上海', 96.39,673],['上海', 88.39,330],['上海',72.56,120],['上海',66.09,167]
                ];
                function fn1(){
                    var data =[];
                    for(var i=0;i<arr.length/4;i++){
                        var v= 0;
                        v = arr[4*i][1];
                        data.push(v);
                    }
                    return data;
                }
                function fn2(){
                    var data =[];
                    for(var i=0;i<arr.length/4;i++){
                        var v= 0;
                        v = arr[4*i+1][1];
                        data.push(v);
                    }
                    return data;
                }
                function fn3(){
                    var data =[];
                    for(var i=0;i<arr.length/4;i++){
                        var v= 0;
                        v = arr[4*i+2][1];
                        data.push(v);
                    }
                    return data;
                }
                function fn4(){
                    var data =[];
                    for(var i=0;i<arr.length/4;i++){
                        var v= 0;
                        v = arr[4*i+3][1];
                        data.push(v);
                    }
                    return data;
                }

                var option = {
                    backgroundColor: "#0F2353",
                    legend: {
                        // y: 10,
                        // data: ['机构数量(个)'],
                        // textStyle: {
                        //     color: '#00C6FF'  // 图例文字颜色
                        // },
                        // right: 50
                    },
                    tooltip: {
                        // formatter: function (data) {
                        //     var obj = data.value;
                        //     return '地区：<span style="color:#FAFB02">' + obj[0] + '</span></br>安全指数：<span style="color:#FAFB02">' + obj[1] + '</span>'
                        // },
                        // show:true
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
                        data: ['辽宁', '河北', '山东', '天津', '江苏', '浙江', '福建', '广东', '海南', '上海'],
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
                        min:40,
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
                        name: '90-100',
                        data: fn1(),
                        type: 'scatter',
                        symbolSize: function (data) {
                            return Math.sqrt(data) * 5;
                        },
                        itemStyle: {
                            normal: {
                                shadowBlur: 10,
                                shadowColor: '#0D84CA',
                                shadowOffsetY: 5,
                                color:'#00aeff'
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
                    },{
                        name: '80-90',
                        data: fn2(),
                        type: 'scatter',
                        symbolSize: function (data) {
                            return Math.sqrt(data) * 4;
                        },
                        itemStyle: {
                            normal: {
                                shadowBlur: 10,
                                shadowColor: '#ed3f49',
                                shadowOffsetY: 5,
                                color:'#ed3f49'

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
                    },
                        {
                            name: '70-80',
                            data: fn3(),
                            type: 'scatter',
                            symbolSize: function (data) {
                                return Math.sqrt(data) * 3;
                            },
                            itemStyle: {
                                normal: {
                                    shadowBlur: 10,
                                    shadowColor: '#0D84CA',
                                    shadowOffsetY: 5,
                                    color:'#00699a'
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
                        },
                        {
                            name: '60-70',
                            data: fn4(),
                            type: 'scatter',
                            symbolSize: function (data) {
                                return Math.sqrt(data) * 2;
                            },
                            itemStyle: {
                                normal: {
                                    shadowBlur: 10,
                                    shadowColor: '#0D84CA',
                                    shadowOffsetY: 5,
                                    color:'#fed61c'
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
                        }
                    ]
                };
                myChart.setOption(option);
                //各省动态法规库提问情况统计图
                $('#ORG-7-3').initBIOption({
                    color: ['#02B4F7','#0083A3','#00FCD1'],
                    tooltip : {
                        trigger: 'axis',           // 触发类型，默认数据触发，见下图，可选为：'item' | 'axis'
                        showDelay: 20,             // 显示延迟，添加显示延迟可以避免频繁切换，单位ms
                        hideDelay: 100,            // 隐藏延迟，单位ms
                        transitionDuration : 0.4,  // 动画变换时间，单位s
                        formatter:function(a) {
                            var relVal = '';
                            for(var i in a){
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
                        top:"13%",
                        left: '3%',
                        right: '4%',
                        bottom: '3%',
                        containLabel: true
                    },
                    xAxis :
                        {
                            type : 'category',
                            boundaryGap : false,
                            //数据填充
                            // data :[] ,
                            data : ['山东', '浙江', '江苏', '广东', '福建'],
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
                        },
                    yAxis :
                        {
                            name:"",
                            color:'#ffff00',
                            type : 'value',
                            axisLine:{
                                lineStyle:{
                                    color:'#00C6FF',
                                    width:1//这里是为了突出显示加上的
                                }
                            }
                        },
                    series : [
                        {
                            name:'人数', //名称
                            type:'line',
                            //stack: '总量',
                            symbol:'emptycircle',    //设置折线图中表示每个坐标点的符号；emptycircle：空心圆；emptyrect：空心矩形；circle：实心圆；emptydiamond：菱形
                            symbolSize: 8,//圈的大小
                            areaStyle: {normal: {
                                areaStyle: {
                                }
                            }},
                            itemStyle: {normal: {label: {formatter: '{c}条({d}%)'}}},

                            //线的样式
                            itemStyle: {
                                normal:{
                                    label: {formatter: '{c}条({d}%)'},
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
                            data: [2321,2145,2012,1823,1642]
                        }
                    ]
                },20,{})
            }
        }
    });



})