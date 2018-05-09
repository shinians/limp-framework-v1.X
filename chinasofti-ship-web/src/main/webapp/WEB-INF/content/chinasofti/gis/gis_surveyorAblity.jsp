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
    <script type="text/javascript" src="${script}/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="${supermap}/libs/SuperMap.Include.js"></script>
    <script type="text/javascript" src="${script}/chinasofti/gis/provinceCode.js"></script>
    <script type="text/javascript" src='${script}/js/template-web.js'></script>
    <script type="text/javascript" src="${script}/chinasofti/gis/translate.js"></script>
    <script type="text/javascript" src="${echarts}/echarts.min.js"></script>
    <style type="text/css">
        body{
            margin: 0;
            overflow: hidden;
            background: #fff;
        }
        #map{
            position: relative;
            height:100%;
            border:1px solid #3473b7;
        }
        /*能力评分等级样式*/

        .level1 img,.level2 img,.level3 img{
            width: 16px;
            height: 16px;
        }
        .num td{
            height: 20px;
        }
        .legend{
            left: 30px;
            height:250px;
            z-index: 9999;
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
        /*.tiandiMap{*/
        /*width:110px;*/
        /*height:110px;*/
        /*position:absolute;*/
        /*background-color: red;*/
        /*}*/

    </style>
<body onload="init()">

<%--<div class="tiandiMap"></div>--%>

<%--<div class="googleMap"></div>--%>

<%--<div class="zidingyMap"></div>--%>
<div id="tools">

</div>
<%--<ul class="layui-nav" lay-filter="">--%>
<%--<li class="layui-nav-item">--%>
<%--<a href="javascript:;"><i class="fa fa-map"></i>地图切换</a>--%>
<%--<dl class="layui-nav-child"> <!-- 二级菜单 -->--%>
<%--<dd><a class="navItem" id="tiandiMap" ><img class="mapImage" src="${style}/images/tiandiMap.png" alt="">天地图（影像）</a></dd>--%>
<%--<dd><a class="navItem" id="tiandiMapOther" ><img class="mapImage" src="${style}/images/tiandiMap.png" alt="">天地图（投影）</a></dd>--%>
<%--<dd><a class="navItem" id="oceanMap" ><img class="mapImage" src="${style}/images/tiandiMap.png" alt="">天地图（投影）</a></dd>--%>
<%--<dd><a class="navItem" id="googleMap" ><img  class="mapImage" src="${style}/images/googleMap.png" alt="">谷歌影像图</a></dd>--%>
<%--<dd><a class="navItem" id="zidingyiMap"><img  class="mapImage" src="${style}/images/zidingyiMap.png" alt="">酷黑图</a></dd>--%>
<%--</dl>--%>
<%--</li>--%>
<%--<li class="layui-nav-item">--%>
<%--<a href="javascript:;"><i class="fa fa-wrench"></i>工具</a>--%>
<%--<dl class="layui-nav-child"> <!-- 二级菜单 -->--%>
<%--<dd><a><i class="fa fa-arrows-h"></i>测距</a></dd>--%>
<%--<dd><a><i class="fa fa-arrows-alt"></i>全屏</a></dd>--%>
<%--</dl>--%>
<%--</li>--%>
<%--</ul>--%>
<div style="height:100%;">
    <div id="map"></div>
</div>

<div class="legend">
    <p>
        <span class="legend_block" style="background-color:#C7DEFE;"></span>： <span>验船师人数小于100人</span>
    </p>
    <p>
        <span class="legend_block" style="background-color:#B2D3FE;"></span>： <span>验船师人数大于100人小于300人</span>
    </p>
    <p>
        <span class="legend_block" style="background-color:#A3C6FE;"></span>： <span>验船师人数大于300人小于500人</span>
    </p>
    <p>
        <span class="legend_block" style="background-color:#79ADFF;"></span>： <span>验船师人数大于500人小于700人</span>
    </p>
    <p>
        <span class="legend_block" style="background-color:#6DA4FF;"></span>： <span>验船师人数大于700人小于1000人</span>
    </p>
    <p>
        <span class="legend_block" style="background-color:#217CFE;"></span>： <span>验船师人数大于1000人</span>
    </p>
</div>
<span class="showNews">
     <img src="${style}/images/gisleft.png" alt="">
</span>
<div id="surNews" class="detailTal">
      <span class="hideNews">
          <img src="${style}/images/gisright.png" alt="">
      </span>
    <h3 class="title03">验船师人数统计</h3>
    <table class="surCount">
        <thead>
        <tr>
            <th rowspan="2">验船师总数</th>
            <th colspan="4">验船师级别</th>
            <th colspan="4">验船师学历</th>
            <th colspan="3">验船师专业</th>
        </tr>
        <tr>
            <th>高级验船师</th>
            <th>中级验船师</th>
            <th>助理验船师</th>
            <th>验船员</th>
            <th>硕士及以上</th>
            <th>大学本科</th>
            <th>大专学历</th>
            <th>中专学历</th>
            <th>相关专业</th>
            <th>相似专业</th>
            <th>其他专业</th>
        </tr>
        </thead>
        <tbody>
        <tr class="num">
            <td class="num1">0</td>
            <td class="num2">0</td>
            <td class="num3">0</td>
            <td class="num4">0</td>
            <td class="num5">0</td>
            <td class="num6">0</td>
            <td class="num7">0</td>
            <td class="num8">0</td>
            <td class="num9">0</td>
            <td class="num10">0</td>
            <td class="num11">0</td>
            <td class="num12">0</td>
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
    // $('#nav_iframe', window.parent.document).css({
    //     minHeight : height
    // })
    function init(){
        var org = new Org();
        org.init();
    }
    function Org(options){
        var ztUrl = get_root + "/gis/getSurAbilityData1";
        //var baseMap = system.tiandiUrl;
        var baseMap = system.echartsUrl;
        var tiandiMap = system.tiandiUrl;
        var tiandiVecMap = system.tiandiVecUrl;
        var dataUrl = system.dataUrl;
        var abilityUrl=get_root + "/gis/getSurAbilityData2";
        var sur_url = get_root + '/gis/getSurAbilityData3';
        var layer1,panzoombar,themLayer,control,arr,utfgrid,chartLayer,tiandi,tiandiVct,polygonLayer,circleLayer,drawPolygon;
        var pieChartDom;
        var infoo,orgCode;
        var elementsDiv;
        var isMapMoving = false;
        var isOneData = "";
        var theDataCache;
        var tools;
        var ShiftCorrectMethod = 0;
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
                drawPolygon = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.Polygon);

                //query
                drawBounds = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.Box);
                drawBounds.events.on({"featureadded": that.drawCompleted});

                //几何圆查询
                drawCircle = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.RegularPolygon,{handlerOptions:{sides:50}});
                drawCircle.events.on({"featureadded": that.drawCompleted});

                //测距
                drawToLine = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.Path, { multi: true });

                //that.setIfm();
                map = new SuperMap.Map("map", {
                    controls: [
                        new SuperMap.Control.Navigation() ,
                        new SuperMap.Control.ScaleLine(),
//                    new SuperMap.Control.LayerSwitcher(),
                        new SuperMap.Control.MousePosition(),
                    ],
                    projection: "EPSG:4326",
                });

                //地图移动过程中不显示图表
                map.events.on({"movestart": function(){
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
                pieChartDom.id = "surpiechart";
                pieChartDom.style.width = "400px";
                pieChartDom.style.height = "240px";
                pieChartDom.style.position = "absolute";
                pieChartDom.style.opacity = 0.8;
                elementsDiv.appendChild(pieChartDom);
                pieClose =  document.createElement("div");
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
            clearFeatures  : function(){
                polygonLayer.removeAllFeatures();
            },
            callback: function(infoLookup, loc, pixel){
                if (infoLookup) {
                    for (var idx in infoLookup) {
                        var infoo = infoLookup[idx];

                        var str = infoo.data.NAME;

                        var test = [];

                        for(var i = 0 ;i < arr.length;i++){
                            test.push(arr[i].PROVNAME)
                        }


                        if (infoo && infoo.data) {
                            //$("#surpiechart").innerHTML = "#F4F3F0";
                            pieChartDom.style.display = "block";

                            // 基于准备好的dom，初始化echarts图表

                            // echart 图表配置参数
                            this.pieData(infoo);
                            // 为echarts对象加载数据
                            //myChart.setOption(option);

                            // 图表位置
                            pieChartDom.style.left = (pixel.x + 20) + "px";
                            pieChartDom.style.top = (pixel.y - 20) + "px";

                        }
                        else{
                            //清除饼图
                            $("#surpiechart").innerHTML = "";
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
                        //暂时写死
                        var this_url = abilityUrl + "?uid=" + orgCode;
                        $.get(this_url, function (data) {
                            var scoreData =JSON.parse(data);
                            //console.log(scoreData)
                            if(scoreData.result){

                                for(var j=0;j<scoreData.result.length;j++){
                                    if(scoreData.result[j].NAME =="0-60"){
                                        score.push({
                                            name:scoreData.result[j].NAME+"分验船师数量",
                                            value:scoreData.result[j].VALUE
                                        })
                                        // console.log(score)
                                    }else if(scoreData.result[j].NAME =="60-80"){
                                        score.push({
                                            name:scoreData.result[j].NAME+"分验船师数量",
                                            value:scoreData.result[j].VALUE
                                        })
                                    }else{
                                        score.push({
                                            name:scoreData.result[j].name+"分验船师数量",
                                            value:scoreData.result[j].value
                                        })
                                    }
                                }
                                var option = {
                                    backgroundColor:"#F4F3F0",
                                    title : {
                                        text: infoo.data.NAME +'验船师培训能力得分分布图',
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
                                        data: ['0-60分验船师数量','60-80分验船师数量','80-100分验船师数量']
                                    },
                                    series : [
                                        {
                                            type: 'pie',
                                            radius : '55%',
                                            center: ['50%', '60%'],
                                            data:score,
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

                                var myChart = echarts.init(pieChartDom);

                                myChart.setOption(option)

                            }

                        })
                    }
                }


            },
            evn : function(e){
                if(e.target && e.target.refDataID){

                    $("#surNews").css({"display":"block"});
                    var fid = e.target.refDataID;
                    var fea = themLayer.getFeatureById(fid);
                    $('.num td').html("");

                    for(var i = 0;i<provinceArrSimple.length;i++){
                        if(provinceArrSimple[i].name == fea.attributes.NAME){
                            orgCode = provinceArrSimple[i].value;   //1100000
                            var this_url = sur_url+"?uid="+orgCode;
                            $.get(this_url,function(data){
                                var da = JSON.parse(data);
                               // console.log(da)
                                var _res = da.result;
                                var resultSum = 0;
                                $('.num1').html(_res.totalNum);

                               //学历字段为空时，进行表格填充处理
                                $('.num2').html('0');
                                $('.num3').html('0');
                                $('.num4').html('0');
                                $('.num5').html('0');
                                $('.num6').html('0');
                                $('.num7').html('0');
                                $('.num8').html('0');
                                $('.num9').html('0');
                                $('.num10').html('0');
                                $('.num11').html('0');
                                $('.num12').html('0');



                                for(var i=0;i<_res.surLv.length;i++){
                                    if(_res.surLv[i].LV == "20_1"){
                                        $('.num2').html(_res.surLv[i].NUM);
                                    }else if(_res.surLv[i].LV == "20_2"){
                                        $('.num3').html(_res.surLv[i].NUM);
                                    }else if(_res.surLv[i].LV == "20_3"){
                                        $('.num4').html(_res.surLv[i].NUM);
                                    }else if(_res.surLv[i].LV == "20_4"){
                                        //验船员
                                        $('.num5').html(_res.surLv[i].NUM);
                                    };
                                }
                                for(var i=0;i<_res.surEduction.length;i++){
                                    if(_res.surEduction[i].EDUCERTCODE == "73_4"){//硕士及以上
                                        $('.num6').html(_res.surEduction[i].NUM);
                                    }else if(_res.surEduction[i].EDUCERTCODE == "73_3"){//大学本科
                                        $('.num7').html(_res.surEduction[i].NUM);
                                    }else if(_res.surEduction[i].EDUCERTCODE == "73_2"){//大学专科
                                        $('.num8').html(_res.surEduction[i].NUM);
                                    }else if(!_res.surEduction[i].hasOwnProperty('EDUCERTCODE') || _res.surEduction[i].EDUCERTCODE == "73_0" ||  _res.surEduction[i].EDUCERTCODE == "73_" ||  _res.surEduction[i].EDUCERTCODE == "73_1"){
                                        //中专及以下
                                        var num = _res.surEduction[i].NUM;

                                            resultSum += num;

                                        $('.num9').html(resultSum);
                                    };

                                }
                                for(var i=0;i<_res.surProfession.length;i++){
                                    if(_res.surProfession[i].PROFESSION == "相关专业"){
                                        $('.num10').html(_res.surProfession[i].NUM);
                                    }else if(_res.surProfession[i].PROFESSION == "相似专业"){
                                        $('.num11').html(_res.surProfession[i].NUM);
                                    }else{
                                        //其他专业
                                        $('.num12').html(_res.surProfession[i].NUM);
                                    };
                                }
                            })
                        }
                    }
                }else{
                    // console.log("aa");
                }
            },
            addLayer : function(){
                var that = this;
                tiandi =  new SuperMap.Layer.TiledDynamicRESTLayer("China", tiandiMap, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
                tiandi.events.on({"layerInitialized":that.addLayer2.bind(this)});
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
            addLayer2 : function(){
                var that = this;
                tiandiVct = new SuperMap.Layer.TiledDynamicRESTLayer("China2", tiandiVecMap, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
                tiandiVct.events.on({"layerInitialized":that.addLayer3.bind(this)});
            },
            addLayer3 : function(){
                var that = this;
                this.ctDataInit();
                this.clearIt();
                this.getAllSurData();

                var tools = new ToolsNav({
                    id : "#tools",
                    map : map,
                    layui : layui,
                    layer : layer,
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
                    drawLine :  drawToLine
                });

                map.addLayers([tiandi,layer1,tiandiVct,polygonLayer,themLayer,chartLayer,utfgrid]);
                map.setCenter(new SuperMap.LonLat(108.067923, 32.679943),3);

                this.queryData();
                this.mapChange();

            },
            clearIt : function(){
                $("#clearIt").on('click',function(){
                    //清除绘制图层
                    polygonLayer.removeAllFeatures();
                    //circleLayer.removeAllFeatures();
                })
            },
            queryData : function(){
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
            getAllSurData : function(result){
                var this_url = sur_url;
                $.get(this_url,function(data){
                    var da = JSON.parse(data);
                    var _res = da.result;
                    var resultSum = 0;
                    $('.num1').html(_res.totalNum);
                    for(var i=0;i<_res.surLv.length;i++){
                        if(_res.surLv[i].LV == "20_1"){
                            $('.num2').html(_res.surLv[i].NUM);
                        }else if(_res.surLv[i].LV == "20_2"){
                            $('.num3').html(_res.surLv[i].NUM);
                        }else if(_res.surLv[i].LV == "20_3"){
                            $('.num4').html(_res.surLv[i].NUM);
                        }else if(_res.surLv[i].LV == "20_4"){
                            //验船员
                            $('.num5').html(_res.surLv[i].NUM);
                        };

                    }
                    for(var i=0;i<_res.surEduction.length;i++){
                        if(_res.surEduction[i].EDUCERTCODE == "73_4"){//硕士及以上
                            $('.num6').html(_res.surEduction[i].NUM);
                        }else if(_res.surEduction[i].EDUCERTCODE == "73_3"){//大学本科
                            $('.num7').html(_res.surEduction[i].NUM);
                        }else if(_res.surEduction[i].EDUCERTCODE == "73_2"){//大学专科
                            $('.num8').html(_res.surEduction[i].NUM);
                        }else if(!_res.surEduction[i].hasOwnProperty('EDUCERTCODE') || _res.surEduction[i].EDUCERTCODE == "73_0" ||  _res.surEduction[i].EDUCERTCODE == "73_" ||  _res.surEduction[i].EDUCERTCODE == "73_1"){
                            //中专及以下
                            var num = _res.surEduction[i].NUM;

                            resultSum += num;

                            $('.num9').html(resultSum);
                        };

                    }
                    for(var i=0;i<_res.surProfession.length;i++){
                        if(_res.surProfession[i].PROFESSION == "相关专业"){
                            $('.num10').html(_res.surProfession[i].NUM);
                        }else if(_res.surProfession[i].PROFESSION == "相似专业"){
                            $('.num11').html(_res.surProfession[i].NUM);
                        }else{
                            //其他专业
                            $('.num12').html(_res.surProfession[i].NUM);
                        };
                    }

                })
            },
            drawCompleted:function(drawBoundsArgs){
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
            mapChange : function(){
                //初始化
                $('#zidingyiMap').trigger('click');
            },
//            初始化
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
                            //console.log(dzData);
                            arr = translateCode(dzData);
                            var color;
                            for(var i = 0;i<arr.length;i++){
                                var dataObj = new Object();
                                if(arr[i].SURNUMS<=100){
                                    color = '#C7DEFE';

                                    dataObj = {
                                        value : arr[i].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }else if(arr[i].SURNUMS<=300&&arr[i].SURNUMS>100){
                                    color = '#B2D3FE';
                                    dataObj = {
                                        value : arr[i].PROVNAME,
                                        style : {fillColor : color}
                                    }

                                }else if(arr[i].SURNUMS<=500&&arr[i].SURNUMS>300){
                                    color = '#A3C6FE';
                                    dataObj = {
                                        value : arr[i].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }else if(arr[i].SURNUMS<=700&&arr[i].SURNUMS>500){
                                    color = '#79ADFF';
                                    dataObj = {
                                        value : arr[i].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }else if(arr[i].SURNUMS<=1000&&arr[i].SURNUMS>700){
                                    color = '#6DA4FF';
                                    dataObj = {
                                        value : arr[i].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }else if(arr[i].SURNUMS>1000){
                                    color = '#217CFE';
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
                var that = this
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
                        "processCompleted": that.processCompleted.bind(this),
                        "processFailed": that.processFailed.bind(this)
                    }
                });
                getFeatureBySQLService.processAsync(getFeatureBySQLParams);

            },
            processCompleted : function(getFeaturesEventArgs){
                var that = this;
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
                    themLayer.addFeatures(feas);
                }

                //map.addLayer(themLayer)

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