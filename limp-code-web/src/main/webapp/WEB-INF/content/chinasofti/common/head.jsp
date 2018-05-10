<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" class="no-js">
<title id="ship-title">智慧船检大数据平台</title>
<link rel="shortcut icon" href="${style}/images/limp_ico.png" type="image/x-icon"/>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <%--弹框--%>
    <link rel="stylesheet" href="${ctx}/plug/layui/css/layui.css">
    <link rel="stylesheet" href="${ctx}/plug/bootstrap-3.3.7-dist/css/bootstrap-datetimepicker.min.css" >

    <script type="text/javascript"  src="${script}/js/jquery-3.2.1.min.js"></script>
    <script  type="text/javascript"  src="${ctx}/resources/script/abc.js"></script>
    <script type="text/javascript"  src="${ctx}/resources/script/system.js"></script>
    <%--弹框--%>

    <script type="text/javascript" src="${ctx}/plug/layui/lay/dest/layui.all.js"></script>
    <script type="text/javascript" src="${plug}/js-utils/count-number.js"></script>
    <script type="text/javascript" src="${bt}/js/bootstrap-datetimepicker.min.js"></script>
    <script type="text/javascript" src="${bt}/js/bootstrap-datetimepicker.zh-CN.js"></script>
    <%--<script type="text/javascript" src="$[{script}/chinasofti/bi/bi_option.js"></script>--%>

    <!--日志记录：以上版本如发生变化请注明-->
</head>
<script>
    var get_root='${ctx}';
    var curr_sur = '${surveyor.ycsname}';
    var curr_org = '${orginfo.orgname}';
    var curr_orgcode = '${orginfo.orgcode}';
    <%--var curr_orgcode = '${orginfo.orgcode}';orgcode--%>

</script>
