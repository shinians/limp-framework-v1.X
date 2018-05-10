$(function(){
     $(".bi-item").hide();
     $(".bi-item").eq($(".bi-ul-slide .active").attr("data-to")).show() ;
     //点击翻页
     $(".bi-ul-slide li").click(function(){
         if(!$(this).hasClass("active")){
             $(this).addClass("active").siblings().removeClass("active");
         }
         $(".bi-item").hide()
 //        $(".bi-item").eq($(this).attr("data-to")).show() ;
         $(".bi-item").eq($(this).attr("data-to")).fadeIn(800);
 //       $(".bi-item").eq($(this).attr("data-to")).animate({marginRight:"1000"},500) ;

     })
    

})



/*
 (function ($) {
 $.fn.swBanner=function(options){
 var defaults={
 animateTime:500,
 delayTime:5000
 }
 var setting=$.extend({},defaults,options);

 return this.each(function(){
 $obj=$(this);
 var o=setting.animateTime;
 var d=setting.delayTime;
 var $oban=$obj.find(".banList li");

 console.log($oban)
 var _len=$oban.length;
 var $nav=$obj.find(".fomW a");
 var _index=0;
 var timer;
 //图片轮换
 function showImg(n){
 $oban.eq(n).addClass("active").siblings().removeClass("active");
 $nav.eq(n).addClass("current").siblings().removeClass("current");
 }
 //自动播放
 function player(){
 timer=setInterval(function(){
 var _index=$obj.find(".fomW").find("a.current").index();
 showImg((_index+1)%_len);
 },d)
 }
 //
 $nav.click(function(){
 if(!($oban.is(":animated"))){
 _index=$(this).index();
 showImg(_index);
 }
 });
 //
 $oban.hover(function(){
 clearInterval(timer);

 },function(){
 player();

 });
 player();
 });

 }
 })(jQuery);*/
