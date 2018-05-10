<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<%@include file="/WEB-INF/content/chinasofti/common/head.jsp" %>
<html>
<head>
    <meta charset="utf-8">
    <title>GIS_产品检验统计</title>
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
            height: 757px;
            border:1px solid #3473b7;
        }
        .back{
            color:#fff;
            padding-left:20px;
            text-underline: none;
            cursor: pointer;
        }
        /*table样式*/
        .legend{
            top:10px ;
            left:10px ;
            z-index: 9999;
        }
        .legend_block{
            display: inline-block;
            width: 32px;
            height: 25px;
            margin-bottom: -7px;
            opacity:0.5;
        }

    </style>
    <script type="text/javascript" src="${supermap}/libs/SuperMap.Include.js"></script>
    <script type="text/javascript" src="${script}/chinasofti/gis/provinceCode.js"></script>
    <script type="text/javascript" src='${script}/js/template-web.js'></script>
    <script type="text/javascript" src="${script}/chinasofti/gis/translate.js"></script>
    <link rel="stylesheet" href="${style}/css/system-construction.css">
</head>
<body onload="init()">
<div class="legend">
    <p>
        <span class="legend_block" style="background-color:#00CCFF;"></span>： <span> 检验机构数小于30个</span>
    </p>
    <p>
        <span class="legend_block" style="background-color:#29ef57;"></span>： <span> 检验机构数大于30个小于60个</span>
    </p>
    <p>
        <span class="legend_block" style="background-color:#293eef;"></span>： <span> 检验机构数大于60个小于90个  </span>
    </p>
</div>
<div id="map"></div>
<span class="showNews">
     <img src="${style}/images/gisleft.png" alt="">
</span>
<div id="surNews" class="detailTal">
      <span class="hideNews">
          <img src="${style}/images/gisright.png" alt="">
      </span>
    <h3 class="title03"><p class="titleContent">全国产品检验数量统计</p></h3>

    <table class="surCount">

        <tbody>
        <tr class="content">
            <td colspan="5">产品认可型号总数：</td>
            <td colspan="5"><span class="totalNum"></span>个</td>
        </tr>
        <tr>
            <td>船用材料：</td>
            <td>舾装部件：</td>
            <td>轮机设备：</td>
            <td>电气设备：</td>
            <td>通导设备：</td>

            <td>救生设备：</td>
            <td>信号设备：</td>
            <td>消防设备：</td>
            <td>防污染设备：</td>
            <td>其他：</td>
        </tr>
        <tr>
            <td class="cycl"></td>
            <td class="xzbj"></td>
            <td class="ljsb"></td>
            <td class="dqsb"></td>
            <td class="tdsb"></td>

            <td class="jssb"></td>
            <td class="xhsb"></td>
            <td class="xfsb"></td>
            <td class="fwrsb"></td>
            <td class="other"></td>
        </tr>
        </tbody>
    </table>
</div>
</body>
<script>
    function init(){
        var production = new Production();
        production.init();
    }

    function Production(options){
        var baseMap = "http://47.92.125.222:8083/iserver/services/map-china400/rest/maps/China_4326";
        var dataUrl = "http://47.92.125.222:8083/iserver/services/data-ChinaProvinces/rest/data";
        var allUrl = get_root +  "/gis/getProductTypeData1";
        var tableUrl = get_root +  "/gis/getProductTypeData2?uid=";
        var backUrl =  get_root + "/gis/getProductTypeData2"
        var layer,danZhiLayer,arr,test;
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
                layer= new SuperMap.Layer.TiledDynamicRESTLayer("China", baseMap, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
                layer.events.on({"layerInitialized":that.addLayer.bind(this)});
                danZhiLayer = new SuperMap.Layer.Unique("ThemeLayer");
                var options = {
                    map :  map,
                    layer : danZhiLayer,
                    dataUrl : "http://47.92.125.222:8083/iserver/services/data-ChinaProvinces/rest/data",
                    dzSetting : {
                        opacticy : 0.6,
                        style : {
                            shadowBlur: 3,
                            shadowColor: "#000000",
                            shadowOffsetX: 1,
                            shadowOffsetY: 1,
                            fillColor: "#FFFFFF"
                        },
                        isHoverAble : true,
                        highlightStyle : {
                            stroke: true,
                            strokeWidth: 2,
                            strokeColor: '#ECF600',
                            fillColor: "#00F5FF",
                            fillOpacity: 0.1
                        },
                        themeField : "NAME"
                    }
                }
                test = new DanZhi();
                test.init(options);
                that.firstData();
                danZhiLayer.on("click", that.evn);
            },
            firstData : function(){
               $.ajax({
                   url : backUrl,
                   type:'get',
                   dataType: 'json',
                   success : function(data){
                       var result = data.result;
                       var typeArr = result.dataList;
                       for(var i = 0;i<typeArr.length;i++){
                           var curr = typeArr[i];
                           if(curr.TYPE == 'A'){
                               $('.cycl').html(curr.NUM);
                           }else if(curr.TYPE == 'I'){
                               $('.fwrsb').html(curr.NUM);
                           }else if(curr.TYPE == 'F'){
                               $('.jssb').html(curr.NUM);
                           }else if(curr.TYPE == 'H'){
                               $('.xfsb').html(curr.NUM);
                           }else if(curr.TYPE == 'B'){
                               $('.xzbj').html(curr.NUM);
                           }else if(curr.TYPE == 'G'){
                               $('.xhsb').html(curr.NUM);
                           }else if(curr.TYPE == 'E'){
                               $('.tdsb').html(curr.NUM);
                           }else if(curr.TYPE == 'J'){
                               $('.other').html(curr.NUM);
                           }else if(curr.TYPE == 'C'){
                               $('.ljsb').html(curr.NUM);
                           }else if(curr.TYPE == 'D'){
                               $('.dqsb').html(curr.NUM);
                           }
                       }
                   }
               })
            },
            evn : function(e){
                var event = e.event;
                if(e.target && e.target.refDataID){
                    var fid = e.target.refDataID;
                    var fea = danZhiLayer.getFeatureById(fid);
                    for(var i = 0;i<provinceArrSimple.length;i++){
                        if(provinceArrSimple[i].name == fea.attributes.NAME){
                            var orgCode =  provinceArrSimple[i].value;
                            var url = tableUrl + orgCode;
                            $.ajax({
                                url : url,
                                type:'get',
                                dataType: 'json',
                                success : function(data){
                                    var str =  fea.attributes.NAME+"省"+"产品检验数量统计"+"<span><a class='back'>(返回)</a></span>";
                                    $('.titleContent').html(str);
                                    $('.showNews').trigger('click');
                                    var result = data.result;
                                    $('.totalNum').html(result.totalNum);
                                    var typeArr = result.dataList;
                                    for(var i = 0;i<typeArr.length;i++){
                                        var curr = typeArr[i];
                                        if(curr.TYPE == 'A'){
                                            $('.cycl').html(curr.NUM);
                                        }else if(curr.TYPE == 'I'){
                                            $('.fwrsb').html(curr.NUM);
                                        }else if(curr.TYPE == 'F'){
                                            $('.jssb').html(curr.NUM);
                                        }else if(curr.TYPE == 'H'){
                                            $('.xfsb').html(curr.NUM);
                                        }else if(curr.TYPE == 'B'){
                                            $('.xzbj').html(curr.NUM);
                                        }else if(curr.TYPE == 'G'){
                                            $('.xhsb').html(curr.NUM);
                                        }else if(curr.TYPE == 'E'){
                                            $('.tdsb').html(curr.NUM);
                                        }else if(curr.TYPE == 'J'){
                                            $('.other').html(curr.NUM);
                                        }else if(curr.TYPE == 'C'){
                                            $('.ljsb').html(curr.NUM);
                                        }else if(curr.TYPE == 'D'){
                                            $('.dqsb').html(curr.NUM);
                                        }
                                    }
                                    //back
                                    $('.back').on('click',function(){
                                        $.ajax({
                                            url : backUrl,
                                            type:'get',
                                            dataType: 'json',
                                            success : function(data) {
                                                $('.titleContent').html("全国产品检验数量统计");
                                                var result = data.result;
                                                $('.totalNum').html(result.totalNum);
                                                var typeArr = result.dataList;
                                                for(var i = 0;i<typeArr.length;i++){
                                                    var curr = typeArr[i];
                                                    if(curr.TYPE == 'A'){
                                                        $('.cycl').html(curr.NUM);
                                                    }else if(curr.TYPE == 'I'){
                                                        $('.fwrsb').html(curr.NUM);
                                                    }else if(curr.TYPE == 'F'){
                                                        $('.jssb').html(curr.NUM);
                                                    }else if(curr.TYPE == 'H'){
                                                        $('.xfsb').html(curr.NUM);
                                                    }else if(curr.TYPE == 'B'){
                                                        $('.xzbj').html(curr.NUM);
                                                    }else if(curr.TYPE == 'G'){
                                                        $('.xhsb').html(curr.NUM);
                                                    }else if(curr.TYPE == 'E'){
                                                        $('.tdsb').html(curr.NUM);
                                                    }else if(curr.TYPE == 'J'){
                                                        $('.other').html(curr.NUM);
                                                    }else if(curr.TYPE == 'C'){
                                                        $('.ljsb').html(curr.NUM);
                                                    }else if(curr.TYPE == 'D'){
                                                        $('.dqsb').html(curr.NUM);
                                                    }
                                                }
                                            }
                                        })
                                    })



                                }
                            })
                        }
                    }
                }
            },
            addLayer : function(){
                var that = this;
                map.addLayers([layer,danZhiLayer]);
                map.setCenter(new SuperMap.LonLat(108.067923, 34.679943),2);
                that.dzInit();
            },
            dzInit : function(){
                var that = this;
                var dzData;
                $.ajax({
                    url:allUrl ,
                    type:'get',
                    dataType: 'json',
                    success : function(data){
                        if(data.msg == 'success'){
                            var result = data.result;
                            arr = translateCode(result);
                            var color;
                            var dzArr = [];
                            for(var i = 0;i<arr.length;i++){
                                var dataObj = new Object();
                                if(arr[i].NUM < 100 && arr[i].NUM!= 0){
                                    color = '#00CCFF';
                                    dataObj = {
                                        value : arr[i].PROVNAME ,
                                        style : {fillColor : color}
                                    }
                                }else if(arr[i].NUM >= 100 && arr[i].NUM < 200){
                                    color = '#0099FF';
                                    dataObj = {
                                        value : arr[i].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }else if(arr[i].NUM >= 200 && arr[i].NUM < 300){
                                    color = '#0066FF';
                                    dataObj = {
                                        value : arr[i].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }else if(arr[i].NUM >= 300){
                                    color = '#0066FF';
                                    dataObj = {
                                        value : arr[i].PROVNAME,
                                        style : {fillColor : color}
                                    }
                                }
                                test.handleData(arr,dataObj);
                            }
                            var _source = 'China';
                            var _dataSourceName = 'China:Provinces_R';
                            var _dataUrl = "http://47.92.125.222:8083/iserver/services/data-ChinaProvinces/rest/data";
                            var op = {
                                source: _source,
                                dataSourceName: _dataSourceName,
                                dataUrl : _dataUrl,
                            }
                            test.getDanzhi(op,that.processCompleted,that.processFailed);

                        }
                        //console.log(data);
                        //TODO 获取全国的数据
                    }
                })

            },
            processCompleted : function(getFeaturesEventArgs){
                var result = getFeaturesEventArgs.result;

                var feas = [];
                if(result && result.features) {
                    var features = result.features;
                    for(var i = 0, len = features.length; i < len; i++) {
                        for(var k = 0;k<arr.length;k++){
                            var feature = features[i];
                            if(arr[k].PROVNAME == feature.attributes.NAME){
                                feas.push(feature);
                            }
                        }
                    }
                    danZhiLayer.addFeatures(feas);
                }
            },
            processFailed : function(){
                layer.msg(e.error.errorMsg);
            }


        }
        return new OrgFun(options);
    }

</script>

</html>