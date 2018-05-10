
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/sys_head.jsp" %>
<%--
  ~ Copyright (c) 2018. 北京中软国际信息技术有限公司 .
  --%>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>智慧船检管理系统1.0</title>
    <link rel="stylesheet" type="text/css" href="${plug}/login/css/normalize.css" />
    <link rel="stylesheet" type="text/css" href="${plug}/login/css/default.css">
</head>
<body style="width:100%;height:100%;margin:0;">
<div class="htmleaf-container">
    <header class="htmleaf-header">
        <h1>智慧船检管理系统1.0<span>Intelligent ship inspection management system</span></h1>
        <div>
            <a class="htmleaf-icon icon-htmleaf-home-outline" href="${ctx}/index/main" title="首页"></a>

        </div>
    </header>
    <div class="related">
        <h3>数据构建分析,打造智慧管理</h3>
        <div style=" width: 350px; height: 200px; margin: 10px auto; background: rgba(113,113,113,0.5); ">

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