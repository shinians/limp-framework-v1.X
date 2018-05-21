<%--用于sys系统简单的head设置--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" class="no-js">
<title id="systemTitle">应用common</title>
<link rel="shortcut icon" href="${system}/ico/lp-favicon.png" type="image/x-icon"/>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <script src="${plug}/js-utils/jquery-1.9.1.min.js"></script>
    <script src="${plug}/js-utils/system-site.js"></script>
    <script src="${plug}/js-utils/system-plug.js"></script>

    <script src="${plug}/echarts-3.6.2/echarts.min.js"></script>
    <script src="${plug}/js-utils/abc.js"></script>
    <script src="${ctx}/resources/script/system_log.js"></script>
    <script src="${ctx}/resources/properties/sys_constant.js"></script>
    <!--日志记录：以上版本如发生变化请注明-->
</head>
<script>
    var get_root='${ctx}';
</script>