<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp"%>
<%@include file="/WEB-INF/common/sys_head.jsp" %>

<html>
<body>
<br/>
<br/>
<br/>
<br/>
<script>
    <%--window.location.href='${ctx}/system/login'--%>
    <%--window.location.href='${ctx}/index/ssoLogin'--%>
    window.location.href='${ctx}/index/main'
    <%--window.location.href='${ctx}/index/main'--%>
</script>

<a href="/ent/info.action">企业基本信息</a>

<a href="/system/login.action">登录</a>
</body>
</html>