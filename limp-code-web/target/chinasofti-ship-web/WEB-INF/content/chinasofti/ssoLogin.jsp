 <%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/sys_head.jsp" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>智慧船检大数据平台</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Le styles -->
    <link rel="stylesheet" href="${system}/css/loader-style.css">
    <link rel="stylesheet" href="${system}/css/bootstrap.css">
    <link rel="stylesheet" href="${system}/css/signin.css">
</head>

<body style="background: url('${ctx}/resources/style/images/bg.png') no-repeat top center fixed;" onkeypress="if(event.keyCode == 13) sysLogin.login();">
    <!-- Preloader -->
    <div id="preloader">
        <div id="status">&nbsp;</div>
    </div>
    
    <div class="container">



        <div class="" id="login-wrapper">
            <div class="row">
                <div class="col-md-4 col-md-offset-4">
                    <div id="logo-login">
                        <h1>智慧船检大数据平台<!--<abbr title="智慧船检"></abbr>-->
                            <span>V0.1</span>
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

                            <button class="btn btn btn-primary pull-right" id="log-btn"type="button" >
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
                Copyright © 2016-2017 农业部智慧船检大数据平台 - Powered By 农业部船检局 V0.1 </h6>
        </div>

    </div>
    <div id="test1" class="gmap3" style=""></div>
    <!--  END OF PAPER WRAP -->
    <!-- MAIN EFFECT -->
    <script type="text/javascript" src="${system}/js/bootstrap.js"></script>
    <script type="text/javascript" src="${system}/js/load.js"></script>
    <script type="text/javascript" src="${ctx}/resources/script/chinasofti/ent/plat_login.js"></script>

</body>

</html>
