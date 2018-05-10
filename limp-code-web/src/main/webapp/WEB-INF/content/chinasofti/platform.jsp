<%@include file="/WEB-INF/common/taglibs.jsp" %>
<%@include file="/WEB-INF/content/chinasofti/common/head.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <title>智慧船检大数据平台</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- Le styles -->
    <link rel="stylesheet" href="${ctx}/plug/bootstrap-3.3.7-dist/css/bootstrap.min.css" >
    <link rel="stylesheet" href="${style}/css/main.css">
    <link rel="stylesheet" href="${ctx}/systemsite/ztree/css/zTreeStyle/zTreeStyle.css">
    <link rel="stylesheet" href="${ctx}/plug/layui/css/layui.css" >
    <link rel="stylesheet" href="${ctx}/plug/layui/css/zoomify.min.css" >

    <link rel="stylesheet" href="${ctx}/resources/style/chinasofti/css/surInformation.css">
    <link rel="stylesheet" href="${ctx}/resources/style/chinasofti/css/unifyStyle.css">
    <link rel="stylesheet" href="${style}/css/ship-time.css">


    <style>
        .yincang{
            display: none !important;
        }
        #nav_iframe{
            width:100%;
        }
        .container-fluid{
            padding-right: 0px;
            padding-left: 0px;
        }
        .navbar{
            border:none;
        }
        .dropdown-menu>li>a{
            color:#5fcbff;
        }
        
        .navbar>.container .navbar-brand, .navbar>.container-fluid .navbar-brand{
            margin-left:2px;
        }
        .dropdown-menu{
            top:50px;
        }
        .user{
            margin-top: 5px;
        }
        .dropdown-menu>li>a:focus, .dropdown-menu>li>a:hover{
            background-color:#1c569f;
            color:#fff;
        }
        .navbar-nav{
            float: right;
            margin-right: 30px;
        }
        /*==============2017.12.08 added by meng for breadcrumb's style===========*/
        .layui-breadcrumb a:hover{
            text-decoration: none;
        }
    </style>
    <link rel="stylesheet" href="${style}/css/gmdss-panel.css"/>
    <link rel="stylesheet" href="${ctx}/resources/style/css/panel-inspection.css">

</head>
<SCRIPT type="text/javascript">
    //    nav_show1
    var setting = {
        data: {
            key: {
                title:"t"
            },
            simpleData: {
                enable: true
            }
        },
        callback: {
            beforeClick: beforeClick,
            onClick: onClick
        }
    };
    function beforeClick(treeId, treeNode, clickFlag) {
        log.info("[beforeClick ]" + treeNode.name );
        return (treeNode.click != false);
    }
    /**
     *clickFlag===1: 普通选中;clickFlag===0:取消选中 ;追加选中
     * @param event
     * @param treeId
     * @param treeNode
     * @param clickFlag
     */
    function onClick(event, treeId, treeNode, clickFlag) {
        log.info( clickFlag + " ");
        log.info( treeNode );
        if(1 == clickFlag){
            log.info(main.menuData[treeNode.id]) ;
            SysMenu.initMenu(main.menuData[treeNode.id]);
        }
    }

</SCRIPT>
<style>
    .headTitle{
        font-size: 18px;
        color: #F0FF00;
        line-height: 37px;
        position: fixed;
        left: 270px;
        top: 6px;
        z-index: 99999;
    }
    .dropdown-menu{
        top:45px;
    }
    #toggle{
        cursor: pointer;
    }
    .glyphicon{
        font-size:16px;
        color:#62B6EC;
        font-weight: normal;
        top:6px;
    }
    .glyphicon:hover{
        color:#fff; 
    }
    #left{
        height:100%;
    }
</style>
<!--在初始加载时设置了body样式 style.css giftly.png-->
<body>
<!-- TOP 导航 最上行 -->
<header>
    <c:if test="${hideType == null}">
        <div class="container-fluid">
            <div class="dropdown">
                <nav class="navbar navbar-default navbar-fixed-top">
                    <div class="container-fluid">
                        <div class="navbar-header">
                            <button data-target="#bs-example-navbar-collapse-1" data-toggle="collapse" class="navbar-toggle" type="button">
                                <span class="entypo-menu"></span>
                            </button>
                            <a class="navbar-brand" href="#">
                                <img src="${ctx}/resources/style/images/juhui.png" id='logo' />
                                <p id='navText'>智慧船检IFVS系统</p>
                                <a id="toggle" class="active">
                                    <span class="glyphicon glyphicon-indent-right"></span>
                                </a>
                            </a>
                        </div>
                        <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                            <ul class="nav navbar-nav navbar-right">
                                <li>
                                    <a href="http://202.127.45.165/login" id='back'></a>
                                </li>
                            </ul>
                            <ul class="nav navbar-nav user">
                                <li class="dropdown">
                                    <img src="${ctx}/resources/style/images/test.jpg" class="img-circle" id='userImg'>
                                    <a id='userName' href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">${KEY_USER.usrName} <span class="caret"></span></a>
                                    <ul class="dropdown-menu">
                                        <li>
                                            <a href="#">修改密码</a>
                                        </li>
                                        <li>
                                            <a href="http://202.127.45.165/logout?service=http://202.127.45.165/login">退出</a><!--注销-->
                                        </li>
                                    </ul>
                                </li>
                            </ul>

                        </div>
                    </div>
                </nav>
            </div>
        </div>
    </c:if>
</header>
<!-- /END OF TOP NAVBAR -->

<!-- 菜单 MENU -->
<section style="margin-top:50px; height: 100%; width: 100%;">

    <p class="headTitle yincang" id="titleTxt"></p>

    <div id="content"  style="width:100%;">
        <c:if test="${hideType == null}">


            <div id='left'>
                <div id="panel">
                    <div class="leftsidebar_box">
                        <div class="side-bar" ></div>
                    </div>
                </div>
            </div>

        </c:if>
        <div id='right'>
            <div id="nav_intro"></div>
            <iframe id="nav_iframe" border="0"  frameborder="no" width="100%" scrolling = "yes" src="">

            </iframe>
        </div>
        <c:if test="${hideType == null}">

        <footer id="footer" class="navbar navbar-fixed-bottom" >
            <p>
                Copyright &copy; 2016-2017 智慧船检 - Powered By 中华人民共和国渔业船舶检验局 V0.1.02
            </p>
        </footer>

        </c:if>
    </div>
</section>

<!-- MAIN EFFECT -->
<script type="text/javascript" src="${ctx}/resources/script/js/jquery-3.2.1.min.js"></script>
<%--<script type="text/javascript" src="${script}/chinasofti/gis/iframeResizer.min.js"></script>--%>
<script type="text/javascript" src="${ctx}/systemsite/assets/js/load.js"></script>
<script type="text/javascript" src="${ctx}/resources/script/chinasofti/ent/stageMain.js"></script>
<script type="text/javascript" src="${ctx}/resources/script/chinasofti/ent/stageMenu.js"></script>
<script type="text/javascript" src="${ctx}/systemsite/ztree/js/jquery.ztree.all.js"></script>
<script type="text/javascript" src="${bt}/js/bootstrap.min.js"></script>
<%--<script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.min.js"></script>--%>
<%--<script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.zh-CN.js"></script>--%>
<script type="text/javascript" src='${echarts}/echarts.min.js'></script>
<script type="text/javascript" src='${script}/js/template-web.js'></script>
<script type="text/javascript" src='${ctx}/plug/layui/lay/dest/layui.all.js'></script>
<script type="text/javascript" src='${ctx}/resources/script/jquery.easing.min.js'></script>
<script type="text/javascript" src='${ctx}/plug/layui/lay/dest/jquery.mousewheel.js'></script>

<script type="text/javascript">

    //$('#nav_iframe').iFrameResize([{log: true,warningTimeout : 100000000000}]);

    var winHeight = window.screen.availHeight - 180;


    $('#nav_iframe').css({
        height : winHeight + 1,
        overflowY : 'scroll'
    })


    main.menuData=${KEY_MENU_JSON};
    function dealNavA(that) {
        window.location.href=$(that).attr("data-url");
        $(window.parent.document).find(".layui-layer-title").html($(that).attr("data-name"));
        sessionStorage.removeItem("keyUrl");
        sessionStorage.removeItem("keyName");
    }
   
    var loadUrl = '${loadUrl}';
    //设定mainpanel宽度，减去菜单宽度215
    $(document).ready(function() {

        // var leftHeight = $("#content").height();
        //
        // $('#panel').css({
        //     "height" : leftHeight
        // })

        $('#left #panel').css({
            'height' : '87%'
        })


        $('.dropdown-toggle').dropdown();

        $('#toggle').on('click',function(){
            if($(this).hasClass('active')){
                $(this).removeClass('active');
                $('#left').animate({ width:0 }, 100,"linear");
                $('#right').css({marginLeft:0});
            }else {
                $(this).addClass('active')
                $('#left').animate({ width:215 }, 100,"linear");
                $('#right').css({marginLeft:215});
            }
        });
        var hideType = '${hideType}';
        //console.log(hideType);
        if(hideType){
            $('#toggle').removeClass('active');
            $('#right').css({marginLeft:0});
        }
      

    })
    function addBread(urlarr,namearr){
       // console.log(urlarr);
      if(!system.isBlank(urlarr)){
           if(urlarr.length==1){
               var urlDatarr= urlarr;
               var nameDatarr=namearr;
               $("#bread").append("<a data-name='"+nameDatarr[0]+"' data-url='"+urlDatarr[0]+"' class='testClass' onclick='dealNavA(this)' href='javascript:void(0);'>"+nameDatarr[0]+"</a>");
           }else{
               var urlDatarr= urlarr.split(",");
               var nameDatarr=namearr.split(",");
               for(var i in urlDatarr){
                   $("#bread").append("<a data-name='"+nameDatarr[i]+"' title='"+urlDatarr[i]+"' data-url='"+urlDatarr[i]+"' class='testClass' onclick='dealNavA(this)' href='javascript:void(0);'>"+nameDatarr[i]+"</a>");

             }
           }
      }

    }
    var nameData=[];
    var urlData=[];


    function crossLoad (firUrl,id,name){
        var url = get_root+"/index/main?loadUrl="+id+"&hideType=1";
        console.log(url)
        var index01 = parent.layer.getFrameIndex(window.name); //对应页面id
        var iframeName = '#layui-layer-iframe'+index01;   //打开页面的iframe  的id
//        console.log('---------------------------')
//        console.log($(window.parent.document).find(iframeName).attr("src"))
//
//        console.log(firUrl);
//        console.log('---------------------------')
        urlData.push(firUrl);
        nameData.push($(window.parent.document).find(".layui-layer-title").html());

        $(window.parent.document).find(iframeName).attr("src", url);
        $(window.parent.document).find(".layui-layer-title").html(name);
        urlData.push($(window.parent.document).find(iframeName).attr("src"));
        nameData.push($(window.parent.document).find(".layui-layer-title").html());

        sessionStorage.setItem("keyUrl",urlData.join(","));
        sessionStorage.setItem("keyName",nameData.join(","));
    }

    function setTitleName(str){
        var ele = $("#titleTxt");
        ele.html("");
        ele.html(str);
        $('#titleTxt').addClass('yincang');
        $(window).scroll(function(even){
            var dis = $(window).scrollTop() - $('.navbar-fixed-top').height();

            var eleHeight = $('.headerTxt').height();

            if(dis>eleHeight){
                $('#titleTxt').removeClass('yincang');
            }else if(dis < eleHeight   ){
                $('#titleTxt').addClass('yincang');
            }
        })      
    }
</script>
</body>
</html>
