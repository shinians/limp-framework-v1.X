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
            background-color: rgba(3, 13, 33, 0.58);
            color: #8aaece;
            z-index: 9999;
        }
    </style>

<body>

<input type="button">1
<input type="button">2
<input type="button">3
<input type="button">4
<input type="button">5

</body>
<script type="text/javascript">
//    window.onload=function(){
var map,layer1, markerlayer,markerlayer2,marker,marker2,final,themeLayer,control,orgCode, utfgrid, chartLayer,
url = system.echartsUrl;
var tiandi;
var tools;
var tiandiVct;
var themUrl = system.dataUrl;
var tiandiMap = system.tiandiUrl;
var tiandiVecMap = system.tiandiVecUrl;
var a_url=get_root+'/gis/getConstructionOrg';
var org_url = get_root + '/gis/getOrgData';
var them_url = get_root +'/gis/getOrgData2';
var score_url = get_root +'/gis/getOrgData1';
var themeResult=[];
var pieChartDom;
var elementsDiv;
var isMapMoving = false;
var polygonLayer,drawPolygon,drawBounds,drawCircle,drawToLine;

function init(){
if(!document.createElement('canvas').getContext){
alert("您的浏览器不支持 Canvas，请升级！");
return;
}

//绘制图层
polygonLayer = new SuperMap.Layer.Vector("polygonLayer");
drawPolygon  = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.Polygon);

//query
drawBounds = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.Box);
drawBounds.events.on({"featureadded": drawCompleted});

//几何圆查询
drawCircle = new SuperMap.Control.DrawFeature(polygonLayer,SuperMap.Handler.RegularPolygon,{handlerOptions:{sides:50}});
drawCircle.events.on({"featureadded": drawCompleted});

//测距
drawToLine = new SuperMap.Control.DrawFeature(polygonLayer, SuperMap.Handler.Path, { multi: false });

map =   new SuperMap.Map("map",{controls:[
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
//地图移动过程中不显示图表
map.events.on({"movestart": function(){
$("#piechart").innerHTML = "";
pieChartDom.style.display = "none";
isMapMoving = true;
}});
map.events.on({"moveend": function(){
isMapMoving = false;
}});

layer1= new SuperMap.Layer.TiledDynamicRESTLayer("china", url, null,{maxResolution:"auto"},{transparent: true, cacheEnabled: true});
//       3级标记层
markerlayer = new SuperMap.Layer.Markers("markerLayer");
//       4级标记层
markerlayer2 = new SuperMap.Layer.Markers("markerLayer");

themeLayer = new SuperMap.Layer.Unique("themeLayer");

themeLayerStyle(themeLayer);
themeLayer.on("click", event);
echartLayer();
layer1.events.on({"layerInitialized":addLayer});
check();
map.events.on({"zoomend":zoom});

}

function drawCompleted(){
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


//鼠标移动中仍保持在同一个数据上
var isOneData = "";
var theDataCache;
var infoo,myChart;
var fork;
var test;
function echartLayer(){
//创建 Elements 图层，用于显示饼图
chartLayer = new SuperMap.Layer.Elements("eCharts");

//获取 Elements 图层 div
elementsDiv =  chartLayer.getDiv();

//设置Elements实例的div为地图大小
var mapsize = map.getSize();
elementsDiv.style.width = mapsize.w;
elementsDiv.style.height = mapsize.h;

//创建图表 div, 设置其基本属性, 并添加到  Elements 图层
pieChartDom = document.createElement("div");
pieChartDom.id = "piechart";
pieChartDom.style.width = "400px";
pieChartDom.style.height = "240px";
pieChartDom.style.position = "absolute";
pieChartDom.style.opacity = 0.8;
elementsDiv.appendChild(pieChartDom);

$('#piechart').html("<div id='aa'></div><div style='font-size: 20px;position: absolute;top:20px;right:20px;'>x</div>");

// UTF图
utfgrid = new SuperMap.Layer.UTFGrid("UTFGridLayer", system.baseUrl,
{
layerName: "China_Province_pl@China",
utfTileSize: 256,
pixcell: 8,
isUseCache: true
},
{
utfgridResolution: 8
});
control = new SuperMap.Control.UTFGrid({
layers: [utfgrid],
callback: callback,
handlerMode: "click"
});
utfgrid.maxExtent = new SuperMap.Bounds(-180.0 ,-85.05,180.0,85.05 );
map.addControl(control);
}
// 相同数据检测
var callback = function (infoLookup, loc, pixel) {
if (infoLookup && isMapMoving === false) {
for (var idx in infoLookup) {
infoo = infoLookup[idx];
if (infoo && infoo.data) {
$("#piechart").innerHTML = "#F4F3F0";
pieChartDom.style.display = "block";
$('#piechart').html("<div id='charts'></div><span class='fork'>X</span>");
//fork点击图表消失？
$('.fork').click(function(){
$('#piechart').css('display','none');
// console.log("closed！");
})
// 基于准备好的dom，初始化echarts图表
myChart = echarts.init(document.getElementById('charts'));
var thedata;

// echart 图表配置参数
var option = {
backgroundColor:"#F4F3F0",
title : {
text: infoo.data.NAME +'机构能力分布图',
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
pieData(infoo);
// 为echarts对象加载数据
myChart.setOption(option);

// 图表位置
pieChartDom.style.left = (pixel.x + 20) + "px";
pieChartDom.style.top = (pixel.y - 20) + "px";

}
else{
//清除饼图
$("#piechart").innerHTML = "";
pieChartDom.style.display = "none";
}
}
}
};
//        饼图数据
function pieData(infoo){
var score=[];
for (var i = 0; i < provinceArr.length; i++) {
if (provinceArr[i].name == infoo.data.NAME) {
orgCode = provinceArr[i].value;   //1100000
var this_url = score_url + "?uid=" + orgCode;
$.get(this_url, function (data) {
var scoreData =JSON.parse(data);

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
return;
}

//机构能力分布
function themeLayerStyle(layer1){
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

//刷新页面先获取一次全国数据
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
// move填充content
function event(e){
if(e.target && e.target.refDataID){
var fid = e.target.refDataID;
var fea = themeLayer.getFeatureById(fid);
$('.num td').html("");
for(var i = 0;i<provinceArrSimple.length;i++){
if(provinceArrSimple[i].name == fea.attributes.NAME){
orgCode = provinceArrSimple[i].value;   //1100000
var this_url = org_url+"?uid="+orgCode;
$.get(this_url,function(data){
var da = JSON.parse(data);
console.log(da);
var _res = da.result;
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

})
}
}
}else{
// console.log("aa");
}
};
//获取 feature 数据
function addThemeLayer() {
clearLayer();
var dataSourceName=[];
//       var dataSource = 'China';
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
eventListeners: {"processCompleted": processCompleted, "processFailed": processFailed}});
getFeatureBySQLService.processAsync(getFeatureBySQLParams);
fillThemeBlock();
}
function processCompleted(getFeaturesEventArgs) {
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
}
function fillThemeBlock(){
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
}
function processFailed(e) {
alert(e.error.errorMsg);
}
function clearLayer() {
//先清除上次的显示结果
themeLayer.clear();
}
//鼠标缩放级别
// 切换不同级别图片即切换不同图层，用setVisibility控制
function zoom(){
var zoomLayer = map.getZoom();
console.log(zoomLayer)

switch(zoomLayer){
case 3:
clearLayer();
markerlayer.setVisibility(false);
markerlayer2.setVisibility(false);
addThemeLayer();
$('#abilityLevel').css('display','none');
$('#abilityLevel2').css('display','none');
$('#faceLevel').css('display','block');
break;
case 4:
clearLayer();
markerlayer2.setVisibility(false);
markerlayer.setVisibility(true);

//点坐标图例
$('#abilityLevel').css('display','block');
$('#abilityLevel2').css('display','none');
$('#faceLevel').css('display','none');
break;
case 5:
clearLayer();
markerlayer.setVisibility(false);
markerlayer2.setVisibility(true);
$('#abilityLevel2').css('display','block');
$('#abilityLevel').css('display','none');
$('#faceLevel').css('display','none');
break;

}
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

// layer1.isBaseLayer=true;
// tiandiVct.isBaseLayer=true;
// tiandi.isBaseLayer=true;

map.addLayers([tiandi,layer1,tiandiVct,polygonLayer,themeLayer,chartLayer,utfgrid,markerlayer,markerlayer2]);
//显示地图范围
map.setCenter(new SuperMap.LonLat(108.067923, 32.679943),3);

tools = new ToolsNav({
id : "#tools",
map : map,
layui : layui,
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

//map.addLayer(markerlayer);
//map.addLayer(markerlayer2);
addData();
mapChange();
addData2();
queryData();
clearIt();
}

function mapChange(){
$('#zidingyiMap').trigger('click');
// tiandi.setVisibility(false);
// layer1.setVisibility(true);
// tiandiVct.setVisibility(false);
}

function clearIt(){
$("#clearIt").on('click',function(){
//清除绘制图层
polygonLayer.removeAllFeatures();
//circleLayer.removeAllFeatures();
})
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
}

//添加级别为3的数据
function addData()
{
$.ajax({
url:a_url ,
type:'post',
dataType: 'json',
success: function (data) {
var result = data.result;
markerlayer.removeMarker(marker);
markerlayer2.removeMarker(marker2);
var size = new SuperMap.Size(16,16);
var offset = new SuperMap.Pixel(-(size.w/2), -size.h);
var icon = new SuperMap.Icon('${supermap}/theme/images/cluster4.png', size, offset);
console.log(result);
final = [];
//10
for(var i=0;i<result.length ;i++){
//  能力评分
if(result[i].orgScore >= 80 && result[i].orgScore<100){
icon = new SuperMap.Icon('${supermap}/theme/images/green.png',size,offset);
var index = i;
getit(index);
check(index);
}else if(result[i].orgScore >= 60 && result[i].orgScore<80){
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
marker =new SuperMap.Marker(new SuperMap.LonLat(result[i].posx,result[i].posy),icon);
marker.name = result[i].orgname;
marker.adress = result[i].orgAdress;
marker.phone = result[i].orgPhone;
marker.respperson = result[i].orgRespperson;
marker.score =result[i].orgScore;
marker.code = result[i].orgCode;
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
})
}
//     4级的时候数据
function addData2(){
$.ajax({
url:a_url ,
type:'post',
dataType: 'json',
success: function (data) {
var result = data.result;
console.log(result);
//TODO typeLv返回错误 需要重新处理
markerlayer.removeMarker(marker);
markerlayer2.removeMarker(marker2);
var size = new SuperMap.Size(16,16);
var offset = new SuperMap.Pixel(-(size.w/2), -size.h);
var icon = new SuperMap.Icon('${supermap}/theme/images/cluster4.png', size, offset);

final = [];
//50
for(var i=0;i< result.length;i++){
//  能力评分
if(result[i].typeLv == "省、自治区、直辖市局"||result[i].typeLv == "分局" || result[i].typeLv == "单列市局" ||result[i].typeLv == "市处"){
icon = new SuperMap.Icon('${supermap}/theme/images/else.png',size,offset);
getit2(i);
}else if(result[i].typeLv =="部局"){
//                     省、自治区、直辖市局
icon = new SuperMap.Icon('${supermap}/theme/images/province.png',size,offset);
getit2(i);
}else if(result[i].typeLv == "国家局"){
//                     国家局
icon = new SuperMap.Icon('${supermap}/theme/images/nation.png',size,offset);
getit2(i);
}

function getit2(i){
marker2 =new SuperMap.Marker(new SuperMap.LonLat(result[i].posx,result[i].posy),icon);
marker2.name = result[i].orgname;
marker2.adress = result[i].orgAdress;
marker2.phone = result[i].orgPhone;
marker2.respperson = result[i].orgRespperson;
marker2.score =result[i].orgScore;
marker2.code = result[i].orgCode;
marker2.events.on({
"click":openInfoWin,
"touchstart":openInfoWin, //假如要在移动端的浏览器也实现点击弹框，则在注册touch类事件
"scope": marker2
});
final.push(marker2);
markerlayer2.addMarker(marker2);
}

}
}
})
}
//CheckBox点击事件
function check(){
$('#btn1').on('change',function(){
console.log(final);
if(!$('#btn1').is(':checked')){
console.log("没选中")
for(var j=0;j<final.length;j++){
if(final[j].score >=80 && final[j].score <100){
markerlayer.removeMarker(final[j]);
}
}
}else{
console.log("选中")
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
//jump to other html by layer1  problem???
function layerOpen(url){
var url = get_root+"/index/main?loadUrl="+url+"&hideType=1";
//        var index = layer1.open({
//            type: 2,
//            area: ['100%', '100%'],
//            skin:'jumpLayer',
//            content:url,
//            title : "",
//        });
//        layer1.full(index);
}
//打开对应的信息框
var infowin = null;
function openInfoWin(){
closeInfoWin();
var marker = this;
var lonlat = marker.getLonLat();
var size = new SuperMap.Size(0, 33);
var offset = new SuperMap.Pixel(11, -30);
var icon = new SuperMap.Icon("theme/images/cluster4.png", size, offset);
var contentHTML = "<div style='font-size:.8em; opacity: 0.8; overflow-y:hidden; color:black;'>";
contentHTML += "<div class='nameJump'>机构名称:<a onclick='layerOpen("+marker.code+")'>"+marker.name+"</a></div><div>机构地址:<a>"+marker.adress+"</a></div><div>机构负责人:<a>"+marker.respperson+"</a></div>";
contentHTML +="<div>联系电话:<a>"+marker.phone+"</a></div><div>传真:<a>88899900</a></div> </div>";

var popup = new SuperMap.Popup.FramedCloud("popwin",new SuperMap.LonLat(lonlat.lon,lonlat.lat),null,contentHTML,icon,true);
infowin = popup;
map.addPopup(popup);

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

</head>
</html>