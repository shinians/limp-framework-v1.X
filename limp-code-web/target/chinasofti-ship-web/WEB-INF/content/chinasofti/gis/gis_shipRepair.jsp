<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<%@include file="/WEB-INF/content/chinasofti/common/head.jsp" %>
<html>
<head>
    <meta charset="utf-8">
    <title>GIS_渔船修造企业能力分布</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="stylesheet" href="${style}/css/system-construction.css">
    <link rel="stylesheet" href="${style}/css/font-awesome-4.7.0/css/font-awesome.css">
    <script type="text/javascript" src="${script}/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="${supermap}/libs/SuperMap.Include.js"></script>
    <script type="text/javascript" src="${echarts}/echarts.min.js"></script>
    <script type="text/javascript" src="${layer}/lay/dest/layui.all.js"></script>
    <%--统一样式表--%>
    <script type="text/javascript" src="${script}/system.js" ></script>
    <script type="text/javascript" src="${script}/chinasofti/gis/provinceCode.js"></script>
    <script type="text/javascript" src='${script}/js/template-web.js'></script>
    <script type="text/javascript" src="${script}/chinasofti/gis/translate.js"></script>

    <style type="text/css">
        body{
            margin: 0;
            overflow: hidden;
            background: #fff;
        }
        #map{
            position: relative;
            height: 757px;
            border:1px solid #3473b7;
        }
        /*能力评分等级样式*/
        #abilityLevel,#abilityLevel2{
            z-index: 1;
            display: none;
        }
        .level1 img,.level2 img,.level3 img{
            width: 16px;
            height: 16px;
        }
        .level1,.level2,.level3{
            line-height: 40px;
        }
        #charts{
            width:400px;
            height:240px;
            position: absolute;
            background:#F4F3F0;
            opacity: 0.8;
        }
        .fork{
            position: absolute;
            top: 3px;
            right: 14px;
            font-size: 20px;
            font-weight: bold;
        }

        .dataTable thead tr td,.dataTable tbody tr td{
            border: 2px solid #0f4f9e;
            color: #333;
            text-align: center;
            font-size: 12px;
        }

        .num td{
            height: 20px;
        }
        .legend{
            left:10px ;
            z-index: 9999;
            height:200px;
            bottom:35px;
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
        .nameJump{
            cursor:pointer;
        }
    </style>



</head>
<body onload="init()" >
<div id="tools">

</div>
<div id="map"></div>
<div class="legend">
    <%--面事件图例--%>
    <div id="faceLevel">
        <p>
            <span class="legend_block" style="background-color:#00CCFF;"></span>： <span> 渔船修造数企业小于50个</span>
        </p>
        <p>
            <span class="legend_block" style="background-color:#29ef57;"></span>： <span> 渔船修造企业数大于50个小于100个</span>
        </p>
        <p>
            <span class="legend_block" style="background-color:#293eef;"></span>： <span> 渔船修造企业数大于100个小于150个  </span>
        </p>
        <p>
            <span class="legend_block" style="background-color:#ce0ced;"></span>： <span> 渔船修造企业数大150个小于200个  </span>
        </p>
        <p>
            <span class="legend_block" style="background-color:#edea0c;"></span>： <span> 渔船修造企业数大于200个  </span>
        </p>
    </div>
    <%--机构能力评分等级 点 图例--%>
    <div id="abilityLevel">
        <div class="level1">
            <input type="checkbox" value="1"  id="btn1" checked> 渔船修造企业能力80-100分：<img src="${supermap}/theme/images/green.png" alt="80-100分">
        </div>
        <div class="level2">
            <input type="checkbox" value="2"  id="btn2" checked> 渔船修造企业能力60-80分：<img src="${supermap}/theme/images/blue.png" alt="60-80分">
        </div>
        <div class="level3">
            <input type="checkbox" value="3"  id="btn3" checked> 渔船修造企业能力0-60分：<img src="${supermap}/theme/images/pure.png" alt="0-60分">
        </div>
    </div>
    <%--图例级别4--%>
    <div id="abilityLevel2">
        <p>
            <img src="${supermap}/theme/images/shiprepair.png">： <span>渔船修造企业</span>
        </p>
    </div>
</div>

<%--机构分布--%>
<span class="showNews">
        <img src="../../../../resources/style/images/gisleft.png" alt="">
    </span>

<div class="detailTal" id="orgNums">
        <span class="hideNews">
            <img src="../../../../resources/style/images/gisright.png" alt="">
        </span>
    <h3 class="title03 nameJump"><span>**</span>省渔船修造情况统计</h3>
    <%--机构表--%>
    <table class="surCount">
        <thead>
            <tr>
                <th>渔船修造企业数量总数</th>
                <th>建造渔船数量</th>
                <th>维修渔船船次</th>
                <th>建造渔船一次检验合格率</th>
                <th>渔船维修后首次检验一次检验合格率</th>
            </tr>
        </thead>
        <tbody>
            <tr class="num">
                <td class="num1"></td>
                <td class="num2"></td>
                <td class="num3"></td>
                <td class="num4"></td>
                <td class="num5"></td>
            </tr>
        </tbody>
    </table>
</div>



<script type="text/javascript">
    //    window.onload=function(){

    var height = top.document.body.clientHeight
    $('#map').css({
        height: height
    })

    var map,layer1, markerlayer,markerlayer2,marker,marker2,final,themeLayer,control,orgCode, utfgrid, chartLayer,
        url = system.echartsUrl;
    var themUrl = system.dataUrl;
    var a_url=get_root+'/gis/getRepairEntData1';
    var org_url = get_root + '/gis/getRepairEntData4';
    var them_url = get_root +'/gis/getRepairEntData2';
    var score_url = get_root +'/gis/getOrgData1';
    var themeResult=[];
    var con;
    var pieChartDom;
    var elementsDiv;
    var isMapMoving = false;
    var tiandiMap = system.tiandiUrl;
    var tiandiVecMap = system.tiandiVecUrl;
    var tiandi;
    var tiandiVct;
    //tools
    var polygonLayer,drawPolygon,drawBounds,drawCircle,drawToLine;

    function init(){

        if(!document.createElement('canvas').getContext){
            alert("您的浏览器不支持 Canvas，请升级！");
            return;
        }

        //初始化测量面积类
        polygonLayer = new SuperMap.Layer.Vector("polygonLayer");
        drawPolygon = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.Polygon);

        //query
        drawBounds = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.Box);
        drawBounds.events.on({"featureadded": drawCompleted});

        //几何圆查询
        drawCircle = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.RegularPolygon,{handlerOptions:{sides:50}});
        drawCircle.events.on({"featureadded": drawCompleted});

        //测距
        drawToLine = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.Path, { multi: true });

        map = new SuperMap.Map("map",{controls:[
            new SuperMap.Control.Navigation() ,
            new SuperMap.Control.ScaleLine(),
//                new SuperMap.Control.LayerSwitcher(),
            new SuperMap.Control.MousePosition()
        ],
            projection: "EPSG:4326"
        });
        //地图移动过程中不显示图表
        map.events.on({"movestart": function(){
            $("#piechart").innerHTML = "";
            pieChartDom.style.display = "none";
            isMapMoving = true;
        }});
        map.events.on({"moveend": function(){
            isMapMoving = false;
        }});

        layer1 = new SuperMap.Layer.TiledDynamicRESTLayer("china", url, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
//       3级标记层
        markerlayer = new SuperMap.Layer.Markers("markerLayer");
//       4级标记层
        markerlayer2 = new SuperMap.Layer.Markers("markerLayer");

        themeLayer = new SuperMap.Layer.Unique("themeLayer");

        themeLayerStyle(themeLayer);
        themeLayer.on("click", event);
        echartLayer();
        layer1.events.on({"layerInitialized":addLayer});
        check();

        map.events.on({"zoomend":zoom});

    }

    //鼠标移动中仍保持在同一个数据上
    var isOneData = "";
    var theDataCache;
    var infoo,myChart;
    var fork;
    var test;
    function echartLayer(){
        //创建 Elements 图层，用于显示饼图
        chartLayer = new SuperMap.Layer.Elements("eCharts");

        //获取 Elements 图层 div
        elementsDiv =  chartLayer.getDiv();

        //设置Elements实例的div为地图大小
        var mapsize = map.getSize();
        elementsDiv.style.width = mapsize.w;
        elementsDiv.style.height = mapsize.h;

        //创建图表 div, 设置其基本属性, 并添加到  Elements 图层
        pieChartDom = document.createElement("div");
        pieChartDom.id = "piechart";
        pieChartDom.style.width = "400px";
        pieChartDom.style.height = "240px";
        pieChartDom.style.position = "absolute";
        pieChartDom.style.opacity = 0.8;
        elementsDiv.appendChild(pieChartDom);

        $('#piechart').html("<div id='aa'></div><div style='font-size: 20px;position: absolute;top:20px;right:20px;'>x</div>");

        // UTF图
        utfgrid = new SuperMap.Layer.UTFGrid("UTFGridLayer", system.baseUrl,
            {
                layerName: "China_Province_pl@China",
                utfTileSize: 256,
                pixcell: 8,
                isUseCache: true
            },
            {
                utfgridResolution: 8
            });
        control = new SuperMap.Control.UTFGrid({
            layers: [utfgrid],
            callback: callback,
            handlerMode: "click"
        });
        utfgrid.maxExtent = new SuperMap.Bounds(-180.0 ,-85.05,180.0,85.05 );
        map.addControl(control);
    }
    // 相同数据检测
    var callback = function (infoLookup, loc, pixel) {
        if (infoLookup && isMapMoving === false) {
            for (var idx in infoLookup) {
                infoo = infoLookup[idx];
                if (infoo && infoo.data){

                    $("#piechart").innerHTML = "#F4F3F0";

                    pieChartDom.style.display = "block";
                    $('#piechart').html("<div id='charts'></div><span class='fork'>X</span>");
                    //fork点击图表消失？
                    $('.fork').click(function(){
                        $('#piechart').css('display','none');
                        console.log("closed！");
                    })
                    // 基于准备好的dom，初始化echarts图表
                    myChart = echarts.init(document.getElementById('charts'));
                    var thedata;

                    // echart 图表配置参数
                    var option = {
                        backgroundColor:"#F4F3F0",
                        title : {
                            text: infoo.data.NAME +'省渔船修造企业能力分布',
                            x:'center'
                        },
                        tooltip : {
                            trigger: 'item',
                            formatter: "{a} <br/>{b} : {c} ({d}%)"
                        },
                        legend: {
                            orient: 'vertical',
                            left: 'left',
                            top:20,
                            data: ['0-60分渔船修造企业数量','60-80分渔船修造企业数量','80-100分渔船修造企业数量']
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
                    pieData(infoo);
                    // 为echarts对象加载数据
                    myChart.setOption(option);

                    // 图表位置
                    pieChartDom.style.left = (pixel.x + 20) + "px";
                    pieChartDom.style.top = (pixel.y - 20) + "px";

                }else{
                    //清除饼图
                    $("#piechart").innerHTML = "";
                    pieChartDom.style.display = "none";
                }
            }
        }
    };
    //        饼图数据
    function pieData(infoo){
        var score=[];
        //console.log(provinceArr)
        for (var i = 0; i < provinceArr.length; i++) {
            if (provinceArr[i].name == infoo.data.NAME) {
                orgCode = provinceArr[i].value;   //1100000
//                var this_url = score_url + "?uid=" + orgCode;
                var this_url = "/gis/getRepairEntData3?uid="+orgCode;
                console.log(this_url)
                $.get(this_url, function (data) {

                    var scoreData =JSON.parse(data);

                    if(scoreData.result.length == 0){
                        $('#piechart').html('暂无相关数据')
                        return;
                    }
                    for(var j=0;j<scoreData.result.length;j++){
                        if(scoreData.result[j].name =="60-80"){
                            score.push({
                                name:scoreData.result[j].name+"分渔船修造企业数量",
                                value:scoreData.result[j].value
                            })

                        }else if(scoreData.result[j].name =="80-100"){
                            score.push({
                                name:scoreData.result[j].name+"分渔船修造企业数量",
                                value:scoreData.result[j].value
                            })
                        }else{
                            score.push({
                                name:scoreData.result[j].name+"分渔船修造企业数量",
                                value:scoreData.result[j].value
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
        return;
    }

    //机构能力分布
    function themeLayerStyle(layer){
//        var themeLayer = layer;
        themeLayer.setOpacity(0.5);
        themeLayer.style = {
            stroke : true,
            strokeWidth : 2,
            strokeColor : "#fff",
            strokeLinecap : "butt"
        };
        //hover 高亮样式
        themeLayer.isHoverAble = true;
        themeLayer.highlightStyle = {
            stroke: true,
            strokeWidth: 2,
            strokeColor: 'blue',
            fillColor: "#00F5FF",
            fillOpacity: 0.1
        };
        themeLayer.themeField = "NAME";
    }

    //刷新页面先获取一次全国数据
    $.get(org_url,function(data){
        var _this = JSON.parse(data);
        $('.num1').html(_this.result.entNums);
        $('.num2').html(_this.result.buildShipNums);
        $('.num3').html(_this.result.repairTimes);
        $('.num4').html(_this.result.bRate);
        $('.num5').html(_this.result.rRate);
    })
    // move填充content
    function event(e){
        if(e.target && e.target.refDataID){
            var fid = e.target.refDataID;
            var fea = themeLayer.getFeatureById(fid);
            $('.num td').html("");
            for(var i = 0;i<provinceArrSimple.length;i++){
                if(provinceArrSimple[i].name == fea.attributes.NAME){
                    $('.nameJump span').html(provinceArrSimple[i].name);
                    orgCode = provinceArrSimple[i].value;   //1100000
                    var this_url = org_url+"?uid="+orgCode;
                    $.get(this_url,function(data){
                        var da = JSON.parse(data);
                        var _res = da.result;
                        $('.num1').html(_res.entNums);
                        $('.num2').html(_res.buildShipNums);
                        $('.num3').html(_res.repairTimes);
                        $('.num4').html(_res.bRate);
                        $('.num5').html(_res.rRate);
                    })
                }
            }
        }else{
            console.log("aa");
        }
    };
    //获取 feature 数据
    function addThemeLayer() {
        clearLayer();
        var dataSourceName=[];
//            var dataSource = 'China';
        dataSourceName.push(String('China:Provinces_R'));
        var getFeatureParam, getFeatureBySQLService, getFeatureBySQLParams;
        getFeatureParam = new SuperMap.REST.FilterParameter({
            name: "China"
        });
        getFeatureBySQLParams = new SuperMap.REST.GetFeaturesBySQLParameters({
            queryParameter: getFeatureParam,
            toIndex: 500,
            datasetNames:dataSourceName
        });
        getFeatureBySQLService = new SuperMap.REST.GetFeaturesBySQLService(themUrl, {
            eventListeners: {"processCompleted": processCompleted, "processFailed": processFailed}});
        getFeatureBySQLService.processAsync(getFeatureBySQLParams);
        fillThemeBlock();
    }
    function processCompleted(getFeaturesEventArgs) {
        var theRes = getFeaturesEventArgs.result;
        var themeArr =[];
        if(theRes && theRes.features){
            var features = theRes.features;
            for(var i = 0; i < features.length; i++) {
                for(var k = 0;k<themeResult.length;k++){
                    var feature = features[i];
                    var arr = translatecode(themeResult);
                    if(arr[k].provname == feature.attributes.NAME){
                        themeArr.push(feature);
                    }
                }
            }
            themeLayer.addFeatures(themeArr);
        }
    }
    function fillThemeBlock(){
        $.ajax({
            url:them_url,
            type:'post',
            dataType:'json',
            success:function(data){
                themeResult = data.result;
                //  颜色判断
                var color;
                var arr = translatecode(themeResult);
                for(var k=0;k<themeResult.length;k++){
                    var dataObj = new Object();
                    if(themeResult[k].nums >=0 && themeResult[k].nums<=50){
                        color = '#00CCFF';
                        dataObj = {
                            value : arr[k].provname,
                            style : {fillColor : color}
                        }
                    }else if(themeResult[k].nums >50 && themeResult[k].nums<=100){
                        color = '#29ef57';
                        dataObj = {
                            value : arr[k].provname,
                            style : {fillColor : color}
                        }
                    }else if(themeResult[k].nums >100 && themeResult[k].nums<=150){
                        color = '#293eef';
                        dataObj = {
                            value : arr[k].provname,
                            style : {fillColor : color}
                        }
                    }else if(themeResult[k].nums >150 && themeResult[k].nums<=200){
                        color = '#ce0ced';
                        dataObj = {
                            value : arr[k].provname,
                            style : {fillColor : color}
                        }
                    }else {
                        //200以上
                        color = '#edea0c';
                        dataObj = {
                            value : arr[k].provname,
                            style : {fillColor : color}
                        }
                    }
                    themeLayer.styleGroups.push(dataObj);
                }
            }
        })
    }
    function processFailed(e) {
        alert(e.error.errorMsg);
    }
    function clearLayer() {
        //先清除上次的显示结果
        themeLayer.clear();
    }
    //鼠标缩放级别
    // 切换不同级别图片即切换不同图层，用setVisibility控制
    function zoom(){
        var zoomLayer = map.getZoom();
        switch(zoomLayer){
            case 3:
                clearLayer();
                markerlayer.setVisibility(false);
                markerlayer2.setVisibility(false);
                addThemeLayer();
                $('#abilityLevel').css('display','none');
                $('#abilityLevel2').css('display','none');
                $('#faceLevel').css('display','block');
                break;
            case 5:
                clearLayer();
                markerlayer2.setVisibility(false);
                markerlayer.setVisibility(true);
                //点坐标图例
                $('#abilityLevel').css('display','block');
                $('#abilityLevel2').css('display','none');
                $('#faceLevel').css('display','none');
                break;
            case 6:
                clearLayer();
                markerlayer.setVisibility(false);
                markerlayer2.setVisibility(true);
                $('#abilityLevel2').css('display','block');
                $('#abilityLevel').css('display','none');
                $('#faceLevel').css('display','none');
                break;

        }
    }
    function addLayer(){
        tiandi =  new SuperMap.Layer.TiledDynamicRESTLayer("China", tiandiMap, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
        tiandi.events.on({"layerInitialized":addLayer2});
    }

    function addLayer2(){
        tiandiVct = new SuperMap.Layer.TiledDynamicRESTLayer("China2", tiandiVecMap, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
        tiandiVct.events.on({"layerInitialized":addLayer3});
    }

    function addLayer3(){
        map.addLayers([tiandi,layer1,tiandiVct,polygonLayer,themeLayer,chartLayer,utfgrid]);
        //显示地图范围
        map.setCenter(new SuperMap.LonLat(108.067923, 32.679943),3);

        map.allOverlays = true;
        map.addLayer(markerlayer);
        map.addLayer(markerlayer2);
        addData();
        addData2();

        queryData();
        clearIt();

        var tools = new ToolsNav({
            id : "#tools",
            map : map,
            layui : layui,
            layer : layer,
            callback : toolsEvn,
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
        })

        mapChange();

    }

    function mapChange(){
        $('#zidingyiMap').trigger('click');
    }

    function toolsEvn(){
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
    }

    function drawCompleted(drawBoundsArgs){
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
    }

    function queryData(){
        $('#query').on('click',function(){
            console.log("--方搜----");
            drawBounds.activate();
        });
        //圆搜
        $("#queryCircle").on('click',function(){
            console.log("---圆搜----");
            drawCircle.activate();
        })
    }

    function clearIt(){
        $("#clearIt").on('click',function(){
            //清除绘制图层
            polygonLayer.removeAllFeatures();
            //circleLayer.removeAllFeatures();
        })
    }


    //添加级别为3的数据
    function addData()
    {
        $.ajax({
            url:a_url ,
            type:'post',
            dataType: 'json',
            success: function (data) {
                var result = data.result;
                markerlayer.removeMarker(marker);
//                markerlayer2.removeMarker(marker2);
                var size = new SuperMap.Size(16,16);
                var offset = new SuperMap.Pixel(-(size.w/2), -size.h);
                var icon = new SuperMap.Icon('${supermap}/theme/images/cluster4.png', size, offset);

                final = [];
                for(var i=0;i<result.length ;i++){
                    //  能力评分
                    if(result[i].score >= 80 && result[i].score<100){
                        icon = new SuperMap.Icon('${supermap}/theme/images/green.png',size,offset);
                        var index = i;
                        getit(index);
                        check(index);
                    }else if(result[i].score >= 60 && result[i].score<80){
                        icon = new SuperMap.Icon('${supermap}/theme/images/blue.png',size,offset);
                        var index = i;
                        getit(index);
                        check(index);
                    }else{
                        icon = new SuperMap.Icon('${supermap}/theme/images/pure.png',size,offset);
                        var index = i;
                        check(index);
                        getit(index);
                    }
                }
                function getit(i){
                    marker =new SuperMap.Marker(new SuperMap.LonLat(result[i].lon,result[i].lat),icon);
                    marker.name = result[i].name;
                    marker.adress = result[i].addr;
                    marker.phone = result[i].tel;
                    marker.respperson = result[i].legal;
                    marker.score =result[i].score;
                    marker.code = result[i].pid;
                    marker.events.on({
                        "click":openInfoWin,
                        "touchstart":openInfoWin, //假如要在移动端的浏览器也实现点击弹框，则在注册touch类事件
                        "scope": marker
                    });
                    final.push(marker);
                    markerlayer.addMarker(marker);
                }
            }
        })
    }
    //     4级的时候数据
    function addData2(){
        $.ajax({
            url:a_url ,
            type:'post',
            dataType: 'json',
            success: function (data) {
                var result = data.result;
//                markerlayer.removeMarker(marker);
                markerlayer2.removeMarker(marker2);
                var size = new SuperMap.Size(16,16);
                var offset = new SuperMap.Pixel(-(size.w/2), -size.h);
                var icon = new SuperMap.Icon('${supermap}/theme/images/cluster4.png', size, offset);

                final = [];
                for(var i=0;i<result.length ;i++){
                    icon = new SuperMap.Icon('${supermap}/theme/images/shiprepair.png',size,offset);
                    getit2(i);
                }
                function getit2(i){
                    marker2 =new SuperMap.Marker(new SuperMap.LonLat(result[i].lon,result[i].lat),icon);
                    marker2.name = result[i].name;
                    marker2.adress = result[i].addr;
                    marker2.phone = result[i].tel;
                    marker2.respperson = result[i].legal;
                    marker2.score =result[i].score;
                    marker2.code = result[i].pid;
                    marker2.events.on({
                        "click":openInfoWin,
                        "touchstart":openInfoWin, //假如要在移动端的浏览器也实现点击弹框，则在注册touch类事件
                        "scope": marker2
                    });
                    final.push(marker2);
                    markerlayer2.addMarker(marker2);
                }
            }
        })
    }
    //CheckBox点击事件
    function check(){
        $('#btn1').on('change',function(){
            if(!$('#btn1').is(':checked')){
                for(var j=0;j<final.length;j++){
                    if(final[j].score >=80 && final[j].score <100){
                        markerlayer.removeMarker(final[j]);
                    }
                }
            }else{
                for(var j=0;j<final.length;j++){
                    markerlayer.addMarker(final[j]);
                }
            }
        })
        $('#btn2').on('change',function(){
            if(!$('#btn2').is(':checked')){
                for(var j=0;j<final.length;j++){
                    if(final[j].score >=60 && final[j].score <80){
                        markerlayer.removeMarker(final[j]);
                    }
                }
            }else{
                for(var j=0;j<final.length;j++){
                    markerlayer.addMarker(final[j]);
                }
            }
        })
        $('#btn3').on('change',function(){
            if(!$('#btn3').is(':checked')){
                for(var j=0;j<final.length;j++){
                    if( final[j].score <60){
                        markerlayer.removeMarker(final[j]);
                    }
                }
            }else{
                for(var j=0;j<final.length;j++){
                    markerlayer.addMarker(final[j]);
                }
            }
        })
    }
    //jump to other html by layer  problem???
    function layerOpen(url){
        var url = get_root+"/index/main?loadUrl="+url+"&hideType=1";
//        var index = layer.open({
//            type: 2,
//            area: ['100%', '100%'],
//            skin:'jumpLayer',
//            content:url,
//            title : "",
//        });
//        layer.full(index);
        console.log(url);
    }
    //打开对应的信息框
    var infowin = null;
    function openInfoWin(){
        closeInfoWin();
        var marker = this;
        var lonlat = marker.getLonLat();
        var size = new SuperMap.Size(0, 33);
        var offset = new SuperMap.Pixel(11, -30);
        var icon = new SuperMap.Icon("theme/images/cluster4.png", size, offset);
        var contentHTML = "<div style='font-size:.8em; opacity: 0.8; overflow-y:hidden; color:black;'>";
        contentHTML += "<div class='nameJump'>修造企业名称:<a onclick='layerOpen("+marker.code+")'>"+marker.name+"</a></div><div>企业地址:<a>"+marker.adress+"</a></div><div>负责人:<a>"+marker.respperson+"</a></div>";
        contentHTML +="<div>联系电话:<a>"+marker.phone+"</a></div><div>企业能力得分:<span>"+marker.score+"</span></div> </div>";

        var popup = new SuperMap.Popup.FramedCloud("popwin",new SuperMap.LonLat(lonlat.lon,lonlat.lat),null,contentHTML,icon,true);
        infowin = popup;
        map.addPopup(popup);

    }

    //关闭信息框
    function closeInfoWin(){
        if(infowin){
            try{
                infowin.hide();
                infowin.destroy();
                map.removePopup(infowin)
            }
            catch(e){}
        }
    }
</script>

</body>
</html>