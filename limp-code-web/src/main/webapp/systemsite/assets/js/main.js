//Sliding Effect Control
var systemPre=get_root+"/systemsite/assets";
head.js(systemPre+"/js/skin-select/jquery.cookie.js");
head.js(systemPre+"/js/skin-select/skin-select.js");


//NEWS STICKER
head.js(systemPre+"/js/newsticker/jquery.newsTicker.js", function() {

    var nt_title = $('#nt-title').newsTicker({
        row_height: 18,
        max_rows: 1,
        duration: 5000,
        pauseOnHover: 0
    });


});

//-------------------------------------------------------------


////Acordion and Sliding menu  todo 参照 插件编写规则


////Right Sliding menu

//head.js(systemPre+"/js/slidebars/slidebars.min.js", "http://cdnjs.cloudflare.com/ajax/libs/jquery-easing/1.3/jquery.easing.min.js", function() {
head.js(systemPre+"/js/slidebars/slidebars.min.js", systemPre+"/js/jquery.easing.min.js", function() {

    $(document).ready(function() {
        var mySlidebars = new $.slidebars();

        $('.toggle-left').on('click', function() {
            mySlidebars.toggle('right');
        });
    });
});

//-------------------------------------------------------------

//SEARCH MENU
head.js(systemPre+"/js/search/jquery.quicksearch.js", function() {

    $('input.id_search').quicksearch('#menu-showhide li, .menu-left-nest li');



});
//-------------------------------------------------------------



//EASY PIE CHART
head.js(systemPre+"/js/gage/jquery.easypiechart.min.js", function() {

    $(function() {


        $('.chart').easyPieChart({
            easing: 'easeOutBounce',
            trackColor: '#ffffff',
            scaleColor: '#ffffff',
            barColor: '#FF0064',
            onStep: function(from, to, percent) {
                $(this.el).find('.percent').text(Math.round(percent));
            }
        });
        var chart = window.chart = $('.chart').data('easyPieChart');
        $('.js_update').on('click', function() {
            chart.update(Math.random() * 100);
        });

        $('.speed-car').easyPieChart({
            easing: 'easeOutBounce',
            trackColor: 'rgba(0,0,0,0.3)',
            scaleColor: 'transparent',
            barColor: '#0085DF',

            lineWidth: 8,
            onStep: function(from, to, percent) {
                $(this.el).find('.percent2').text(Math.round(percent));
            }
        });
        var chart = window.chart = $('.chart2').data('easyPieChart');
        $('.js_update').on('click', function() {
            chart.update(Math.random() * 100);
        });
        $('.overall').easyPieChart({
            easing: 'easeOutBounce',
            trackColor: 'rgba(0,0,0,0.3)',
            scaleColor: '#323A45',
            lineWidth: 35,
            lineCap: 'butt',
            barColor: '#FFB900',
            onStep: function(from, to, percent) {
                $(this.el).find('.percent3').text(Math.round(percent));
            }
        });
    });

});
//-------------------------------------------------------------

//TOOL TIP

head.js(systemPre+"/js/tip/jquery.tooltipster.js", function() {

    $('.tooltip-tip-x').tooltipster({
        position: 'right'

    });

    $('.tooltip-tip').tooltipster({
        position: 'right',
        animation: 'slide',
        theme: '.tooltipster-shadow',
        delay: 1,
        offsetX: '-12px',
        onlyOne: true

    });
    $('.tooltip-tip2').tooltipster({
        position: 'right',
        animation: 'slide',
        offsetX: '-12px',
        theme: '.tooltipster-shadow',
        onlyOne: true

    });
    $('.tooltip-top').tooltipster({
        position: 'top'
    });
    $('.tooltip-right').tooltipster({
        position: 'right'
    });
    $('.tooltip-left').tooltipster({
        position: 'left'
    });
    $('.tooltip-bottom').tooltipster({
        position: 'bottom'
    });
    $('.tooltip-reload').tooltipster({
        position: 'right',
        theme: '.tooltipster-white',
        animation: 'fade'
    });
    $('.tooltip-fullscreen').tooltipster({
        position: 'left',
        theme: '.tooltipster-white',
        animation: 'fade'
    });
    //For icon tooltip



});
//-------------------------------------------------------------

//NICE SCROLL

head.js(systemPre+"/js/nano/jquery.nanoscroller.js", function() {

    $(".nano").nanoScroller({
        //stop: true
        scroll: 'top',
        scrollTop: 0,
        sliderMinHeight: 40,
        preventPageScrolling: true
        //alwaysVisible: false

    });

});
//-------------------------------------------------------------






//-------------------------------------------------------------
//PAGE LOADER
/*
head.js(systemPre+"/js/pace/pace.js", function() {

    paceOptions = {
        ajax: false, // disabled
        document: false, // disabled
        eventLag: false, // disabled
        elements: {
            selectors: ['.my-page']
        }
    };

});
*/

//-------------------------------------------------------------

//SPARKLINE CHART
head.js(systemPre+"/js/chart/jquery.sparkline.js", function() {

    $(function() {
        $('.inlinebar').sparkline('html', {
            type: 'bar',
            barWidth: '8px',
            height: '30px',
            barSpacing: '2px',
            barColor: '#A8BDCF'
        });
        $('.linebar').sparkline('html', {
            type: 'bar',
            barWidth: '5px',
            height: '30px',
            barSpacing: '2px',
            barColor: '#44BBC1'
        });


    });

    $(function() {
        var sparklineLogin = function() {
            $('#sparkline').sparkline(
                [5, 6, 7, 9, 9, 5, 3, 2, 2, 4, 6, 7], {
                    type: 'line',
                    width: '100%',
                    height: '25',
                    lineColor: '#ffffff',
                    fillColor: '#0DB8DF',
                    lineWidth: 1,
                    spotColor: '#ffffff',
                    minSpotColor: '#ffffff',
                    maxSpotColor: '#ffffff',
                    highlightSpotColor: '#ffffff',
                    highlightLineColor: '#ffffff'
                }
            );
        }
        var sparkResize;
        $(window).resize(function(e) {
            clearTimeout(sparkResize);
            sparkResize = setTimeout(sparklineLogin, 500);
        });
        sparklineLogin();
    });


});
$(function(){
    /*************系统初始化*********************************/
    //更改内容页的最小高度值
    $("#nav_content").css("min-height",system.getclienMaxHeight()+"px");

    //设置皮肤样式
    //$("body").attr("style","background: url('"+main.skin+"') no-repeat top center fixed;")
  //  $("body").attr("style","background: url('"+main.skin+"') repeat;")

   /* 左侧菜单*/
    menu.getLeftMenus(0);



    //////////解析url样式控制
    $("#nav_2 li").click(function(){
        var val=$(this).attr("value");
        $(this).addClass("active").siblings().removeClass("active");
        $(".nav_2").hide();
        $("#nav_2_"+val).show();
    })
   //////////消息样式控制
    $("#nav_3 li").click(function(){
        var val=$(this).attr("value");
        $(this).addClass("active").siblings().removeClass("active");
        $(".nav_3").hide();
        $("#nav_3_"+val).show();
    })

    //加入：事件监听
    main.listenEve();

})
var main={
    service:"",//跳转到指定地址 如：http://127.0.0.1/system/main?service=http://www.baidu.com&type=2   1为div加载  2为iframe加载
    type:"",//跳转类型 ：1为div加载  2为iframe加载
    hide:"",//隐藏类型 ：1为隐藏传递过来的参数，2为隐藏左侧
    skin:"assets/img/bg3.png",
    menuData:"", //map{id,menu}
    permissionData:{}, //map{id,permission}   元素权限数据
    userMap:{},//用户map 用户-信息
    roleMap:{},//角色map 角色信息
    roleMenuMap:{},//角色-菜单权限配置
    keyKVMap:{},//key:values
    rolePerMap:{},//角色-元素权限配置
    userMenuMap:{}, //用户-菜单权限配置
    userPermMap:{},//用户-元素权限配合
    orderMap:{},//用户订单
    /**
     * 提示信息
     * @param msg
     * type  成功 1 失败 0 网络异常-1
     */
    tip:function(msg,type){
        //插件弹框|利用插件做提示
        main.tips(msg,type);
        return;
        if(!system.isPhone()){   //电脑弹框 //
            try{
                $("#tip-win-info").html('');
                $("#open-tip-form").click();
                $("#tip-win-info").html(msg) ;
            } catch (e){
                $("#tip-win-info").html(msg);
            }
            return;
        }else{  //手机版提示信息
            var time=main.getCurrentDate(" (hh:mm:ss)") ;
            $("#utip_alert").hide();
            $("#utip_alert2").hide();//先隐藏
            if("1"==type||1==type){ //成功提示
                $("#utip2").html(msg+"   "+time);
                $("#utip_alert2").show(300);
            }else{  //失败提示
                $("#utip").html(msg+"  "+time);
                $("#utip_alert").show(300);
            }
            setTimeout(function(){
                main.hideTip();
            },8000)

        }


    },
    hideTip:function(){
        $("#utip_alert").hide(300);
        $("#utip_alert2").hide(300);
    },
    /**
     *
     * 提示信息 ，插件
     * @param msg
     * d.pnotify.defaults={title:false,title_escape:false,text:false,text_escape:false,styling:"bootstrap",addclass:"",cornerclass:"",nonblock:false,nonblock_opacity:0.2,history:true,width:"300px",min_height:"16px",type:"notice",icon:true,animation:"fade",animate_speed:"slow",opacity:1,shadow:true,closer:true,closer_hover:true,sticker:true,sticker_hover:true,hide:true,delay:8E3,mouse_reset:true,remove:true,insert_brs:true,stack:{dir1:"down",
     */
    tips:function(msg,type){

        //定义提示类型
        var typeMap={"1":'success',"0":'',"3":"error"};
        //定义提示前缀
        var titleMap={"1":'',"0":'警告: ',"2":''};
        new PNotify({
            title: titleMap[type]+msg,
            delay:2000,
            //text: msg,
            type: typeMap[type],
            hide: true
            ,buttons:{
                closer:true,
                closer_hover:false,
                sticker_hover:true,
            }
        });

    },

    /**
     * 提示信息
     * @param id 提示id
     * @param tips 提示信息
     */
    tipSlow:function(id,tips){
        log.info(tips);
      setTimeout(function(){
          $("#"+id).html(tips);
          setTimeout(function(){
              $("#"+id).html("...");
          },5000);
      },1000);
    } ,
    /**
     * 关闭弹出框
     */
    closeOpenWin:function(){
        try{
            $(".modal-header .close").click();
        }catch (ex){
            console.log(ex)
        }
    } ,



    /**
     * 根据时间格式字符串获得当前时间
     * @param pattern  yyyy年MM月dd日 hh时mm分ss秒
     * @return {*} 时间字符串
     */
   getCurrentDate:function(pattern){
       var now=new Date();
       var str=pattern;
       var month=parseInt(now.getMonth().toString())+1;
       str=str.replace(/yyyy|YYYY/,now.getFullYear())   ;//年
       str=str.replace(/MM/,month>9?month.toString():"0"+month.toString());//月
       str=str.replace(/M/g,month.toString());//月
       str=str.replace(/dd|DD/,now.getDate()>9?now.getDate().toString():"0"+now.getDate().toString());//月
       str=str.replace(/D|d/g,now.getDate().toString());//日
       str=str.replace(/hh|HH/,now.getHours()>9?now.getHours().toString():"0"+now.getHours().toString());//时
       str=str.replace(/h|H/g,now.getHours().toString());//时
       str=str.replace(/mm/,now.getMinutes()>9?now.getMinutes().toString():"0"+now.getMinutes().toString());//fen
       str=str.replace(/m/g,now.getMinutes().toString());//fen
        str=str.replace(/ss/,now.getSeconds()>9?now.getSeconds().toString():"0"+now.getSeconds().toString());//miao
       str=str.replace(/s/g,now.getSeconds().toString());//miao
       return str;
    },
    /**
     * 全屏/退出操作
     */
    fullScreen:function(){
        var docElm = document.documentElement;
        console.log(docElm);
        //W3C
        if (docElm.requestFullscreen) {
            docElm.requestFullscreen();
        }
        //FireFox
        else if (docElm.mozRequestFullScreen) {
            docElm.mozRequestFullScreen();
        }
        //Chrome等
        else if (docElm.webkitRequestFullScreen) {
            docElm.webkitRequestFullScreen();
        }
        //IE11
        else if (elem.msRequestFullscreen) {
            elem.msRequestFullscreen();
        }
        ////---退出操作-------///
        if (document.exitFullscreen) {
            document.exitFullscreen();
        }
        else if (document.mozCancelFullScreen) {
            document.mozCancelFullScreen();
        }
        else if (document.webkitCancelFullScreen) {
            document.webkitCancelFullScreen();
        }
        else if (document.msExitFullscreen) {
            document.msExitFullscreen();
        }

    },
    //初始化第一次进入系统首页
    initFirstEnter: function () {
        if(!system.isBlank(main.hide)){
            //隐藏所有的参数
            var arrCode=main.hide.split(",");
            if(arrCode.indexOf("1")>-1){
                history.replaceState("隐藏所有参数", "service and type", "main" + "");
            }
            //收起左侧导航
            if(arrCode.indexOf("2")>-1){
                setTimeout(function(){
                    $("#toggle").click();
                },5000)
            }

        }
    },
    /**
     * 监听事件，监听类，数据加载完初始化
     */
    listenEve:function(){
        //跳转到指定链接
         menu.goService();

        //初始化第一次加载参数
         main.initFirstEnter();
        /**
         * 全屏
         */
        $(document).delegate(".lp-screen","click",function(){
            main.fullScreen();
        })
        /**
         * 刷新权限配置
         */
        $(document).delegate("#update-auth","click",function(){
            system.post(get_root+system.action["initSessionAuth"]["url"],{},function(data){
                window.location.reload();
                main.tip(data.msg,"1");
            },false)
        })

        $(document).delegate(".topnav a","click",function(){

            $(".topnav a").removeClass('checked');
            $(this).addClass('checked');//.parent().siblings().children().removeClass('checked');
        })
    }

}
