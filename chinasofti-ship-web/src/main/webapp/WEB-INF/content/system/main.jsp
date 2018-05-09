<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/sys_head.jsp" %>
<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <%--动态加载css样式--%>
    <link rel="stylesheet" href="${system}/css/loader-style.css">
    <link rel="stylesheet" href="${system}/css/bootstrap.css">
    <link rel="stylesheet" href="${plug}/css/system.css">
    <link rel="stylesheet" href="${system}/css/mail.css">
    <!-- 整体菜单控制 -->
     <!--视频播放-->
    <link rel="stylesheet" href="${system}/css/social.css">
    <%--自定义样式文件：注意，个性话样式请在此文件书写--%>
    <link rel="stylesheet" href="${ctx}/resources/properties/sys_user_main.css">
    <!--表格兼容性-->
    <link href="${system}/js/stackable/stacktable.css" rel="stylesheet">
    <link href="${system}/js/stackable/responsive-table.css" rel="stylesheet">

    <link rel="stylesheet" href="${system}/css/style.css">

    <%--引入layer弹框组件--%>
    <script src="${plug}/layer-v3.1.1/layer/layer.js" type="text/javascript"></script>
    <script type="text/javascript" src="${plug}/vue-2.5.6/vue.js"></script>

</head>
 <!--在初始加载时设置了body样式 style.css giftly.png-->
<%--<body style="background: url('${system}/img/bg3.png') repeat;background-repeat: no-repeat; background-attachment: fixed; background-position: center 0; background-size: cover;">--%>
<body style="background:#193792" id="lpbody">

    <!-- Preloader -->
    <div id="preloader">
        <div id="status">&nbsp;</div>
    </div>
    <!-- TOP 导航 最上行 -->
    <nav role="navigation" class="navbar navbar-static-top" style="margin-left: 180px">
        <div class="container-fluid" >
            <!-- top_1显示隐藏切换 -->
            <div class="navbar-header">
                <button data-target="#bs-example-navbar-collapse-1" data-toggle="collapse" class="navbar-toggle" type="button">
                    <span class="entypo-menu"></span>
                </button>
                <%--手机屏幕点击左侧菜单--%>
                <button class="navbar-toggle toggle-menu-mobile toggle-left" type="button">
                    <span class="entypo-list-add"></span>
                </button>
                <div id="logo-mobile" class="visible-xs">
                   <h1>智慧船检</h1>
                </div>
            </div>
            <!-- top_1显示隐藏切换 -->
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div id="bs-example-navbar-collapse-1" class="collapse navbar-collapse">
                     <%--上部右侧侧部分--%>
                <ul style="margin-right:15px;margin-top: 15px;" class="nav navbar-nav navbar-right">
                    <!--用户头像-->
                    <li  style="margin-left: 10px;">
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            ${KEY_USER.usrName} <b class="caret"></b>

                        </a>
                        <img alt="" style="margin-top: 0px;" class="admin-pic img-circle" src="${ctx}/systemsite/assets/img/tx.png">
                        <ul style="margin-top:14px;" role="menu" class="dropdown-setting dropdown-menu">
                            <li>
                                <a href="javascript:void(0)" title="更新菜单、元素权限配置" id="update-auth">
                                    <span class="entypo-arrows-ccw"></span>&#160;&#160;更新权限</a>
                            </li>
                            <li>
                                <a href="#">
                                    <span class="entypo-vcard"></span>&#160;&#160;账户设置</a>
                            </li>

                            <li>
                                <a href="javascript:void(0)" onclick="cons.sysHref(cons.sysWorkDeskLogoutUrl)">
                                    <span class="entypo-logout"></span>&#160;&#160;退出</a>
                            </li>
                            <li class="divider"></li>
                            <li>
                                <a href="#">
                                    <span class="entypo-lifebuoy"></span>&#160;&#160;帮助</a>
                            </li>

                        </ul>
                    </li>
                    <li class="home" title="工作桌面" style="cursor: pointer" onclick="cons.sysHref(cons.sysWorkDeskUrl)">
                    </li>
                    <li class="msg" title="信息">
                        <div class="msg-tip">23</div>
                    </li>
                    <li class="icon icon-move lp-screen" title="全屏"></li>

                    <!--皮肤设置-->

                  <%--  <li>
                        <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                            <span class="icon-gear"></span>&#160;&#160;设置</a>
                        <ul role="menu" class="dropdown-setting dropdown-menu">

                            <li class="theme-bg">
                                <div id="button-bg"></div>
                                <div id="button-bg2"></div>
                                <div id="button-bg3"></div>
                                <div id="button-bg5"></div>
                                <div id="button-bg6"></div>
                                <div id="button-bg7"></div>
                                <div id="button-bg8"></div>
                                <div id="button-bg9"></div>
                                <div id="button-bg10"></div>
                                <div id="button-bg11"></div>
                                <div id="button-bg12"></div>
                                <div id="button-bg13"></div>
                            </li>
                        </ul>
                    </li>
                    <li class="hidden-xs">
                       <a class="toggle-left" href="#">
                            <span style="font-size:20px;" class="entypo-list-add"></span>
                        </a>
                    </li>--%>
                </ul>

            </div>
            <!-- /.navbar-collapse -->
        </div>
        <!-- /.container-fluid -->
    </nav>
    <!-- /END OF TOP NAVBAR -->
    <!-- 菜单 MENU -->
    <div id="skin-select">
       <!--log描述左上侧【1】-->
       <div id="logo">

         <h1> <img src="${ctx}/resources/style/images/juhui.png" class="logo-icon">&nbsp;智慧船检<%--<span></span>--%></h1>
        </div>
         <!--切换缩进_伸展【2】-->
        <a id="toggle">
            <span class="entypo-menu"></span>
        </a>

       <!--左侧菜单部分【4】-->
       <div class="skin-part">
            <div id="tree-wrap">
                <div class="side-bar" >
                <!--菜单模块UL【4_1】-->

                </div>
            </div>
        </div>
    </div>
    <!-- END OF SIDE MENU -->
    <!--  内容部分 【content_part】PAPER WRAP -->
    <div class="wrap-fluid"style="width: auto; margin-left: 180px;">
        <!--内容区域-->
        <div class="container-fluid paper-wrap1 bevel tlbr" style="margin-top: -1px;position: relative;background: #efefef;min-height: 800px" id="nav_content">
            <!--top标题 【content_part_1】 -->
           <%-- <div class="row" style="min-height: 20px">
            </div>--%>
            <ul id="breadcrumb">
                <%--<li> <span class="entypo-home"></span></li>--%>
                <li><a href="${ctx}/system/main" title="主页">主页</a></li>
                <%--<li>/</li>--%>
                <li><a href="javascript:void(0)" id="nav_name" style="color: #666;font-weight: 500;"></a></li>
            </ul>
            <!-- CONTENT -->
           <%-- <jsp:include page="users.jsp"></jsp:include>--%>
           <%-- <iframe border="0" frameborder="0" height="900"
                    id="sys_nav" marginheight="300"  marginwidth="0" scrolling="no" src="http://www.ka92.cn/play/17064.html" width="100%">
          --%>
            <%--load方法加载--%>
            <div id="nav_intro">
              <%--  <jsp:include page="sys_menu.jsp"></jsp:include>--%>
            </div>
         <%--iframe控制 菜单权限为6--%>
            <iframe border="0" frameborder="0" style="display: none"
                    id="nav_iframe" src="" width="100%" height="1200px">
            </iframe>


            <div class="footer-space"></div>
            <div id="footer">
                <div class="devider-footer-left"></div>
                <div class="time">
                    <p id="spanDate">
                    <p id="clock">
                </div>
                <div class="copyright">智慧船检
                    <span class="entypo-heart"></span>2017<a href="#"></a> </div>
                <div class="devider-footer"></div>
            </div>
            <!-- / END OF FOOTER -->
        </div>
    </div>
    <!--  END OF PAPER WRAP -->
   <%-- <a href="#tip-win-form" id="open-tip-form"  data-toggle="modal" data-target="#tip-win-form" class="btn btn-primary" style="display: none">点击登录</a>
    <div aria-labelledby="myLargeModalLabel" role="dialog" tabindex="-1" class="modal fade" style="display: none;" id="tip-win-form">
        <div class="modal-dialog modal-lg" style="width: 262px;">
            <div class="modal-content">

                <div class="modal-header" style="background-color: #27355C ! important;">
                    <button aria-hidden="true" data-dismiss="modal" class="close" type="button">
                        <span class="entypo-cancel" style="font-size: 23px !important;color: #ffffff !important;"></span>
                    </button>
                    <h5 id="myLargeModalLabel" class="modal-title" style="color: #ffffff"><span class="fontawesome-bell">&nbsp;</span>系统提示</h5>
                </div>
                <div class="modal-body" style="height:66px;text-align: center">

                    <div class="compose_mail">

                            <div style="text-align: center;line-height:70px;font-size: 18px;width: 100%">
                                     <span class="fontawesome-info-sign">
                                     </span>&nbsp;<span id="tip-win-info">更新成功<span>
                            </div>
                            &lt;%&ndash;<button class="btn" type="button" style="margin-bottom:20px;margin-top:20px;margin-left: 20px;" id="cancel-opt">取消</button>&ndash;%&gt;
                    </div>


                </div>
                <div class="modal-footer" style="background-color: #f6f6f6 ! important;height: 50px">
                    <button class="btn" id="tip-sure-win" type="button" style="margin-top: -10px;margin-right: auto;margin-left: auto">
                        确定</button>
                </div>
                <script>
                    $(function(){
                        $("#tip-sure-win").click(function(){
                            main.closeOpenWin();
                        })

                    })
                </script>
            </div>
        </div>

    </div>
--%>

    <!-- 右侧隐藏框 RIGHT SLIDER CONTENT -->
    <div class="sb-slidebar sb-right">

    </div>
    <!-- END OF RIGHT SLIDER CONTENT-->
    <script type="text/javascript" src="${system}/js/preloader.js"></script>
    <script type="text/javascript" src="${system}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${system}/js/app.js"></script>
    <script type="text/javascript" src="${system}/js/load.js"></script>
    <%--左侧菜单控制--%>
    <script type="text/javascript" src="${system}/js/main/menu.js"></script>
    <%--主函数控住--%>
    <script type="text/javascript" src="${system}/js/main.js"></script>
<!-- PLUG IN 提示插件-->
    <script type="text/javascript" src="${system}/js/pnotify/pnotify.custom.min.js"></script>

    <script>
        main.menuData=${KEY_MENU_JSON};
        system.getMenuValue();
        <%--system.authMap=${KEY_AUTH_MAP};--%>
        //定义 main?service=XXX&type=2跳转链接以及类型  1: div 2 :iframe
        main.service="${service}";
        main.type="${type}";
        main.hide="${hide}";

    </script>

</body>

</html>
