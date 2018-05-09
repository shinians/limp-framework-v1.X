<%@include file="/WEB-INF/content/chinasofti/common/head.jsp" %>
<%--
   菜单管理
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 16-11-22
  Time: 下午10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <%--树形结构end--%>

</head>
<!-- END HEAD -->

<!-- BEGIN BODY -->

<body>
<div style="text-align: center">
   <h1><a href="${ctx}/ent/getDomain.action" target="_blank">json获取</a> </h1>
    <h1> <div>这是ent_info.jsp页面</div></h1>
    <form action="${ctx}/ent/getDomain.action" >

    </form>
    <div style="margin:100px 550px">
        <%--iframe--%>
    <form role="form" action="${ctx}/ent/test.action">
        <div class="form-group" style="width: 140px">
            <%-- <a href="" class="pull-right label-forgot">Forgot password?</a>--%>
            <label for="account">用户名</label>
            <input type="text" id="account" class="form-control">
        </div>
        <div class="form-group" style="width: 140px">
            <label for="password">密码</label>
            <input type="password" id="password" class="form-control">
        </div>
        <%--${KEY_CODE}--%>
         ---
         <%--${KEY_CODE.PER_BTN.NAME}--%>
        <%--<c:if test="${KEY_CODE.PER_BTN.VALUE=='1'}">
           <h1> -------dd------${KEY_CODE.code2.code}--</h1>
        </c:if>
        <h1>KEY_CODE</h1>
        <div>${KEY_CODE.code2.url}</div>

        <div>${KEY_CODE.code3.url}</div>
        <hr/>
        <h1>KEY_USER</h1>
        <div>${KEY_MENU[1].menName}</div>
        <hr/>

        <div>${KEY_USER.usrName}</div>
        <div>${KEY_USER}</div>
        <hr/>
        <h1>KEY_MENU</h1>

        <div>${KEY_MENU}</div>
        <h1>KEY_MENU_JSON</h1>
        <div>${KEY_MENU_JSON}</div>--%>
        <%--<a class="forgotLnk" href="${ctx}/qun.jsp" style="margin-top: 10px">返回</a>--%>

        <button class="btn btn btn-primary pull-left" id="log-btn"type="submit">
            submit
        </button>
    </form>
    </div>
</div>
</body>


</html>