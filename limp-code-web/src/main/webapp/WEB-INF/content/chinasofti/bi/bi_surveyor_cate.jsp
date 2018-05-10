<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/content/chinasofti/common/head.jsp" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="${ctx}/plug/bootstrap-3.3.7-dist/css/bootstrap.min.css" >
    <link rel="stylesheet" href="${ctx}/plug/bootstrap-3.3.7-dist/css/bootstrap-datetimepicker.min.css" >
    <link rel="stylesheet" href="${ctx}/resources/style/chinasofti/css/mainPanel.css">
</head>
<body style="background-color:#18204B">
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <select id="rang-select" onchange="initGroupByYear()"
                    style="width: 150px; height: 30px; text-align: center; margin-top: 25px; margin-left: 10px; border: 1px solid #41578D; background: #476FA8; color: #fff;">
                <%--<option  value=""> 范围类别</option>--%>
                <%--<option value="">全部</option>--%>
                <option value="1">持证</option>
                <option value="2">一线</option>
            </select>
            <select id="cate-select" onchange="initGroupByYear()" style="width: 50px; height: 30px; text-align: center; margin-top: 25px; margin-left: 10px; border: 1px solid #41578D; background: #476FA8; color: #fff;">
                <option value="1" selected >等级</option>
                <option value="2">学历</option>
            </select>
            <select id="chart-select" onchange="initGroupByYear()" style="width: 80px; height: 30px; text-align: center; margin-top: 25px; margin-left: 10px; border: 1px solid #41578D; background: #476FA8; color: #fff;">
                <option value="1" selected >饼图</option>
                <option value="2">柱形图</option>
            </select>
        </div>

        <div class="col-md-12">
                <div class="col-md-12">
                    <div id='sur-person-chart' style="width: 100%; height: 200px;"></div>
                </div>
        </div>
    </div>
</div>
    <script type="text/javascript" src="${ctx}/resources/script/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.min.js"></script>
    <script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.zh-CN.js"></script>
    <script type="text/javascript" src='${echarts}/echarts.min.js'></script>

<%--<script type="text/javascript" src='${ctx}/resources/script/chinasofti/ent/mainPanel.js'></script>--%>
    <script type="text/javascript">
        function initGroupByYear(){
           var rangVal=$("#rang-select option:selected").val();
           var typeStr=$("#cate-select option:selected").val();
           var chartType=$("#chart-select option:selected").val();
            var legendData=[];
            var seriesData=[];
           var  option3 ="";
            console.log(chartType)
            if(chartType=="1"){
                option3={
                    color: ['#ED3F49','#00AEFF','#00699A','#FED61c','rgba(64, 82, 114, 0.6)','#405272'],
                            backgroundColor: '#18204B',//背景色
                        tooltip: {
                    trigger: 'none',
                        //  trigger: 'item',
                            formatter: "{a} <br/>{b}: {c} ({d}%)"
                },
                    /*title: {
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
                                        formatter: '{c}  ({d}%)'

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
                            radius: ['69%', '79%'],
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
                    backgroundColor: '#18204B',//背景色
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
            var myChart = echarts.init(document.getElementById('sur-person-chart'));
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
        }

        $(function(){
            initGroupByYear(1);                                               //,'2016','2015','2014','2013'
        });

    </script>
</body>
</html>