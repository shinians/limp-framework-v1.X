<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/sys_head.jsp" %>

<head>
    <title>404页面不存在</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style type="text/css">
        body {
            overflow:hidden!important;
            padding-top: 120px;
        }
    </style>
    <!-- Le styles -->
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/style.css">
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/loader-style.css">
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/bootstrap.css">
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/signin.css">
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/extra-pages.css">
</head>

<body style="min-height: 550px;background: #fff;">
<!-- Main content -->
<div class="content_box">
    <br/>
    <div style="text-align: center;margin-top: 0px"><img src="${system}/css/images/404.jpg"></div>
    <div style="text-align: right;margin-right: 50px; margin-top: 50px ">
        <a href="${ctx}/" style="color: blue;font-size: 15px;text-decoration: none">
            <span style="color: green;font-size: 25px;">首页 </span></a>
        <a href="javascript:alert('请联系管理员！')" style="color: blue;font-size: 15px;text-decoration: none">
            <span style="color: red;font-size: 25px;">建议反馈 </span></a>
    </div>
</div>

</body>
</html>



