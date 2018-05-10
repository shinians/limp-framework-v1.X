(function($){
    /**
     * $("loading").showLoadingLayUI(1140，450);
     * layui弹框loading层
     * @param height
     * @returns {string}
     */
    $.fn.showLoadingLayUI=function(width,height,skin,title){
        //console.log("加载loading层")
        var str='<div id="loading" style="height: 350px;width: 100%"> </div>';
        // width=width? width+"px":"1140px";
        if(system.isBlank(height)){
            height = "350px";
        }else{
            height = height;
        }
        width ==""?width = '1140px':width = width;
        height ==""?height = '450px':height = height;
        if(system.isBlank(skin)){
            skin = 'lis1';
        }else{
            skin = skin
        }

        if(system.isBlank(title)){
            title = '信息';
        }else{
            title = title
        }

        try{
            layer.open({
                title: title,
                type: 1,
                skin: skin,
                id: "test",
                closeBtn: '2',
                area: [width, height],    //area: ['1140px', '450px'],
                shadeClose: false,
                content: str,
                shade: [0.7, '#000']
            });
        }catch(error){
            console.log(error)
        }
        //加载loading层
        $("#loading").showLoading();
        return str;
    }
    /**
     *chart图形加载loading层，再后台数据未返回之前进行加载
     * 使用方法：$("#id").showLoading();
     * @param id
     */
    $.fn.showLoading=function(){
        var myChart = echarts.init(document.getElementById($(this).attr("id")));
        myChart.showLoading('default', {text:'loading',maskColor: '#0F2353',textColor: '#ffEB1E'}) ;
    }
    /**
     * 自适应之后，变动窗口之后，之前隐藏的图形也自适应导致图形变窄
     *调用方法 ：$("#ID").initBIOption(options,type,params)
     * @param options  需要覆盖的属性
     * @param type    传入的类型（不同的数字代表不同的类型）
     * @param params(其他的参数)map{}类型  额外的参数  params{click:"绑定运行自适应事件，逗号分隔。如 #nav li,.tab li"}
     * @returns {*}
     */
    $.fn.initBIOption=function(options,type,params){
        // console.debug($(this).attr("id")+"-----ID1调用插件-----");
        //魔板需要定义成内部变量，否则全局变量会相互串行
        var optionTemp={
            barDefaultSet10:{
                color: ['#00AEFF','#00699A','#fed61c'],
                // backgroundColor:"#0F2353",// '#2A456B',//背景色
                tooltip : {
                    trigger: 'axis',
                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                        type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                    }
                },
                /**整体布局**/
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    top:"15%",
                    containLabel: true
                },
                xAxis :
                    {
                        type : 'category',
                        boundaryGap : true,
                        data : [],
                        // data : ["船体","轮机","电气","小型渔船"],
                        axisLine:{
                            //坐标轴的颜色
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
                        minInterval:1,
                        axisLine:{
                            //y轴坐标轴的属性
                            lineStyle:{
                                color:'#00C6FF',
                                width:1//这里是为了突出显示加上的
                            }
                        }  ,
                        splitLine:{show: false},//去除网格线
                    }
                ,
                series : [
                    {
                        type:'bar',
                        barWidth:40,
                        stack: '验船师学历',
                        data:[]
                        // data:[12,23,45,67]
                    }

                ]
            } ,
            barDefaultSet11:{
                color: ['#fed61c','#00699A','#00AEFF'],
                // backgroundColor:"#0F2353",// '#2A456B',//背景色
                tooltip : {
                    trigger: 'axis',
                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                        type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                    }
                },
                legend: {
                    left: 'right',
                    data:[],
                    // data:['最低匹配人数','实际人数','优秀匹配人数'],
                    textStyle: {
                        color: '#00C6FF'          // 图例文字颜色
                    }
                },
                /**整体布局**/
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    top:"15%",
                    containLabel: true
                },
                xAxis :
                    {
                        type : 'category',
                        boundaryGap : true,

                        data : [],
                        // data : ["船体","轮机","电气","小型渔船"],
                        axisLine:{
                            //坐标轴的颜色
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
                        splitLine:{show: false},//去除网格线
                        axisLine:{
                            //y轴坐标轴的属性
                            lineStyle:{
                                color:'#00C6FF',
                                width:1//这里是为了突出显示加上的
                            }
                        }
                    }
                ,
                series : [


                ]
            },
            barDefaultSet12:{
                tooltip:{
                    trigger: 'item',//是否节点触发  
                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                        type : 'line',        // 默认为直线，可选为：'line' | 'shadow'

                    },
                    axisLabel:{
                        label:{
                            formatter:''
                        }
                    }
                },
                grid: {
                    left: '3%',
                    right: '4%',
                    bottom: '3%',
                    top:"15%",
                    containLabel: true
                },
                xAxis: [
                    {
                        type: 'category',
                        data: ['船体','机电','其它'],
                        axisLine:{
                            //坐标轴的颜色
                            lineStyle:{
                                color:'#00C6FF',
                                width:1//这里是为了突出显示加上的

                            }
                        }
                    }
                ],
                yAxis: [
                    {
                        //type: 'value',
                        name: '人数',
                        // min: 0,
                        // max: 30,
                        // interval: 5,
                        splitLine:{show: false},
                        axisLabel: {
                            formatter: '{value} '
                        } ,
                        axisLine:{
                            lineStyle:{
                                color:'#fff'
                            }
                        }
                    }
                ],
                series: [

                ]
            },
            lineDefaultSet20:{
                color: ['#02B4F7','#0083A3','#00FCD1'],
                // backgroundColor:"#0F2353",// '#18204B',//背景色
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

                    // formatter:function(a) {
                    //     var relVal = '';
                    //     for(var i in a){
                    //         if(i<2){
                    //             var domain=a[i]  ;
                    //             relVal +=domain.seriesName+ '&nbsp;:&nbsp;<span style="color:#FAFB02">'+domain.value+'</span><br/>';
                    //         }
                    //     }
                    //     //relVal =a[0].seriesName+ '&nbsp;:&nbsp;<span style="color:#FAFB02">'+a[0].value+'</span><br/>';
                    //     // relVal += a[1]+'°C';
                    //     return relVal;
                    // } ,

                    axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                        type : 'cross',         // 默认为直线，可选为：'line' | 'shadow'
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
                    {   name:"年",
                        type : 'category',
                        boundaryGap : false,
                        //数据填充
                        data :[] ,
//            data :[2012,2013,2014,2015,2016] ,
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
                        minInterval:1,
                        color:'#ffff00',
                        type : 'value',
                        axisLine:{
                            lineStyle:{
                                color:'#00C6FF',
                                width:1//这里是为了突出显示加上的
                            }
                        },
                        splitLine:{
                            lineStyle:{
                                color:"#1d3d67"
                            }
                        }
                    }
                ,
                series : [
                    {
                        name:'', //名称
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
//                data:[34]
                        data:[]
                    }
                ]
            },
            lineDefaultSet21:{
                title: {
                    x : '20px' ,
                    y:'-5px',
                    textStyle: {
                        fontSize: 20,
                        fontWeight: 'bolder',
                        color: '#FFF'          // 主标题文字颜色
                    }
                },
                tooltip : {
                    trigger: 'axis',
                    showDelay: 20,             // 显示延迟，添加显示延迟可以避免频繁切换，单位ms
                    hideDelay: 100,            // 隐藏延迟，单位ms
                    transitionDuration : 0.4,  // 动画变换时间，单位s
                    formatter:function(a) {
                        var relVal = '';
                        for(var i in a){
                            var domain=a[i]  ;
                            relVal +=domain.seriesName+ '&nbsp;:&nbsp;<span style="color:#FAFB02">'+domain.value+'</span><br/>';
                        }
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
                //图例设置
                legend: {
                    data:[],
                    // data:['初次检验','营运检验','临时检验'],
                    textStyle: {
                        color: '#00C6FF'          // 图例文字颜色
                    },
                    x: 'center',
                    y: '20px'

                },
                /* toolbox: {
                 feature: {
                 saveAsImage: {}
                 }
                 },*/
                grid: {
                    left: '3%',
                    right: '4%',
                    containLabel: true
                },
                xAxis : {
                    type : 'category',
                    boundaryGap : false,
                    data : [] ,
                    // data : ['2014','2015','2016'] ,
                    axisLabel: {
                        textStyle: {
                            color: '#4DC2E1'
                        }
                    },
                    axisLine:{
                        lineStyle:{
                            color:'#385181'
                        }
                    }
                } ,
                yAxis :
                    {
                        type : 'value',
                        axisLine:{
                            lineStyle:{
                                color:'#00C6FF',
                                width:1//这里是为了突出显示加上的
                            }
                        },
                        splitLine:{
                            lineStyle:{
                                color:"#1d3d67"
                            }
                        }
                    }  ,
                series : [
                    // {
                    //     name:'初次检验',
                    //     type:'line',
                    //     //stack: '总量',
                    //     symbol:'emptycircle',    //设置折线图中表示每个坐标点的符号；emptycircle：空心圆；emptyrect：空心矩形；circle：实心圆；emptydiamond：菱形
                    //     symbolSize: 8,//圈的大小
                    //     areaStyle: {normal: {
                    //     }},
                    //     //线的样式
                    //     itemStyle: {
                    //         normal:{
                    //             color: new echarts.graphic.LinearGradient(0, 0, 0, 1,
                    //                 [
                    //                     {offset: 0, color: '#0193DC'},
                    //                     {offset: 0.8, color: '#082B72'},
                    //                     {offset: 1, color: 'rgba(25,35,89,0.1)'}
                    //                 ]
                    //             )
                    //         },
                    //         emphasis: {
                    //             color: '#ffff00',//黄色
                    //             symbolSize: 28,
                    //             borderColor: '#f9f900',
                    //             borderWidth: 4,
                    //             shadowBlur: 10,
                    //             shadowColor: '#333'
                    //         }
                    //     },
                    //     data:[210,152, 101]
                    // },
                    // {
                    //     name:'营运检验',
                    //     type:'line',
                    //     areaStyle: {normal: {}},
                    //     data:[182, 191, 234],
                    //     symbol:'emptycircle',    //设置折线图中表示每个坐标点的符号；emptycircle：空心圆；emptyrect：空心矩形；circle：实心圆；emptydiamond：菱形
                    //     symbolSize: 8,//圈的大小
                    //     areaStyle: {normal: {
                    //         areaStyle: {
                    //         }
                    //     }},
                    //     itemStyle: {
                    //         normal:{
                    //             color: new echarts.graphic.LinearGradient(0, 0, 0, 1,
                    //                 [
                    //                     {offset: 0, color: '#02E6ED'},
                    //                     {offset: 0.2, color: 'rgba(2,230,237,0.5)'},
                    //                     {offset: 1, color: 'rgba(2,230,237,0.1)'}
                    //                 ]
                    //             )
                    //         },
                    //         emphasis: {
                    //             color: '#ffff00',//黄色
                    //             symbolSize: 28,
                    //             borderColor: '#f9f900',
                    //             borderWidth: 4,
                    //             shadowBlur: 10,
                    //             shadowColor: '#333'
                    //         }
                    //     }
                    // }, {
                    //     name:'临时检验',
                    //     type:'line',
                    //     areaStyle: {normal: {}},
                    //     data:[255, 242, 294],
                    //     symbol:'emptycircle',    //设置折线图中表示每个坐标点的符号；emptycircle：空心圆；emptyrect：空心矩形；circle：实心圆；emptydiamond：菱形
                    //     symbolSize: 8,//圈的大小
                    //     areaStyle: {normal: {
                    //         areaStyle: {
                    //         }
                    //     }},
                    //     itemStyle: {
                    //         normal:{
                    //             color: new echarts.graphic.LinearGradient(0, 0, 0, 1,
                    //                 [
                    //                     {offset: 0, color: '#01f79d'},
                    //                     {offset: 0.2, color: 'rgba(1,247,157,0.5'},
                    //                     {offset: 1, color: 'rgba(1,247,157,0.1)'}
                    //                 ]
                    //             )
                    //         },
                    //         emphasis: {
                    //             color: '#ffff00',//黄色
                    //             symbolSize: 28,
                    //             borderColor: '#f9f900',
                    //             borderWidth: 4,
                    //             shadowBlur: 10,
                    //             shadowColor: '#333'
                    //         }
                    //     }
                    // }
                ]
            },
            lineDefaultSet22:{},
            pieDefaultSet30:{
                color: ['#ED3F49','#00AEFF','#00699A','#FED61c','rgba(64, 82, 114, 0.6)','#405272'],
                // backgroundColor:"#0F2353",// '#2A456B',//背景色
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
                    data:[]// ['验船员','助理验船师','中级验船师','高级验船师']
//            data:["硕士及以上","大学本科","大学专科","中专及以下"]// ['验船员','助理验船师','中级验船师','高级验船师']
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
                        data:[]
//                data:[{value:23, name:"硕士及以上",selected:true},{value:43, name:"大学本科"},{value:53, name:"大学专科"},{value:63, name:"中专及以下"}]
                        ,
                        itemStyle: {
                            normal: {
                                // color: '各异',
                                borderColor: '#405272',
                                borderWidth: 1,
                                label: {
                                    show: true,
                                    position: 'outer',
                                    formatter: ' {c} <br/>({d}%) '
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
            },
            pieDefaultSet32:{
                color: ['#ED3F49','#00AEFF','#00699A','#FED61c','rgba(64, 82, 114, 0.6)','#405272'],
                // backgroundColor:"#0F2353",// '#2A456B',//背景色
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
                    data:[]// ['验船员','助理验船师','中级验船师','高级验船师']
//            data:["硕士及以上","大学本科","大学专科","中专及以下"]// ['验船员','助理验船师','中级验船师','高级验船师']
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
                        data:[]
//                data:[{value:23, name:"硕士及以上",selected:true},{value:43, name:"大学本科"},{value:53, name:"大学专科"},{value:63, name:"中专及以下"}]
                        ,
                        itemStyle: {
                            normal: {
                                // color: '各异',
                                borderColor: '#405272',
                                borderWidth: 1,
                                label: {
                                    show: true,
                                    position: 'outer',
                                    formatter: ' {c} <br/>({d}%) '
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
                ]
            },
            pieDefaultSet31:{
                tooltip : {
                    trigger: 'item',
                    formatter: "{a} <br/>{b} : {c} ({d}%)"
                },
                legend: {
                    x : 'center',
                    y : 'bottom',
                    data:['AAA','AA','A','BBB','BB','B','CCC','CC','C']
                },
                toolbox: {
                    show : true,
                    feature : {
                        mark : {show: true},
                        dataView : {show: true, readOnly: false},
                        magicType : {
                            show: true,
                            type: ['pie', 'funnel']
                        },
                        restore : {show: true},
                        saveAsImage : {show: true}
                    }
                },
                calculable : true,
                series : [
                    {
                        type: 'pie',
                        radius: [30, 110],
                        center: ['40%', 180],
                        roseType: 'area',
                        selectedOffset: 0,
                        sort: 'ascending',     // for funnel
                        label: {
                            normal: {
                                show: false
                            },
                            emphasis: {
                                show: true
                            }
                        },
                        lableLine: {
                            normal: {
                                show: false
                            },
                            emphasis: {
                                show: true
                            }
                        },
                        itemStyle: {
                            normal: {
                                color: function (e) {
                                    var    ColorObj={
                                        "AAA": "#319734",
                                        "AA": "#66b468",
                                        "A": "#b2c05f",
                                        "BBB": "#e7c65d",
                                        "BB": "#dcac57",
                                        "B": "#d19453",
                                        "CCC": "#cb885e",
                                        "CC": "#c6796f",
                                        "C": "#c6796f",
                                        "D": "#a83031"
                                    }
                                    return  ColorObj[e.name];
                                },
                                label: {
                                    show: false
                                },
                                labelLine: {
                                    show: false
                                }
                            }
                        },
                        data:[
                            {value:10, name:'AAA'},
                            {value:5, name:'AA'},
                            {value:15, name:'A'},
                            {value:25, name:'BBB'},
                            {value:20, name:'BB'},
                            {value:35, name:'B'},
                            {value:30, name:'CCC'},
                            {value:40, name:'CC'},
                            {value:30, name:'C'}
                        ]
                    }
                ]
            },
            guageDefaultSet40:{
                tooltip: {
                    formatter: "{b}:<span style='color:#FAFB02'>{c}%</span>"
                },
                toolbox: {
                    feature: {
                        restore: {},
                        saveAsImage: {}
                    }
                },
                series: [
                    {
                        name: '工作量',
                        type: 'gauge',
                        radius: '95%',
                        center: ['50%', '55%'],    // 默认全局居中
                        data: [{value: "85", name: '检验完成率'}],
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
                            length: 15
                        },
                        detail: {
                            formatter: '{value}%',
                            offsetCenter: [0, '60%'],       // x, y，单位px
                            textStyle: {       // 其余属性默认使用全局文本样式，详见TEXTSTYLE
                                fontWeight: 'bolder',
                                fontSize: 20
                            }
                        }
                    }
                ]
            },
            sactterDefaultSet50:{

            }
        };
        var mapTemp={
            10:optionTemp.barDefaultSet10, //单个柱形图
            11:optionTemp.barDefaultSet11,//多条柱形图
            12:optionTemp.barDefaultSet12,//堆叠柱形图【用于展示验船师的缺口人数】
            20:optionTemp.lineDefaultSet20,//折线面积图（UI透明效果）  由于人不可能出现小数等问题，所以设置为最小 度为1
            21:optionTemp.lineDefaultSet21, //折线面积图 （3个多条）
            30:optionTemp.pieDefaultSet30 ,//单个饼图（UI外发光效果）
            31:optionTemp.pieDefaultSet31,
            32:optionTemp.pieDefaultSet32,//法规专题特殊饼图
            40:optionTemp.guageDefaultSet40,//仪表盘
            50:optionTemp.sactterDefaultSet50
        };
        //Object.keys(mapTemp).length)
        if(system.isBlank(mapTemp[type])){
            throw new Error("type is error!!!-->"+type);
        };
        var  _this=$(this);
        function load(options){
        }
//         myChart="myChart"+parseInt(Math.random()*1000);
        //定义echarts
        var myChart = echarts.init(document.getElementById($(this).attr("id")));
        //深度复制
        var setting=$.extend(true,mapTemp[type],options);
        //模拟加载效果：演示用
        //myChart.showLoading('default', {text:'loading',maskColor: '#0F2353',textColor: '#ffEB1E'}) ;
        myChart.setOption(setting,true);
        myChart.hideLoading();
        //解决窗口变化ecart的自适应问题
        $(window).resize(myChart.resize);
        // 设置设置自适应事件
        /*$(document).delegate(".nav a","click",function() {
            myChart.resize
        })*/
        //var eveClick=".nav li";
        if(!system.isBlank(params)&&!system.isBlank(params['click'])){
            //console.debug("绑定自适应事件");
            //console.debug(params['click']);

            $(document).delegate(params['click'],"click",function(){
                myChart.resize();
            })
        }
        if(true){//绑定翻页、tab通用事件
            $(document).delegate(".bi-ul-slide li","click",function(){
                myChart.resize();
            })
        }

        return setting;
    }
    /**
     * 加载时间插件
     * 使用方法：
     * html:<a href="javascript:;" id="time-train-1-1" class="biorgChoose glyphicon glyphicon-filter"></a>
     * $("#time-org-2-1").initDateFilter(test);
     * 回调方法：
     * function test(data) {} data    --->  {id:id,startT:"",endT:""}
     }
     * @param callBack 方法
     */
    $.fn.initDateFilter=function(callBack){
        var id=$(this).attr("id");//获取id
        // console.log("initDate绑定id"+id);
        $(this).click(function(){
            try{
                $.fn.fullpage.setAllowScrolling(false);
            }catch (e){
                console.log(e);
            }
            var startT=$("#"+id).attr("data-startT");
            startT=system.isBlank(startT)?"":startT;
            var endT=$("#"+id).attr("data-endT");
            endT=system.isBlank(endT)?"":endT;
            var str = "<div class='shijianduan'>" +
                "<div class='kaishi form-group'>" +
                "<div class='input-group date' id='datetimepicker1'>" +
                "<input placeholder='开始' type='text' class='form-control' value='"+startT+"' id='startT'>" +
                "<span class='input-group-addon'>" +
                "</span>" +
                "</div>" +
                "</div>" +
                "<div class='jieshu'>" +
                "<div class='input-group date' id='datetimepicker2'>" +
                "<input placeholder='结束' type='text' class='form-control' value='"+endT+"' id='endT'>" +
                "<span class='input-group-addon'>" +
                "</span>" +
                "</div>" +
                "</div><button class='layui-btn sure'>确定</button>" +
                "</div>";
            layer.open({
                type:4,
                area:['275px','35px'],
                scrollbar: false,
                tips: 4,
                content: [str,"#"+id],
                cancel: function (index, layero) {
                    try{$.fn.fullpage.setAllowScrolling(true)}catch(e){}

                }
            })
            $("button.sure").click(function (){
                try{
                    $.fn.fullpage.setAllowScrolling(true);
                }catch(e){
                }
                callBack({id:id,startT:$("#startT").val(),endT:$("#endT").val()});
                $("#"+id).attr("data-startT",$("#startT").val());
                $("#"+id).attr("data-endT",$("#endT").val());
                layer.closeAll();
            })
            $("#startT").datetimepicker({
                language:  'zh-CN',
                format: 'yyyy',
                weekStart: 1,
                autoclose: 1,
                todayHighlight: 1,
                minView:4,
                startView:4,
                pickerPosition: "bottom-right"
            });
            $("#endT").datetimepicker({
                language:  'zh-CN',
                format: 'yyyy',
                weekStart: 1,
                autoclose: 1,
                todayHighlight: 1,
                minView:4,
                startView:4,
                pickerPosition: "bottom-right"
            })
        })
    }
    /**
     * 单个时间选择
     * @param callBack
     */
    $.fn.initDateFilterSingle=function(callBack){
        var id=$(this).attr("id");//获取id
        // console.log("duan  initDate绑定id"+id);

        $(this).click(function(){
            $.fn.fullpage.setAllowScrolling(false)
            var startT=$("#"+id).attr("data-startT");
            startT=system.isBlank(startT)?"":startT;
            var str = "<div class='shijianduan'>" +
                "<div class='kaishi form-group'>" +
                "<div class='input-group date' id='datetimepicker1'>" +
                "<input placeholder='年份' type='text' class='form-control' value='"+startT+"' id='startT'>" +
                "<span class='input-group-addon'>" +
                "</span>" +
                "</div>" +
                "</div>" +
                "<button class='layui-btn sure'>确定</button>" +
                "</div>";
            layer.open({
                type:4,
                area:['175px','35px'],
                tips: 4,
                scrollbar: false,
                content: [str,"#"+id],
                cancel: function (index, layero) {
                    $.fn.fullpage.setAllowScrolling(true)
                }
            })
            $("button.sure").click(function (){
                $.fn.fullpage.setAllowScrolling(true)
                callBack({id:id,startT:$("#startT").val()})
                $("#"+id).attr("data-startT",$("#startT").val());
                layer.closeAll();
            })
            $("#startT").datetimepicker({
                language:  'zh-CN',
                format: 'yyyy',
                weekStart: 1,
                autoclose: 1,
                todayHighlight: 1,
                minView:4,
                startView:4,
                pickerPosition: "bottom-right"
            });


        })
    }
    /**
     *
     * @param callBack 回调函数
     * @param arrKeyValue  要展示的option选项 格式[{key:1,value:持证},{key:2,value:一线}]
     * @param selectKey 与key值
     */
    $.fn.initDateFilterLi=function(callBack,arrKeyValue){
        var id=$(this).attr("id");//获取id
        // console.log("initDate绑定id"+id);
        $(this).click(function(){
            $.fn.fullpage.setAllowScrolling(false)
            var selectKey=$("#"+id).attr("data-value");
            var options="";
            for(var m in arrKeyValue){
                var domain=arrKeyValue[m];
                var sel=domain.key==selectKey ? "selected":"";
                options+="<option value='"+domain.key+"' "+sel+">"+domain.value+"</option>";
            }
            var str = "<div class='shijianduan'>" +
                "<div class='kaishi form-group'>" +
                "<div class='input-group date' id='datetimepicker1'>" +
                "<select class='select-option' id='single_value'>" + options +
                "</select>" +
                "</div>" +
                "</div>" +
                "<button class='layui-btn sure'>确定</button>" +
                "</div>";
            layer.open({
                type:4,
                area:['175px','35px'],
                tips: 4,
                scrollbar: false,
                content: [str,"#"+id],
                cancel: function (index, layero) {
                    $.fn.fullpage.setAllowScrolling(true)
                }
            })
            $("button.sure").click(function (){
                $.fn.fullpage.setAllowScrolling(true)
                callBack({id:id,value:$("#single_value option:selected").val()});
                $("#"+id).attr("data-value",$("#single_value option:selected").val());
                layer.closeAll();
            })


        })
    }
    /**
     * 单个时间选择和属性选择插件
     * @param callBack
     */
    $.fn.initDateFilterSingleAndCheckBox=function(callBack,setting,zNodes){
        var id=$(this).attr("id");//获取id
        // console.log("initDate绑定id"+id);
        $(this).click(function(){
            $.fn.fullpage.setAllowScrolling(false)
            var startT=$("#"+id).attr("data-startT");
            startT=system.isBlank(startT)?"":startT;
            var checkBoxHtml='<div class="shijianduan"><div> <ul class="list"> <li class="title">' +
                '<input id="citySel" type="text" readonly value="" onclick="showMenu();"  placeholder="请选择" style="width:80px;    width: 92px; height: 30px; text-align: center; margin: -2px 0px 5px -8px; border: 1px solid #41578D; background: #122c5b; color: #fff;"  />' +
                ' &nbsp;<a id="menuBtn" href="#" onclick="showMenu(); return false;"></a></li> </ul> </div>' +
                ' <button class="layui-btn sure">确定</button>' +
                '<div id="menuContent" class="menuContent" style="display:none;">' +
                ' <ul id="treeDemo" class="ztree" style="margin-top:0; width:150px; height: 200px;"></ul> ' +
                '' +
                '</div></div>';
            var str = checkBoxHtml;
            layer.open({
                type:4,
                area:['275px','35px'],
                tips: 4,
                scrollbar: false,
                content: [str,"#"+id],
                cancel: function (index, layero) {
                    $.fn.fullpage.setAllowScrolling(true)
                }
            });
            $("button.sure").click(function (){
                $.fn.fullpage.setAllowScrolling(true)
                callBack({id:id,startT:$("#startT").val(),checkbox:$("#citySel").attr("data-checkbox")})
                $("#"+id).attr("data-startT",$("#startT").val());
                $("#"+id).attr("data-checkbox",$("#citySel").attr("data-value"));
                layer.closeAll();
            })
            $("#startT").datetimepicker({
                language:  'zh-CN',
                format: 'yyyy',
                weekStart: 1,
                autoclose: 1,
                todayHighlight: 1,
                minView:4,
                startView:4,
                pickerPosition: "bottom-right"
            });
            ///////////////////////////////////


            $.fn.zTree.init($("#treeDemo"), setting, zNodes);
            ///////////////////////////////////


        })
    }

    /**
     * 时间段筛选(限制选择区间)
     * 注：从下一季度筛选
     */
    $.fn.initDateFilterBetween=function(callBack){
        var id=$(this).attr("id");//获取id
        $(this).click(function(){
            $.fn.fullpage.setAllowScrolling(false)
            var startT=$("#"+id).attr("data-startT");
            startT=system.isBlank(startT)?"":startT;
            var endT=$("#"+id).attr("data-endT");
            endT=system.isBlank(endT)?"":endT;
            var str = "<div class='shijianduan'>" +
                "<div class='kaishi form-group'>" +
                "<div class='input-group date' id='datetimepicker1'>" +
                "<input placeholder='开始' type='text' class='form-control' value='"+startT+"' id='startT'>" +
                "<span class='input-group-addon'>" +
                "</span>" +
                "</div>" +
                "</div>" +
                "<div class='jieshu'>" +
                "<div class='input-group date' id='datetimepicker2'>" +
                "<input placeholder='结束' type='text' class='form-control' value='"+endT+"' id='endT'>" +
                "<span class='input-group-addon'>" +
                "</span>" +
                "</div>" +
                "</div><button class='layui-btn sure'>确定</button>" +
                "</div>";
            layer.open({
                type:4,
                area:['275px','35px'],
                tips: 4,
                content: [str,"#"+id],
                cancel: function (index, layero) {
                    $.fn.fullpage.setAllowScrolling(true)
                }
            })
            $("button.sure").click(function (){
                $.fn.fullpage.setAllowScrolling(true)
                callBack({id:id,startT:$("#startT").val(),endT:$("#endT").val()});
                $("#"+id).attr("data-startT",$("#startT").val());
                $("#"+id).attr("data-endT",$("#endT").val());
                layer.closeAll();
            })
            $("#startT").datetimepicker({
                language:  'zh-CN',
                format: 'yyyy',
                weekStart: 1,
                autoclose: 1,
                todayHighlight: 1,
                minView:4,
                startView:4,
                pickerPosition: "bottom-right"
            }).on('changeDate',function(e){
                var curdate = new Date();
                if($('#startT').val() < curdate.getFullYear()){
                    alert("请选择下一年度！");
                    $('#startT').val('');
                    return;
                }

            });
            $("#endT").datetimepicker({
                language:  'zh-CN',
                format: 'yyyy',
                weekStart: 1,
                autoclose: 1,
                todayHighlight: 1,
                minView:4,
                startView:4,
                pickerPosition: "bottom-right"
            }).on('changeDate',function(e){
                if((parseInt(e.date.getFullYear())-parseInt($("#startT").val()))>10){
                    alert("时间范围请选择10年之内");
                    $("#endT").val('');
                    return;
                }
            });

        })
    }

    /**
     * 近几年时间段筛选(限制选择区间)
     *
     */
    $.fn.initDateFilterSpace=function(callBack){
        var id=$(this).attr("id");//获取id
        $(this).click(function(){
            $.fn.fullpage.setAllowScrolling(false)
            var startT=$("#"+id).attr("data-startT");
            startT=system.isBlank(startT)?"":startT;
            var endT=$("#"+id).attr("data-endT");
            endT=system.isBlank(endT)?"":endT;
            var str = "<div class='shijianduan'>" +
                "<div class='kaishi form-group'>" +
                "<div class='input-group date' id='datetimepicker1'>" +
                "<input placeholder='开始' type='text' class='form-control' value='"+startT+"' id='startT'>" +
                "<span class='input-group-addon'>" +
                "</span>" +
                "</div>" +
                "</div>" +
                "<div class='jieshu'>" +
                "<div class='input-group date' id='datetimepicker2'>" +
                "<input placeholder='结束' type='text' class='form-control' value='"+endT+"' id='endT'>" +
                "<span class='input-group-addon'>" +
                "</span>" +
                "</div>" +
                "</div><button class='layui-btn sure'>确定</button>" +
                "</div>";
            layer.open({
                type:4,
                area:['275px','35px'],
                tips: 4,
                content: [str,"#"+id],
                cancel: function (index, layero) {
                    $.fn.fullpage.setAllowScrolling(true)
                }
            })
            $("button.sure").click(function (){
                $.fn.fullpage.setAllowScrolling(true)
                callBack({id:id,startT:$("#startT").val(),endT:$("#endT").val()});
                $("#"+id).attr("data-startT",$("#startT").val());
                $("#"+id).attr("data-endT",$("#endT").val());
                layer.closeAll();
            })
            $("#startT").datetimepicker({
                language:  'zh-CN',
                format: 'yyyy',
                weekStart: 1,
                autoclose: 1,
                todayHighlight: 1,
                minView:4,
                startView:4,
                pickerPosition: "bottom-right"
            });
            $("#endT").datetimepicker({
                language:  'zh-CN',
                format: 'yyyy',
                weekStart: 1,
                autoclose: 1,
                todayHighlight: 1,
                minView:4,
                startView:4,
                pickerPosition: "bottom-right"
            }).on('changeDate',function(e){
                if((parseInt(e.date.getFullYear())-parseInt($("#startT").val()))>5){
                    alert("时间范围请选择5年之内");
                    $("#endT").val('');
                    return;
                }
            });

        })
    }




})(jQuery);

/**
 * 魔板配置问题汇总
 *  1、如果魔板数据项为2项data数据，而实际项目中只应用到一下，第二项传值时可传空
 *  $("#ORG-1-2-1").initBIOption(series:[{ data:[ {value:120, name:'公务员管理机构'}, {value:"", name:''}})
 *  2、给各个属性赋值后图形没有正常覆盖
 *  原因：赋值的option层级结构不正确，需要明确层级
 */
//option魔板配置文件

//http://blog.csdn.net/rambo_china/article/details/7742321  概念讲解

/**
 * 饼状图颜色填充
 */
var BO ={
    pieBiOptionColor: function(length){
        var Constant=['#ED3F49','#00AEFF','#00699A','#FED61c','#405272','#9f24dd','#dd1982','#9aee28','#6dffc7','#dd380f'];
        var tempStatic="rgba(64, 82, 114, 0.6)";
        var colorArr=[];
        if(Constant.length>length){
            colorArr=Constant.slice(0,length);
        }
        colorArr.push(tempStatic);
        return colorArr;
    }
};


