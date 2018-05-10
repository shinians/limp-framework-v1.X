<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/content/chinasofti/common/head.jsp" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>总数+业务复核+完成率</title>
    <link rel="stylesheet" href="${ctx}/plug/bootstrap-3.3.7-dist/css/bootstrap.min.css" >
    <link rel="stylesheet" href="${ctx}/plug/bootstrap-3.3.7-dist/css/bootstrap-datetimepicker.min.css" >
    <%--<link rel="stylesheet" href="${ctx}/resources/style/chinasofti/css/mainPanel.css">--%>
    <style>
        /*机构表格 样式*/
        .orgBItable{
            width:100%;
        }
        .orgBItable td,.orgBItable th{
            border:1px solid #234876;
        }
        .orgBItable thead{
            font-size: 18px;
            color:#fff;

        }
        .orgBItable thead tr th,.orgBItable tbody tr td{
            text-align: center;
        }
        .orgBItable thead tr{
            line-height: 45px;
            border-bottom: 2px solid #234876;
            border-top: 2px solid #234876;
        }
        .orgBItable tbody tr{
            line-height: 45px;
            color:#fff;
        }

    </style>
</head>
<body style="background-color:#18204B">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="col-md-12">
                    <table class="orgBItable">
                        <thead>
                            <tr>
                                <th>省局</th>
                                <th>市处</th>
                                <th>县站</th>
                                <th>渔船拥有量</th>
                                <th>检验工作完成率</th>
                                <th>机构能力得分</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>1</td>
                                <td>2</td>
                                <td>3</td>
                                <td>4</td>
                                <td>5</td>
                                <td>6</td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
    <script type="text/javascript" src="${ctx}/resources/script/js/jquery-3.2.1.min.js"></script>
    <script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.min.js"></script>
    <script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap-datetimepicker.zh-CN.js"></script>
    <script type="text/javascript" src='${echarts}/echarts.min.js'></script>

<%--<script type="text/javascript" src='${ctx}/resources/script/chinasofti/ent/mainPanel.js'></script>--%>
    <script type="text/javascript">
        console.log("表格1-3");
    </script>
</body>
</html>