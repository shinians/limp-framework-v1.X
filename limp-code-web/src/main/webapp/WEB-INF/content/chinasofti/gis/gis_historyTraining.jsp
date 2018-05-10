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
        /*能力评分等级样式*/
        #abilityLevel{
            position: absolute;
            top: 14px;
            left: 47px;
            z-index: 1;
            color: #666;
        }
        .level1 img,.level2 img,.level3 img{
            width: 16px;
            height: 16px;
        }
        .legend{
            z-index: 9999;
            left:20px;
            bottom:31px;
            background-color: rgba(3, 13, 33, 0.58);
            color: #8aaece;
            height:200px;
        }
        .s1,.s2,.s3,.s4,.s5{
            width:32px;
            height:25px;
            display: inline-block;
            vertical-align: middle;
        }
        .s1{
            background-color:#CCFFFF;
        }
        .s2{
            background-color:#66FFFF;
        }
        .s3{
            background-color:#04CCCC;
        }
        .s4{
            background-color:#039999;
        }
        .s5{
            background-color:#024C4C;
        }
    </style>

    <script type="text/javascript" src="${script}/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="${supermap}/libs/SuperMap.Include.js"></script>
    <script type="text/javascript" src="${script}/chinasofti/gis/provinceCode.js"></script>
    <script type="text/javascript" src='${script}/js/template-web.js'></script>
    <script type="text/javascript" src="${script}/chinasofti/gis/translate.js"></script>
    <script type="text/javascript" src="${echarts}/echarts.min.js"></script>
<body onload="init()">
<div id="tools">

</div>
<div class="legend">
    <p>
        <span class="s1"></span>： <span>小于等于50人</span>
    </p>
    <p>
        <span class="s2"></span>： <span>大于50人小于等于100人</span>
    </p>
    <p>
        <span class="s3"></span>： <span>大于100人小于等于150人</span>
    </p>
    <p>
        <span class="s4"></span>： <span>大于150人小于等于200人</span>
    </p>
    <p>
        <span class="s5"></span>： <span>大于等于200人</span>
    </p>
</div>
<div id="map"></div>
<span class="showNews">
     <img src="../../../../resources/style/images/gisleft.png" alt="">
</span>
<div class="detailTal">
      <span class="hideNews">
          <img src="../../../../resources/style/images/gisright.png" alt="">
      </span>
    <h3 class="title03"><span class="traProvince"></span>渔船验船师培训情况统计表</h3>
    <ul class="train">
        <li>培训总人次为 <span class="trainTotal">0</span>人次</li>
        <li>上岗资格培训 <span class="entryTotal">0</span>人次，占比 <span class="entryPercent">0</span></li>
        <li>法规指南培训 <span class="professTotal">0</span>人次，占比 <span class="professPercent">0</span></li>
        <li>综合能力培训 <span class="abilityTotal">0</span>人次，占比 <span class="abilityPercent">0</span></li>
        <li>实践培训 <span class="shijianTotal">0</span>人次，占比 <span class="shijianPercent">0</span></li>
    </ul>
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
        var ztUrl = get_root + "/gis/getGisTrainData1";
        var dataUrl = system.dataUrl;
        var baseMap = system.echartsUrl;
        var tiandiMap = system.tiandiUrl;
        var tiandiVecMap = system.tiandiVecUrl;
        var trainUrl= get_root + "/gis/getGisTrainData2";
        var hisTrainUrl = get_root + "/gis/getGisTrainData3?uid=";
        var layer1,themLayer,arr,tools,map,utfgrid, control, chartLayer,tiandi,tiandiVct;
        var pieChartDom;
        var elementsDiv;
        var isMapMoving = false;
        var polygonLayer;
        var drawPolygon;
        var drawBounds,drawCircle,drawToLine;
        function OrgFun(option) {
            var self = this;
        }
        OrgFun.prototype = {
            check : function(){
                if(!document.createElement('canvas').getContext){
                    alert("您的浏览器不支持 Canvas，请升级！");
                    return false;
                }else{
                    return true;
                }
            },
            init : function(){
                var that = this;
                //检查用户浏览器
                if(!this.check()) return;
                //初始化地图
                polygonLayer = new SuperMap.Layer.Vector("polygonLayer");
                drawPolygon  = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.Polygon);

                //query
                drawBounds = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.Box);
                drawBounds.events.on({"featureadded": that.drawCompleted});

                //几何圆查询
                drawCircle = new SuperMap.Control.DrawFeature(polygonLayer,SuperMap.Handler.RegularPolygon,{handlerOptions:{sides:50}});
                drawCircle.events.on({"featureadded": that.drawCompleted});

                //测距
                drawToLine = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.Path, { multi: false });


                map = new SuperMap.Map("map", {
                    controls: [
                        new SuperMap.Control.Navigation() ,
                        new SuperMap.Control.ScaleLine(),
//                        new SuperMap.Control.LayerSwitcher(),
                        new SuperMap.Control.MousePosition(),
                        drawPolygon,
                        drawBounds,
                        drawCircle,
                        drawToLine
                    ],
                    projection: "EPSG:4326",
                });

                //地图移动过程中不显示图表
                map.events.on({"movestart": function(){
                    //document.getElementById("piechart").innerHTML = "";
                    pieChartDom.style.display = "none";
                    isMapMoving = true;
                }});
                map.events.on({"moveend": function(){
                    isMapMoving = false;
                }});

                layer1 = new SuperMap.Layer.TiledDynamicRESTLayer("China", baseMap, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
                themLayer = new SuperMap.Layer.Unique("ThemeLayer");
                themLayer.on("click", that.evn);

//创建 Elements 图层，用于显示饼图
                chartLayer = new SuperMap.Layer.Elements("eCharts");

//获取 Elements 图层 div
                elementsDiv = chartLayer.getDiv();
//设置Elements实例的div为地图大小
                var mapsize = map.getSize();
                elementsDiv.style.width = mapsize.w;
                elementsDiv.style.height = mapsize.h;

//创建图表 div, 设置其基本属性, 并添加到 Elements 图层
                pieChartDom = document.createElement("div");
                pieChartDom.id = "piechart";
                pieChartDom.style.width = "400px";
                pieChartDom.style.height = "240px";
                pieChartDom.style.position = "absolute";
                pieChartDom.style.opacity = 0.8;
                elementsDiv.appendChild(pieChartDom);
                pieClose=  document.createElement("div");

//创建 UTFGrid 图层，用于获取饼图所需信息
                utfgrid = new SuperMap.Layer.UTFGrid("UTFGridLayer",system.baseUrl ,
                    {
                        layerName: "China_Province_pl@China",
                        utfTileSize: 256,
                        pixcell: 8,
                        isUseCache: true
                    },
                    {
                        utfgridResolution: 8
                    });

                layer1.events.on({"layerInitialized":that.addLayer.bind(this)});
                control = new SuperMap.Control.UTFGrid({
                    layers: [utfgrid],
                    callback:that.callback.bind(this),
                    handlerMode: "click"
                });
                utfgrid.maxExtent = new SuperMap.Bounds(-180.0 ,-85.05,180.0,85.05 );
                map.addControl(control);
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
            callback: function(infoLookup, loc, pixel){
                if (infoLookup && isMapMoving === false) {
                    for (var idx in infoLookup) {
                        infoo = infoLookup[idx];
                        if (infoo && infoo.data) {
                            console.log(infoo)
                            $("#piechart").innerHTML = "#F4F3F0";
                            $("#piechart").css({
                                borderRadius : "5px"
                            })
                            pieChartDom.style.display = "block";

                            // 基于准备好的dom，初始化echarts图表
                            myChart = echarts.init(pieChartDom);
                            // echart 图表配置参数
                            var option = {
                                backgroundColor:"#F4F3F0",
                                title : {
                                    text: infoo.data.NAME +'省验船师培训人次分布图',
                                    x:'center'
                                },
                                tooltip : {
                                    trigger: 'item',
                                    formatter: "{b} : {c} ({d}%)"
                                },
                                legend: {
                                    orient: 'vertical',
                                    left: 'left',
                                    top:20,
                                    data: ['部局组织的培训人次','地方组织的培训人次']
                                },
                                series : [
                                    {
                                        type: 'pie',
                                        radius : '55%',
                                        center: ['50%', '60%'],
                                        data:[],
                                        itemStyle: {
                                            emphasis: {
                                                shadowBlur: 10,
                                                shadowOffsetX: 0,
                                                shadowColor: 'rgba(0, 0, 0, 0.5)'
                                            }
                                        }
                                    }
                                ]
                            };
                            this.pieData(infoo);
                            // 为echarts对象加载数据
                            myChart.setOption(option);

                            // 图表位置
                            pieChartDom.style.left = (pixel.x + 20) + "px";
                            pieChartDom.style.top = (pixel.y - 20) + "px";

                        }
                        else{
                            //清除饼图
                            $("#piechart").innerHTML = "";
                            pieChartDom.style.display = "none";
                        }
                    }
                }
            },
            pieData: function(infoo){
            var score=[];
            for (var i = 0; i < provinceArr.length; i++) {
                if (provinceArr[i].name == infoo.data.NAME) {
                    orgCode = provinceArr[i].value;   //1100000
                    var this_url = trainUrl + "?uid=" + orgCode;
                    $.get(this_url, function (data) {
                        var scoreData =JSON.parse(data);
                        for(var j=0;j<scoreData.result.length;j++){
                            if(scoreData.result[j].NAME =="地方组织"){
                                score.push({
                                    name:scoreData.result[j].NAME+"的培训人次",
                                    value:scoreData.result[j].VALUE
                                });
                            }else if(scoreData.result[j].NAME =="部局组织"){
                                score.push({
                                    name:scoreData.result[j].NAME+"的培训人次",
                                    value:scoreData.result[j].VALUE
                                })
                            }
                        }
                        myChart.setOption({
                            series:{
                                data:score
                            }
                        })
                    })
                }

            }
            },
            evn : function(e){
                if(e.target && e.target.refDataID){
                    $("#surNews").css({"display":"block"});
                    var fid = e.target.refDataID;
                    var fea = themLayer.getFeatureById(fid);
                    $('.traProvince').html(fea.attributes.NAME);
                    for(var i = 0;i<provinceArrSimple.length;i++){

                        if(provinceArrSimple[i].name == fea.attributes.NAME){
                            var orgCode = provinceArrSimple[i].value;

                            var url = hisTrainUrl + orgCode;

                            $.ajax({
                                url:url ,
                                type:'get',
                                datatype: 'json',
                                success : function(data){
                                    var data = JSON.parse(data);
                                    //console.log(data);
                                    var result = data.result;
                                    for(var i=0;i<result.dataList.length;i++){
                                          $(".trainTotal").html(result.totalNums);
                                          if(result.dataList[i].TRAINCATE=="1"){
                                              $(".entryTotal").html(result.dataList[i].NUMS);
                                              $(".entryPercent").html(Math.round(result.dataList[i].NUMS/result.totalNums * 10000)/100.00 + "%");
                                          }else if(result.dataList[i].TRAINCATE=='2'){
                                              $(".professTotal").html(result.dataList[i].NUMS);
                                              $(".professPercent").html(Math.round(result.dataList[i].NUMS/result.totalNums* 10000)/100.00 + "%");
                                          }else if(result.dataList[i].TRAINCATE=='3'){
                                              $(".abilityTotal").html(result.dataList[i].NUMS);
                                              $(".abilityPercent").html(Math.round(result.dataList[i].NUMS/result.totalNums* 10000)/100.00 + "%");
                                          }else if(result.dataList[i].TRAINCATE=='4'){
                                              $(".shijianTotal").html(result.dataList[i].NUMS);
                                              $(".shijianPercent").html(Math.round(result.dataList[i].NUMS/result.totalNums* 10000)/100.00 + "%")
                                          }
                                    }
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
                map.addLayers([tiandiVct,layer1,tiandi,polygonLayer,themLayer,chartLayer,utfgrid]);
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
                    drawLine :  drawToLine,
                    //drawAreaCompletedCB : that.measureAreaCompleted,
                });
                that.clearIt();
                that.ctDataInit();
                that.mapChange();
                that.queryData();
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
            mapChange : function(){

                $('#zidingyiMap').trigger('click');
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
            // 初始化
            ctDataInit : function(){
                this.ctDZInit();
                var options = {
//                    传递数据源参数
                    source: 'China',
                    dataSourceName: 'China:Provinces_R'
                }
                this.getDanzhi(options);
            },
            ctDZInit : function(){
                //单值专题图透明度设置
                themLayer.setOpacity(0.7);
                themLayer.style = {
                    stroke : true,
                    strokeWidth : 2,
                    strokeColor : "#fff",
                    strokeLinecap : "butt"
                };
                //hover样式开关
                themLayer.isHoverAble = true;
                //hover样式
                themLayer.highlightStyle = {
                    stroke: true,
                    strokeWidth: 2,
                    strokeColor: '#ECF600',
                    fillColor: "#00F5FF",
                    fillOpacity: 0.1
                };
                themLayer.themeField = "NAME";
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
                            for(var i = 0;i<arr.length;i++){
                                var dataObj = new Object();
                                if(arr[i].TRAINNUMS<=50){
                                    color = '#CCFFFF';
                                    dataObj = {
                                        value : arr[i].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }else if(arr[i].TRAINNUMS<=100&&arr[i].TRAINNUMS>50){
                                    color = '#66FFFF';
                                    dataObj = {
                                        value : arr[i].PROVNAME,
                                        style : {fillColor : color}
                                    }

                                }else if(arr[i].TRAINNUMS<=150&&arr[i].TRAINNUMS>100){
                                    color = '#04CCCC';
                                    dataObj = {
                                        value : arr[i].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }else if(arr[i].TRAINNUMS<=200&&arr[i].TRAINNUMS>150){
                                    color = '#039999';
                                    dataObj = {
                                        value : arr[i].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }else if(arr[i].TRAINNUMS>200){
                                    color = '#024C4C';
                                    dataObj = {
                                        value : arr[i].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }
                                themLayer.styleGroups.push(dataObj)
                            }
                        }
                    }
                });
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
//                console.log(result);
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
                    themLayer.addFeatures(feas);
                }
            },
            processFailed : function(){
                layer1.msg(e.error.errorMsg);
            }
        }
        return new OrgFun(options);
    }

</script>
</head>
</html>