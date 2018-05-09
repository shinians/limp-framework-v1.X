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
            height: 757px;
            border:1px solid #3473b7;
        }
        /*能力评分等级样式*/
        #abilityLevel{
            z-index: 1;
        }
        .level1 img,.level2 img,.level3 img {
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
            left:10px;
            z-index: 9999;
            background-color: rgba(3, 13, 33, 0.58);
            color: #8aaece;
            height:115px;
            width:166px;
            bottom:30px;
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
    <%--机构能力评分等级--%>
    <div id="abilityLevel" class="legend">
        <div class="level1">
            <input type="checkbox" value="1"  id="btn1" checked> 筏站能力80-100分：<img src="${supermap}/theme/images/green.png" alt="80-100分">
        </div>
        <div class="level2">
            <input type="checkbox" value="2"  id="btn2" checked> 筏站能力60-80分：<img src="${supermap}/theme/images/blue.png" alt="60-80分">
        </div>
        <div class="level3">
            <input type="checkbox" value="3"  id="btn3" checked> 筏站能力0-60分：<img src="${supermap}/theme/images/pure.png" alt="0-60分">
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
        <h3 class="title03">修筏数量统计表</h3>
        <%--机构表--%>
        <table class="surCount">
            <thead>
                <tr>
                    <th >累计修筏数量</th>
                    <th>检修期内救生筏数量</th>
                    <th>监督抽查合格率(%)</th>
                </tr>
            </thead>
            <tbody>
                <tr class="num">
                    <td class="num1"></td>
                    <td class="num2"></td>
                    <td class="num3"></td>
                </tr>
            </tbody>
        </table>
    </div>

 <script type="text/javascript">

     var height = top.document.body.clientHeight
     $('#map').css({
         height: height
     })

     var map,layer1, markerlayer,marker,final,orgCode,
         url = system.echartsUrl;
     var a_url=get_root+'/gis/getRaftStationData1';
     var org_url = get_root + '/gis/getRaftStationData2';
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
                new SuperMap.Control.MousePosition(),
                 drawPolygon,
                 drawBounds,
                 drawCircle,
                 drawToLine
         ],
             projection: "EPSG:4326"
         });

         layer1 = new SuperMap.Layer.TiledDynamicRESTLayer("china", url, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});

         markerlayer = new SuperMap.Layer.Markers("markerLayer");

         layer1.events.on({"layerInitialized":addLayer});
         check();

     }


     // move填充content
     function event(e){
         $('#orgNums').css('display','block');
         var pid = e;
         $('.num td').html("");
         var this_url = org_url+"?pid="+pid;
         $.get(this_url,function(data){
             var da = JSON.parse(data);
             var _res = da.result;
             $('.num1').html(_res.proNums);
             $('.num2').html(_res.raftNum);
             $('.num3').html(_res.rate);
         })

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

     function addLayer(){
         tiandi =  new SuperMap.Layer.TiledDynamicRESTLayer("China", tiandiMap, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
         tiandi.events.on({"layerInitialized":addLayer2});
     }

     function addLayer2(){
         tiandiVct = new SuperMap.Layer.TiledDynamicRESTLayer("China2", tiandiVecMap, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
         tiandiVct.events.on({"layerInitialized":addLayer3});
     }

     function addLayer3(){
         map.addLayers([tiandi,layer1,tiandiVct,polygonLayer,markerlayer]);
         //显示地图范围
         map.setCenter(new SuperMap.LonLat(108.067923, 32.679943),3);

         map.allOverlays = true;

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
         });


         $.ajax({
             url:a_url ,
             type:'post',
             datatype: 'json',
             success: function (data) {
                 addData(data);
             }
         })
         mapChange();

         queryData();

         clearIt();
     }

     function mapChange(){
         //初始化
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
                     url  : "/gis/getRaftStationData1?name="+htmlContent,
                     dataType : "json",
                     success :function(data){
                         if( data.result.length == 0 ){
                             layer.msg('没有搜索到"'+htmlContent+"\"的相关筏站信息,请更换关键词查询");
                             return;
                         }else{
                             console.log(data)
                             var ele = $('#searchResult');
                             var html = "";
                             for(var i = 0;i<data.result.length;i++){
                                 html += "<li class='searchText'>"+data.result[i].ENTNAME+"</li>"
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

                                 ZoomToThere(data.result,html);

                             })

                         }
                     }
                 })

             }
         })




     }

     function ZoomToThere(data,html){
         for(var i = 0 ;i<data.length;i++){
             if(data[i].ENTNAME == html){
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
                 contentHTML += "<div class='nameJump'>筏站名称:<a onclick='layerOpen(point.pid)'>"+data[i].ENTNAME+"</a></div><div>筏站地址:<a>"+data[i].ADDDRESS+"</a></div><div>负责人:<a>"+data[i].LEGAL+"</a></div>";
                 contentHTML +="<div>联系电话:<a>"+data[i].TEL+"</a></div><div>筏站得分:<a>"+data[i].ENTSCORE+"</a></div>";
                 var size = new SuperMap.Size(20,33);
                 var icon = new SuperMap.Icon("theme/images/cluster4.png", size);
                 var popup = new SuperMap.Popup.FramedCloud("zoom",new SuperMap.LonLat(data[i].POSX,data[i].POSY),size,contentHTML,icon,true);
                 infowin = popup;
                 map.addPopup(popup);

             }
         }
     }


     //添加数据
     function addData(data)
     {
         data = JSON.parse(data);
         var result = data.result;
         markerlayer.removeMarker(marker);
         var size = new SuperMap.Size(12,12);
         var offset = new SuperMap.Pixel(-(size.w/2), -size.h);
         var icon = new SuperMap.Icon('${supermap}/theme/images/cluster4.png', size, offset);
         final = [];
         for(var i=0;i< result.length;i++){
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
                 marker.pid = result[i].PID;
                 marker.events.on({
                     "click":openInfoWin,
                     "touchstart":openInfoWin, //假如要在移动端的浏览器也实现点击弹框，则在注册touch类事件
                     "scope": marker
                 });
                 final.push(marker);
                 markerlayer.addMarker(marker);
             }
         }
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
         if(infowin){
             try{
                 infowin.hide();
                 infowin.destroy();
                 map.removePopup(infowin)
             }
             catch(e){

             }
         }
         var marker = this;
         var lonlat = marker.getLonLat();
//            var orgame = marker.orgname;
         var size = new SuperMap.Size(0, 33);
         var offset = new SuperMap.Pixel(0,0);
         var icon = new SuperMap.Icon("theme/images/cluster4.png", size, offset);
         var contentHTML = "<div style='font-size:.8em; opacity: 0.8; overflow-y:hidden; color:black;'>";
         contentHTML += "<div class='nameJump'>名称:<a onclick='layerOpen(marker.code)'>"+marker.name+"</a></div><div>地址:<a>"+marker.adress+"</a></div><div>负责人:<a>"+marker.respperson+"</a></div>";
         contentHTML +="<div>联系电话:<a>"+marker.phone+"</a></div><div>筏站能力得分:<a>"+marker.score+"</a></div> </div>";

         var popup = new SuperMap.Popup.FramedCloud("popwin",new SuperMap.LonLat(lonlat.lon,lonlat.lat),null,contentHTML,icon,true);
         infowin = popup;
         map.addPopup(popup);
         event(marker.pid);
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
         console.log(url);
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