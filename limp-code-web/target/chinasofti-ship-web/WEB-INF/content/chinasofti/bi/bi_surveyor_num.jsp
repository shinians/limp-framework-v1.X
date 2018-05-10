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
            <select id="rang-select" onchange="initGroupByYear(this.value)"
                    style="width: 150px; height: 30px; text-align: center; margin:2px 0px 5px 10px; border: 1px solid #41578D; background: #476FA8; color: #fff;">
                <%--<option  value=""> 范围类别</option>--%>
                <%--<option value="">全部</option>--%>
                <option value="1">持证</option>
                <option value="2">一线</option>
            </select>
        </div>
        <div class="col-md-12">
                <div class="col-md-12">
                    <div id='sur-person-chart' style="width: 100%; height: 260px;"></div>
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
      /*  function initGroupByYear(rang){
            console.log(rang)
        }*/
        function initGroupByYear(rangVal){
            var xarry=[];
            var yarry=[];
            var option = {
                color: ['#02B4F7','#0083A3','#00FCD1'],
                backgroundColor: '#18204B',//背景色
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
                    feature: {
                        saveAsImage: {}
                    }
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
            var myChart = echarts.init(document.getElementById('sur-person-chart'));
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
                console.log("-------ycs---")
                console.log(data)
                myChart.setOption(option);
            })
        }

        $(function(){

            initGroupByYear(1);                                               //,'2016','2015','2014','2013'

        });

    </script>
</body>
</html>