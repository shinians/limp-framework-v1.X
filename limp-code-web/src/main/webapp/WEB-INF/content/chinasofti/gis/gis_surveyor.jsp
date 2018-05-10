<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<%@include file="/WEB-INF/content/chinasofti/common/head.jsp" %>
<html>
<head>
    <meta charset="utf-8">
    <title>GIS_渔船检验机构能力分布</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="stylesheet" href="${style}/css/system-construction.css">
    <link rel="stylesheet" href="${style}/css/font-awesome-4.7.0/css/font-awesome.css">
    <style type="text/css">
        body{
            margin: 0;
            overflow: hidden;
            background: #fff;
        }
        #map{
            position: relative;
            height: 900px;
            border:1px solid #3473b7;
        }

        #charts{
            width: 550px;
            height:350px;
            background-color:#666 !important;
        }
        .chartsDetail{
            padding:5px;
            border:none;
            top:42px;
            -webkit-border-radius: 5px;
            -moz-border-radius: 5px;
            border-radius: 5px;
            background-color: #fff;
            position: absolute;
            right: 20px;
        }
        .showNews{
            visibility: hidden;
        }


        /*table样式*/

    </style>
    <script type="text/javascript" src="${supermap}/libs/SuperMap.Include.js"></script>
    <script type="text/javascript" src="${script}/chinasofti/gis/provinceCode.js"></script>
    <script type="text/javascript" src='${script}/js/template-web.js'></script>
    <script type="text/javascript" src="${script}/chinasofti/gis/translate.js"></script>
    <script type="text/javascript" src="${echarts}/echarts.min.js"></script>
    <style>
        .legend{
            z-index: 9999;
            width:295px;
            left:20px;
            bottom:35px;
            height:118px;
            background-color: rgba(3, 13, 33, 0.58);
            color: #8aaece;
        }
        .legend_block{
            display: inline-block;
            width: 32px;
            height: 25px;
            margin-bottom: -7px;
            opacity:0.5;
        }
    </style>
</head>

<body onload="init()">
<div id="tools">

</div>
<div id="map"></div>
<span class="showNews">
     <img src="${style}/images/gisleft.png" alt="">
</span>
<div class="legend">
    <p>
        <span class="legend_block" style="background-color:#FF0033;"></span>： <span> 小于最低匹配人数</span>
    </p>
    <p>
        <span class="legend_block" style="background-color:#CC00CC;"></span>： <span> 优秀匹配人数与最低匹配人数之间</span>
    </p>
    <p>
        <span class="legend_block" style="background-color:#66CC99;"></span>： <span> 大于优秀匹配人数  </span>
    </p>
</div>
<div id="surNews" class="detailTal">
      <span class="hideNews">
          <img src="${style}/images/gisright.png" alt="">
      </span>
    <h3 class="title03">验船师人数统计</h3>
    <p><span>当前地区：</span><span class="province">全国</span></p>
    <table class="surCount">
        <thead>
        <tr>
            <th colspan="3">缺口人数（与最低人数比）</th>
            <th colspan="3">最低规定匹配人数</th>
            <th colspan="3">实际匹配人数</th>
        </tr>
        <tr>
            <th>船体</th>
            <th>机电</th>
            <th>其他</th>

            <th>船体</th>
            <th>机电</th>
            <th>其他</th>

            <th>船体</th>
            <th>机电</th>
            <th>其他</th>
        </tr>
        </thead>
        <tbody>

        <tr class="content">
            <td class="q1">0</td>
            <td class="q2">0</td>
            <td class="q3">0</td>

            <td class="low1">0</td>
            <td class="low2">0</td>
            <td class="low3">0</td>

            <td class="com1">0</td>
            <td class="com2">0</td>
            <td class="com3">0</td>
        </tr>
        </tbody>
    </table>
</div>

</body>


<script>

    var height = top.document.body.clientHeight
    $('#map').css({
        height: height
    })

    function init(){
        var org = new Org();
        org.init();
    }
    function Org(options){
        //点击区域返回数据url
        var ztUrl = get_root + "/gis/getGisSurData1";
        //单值专题图K线图url
        var orgChartUrl = get_root + "/gis/getGisSurData2?uid=";
        var baseMap = system.echartsUrl;
        var tiandiMap = system.tiandiUrl;
        var tiandiVecMap = system.tiandiVecUrl;
        var dataUrl = system.dataUrl;
        var layer1,danZhiLayer,map,tools,arr,chartLayer,tiandi,elementsDiv,polygonLayer,drawPolygon,pieChartDom,tiandiVct;
        var drawBounds,drawCircle,drawToLine;
        function OrgFun(option) {
            var self = this;
        }
        OrgFun.prototype = {
            check : function(){
                if(!document.createElement('canvas').getContext){
                    alert("您的浏览器不支持 Canvas ，请升级！");
                    return false;
                }else{
                    return true;
                }
            },
            init : function(){
                var that = this;
                //检查用户浏览器
                if(!this.check()) return;
                polygonLayer = new SuperMap.Layer.Vector("polygonLayer");
                drawPolygon  = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.Polygon);

                //query
                drawBounds = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.Box);
                drawBounds.events.on({"featureadded": that.drawCompleted});

                //几何圆查询
                drawCircle = new SuperMap.Control.DrawFeature(polygonLayer,SuperMap.Handler.RegularPolygon,{handlerOptions:{sides:50}});
                drawCircle.events.on({"featureadded": that.drawCompleted});

                //测距
                drawToLine = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.Path, { multi: true });

                //初始化地图
                map = new SuperMap.Map("map", {
                    controls: [
                        new SuperMap.Control.Navigation() ,
                        new SuperMap.Control.ScaleLine(),
                        new SuperMap.Control.MousePosition(),
                        drawPolygon,
                        drawBounds,
                        drawCircle,
                        drawToLine
                    ],
                    projection: "EPSG:4326"
                });

                layer1 = new SuperMap.Layer.TiledDynamicRESTLayer("China", baseMap, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
                danZhiLayer = new SuperMap.Layer.Unique("ThemeLayer");
                chartLayer = new SuperMap.Layer.Elements("eCharts");
                elementsDiv = chartLayer.getDiv();
                var mapsize = map.getSize();
                elementsDiv.style.width = mapsize.w;
                elementsDiv.style.height = mapsize.h;

                pieChartDom = document.createElement("div");
                pieChartDom.id = "piechart123";
                pieChartDom.style.width = "550px";
                pieChartDom.style.height = "340px";
                pieChartDom.style.position = "absolute";
                pieChartDom.style.opacity = 0.8;
                elementsDiv.appendChild(pieChartDom);
                

                map.events.on({"movestart": function(){
//                    $("#piechart123").innerHTML = "";
                    $('.hideNews').trigger('click');
                    pieChartDom.style.display = "none";
                }});
                danZhiLayer.on("click", that.evn);
                layer1.events.on({"layerInitialized":that.addLayer.bind(this)});
            },
            drawCompleted : function(drawBoundsArgs){
                // 获取传入参数 drawBoundsArgs 的几何信息
                drawBounds.deactivate();
                drawCircle.deactivate();
                var feature = drawBoundsArgs.feature;
                var myGeometry = feature.geometry;
                feature.style = {
                    strokeColor: "#17be54",
                    strokeWidth: 1,
                    pointerEvents: "visiblePainted",
                    fillColor: "#17be54",
                    fillOpacity: 0.5
                };
                polygonLayer.addFeatures(feature);
//                var bounds = feature.geometry.bounds;
//                //vectorLayer.removeAllFeatures();
//                var GetFeaturesByBoundsParameters, getFeaturesByGeometryService;
//                GetFeaturesByBoundsParameters = new SuperMap.REST.GetFeaturesByBoundsParameters({
//                    datasetNames : ["World:Capitals"],
//                    spatialQueryMode:SuperMap.REST.SpatialQueryMode.INTERSECT,
//                    bounds: bounds
//                });
//                getFeaturesByGeometryService = new SuperMap.REST.GetFeaturesByBoundsService(system.measureUrl, {
//                    eventListeners: {
//                        "processCompleted": this.processCompleted,
//                        "processFailed": this.processFailed
//                    }
//                });
//                getFeaturesByGeometryService.processAsync(GetFeaturesByBoundsParameters);
            },
            evn : function(e){
                var event = e.event;
                if(e.target && e.target.refDataID){
                    var fid = e.target.refDataID;
                    var fea = danZhiLayer.getFeatureById(fid);
                    $('#surNews').hide();
                    $('.province').html(fea.attributes.NAME);
                    for(var i = 0;i<provinceArrSimple.length;i++){
                        if(provinceArrSimple[i].name == fea.attributes.NAME){
                            var orgCode =  provinceArrSimple[i].value;
                            var url = orgChartUrl + orgCode;
                            $.ajax({
                                url:url ,
                                type:'get',
                                datatype: 'json',
                                success : function(data){
                                    var data = JSON.parse(data);
                                    var result = data.result;
                                    console.log(result);
                                    pieChartDom.style.display = "block";

                                    $('#piechart123').html("<div id='charts'></div><button class='chartsDetail'>查看详情</button>");

                                    pieChartDom.style.left = (event.x + 20) + "px";
                                    pieChartDom.style.top = (event.y - 20) + "px";
                                    //TODO K线图
                                    var minArr = [];
                                    var dataArr = [];
                                    var quekou = [];
                                    var quekouu = [];
                                    var GToMin = [];
                                    var expeop = [];
                                    var betwnpeopp = [];
                                    var ycsNum = [];


                                    for(var i = 0 ;i<result.length;i++){
                                        ycsNum.push(result[i].REALNUMS);
                                        GToMin.push(result[i].MAXNUMS - result[i].MINNUMS);
                                        minArr.push(result[i].MINNUMS);
                                        dataArr.push(result[i].TYPE);
                                        if(result[i].REALNUMS<result[i].MINNUMS){
                                            expeop.push(0);
                                            betwnpeopp.push(0);
                                            quekou.push(result[i].MINNUMS - result[i].REALNUMS);
                                            quekouu.push(result[i].MINNUMS - (result[i].MINNUMS - result[i].REALNUMS));
                                        }else if(result[i].REALNUMS>result[i].MAXNUMS){
                                            expeop.push(result[i].REALNUMS - result[i].MAXNUMS);
                                            betwnpeopp.push(0);
                                            quekou.push(0);
                                            quekouu.push(0);
                                        }else if((result[i].REALNUMS<=result[i].MAXNUMS) && (result[i].REALNUMS>=result[i].MINNUMS)){
                                            betwnpeopp.push(result[i].REALNUMS - result[i].MINNUMS);
                                            expeop.push(0);
                                            quekou.push(0);
                                            quekouu.push(0);
                                        }
                                    }
                                

                                    var option  = {
                                        xAxis:[{data:dataArr}],
                                        series : [
                                            {
                                                // name:'助',
                                                type:'bar',
                                                stack: '总量',
                                                barWidth:'50px',
                                                itemStyle:{
                                                    normal:{
                                                        barBorderColor:'rgba(19,240,221,1)',
                                                        borderType:"dashed",
                                                        color:'rgba(0,0,0,0)'
                                                    }
                                                },
                                                data:minArr
                                            },
                                            {
                                                // name: '缺口人数',
                                                //缺口位置
                                                type: 'bar',
                                                stack: '缺口',
                                                barWidth:'50px',
                                                itemStyle:{
                                                    normal:{
                                                        barBorderColor:'rgba(47,178,19,0)',
                                                        color:'rgba(0,0,0,0)'
                                                    }
                                                },
                                                data: quekouu,
                                                barGap:'-100%',
                                            },
                                            {
                                                name: '缺口人数',
                                                type: 'bar',
                                                stack: '缺口',
                                                barWidth:'50px',
                                                label: {
                                                    normal: {
                                                        color:'#ff2b00'
                                                    }
                                                },
                                                data: quekou,
                                                barGap:'-100%',
                                            },
                                            {
                                                name: '优秀至最低人数',
                                                type: 'bar',
                                                stack: '总量',
                                                barWidth:'50',
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
                                                        barBorderColor: '#fff',
                                                        // borderWidth:'20',
                                                        barBorderWidth:3,
                                                        barBorderRadius:0,
                                                        borderType:"dashed"
                                                    }
                                                },
                                                data: GToMin
                                            },
                                            {
                                                name: '超出人数',
                                                type: 'bar',
                                                stack: '总量',
                                                barWidth:'50',
                                                label: {
                                                    normal: {
                                                        show: false,
                                                        position: 'insideRight'
                                                    }
                                                },
                                                data: expeop,
                                                itemStyle:{
                                                    normal:{
                                                        color:'#07ED90'
                                                    }
                                                },
                                                barGap:'-100%',
                                            },
                                            {
                                                // name:'助',
                                                type:'bar',
                                                stack: '总',
                                                barWidth:'48px',
                                                itemStyle:{
                                                    normal:{
                                                        barBorderColor:'rgba(47,178,19,0)',
                                                        color:'rgba(0,0,0,0)'
                                                    }
                                                },
                                                data:minArr,
                                                barGap:'-95%'
                                            },
                                            {
                                                name:'介于最低和优秀之间',
                                                type:'bar',
                                                stack: '总',
                                                barWidth:'49px',
                                                itemStyle:{
                                                    normal:{
                                                        barBorderColor:'#ae70c1',
                                                        borderWidth:'1',
                                                        color:'#ae70c1'
                                                    }

                                                },
                                                data:betwnpeopp,
                                                barGap:'-100%'
                                            },
                                            {
                                                name:'实际人数',
                                                type:'line',
                                                itemStyle : {  /*设置折线颜色*/
                                                    normal : {
                                                        color:'#54f400'
                                                    }
                                                },
                                                data:ycsNum
                                            }
                                        ],
                                    }
                                    

                                    $('.chartsDetail').on('click',function(){
                                         $('.showNews').trigger("click");
                                         for(var i = 0 ;i<result.length;i++){
                                             if(result[i].TYPE == '机电'){
                                                 $('.q2').html(result[i].GAPNUMS);
                                                 $('.low2').html(result[i].MINNUMS);
                                                 $('.com2').html(result[i].REALNUMS);
                                             }else if(result[i].TYPE == '船体'){
                                                 $('.q1').html(result[i].GAPNUMS);
                                                 $('.low1').html(result[i].MINNUMS);
                                                 $('.com1').html(result[i].REALNUMS);
                                             }else if(result[i].TYPE == '其他'){
                                                 $('.q3').html(result[i].GAPNUMS);
                                                 $('.low3').html(result[i].MINNUMS);
                                                 $('.com3').html(result[i].REALNUMS);
                                             }
                                         }
                                    })
                                    //var myChart = echarts.init(document.getElementById('charts'));
                                    $("#charts").initBIOption(option,12,{})
                                    //myChart.setOption(option);

                                }
                            })
                        }
                    }
                    
                }
            },
            addLayer : function(){
                var that = this;
                tiandi =  new SuperMap.Layer.TiledDynamicRESTLayer("China", tiandiMap, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
                tiandi.events.on({"layerInitialized":that.addLayer2.bind(this)});
            },
            addLayer2 : function(){

                var that = this;
                tiandiVct = new SuperMap.Layer.TiledDynamicRESTLayer("China2", tiandiVecMap, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
                tiandiVct.events.on({"layerInitialized":that.addLayer3.bind(this)});

            },
            addLayer3 : function(){
                var that = this;
                map.addLayers([tiandiVct,layer1,tiandi,polygonLayer,danZhiLayer,chartLayer]);
                map.setCenter(new SuperMap.LonLat(108.067923, 32.679943),3);

                tools = new ToolsNav({
                    id : "#tools",
                    map : map,
                    layui : layui,
                    callback : that.toolsEvn,
                    tiandiLayer : tiandi,
                    googleLayer : tiandiVct,
                    zidingyiLayer : layer1,
                    areaStyle  :  {
                        strokeColor: "#E83015",
                        strokeWidth: 2,
                        pointerEvents: "visiblePainted",
                        fillColor: "#E83015",
                        fillOpacity: 0.8
                    },
                    polygonLayer : polygonLayer,
                    drawPolygon : drawPolygon,
                    drawLine : drawToLine,
                    //drawAreaCompletedCB : that.measureAreaCompleted,
                });

                that.ctDataInit();
                that.getAllData();
                that.mapChange();
                that.queryData();
                that.clearIt();
            },
            clearIt : function(){
                $("#clearIt").on('click',function(){
                    polygonLayer.removeAllFeatures();
                    //circleLayer.removeAllFeatures();
                    //清除Mark层
                })
            },
            queryData:function(){
                $('#query').on('click',function(){
                    console.log("--方搜----");
                    drawBounds.activate();
                });
                //圆搜
                $("#queryCircle").on('click',function(){
                    console.log("---圆搜----");
                    drawCircle.activate();
                })
            },
            toolsEvn : function(){
                var element = layui.element();
//                    //必加此行代码激活layui属性
                element.init();
                var ele = $('.shipDrop', window.parent.document);

                if($(ele).hasClass('deBounce')){
                    var ele = $(".mainTitle");
                    if(ele){
                        $(ele).animate(
                            {
                                top : "61px"
                            }
                        )
                    }
                }


            },
            mapChange : function(){
                //初始化
                $('#zidingyiMap').trigger('click');
            },
            measureAreaCompleted : function(measureEventArgs){
                var area = measureEventArgs.result.area,
                    unit = measureEventArgs.result.unit;
                layer.msg("量算结果:"+ area + "平方米");
            },
            getAllData : function(){
                $.ajax({
                    url:ztUrl ,
                    type:'get',
                    datatype: 'json',
                    success : function(data){
                        var data = JSON.parse(data);
                        //TODO 获取全国的数据


                    }
                })
            },
            ctDataInit : function(){
                this.ctDZInit();
                var options = {
                    source: 'China',
                    dataSourceName: 'China:Provinces_R'
                }
                this.getDanzhi(options);
            },
            ctDZInit : function(){
                //单值专题图透明度设置
                danZhiLayer.setOpacity(0.6);
                danZhiLayer.style = {
                    stroke : true,
                    strokeWidth : 2,
                    strokeColor : "#fff",
                    strokeLinecap : "butt"
                };
                //hover样式开关
                danZhiLayer.isHoverAble = true;
                //hover样式
                danZhiLayer.highlightStyle = {
                    stroke: true,
                    strokeWidth: 2,
                    strokeColor: '#ECF600',
                    fillColor: "#00F5FF",
                    fillOpacity: 0.1
                };
                danZhiLayer.themeField = "NAME";
                var dzData;
                $.ajax({
                    url: ztUrl,
                    type:'get',
                    datatype: 'json',
                    success: function (data) {
                        if(data.msg = 'success'){
                            dzData = JSON.parse(data);
                            dzData = dzData.result;
                            arr = translateCode(dzData);
                            var color;
                            var dzArr = [];
                            for(var i = 0;i<arr.length;i++){
                                var dataObj = new Object();
                                if(arr[i].REALNUMS < arr[i].MINNUMS){
                                    color = '#CC6633';
                                    dataObj = {
                                        value : arr[i].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }else if(arr[i].REALNUMS > arr[i].MINNUMS && arr[i].REALNUMS < arr[i].MAXNUMS ){
                                    color = '#CC99FF';
                                    dataObj = {
                                        value : arr[i].PROVNAME,
                                        style : {fillColor : color}
                                    }

                                }else if(arr[i].REALNUMS > arr[i].MAXNUMS){
                                    color = '#66CC99';
                                    dataObj = {
                                        value : arr[i].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }
                                danZhiLayer.styleGroups.push(dataObj)
                            }
                        }
                    }
                })
            },
            getDanzhi : function(options){
                var dataSource = options.source;
                var dataSourceName = [];
                dataSourceName.push(String(options.dataSourceName))
                var layerName = options.layerName;

                var getFeatureParam, getFeatureBySQLService, getFeatureBySQLParams;

                getFeatureParam = new SuperMap.REST.FilterParameter({
                    //数据源
                    name: dataSource
                });
                getFeatureBySQLParams = new SuperMap.REST.GetFeaturesBySQLParameters({
                    queryParameter: getFeatureParam,
                    toIndex: 500,
                    //数据集
                    datasetNames: dataSourceName
                });

                getFeatureBySQLService = new SuperMap.REST.GetFeaturesBySQLService(dataUrl, {
                    eventListeners: {
                        "processCompleted": this.processCompleted,
                        "processFailed": this.processFailed
                    }
                });
                getFeatureBySQLService.processAsync(getFeatureBySQLParams);

            },
            processCompleted : function(getFeaturesEventArgs){
                var result = getFeaturesEventArgs.result;
                var feas = [];
                if(result && result.features) {
                    var features = result.features;
                    for(var i = 0, len = features.length; i < len; i++) {
                        for(var k = 0;k<arr.length;k++){
                            var feature = features[i];
                            if(arr[k].PROVNAME == feature.attributes.NAME){
                                feas.push(feature);
                            }
                        }

                    }
                    danZhiLayer.addFeatures(feas);
                }
            },
            processFailed : function(){
                layer1.msg(e.error.errorMsg);
            }
        }
        return new OrgFun(options);
    }

</script>
</html>