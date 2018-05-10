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
            height: 900px;
            border:1px solid #3473b7;
        }
        /*能力评分等级样式*/
        .abilityLevel{
            z-index: 1;
            color: #666;
            display: none;
        }
        .level1 img,.level2 img,.level3 img{
            width: 16px;
            height: 16px;
        }
        .level1,.level2,.level3{
            line-height: 40px;
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
            bottom:31px;
            height:235px;
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
<%--机构能力评分等级--%>
<div class="legend">
    <%--面事件图例--%>
    <div id="faceLevel">
        <p>
            <span class="legend_block" style="background-color:#00CCFF;"></span>： <span> 产品制造企业0-50个</span>
        </p>
        <p>
            <span class="legend_block" style="background-color:#29ef57;"></span>： <span> 产品制造企业大于50个小于100个</span>
        </p>
        <p>
            <span class="legend_block" style="background-color:#293eef;"></span>： <span> 产品制造企业大于100个小于150个  </span>
        </p>
        <p>
            <span class="legend_block" style="background-color:#ce0ced;"></span>： <span> 产品制造企业大150个小于200个  </span>
        </p>
        <p>
            <span class="legend_block" style="background-color:#ed0c27;"></span>： <span> 产品制造企业大于200个小于250个  </span>
        </p>
        <p>
            <span class="legend_block" style="background-color:#edea0c;"></span>： <span> 产品制造企业大于250个  </span>
        </p>
    </div>
    <%--机构能力评分等级 点 图例--%>
    <div class="abilityLevel">
        <div class="level1">
            <input type="checkbox" value="1"  id="btn1" checked> 产品制造企业能力80-100分：<img src="${supermap}/theme/images/green.png" alt="80-100分">
        </div>
        <div class="level2">
            <input type="checkbox" value="2"  id="btn2" checked> 产品制造企业能力60-80分：<img src="${supermap}/theme/images/blue.png" alt="60-80分">
        </div>
        <div class="level3">
            <input type="checkbox" value="3"  id="btn3" checked> 产品制造企业能力0-60分：<img src="${supermap}/theme/images/pure.png" alt="0-60分">
        </div>
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
    <h3 class="title03">产品认可型号统计</h3>
    <%--机构表--%>
    <table class="surCount">
        <thead>
        <tr>
            <th colspan="10"><span class="cpzzNum"></span>省产品制造企业数量统计</th>
        </tr>
        <tr>
            <th colspan="5">产品制造企业总数</th>
            <th colspan="5"><span class="zs">**</span>个</th>
        </tr>
        <tr>
            <th>船用材料</th>
            <th>舾装部件</th>
            <th>轮机设备</th>
            <th>电气设备</th>
            <th>通导设备</th>
            <th>救生设备</th>
            <th>信号设备</th>
            <th>消防设备</th>
            <th>防污染设备</th>
            <th>其他</th>
        </tr>
        </thead>
        <tbody>
        <tr class="num">
            <td class="num1"></td>
            <td class="num2"></td>
            <td class="num3"></td>
            <td class="num4"></td>
            <td class="num5"></td>
            <td class="num6"></td>
            <td class="num7"></td>
            <td class="num8"></td>
            <td class="num9"></td>
            <td class="num10"></td>
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

    var map,layer1, markerlayer,marker,final,themeLayer,control,orgCode, utfgrid, chartLayer,
        url = system.echartsUrl;
    var themUrl = system.dataUrl;
    var tiandiMap = system.tiandiUrl;
    var tiandiVecMap = system.tiandiVecUrl;
    var a_url=get_root+'/gis/getProductCreateData1';
    var org_url = get_root + '/gis/getProductCreateData4';
    var them_url = get_root +'/gis/getProductCreateData2';
    var score_url = get_root +'/gis/getProductCreateData3';
    var themeResult=[];
    var con;
    var pieChartDom;
    var elementsDiv;
    var isMapMoving = false;
    var tiandi;
    var tools;
    var tiandiVct;
    var polygonLayer,drawPolygon,drawBounds,drawCircle,drawToLine;

    function init(){

        if(!document.createElement('canvas').getContext){
            alert("您的浏览器不支持 Canvas，请升级！");
            return;
        }

        //绘制图层
        polygonLayer = new SuperMap.Layer.Vector("polygonLayer");
        drawPolygon  = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.Polygon);

        //query
        drawBounds = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.Box);
        drawBounds.events.on({"featureadded": drawCompleted});

        //几何圆查询
        drawCircle = new SuperMap.Control.DrawFeature(polygonLayer,SuperMap.Handler.RegularPolygon,{handlerOptions:{sides:50}});
        drawCircle.events.on({"featureadded": drawCompleted});

        //测距
        drawToLine = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.Path, { multi: false });


        map = new SuperMap.Map("map",{controls:[
            new SuperMap.Control.Navigation() ,
            new SuperMap.Control.ScaleLine(),
//                new SuperMap.Control.LayerSwitcher(),
            new SuperMap.Control.MousePosition(),
                drawPolygon,
                drawBounds,
                drawCircle,
                drawToLine
        ],
            projection: "EPSG:4326"
        });
        //地图移动过程中不显示图表
        map.events.on({"movestart": function(){
           // $("#piechart").innerHTML = "";
            pieChartDom.style.display = "none";
            isMapMoving = true;
        }});
        map.events.on({"moveend": function(){
            isMapMoving = false;
        }});

        layer1 = new SuperMap.Layer.TiledDynamicRESTLayer("china", url, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});

        markerlayer = new SuperMap.Layer.Markers("markerLayer");

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
        fork = document.createElement("div");
        pieChartDom.id = "piechart";
        pieChartDom.style.width = "400px";
        pieChartDom.style.height = "240px";
        pieChartDom.style.position = "absolute";
        pieChartDom.style.opacity = 0.8;
        fork.id = "fork";
        fork.style.width = "30px";
        fork.style.height = "30px";
        fork.style.position = "absolute";
        fork.style.top ="10px";
        fork.style.right ="20px";
        fork.style.color ="red";
        $('#fork').innerHTML ="X";
        elementsDiv.appendChild(pieChartDom);
        pieChartDom.appendChild(fork);
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
                if (infoo && infoo.data) {
                    $("#piechart").innerHTML = "#F4F3F0";
                    pieChartDom.style.display = "block";

                    // 基于准备好的dom，初始化echarts图表
                    myChart = echarts.init(pieChartDom);
                    var thedata;

                    // echart 图表配置参数
                    var option = {
                        backgroundColor:"#F4F3F0",
                        title : {
                            text: infoo.data.NAME +'产品制造企业能力分布图',
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
                            data: ['0-60分制造企业数量','60-80分制造企业数量','80-100分制造企业数量']
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

                }
                else{
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
        for (var i = 0; i < provinceArr.length; i++) {
            if (provinceArr[i].name == infoo.data.NAME) {
                orgCode = provinceArr[i].value;   //1100000
                var this_url = score_url + "?uid=" + orgCode;
                $.get(this_url, function (data) {
                    var scoreData =JSON.parse(data);
                    for(var j=0;j<scoreData.result.length;j++){
                        if(scoreData.result[j].name =="60-80"){
                            score.push({
                                name:scoreData.result[j].name+"分制造企业数量",
                                value:scoreData.result[j].value
                            })

                        }else if(scoreData.result[j].name =="80-100"){
                            score.push({
                                name:scoreData.result[j].name+"分制造企业数量",
                                value:scoreData.result[j].value
                            })
                        }else{
                            score.push({
                                name:scoreData.result[j].name+"分制造企业数量",
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
        themeLayer.setOpacity(0.5);

        themeLayer.style = {
            stroke : true,
            strokeWidth : 2,
            strokeColor : "#fff",
            strokeLinecap : "butt"
        };
        //hover样式开关
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

    // move填充content
    function event(e){
        if(e.target && e.target.refDataID){
            var fid = e.target.refDataID;
            var fea = themeLayer.getFeatureById(fid);
            $('.num td').html("");
            for(var i = 0;i<provinceArrSimple.length;i++){
                if(provinceArrSimple[i].name == fea.attributes.NAME){
                    orgCode = provinceArrSimple[i].value;   //1100000
                    var this_url = org_url+"?uid="+orgCode;
                    $.get(this_url,function(data){
                        var da = JSON.parse(data);
                        var _res = da.result;
                        console.log(_res)
                        $('.num1').html(_res.orgNums);
                        $('.cpzzNum').html(fea.data.NAME);
                        $('.zs').html(_res.totalNum);
                        for(var i=0;i<_res.dataList.length;i++){
                            if(_res.dataList[i].type == "船用材料"){
                                $('.num1').html(_res.dataList[i].NUM);
                            }else if(_res.dataList[i].type == "舾装部件"){
                                $('.num2').html(_res.dataList[i].NUM);
                            }else if(_res.dataList[i].type == "轮机设备"){
                                $('.num3').html(_res.dataList[i].NUM);
                            }else if(_res.dataList[i].type == "电气设备"){
                                $('.num4').html(_res.dataList[i].NUM);
                            }else if(_res.dataList[i].type == "通讯导航设备*"){
                                $('.num5').html(_res.dataList[i].NUM);
                            }else if(_res.dataList[i].type == "救生设备*"){
                                $('.num6').html(_res.dataList[i].NUM);
                            }else if(_res.dataList[i].type == "信号设备"){
                                $('.num7').html(_res.dataList[i].NUM);
                            }else if(_res.dataList[i].type == "消防设备*"){
                                $('.num8').html(_res.dataList[i].NUM);
                            }else if(_res.dataList[i].type == "防污设备"){
                                $('.num9').html(_res.dataList[i].NUM);
                            }else{
                                $('.num10').html(_res.dataList[i].NUM);
                            };
                        }
                    })
                }
            }
        }else{

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
                    var arr = translateCode(themeResult);
                    if(arr[k].PROVNAME == feature.attributes.NAME){
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
            success:function(data){
                var data =  JSON.parse(data);
                themeResult = data.result;
                //  颜色判断
                var color;
                var arr = translateCode(themeResult);
                for(var k=0;k<themeResult.length;k++){
                    var dataObj = new Object();
                    if(themeResult[k].NUM >0 && themeResult[k].NUM<=50){
                        color = '#00CCFF';
                        dataObj = {
                            value : arr[k].PROVNAME,
                            style : {fillColor : color}
                        }
                    }else if(themeResult[k].NUM >50 && themeResult[k].NUM<=100){
                        color = '#29ef57';
                        dataObj = {
                            value : arr[k].PROVNAME,
                            style : {fillColor : color}
                        }
                    }else if(themeResult[k].NUM >100 && themeResult[k].NUM<=150){
                        color = '#293eef';
                        dataObj = {
                            value : arr[k].PROVNAME,
                            style : {fillColor : color}
                        }
                    }else if(themeResult[k].NUM >150 && themeResult[k].NUM<=200){
                        color = '#ce0ced';
                        dataObj = {
                            value : arr[k].PROVNAME,
                            style : {fillColor : color}
                        }
                    }else if(themeResult[k].NUM >200 && themeResult[k].NUM<=250){
                        color = '#ed0c27';
                        dataObj = {
                            value : arr[k].PROVNAME,
                            style : {fillColor : color}
                        }
                    }else{
                        color = '#edea0c';
                        dataObj = {
                            value : arr[k].PROVNAME,
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

    function addLayer(){
        tiandi =  new SuperMap.Layer.TiledDynamicRESTLayer("China", tiandiMap, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
        tiandi.events.on({"layerInitialized":addLayer2});
    }

    function addLayer2(){
        var that = this;
        tiandiVct = new SuperMap.Layer.TiledDynamicRESTLayer("China2", tiandiVecMap, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
        tiandiVct.events.on({"layerInitialized":addLayer3});
    }

    function addLayer3(){
        var that = this;
        map.addLayers([tiandi,layer1,tiandiVct,markerlayer,polygonLayer,themeLayer,chartLayer,utfgrid]);
        //显示地图范围
        map.setCenter(new SuperMap.LonLat(108.067923, 32.679943),3);

        $.ajax({
            url:a_url ,
            type:'post',
            success: function (data) {
                console.log(JSON.parse(data));
                addData(data);
            }
        })

        tools = new ToolsNav({
            id : "#tools",
            map : map,
            layui : layui,
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
        });

        // var scArr = [];
        //
        // for(var i = 0;i<17;i++){
        //     scArr.push(tiandi.getScaleForZoom(i))
        // }
        // console.log(scArr.reverse())
        // var t = tiandi.getScaleForZoom();
        // console.log(t)

        mapChange();
        queryData();
        clearIt();
        addThemeLayer();
    }

    function clearIt(){
        $("#clearIt").on('click',function(){
            //清除绘制图层
            polygonLayer.removeAllFeatures();
            //circleLayer.removeAllFeatures();
        })
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

    function mapChange(){
        $('#zidingyiMap').trigger('click');
        // tiandi.setVisibility(false);
        // layer1.setVisibility(true);
        // tiandiVct.setVisibility(false);
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


    function toolsEvn(){
        var element = layui.element();
        //必加此行代码激活layui属性
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

        $('#searchContent').on('keyup',function(event){
            if(event.keyCode === 13){
                //TODO 进行ajax请求
                var htmlContent = $(this).val();

                if(htmlContent == ""){
                    layer.msg('请输入搜索内容');
                    $('#searchResult').css({
                        display : "none",
                        height : "1px"
                    })
                    return;
                }

                $.ajax({
                    type : "get",
                    url  : "/gis/getProductCreateData1?name="+htmlContent,
                    dataType : "json",
                    success :function(data){
                        if( data.result.length == 0 ){
                            layer.msg('没有搜索到包含"'+htmlContent+"\"的相关企业信息,请更换关键词查询");
                            return;
                        }else{

                            var ele = $('#searchResult');
                            var html = "";
                            for(var i = 0;i<data.result.length;i++){
                                var s = data.result[i].ENTNAME.indexOf('*');
                                var result = data.result[i].ENTNAME.substring(0,s);
                                html += "<li class='searchText' certId="+data.result[i].ID+">"+result+"</li>"
                            }

                            ele.css({
                                display : "block"
                            }).animate({
                                height  : "214px"
                            }).html(html)

                            $('#searchResult .searchText').on('click',function(){
                                var html = $(this).html();
                                var id = $(this).attr('certId');
                                $('#searchContent').val(html);
                                ele.css({
                                    display : "none",
                                    height : "1px"
                                })

                                zoomToThere(data.result,id);

                            })

                        }
                    }
                })

            }
        })


    }

    function zoomToThere(data,id){
        for(var i = 0 ; i< data.length;i++){
            if(data[i].ID == id){
                map.setCenter(new SuperMap.LonLat(data[i].POSX,data[i].POSY),8)

                if(infowin){
                    try{
                        infowin.hide();
                        infowin.destroy();
                        map.removePopup(infowin)
                    }
                    catch(e){

                    }
                }
                var contentHTML = "<div style='font-size:.8em; opacity: 0.8; overflow-y:hidden; color:black;'>";
                contentHTML += "<div class='nameJump'>企业名称:<a onclick='layerOpen(point.pid)'>"+data[i].ENTNAME+"</a></div><div>企业地址:<a>"+data[i].ADDDRESS+"</a></div><div>企业负责人:<a>"+data[i].LEGAL+"</a></div>";
                contentHTML +="<div>联系电话:<a>"+data[i].TEL+"</a></div><div>认可产品型号数量:<a>"+data[i].CERTNUM+"</a></div><div>企业能力得分:<span>"+data[i].ENTSCORE+"</span></div> </div>";
                var size = new SuperMap.Size(20,33);
                var icon = new SuperMap.Icon("theme/images/cluster4.png", size);
                var popup = new SuperMap.Popup.FramedCloud("zoom",new SuperMap.LonLat(data[i].POSX,data[i].POSY),size,contentHTML,icon,true);
                infowin = popup;
                map.addPopup(popup);
            }
        }
    }


    //鼠标缩放级别
    function zoom(){
        var zoomLayer = map.getZoom();
        //console.log(zoomLayer)

        if(zoomLayer <= 3){
            //clearLayer();
            markerlayer.setVisibility(false);
            themeLayer.setVisibility(true);
            closeInfoWin();
            $('.legend').css({
                height : "238px"
            })

            $('.abilityLevel').css('display','none');
            $('#faceLevel').css('display','block');
            utfgrid.setVisibility(true);
        }else if(zoomLayer > 3){
            //clearLayer();
            markerlayer.setVisibility(true);
            themeLayer.setVisibility(false);
            $('.legend').css({
                height : "120px"
            })

            $('.abilityLevel').css('display','block');
            $('#faceLevel').css('display','none');
            utfgrid.setVisibility(false);
        }
    }
    //添加数据
    function addData(data) {
        data = JSON.parse(data);
        var result = data.result;

        markerlayer.removeMarker(marker);
        var size = new SuperMap.Size(12,12);
        var offset = new SuperMap.Pixel(-(size.w/2), -size.h);
        var icon = new SuperMap.Icon('${supermap}/theme/images/cluster4.png', size, offset);
        final = [];
        for(var i=0;i<result.length;i++){
            //  能力评分
            if(result[i].ENTSCORE >= 80 && result[i].ENTSCORE<100){
                icon = new SuperMap.Icon('${supermap}/theme/images/green.png',size,offset);
                var index = i;
                getit(index);
                check(index);
            }else if(result[i].ENTSCORE >= 60 && result[i].ENTSCORE<80){
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
            function getit(i){
                marker =new SuperMap.Marker(new SuperMap.LonLat(result[i].POSX,result[i].POSY),icon);
                marker.name = result[i].ENTNAME;
                marker.adress = result[i].ADDDRESS;
                marker.phone = result[i].TEL;
                marker.respperson = result[i].LEGAL;
                marker.score =result[i].ENTSCORE;
                marker.num = result[i].CERTNUM;
                marker.events.on({
                    "click":openInfoWin,
                    "touchstart":openInfoWin, //假如要在移动端的浏览器也实现点击弹框，则在注册touch类事件
                    "scope": marker
                });
                final.push(marker);
                markerlayer.addMarker(marker);
            }
        }
        callback();
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
    //打开对应的信息框
    var infowin = null;
    function openInfoWin(){
        closeInfoWin();
        var marker = this;
        var lonlat = marker.getLonLat();
//            var orgame = marker.orgname;
        var size = new SuperMap.Size(0, 33);
        var offset = new SuperMap.Pixel(0, 0);
        var icon = new SuperMap.Icon("theme/images/cluster4.png", size, offset);
        var contentHTML = "<div style='font-size:.8em; opacity: 0.8; overflow-y:hidden; color:black;'>";
        contentHTML += "<div class='nameJump'>企业名称:<a onclick='layerOpen(marker.code)'>"+marker.name+"</a></div><div>企业地址:<a>"+marker.adress+"</a></div><div>企业负责人:<a>"+marker.respperson+"</a></div>";
        contentHTML +="<div>联系电话:<a>"+marker.phone+"</a></div><div>认可产品型号数量:<a>"+marker.num+"</a></div><div>企业能力得分：<span>"+marker.score+"</span> </div>";

        var popup = new SuperMap.Popup.FramedCloud("popwin",new SuperMap.LonLat(lonlat.lon,lonlat.lat),null,contentHTML,icon,true);
        infowin = popup;
        map.addPopup(popup);

    }

    //jump to other html by layer  problem???
    function layerOpen(url){
        var url = get_root+"/index/main?loadUrl="+url+"&hideType=1";
        var index = layer.open({
            type: 2,
            area: ['100%', '100%'],
            skin:'jumpLayer',
            content:url,
            title : "",
        });
        layer.full(index);

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