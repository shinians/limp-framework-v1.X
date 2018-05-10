<%--定义路径名称：开发者根据需要自行定义--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="/WEB-INF/common/tld/fn.tld" prefix="fn" %>
<c:set var="ctx" scope="request" value="${pageContext.request.contextPath}"/>
<c:set var="script" scope="request" value="${ctx}/resources/script"/>
<c:set var="style" scope="request" value="${ctx}/resources/style"/>
<c:set var="echarts" scope="request" value="${ctx}/plug/echarts-3.6.2"/>
<c:set var="layer" scope="request" value="${ctx}/plug/layui"/>
<c:set var="bt" scope="request" value="${ctx}/plug/bootstrap-3.3.7-dist"/>
<c:set var="supermap" scope="request" value="${ctx}/plug/supermap"/>

<c:set var="bootstrap" scope="request" value="${ctx}/systemsite/plug/bootstrap-4.0"/>
<c:set var="system" scope="request" value="${ctx}/systemsite/assets"/>
<%--<c:set var="system" scope="request" value="${ctx}/systemsite/m10/assets"/>--%>
<c:set var="plug" scope="request" value="${ctx}/systemsite/plug"/>
<%--
<%@taglib prefix="s" uri="/struts" %>
<%@taglib prefix="c" uri="/jstl" %> c标签需要标签库引入C_taglib
此外你还需要 javax.servlet.jsp.jar    <%@ page isELIgnored="false" %>
--%>
