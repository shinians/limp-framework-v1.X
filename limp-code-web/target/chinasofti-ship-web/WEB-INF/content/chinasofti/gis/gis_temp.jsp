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
    <style type="text/css">
        body{
            margin: 0;
            overflow: hidden;
            background: #fff;
        }
        #map{
            position: relative;
            height: 700px;
            border: transparent !important;
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
        .smControlMousePosition{
            color:#fff;
        }
    </style>
    <script type="text/javascript" src="${supermap}/libs/SuperMap.Include.js"></script>
    <script type="text/javascript" src='${script}/js/template-web.js'></script>
    <script type="text/javascript" src="${script}/chinasofti/gis/translate.js"></script>
<body onload="init()">

</body>
<div id="map"></div>
<div id="input"></div>
<script>

    function init(){
        var orgBlity = new SuperMapInit({
            mapId : "map",
            mapOptions: {
                controls: [
                    new SuperMap.Control.Navigation(),
                    new SuperMap.Control.MousePosition()
                ],
                projection: "EPSG:4326"
            },
            tiandiLayer : system.tiandiUrl,
            addLayerCB : addlayer
        });
        orgBlity.init();

        function addlayer(map,layerTemp){
            map.addLayers([layerTemp]);

            map.setCenter(new SuperMap.LonLat(108.067923, 32.679943),3);
        }

        // orgBlity.__proto__.init.prototype = function(){
        //     console.log(orgBlity)
        // }


    }

    function SuperMapInit(options){
        var baseMap = options.tiandiLayer;
        var map;
        var layerTemp;
        function MapFun(option) {
            var self = this;
        }
        MapFun.prototype = {
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
                //mapId
                var _mapId = options.mapId;
                //检查用户浏览器
                if(!this.check()) return;
                var _mapOptions = options.mapOptions;
                //地图设置自定义
                if(_mapOptions){
                    map = new SuperMap.Map(_mapId,_mapOptions);
                }else{
                    console.log('缺少map相关参数');
                    return;
                }
                layerTemp = new SuperMap.Layer.TiledDynamicRESTLayer("China", baseMap, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
                layerTemp.events.on({"layerInitialized":function(){
                        options.addLayerCB(map,layerTemp)
                    }});
            }

        }
        return new MapFun(options);
    }

</script>
</head>
</html>