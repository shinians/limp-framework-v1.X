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
        /*等级样式*/
        .legend_block{
            display: inline-block;
            width: 32px;
            height: 25px;
            margin-bottom: -7px;
            opacity:0.5;
        }
        .legend{
            left:10px ;
            z-index: 9999;
            height:236px;
            bottom:37px;
            background-color: rgba(3, 13, 33, 0.58);
            color: #8aaece;
        }
    </style>

<body onload="init()">

<div id="tools">

</div>

<div id="map"></div>
<%--图例--%>
<div class="legend" style="width: inherit;">
    <p>
        <span class="legend_block" style="background-color:#00CCFF;"></span>： <span> 图纸审查数量小于100个</span>
    </p>
    <p>
        <span class="legend_block" style="background-color:#29ef57;"></span>： <span> 图纸审查数量大于100个小于300个</span>
    </p>
    <p>
        <span class="legend_block" style="background-color:#293eef;"></span>： <span> 图纸审查数量大于300个小于600个  </span>
    </p>
    <p>
        <span class="legend_block" style="background-color:#ce0ced;"></span>： <span> 图纸审查数量大600个小于900个  </span>
    </p>
    <p>
        <span class="legend_block" style="background-color:#edea0c;"></span>： <span> 图纸审查数量大于900个  </span>
    </p>
    <p>
        <img src="${supermap}/theme/images/reviewcenter.png">： <span>审图中心</span>
    </p>
</div>
<%--右侧表格--%>
<span class="showNews">
        <img src="../../../../resources/style/images/gisleft.png" alt="">
    </span>
<div class="detailTal" id="trainMsg">
        <span class="hideNews">
            <img src="../../../../resources/style/images/gisright.png" alt="">
        </span>
    <h3 class="title03 nameJump"><span></span>省图纸申请情况统计图</h3>
    <%--机构表--%>
    <table class="surCount">
        <thead>
        <tr>
            <th colspan="6"><span class="province"></span>省渔船图纸审查总数：<span class="tzzs"></span>套</th>
        </tr>
        <tr>
            <th></th>
            <th>远洋渔船图纸审查</th>
            <th>国内海洋渔船图纸审查</th>
            <th>内河渔船图纸审查数量</th>
        </tr>
        </thead>
        <tbody>
        <tr class="num">
            <td>占比：</td>
            <td class="num1 clear">2%</td>
            <td class="num2 clear"></td>
            <td class="num3 clear"></td>
        </tr>
        <tr class="num">
            <td>总数：</td>
            <td class="num11 clear">套</td>
            <td class="num22 clear"></td>
            <td class="num33 clear"></td>
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
        var ztUrl = get_root + "/gis/getDrawCheck1";
//        var point_url=get_root+'/gis/getCheckOrgData1';

        var baseMap = system.echartsUrl;
        var dataUrl = system.dataUrl;
        var table_url = get_root + '/gis/getDrawCheck2';
        var layer1,pointLayer,tzLayer,final,point,infowin=null;
        var tzData;
        var tiandiMap = system.tiandiUrl;
        var tiandiVecMap = system.tiandiVecUrl;
        var tiandi;
        var tiandiVct;
        //tools
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
//                        new SuperMap.Control.LayerSwitcher(),
                        new SuperMap.Control.MousePosition(),
                        drawPolygon,
                        drawBounds,
                        drawCircle,
                        drawToLine
                    ],
                    projection: "EPSG:4326"
                });
                layer1 = new SuperMap.Layer.TiledDynamicRESTLayer("China", baseMap, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
                pointLayer = new SuperMap.Layer.Markers("markerLayer");
                //图纸图层 单值图
                tzLayer = new SuperMap.Layer.Unique("ThemeLayer");
                tzLayer.on("click", that.evn);
                layer1.events.on({"layerInitialized":that.addLayer.bind(this)});

            },
            evn : function(e){
                var event = e.event;
                if(e.target && e.target.refDataID){
                    var fid = e.target.refDataID;
                    var fea = tzLayer.getFeatureById(fid);
                    $('.num .clear').html(" ");
                    for(var i = 0;i<provinceArrSimple.length;i++){
                        if(provinceArrSimple[i].name == fea.attributes.NAME){
                            $('.nameJump span').html(provinceArrSimple[i].name);
                            $('.province').html(provinceArrSimple[i].name);
                            var orgCode =  provinceArrSimple[i].value;
                            var url = table_url +"?uid="+ orgCode;
                            $.ajax({
                                url:url,
                                type:'get',
                                dataType: 'json',
                                success : function(data){
                                    var result = data.result;
                                    var sum=0;

                                    if(result.length == 0){
                                        $('.num22').html('0套');
                                        $('.num33').html('0套');
                                        $('.num11').html('0套');

                                        $('.num2').html('0%');
                                        $('.num3').html('0%');
                                        $('.num1').html('0%');

                                        $('.tzzs').html('0');

                                        this.show();

                                        return;

                                    }


                                    $('.num22').html('0套');
                                    $('.num33').html('0套');
                                    $('.num11').html('0套');

                                    $('.num2').html('0%');
                                    $('.num3').html('0%');
                                    $('.num1').html('0%');



                                    for(var i=0;i<result.length;i++){
                                        sum = sum +result[i].value;
                                        var name = result[i].name;
                                        switch (name){
                                            case '24_1':
                                                $('.num22').html(result[i].value+"套");
                                                break;
                                            case '24_3':
                                                $('.num33').html(result[i].value+"套");
                                                break;
                                            case '24_2':
                                                $('.num11').html(result[i].value+"套");
                                                break;
                                        }

                                    }
                                    $('.tzzs').html(sum);
                                    for(var i=0;i<result.length;i++){
                                        var name = result[i].name;
                                        switch (name){
                                            case '24_1':
                                                $('.num2').html((result[i].value/sum*100).toFixed(2)+"%");
                                                break;
                                            case '24_3':
                                                $('.num3').html((result[i].value/sum*100).toFixed(2)+"%");
                                                break;
                                            case '24_2':
                                                $('.num1').html((result[i].value/sum*100).toFixed(2)+"%");
                                                break;
                                        }

                                    }
                                    this.show();

                                },
                                show:function(){
                                    $('#trainMsg').css('display','block');
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
            addLayer3 :function(){
                var that = this;
                map.addLayers([tiandi,layer1,tiandiVct,polygonLayer,pointLayer,tzLayer]);
                map.setCenter(new SuperMap.LonLat(108.067923, 32.679943),3);
                this.pDataInit();
                this.tzDataInit();
                pointLayer.setVisibility(true);

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

                that.queryData();

                that.clearIt();

                that.mapChange();

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
            pDataInit:function(){
                var that =this;
                $.ajax({
                    url:ztUrl ,
                    type:'post',
                    datatype: 'json',
                    success: function (data) {
//                        $('#trainMsg').css('display','block');
                        data = JSON.parse(data);
                        var result = data.result.stList;
                        pointLayer.removeMarker(point);
                        var size = new SuperMap.Size(12,12);

                        var offset = new SuperMap.Pixel(-(size.w/2), -size.h);
                        var icon = new SuperMap.Icon('${supermap}/theme/images/reviewcenter.png', size, offset);
                        final = [];
                        for(var i=0;i< result.length;i++){
                            this.getit(result,i,icon);
//                            this.change(index);
                            <%--if(result[i].ENTSCORE >= 80 && result[i].ENTSCORE<100){--%>
                                <%--icon = new SuperMap.Icon('${supermap}/theme/images/reviewcenter.png',size,offset);--%>
                                <%--var index = i;--%>
                                <%--this.getit(result,i,icon);--%>
                                <%--this.change(index);--%>

                            <%--}else if(result[i].ENTSCORE >= 60 && result[i].ENTSCORE<80){--%>
                                <%--icon = new SuperMap.Icon('${supermap}/theme/images/blue.png',size,offset);--%>
                                <%--var index = i;--%>
                                <%--this.getit(result,i,icon);--%>
                                <%--this.change(index);--%>
                            <%--}else{--%>
                                <%--icon = new SuperMap.Icon('${supermap}/theme/images/pure.png',size,offset);--%>
                                <%--var index = i;--%>
                                <%--this.change(index);--%>
                                <%--this.getit(result,i,icon);--%>
                            <%--}--%>
                        }
                    },
                    change:function(index){

                    },
                    getit:function(result,i,icon){
                        point =new SuperMap.Marker(new SuperMap.LonLat(result[i].lon,result[i].lat),icon);
                        point.name = result[i].orgname;
                        point.adress = result[i].address;
                        point.respperson = result[i].person;
                        point.nums =result[i].nums;
                        point.phone = result[i].phone;
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
                        contentHTML += "<div class='nameJump'>审图中心名称:<a onclick='layerOpen(point.pid)'>"+point.name+"</a></div><div>审图中心地址:<a>"+point.adress+"</a></div><div>审图中心负责人:<a>"+point.respperson+"</a></div>";
                        contentHTML +="<div>审图中心联系电话:<a>"+point.phone+"</a></div><div>图纸审查数量:<a>"+point.nums+"</a></div> </div>";

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
                    }
                })

            },
            tzDataInit:function(){
                this.tzDZInit();
                var options = {
                    source: 'China',
                    dataSourceName: 'China:Provinces_R'
                }
                this.gettuzhi(options);
            },
            tzDZInit : function(){
                //单值专题图透明度设置
                tzLayer.setOpacity(0.6);
                tzLayer.style = {
                    stroke : true,
                    strokeWidth : 2,
                    strokeColor : "#fff",
                    strokeLinecap : "butt"
                };
                //hover样式开关
                tzLayer.isHoverAble = true;
                //hover样式
                tzLayer.highlightStyle = {
                    stroke: true,
                    strokeWidth: 2,
                    strokeColor: '#ECF600',
                    fillColor: "#00F5FF",
                    fillOpacity: 0.1
                };
                tzLayer.themeField = "NAME";

                $.ajax({
                    url: ztUrl,
                    type:'get',
                    success: function (data) {
                        if(data.msg = 'success'){
                            tzData = JSON.parse(data);

                            tzData = tzData.result.proList;

                            arr = translatecode(tzData);
                            var color;
                            var dzArr = [];
                            for(var i = 0;i<arr.length;i++){
                                var dataObj = new Object();
                                if(arr[i].nums >=0 && arr[i].nums<=100){
                                    color = '#00CCFF';
                                    dataObj = {
                                        value : arr[i].provname,
                                        style : {fillColor : color}
                                    }
                                }else if(arr[i].nums >100 && arr[i].nums<=300){
                                    color = '#29ef57';
                                    dataObj = {
                                        value : arr[i].provname,
                                        style : {fillColor : color}
                                    }
                                }else if(arr[i].nums >300 && arr[i].nums<=600){
                                    color = '#293eef';
                                    dataObj = {
                                        value : arr[i].provname,
                                        style : {fillColor : color}
                                    }
                                }else if(arr[i].nums >600 && arr[i].nums<=900){
                                    color = '#ce0ced';
                                    dataObj = {
                                        value : arr[i].provname,
                                        style : {fillColor : color}
                                    }
                                }else{
                                    color = '#e4393c';
                                    dataObj = {
                                        value : arr[i].provname,
                                        style : {fillColor : color}
                                    }
                                }

                                tzLayer.styleGroups.push(dataObj);
                            }

                            // for(var i = 0 ;i<system.noDataArr.length;i++){
                            //     tzLayer.styleGroups.push({
                            //         style : {
                            //             fillColor : "#ABABAB"
                            //         },
                            //         value : system.noDataArr[i]
                            //     })
                            //
                            //
                            // }

                        }
                    }
                })
            },
            gettuzhi : function(options){
                var that = this;
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
                        "processCompleted": function(e){ that.processCompleted(e)  },
                        "processFailed": that.processFailed
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
                        for(var k = 0;k<tzData.length;k++){
                            var feature = features[i];
                            var arr = translatecode(tzData);
                            if(arr[k].provname == feature.attributes.NAME){
                                feas.push(feature);
                            }
                        }

                    }
                    tzLayer.addFeatures(feas);
                }
            },
            processFailed : function(){
                layer.msg(e.error.errorMsg);
            }
        }
        return new OrgFun(options);
    }

</script>
</head>
</html>