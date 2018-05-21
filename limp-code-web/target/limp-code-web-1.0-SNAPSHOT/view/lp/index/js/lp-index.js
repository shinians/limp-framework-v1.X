$(function(){
	//tip 的title提示信息
	$("[data-toggle='tooltip']").tooltip();
	//星星
	lpIndex.jumpXin();
	//右下角Bar
	lpIndex.fixBar();
	//初始换 数据
	if(system.isBlank(get_root)){
		get_root="";
	}
	lpIndex.initLPInfo();

	$("#lp-down").click(function(){
		lpIndex.down();
	})

})
//LP首页
var lpIndex={
	lpDownName:"",
	lpDownId:"",
	down:function(){
		window.open(get_root+"/system/util/down?fileName="+lpIndex.lpDownName);
		system.post(get_root+"/share/updateLPNum",{id:lpIndex.lpDownId},function(data){
			if(data.code=="200"){
				$("#F_LP_DOWNNUM").html(parseInt($("#F_LP_DOWNNUM").text())+1);
			}

		})

	},
	initLPInfo:function(){

	},
	//右下角Bar
	fixBar:function(){
		layui.use(['util', 'laydate', 'layer'], function(){
			var util = layui.util
				,laydate = layui.laydate
				,layer = layui.layer;
			//固定块
			util.fixbar({
				bar2: true,
				bar1: "<span id='wchart' title='老司机赶快上车...' class='glyphicon glyphicon-qrcode'></span>"
//						你可以通过重置bar的位置，比如 css: {right: 100, bottom: 100}
				,css: {right: 50, bottom: 30}
//						自定义区块背景色
				,bgcolor: "rgba(35, 86, 87,.5)"
//						点击bar的回调，函数返回一个type参数，用于区分bar类型。支持的类型有：bar1、bar2、top
				,click: function(type){
					if(type === 'bar1'){
						var msg='<div id="bottom-qrcode"  style="display: block;">' +
							' <h4>微信关注</h4>' +
							' <div class="panel-body"><img alt="微信关注"  class="w-chart" ></div>' +
							' </div>';
						layer.tips(msg, '#wchart', {
							tips: 1,
							fixed: true,
							time:8000
						});
					} else if(type === 'bar2') {

					/*	var layW=layer.open({
								title:'<span class="modal-title-logo"><span style="color: #f8bb2b" class="entypo-plus-circled"></span></span>新增地区码表',
								type: 2,
								skin: 'layui-layer-lan',
								area: ['580px','338px'],
								content:"https://mp.weixin.qq.com/s/CJR_I97edwZu6rIF5yGqmQ"
							});
						layer.full(layW);*/
						//LP由来.
						window.open("https://mp.weixin.qq.com/s/CJR_I97edwZu6rIF5yGqmQ");
					}
				}
			});
		})
	},
	/**
	 * 跳动的星星
	 */
	jumpXin:function(){
		//星星跳动
		var interval_1 = setInterval("lpJP1()",900);
		var interval_2 = setInterval("lpJP2()",500);
		var interval_3 = setInterval("lpJP3()",800);
	}

}
///*********全局函数******************************
function lpJP1(){
	$(".lp-xin1").animate({
			opacity:"1"
		},900
		,function(){
			$(".lp-xin1").animate({
				opacity:"0.1"},900);
		});
}
function lpJP2(){
	$(".lp-xin2").animate({
			opacity:"1"
		},500
		,function(){
			$(".lp-xin2").animate({
				opacity:"0.1"},500);
		});
}
function lpJP3(){
	$(".lp-xin3").animate({
			opacity:"1"
		},500
		,function(){
			$(".lp-xin3").animate({
				opacity:"0.1"},500);
		});
}