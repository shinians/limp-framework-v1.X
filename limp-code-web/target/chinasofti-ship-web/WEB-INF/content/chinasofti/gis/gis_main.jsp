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
    <link rel="stylesheet" href="${ctx}/plug/layui/css/layui.css" >
    <link rel="stylesheet" href="${style}/css/system-construction.css">
    <script type="text/javascript" src="${script}/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="${supermap}/libs/SuperMap.Include.js"></script>
    <script type="text/javascript" src="${echarts}/echarts.min.js"></script>
    <script type="text/javascript" src="${layer}/lay/dest/layui.all.js"></script>
    <%--统一样式表--%>
    <script type="text/javascript" src="${script}/system.js" ></script>
    <script type="text/javascript" src="${script}/chinasofti/gis/provinceCode.js"></script>
    <script type="text/javascript" src='${script}/js/template-web.js'></script>
    <script type="text/javascript" src="${script}/chinasofti/gis/translate.js"></script>
    <script type="text/javascript" src="${script}/chinasofti/gis/iframeResizer.contentWindow.min.js"></script>

    <style type="text/css">
        .layui-tab-content{
            padding:0px;
        }
        .layui-tab-content  iframe{
            width:100%;
        }
        .layui-tab-title li{
            border-right:1px solid #1D43B0;
            line-height:55px;
        }
        .layui-tab-title{
            height:55px;
            box-shadow: 0px 0px 10px #000;
        }
        .layui-tab-title li{
            padding: 0px 20px;
        }
        .nationImg{
            height:45px;
            margin-right:15px;
        }
        .layui-tab-title .layui-this:after{
            height: 55px;
        }
        /*下箭头*/
        @-moz-keyframes bounce {
            0%, 20%, 50%, 80%, 100% {
                -moz-transform: translateY(0);
                transform: translateY(0);
            }
            40% {
                -moz-transform: translateY(10px);
                transform: translateY(10px);
            }
            60% {
                -moz-transform: translateY(5px);
                transform: translateY(5px);
            }
        }
        @-webkit-keyframes bounce {
            0%, 20%, 50%, 80%, 100% {
                -webkit-transform: translateY(0);
                transform: translateY(0);
            }
            40% {
                -webkit-transform: translateY(10px);
                transform: translateY(10px);
            }
            60% {
                -webkit-transform: translateY(5px);
                transform: translateY(5px);
            }
        }
        @keyframes bounce {
            0%, 20%, 50%, 80%, 100% {
                -moz-transform: translateY(0);
                -ms-transform: translateY(0);
                -webkit-transform: translateY(0);
                transform: translateY(0);
            }
            40% {
                -moz-transform: translateY(10px);
                -ms-transform: translateY(10px);
                -webkit-transform: translateY(10px);
                transform: translateY(10px);
            }
            60% {
                -moz-transform: translateY(5px);
                -ms-transform: translateY(5px);
                -webkit-transform: translateY(5px);
                transform: translateY(5px);
            }
        }

        @-moz-keyframes debounce{
            0%,20%, 50%, 80%, 100% {
                -moz-transform: translateY(0) rotate(180deg);
                -ms-transform: translateY(0) rotate(180deg);
                -webkit-transform: translateY(0) rotate(180deg);
                transform: translateY(0) rotate(180deg);
            }
            40% {
                -moz-transform: translateY(10px) rotate(180deg);
                -ms-transform: translateY(10px) rotate(180deg);
                -webkit-transform: translateY(10px) rotate(180deg);
                transform: translateY(10px) rotate(180deg);
            }
            60% {
                -moz-transform: translateY(5px) rotate(180deg);
                -ms-transform: translateY(5px) rotate(180deg);
                -webkit-transform: translateY(5px) rotate(180deg);
                transform: translateY(5px) rotate(180deg);
            }
        }

        @-webkit-keyframes debounce{
            0%,20%, 50%, 80%, 100% {
                -moz-transform: translateY(0) rotate(180deg);
                -ms-transform: translateY(0) rotate(180deg);
                -webkit-transform: translateY(0) rotate(180deg);
                transform: translateY(0) rotate(180deg);
            }
            40% {
                -moz-transform: translateY(10px) rotate(180deg);
                -ms-transform: translateY(10px) rotate(180deg);
                -webkit-transform: translateY(10px) rotate(180deg);
                transform: translateY(10px) rotate(180deg);
            }
            60% {
                -moz-transform: translateY(5px) rotate(180deg);
                -ms-transform: translateY(5px) rotate(180deg);
                -webkit-transform: translateY(5px) rotate(180deg);
                transform: translateY(5px) rotate(180deg);
            }
        }

        @keyframes debounce{
            0%,20%, 50%, 80%, 100% {
                -moz-transform: translateY(0) rotate(180deg);
                -ms-transform: translateY(0) rotate(180deg);
                -webkit-transform: translateY(0) rotate(180deg);
                transform: translateY(0) rotate(180deg);
            }
            40% {
                -moz-transform: translateY(10px) rotate(180deg);
                -ms-transform: translateY(10px) rotate(180deg);
                -webkit-transform: translateY(10px) rotate(180deg);
                transform: translateY(10px) rotate(180deg);
            }
            60% {
                -moz-transform: translateY(5px) rotate(180deg);
                -ms-transform: translateY(5px) rotate(180deg);
                -webkit-transform: translateY(5px) rotate(180deg);
                transform: translateY(5px) rotate(180deg);
            }
        }


        .shipDrop{
            position: absolute;
            left: 50%;
            width: 20px;
            height: 20px;
            cursor: pointer;

        }
        .bounce {
            -moz-animation: bounce 2s infinite;
            -webkit-animation: bounce 2s infinite;
            animation: bounce 2s infinite;
        }
        .deBounce{
            -moz-animation: debounce 2s infinite;
            -webkit-animation: debounce 2s infinite;
            animation: debounce 2s infinite;
        }
        .shipTitle{
            position: absolute;
            top: -55px;
        }


    </style>
</head>
<body onload="init()" >
<div class="layui-tab layui-tab-card" lay-filter="txFTab" id="txTab">
    <script id="tabContent" type="text/template">
            <ul class="layui-tab-title shipTitle" style="width:100%;">
                <%--<img class="nationImg" src="${supermap}/theme/images/nation.png">--%>
                <? for(var i = 0 ;i<tabUrl.length;i++)  {  ?>
                <? if(i == 0) { ?>
                <li class="layui-this">  <?= tabUrl[i].name ?>  </li>
                <? }else{ ?>
                <li>  <?= tabUrl[i].name ?>  </li>
                <? } ?>
                <? } ?>
            </ul>
        <img class="shipDrop bounce arr" src="${supermap}/theme/images/shipDrop.png">
        <div class="layui-tab-content">
            <iframe class="layui-tab-item layui-show" id="ifm" src="" frameborder="0"></iframe>
        </div>
    </script>
</div>
</body>
<script>
    // $(window).resize(function(){
    //     var height = window.screen.availHeight;
    //     console.log(height);
    // })
    function init(){
        var orgBlity = new OrgBlity();
        orgBlity.init();
    }

    function OrgBlity(options){
        var tabUrl = ${urlList};
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

                var content = {
                    tabUrl : tabUrl
                }

                var str = template('tabContent',content)

                $('#txTab').html(str);

                var height = window.screen.availHeight - 170;
                console.log(height);
                //
                // console.log(height);
                
                $('#ifm').height(height);

                $('#ifm').attr('src',tabUrl[0].url);

                $('.layui-tab-title li').on('click',function(){

                    var title = $(this).html();
                    title = $.trim(title);
                    for(var i = 0;i<tabUrl.length;i++){
                        if(String(title) == String(tabUrl[i].name)){
                            $('#ifm').attr('src',tabUrl[i].url)

                            // if($('.shipDrop').hasClass('deBounce')){
                            //     setTimeout(function(){
                            //         var ele = $('#ifm').contents().find(".mainTitle");
                            //         if($(".shipDrop").hasClass("deBounce")){
                            //             if(ele){
                            //                 $(ele).animate(
                            //                     {
                            //                         top : "61px"
                            //                     }
                            //                 )
                            //             }
                            //         }
                            //
                            //     },1500);
                            // }

                        }
                    }
                })

                that.initHide();
            },
            test : function(){

            },
            initHide : function(){
                $('.shipDrop').on('click',function(){

                    if($(this).hasClass('bounce')){
                        $(this).css({
                            top : "55px"
                        })
                        $('.shipTitle').css({
                            top : '0'
                        })

                        $(this).addClass('deBounce');
                        $(this).removeClass('bounce');

                        var ele = $('#ifm').contents().find(".layui-nav");

                        $(ele).animate(
                            {
                                top : "61px"
                            }
                        )
                    }else if($(this).hasClass("deBounce")){
                        $(this).css({
                            top : "0px"
                        })
                        $('.shipTitle').css({
                            top : '-55px'
                        })
                        $(this).removeClass('deBounce');
                        $(this).addClass('bounce');

                        var ele = $('#ifm').contents().find(".layui-nav");

                        $(ele).animate(
                            {
                                top : "2px"
                            }
                        )


                    }

                })
            }
        }
        return new OrgFun(options);
    }


</script>
</body>
</html>