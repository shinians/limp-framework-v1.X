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
    <link href="${script}/chinasofti/gis/Build/Cesium/Widgets/widgets.css" rel="stylesheet">
    <link href="${script}/chinasofti/gis/examples/css/bootstrap.min.css" rel="stylesheet">
    <link href="${script}/chinasofti/gis/examples/css/pretty.css" rel="stylesheet">
    <link rel="stylesheet" href="${ctx}/plug/layui/css/layui.css">
    <script src="${script}/chinasofti/gis/examples/js/jquery.min.js"></script>
    <script src="${script}/chinasofti/gis/examples/js/bootstrap.min.js"></script>
    <script src="${script}/chinasofti/gis/examples/js/bootstrap-select.min.js"></script>
    <script type="text/javascript" src="${script}/chinasofti/gis/examples/js/require.min.js" data-main="${script}/chinasofti/gis/examples/js/main"></script>
    <script src="${script}/chinasofti/gis/examples/js/config.js"></script>
    <script type="text/javascript" src="${plug}/layui-v2.2.6/layui.all.js"></script>

    <style type="text/css">
        html, body, #cesiumContainer {
            width: 100%; height: 100%; margin: 0; padding: 0; overflow: hidden;background-color: #000000;
        }

        .btnContent{
            position: absolute;
            top:3px;
            left: 3px;
        }
        .btnContent .ocean2D{
            background-color:#1e4799;
            opacity: 0.9;
        }
    </style>

<body>
<div>

</div>
<div id="cesiumContainer"></div>
<div id='loadingbar' class="spinner">
    <div class="spinner-container container1">
        <div class="circle1"></div>
        <div class="circle2"></div>
        <div class="circle3"></div>
        <div class="circle4"></div>
    </div>
    <div class="spinner-container container2">
        <div class="circle1"></div>
        <div class="circle2"></div>
        <div class="circle3"></div>
        <div class="circle4"></div>
    </div>
    <div class="spinner-container container3">
        <div class="circle1"></div>
        <div class="circle2"></div>
        <div class="circle3"></div>
        <div class="circle4"></div>
    </div>
</div>

<div class="btnContent">
    <button class="layui-btn layui-btn-normal ocean2D">远洋渔船分布2D</button>
</div>


<script>

    var height = window.screen.height - 220;

    $('#cesiumContainer').css({
        height: height
    })

    $('#nav_iframe', window.parent.document).css({
        minHeight : height
    })

    function onload(Cesium){
        //初始化viewer部件
        var viewer = new Cesium.Viewer('cesiumContainer', {
            imageryProvider : new Cesium.TiandituImageryProvider({
                credit : new Cesium.Credit('天地图全球影像服务     数据来源：国家地理信息公共服务平台 & 四川省测绘地理信息局')
            })
        });
        var imageryLayers = viewer.imageryLayers;
        //利用服务url创建SuperMapImageryProvider实例
        var provider_wgs = new Cesium.SuperMapImageryProvider({
            url : URL_CONFIG.SUPERMAP_IMG_WGS //经纬度地图服务
        });
        var imagery_wgs,imagery_mec;
        //初始化时添加经纬度投影地图图层
        imagery_mec = imageryLayers.addImageryProvider(provider_wgs);
        imagery_mec.alpha = 1.0;
        // imagery_wgs = imageryLayers.addImageryProvider(provider_wgs);
        // imagery_wgs.alpha = 0;
        var labelImagery = new Cesium.TiandituImageryProvider({
            mapStyle : Cesium.TiandituMapsStyle.CIA_C//天地图全球中文注记服务（经纬度投影）
        });
        var testLayer;
        testLayer = imageryLayers.addImageryProvider(labelImagery);

        //$('#toolbar').show();
        $('#loadingbar').remove();

        $('.ocean2D').on('click',function(){
            var url = get_root + "/gis/toGisSafe";
            var dom = $('#nav_iframe', window.parent.document).attr('src',url);
        })


    }
</script>
</body>

</head>
</html>
