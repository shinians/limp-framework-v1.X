<%--
  Created by IntelliJ IDEA.
  User: www.shinians.com
  Date: 2018/4/24
  Time: 17:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp"%>
<%--
  ~ Copyright (c) 2018. 北京中软国际信息技术有限公司 .
  --%>


<html lang="en">
<head>
  <title>您的请求有误</title>
  <meta name="viewport" content="width=device-width, initial-scale=1" />
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <meta name="keywords" content="Astounding Error Page Responsive Widget,Login form widgets, Sign up Web forms , Login signup Responsive web form,Flat Pricing table,Flat Drop downs,Registration Forms,News letter Forms,Elements" />
    <%--<script type="application/x-javascript"> addEventListener("load", function () {
        setTimeout(hideURLbar, 0);
    }, false);
    function hideURLbar() {
        window.scrollTo(0, 1);
    }
    </script>--%>
  <link href="${system}/css/model/error-page.css" rel='stylesheet' type='text/css'/><!-- style.css -->
  <%--<script src="${script}/js/jquery-1.9.1.min.js"></script>--%>
    <%--<script src="${script}/jquery.easing.min.js"></script>--%>
</head>

<body id="bd">
<div id="bdSec" >
    <div id="particles-js"></div>
    <div class="main-w3layouts">
      <h1>ERROR 500</h1>
      <div class="main-agile">
        <h2>${data.msg}</h2>
        <p> Don't worry... After big data analysis, you may need the following functions, Hoping to help you.</p>
        <div class="botton-w3ls" id="fun-list"></div>
      </div>
      <div class="footer-w3l">
        <p class="agileinfo"> &copy; 2018  Design by <a href="javascript:void(0)">...<%--LP--%></a></p>
      </div>
    </div>
    <script src="${system}/js/model/particles.js"></script>
    <script src="${system}/js/model/error-app.js"></script>
</div>
<script>
        //不同的登录时间背景图有所差异
        var  hdate=new Date().getHours();
        if(parseInt(hdate)>18){
            document.getElementById("bdSec").style.background="url(${system}/img/500/500_2.jpg) center center / cover no-repeat fixed";
            if(document.getElementById("bd")){
                document.getElementById("bd").style.background="url(${system}/img/500/500_2.jpg) center center / cover no-repeat fixed";
            }
            <%--$("#bd").css("background","url(${system}/img/500/500_2.jpg) center center / cover no-repeat fixed");--%>
        }

        //获取错误代码，进行跳转
        var code="${data.code}";
        var ctx='${ctx}';
        if(window.location.href&&window.location.href.indexOf("error.jsp")==-1){
            if(!system.isBlank(code)&&"510"==code){
                if(confirm("会话已过期, 请重新登录")){
                    cons.sysHref(cons.sysWorkDeskUrl);
//      parent.location.reload();
                }
            }else{
                $("#particles-js").attr("style","height:700px;background:url(${system}/img/500/500_1.jpg) center center / cover no-repeat fixed");
                $("#particles-js h1").attr("style","margin-top:50px;");
            }
        }
        var fir='<a href="${ctx}/">返回首页</a>';
        if("510"==code){
            fir+='<a href="${ctx}/system/login">重新登录</a>';
        }else{
            fir+='<a href="javascript:history.back()">返回上层</a>';
        }
        document.getElementById('fun-list').innerHTML=fir;
</script>
</body>
</html>
