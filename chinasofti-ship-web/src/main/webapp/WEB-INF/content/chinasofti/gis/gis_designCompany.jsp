<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<%@include file="/WEB-INF/content/chinasofti/common/head.jsp" %>
<html>
<head>
    <meta charset="utf-8">
    <title>GIS_设计企业能力分布</title>
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
            height: 757px;
            border:1px solid #3473b7;
        }
        .num td{
            height: 20px;
        }
        /*图例等级样式*/
        #abilityLevel,#abilityLevel2{
            display: none;
            z-index: 1;
        }
        .level1 img,.level2 img,.level3 img{
            width: 16px;
            height: 16px;
        }
        .level1,.level2,.level3{
            line-height: 40px;
        }
        .legend{
            background-color: rgba(3, 13, 33, 0.58);
            color: #8aaece;
            left:10px;
            height:115px;
            bottom:37px;
            z-index: 9999;
            width:260px;
        }
    </style>

<body onload="init()">
<div id="tools">

</div>
<div id="map"></div>
<%--图例--%>
<div class="legend" >
    <div id="abilityLevel">
        <div class="level1">
            <input type="checkbox" value="1"  id="btn1" checked> 渔船设计企业能力得分80-100分：<img src="${supermap}/theme/images/green.png" alt="80-100分">
        </div>
        <div class="level2">
            <input type="checkbox" value="2"  id="btn2" checked> 渔船设计企业能力得分60-80分：<img src="${supermap}/theme/images/blue.png" alt="60-80分">
        </div>
        <div class="level3">
            <input type="checkbox" value="3"  id="btn3" checked> 渔船设计企业能力得分0-60分：<img src="${supermap}/theme/images/yellow.png" alt="0-60分">
        </div>
    </div>

    <%--图例级别4--%>
    <div id="abilityLevel2">
        <p>
            <img src="${supermap}/theme/images/designc.png">： <span>设计企业</span>
        </p>
    </div>
</div>
<%--右侧表格--%>
<span class="showNews">
        <img src="../../../../resources/style/images/gisleft.png" alt="">
    </span>
<div class="detailTal" id="trainMsg">
        <span class="hideNews">
            <img src="../../../../resources/style/images/gisright.png" alt="">
        </span>
    <h3 class="title03 nameJump">设计渔船图纸数量统计表</h3>
    <%--机构表--%>
    <table class="surCount">
        <thead>
        <tr>
            <th>累计设计图纸数量</th>
            <th>设计图纸建造渔船数量</th>
            <th>设计图纸一次通过率</th>
            <th>企业技术人员人数</th>
        </tr>
        </thead>
        <tbody>
        <tr class="num">
            <td class="num1"></td>
            <td class="num2"></td>
            <td class="num3"></td>
            <td class="num4"></td>
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

        var point_url=get_root+'/gis/getDesignEntData1';
        var baseMap = system.echartsUrl;
        var dataUrl = system.dataUrl;
        var tiandiMap = system.tiandiUrl;
        var tiandiVecMap = system.tiandiVecUrl;
        var detailUrl=get_root + "/gis/getDesignEntData2?pid=";
        var layer1,pointLayer,pointLayer2,final,point,point2,infowin=null;
        var drawPolygon,drawBounds,drawCircle,drawToLine;
        var tiandi,tiandiVct;
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
//                        new SuperMap.Control.LayerSwitcher(),
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
                pointLayer = new SuperMap.Layer.Markers("markerLayer");
                pointLayer2 = new SuperMap.Layer.Markers("markerLayer");
                layer1.events.on({"layerInitialized":that.addLayer.bind(this)});
                console.log("initialized!");
                map.events.on({"zoomend":this.zoom});
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
                map.addLayers([tiandi,layer1,tiandiVct,pointLayer,polygonLayer,pointLayer2]);
                map.setCenter(new SuperMap.LonLat(108.067923, 34.679943),3);
                this.pDataInit();
                this.p2DataInit();

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

//                pointLayer.setVisibility(true);

                that.queryData();

                that.clearIt();

                $('#zidingyiMap').trigger('click');

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

            clearIt : function(){
                $("#clearIt").on('click',function(){
                    //清除绘制图层
                    polygonLayer.removeAllFeatures();
                    //circleLayer.removeAllFeatures();
                })
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

            zoom:function(){
                var zoomLayer = map.getZoom();
                switch(zoomLayer){
                    case 3:
                        pointLayer.setVisibility(true);
                        pointLayer2.setVisibility(false);
                        $('#abilityLevel').css('display','block');
                        $('#abilityLevel2').css('display','none');
                        break;
                    case 5:
                        pointLayer2.setVisibility(true);
                        pointLayer.setVisibility(false);

                        //点坐标图例
                        $('#abilityLevel').css('display','none');
                        $('#abilityLevel2').css('display','block');
                        break;
            }
        },
            pDataInit:function(){
                var that =this;
                $.ajax({
                    url:point_url ,
                    type:'post',
                    dataType: 'json',
                    success: function (data) {
                        var result = data.result;
                        console.log(result);
                        pointLayer.removeMarker(point);
                        var size = new SuperMap.Size(12,12);
                        var offset = new SuperMap.Pixel(-(size.w/2), -size.h);
                        var icon = new SuperMap.Icon('${supermap}/theme/images/cluster4.png', size, offset);
                        final = [];
                        for(var i=0;i< result.length;i++){
                            //  能力评分
                            if(result[i].score >= 80 && result[i].score<100){
                                icon = new SuperMap.Icon('${supermap}/theme/images/green.png',size,offset);
                                var index = i;
                                this.getit(result,i,icon);
                                this.change(index);

                            }else if(result[i].score >= 60 && result[i].score<80){
                                icon = new SuperMap.Icon('${supermap}/theme/images/blue.png',size,offset);
                                var index = i;
                                this.getit(result,i,icon);
                                this.change(index);
                            }else{
                                icon = new SuperMap.Icon('${supermap}/theme/images/pure.png',size,offset);
                                var index = i;
                                this.change(index);
                                this.getit(result,i,icon);
                            }
                        }

                    },
                    change:function(index){
                        $('#btn1').on('change',function(){
                            if(!$('#btn1').is(':checked')){
                                for(var j=0;j<final.length;j++){
                                    if(final[j].score >=80 && final[j].score <100){
                                        pointLayer.removeMarker(final[j]);
                                    }
                                }
                            }else{
                                for(var j=0;j<final.length;j++){
                                    pointLayer.addMarker(final[j]);
                                }
                            }
                        })
                        $('#btn2').on('change',function(){
                            if(!$('#btn2').is(':checked')){
                                for(var j=0;j<final.length;j++){
                                    if(final[j].score >=60 && final[j].score <80){
                                        pointLayer.removeMarker(final[j]);
                                    }
                                }
                            }else{
                                for(var j=0;j<final.length;j++){
                                    pointLayer.addMarker(final[j]);
                                }
                            }
                        })
                        $('#btn3').on('change',function(){
                            if(!$('#btn3').is(':checked')){
                                for(var j=0;j<final.length;j++){
                                    if( final[j].score <60){
                                        pointLayer.removeMarker(final[j]);
                                    }
                                }
                            }else{
                                for(var j=0;j<final.length;j++){
                                    pointLayer.addMarker(final[j]);
                                }
                            }
                        })
                    },
                    getit:function(result,i,icon){
                        point =new SuperMap.Marker(new SuperMap.LonLat(result[i].lon,result[i].lat),icon);
                        point.name = result[i].name;
                        point.adress = result[i].addr;
                        point.phone = result[i].tel;
                        point.respperson = result[i].legal;
                        point.score =result[i].score;
                        point.pid = result[i].pid;
                        point.events.on({
                            "click":this.openInfoWin,
                            "touchstart":this.openInfoWin, //假如要在移动端的浏览器也实现点击弹框，则在注册touch类事件
                            "scope": point
                        });
                        point.events.on({
                            "click":this.show
                        });
                        final.push(point);
                        pointLayer.addMarker(point);
                    },
                    openInfoWin:function(){
                        this.closeInfoWin;
                        var point = this;
                        var lonlat = point.getLonLat();
                        var size = new SuperMap.Size(20, 33);
//                        var offset = new SuperMap.Pixel(11, -30);
                        var icon = new SuperMap.Icon("theme/images/cluster4.png", size);
                        var contentHTML = "<div style='font-size:.8em; opacity: 0.8; overflow-y:hidden; color:black;'>";
                        contentHTML += "<div class='nameJump'>企业名称:<a onclick='layerOpen(point.pid)'>"+point.name+"</a></div><div>企业地址:<a>"+point.adress+"</a></div>";
                        contentHTML +="<div>负责人:<a>"+point.respperson+"</a></div><div>联系电话:<a>"+point.phone+"</a></div><div>企业能力得分:<span>"+point.score+"</span></div> </div>";

                        var popup = new SuperMap.Popup.FramedCloud("popwin",new SuperMap.LonLat(lonlat.lon,lonlat.lat),size,contentHTML,icon,true);
                        infowin = popup;
                        map.addPopup(popup);

                    },
                    closeInfoWin:function(){
                        if(infowin){
                            try{
                                infowin.hide();
                                infowin.destroy();
                                map.removePopup(infowin)
                            }
                            catch(e){}
                        }
                    },
                    show:function(){
                        $('#trainMsg').css('display','block');
                        $.get(detailUrl+point.pid,function(data){
                            var result = JSON.parse(data).result;
                            $('.num1').html(result.drawings);
                            $('.num2').html(result.drawBuildShips);
                            $('.num3').html(result.drawFirstPassRate+"%");
                            $('.num4').html(result.technicians);
                        });

                    }
                })

            },
            p2DataInit:function(){
                    var that =this;
                    $.ajax({
                        url:point_url ,
                        type:'post',
                        dataType: 'json',
                        success: function (data) {
                            var result = data.result;
                            pointLayer2.removeMarker(point2);
                            var size = new SuperMap.Size(12,12);
                            var offset = new SuperMap.Pixel(-(size.w/2), -size.h);
                            var icon = new SuperMap.Icon('${supermap}/theme/images/cluster4.png', size, offset);
                            final = [];
                            for(var i=0;i< result.length;i++){
                                icon = new SuperMap.Icon('${supermap}/theme/images/designc.png',size,offset);
                                var index = i;
                                this.getit2(result,i,icon);
                            }
                        },
                        getit2:function(result,i,icon){
                            point2 =new SuperMap.Marker(new SuperMap.LonLat(result[i].lon,result[i].lat),icon);
                            point2.name = result[i].name;
                            point2.adress = result[i].addr;
                            point2.phone = result[i].tel;
                            point2.respperson = result[i].legal;
                            point2.score =result[i].score;
                            point2.pid = result[i].pid;
                            point2.events.on({
                                "click":this.openInfoWin2,
                                "touchstart":this.openInfoWin2, //假如要在移动端的浏览器也实现点击弹框，则在注册touch类事件
                                "scope": point2
                            });
                            point2.events.on({
                                "click":this.show
                            });
                            final.push(point2);
                            pointLayer2.addMarker(point2);
                        },
                        openInfoWin2:function(){
                            this.closeInfoWin2;
                            var point = this;
                            var lonlat = point.getLonLat();
                            var size = new SuperMap.Size(20, 33);
//                        var offset = new SuperMap.Pixel(11, -30);
                            var icon = new SuperMap.Icon("theme/images/cluster4.png", size);
                            var contentHTML = "<div style='font-size:.8em; opacity: 0.8; overflow-y:hidden; color:black;'>";
                            contentHTML += "<div class='nameJump'>企业名称:<a onclick='layerOpen(point.pid)'>"+point.name+"</a></div><div>企业地址:<a>"+point.adress+"</a></div>";
                            contentHTML +="<div>负责人:<a>"+point.respperson+"</a></div><div>联系电话:<a>"+point.phone+"</a></div><div>企业能力得分:<span>"+point.score+"</span></div> </div>";

                            var popup = new SuperMap.Popup.FramedCloud("popwin",new SuperMap.LonLat(lonlat.lon,lonlat.lat),size,contentHTML,icon,true);
                            infowin = popup;
                            map.addPopup(popup);

                        },
                        closeInfoWin2:function(){
                            if(infowin){
                                try{
                                    infowin.hide();
                                    infowin.destroy();
                                    map.removePopup(infowin)
                                }
                                catch(e){}
                            }
                        },
                        show:function(){
                            $('#trainMsg').css('display','block');
                            $.get(detailUrl+point.pid,function(data){
                                var result = JSON.parse(data).result;
                                $('.num1').html(result.drawings);
                                $('.num2').html(result.drawBuildShips);
                                $('.num3').html(result.drawFirstPassRate+"%");
                                $('.num4').html(result.technicians);
                            });

                        }
                    })

                }
        }
        return new OrgFun(options);
    }

</script>
</head>
</html>