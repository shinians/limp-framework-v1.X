<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<%@include file="/WEB-INF/content/chinasofti/common/head.jsp" %>

<html lang="en">
<head>
    <meta charset="utf-8">
    <title>智能检索</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/style.css">
    <%--动态加载css样式--%>
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/loader-style.css">
    <link rel="stylesheet" href="${bt}/css/bootstrap.css">
    <link rel="stylesheet" href="${ctx}/resources/style/system.css">
    <link rel="stylesheet" href="${ctx}/resources/style/css/theme-layout.css">
    <link rel="stylesheet" href="${style}/css/animate.min.css">
    <link rel="stylesheet" href="${plug}/js-utils/ssmk.css">
    <script>
        window.UEDITOR_HOME_URL="${ctx}/systemsite/plug/ueditor-1.4.3/";
//        window.UEDITOR_HOME_URL="/ueditor/";
    </script>
    <script type="text/javascript" src="${plug}/ueditor-1.4.3/ueditor.config.js"></script>
    <script type="text/javascript" src="${plug}/ueditor-1.4.3/ueditor.all.js"></script>
<%----%>
    <%--<script type="text/javascript" src="${ctx}/ueditor/ueditor.config.js"></script>--%>
    <%--<script type="text/javascript" src="${ctx}/ueditor/ueditor.all.min.js"></script>--%>

    <style>


        ul, ol, li {
            margin: 0;
            padding: 0;
            list-style: none;
        }

        table {
            border-collapse: collapse;
            border-spacing: 0;
        }


        input {
            vertical-align: middle;
        }

        a {
            text-decoration: none;
            color: #333;
        }

        a:hover {
            text-decoration: none;
            color: #F00;
        }




        .font_line {
            text-decoration: underline
        }

            /*中间内容垂直左右居中*/
        .content_box {
            width: 1000px;
            height: 550px;
            margin: 32px auto;
        }

        .search_logo {
            width: 362px;
            height: 80px;
            margin: 20px auto;
        }

        .search_box {
            border-radius:7px 10px 5px 2px;
            width: 717px;
            height: 76px;
            background: url(${style}/images/input.png) no-repeat left top;
            position: relative;
            margin-left: 120px;
            _margin-left: 0;
        }

        .search_box .input {
            position: absolute;
            left: 18px;
            top: 8px;
            width: 550px;
            height: 40px;
            line-height: 40px;
            font-size: 14px;
            padding-left: 10px;
            border: 0;
        }

        .search_box .btn {
            position: absolute;
            top: 5px;
            right: 25px;
            width: 118px;
            height: 47px;
            background: url(${style}/images/search_btn.gif) no-repeat left top;
            border: none;
            cursor: pointer;
        }

        .search_list {
            width: 780px;
            display: block;
            height: 40px;
            margin: 0 auto;
        }

        .search_list li {
            width: 85px;
            text-align: center;
            display: block;
            float: left;
            font: bold 14px/30px "微软雅黑";
            color: #00366d;
        }

        .search_list li a {
            color: #ffffff;
        }

        .search_list li a:hover {
            color: #F00
        }

        .search_list li.on {
            color: #F00
        }

        .search_list li.on a {
            color: #F00
        }


        .search_info {
            color: #999;
            clear: both;
            padding-top: 20px;
        }
    </style>

</head>

<body>
<div class="wrap-fluid" style="background: url(resources/style/images/surBg.png) 0px 0px no-repeat; background-size: 100% 100%;">
    <div class="container-fluid">
        <div class="content-wrap">
            <div class="row">
                <div class="col-lg-12">
                    <div class="row">
                        <div class="col-xs-12">
                            <p class="hd-title" style="margin:40px -2px 30px 0px; color: #fff; font-size: 24px;">${org.orgname}</p>
                        </div>
                    </div>
                </div>
            </div>

            <div class="bi-item" data-to="0">
                <div class="row">
                    <div class="col-sm-12">
                        <section >

                            <div class="content_box">
                                <br>
                                <div class="search_logo"><img src="${ctx}/resources/style/images/juhui.png" style="width: 70px">
                                    <strong style="font-size: 48px;margin: 139px 0px 3px 30px; padding: 110px 10px; line-height: normal; color: #F0FF00; vertical-align: top;">
                                        智慧船检
                                    </strong></div>
                                <ul class="search_list">
                                    <li class="on" id="li0"><a href="javascript:void(0)">全部</a></li>

                                    <li>
                                        <a href="javascript:void(0)">检验机构</a></li>

                                    <li>
                                        <a href="javascript:void(0)" >企业信息</a></li>
                                    <li>
                                        <a href="javascript:void(0)">渔船信息</a></li>

                                    <li>
                                        <a href="javascript:void(0)">验船师</a></li>
                                    <li>
                                        <a href="javascript:void(0)" >法律法规</a></li>

                                    <li><a href="javascript:void(0)" class="font_line green">精确搜索</a></li>
                                </ul>

                                <div id="ue"></div>
                                <script>
                                    var u=UE.getEditor("ue");
                                </script>


                                <!--中间内容结束-->
                            </div>
                        </section>
                    </div>
                </div>
            </div>
        </div>

    </div>
</div>

</body>
</html>

