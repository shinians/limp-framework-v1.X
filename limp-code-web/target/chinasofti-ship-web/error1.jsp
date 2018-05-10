<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp"%>
<%--<%@include file="/WEB-INF/common/sys_head.jsp" %>--%>

<head>
    <title>您的请求有误</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/bootstrap.css">
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/signin.css">
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/extra-pages.css">
    <style type="text/css">
        #bdiv {
            overflow:hidden!important;
            padding-top: 120px;

        }
        .error-link:hover{
            color: royalblue;
        }
    </style>
    <script>
        var code="${data.code}";
        var ctx='${ctx}';
        if(window.location.href&&window.location.href.indexOf("error.jsp")==-1){
            if(!system.isBlank(code)&&"510"==code){
                if(confirm("会话已过期, 请重新登录")){
                    cons.sysHref(cons.sysWorkDeskUrl);
//                         parent.location.reload();
                }
            }else{
                parent.location.reload();
            }
        }

    </script>
</head>

<div id ="bdiv"style="min-height: 550px/*;background: #f9f6ef*/">
<!-- Main content -->
<section class="page-error">

    <div class="error-page">
        <h2 class="headline text-info" style="text-align: center;color: greenyellow" >500</h2>
        <div class="error-content" style="text-align: center;">
            <br>

            <h3 style="color: red;font-size: 33px;"><i class="fa fa-warning text-yellow"></i>${data.msg}</h3>
             <br>
            <p>
                <%--请求错误，您可以--%>
                <a class="error-link" href='javascript:void(0)' onclick=cons.sysHref(cons.sysWorkDeskUrl)>[回到首页/</a>
                <a class="error-link" href='javascript:history.back()'>返回上层]</a>
            </p>

        </div>

        <!-- /.error-content -->
    </div>
</section>
</div>

<script src="${ctx}/resources/properties/sys_constant.js"></script>
</html>
