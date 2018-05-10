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
    <link rel="stylesheet" href="${ctx}/plug/layui/css/layui.css" >
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
        .showNews{
            z-index: 999;
            visibility: hidden;
        }
        .detailTal{
            z-index :999;
        }
        .margin10{
            margin-top:10px;
        }
        .search{
            position: absolute;
            z-index: 999;
            right:180px;
            top:18px;
        }
        .search .layui-btn-mini {
            width:70px;
        }
        #infowin{
            border-radius: 5px;
        }
        #detailTable{
            position: absolute;
            z-index: 999;
            height:300px;
            width:758px;
            text-align: center;
            background-color: #122C5B;
            padding:20px;
            color:#fff;
            overflow-y: scroll;
        }
        #detailTable tbody tr td{
            width:85px;
        }
        #detailTable tbody tr:nth-child(even){
            background:#294B6C;
        }
        #detailTable thead td{
            font-size: 18px;
            color:#fff;
            text-align: center;
            line-height: 18px;
        }
        .detailTal{
            background:none;
            top:6%;
            right:-16px;
        }
        .hideNews{
            position: absolute;
            z-index: 99999;
        }
        .aroundShipDetail{
            border-collapse:collapse
        }
        .group{
            text-align: left;
        }
        .groupNum{
            text-decoration: underline;
            font-size: 18px;
            cursor: pointer;
        }
        .yjyShip{
            text-decoration: underline;
            font-size: 18px;
            cursor: pointer;
        }

    </style>
    <script type="text/javascript" src="${supermap}/libs/SuperMap.Include.js"></script>
    <script type="text/javascript" src='${script}/js/template-web.js'></script>
    <script type="text/javascript" src="${script}/chinasofti/gis/translate.js"></script>
    <script type="text/javascript" src='${ctx}/plug/layui/lay/dest/layui.all.js'></script>

<body onload="init()">

<%--<div id="abilityLevel">--%>
<%--<div class="level1">--%>
<%--<input class="choose y_choose" type="checkbox" value="1"  checked disabled>80-100分<img src="${supermap}/theme/images/green.png" >--%>
<%--</div>--%>
<%--<div class="level2">--%>
<%--<input class="choose p_choose" type="checkbox" value="2"  checked disabled>60-80分<img src="${supermap}/theme/images/blue.png" >--%>
<%--</div>--%>
<%--<div class="level3">--%>
<%--<input class="choose c_choose" type="checkbox" value="3"   checked disabled>0-60分<img src="${supermap}/theme/images/yellow.png">--%>
<%--</div>--%>
<%--</div>--%>
<div class="legend">
    <p>
        <img src="${supermap}/theme/images/greenship.png">： <span> 检验完成渔船</span>
    </p>
    <p>
        <img src="${supermap}/theme/images/yellowstop.png">： <span> 待检渔船</span>
    </p>
    <p>
        <img src="${supermap}/theme/images/redstop.png">： <span> 脱检渔船  </span>
    </p>
</div>
<div class="search">
    <input type="text"  placeholder="请输入渔船编码" id='ship_num'/><input type="button" class="btn layui-btn  layui-btn-radius layui-btn-mini" id='search'  value="点击搜索"/> <input type="button" class="btn layui-btn  layui-btn-radius layui-btn-mini" id='clean'  value="清除"/>
</div>

<span class="showNews">
     <img src="${style}/images/gisleft.png" alt="">
</span>

<div id="surNews" class="detailTal">
      <span class="hideNews">
          <img src="${style}/images/gisright.png" alt="">
      </span>

    <div id="detailTable">



    </div>

</div>
<div id="map"></div>
<script type="text/template" id='groupDetail'>
    <table style="width:100%;">
        <thead>
        <tr>
            <th colspan="7">海外检验点团组情况</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>团组编号</td>
            <td>团组名称</td>
            <td>检验时间</td>
            <td>组长</td>
            <td>团组状态</td>
            <td>验船师名单</td>
            <td>已检验渔船</td>
        </tr>

        <?  for(var i=0 ; i<result.length;i++){  ?>
        <tr>
            <td><?= result[i].code  ?>  </td>
            <td><?= result[i].name  ?>  </td>
            <td><?= result[i].checkTime  ?>  </td>
            <td><?= result[i].leader  ?>  </td>
            <td><?= result[i].status  ?></td>
            <td><?= result[i].surveyor  ?></td>
            <td><?= result[i].checkedShips  ?></td>
        </tr>

        <?  }  ?>


        </tbody>
    </table>
</script>
<script type="text/template" id='groupShipInfo'>
    <table>
        <thead>
        <tr>
            <th colspan="12">远洋渔船信息</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>序号</td>
            <td>渔船编码</td>
            <td>船名号</td>
            <td>省份</td>
            <td>渔船呼号</td>
            <td>检验状态</td>
            <td>MMSI</td>
            <td>船长</td>
            <td>型宽</td>
            <td>功率</td>
            <td>上次检验时间</td>
            <td>方向</td>
        </tr>
        <? for(var i = 0;i<result.length;i++) {  ?>
        <tr>
            <td><?= result[i].RN  ?></td>
            <td><?= result[i].CDATE  ?></td>
            <td><?= result[i].SHIPCODE  ?></td>
            <td><?= result[i].PROVNAME   ?></td>
            <td><?= result[i].CALLSIGN   ?></td>
            <td><?= result[i].CHECKSTATE   ?></td>
            <td><?= result[i].MMSI   ?></td>
            <td><?= result[i].LENGTH   ?></td>
            <td><?= result[i].MODELWIDTH   ?></td>
            <td><?= result[i].POW   ?></td>
            <td><?= result[i].CDATE   ?></td>
            <td><?= result[i].DIRECTION   ?></td>
        </tr>
        <? } ?>
        </tbody>
    </table>
</script>
<script type="text/template" id='shipDetail'>
    <table class="aroundShipDetail">
        <thead>
        <tr>
            <td colspan="9">
                当前区域渔船列表
            </td>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>
                序号
            </td>
            <td>
                渔船编码
            </td>
            <td>
                船名号
            </td>
            <td>
                渔船呼号
            </td>
            <td>
                MMSI
            </td>
            <td>
                船长<br>（单位：米）
            </td>
            <td>
                型宽<br>（单位：米）
            </td>
            <td>
                功率<br>（单位：Kw）
            </td>
            <td>
                上次检验时间
            </td>
            <td>
                位置
            </td>
        </tr>

        <?  for(var i = 0 ; i<content.length;i++) {  ?>
        <tr>
            <td><?= i+1 ?></td>
            <td><?= content[i].attributes.shipcode ?></td>
            <td><?= content[i].attributes.shipName ?></td>
            <td><?= content[i].attributes.shipCall ?></td>
            <td><?= content[i].attributes.mmsi ?></td>
            <td><?= content[i].attributes.shipLength ?></td>
            <td><?= content[i].attributes.modelWidth ?></td>
            <td><?= content[i].attributes.power ?></td>
            <td><?= content[i].attributes.lastCheckDate ?></td>
            <td code = "<?= content[i].attributes.shipcode ?>"><button class="shipPosition">定位</button></td>
        </tr>
        <? }  ?>


        </tbody>
    </table>
</script>
</body>

<script>
    function init(){
        var orgBlity = new OrgBlity();
        orgBlity.init();
    }

    function OrgBlity(options){
        var baseMap = "http://47.92.125.222:8083/iserver/services/map-china400/rest/maps/China_4326";
        var that = this;
        var markUrl = get_root + "/gis/getOceanShipData7";
        var groupUrl = get_root + "/gis/getOceanShipData8";
        var clickUrl =  get_root + "/gis/getOceanShipData2?id=";
        var allUrl  = get_root +   "/gis/getOceanShipData2?";
        var searchShipDetail = get_root+"/gis/getOceanShipData10?shipcode=";
        //点击团组的url
        var gruopNum = get_root+ "/gis/getOceanShipData9?orgcode=";
        //点击远洋渔船url
        var groupShip = get_root + "/gis/getOceanShipData11?orgcode=";
        var layer1,vectorlayer,infowin,s_arr,pointFeature,infowinPosition,examineLayer,selectFeature,graphicsLayer,markerLayer,layerLoad;
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
                map = new SuperMap.Map("map", {
                    controls: [
                        new SuperMap.Control.Zoom() ,
                        new SuperMap.Control.Navigation() ,
                        new SuperMap.Control.ScaleLine(),
                        new SuperMap.Control.MousePosition()
                    ],
                    projection: "EPSG:4326",
                    allOverlays: true
                });

                map.events.on({"mousemove":function(e){
                    infowinPosition = e.xy.clone();
                    // 偏移
                    infowinPosition.x += 20;
                    infowinPosition.y -= 20;
                }});

                layer1 = new SuperMap.Layer.TiledDynamicRESTLayer("China", baseMap, null,{maxResolution:"auto",wrapDateLine:true},{transparent: true, cacheEnabled: true});
                layer1.events.on({"layerInitialized":that.addLayer.bind(this)});

                vectorlayer = new SuperMap.Layer.Vector("vectorLayer");
                examineLayer = new SuperMap.Layer.Vector("examines");
                graphicsLayer = new SuperMap.Layer.Vector("绘制图层");
                markerLayer = new SuperMap.Layer.Markers("围栏船位");

                var callbacks={
                    click: that.shipClick.bind(this)
                };
                selectFeature = new SuperMap.Control.SelectFeature([vectorlayer,examineLayer,graphicsLayer], {callbacks: callbacks});

                map.addControl(selectFeature);

            },
            addLayer : function(){
                var that = this;
                map.addLayers([layer1,vectorlayer,examineLayer,markerLayer,graphicsLayer]);
                map.setCenter(new SuperMap.LonLat(24.4335937500, -7.3624668655),0);
                selectFeature.activate();
                layerLoad = layer.load();
                that.addMarker();
                that.addGroup();
                that.search();
            },
            addGroup : function(){
                var that = this;
                $.ajax({
                    url: groupUrl,
                    type: 'get',
                    dataType: 'json',
                    success : function(data){
                        if(data.msg == 'success'){
                            var result = data.result;
                            for(var i = 0;i<result.length;i++){
                                var curr = result[i];
                                var x = curr.lon;
                                var y = curr.lat;
                                var point= new SuperMap.Geometry.Point(x,y);
                                pointFeature = new SuperMap.Feature.Vector(point);
                                pointFeature.attributes = {
                                    address : result[i].address,
                                    groupNums : result[i].groupNums,
                                    name : result[i].name,
                                    orgCode : result[i].orgcode,
                                    shipNums : result[i].shipNums,
                                    lastCheckDate :  result[i].lastCheckDate
                                }
                                pointFeature.style = {
                                    pointRadius:12,
                                    externalGraphic : "${supermap}/theme/images/overseas.png"
                                };
                                examineLayer.addFeatures(pointFeature);
                            }
                        }
                    }
                })
            },
            shipClick :function(e){
                var that = this;
                that.closeInfo();
                var layerName = e.layer.name;
                if(layerName == 'vectorLayer'){
                    that.shipDetail(e);
                }else if(layerName == 'examines'){
                    that.groupShip(e);
                }

            },
            groupShip : function(e){
                var that = this;
                if(e.geometry){
                    var contentHTML =  "<div style='color: #000; background-color: #fff'>"
                        +"<table class='group'>"
                        +"<tr>"
                        +"<td>境外检验点名称：</td><td>"+e.attributes.name+"</td>"
                        +"</tr>"
                        +"<tr>"
                        +"<td>境外检验点地址：</td><td>"+e.attributes.address+"</td>"
                        +"</tr>"
                        +"<tr>"
                        +"<td>境外团组数量：</td><td><a class='groupNum'>"+e.attributes.groupNums+"</a></td>"
                        +"</tr>"
                        +"<tr>"
                        +"<td>已检远洋渔船船次：</td><td><a class='yjyShip'>"+e.attributes.shipNums+"</a></td>"
                        +"</tr>"
                        +"<tr>"
                        +"<td>渔船电子围栏：</td><td><button class='aroundShip'>查看附近的渔船</button></td>"
                        +"</tr>"
                    var lonLat = map.getLonLatFromPixel(infowinPosition);

                    var options = {
                        x : lonLat.lon,
                        y : lonLat.lat,
                        width: 220,
                        height: 168
                    };
                    that.showPopup(map, options, contentHTML);
                    $('.aroundShip').on('click',function(){
                        if(infowin) map.removePopup(infowin);
                        that.aroundShip(e);
                    })

                    $('.groupNum').on('click',function(){
                        that.groupNumber(e.attributes.orgCode);
                    })

                    //if(Number(e.attributes.shipNums) != 0){
                    $('.yjyShip').on('click',function(){
                        that.groupShipDetail(e.attributes.orgCode);
                    })
                    //}
                }

            },
            groupShipDetail : function(code){
                $.ajax({
                    url : groupShip+"ZYJ001",
                    type:'get',
                    dataType : 'json',
                    success : function(data){
                        var result = data.result.dataList;
                        for(var i = 0 ;i<result.length;i++){
                            if(result[i].CHECKSTATE == '0'){
                                result[i].CHECKSTATE = '待检验';
                            }else if(result[i].CHECKSTATE == '1'){
                                result[i].CHECKSTATE == '已检验';
                            }else if(result[i].CHECKSTATE == '2'){
                                result[i].CHECKSTATE = '脱检';
                            }
                        }
                        var result = {
                            result : result
                        }
                        var str = template('groupShipInfo',result);
                        $('.showNews').trigger('click');
                        $('#detailTable').html(str);
                    }
                })

            },
            groupNumber : function(code){
                $.ajax({
                    url : gruopNum+code,
                    type:'get',
                    dataType : 'json',
                    success : function(data){
                        var result = data.result;
                        var status = "";
                        for(var i = 0; i<result.length;i++){
                            if(data.result[i].status == "0"){
                                status = '待检验';
                                result[i].status =  status;
                            }else if(data.result[i].status == "1"){
                                status = '已检验';
                                result[i].status =  status;
                            }else if(data.result[i].status == "2"){
                                status = '脱检';
                                result[i].status =  status;
                            }
                        }

                        var result = {
                            result : result
                        }

                        var str = template('groupDetail',result);

                        $('.showNews').trigger('click');

                        $('#detailTable').html(str);
                    }
                })
            },
            aroundShip : function(e){
                var that = this;
                layer.open({
                    width:200,
                    height:150,
                    offset :"250px",
                    title: "输入地理围栏范围",
                    type: 1,
                    btn: ["OK"],
                    content: '<div style=\"width:80%;margin-left:10%;margin-top:20px\"><input id=\"radius\" type=\"text\" style=\"width:100%\" placeholder="单位：海里"></div>',
                    yes: function(){
                        var code = e.attributes.orgCode;
                        var radius = $("#radius").val();
                        that.elecfence(code,radius);
                        layer.closeAll();
                    }
                });
            },
            elecfence : function(code,radius){
                var that = this;
                var selectedPoints = examineLayer.getFeaturesByAttribute("orgCode",code);
                var geo = selectedPoints[0].geometry;
                var seleLonlat = new SuperMap.LonLat(geo.x, geo.y);
                graphicsLayer.removeAllFeatures();
                if(selectedPoints && selectedPoints.length>0){
                    var attrs = [];
                    var circleP=that.createCircle(selectedPoints[0].geometry,radius*1.852/111,256,360,360);
                    var circleVector= new SuperMap.Feature.Vector(circleP);
                    circleVector.style={
                        strokeColor:"#CAFF70",
                        fillColor:"#C6E2FF",
                        strokeWidth:2 ,
                        fillOpacity:0.5
                    };
                    graphicsLayer.addFeatures([circleVector]);
                    map.addLayer(graphicsLayer);
                    for(var i=0;i<vectorlayer.features.length;i++){
                        var feature = vectorlayer.features[i];
                        var geometry = feature.geometry;
                        var lonlat = new SuperMap.LonLat(geometry.x, geometry.y);
                        var nmi = SuperMap.Util.distVincenty(lonlat,seleLonlat);
                        if(nmi/1.852 <= radius){
                            var attr = feature;
                            attrs.push(attr);
                            var lonlat = new SuperMap.LonLat(geometry.x, geometry.y);
                            var size = new SuperMap.Size(26, 23),
                                offset = new SuperMap.Pixel(-13, -12),
                                icon = new SuperMap.Icon("${supermap}/theme/images/twinkle.gif", size, offset);
                            var marker = new SuperMap.Marker(lonlat, icon);
                            markerLayer.addMarker(marker);
                            map.addLayer(markerLayer);
                            marker.attr =  feature.attributes;
                            marker.events.on({
                                "click":that.aroundShipClick,
                                "scope": marker
                            });
                        }
                    }
                    that.handleTable(attrs);
                }
            },
            handleTable : function(arr){
                var data = {
                    content : arr
                }
                var str =  template('shipDetail',data);
                $('.showNews').trigger('click');
                $('#detailTable').html(str);

                $('.shipPosition').on('click',function(){
                    var code = $(this).parent().attr('code');
                    var features = vectorlayer.getFeaturesByAttribute("shipcode",code);
                    var ele = features[0];
                    var lonlat = new SuperMap.LonLat(features[0].geometry.x, features[0].geometry.y);
                    map.setCenter(lonlat, 14);
                })
            },
            aroundShipClick : function(){
                var marker = this;
                var code = marker.attr.shipcode;
                $.ajax({
                    url: searchShipDetail + code,
                    type: 'get',
                    dataType: 'json',
                    success: function (data) {
                        if(data.msg == 'success'){
                            var result = data.result;
                            var checkStatus = "" ;
                            if(result.checkStatus == '0'){
                                checkStatus = "未检验";
                            }else if(result.checkStatus == '1'){
                                checkStatus = '已检验';
                            }else if(result.checkStatus == '2'){
                                checkStatus = '脱检';
                            }
                            var contentHTML =  "<div style='color: #000; background-color: #fff'>"
                                +"<table>"
                                +"<tr>"
                                +"<td>船名号：</td><td>"+result.shipname+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>船舶呼号：</td><td>"+result.callSign+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>MMSI：</td><td>"+result.MMSI+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>检验状态：</td><td>"+checkStatus+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>作业类型：</td><td>"+result.jobType+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>船东：</td><td>"+result.ownernam+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>航向：</td><td>"+result.direction+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>航速：</td><td>"+result.speed+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>船舶检验照片：</td><td> </td>"
                                +"</tr>"
                                +"<tr>";
                            var lonLat = map.getLonLatFromPixel(infowinPosition);
                            var options = {
                                x : lonLat.lon,
                                y : lonLat.lat,
                                width: 220,
                                height: 230
                            };
                            var test = new OrgBlity();
                            test.showPopup(map, options, contentHTML);
                            //showPopup(map, options, contentHTML);
                        }
                    }
                })

            },
            createCircle : function(origin, radius, sides,r,angel){
                var rR = r*Math.PI/(180*sides);
                var rotatedAngle, x, y;
                var points = [];
                for(var i=0; i<sides; ++i) {
                    rotatedAngle = rR*i;
                    x = origin.x + (radius * Math.cos(rotatedAngle));
                    y = origin.y + (radius * Math.sin(rotatedAngle));
                    points.push(new SuperMap.Geometry.Point(x, y));
                }
                rotatedAngle = r*Math.PI/180;
                x = origin.x + (radius * Math.cos(rotatedAngle));
                y = origin.y + (radius * Math.sin(rotatedAngle));
                points.push(new SuperMap.Geometry.Point(x, y));

                var ring = new SuperMap.Geometry.LinearRing(points);
                ring.rotate(parseFloat(angel),origin);
                var geo = new SuperMap.Geometry.Collection([ring]);
                geo.origin = origin;
                geo.radius = radius;
                geo.r = r;
                geo.angel = angel;
                geo.sides = sides;
                geo.polygonType = "Curve";
                return geo;
            },
            shipDetail : function(e){
                var that = this;
                var code = e.attributes.shipcode;
                $.ajax({
                    url : searchShipDetail+code,
                    type:'get',
                    dataType : 'json',
                    success : function(data){
                        if(data.msg == 'success'){
                            var result = data.result;
                            var checkStatus = "" ;
                            if(result.checkStatus == '0'){
                                checkStatus = "未检验";
                            }else if(result.checkStatus == '1'){
                                checkStatus = '已检验';
                            }else if(result.checkStatus == '2'){
                                checkStatus = '脱检';
                            }
                            var contentHTML =  "<div style='color: #000; background-color: #fff'>"
                                +"<table>"
                                +"<tr>"
                                +"<td>船名号：</td><td>"+result.shipname+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>船舶呼号：</td><td>"+result.callSign+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>MMSI：</td><td>"+result.MMSI+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>检验状态：</td><td>"+checkStatus+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>作业类型：</td><td>"+result.jobType+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>船东：</td><td>"+result.ownernam+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>航向：</td><td>"+result.direction+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>航速：</td><td>"+result.speed+"</td>"
                                +"</tr>"
                                +"<tr>"
                                +"<td>船舶检验照片：</td><td> </td>"
                                +"</tr>"
                                +"<tr>";
                            var lonLat = map.getLonLatFromPixel(infowinPosition);
                            var options = {
                                x : lonLat.lon,
                                y : lonLat.lat,
                                width: 220,
                                height: 230
                            };

                            that.showPopup(map, options, contentHTML);
                        }
                    }
                })
            },
            showPopup : function(map, options, contentHTML){
                var name = options && options.name? options.name : "infowin";
                var position = options && options.x && options.y? new SuperMap.LonLat(options.x,options.y) : map.getCenter();
                // 弹出框大小
                var size = options && options.width && options.height ? new SuperMap.Size(options.width, options.height): new SuperMap.Size(200, 300);

                if(infowin) map.removePopup(infowin);
                infowin = new SuperMap.Popup(
                    name,
                    position,
                    size,
                    contentHTML,
                    true,
                    false,
                    null);
                infowin.setBackgroundColor("#fff");
                infowin.setOpacity(0.8);
                map.addPopup(infowin);
            },
            closeInfo : function(){
                if(infowin) {
                    try {
                        map.removePopup(infowin)
                    } catch(e) {}
                }
            },
            search : function(){
                $('#search').on('click',function(){
                    var word = $('#ship_num').val();
                    var features = vectorlayer.getFeaturesByAttribute("shipcode",word);
                    var ele = features[0];
                    ele.style.externalGraphic = "${supermap}/theme/images/twinkle.gif";
                    if(!features || features.length==0){
                        alert("没有编号或船名为" + word + "的渔船");
                        return;
                    }
                    var lonlat = new SuperMap.LonLat(features[0].geometry.x, features[0].geometry.y);

                    map.setCenter(lonlat, 9);

                })

                $('#clean').on('click',function(){
                    var word = $('#ship_num').val();
                    var features = vectorlayer.getFeaturesByAttribute("shipcode",word);
                    if(features.length > 0){
                        var ele = features[0];
                        ele.style.externalGraphic = "${supermap}/theme/images/greenship.png";
                    }

                    graphicsLayer.removeAllFeatures();
                    markerLayer.clearMarkers();

                    $('.hideNews').trigger('click');

                    map.setCenter(new SuperMap.LonLat(24.4335937500, -7.3624668655),0);

                })
            },
            addMarker : function () {
                var that = this;
                $.ajax({
                    url : markUrl,
                    type:'get',
                    dataType : 'json',
                    success : function(data){
                        if(data.msg == 'success'){
                            var result = data.result;

                            s_arr = [];
                            var images;
                            for(var i = 0;i<result.dataList.length;i++){
                                if(result.dataList[i].checkStatus == '0'){
                                    images  = "${supermap}/theme/images/greenship.png";
                                }else if (result.dataList[i].checkStatus == '1'){
                                    images  = "${supermap}/theme/images/yellowstop.png";
                                }else if(result.dataList[i].checkStatus =='2' ){
                                    images  = "${supermap}/theme/images/redstop.png";
                                }
                            }
                            for(var i = 0;i<result.dataList.length;i++){
                                var curr = result.dataList[i];
                                var x = curr.lon;
                                var y = curr.lat;
                                var point= new SuperMap.Geometry.Point(x,y);
                                pointFeature = new SuperMap.Feature.Vector(point);
                                pointFeature.attributes = {
                                    shipcode : result.dataList[i].shipCode,
                                    mmsi : result.dataList[i].MMSI,
                                    shipCall : result.dataList[i].callSign,
                                    modelWidth : result.dataList[i].modelWidth,
                                    power : result.dataList[i].power,
                                    provName : result.dataList[i].provName,
                                    shipLength : result.dataList[i].shipLength,
                                    shipName : result.dataList[i].shipName,
                                    direction : result.dataList[i].direction
                                }
                                pointFeature.style={
                                    pointRadius:8,
                                    externalGraphic : images,
                                    rotation : result.dataList[i].direction
                                };
                                vectorlayer.addFeatures(pointFeature);
                                layer.close(layerLoad)
                            }
                            that.inputCheck()
                        }
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
                var id  = marker.id;
                var url = clickUrl +  3;
                var lonlat = marker.getLonLat();
                $.ajax({
                    url : url,
                    type:'get',
                    dataType : 'json',
                    success : function(data){

                        var data = data.result;
                        var ownerMap = data.ownerMap;

                        var checkStatusList = data.checkStatusList;

                        var safeRateMap = data.safeRateMap;
                        //渔船安全系数艘数
                        $('.zhaqxs').html(safeRateMap.highNum);
                        $('.zhaqxsz').html(safeRateMap.middleNum);
                        $('.zhaqxsd').html(safeRateMap.lowNum);

                        $('.zgl').html(data.shipMap.totalPower);
                        $('.zdw').html(data.shipMap.totalTon);
                        $('.hgl').html(data.checkRate+"%");

                        for(var i = 0 ;i<checkStatusList.length;i++){
                            var curr = checkStatusList[i];
                            if(curr.checkStatus == '0'){
                                $('.djjyc').html(curr.num) ;
                            }else if(curr.checkStatus == '1'){
                                $('.yjyyc').html(curr.num) ;
                            }else if(curr.checkStatus == '2'){
                                $('.tjyc').html(curr.num) ;
                            }
                        }

                        var contentHTML = "<div style='font-size:.8em; opacity: 2.0; overflow:auto;'>";

                        contentHTML += "<div>"+"机构名称："+"<a>"+ownerMap.name+"</a>"+
                            "<br/>"+"机构地址："+ ownerMap.addr +"<br>机构负责人:"+ownerMap.leader+"<br>机构联系电话:"+ownerMap.tel+"<br>诚信得分"+ownerMap.score;
                        "</div></div>";
                        var size = new SuperMap.Size(0, 33);
                        var offset = new SuperMap.Pixel(11, 10);
                        var icon = new SuperMap.Icon("theme/images/cluster4.png", size, offset);
                        var popup = new SuperMap.Popup.FramedCloud("popwin",
                            new SuperMap.LonLat(lonlat.lon,lonlat.lat),
                            null,
                            contentHTML,
                            icon,
                            true
                        );
                        infowin = popup;
                        map.addPopup(popup);
                    }
                })
            },
            inputCheck : function(){
                $('.choose').removeAttr("disabled");
                $('.y_choose').on('change',function(){
                    if(!$(this).is(':checked')){
                        for(var i=0;i<s_arr.length;i++){
                            if(s_arr[i].score <= 100 && s_arr[i].score >80){
                                markerlayer.removeMarker(s_arr[i]);
                            }
                        }
                    }else if($(this).is(':checked')){
                        for(var i=0;i<s_arr.length;i++){
                            if(s_arr[i].score <= 100 && s_arr[i].score >80){
                                markerlayer.addMarker(s_arr[i]);
                            }
                        }
                    }
                })

                $('.p_choose').on('change',function(){
                    if(!$(this).is(':checked')){
                        for(var i=0;i<s_arr.length;i++){
                            if(s_arr[i].score <= 80 && s_arr[i].score >60){
                                markerlayer.removeMarker(s_arr[i]);
                            }
                        }
                    }else if($(this).is(':checked')){
                        for(var i=0;i<s_arr.length;i++){
                            if(s_arr[i].score <= 80 && s_arr[i].score >60){
                                markerlayer.addMarker(s_arr[i]);
                            }
                        }
                    }
                })

                $('.c_choose').on('change',function(){
                    if(!$(this).is(':checked')){
                        for(var i=0;i<s_arr.length;i++){
                            if(s_arr[i].score <= 60 && s_arr[i].score >=0 ){
                                markerlayer.removeMarker(s_arr[i]);
                            }
                        }
                    }else if($(this).is(':checked')){
                        for(var i=0;i<s_arr.length;i++){
                            if(s_arr[i].score <= 60 && s_arr[i].score >=0){
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
</head>
</html>