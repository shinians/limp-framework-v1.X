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
            height: 100%;
            border:1px solid #3473b7;
        }
        .num td{
            height: 20px;
        }
        /*能力评分等级样式*/
        .level1 img,.level2 img,.level3 img,.level4 img{
            width: 16px;
            height: 16px;
        }
        .level1,.level2,.level3,.level4{
            line-height: 40px;
        }
        .legend{
            left:20px;
            height: 153px;
            bottom :35px;
            background-color: rgba(3, 13, 33, 0.58);
            color: #8aaece;
            z-index: 9999;
        }

        .surCount tr td:nth-child(1){
            box-shadow: 2px 2px 1px rgba(255,251,240,1);
        }
        .surCount tr th:nth-child(1){
            box-shadow: 2px 2px 1px rgba(255,251,240,1);
        }
    </style>

<body onload="init()">
<div id="tools">

</div>
<div id="map"></div>
<%--图例--%>
<div class="legend" style="width: inherit;">
    <div class="level1">
        培训班已完成：<img src="${supermap}/theme/images/green.png" alt="培训班已完成">
        <span class="finished"></span>
    </div>
    <div class="level2">
        培训班正在进行中：<img src="${supermap}/theme/images/blue.png" alt="培训班正在进行中">
        <span class="finishing"></span>
    </div>
    <div class="level3">
        培训班未开始：<img src="${supermap}/theme/images/yellow.png" alt="培训班未开始">
        <span class="notstart"></span>
    </div>
    <div class="level4">
        多次培训：<img src="${supermap}/theme/images/gray.png" alt="多次培训">
    </div>
</div>
<%--右侧表格--%>
<span class="showNews">
        <img src="../../../../resources/style/images/gisleft.png" alt="">
</span>

<div>
    <table class="surCount">
        <thead>
        <tr>
            <th>正在进行</th>
            <th>培训地点</th>
            <th>培训类别</th>
            <th>培训计划人数</th>
            <th>实际培训人数</th>
            <th>培训执行进度信息</th>
        </tr>
        </thead>
        <tbody>
        <%--<tr class="num">--%>
        <%--<td class="num1"></td>--%>
        <%--<td class="num2"></td>--%>
        <%--<td class="num3"></td>--%>
        <%--<td class="num4"></td>--%>
        <%--<td class="num5"></td>--%>
        <%--<td class="num6"></td>--%>
        <%--</tr>--%>
        </tbody>
    </table>
</div>


<div class="detailTal" id="trainMsg">
        <span class="hideNews">
            <img src="../../../../resources/style/images/gisright.png" alt="">
        </span>
    <h3 class="title03 nameJump">培训基本信息</h3>
    <%--机构表--%>


    <table class="surCount">
        <thead>
        <tr>
            <th>培训班名称</th>
            <th>培训地点</th>
            <th>培训类别</th>
            <th>培训计划人数</th>
            <th>实际培训人数</th>
            <th>培训执行进度信息</th>
        </tr>
        </thead>
        <tbody>
        <%--<tr class="num">--%>
        <%--<td class="num1"></td>--%>
        <%--<td class="num2"></td>--%>
        <%--<td class="num3"></td>--%>
        <%--<td class="num4"></td>--%>
        <%--<td class="num5"></td>--%>
        <%--<td class="num6"></td>--%>
        <%--</tr>--%>
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

        var point_url=get_root+'/gis/getGisTrainData5';
        //var baseMap = system.tiandiUrl;
        var baseMap = system.echartsUrl;
        var tiandiMap = system.tiandiUrl;
        var dataUrl = system.dataUrl;
        var tiandiVecMap = system.tiandiVecUrl;
        var detailUrl=get_root + "/gis/getGisTrainData4?orgcode=";
        var layer1,drawPolygon,tiandi,tiandiVct,pointLayer,final,point,polygonLayer,infowin = null,map;
        var drawBounds,drawCircle,circleLayer,drawToLine;

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

                //绘制图层
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
//                      new SuperMap.Control.LayerSwitcher(),
                        new SuperMap.Control.MousePosition(),
                        new SuperMap.Control.Navigation({
                            dragPanOptions: {
                                enableKinetic: true
                            }
                        }),
                        drawPolygon,
                        drawBounds,
                        drawCircle,
                        drawToLine
                    ],
                    allOverlays: false
                });

                map.events.on({"click":that.close.bind(this)});

                layer1 = new SuperMap.Layer.TiledDynamicRESTLayer("China", baseMap,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
                pointLayer = new SuperMap.Layer.Markers("markerLayer");
                layer1.events.on({"layerInitialized":that.addLayer.bind(this)});
            },

            close : function(){
                if(infowin){
                    try{
                        infowin.hide();
                        infowin.destroy();
                        map.removePopup(infowin)
                    }
                    catch(e){}
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
//              var bounds = feature.geometry.bounds;
//              vectorLayer.removeAllFeatures();
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
            addLayer : function(){
                var that = this;
                tiandi =  new SuperMap.Layer.TiledDynamicRESTLayer("China", tiandiMap,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
                tiandi.events.on({"layerInitialized":that.addLayer2.bind(this)});
            },
            addLayer2 : function(){
                var that = this;
                tiandiVct = new SuperMap.Layer.TiledDynamicRESTLayer("China2", tiandiVecMap,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
                tiandiVct.events.on({"layerInitialized":that.addLayer3.bind(this)});
            },
            addLayer3 : function(){
                var that = this;

                layer1.isBaseLayer=true;
                tiandiVct.isBaseLayer=true;
                tiandi.isBaseLayer=true;

                map.addLayers([polygonLayer,pointLayer,layer1,tiandiVct,tiandi]);

                map.setCenter(new SuperMap.LonLat(108.067923, 32.679943),4);
                var tools = new ToolsNav({
                    id : "#tools",
                    map : map,
                    layui : layui,
                    callback : that.toolsEvn.bind(that),
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
                that.pDataInit();
                that.mapChange();
                that.clearIt();
                that.queryData();
                pointLayer.setVisibility(true);

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
            clearFeatures  : function(){
                polygonLayer.removeAllFeatures();
            },
            measureAreaCompleted : function(measureEventArgs){
                var area = measureEventArgs.result.area,
                    unit = measureEventArgs.result.unit;
                layer.msg("量算结果:"+ area + "平方米");
            },
            mapChange : function(){
                // tiandi.setVisibility(false);
                // tiandiVct.setVisibility(false);
                // layer1.setVisibility(true);
            },
            toolsEvn : function(){
                var that =  this;
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
                            url  : "/gis/findTrainByName?name="+htmlContent,
                            dataType : "json",
                            success :function(data){
                                if( data.result.length == 0 ){
                                    layer.msg('没有搜索到"'+htmlContent+"\"的相关培训信息,请更换关键词查询");
                                    return;
                                }else{

                                    var ele = $('#searchResult');
                                    var html = "";
                                    for(var i = 0;i<data.result.length;i++){
                                        html += "<li class='searchText'>"+data.result[i].NAME+"</li>"
                                    }

                                    ele.css({
                                        display : "block"
                                    }).animate({
                                        height  : "214px"
                                    }).html(html)


                                    $('#searchResult .searchText').on('click',function(){
                                        var html = $(this).html();
                                        $('#searchContent').val(html);
                                        ele.css({
                                            display : "none",
                                            height : "1px"
                                        })

                                        that.ZoomToThere(data.result,html);

                                    })

                                }
                            }
                        })

                    }
                })
            },

            ZoomToThere : function(data,html){

                for(var i = 0 ;i<data.length;i++){

                    switch (Number(data[i].TYPE)){
                        case 1:
                            data[i].TYPE = '入职验船师培训';
                            break;
                        case 2:
                            data[i].TYPE = '专业基础培训';
                            break;
                        case 3:
                            data[i].TYPE = '能力提高培训';
                            break;
                        case 4:
                            data[i].TYPE = '资格培训';
                            break;
                    }

                    switch (Number(data[i].STATUES)){
                        case 0:
                            data[i].STATUES = '培训计划';
                            break;
                        case 1:
                            data[i].STATUES = '发起培训';
                            break;
                        case 2:
                            data[i].STATUES = '报名';
                            break;
                        case 3:
                            data[i].STATUES = '培训';
                            break;
                        case 4:
                            data[i].STATUES = '结业/考核发证';
                            break;
                    }

                    //console.log(data);

                    if(data[i].NAME == html){
                        //console.log(data[i])

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
                        contentHTML += "<div class='nameJump'>培训班名称:<a onclick='layerOpen(point.pid)'>"+data[i].NAME+"</a></div><div>培训地点:<a>"+data[i].TRAINPLACE+"</a></div><div>培训类别:<a>"+data[i].TYPE+"</a></div>";
                        contentHTML +="<div>计划培训人数:<a>"+data[i].JHNUM+"</a></div><div>实际培训人数:<a>"+data[i].PXNUM+"</a></div><div>培训执行进度:<span>"+data[i].STATUES+"</span></div> </div>";
                        var size = new SuperMap.Size(20,33);
                        var icon = new SuperMap.Icon("theme/images/cluster4.png", size);
                        var popup = new SuperMap.Popup.FramedCloud("zoom",new SuperMap.LonLat(data[i].POSX,data[i].POSY),size,contentHTML,icon,true);
                        infowin = popup;
                        map.addPopup(popup);

                        // var popup = new SuperMap.Popup("infoWin",
                        //     new SuperMap.LonLat(data[i].POSX,data[i].POSY),
                        //     new SuperMap.Size(200,200),
                        //     "example popup",
                        //     true);
                        // popup.closeOnMove = true;
                        // map.addPopup(popup);

                    }
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
                        pointLayer.removeMarker(point);
                        var size = new SuperMap.Size(12,12);
                        var offset = new SuperMap.Pixel(-(size.w/2), -size.h);
                        var icon = new SuperMap.Icon('${supermap}/theme/images/cluster4.png', size, offset);
                        final = [];
                        var codeArr =[];
                        if(!result.length){
                            layer.msg('暂时没有相关数据');
                            $('.finished').html("0%");
                            $('.finishing').html("0%");
                            $('.notstart').html("0%");
                            return;
                        }
                        //所有code排序
                        for(var i=0;i< result.length;i++){
                            codeArr.push(result[i].ORGCODE);
                        }
                        //判断不同等级占比

                        var statArr =[];
                        var x=0;
                        var y=0;
                        var z=0;
                        for(var k=0;k<result.length;k++){
                            var sts = result[k].STATUES;
                            if(sts ==0){
                                x++;
                            }else if(sts ==1){
                                y++;
                            }else if(sts ==2){
                                y++;
                            }else if(sts ==3){
                                y++;
                            }else {
                                //4
                                z++;
                            }
                        }
                        //图例百分比
                        //console.log(result);
                        var fin = (z/result.length).toFixed(2);
                        $('.finished').html(parseInt(fin*100)+"%");
                        $('.finishing').html((y/result.length).toFixed(2)*100+"%");
                        $('.notstart').html((x/result.length).toFixed(2)*100+"%");

                        var newArr = codeArr.sort(this.sotNum);
                        // 3502000 3502000 3503040
                        for(var j=0;j<newArr.length-1;j++){
                            var thisArr = newArr;
                            if(thisArr[j] == thisArr[j+1]){
                                icon = new SuperMap.Icon('${supermap}/theme/images/gray.png',size,offset);
                                this.getit(result,j,icon);
                            }else{
                                if(result[j+1].STATUES =0){
                                    //not start
                                    icon = new SuperMap.Icon('${supermap}/theme/images/yellow.png',size,offset);
                                    this.getit(result,j+1,icon);
                                }else if(result[j+1].STATUES<=3 && result[j+1].STATUES>=1){
                                    //finishing
                                    icon = new SuperMap.Icon('${supermap}/theme/images/blue.png',size,offset);
                                    this.getit(result,j+1,icon);
                                }else if(result[j+1].STATUES=4){
                                    //finished
                                    icon = new SuperMap.Icon('${supermap}/theme/images/green.png',size,offset);
                                    this.getit(result,j+1,icon);
                                }
                            }
                        }

                    },
                    getit:function(result,i,icon){
                        var that = this;
                        point =new SuperMap.Marker(new SuperMap.LonLat(result[i].POSX,result[i].POSY),icon);
                        point.code = result[i].ORGCODE;
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
                        if(infowin){
                            try{
                                infowin.hide();
                                infowin.destroy();
                                map.removePopup(infowin)
                            }
                            catch(e){}
                        }

                        var point = this;

                        var lonlat = point.getLonLat();
                        var size = new SuperMap.Size(20, 33);
//                        var offset = new SuperMap.Pixel(11, -30);
                        var icon = new SuperMap.Icon("theme/images/cluster4.png", size);
                        $('tbody').html("");
                        $.get(detailUrl+point.code,function(data){
                            var this_res = JSON.parse(data);
                            for(var i=0;i<this_res.result.length;i++){
                                var data = this_res.result[i];
                                if(data.SCHEDULE == "0"){
                                    data = "培训计划"
                                }else if(data.SCHEDULE == "1"){
                                    data = "发起培训"
                                }else if(data.SCHEDULE == '2'){
                                    data = "报名"
                                }else if(data.SCHEDULE == '3'){
                                    data = "培训"
                                }else if(data.SCHEDULE == '4'){
                                    data = "结业/考核发证"
                                }

                                var schedule = this_res.result[i].SCHEDULE;
                                point.name =this_res.result[i].NAME;
                                point.address =this_res.result[i].PLACE;
                                point.leixing =this_res.result[i].TYPE;
                                point.planeNum =this_res.result[i].JHNUM;
                                point.realNum =this_res.result[i].PXNUM;
//                                拼接表格内容及弹窗内容 如果有多条数据，只展示最新一条
                                var contentHTML = "<div style='font-size:.8em; opacity: 0.8; overflow-y:hidden; color:black;'>";
                                contentHTML += "<div class='nameJump'>培训班名称:<a onclick='layerOpen(point.pid)'>"+point.name+"</a></div><div>培训地点:<a>"+point.address+"</a></div><div>培训类别:<a>"+point.leixing+"</a></div>";
                                contentHTML +="<div>计划培训人数:<a>"+point.planeNum+"</a></div><div>实际培训人数:<a>"+point.realNum+"</a></div><div>培训执行进度:<span>"+data+"</span></div> </div>";

                                var popup = new SuperMap.Popup.FramedCloud("popwin",new SuperMap.LonLat(lonlat.lon,lonlat.lat),size,contentHTML,icon,true);
                                infowin = popup;
                                map.addPopup(popup);

                                //表格填充
                                $('tbody').append( "<tr><td>"+point.name+"</td><td>"+point.address+"</td><td>"+point.leixing+"</td><td>"+point.planeNum+"</td><td>"+point.realNum+"</td><td>"+data+"</td></tr>");

                            }
                        })

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
                        var ele = $('.shipDrop', window.parent.document);
                        if(ele.hasClass('deBounce')){
                            ele.trigger('click')
                        }
                    }
                })

            }
        }
        return new OrgFun(options);
    }

</script>
</head>
</html>


