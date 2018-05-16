
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/sys_head.jsp" %>
<%--
  ~ Copyright (c) 2018. 北京中软国际信息技术有限公司 .
  --%>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>LP框架后台管理系统V1.1.3</title>
    <link rel="stylesheet" type="text/css" href="${plug}/login/css/normalize.css" />
    <link rel="stylesheet" type="text/css" href="${plug}/login/css/default.css">
</head>
<body style="width:100%;height:100%;margin:0;">
<div class="htmleaf-container">
    <header class="htmleaf-header">
        <h1>LP框架后台管理系统V1.1.3<span>LP framework management system</span></h1>
        <div>
            <a class="htmleaf-icon icon-htmleaf-home-outline" href="${ctx}/" title="首页"></a>

        </div>
    </header>
    <div class="related">
        <h3>打造智能框架服务系统</h3>
        <div style=" width: 367px; height: 217px; margin: 10px auto; background: rgba(218,218,218,0.6); ">

            <form role="form" action="#" style=" padding-top: 21px; ">
                <div class="form-group" style=" margin: 10px auto; ">
                    <label for="account" style=" font-weight: 300; ">用户名</label>
                    <input type="text" id="account" class="form-control" style=" border-radius: 5px; border: 1px solid #ccc; ">
                </div>
                <div class="form-group" style=" margin-top: 22px; ">
                    <label for="password" style=" font-weight: 300; ">密  &nbsp; 码</label>
                    <input type="password" id="password" class="form-control" style=" border-radius: 5px; border: 1px solid #ccc; ">
                </div>
                <button class="btn btn btn-primary pull-right" id="log-btn" type="button"
                        style="    border: 1px solid #ccc; border-radius: 5px; color: white; background-color: black; margin-top: 20px; width: 95px;">
                    登 录
                </button>
            </form>


        </div>

    </div>
</div>

<script src="${plug}/login/dist/jquery-2.1.0.min.js"></script>
<script src="${plug}/login/dist/jquery-starfield.js"></script>
<script type="text/javascript" src="${system}/js/main/sys_login.js"></script>

<script>
    $('.htmleaf-container').starfield({
        starDensity: 2.0,
        mouseScale: 0.5,
        seedMovement: true
    });
</script>
</body>
</html>