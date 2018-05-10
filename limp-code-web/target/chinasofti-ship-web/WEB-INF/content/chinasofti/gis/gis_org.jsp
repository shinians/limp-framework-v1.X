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
            height: 770px;
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
        .fork {
            position: absolute;
            top: 3px;
            right: 14px;
        }

        .dataTablecenter{
            font-size: 12px;
        }
        .num td{
            height: 20px;
        }
        .legend{
            height: 240px;
            bottom: 85px;
             left: 20px;
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
        .nameJump{
            cursor:pointer;
        }
        /*========測試========*/
        .detailTal{
            background-color: rgba(9, 21, 48, 0.52);
            color:#70a8c6;
        }
        #piechart{
            border-radius: 5px;
        }

        #orgContain{
            padding:10px;
            display: none;
            height:300px;
            width:600px;
            background-color:rgba(9, 21, 48);
            opacity: 0;
            top: 80px;
            position: absolute;
            right:-300px;
            overflow-y: auto;
            border-radius: 5px;
        }
        #orgContain table.orgTable{
            width:100%;
            color:#fff;
            font-size: 12px;
            border:1px solid transparent;
            text-align: center;
        }
        #orgContain table.orgTable thead{
            font-size: 14px;
        }
        #orgContain table.orgTable tr td{
            line-height: 25px;
            width:65px;
        }
        #orgContain table.orgTable tr td:nth-child(1){
            width:20px;
        }
        #orgContain table.orgTable tr td:nth-child(6){
            width:35px;
        }
    </style>



</head>
<body onload="init()" >
    <div id="tools">

    </div>

    <div id="map">

        <div class="legend">
            <%--面事件图例--%>
            <div id="faceLevel">
                <p>
                    <span class="legend_block" style="background-color:#CCFFFF;"></span>： <span> 检验机构数小于30个</span>
                </p>
                <p>
                    <span class="legend_block" style="background-color:#CCCCFF;"></span>： <span> 检验机构数大于30个小于60个</span>
                </p>
                <p>
                    <span class="legend_block" style="background-color:#CC99FF;"></span>： <span> 检验机构数大于60个小于90个  </span>
                </p>
                <p>
                    <span class="legend_block" style="background-color:#CC66FF;"></span>： <span> 检验机构数大90个小于120个  </span>
                </p>
                <p>
                    <span class="legend_block" style="background-color:#CC33FF;"></span>： <span> 检验机构数大于120个小于150个  </span>
                </p>
                <p>
                    <span class="legend_block" style="background-color:#CC00FF;"></span>： <span> 检验机构数大于150个  </span>
                </p>
            </div>
            <%--机构能力评分等级 点 图例--%>
            <div id="abilityLevel">
                <div class="level1">
                    <%--<input type ="checkbox" value="1"  id="btn1" checked> --%>
                        检验机构能力80-100分：<img src="${supermap}/theme/images/green.png" alt="80-100分">
                </div>
                <div class="level2">                                        
                    <%--<input type="checkbox" value="2"  id="btn2" checked> --%>
                        检验机构能力60-80分：
                    <img src="${supermap}/theme/images/blue.png" alt="60-80分">
                </div>
                <div class="level3">
                    <%--<input type="checkbox" value="3"  id="btn3" checked> --%>
                        检验机构能力0-60分：
                    <img src="${supermap}/theme/images/pure.png" alt="0-60分">
                </div>
            </div>
            <%--图例级别4--%>
            <div id="abilityLevel2">
                <p>
                    <img src="${supermap}/theme/images/else.png">： <span>分局、市处、县站、计划单列市局</span>
                </p>
                <p>
                    <img src="${supermap}/theme/images/province.png">： <span> 省局</span>
                </p>
                <p>
                    <img src="${supermap}/theme/images/nation.png">： <span> 部局  </span>
                </p>
            </div>
        </div>

    </div>


    <%--机构分布--%>
    <span class="showNews">
        <img src="../../../../resources/style/images/gisleft.png" alt="">
    </span>

    <script type="text/template" id='orgDetail'>
        <table  class="orgTable">
            <thead>
                <tr>
                    <td>序号</td>
                    <td>机构名称</td>
                    <td>机构地址</td>
                    <td>联系电话</td>
                    <td>传真</td>
                    <td>机构得分</td>
                </tr>
            </thead>

            <tbody>
                <? for(var i = 0;i<result.length;i++) { ?>
                    <tr>
                        <td><?= i+1 ?></td>
                        <td> <?= result[i].orgname ?>  </td>
                        <td> <?= result[i].orgAddr ?>  </td>
                        <td> <?= result[i].contactPhone ?>  </td>
                        <td> <?= result[i].contactFax ?> </td>
                        <td> <?= result[i].score ?>  </td>
                    </tr>
                <? } ?>
            </tbody>
        </table>
    </script>

    <div id="orgContain">

    </div>

    <div class="detailTal" id="orgNums">
        <span class="hideNews">
            <img src="../../../../resources/style/images/gisright.png" alt="">
        </span>
        <h3 class="title03 nameJump">机构数量统计图</h3>
        <%--机构表--%>
        <table class="surCount">
            <thead>
                <tr>
                    <th rowspan="2">机构总数</th>
                    <th colspan="3">机构管理方式</th>
                    <th colspan="3">经费拨款方式</th>
                    <th colspan="3">设置方式</th>
                </tr>
                <tr>
                    <th>公务员管理</th>
                    <th>参公管理</th>
                    <th>事业单位</th>
                    <th>全额拨款</th>
                    <th>差额拨款</th>
                    <th>自收自支</th>
                    <th>独立机构</th>
                    <th>二合一机构</th>
                    <th>三合一机构</th>
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

    <script>

        var height = top.document.body.clientHeight
        $('#map').css({
            height: height
        })

        function init(){



            var orgBlity = new OrgBlity();
            orgBlity.init();
        }

        function OrgBlity(options){
            var baseMap = system.echartsUrl;
            var orgMap = system.orgMapUrl;
            var themUrl = system.dataUrl;
            var tiandiMap = system.tiandiUrl;
            var tiandiVecMap = system.tiandiVecUrl;
            var a_url= get_root+'/gis/getConstructionOrg';
            var them_url = get_root +'/gis/getOrgData2';
            var score_url = get_root +'/gis/getOrgData1';
            var org_url = get_root + '/gis/getOrgData';
            var infowin = null;
            var isMapMoving = false;
            var pieChartDom,elementsDiv;
            var layer1,map,org,utfgrid,control,tools,marker,themeLayer,tiandi,tiandiVct,chartLayer,final,myChart;
            var polygonLayer,drawPolygon,markerlayer,drawBounds,drawCircle,drawToLine;
            var loadLayer;

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
                    //绘制图层
                    polygonLayer = new SuperMap.Layer.Vector("polygonLayer");
                    drawPolygon  = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.Polygon);

                    //query
                    drawBounds = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.Box);
                    drawBounds.events.on({"featureadded": that.drawCompleted.bind(this)});

                    //几何圆查询
                    drawCircle = new SuperMap.Control.DrawFeature(polygonLayer,SuperMap.Handler.RegularPolygon,{handlerOptions:{sides:50}});
                    drawCircle.events.on({"featureadded": that.drawCompleted.bind(this)});

                    //测距
                    drawToLine = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.Path, { multi: false });

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

                    layer1 = new SuperMap.Layer.TiledDynamicRESTLayer("China", baseMap, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
                    layer1.events.on({"layerInitialized":that.addLayer.bind(this)});

                    themeLayer = new SuperMap.Layer.Unique("themeLayer");

                    that.themeLayerStyle(themeLayer);

                    map.events.on({"zoomend":that.zoom});

                    map.events.on({"click":that.close.bind(this)});

                    map.events.on({"movestart": function(){
                            $("#piechart").innerHTML = "";
                            pieChartDom.style.display = "none";
                            isMapMoving = true;
                    }});

                    map.events.on({"moveend": function(){
                            isMapMoving = false;
                    }});

                    markerlayer = new SuperMap.Layer.Markers("markerLayer");

                    that.echartLayer();

                    themeLayer.on("click", that.themeEvent.bind(this));


                },

                close : function(){
                    var that = this;
                    var ele = $('#orgContain');
                    var state = $('#orgContain').css('display');
                    if(state == 'block'){
                        ele.animate({
                            right : '-300px',
                            opacity : '0'
                        },function(){
                            ele.css({
                                'display' : 'none'
                            })
                        })
                    }
                    polygonLayer.removeAllFeatures();

                    if(infowin){
                        try{
                            infowin.hide();
                            infowin.destroy();
                            map.removePopup(infowin)
                        }
                        catch(e){}
                    }

                },

                themeEvent : function(e){
                    var that = this;
                    var event = e.event;
                    if(e.target && e.target.refDataID){
                        var fid = e.target.refDataID;
                        var fea = themeLayer.getFeatureById(fid);
                        //表格填充
                        for(var i = 0;i<provinceArrSimple.length;i++){
                            if(provinceArrSimple[i].name == fea.attributes.NAME){
                                var orgCode = provinceArrSimple[i].value;
                                var this_url = org_url+"?uid="+orgCode;
                                $.get(this_url,function(data){
                                    var da = JSON.parse(data);
                                    //console.log(da);
                                    var _res = da.result;

                                    for(var i = 0;i<=10;i++){
                                        $('.num'+i).html('0')
                                    }

                                    $('.num1').html(_res.orgNums);
                                    for(var i=0;i<_res.orgManageMode.length;i++){
                                        if(_res.orgManageMode[i].name == "公务员管理"){
                                            $('.num2').html(_res.orgManageMode[i].NUMS);
                                        }else if(_res.orgManageMode[i].name == "事业机构"){
                                            $('.num3').html(_res.orgManageMode[i].NUMS);
                                        }else{
                                            //   参公管理
                                            $('.num4').html(_res.orgManageMode[i].NUMS);
                                        };

                                    }
                                    for(var i=0;i<_res.setMode.length;i++){
                                        if(_res.setMode[i].name == "二合一机构"){
                                            $('.num9').html(_res.setMode[i].NUMS);
                                        }else if(_res.setMode[i].name == "独立机构"){
                                            $('.num8').html(_res.setMode[i].NUMS);
                                        }else{
                                            $('.num10').html(_res.setMode[i].NUMS);
                                        };

                                    }
                                    for(var i=0;i<_res.foundMode.length;i++){
                                        if(_res.foundMode[i].name == "全额拨款"){
                                            $('.num5').html(_res.foundMode[i].NUMS);
                                        }else if(_res.foundMode[i].name == "差额拨款"){
                                            $('.num6').html(_res.foundMode[i].NUMS);
                                        }else{
                                            $('.num7').html(_res.foundMode[i].NUMS);
                                        };
                                    }

                                    that.show();
                                })

                            }
                        }

                        pieChartDom.style.display = "block";
                        pieChartDom.style.left = (event.x + 20) + "px";
                        pieChartDom.style.top = (event.y - 20) + "px";
                        myChart = echarts.init(document.getElementById('piechart'));

                        var thedata;
                        // echart 图表配置参数
                        var option = {
                            backgroundColor:"#F4F3F0",
                            title : {
                                text: fea.attributes.NAME+'地区机构能力分布图',
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
                                data: ['0-60分机构数量','60-80分机构数量','80-100分机构数量']
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
                        that.pieData(fea);

                        myChart.setOption(option);

                    }
                },
                show : function(){
                    $('#orgNums').css('display','block');
                    var ele = $('.shipDrop', window.parent.document);
                    if(ele.hasClass('deBounce')){
                        ele.trigger('click')
                    }
                },

                pieData : function(infoo){
                    var score=[];
                    for (var i = 0; i < provinceArrSimple.length; i++){
                        if(provinceArrSimple[i].name == infoo.attributes.NAME){
                            var orgCode = provinceArrSimple[i].value;
                            var this_url = score_url + "?uid=" + orgCode;
                            $.get(this_url, function (data) {
                                var scoreData =JSON.parse(data);
                                console.log(scoreData)
                                for(var j=0;j<scoreData.result.length;j++){
                                    if(scoreData.result[j].name =="60-80"){
                                        score.push({
                                            name:scoreData.result[j].name+"分机构数量",
                                            value:scoreData.result[j].value
                                        })

                                    }else if(scoreData.result[j].name =="80-100"){
                                        score.push({
                                            name:scoreData.result[j].name+"分机构数量",
                                            value:scoreData.result[j].value
                                        })
                                    }else{
                                        score.push({
                                            name:scoreData.result[j].name+"分机构数量",
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
                },

                zoom : function(){
                    var zoomLayer = map.getZoom();
                    if(zoomLayer <= 3){
                        org.setVisibility(false);
                        utfgrid.setVisibility(false);
                        themeLayer.setVisibility(true);
                        markerlayer.setVisibility(false);
                    }else if(zoomLayer > 3){
                        org.setVisibility(true);
                        markerlayer.setVisibility(true);
                        utfgrid.setVisibility(true);
                        themeLayer.setVisibility(false);
                    }
                },

                orgLayerCallback : function(infoLookup, loc, pixel){
                    //console.log(infoLookup)
                    if (infoLookup && isMapMoving === false){
                        for (var idx in infoLookup){
                            infoo = infoLookup[idx];
                            if (infoo && infoo.data){

                                if(infowin){
                                    try{
                                        infowin.hide();
                                        infowin.destroy();
                                        map.removePopup(infowin)
                                    }
                                    catch(e){}
                                }

                                var data = infoo.data;
                                console.log(data)
                                var lonlat = loc;
                                var size = new SuperMap.Size(0, 33);
                                var offset = new SuperMap.Pixel(0,0);
                                var icon = new SuperMap.Icon("theme/images/cluster4.png", size, offset);
                                var contentHTML = "<div style='font-size:.8em; opacity: 0.8; overflow-y:hidden; color:black;'>";
                                contentHTML += "<div class='nameJump'>机构名称:<a onclick='layerOpen("+data.orgcode+")'>"+data.orgname+"</a></div><div>机构地址:<a>"+data.orgAddr+"</a></div><div>机构负责人:<a>"+data.respperson+"</a></div>";
                                contentHTML +="<div>联系电话:<a>"+data.contactPhone+"</a></div><div>传真:<a>"+data.contactFax+"</a></div> </div>";

                                var popup = new SuperMap.Popup.FramedCloud("popwin",new SuperMap.LonLat(lonlat.lon,lonlat.lat),null,contentHTML,icon,true);
                                infowin = popup;
                                map.addPopup(popup);


                            }
                        }
                    }

                },
                addLayer : function(){
                    var that = this;
                    org =  new SuperMap.Layer.TiledDynamicRESTLayer("China",orgMap,{transparent: true, cacheEnabled: true});
                    org.events.on({"layerInitialized":that.addLayer2.bind(this)});

                },
                addLayer2 : function(){
                    var that = this;
                    tiandi =  new SuperMap.Layer.TiledDynamicRESTLayer("China", tiandiMap,{transparent: true, cacheEnabled: true});
                    tiandi.events.on({"layerInitialized":that.addLayer3.bind(this)});
                },

                addLayer3 : function () {
                    var that = this;
                    tiandiVct = new SuperMap.Layer.TiledDynamicRESTLayer("China2", tiandiVecMap,{transparent: true, cacheEnabled: true});
                    tiandiVct.events.on({"layerInitialized":that.addLayer4.bind(this)});
                },
                addLayer4 : function(){
                    var that = this;
                    utfgrid = new SuperMap.Layer.UTFGrid("UTFGridLayer", orgMap,
                        {
                            layerName: "orgPos@OrgPos",
                            utfTileSize: 256,
                            pixcell: 16,
                            isUseCache: false
                        },
                        {
                            utfgridResolution: 16
                        });

                    control = new SuperMap.Control.UTFGrid({
                        layers: [utfgrid],
                        callback: that.orgLayerCallback,
                        handlerMode: "click"
                    });
                    utfgrid.maxExtent = org.maxExtent;
                    //utfgrid.maxExtent = new SuperMap.Bounds(86.89 ,18.32,134.32,52.72 );
                    map.addControl(control);
                    map.addLayers([tiandi,layer1,markerlayer,tiandiVct,org,polygonLayer,themeLayer,chartLayer,utfgrid]);
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
                        drawLine :  drawToLine
                    });

                    that.addThemeLayer();
                    that.mapChange();
                    that.addMarker();
                    that.showChinaData();
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
                        var zoomLayer = map.getZoom();
                        if(zoomLayer > 3){
                            drawBounds.activate();
                        }else{
                            layer.msg('方搜功能仅限在点图层使用')
                        }
                    });
                    //圆搜
                    $("#queryCircle").on('click',function(){
                        var zoomLayer = map.getZoom();
                        if(zoomLayer > 3){
                            drawCircle.activate();
                        }else{
                            layer.msg('圆搜功能仅限在点图层使用')
                        }
                    })
                },
                showChinaData : function(){
                    $.get(org_url,function(data){
                        var _this = JSON.parse(data);
                        $('.num1').html(_this.result.orgNums);
                        for(var i=0;i<_this.result.orgManageMode.length;i++){
                            if(_this.result.orgManageMode[i].name == "公务员管理"){
                                $('.num2').html(_this.result.orgManageMode[i].NUMS);
                            }else if(_this.result.orgManageMode[i].name == "事业机构"){
                                $('.num3').html(_this.result.orgManageMode[i].NUMS);
                            }else if(_this.result.orgManageMode[i].name == "参照公务员管理"){
                                $('.num4').html(_this.result.orgManageMode[i].NUMS);
                            }
                        }
                        for(var i=0;i<_this.result.setMode.length;i++){
                            if(_this.result.setMode[i].name == "二合一机构"){
                                $('.num9').html(_this.result.setMode[i].NUMS);
                            }else if(_this.result.setMode[i].name == "独立机构"){
                                $('.num8').html(_this.result.setMode[i].NUMS);
                            }else{
                                $('.num10').html(_this.result.setMode[i].NUMS);
                            };

                        }
                        for(var i=0;i<_this.result.foundMode.length;i++){
                            if(_this.result.foundMode[i].name == "全额拨款"){
                                $('.num5').html(_this.result.foundMode[i].NUMS);
                            }else if(_this.result.foundMode[i].name == "人员经费全额但工作运转费差额拨款"){
                                $('.num6').html(_this.result.foundMode[i].NUMS);
                            }else if(_this.result.foundMode[i].name == "自收自支"){
                                $('.num7').html(_this.result.foundMode[i].NUMS);
                            };
                        }

                    })
                },
                echartLayer : function(){
                    chartLayer = new SuperMap.Layer.Elements("eCharts");
                    elementsDiv =  chartLayer.getDiv();
                    var mapsize = map.getSize();
                    elementsDiv.style.width = mapsize.w;
                    elementsDiv.style.height = mapsize.h;

                    pieChartDom = document.createElement("div");
                    pieChartDom.id = "piechart";
                    pieChartDom.style.width = "400px";
                    pieChartDom.style.height = "240px";
                    pieChartDom.style.position = "absolute";
                    pieChartDom.style.opacity = 0.8;

                    elementsDiv.appendChild(pieChartDom);

                },
                addMarker : function(){
                    var that = this;
                    $.ajax({
                        url:a_url ,
                        type:'get',
                        dataType: 'json',
                        success: function (data) {
                            var result = data.result;
                            var size = new SuperMap.Size(24,24);
                            var offset = new SuperMap.Pixel(-(size.w/2), -size.h+18);
                            var icon = new SuperMap.Icon('${supermap}/theme/images/cluster4.png', size, offset);
                            final = [];
                            markerlayer.removeMarker(marker);

                            for(var i = 0;i<result.length;i++){

                                if(result[i].typeLv == "省、自治区、直辖市局"){
                                    icon = new SuperMap.Icon('${supermap}/theme/images/province.png',size,offset);
                                    getit2(i);
                                }else if(result[i].typeLv =="部局"){
                                    icon = new SuperMap.Icon('${supermap}/theme/images/nation.png',size,offset);
                                    getit2(i);
                                }
                            }

                            function getit2(i){
                                marker = new SuperMap.Marker(new SuperMap.LonLat(result[i].posx,result[i].posy),icon);
                                marker.name = result[i].orgname;
                                marker.adress = result[i].orgAdress;
                                marker.phone = result[i].orgPhone;
                                marker.respperson = result[i].orgRespperson;
                                marker.score =result[i].orgScore;
                                marker.code = result[i].orgCode;
                                marker.events.on({
                                    "click":that.openInfoWin,
                                    "touchstart":that.openInfoWin, //假如要在移动端的浏览器也实现点击弹框，则在注册touch类事件
                                    "scope": marker
                                });
                                final.push(marker);
                                markerlayer.addMarker(marker);
                            }
                        }
                    })
                },
                openInfoWin : function(){
                    if(infowin){
                        try{
                            infowin.hide();
                            infowin.destroy();
                            map.removePopup(infowin)
                        }
                        catch(e){}
                    }
                    var marker = this;
                    var lonlat = marker.getLonLat();
                    var size = new SuperMap.Size(0, 33);
                    var offset = new SuperMap.Pixel(0,0);
                    var icon = new SuperMap.Icon("theme/images/cluster4.png", size, offset);
                    var contentHTML = "<div style='font-size:.8em; opacity: 0.8; overflow-y:hidden; color:black;'>";
                    contentHTML += "<div class='nameJump'>机构名称:<a onclick='layerOpen("+marker.code+")'>"+marker.name+"</a></div><div>机构地址:<a>"+marker.adress+"</a></div><div>机构负责人:<a>"+marker.respperson+"</a></div>";
                    contentHTML +="<div>联系电话:<a>"+marker.phone+"</a></div> </div>";
                    var popup = new SuperMap.Popup.FramedCloud("popwin",new SuperMap.LonLat(lonlat.lon,lonlat.lat),null,contentHTML,icon,true);
                    infowin = popup;
                    map.addPopup(popup);
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

                drawCompleted : function(obj){
                    drawBounds.deactivate();
                    drawCircle.deactivate();

                    var that = this;
                    that.clearStatus();

                    var feature = obj.feature;

                    var queryBounds = feature.geometry.bounds;

                    feature.style = {
                        strokeColor: "#17be54",
                        strokeWidth: 1,
                        pointerEvents: "visiblePainted",
                        fillColor: "#17be54",
                        fillOpacity: 0.5
                    };
                    polygonLayer.addFeatures(feature);

                    var queryParam, queryByBoundsParams, queryService;
                    queryParam = new SuperMap.REST.FilterParameter({name: "orgPos@OrgPos"});

                    queryByBoundsParams = new SuperMap.REST.QueryByBoundsParameters({queryParams: [queryParam], bounds: queryBounds});

                    queryService = new SuperMap.REST.QueryByBoundsService(orgMap, {
                        eventListeners: {
                            "processCompleted": that.searchComplate.bind(this),
                            "processFailed": that.searchFail
                        }
                    });

                    queryService.processAsync(queryByBoundsParams);

                    loadLayer = layer.load(1, {
                        shade: [0.1,'#fff'] //0.1透明度的白色背景
                    });

                },

                searchComplate : function(queryEventArgs){
                    var that = this;
                    var arr = [];
                    var i, j, result = queryEventArgs.result;
                    if (result && result.recordsets){
                        for(i=0, recordsets=result.recordsets, len=recordsets.length; i<len; i++){
                            if (recordsets[i].features){
                                layer.close(loadLayer)
                                for (j=0; j<recordsets[i].features.length; j++){
                                    var feature = recordsets[i].features[j];
                                    var point = feature.geometry;
                                    arr.push({
                                        orgname:feature.attributes.orgname,
                                        orgAddr:feature.attributes.orgAddr,
                                        score:feature.attributes.score,
                                        contactFax:feature.attributes.contactFax,
                                        contactPhone:feature.attributes.contactPhone
                                    })

                                }
                            }
                        }
                        var data = {
                            result : arr
                        }
                        var str =  template('orgDetail',data);
                        if(str){
                            that.hideNav();

                            $('#orgContain').html(str);
                            $('#orgContain').css({
                                display : 'block'
                            })
                            $('#orgContain').animate({
                                right : "60px",
                                opacity : '0.5'
                            })
                        }

                    }

                },

                searchFail : function(e){
                    layer.alert('查询搜索错误'+e);
                },

                clearStatus : function(){
                    polygonLayer.removeAllFeatures();
                },
                addThemeLayer : function(){
                    var that = this;
                    that.clearLayer();
                    var dataSourceName=[];
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
                        eventListeners: {"processCompleted": that.processCompleted, "processFailed": that.processFailed}});
                    getFeatureBySQLService.processAsync(getFeatureBySQLParams);
                    that.fillThemeBlock();

                },
                processCompleted : function(getFeaturesEventArgs){
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
                },
                processFailed : function(){
                    layer.alert('单值专题图绘制错误');
                },
                clearLayer : function(){
                    //先清除上次的显示结果
                    themeLayer.clear();
                },
                hideNav : function(){
                    var ele = $('.shipDrop', window.parent.document);
                    if(ele.hasClass('deBounce')){
                        ele.trigger('click')
                    }
                },
                fillThemeBlock : function(){
                    $.ajax({
                        url:them_url,
                        type:'post',
                        dataType:'json',
                        success:function(data){
                            themeResult = data.result;
                            //  颜色判断
                            var color;
                            var arr = translateCode(themeResult);
                            for(var k=0;k<themeResult.length;k++){
                                var dataObj = new Object();
                                if(themeResult[k].ORGNUMS >0 && themeResult[k].ORGNUMS<=30){
                                    color = "#CCFFFF";
                                    dataObj = {
                                        value : arr[k].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }else if(themeResult[k].ORGNUMS >30 && themeResult[k].ORGNUMS<=60){
                                    color = '#CCCCFF';
                                    dataObj = {
                                        value : arr[k].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }else if(themeResult[k].ORGNUMS >60 && themeResult[k].ORGNUMS<=90){
                                    color = '#CC99FF';
                                    dataObj = {
                                        value : arr[k].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }else if(themeResult[k].ORGNUMS >90 && themeResult[k].ORGNUMS<=120){
                                    color = '#CC66FF';
                                    dataObj = {
                                        value : arr[k].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }else if(themeResult[k].ORGNUMS >120 && themeResult[k].ORGNUMS<=150){
                                    color = '#CC33FF';
                                    dataObj = {
                                        value : arr[k].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }else{
                                    color = '#CC00FF';
                                    dataObj = {
                                        value : themeResult[k].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }
                                themeLayer.styleGroups.push(dataObj);
                            }
                        }
                    })
                },
                themeLayerStyle : function(layer1){
                    themeLayer.setOpacity(0.7);
                    themeLayer.style = {
                        stroke : true,
                        strokeWidth : 2,
                        strokeColor : "#fff",
                        strokeLinecap : "butt"
                    };
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

            }
            return new OrgFun(options);
        }

    </script>

</body>
</html>