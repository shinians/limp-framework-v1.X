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
            <select id="rang-select" onchange="initYCSGroupByLV(this.value)"
                    style="width: 150px; height: 30px; text-align: center; margin:1px 0px 2px 10px; border: 1px solid #41578D; background: #476FA8; color: #fff;">
            <%--<option  value=""> 范围类别</option>--%>
                <%--<option value="">全部</option>--%>
                <option value="1">持证</option>
                <option value="2">一线</option>
            </select>
        </div>
        <div class="col-md-12">
                <div class="col-md-12 box bi-box02">
                    <div id='sur-person-chart' style="width: 100%; height: 240px;"></div>
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

        function initYCSGroupByLV(rangVal){


            var seriesData=[];
            var xdata=[]; // ['高级验船师','中级验船师','普通验船师'],
            var legendDdata=[];//['本科','专科','高中']=[];
            var myChart = echarts.init(document.getElementById('sur-person-chart'));
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
                for(var m in data.result){
                    var domain=data.result[m];
                    //x坐标轴
                    console.log("domain")
                    console.log(domain)
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
                    backgroundColor: '#2A456B',//背景色
                    tooltip : {
                        trigger: 'axis',
                        axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                            type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                        }
                    },
                    title: {
                        text: '各级持证验船师学历结构情况',
                        x : '20px' ,
                        y:'-1px',
                        textStyle: {
                            fontSize: 20,
                            fontWeight: 'bolder',
                            color: '#FFF'          // 主标题文字颜色
                        },

                    },
                    legend: {
                        //  orient: 'vertical',
                        left: 'right',
                        textStyle: {
                            color: '#00C6FF'          // 图例文字颜色
                        },
                        y: '30px',
                        data:legendDdata
                    },

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
                        data :xdata,

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
                    series : seriesData
                };
                myChart.setOption(option);
            })
        }

        $(function(){
            initYCSGroupByLV();
        })
    </script>
</body>
</html>