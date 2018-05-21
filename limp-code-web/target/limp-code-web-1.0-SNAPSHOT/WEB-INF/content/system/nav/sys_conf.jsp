<%--
   菜单管理
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 16-11-22
  Time: 下午10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/content/system/common/sys_head.jsp" %>
<%@include file="/WEB-INF/content/system/common/taglibs.jsp" %>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  ~ Copyright (c) 2018. 北京中软国际信息技术有限公司 .
  --%>

<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!--图标-->
    <!-- Le styles -->
    <%--<script type="text/javascript" src="${ctx}/systemsite/assets/js/jquery.js"></script>--%>
    <script src="${system}/js/wizard/lib/modernizr-2.6.2.min.js"></script>

    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/style.css">
    <%--动态加载css样式--%>
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/loader-style.css">
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/bootstrap.css">
    <link rel="stylesheet" href="${ctx}/resources/style/system.css">

    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/mail.css">
    <!--视频播放-->
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/social.css">

    <!--表格兼容性-->
    <link href="${system}/js/stackable/stacktable.css" rel="stylesheet">
    <link href="${system}/js/stackable/responsive-table.css" rel="stylesheet">


    <link rel="stylesheet" href="${system}/js/wizard/css/jquery.steps.css">
    <link type="text/css" rel="stylesheet" href="${system}/js/wizard/jquery.stepy.css">
    <link href="${system}/js/tabs/acc-wizard.min.css" rel="stylesheet">
</head>
<style>
    .bclass {
        background: #f1f4f6 !important;
        font-size: 12px !important;
    }

    .tabcontrol > .steps {
        background-color: #E8edf0;
        padding-left: 15px;
        margin-bottom: 1px;
    }

    .tabcontrol > .content {
        background-color: #fff;
        height: 52em;
        border-top: 0px solid #bbb
    }

    .tabcontrol > .steps > ul > li {
        background: #d8e0e6;
        margin-right: 6px;
    }
    /*被选中的li的样式*/
    .tabcontrol > .steps > ul > li.current {
        padding: 0 0 3px 0;
    }

    .tabcontrol > .steps > ul > .done:hover {
        background: #c9d4dc;
        border: 1px solid #bbb;
        padding: 0;
    }
    .tabcontrol > .content > .body {
        padding: 0px 0px 0px 15px;
        width: 100%;
    }
    /*表格样式情况*/
    .table thead tr th{
        color: #333333;
        font-size: 12px;
        background-color: #fff;
        height: 46px;
        line-height: 25px;
        font-weight: bold !important;
    }
    .table > thead > tr > th {
        vertical-align: bottom;
        border-bottom: 1px solid #ddd;
        background-color: #f9f9f9;
    }

    .table-striped > tbody > tr:nth-child(even) > td, .table-striped > tbody > tr:nth-child(even) > th{
        background-color: #f9f9f9;
    }
    .table-striped > tbody > tr:nth-child(odd) > td, .table-striped > tbody > tr:nth-child(odd) > th{

        background-color: #fff;
    }
    .table-striped>tbody>tr:hover td{
        /*background:none;*/
        cursor: default;
    }
    .form-control{
        border: 1px solid #d2d6de !important;
    }
    .table tbody tr td{
        text-align: center;
        line-height: 32px;
        color: #333;
        font-size: 12px;
    }
</style>
<body class="bclass">
<div class="wrap-fluid">
    <%--<div class="container-fluid paper-wrap bevel tlbr">--%>
        <div>
            <%--<div class="row">--%>
                <div class="col-sm-12">
                    <div class="nest" id="tabClose">
                        <div class="title-alt" style="background-color: #E8edf0">
                            <h6>
                                <div> <em style="display: block; font-weight: bold; font-style: normal;">系统配置&nbsp;
                                    <span title="可以在此增改系统的变量和分组,也可以自定义分组和变量,如果需要删除请从数据库中删除" style="cursor: pointer" class="entypo-help-circled" title="help-circled"></span>
                                </em></div></h6>
                            <div class="titleClose">
                                <a class="gone" href="#tabClose">
                                    <span class="entypo-cancel"></span>
                                </a>
                            </div>
                            <div class="titleToggle">
                                <a class="nav-toggle-alt" href="#tab">
                                    <span class="entypo-up-open"></span>
                                </a>
                            </div>

                        </div>

                        <div class="body-nest" id="tab" style="padding:0px !important;background-color: #E8edf0">

                            <div id="wizard-tab">

<%--
                                <h2>测试导航1</h2>
                                <section>
                                    <p>测试内容</p>
                                </section>

                                <h2>测试导航2</h2>
                                <section>
                                    <p>测试内容2</p>

                                </section>

                                <h2><span class="entypo-plus"></span></h2>
                                <section>
                                    <p>测试内容2</p>
                                </section>--%>
                            </div>

                        </div>
                    </div>
                </div>
                </div>
            <%--</div>--%>
        </div>

</div>

    <!-- /MAIN EFFECT -->
    <script type="text/javascript" src="${system}/js/preloader.js"></script>
    <script type="text/javascript" src="${system}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${system}/js/load.js"></script>
    <script src="${system}/js/wizard/lib/jquery.cookie-1.3.1.js"></script>

    <script src="${system}/js/wizard/build/jquery.steps.js"></script>
    <script type="text/javascript" src="${system}/js/wizard/jquery.stepy.js"></script>

<%--点击出现折叠和删除面板效果--%>
   <script type="text/javascript" src="${system}/js/app.js"></script>
   <script type="text/javascript" src="${system}/js/main/sys_conf.js"></script>
    <script>
        $(function() {
            //初始化：所有主配置项


/*

            $("#wizard").steps({
                headerTag: "h2",
                bodyTag: "section",
                transitionEffect: "slideLeft"
            });

            $("#wizard_vertical").steps({
                headerTag: "h2",
                bodyTag: "section",
                transitionEffect: "slideLeft",
                stepsOrientation: "vertical"
            });
*/

           /* $("#wizard-tab").steps({
                headerTag: "h2",
                bodyTag: "section",
                transitionEffect: "none",
                enableFinishButton: false,
                enablePagination: false,
                enableAllSteps: true,
                titleTemplate: "#title#",
                cssClass: "tabcontrol"
            });
*/
            //stepy
            $('#transition-duration-demo').stepy({
                duration: 400,
                transition: 'fade'
            });

        });

    </script>


</body>

</html>
