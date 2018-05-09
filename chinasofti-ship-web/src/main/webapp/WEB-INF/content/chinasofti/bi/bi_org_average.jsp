<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/content/chinasofti/common/head.jsp" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<html style = 'overflow: hidden'>
<head>
    <meta charset="UTF-8">
    <title>机构复核</title>
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
        html{
            overflow-y: scroll !important;
        }
    </style>
</head>
<body style="background-color:#18204B">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <table class="orgBItable">
                        <thead>
                            <tr>
                                <th>机构名称</th>
                                <th>机构负责人</th>
                                <th>业务复核时间</th>
                                <th>业务符合状态</th>
                                <th>联系电话</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%--<tr>--%>
                                <%--<td>抚宁检验站</td>--%>
                                <%--<td></td>--%>
                                <%--<td></td>--%>
                                <%--<td>待复核</td>--%>
                                <%--<td></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>昌黎检验站</td>--%>
                                <%--<td></td>--%>
                                <%--<td></td>--%>
                                <%--<td>已完成</td>--%>
                                <%--<td></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>北戴河检验站</td>--%>
                                <%--<td></td>--%>
                                <%--<td></td>--%>
                                <%--<td>已完成</td>--%>
                                <%--<td></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>秦开检验站</td>--%>
                                <%--<td></td>--%>
                                <%--<td></td>--%>
                                <%--<td>已完成</td>--%>
                                <%--<td></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>山海关检验站</td>--%>
                                <%--<td></td>--%>
                                <%--<td></td>--%>
                                <%--<td>已完成</td>--%>
                                <%--<td></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>海港区检验站</td>--%>
                                <%--<td></td>--%>
                                <%--<td></td>--%>
                                <%--<td>已完成</td>--%>
                                <%--<td></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>秦皇岛北戴河新区检验站</td>--%>
                                <%--<td></td>--%>
                                <%--<td></td>--%>
                                <%--<td>已完成</td>--%>
                                <%--<td></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>乐亭检验站</td>--%>
                                <%--<td></td>--%>
                                <%--<td></td>--%>
                                <%--<td>已完成</td>--%>
                                <%--<td></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>唐山海港经济开发区检验站</td>--%>
                                <%--<td></td>--%>
                                <%--<td></td>--%>
                                <%--<td>已完成</td>--%>
                                <%--<td></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>滦南检验站</td>--%>
                                <%--<td></td>--%>
                                <%--<td></td>--%>
                                <%--<td>待复核</td>--%>
                                <%--<td></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>丰南检验站</td>--%>
                                <%--<td></td>--%>
                                <%--<td></td>--%>
                                <%--<td>待复核</td>--%>
                                <%--<td></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>迁西检验站</td>--%>
                                <%--<td></td>--%>
                                <%--<td></td>--%>
                                <%--<td>待复核</td>--%>
                                <%--<td></td>--%>
                            <%--</tr>--%>
                            <%--<tr>--%>
                                <%--<td>宽城检验站</td>--%>
                                <%--<td></td>--%>
                                <%--<td></td>--%>
                                <%--<td>待复核</td>--%>
                                <%--<td></td>--%>
                            <%--</tr>--%>
                        </tbody>
                    </table>

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
        $.ajax({
            url:get_root+'/ship/bi/orgEchartsData11',
            type:'post',
            dataType:'json',
            success:function(data){
                var tbData = data.result;
                var str;
                for(var i=0;i<tbData.length;i++){
                    str += "<tr><td>"+tbData[i].orgname+"</td><td>"+tbData[i].respperson+"</td><td>"+tbData[i].nextChcTime+"</td><td>"+tbData[i].chcState+"</td><td>"+tbData[i].tel+"</td></tr>"
                }
                $('tbody').append(str);
            }
        })
    </script>
</body>
</html>