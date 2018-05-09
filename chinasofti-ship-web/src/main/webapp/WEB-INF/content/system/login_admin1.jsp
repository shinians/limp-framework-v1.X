<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/sys_head.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>智慧船检</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link rel="stylesheet" href="${system}/css/loader-style.css">
    <link rel="stylesheet" href="${system}/css/bootstrap.css">
    <link rel="stylesheet" href="${system}/css/signin.css">
</head>

<body id="bg-move">
    <!-- Preloader -->
    <div id="preloader">
        <div id="status">&nbsp;</div>
    </div>
    
    <div class="container" id="intro">
        <div class="" id="login-wrapper">
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div id="logo-login">
                        <h1>智慧船检管理系统<!--<abbr title="智慧船检"></abbr>-->
                            <span>V1.0</span>
                        </h1>
                    </div>
                </div>

            </div>

            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div class="account-box"> 
                        <form role="form" action="#">
                            <div class="form-group">
                               <%-- <a href="" class="pull-right label-forgot">Forgot password?</a>--%>
                                <label for="account">用户名</label>
                                <input type="text" id="account" class="form-control">
                            </div>
                            <div class="form-group">
                                <label for="password">密码</label>
                                <input type="password" id="password" class="form-control">
                            </div>
                            <div class="checkbox pull-left">
                                <label>
                                    <input type="checkbox">记住用户名
                                </label>
                                <label>
                                </label>

                            </div>
                            <%--<a class="forgotLnk" href="${ctx}/qun.jsp" style="margin-top: 10px">返回</a>--%>

                            <button class="btn btn btn-primary pull-right" id="log-btn"type="button">
                                登 录
                            </button>
                        </form>

                        <div class="row-block">
	                        <div class="row">
		                    </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

 		<p>&nbsp;</p>
        <div style="text-align:center;margin:0 auto;">
            <h6 style="color:#fff;">
                <br />
                <br />
                © 2017 版权所有 </h6>
        </div>

    </div>
    <div id="test1" class="gmap3" style=""></div>
    <!--  END OF PAPER WRAP -->
    <!-- MAIN EFFECT -->
    <script type="text/javascript" src="${system}/js/preloader.js"></script>
    <script type="text/javascript" src="${system}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${system}/js/load.js"></script>
    <script type="text/javascript" src="${system}/js/main/sys_login.js"></script>
    <script type="text/javascript" src="${ctx}/systemsite/plug/js-utils/abc.js"></script>
    <%--<script type="text/javascript" src="${plug}/particleground/jquery.particleground.min.js"></script>--%>
    <%-- <script>
         document.addEventListener('DOMContentLoaded', function () {
             particleground(document.getElementById('bg-move'), {
                 dotColor: '#FFFFFF',
                 lineColor: '#FFFFFF',
                 minSpeedX:0.1,
                 minSpeedY:0.1,
                 density:10000
             });
             var intro = document.getElementById('intro');
             intro.style.marginTop = - intro.offsetHeight / 1.1 + 'px';
         }, false);
     </script>--%>
</body>

</html>
