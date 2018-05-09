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
        }
        .detailTal{
            z-index :999;
        }
        .margin10{
            margin-top:10px;
        }
        #back{
            display: inline-block;
            cursor: pointer;
        }
    </style>
    <script type="text/javascript" src="${supermap}/libs/SuperMap.Include.js"></script>
    <script type="text/javascript" src='${script}/js/template-web.js'></script>
    <script type="text/javascript" src="${script}/chinasofti/gis/translate.js"></script>


<body onload="init()">

<div id="abilityLevel">
    <div class="level1">
        <input class="choose y_choose" type="checkbox" value="1"  checked disabled>80-100分<img src="${supermap}/theme/images/green.png" >
    </div>
    <div class="level2">
        <input class="choose p_choose" type="checkbox" value="2"  checked disabled>60-80分<img src="${supermap}/theme/images/blue.png" >
    </div>
    <div class="level3">
        <input class="choose c_choose" type="checkbox" value="3"   checked disabled>0-60分<img src="${supermap}/theme/images/yellow.png">
    </div>
</div>

<span class="showNews">
     <img src="${style}/images/gisleft.png" alt="">
</span>

<div id="surNews" class="detailTal">
      <span class="hideNews">
          <img src="${style}/images/gisright.png" alt="">
      </span>
    <h3 class="title03">
        <p class="titleContent">渔船数量统计表  （<span class="shengfen">全国</span> )</p>
        <p id="back">  返回  </p>
    </h3>
    <p class="margin10">
        <span>远洋渔船拥有量：</span><span class="shipTotal"></span>
    </p>

    <p>【已检验渔船：<span class="yjyyc">0</span>,待检验渔船：<span class="djjyc">0</span>，脱检渔船：<span class="tjyc">0</span>】</p>

    <p>远洋渔船捕捞能力：</p>

    <p>【远洋渔船总功率：<span class="zgl"></span>，远洋渔船总吨位：<span class="zdw"></span>】</p>

    <p>远洋渔船综合安全状况：<span class='aqtotal'></span></p>

    <p>【综合安全系数高：<span class="zhaqxs"></span>艘，综合安全系数中：<span class="zhaqxsz"></span>艘，综合安全系数低：<span class="zhaqxsd"></span>艘】</p>

    <p>【远洋渔船一次检验合格率：<span class="hgl"></span>】</p>

</div>
</body>
<div id="map"></div>
<script>
    function init(){
        var orgBlity = new OrgBlity();
        orgBlity.init();
    }
      
    function OrgBlity(options){
        var baseMap = "http://47.92.125.222:8083/iserver/services/map-china400/rest/maps/China_4326";
        var that = this;
        var markUrl = get_root + "/gis/getOceanShipData1";
        var clickUrl =  get_root + "/gis/getOceanShipData2?id=";
        var allUrl  = get_root +   "/gis/getOceanShipData2?";
        var layer,markerlayer,infowin,s_arr;
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
                        new SuperMap.Control.LayerSwitcher(),
                        new SuperMap.Control.MousePosition()
                    ],
                    projection: "EPSG:4326",
                    allOverlays: true
                });   
                layer = new SuperMap.Layer.TiledDynamicRESTLayer("China", baseMap, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
                layer.events.on({"layerInitialized":that.addLayer.bind(this)});
                markerlayer = new SuperMap.Layer.Markers("markerLayer");
                
            },
            addLayer : function(){
                var that = this;
                map.addLayers([layer,markerlayer]);
                map.setCenter(new SuperMap.LonLat(108.067923, 34.679943),2);
                that.addMarker();
                that.allData();
                that.backAll();
            },
            backAll : function(){
                var that = this;
                $('#back').on('click',function(){
                    that.allData();
                    $('.shengfen').html("全国");
                    map.setCenter(new SuperMap.LonLat(108.067923, 34.679943),2);
                })
            },
            allData : function(){
                $.ajax({
                    url : allUrl,
                    type : 'get',
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

                    }
                })
            },
            addMarker : function () {
                var that = this;
                $.ajax({
                    url : markUrl,
                    type:'get',
                    dataType : 'json',
                    success : function(data){
                        console.log('123')
                        console.log(data)
                        if(data.msg == 'success'){
                            var result = data.result;
                            s_arr = [];
                            for(var i = 0;i<result.length;i++){
                                var curr = result[i];
                                var x = curr.LON;
                                var y = curr.LAT;
                                var images;
                                
                                if(curr.SCORE <= 60 && curr.SCORE >=0){
                                    images  = "${supermap}/theme/images/yellow.png";
                                }else if(curr.SCORE <= 80 && curr.SCORE >60){
                                    images = "${supermap}/theme/images/blue.png"
                                }else if(curr.SCORE <= 100 && curr.SCORE >80){
                                    images = "${supermap}/theme/images/green.png"
                                }

                                var size = new SuperMap.Size(24, 24);
                                var offset = new SuperMap.Pixel(0, 0);
                                var icon = new SuperMap.Icon(images, size, offset);
                                var marker = new SuperMap.Marker(new SuperMap.LonLat(x, y), icon);
                                marker.id = curr.ID;
                                marker.score = curr.SCORE;
                                marker.events.on({
                                    "click":that.openInfoWin,
                                    "scope": marker
                                });
                                s_arr.push(marker);
                                markerlayer.addMarker(marker);
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
                var url = clickUrl +  id;
                var lonlat = marker.getLonLat();
                $.ajax({
                    url : url,
                    type:'get',
                    dataType : 'json',
                    success : function(data){
                        console.log(data);
                        var data = data.result;

                        var ownerMap = data.ownerMap;

                        var checkStatusList = data.checkStatusList;

                        var safeRateMap = data.safeRateMap;
                        //渔船安全系数艘数
                        $('.showNews').trigger('click');
                        $('.zhaqxs').html(safeRateMap.highNum);
                        $('.zhaqxsz').html(safeRateMap.middleNum);
                        $('.zhaqxsd').html(safeRateMap.lowNum);

                        $('.zgl').html(data.shipMap.totalPower);
                        $('.zdw').html(data.shipMap.totalTon);
                        $('.hgl').html(data.checkRate+"%");

                        $('.shengfen').html(data.ownerMap.name);
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