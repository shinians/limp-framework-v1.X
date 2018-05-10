<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<%@include file="/WEB-INF/content/chinasofti/common/head.jsp" %>
<html>
<head>
    <meta charset="utf-8">
    <title>GIS_产品检验统计</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
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
        .back{
            color:#fff;
            padding-left:20px;
            text-underline: none;
            cursor: pointer;
        }
        /*echarts*/
        #charts{
            width: 550px;
            height:330px;
        }
        .chartsDetail{
            padding:5px;
            border:2px solid #ddd;
            cursor: pointer;
            top:5px;
            -webkit-border-radius: 5px;
            -moz-border-radius: 5px;
            border-radius: 5px;
            background-color: #fff;
            position: absolute;
            right: 20px;
        }
        #piechart123{
            background-color:#fff;
            border-radius:5px;

        }
        /*筛选样式*/
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
        .infoWin{
            position: absolute;
            z-index: 1;
            top: 70px;
            right: 30px;
            width: 325px;
            height: 20px;
            background: #fff;
            text-align: center;
            padding: 5px;
            line-height: 20px;
            border-radius: 5px;
            opacity: 0.7;
            font-size: 16px
        }

    </style>
    <script type="text/javascript" src="${supermap}/libs/SuperMap.Include.js"></script>
    <script type="text/javascript" src="${script}/chinasofti/gis/provinceCode.js"></script>
    <script type="text/javascript" src='${script}/js/template-web.js'></script>
    <script type="text/javascript" src="${script}/chinasofti/gis/translate.js"></script>
    <script type="text/javascript" src="${echarts}/echarts.min.js"></script>
    <link rel="stylesheet" href="${style}/css/system-construction.css">
    <link rel="stylesheet" href="${style}/css/font-awesome-4.7.0/css/font-awesome.css">
    <style>
        .detailTal{
            top:8%;
        }
        .showNews{
            top:65px;
            visibility: hidden;
        }
        .surCount tr td{
            width:100px;
        }
        .blue{
            height:25px;
            width:32px;
            background-color:#003399;
            display:inline-block;
            vertical-align:middle;
        }
        .legend{
            height: 165px;
            left:10px ;
            z-index: 9999;
            background-color: rgba(3, 13, 33, 0.58);
            color: #8aaece;
            bottom:38px;
        }
        .hide{
            display: none ;
        }
    </style>
</head>
<body onload="init()">
<div id="tools">

</div>
<%--<div id="abilityLevel">--%>
    <%--<div class="level1">--%>
        <%--<input class="choose y_choose" type="checkbox" value="1"  checked disabled>未抽查企业<img src="${supermap}/theme/images/yellow.png" >--%>
    <%--</div>--%>
    <%--<div class="level2">--%>
        <%--<input class="choose p_choose" type="checkbox" value="2"  checked disabled>抽查合格企业<img src="${supermap}/theme/images/green.png" >--%>
    <%--</div>--%>
    <%--<div class="level3">--%>
        <%--<input class="choose c_choose" type="checkbox" value="3"   checked disabled>抽查不合格企业<img src="${supermap}/theme/images/red.png">--%>
    <%--</div>--%>
<%--</div>--%>
<div id="map"></div>
<span class="showNews">
     <img src="${style}/images/gisleft.png" alt="">
</span>
<div class="infoWin">
    <p>
        本周期抽查开始时间：<span class="year">  </span>
    </p>
</div>
<div id="surNews" class="detailTal">
      <span class="hideNews">
          <img src="${style}/images/gisright.png" alt="">
      </span>
    <h3 class="title03">
        <p class="titleContent">监督抽查统计</p>
    </h3>



    <table class="surCount">
        <tbody>
        <tr class="content">
            <td colspan="3" style="text-align: left;padding-left:10px;"><span class="shengfen"></span>监督抽查合格率：</td>
            <td colspan="2" style="text-align: left;padding-left:10px;"><span class="totalNum"></span>%</td>
        </tr>
        <tr>
            <td></td>
            <td>产品制造企业：</td>
            <td>筏站：</td>
            <td>Gmdss检修站：</td>

        </tr>
        <tr>
            <td>已抽查数量：</td>
            <td class="yc_cp"></td>
            <td class="yc_fz"></td>
            <td class="yc_gmdss"></td>
        </tr>
        <tr>
            <td>实有数量：</td>
            <td class="sy_cp"></td>
            <td class="sy_fz"></td>
            <td class="sy_gmdss"></td>
        </tr>
        <tr>
            <td>抽查进度：</td>
            <td class="cc_cp"></td>
            <td class="cc_fz"></td>
            <td class="cc_gmdss"></td>
        </tr>
        </tbody>
    </table>
</div>

<div class="legend " id="legend1">
    <p>
        <img src="${style}/images/gis_sur01.png">： <span> 企业监督抽查率低于40%</span>
    </p>
    <p>
        <img src="${style}/images/gis_sur02.png">： <span> 企业监督抽查率在40%-60%之间</span>
    </p>
    <p>
        <img src="${style}/images/gis_sur03.png">： <span> 企业监督抽查率在60%-80%之间</span>
    </p>
    <p>
        <span class="blue"></span> <span>:  企业监督抽查率在80%-100%之间</span>
    </p>

</div>


<div class="legend hide" id="legend2">
    <p>
        <input class="choose y_choose" type="checkbox" value="1"  checked disabled> <img src="${supermap     }/theme/images/yellow.png">： <span>未抽查企业</span>
    </p>
    <p>
        <input class="choose p_choose" type="checkbox" value="2"  checked disabled> <img src="${supermap}/theme/images/green.png">： <span>抽查合格企业 </span>
    </p>
    <p>
        <input class="choose c_choose" type="checkbox" value="3"   checked disabled> <img src="${supermap}/theme/images/red.png">： <span>抽查不合格企业</span>
    </p>
</div>

</body>
<script>
    var height = top.document.body.clientHeight
    $('#map').css({
        height: height
    })
    function init(){
        var production = new Production();
        production.init();
    }

    function Production(options){
        var baseMap = system.echartsUrl;
        var dataUrl = system.dataUrl;
        var tiandiMap = system.tiandiUrl;
        var tiandiVecMap = system.tiandiVecUrl;
        var allUrl =   get_root +  "/gis/getProCheckAnalysis3";
        var tableUrl = get_root +  "/gis/getProCheckAnalysis4?uid=";
        var backUrl =  get_root + "/gis/getProductTypeData2";
        var markUrl =  get_root + "/gis/getProCheckAnalysis1";
        var clickUrl = get_root + "/gis/getProCheckAnalysis2?pid=";
        var layer1,tiandi,tiandiVct,danZhiLayer,arr,test,markerlayer,infowin,s_arr,chartLayer,elementsDiv,pieChartDom;
        //工具栏
        var polygonLayer,drawPolygon,drawBounds,drawCircle,drawToLine;
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

                //初始化测量面积类
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
                    projection: "EPSG:4326",
                    allOverlays: true
                });
                layer1= new SuperMap.Layer.TiledDynamicRESTLayer("China", baseMap, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
                layer1.events.on({"layerInitialized":that.addLayer.bind(this)});

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
                    pieChartDom.style.display = "none";
                    $('.hideNews').trigger('click');
                }});

                map.events.on({'zoomend':that.zoomed.bind(this)});

                markerlayer = new SuperMap.Layer.Markers("markerLayer");
                danZhiLayer = new SuperMap.Layer.Unique("ThemeLayer");
                var options = {
                    map :  map,
                    layer : danZhiLayer,
                    dataUrl : system.dataUrl,
                    dzSetting : {
                        opacticy : 0.6,
                        style : {
                            stroke: true,
                            strokeColor : "#fff",
                            trokeWidth : 2
                        },
                        isHoverAble : true,
                        highlightStyle : {
                            stroke: true,
                            strokeWidth: 2,
                            strokeColor: '#ECF600',
                            fillColor: "#00F5FF",
                            fillOpacity: 0.1
                        },
                        themeField : "NAME"
                    }
                }
                test = new DanZhi();
                test.init(options);
                that.firstShow();
                danZhiLayer.on("click", that.evn);
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

            firstShow : function(){
                markerlayer.setVisibility(false);
            },
            zoomed : function(){
                var zoom = map.getZoom();

                if(zoom<=3){
                    $('#legend1').removeClass('hide');
                    $('#legend2').addClass('hide');

                    $('.legend').css({
                        height : "165px",
                        width : '300px'
                    })

                    danZhiLayer.setVisibility(true);
                    markerlayer.setVisibility(false);
                }else if(zoom>3){
                    $('#legend2').removeClass('hide');
                    $('#legend1').addClass('hide');

                    $('.legend').css({
                        height : "122px",
                        width : '176px'
                    })

                    danZhiLayer.setVisibility(false);
                    markerlayer.setVisibility(true);
                }

            },
            evn : function(e){
                var event = e.event;
                if(e.target && e.target.refDataID){
                    var fid = e.target.refDataID;
                    var fea = danZhiLayer.getFeatureById(fid);
                    for(var i = 0;i<provinceArrSimple.length;i++){
                        if(provinceArrSimple[i].name == fea.attributes.NAME){
                            var orgCode =  provinceArrSimple[i].value;
                            var url = tableUrl + orgCode;
                            $.ajax({
                                url : url,
                                type:'get',
                                dataType: 'json',
                                success : function(data){
                                    pieChartDom.style.display = "block";
                                    pieChartDom.style.left = (event.x + 20) + "px";
                                    pieChartDom.style.top = (event.y - 20) + "px";
                                    $('#piechart123').html("<div id='charts'></div><button class='chartsDetail'>查看详情</button>");
                                    var result = data.result;
                                    var resultArr = result.dataList;
                                    var legendArr = ["已抽查数量","实有数量"];
                                    var xArr = [];
                                    var factArr = [];
                                    var ccArr = [];
                                    for(var i = 0 ;i<resultArr.length;i++){
                                        if(resultArr[i].TYPE == 1){
                                            xArr.push("产品制造企业");
                                        }else if(resultArr[i].TYPE == 5){
                                            xArr.push("筏站");
                                        }else if(resultArr[i].TYPE == 6){
                                            xArr.push("GMDSS");
                                        }
                                        factArr.push(resultArr[i].TOTALNUM);
                                        ccArr.push(resultArr[i].CHECKNUM);
                                    }
                                    var option = {
                                        backgroundColor:"",
                                        tooltip : {
                                            trigger: 'axis',
                                            axisPointer : {            // 坐标轴指示器，坐标轴触发有效
                                                type : 'shadow'        // 默认为直线，可选为：'line' | 'shadow'
                                            }
                                        },
                                        title: {
                                            text:fea.attributes.NAME+"监督抽查分析图",
                                            x:'center'
                                        },
                                        legend: {
                                            data: legendArr,
                                            left:0,
                                            top:30

                                        },
                                        grid: {
                                            left: '3%',
                                            right: '4%',
                                            bottom: '3%',
                                            containLabel: true
                                        },
                                        xAxis:  {
                                            type: 'category',
                                            data: xArr
                                        },
                                        yAxis: {
                                            type: 'value'
                                        },
                                        series: [
                                            {
                                                name: '已抽查数量',
                                                type: 'bar',
                                                stack: '总量',
                                                label: {
                                                    normal: {
                                                        show: true,
                                                        position: 'inside',
                                                        color:"#000"
                                                    }
                                                },
                                                itemStyle:{
                                                    normal:{
                                                        color:"#153981",
                                                        borderColor:"#153981",
                                                        borderWidth:2
                                                    }
                                                },
                                                data: ccArr
                                            },
                                            {
                                                name: '实有数量',
                                                type: 'bar',
                                                stack: '总量',
                                                label: {
                                                    normal: {
                                                        show: true,
                                                        position: 'inside',
                                                        color:"red"
                                                    }
                                                },
                                                itemStyle:{
                                                    normal:{
                                                        color:"rgba(128, 128, 128, 0.5)",
                                                        borderColor:"#153981",
                                                        borderWidth:2
                                                    }
                                                },
                                                data: factArr
                                            }
                                        ]
                                    };
                                    var myChart = echarts.init(document.getElementById('charts'));
                                    $('.chartsDetail').on('click',function(){
                                        var checkRate = result.checkRate;
                                        $('.showNews').trigger('click');
                                        $('.totalNum').html(checkRate);
                                        $('.shengfen').html(fea.attributes.NAME);
                                        
                                        for(var i = 0;i<resultArr.length;i++){
                                            if(resultArr[i].TYPE == 1){
                                                $('.yc_cp').html(resultArr[i].CHECKNUM)
                                                $('.sy_cp').html(resultArr[i].TOTALNUM)
                                                $('.cc_cp').html( (resultArr[i].CHECKNUM/resultArr[i].TOTALNUM).toFixed(2)  );
                                            }else if(resultArr[i].TYPE == 5){
                                                $('.yc_fz').html(resultArr[i].CHECKNUM)
                                                $('.sy_fz').html(resultArr[i].TOTALNUM)
                                                $('.cc_fz').html( (resultArr[i].CHECKNUM/resultArr[i].TOTALNUM).toFixed(2)  );
                                            }else if(resultArr[i].TYPE == 6){
                                                $('.yc_gmdss').html(resultArr[i].CHECKNUM)
                                                $('.sy_gmdss').html(resultArr[i].TOTALNUM)
                                                $('.cc_gmdss').html( (resultArr[i].CHECKNUM/resultArr[i].TOTALNUM).toFixed(2)  );
                                            }
                                        }
                                    })

                                    myChart.setOption(option);
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
                map.addLayers([tiandi,layer1,tiandiVct,polygonLayer,danZhiLayer,markerlayer,chartLayer]);
                map.setCenter(new SuperMap.LonLat(108.067923, 32.679943),3);
                that.dzInit();
                that.addMarker();

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

                that.mapChange();
                that.queryData();
                that.clearIt();
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

            mapChange : function(){
                //初始化
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
            addMarker : function(){
                var that = this;
                $.ajax({
                    url : markUrl,
                    type:'get',
                    dataType : 'json',
                    success : function(data){
                        if(data.msg == 'success'){
                            var result = data.result;
                            console.log(result);
                            var date = result.checkTime;
                            $('.year').html(date);
                            s_arr = [];
                            for(var i = 0;i<result.dataList.length;i++){
                                var curr = result.dataList[i];
                                var x = result.dataList[i].POSX;
                                var y = result.dataList[i].POSY;
                                var images;
                                if(curr.STATUS == 0){
                                    images  = "${supermap}/theme/images/yellow.png";
                                }else if(curr.STATUS == 1){
                                    images = "${supermap}/theme/images/green.png"
                                }else if(curr.STATUS == 2){
                                    images = "${supermap}/theme/images/red.png"
                                }
                                var size = new SuperMap.Size(12, 12);
                                var offset = new SuperMap.Pixel(0, 0);
                                var icon = new SuperMap.Icon(images, size, offset);
                                var marker = new SuperMap.Marker(new SuperMap.LonLat(x, y), icon);
                                marker.id = curr.ENTID;
                                marker.status = curr.STATUS;
                                marker.events.on({
                                    "click":that.openInfoWin,
                                    "scope": marker
                                });
                                s_arr.push(marker);
                                markerlayer.addMarker(marker);

                            }
                        }
                        that.inputCheck();
                    }
                })
            },
            openInfoWin : function(){
                if(infowin) {
                    try {
                        map.removePopup(infowin)
                    }catch(e) {

                    }
                }
                var marker = this;
                var id = marker.id;
                var url = clickUrl +  id ;
                var lonlat = marker.getLonLat();

                $.ajax({
                    url : url,
                    type:'get',
                    dataType : 'json',
                    success : function(data){ 
                        var contentHTML = "<div style='font-size:.8em; opacity: 2.0; overflow:auto;'>";
                        var score = marker.status;
                        var str = "";
                        if(score == 0){
                            str = "该企业未被抽查";
                        }else if(score == 1 || score == 2){
                            str = data.result.rate;
                        }
                         contentHTML += "<div>"+"机构名称："+"<a>"+data.result.ENTNAME+"</a>"+
                             "<br/>"+"机构地址："+ data.result.ENTADDRESS+"<br>机构评分&nbsp;:"+str;
                             "</div></div>";
                        var size = new SuperMap.Size(0, 33);
                        var offset = new SuperMap.Pixel(11, 10);
                        var icon = new SuperMap.Icon("theme/images/cluster4.png", size, offset);
                        var popup = new SuperMap.Popup.FramedCloud("popwin",
                            new SuperMap.LonLat(lonlat.lon + 0.3,lonlat.lat - 0.3),
                            null,
                            contentHTML,
                            null,
                            true
                        );
                        infowin = popup;
                        map.addPopup(popup);
                    }
                })
             },
            dzInit : function(){
                var that = this;
                var dzData;
                $.ajax({
                    url:allUrl ,
                    type:'get',
                    dataType: 'json',
                    success : function(data){
                        if(data.msg == 'success'){
                            var result = data.result;
                            console.log(result)
                            arr = translateCode(result);
                            var color;
                            var dzArr = [];
                            for(var i = 0;i<arr.length;i++){
                                var dataObj = new Object();
                                if(arr[i].RATE < 40 ){
                                    color = '#00CCFF';
                                    dataObj = {
                                        value : arr[i].PROVNAME ,
                                        style : {fillColor : color}
                                    }
                                }else if(arr[i].RATE >= 40 && arr[i].RATE < 60){
                                    color = '#0099FF';
                                    dataObj = {
                                        value : arr[i].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }else if(arr[i].RATE >= 60 && arr[i].RATE < 80){
                                    color = '#0066FF';
                                    dataObj = {
                                        value : arr[i].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }else if(arr[i].RATE >= 80){
                                    color = '#003399';
                                    dataObj = {
                                        value : arr[i].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }
                                test.handleData(arr,dataObj)
                            }
                            var _source = 'China';
                            var _dataSourceName = 'China:Provinces_R';
                            var _dataUrl = "http://47.92.125.222:8083/iserver/services/data-ChinaProvinces/rest/data";
                            var op = {
                                source: _source,
                                dataSourceName: _dataSourceName,
                                dataUrl : _dataUrl,
                            }
                            test.getDanzhi(op,that.processCompleted,that.processFailed);
                        }
                        //console.log(data);
                        //TODO 获取全国的数据
                    }
                })

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
                layer.msg(e.error.errorMsg);
            },
            inputCheck : function(){
                $('.choose').removeAttr("disabled");
                $('.y_choose').on('change',function(){
                    if(!$(this).is(':checked')){
                        for(var i=0;i<s_arr.length;i++){
                            if(s_arr[i].status == 0){
                                markerlayer.removeMarker(s_arr[i]);
                            }
                        }
                    }else if($(this).is(':checked')){
                        for(var i=0;i<s_arr.length;i++){
                            if(s_arr[i].status == 0){
                                markerlayer.addMarker(s_arr[i]);
                            }
                        }
                    }
                })

                $('.p_choose').on('change',function(){
                    if(!$(this).is(':checked')){
                        for(var i=0;i<s_arr.length;i++){
                            if(s_arr[i].status == 1){
                                markerlayer.removeMarker(s_arr[i]);
                            }
                        }
                    }else if($(this).is(':checked')){
                        for(var i=0;i<s_arr.length;i++){
                            if(s_arr[i].status == 1){
                                markerlayer.addMarker(s_arr[i]);
                            }
                        }
                    }
                })

                $('.c_choose').on('change',function(){
                    if(!$(this).is(':checked')){
                        for(var i=0;i<s_arr.length;i++){
                            if(s_arr[i].status == 2 ){
                                markerlayer.removeMarker(s_arr[i]);
                            }
                        }
                    }else if($(this).is(':checked')){
                        for(var i=0;i<s_arr.length;i++){
                            if(s_arr[i].status == 2){
                                markerlayer.addMarker(s_arr[i]);
                            }
                        }
                    }
                })
            }
        }
        return new OrgFun(options);
    }

</script>

</html>