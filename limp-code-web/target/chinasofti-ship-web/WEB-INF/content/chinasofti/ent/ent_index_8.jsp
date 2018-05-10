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

<!-- END HEAD -->

<!-- BEGIN BODY -->

<link rel="stylesheet" href="${style}/css/panel-drawingApproval.css" />
<style>
    .layui-tab-title .layui-this:after{border:none;}
    .personTable thead tr {
        border-top: none;
        border-bottom: none;
        height: 45px;
    }
    .xiangqingTitle{
        width: 99px;
        text-align: right;
        display: inline-block;
    }
    .xiangqingCon{
        display: inline-block;
        width: 140px;
        vertical-align: top;
    }
</style>
<input class="drawnoSolr" value="${pid}" hidden="hidden"></input>
    <div class="container">
        <div style="margin:30px 0px 30px 0px;" class="row">
            <div id="pic-check" class="col-sm-12">
                <script id="tuhao" type="text/template">
                    <%--todo:图纸名未接入，数据库无数据--%>
                    <h3 class="title2 company headerTxt">{{drawno}}<br/><span class="numberColor" id="shipName"></span></h3>
                </script>
            </div>
        </div>
        <div class="row">

            <div class="col-sm-6">
                <div class="col-sm-6">
                    <div style="width: 256px;" class="box003">
                        <h3 class='drawTitle'>图纸基本信息</h3>
                        <div class="drawingMsg">
                            <script id='drawingMsg' type="text/template">
                                <ul class="information" style="padding-left: 0px;">
                                    <li><b>图号：</b><span>{{drawno}}</span></li>
                                    <li><b>批准时间：</b><span>{{apprtime}}</span></li>
                                    <li><b>图纸有效期：</b><span>{{endtime}}</span></li>
                                    <li title='{{desunit}}'><b>设计单位：</b><span class="design">{{desunit}}</span></li>
                                    <li><b>设计负责人：</b><span>{{resppersion}}</span></li>
                                    <li><b>登记船长(m)：</b><span>{{shiplength}}</span></li>
                                    <li><b>总吨位：</b><span>{{tonnage}}</span></li>
                                    <li><b>主机功率(kw)：</b><span>{{power}}</span></li>
                                    <li><b>设计航速(kn)：</b><span>{{speed}}</span></li>
                                    <li><b>设计排水量(t)：</b><span>{{water}}</span></li>
                                </ul>
                            </script>
                            <div id='drawing'></div>
                            <script id="drawingChange" type="text/template">
                                <div class="layui-tab layui-tab-card" lay-filter="demo">
                                    <ul class="layui-tab-title" style="left: 1px;width: 99.9%;">
                                        <li class="layui-this">第一次审核</li>
                                        <li>第二次审核</li>
                                        <li>第三次审核</li>
                                    </ul>
                                    <div class="layui-tab-content">
                                        <div class="layui-tab-item layui-show">
                                            <table id="drawingChange01" class="">
                                                <thead style="font-weight: 500;">
                                                <tr>
                                                    <td rowspan="2">审查环节</td>
                                                    <td rowspan="2" colspan="2">修改记录</td>
                                                    <td  colspan="10">审查项目</td>
                                                    <td rowspan="2">修改内容</td>
                                                </tr>
                                                <tr>
                                                    <td>船体结构</td>
                                                    <td>稳性</td>
                                                    <td>载重线</td>
                                                    <td>机器设备</td>
                                                    <td>电气设备</td>
                                                    <td>救生设备</td>
                                                    <td>消防</td>
                                                    <td>航行设备</td>
                                                    <td>信号设备</td>
                                                    <td>防污染设备</td>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                <tr>
                                                    <td>初审</td>
                                                    <td>No.1</td>
                                                    <?if(drawRepairList[0] != null && drawRepairList[0][0] != null){?>
                                                    <td>{{drawRepairList[0][0].reptime}}</td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][0].qusitem.indexOf("TZXG01")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span ></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][0].qusitem.indexOf("TZXG02")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][0].qusitem.indexOf("TZXG03")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>
                                                    <?if(drawRepairList[0] != null && drawRepairList[0][0].qusitem.indexOf("TZXG04")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][0].qusitem.indexOf("TZXG05")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][0].qusitem.indexOf("TZXG06")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][0].qusitem.indexOf("TZXG07")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][0].qusitem.indexOf("TZXG08")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][0].qusitem.indexOf("TZXG09")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][0].qusitem.indexOf("TZXG010")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <td>下载</td>
                                                </tr>
                                                <tr>
                                                    <td rowspan="3">复审</td>
                                                    <td>No.2</td>
                                                    <?if(drawRepairList[0] != null && drawRepairList[0][1] != null){?>
                                                    <td>{{drawRepairList[0][1].reptime}}</td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][1].qusitem.indexOf("TZXG01")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][1].qusitem.indexOf("TZXG02")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][1].qusitem.indexOf("TZXG03")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][1].qusitem.indexOf("TZXG04")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][1].qusitem.indexOf("TZXG05")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][1].qusitem.indexOf("TZXG06")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][1].qusitem.indexOf("TZXG07")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][1].qusitem.indexOf("TZXG08")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][1].qusitem.indexOf("TZXG09")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][1].qusitem.indexOf("TZXG010")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <td>下载</td>
                                                </tr>
                                                <tr>
                                                    <td>No.3</td>
                                                    <?if(drawRepairList[0] != null && drawRepairList[0][2] != null){?>
                                                    <td>{{drawRepairList[0][2].reptime}}</td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][2].qusitem.indexOf("TZXG01")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][2].qusitem.indexOf("TZXG02")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][2].qusitem.indexOf("TZXG03")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][2].qusitem.indexOf("TZXG04")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][2].qusitem.indexOf("TZXG05")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][2].qusitem.indexOf("TZXG06")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][2].qusitem.indexOf("TZXG07")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][2].qusitem.indexOf("TZXG08")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][2].qusitem.indexOf("TZXG09")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][2].qusitem.indexOf("TZXG010")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <td>下载</td>
                                                </tr>
                                                <tr>
                                                    <td>No.4</td>
                                                    <?if(drawRepairList[0] != null && drawRepairList[0][3] != null){?>
                                                    <td>{{drawRepairList[0][3].reptime}}</td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][3].qusitem.indexOf("TZXG01")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][3].qusitem.indexOf("TZXG02")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][3].qusitem.indexOf("TZXG03")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][3].qusitem.indexOf("TZXG04")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][3].qusitem.indexOf("TZXG05")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][3].qusitem.indexOf("TZXG06")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][3].qusitem.indexOf("TZXG07")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][3].qusitem.indexOf("TZXG08")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][3].qusitem.indexOf("TZXG09")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[0] != null && drawRepairList[0][3].qusitem.indexOf("TZXG010")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <td>下载</td>
                                                </tr>
                                                </tbody>
                                            </table>
                                            <br>
                                            <p style="color:#ffff00;">图纸审查注释：<span class="red"></span>
                                                表示提交渔船设计图纸相关部分内容不符合法规要求或存在设计缺陷
                                            </p>
                                        </div>
                                        <div class="layui-tab-item">

                                            <table id="drawingChange02" class="table">
                                                <thead style="font-weight: 500;">
                                                <tr>
                                                    <td rowspan="2">审查环节</td>
                                                    <td rowspan="2" colspan="2">修改记录</td>
                                                    <td  colspan="10">审查项目</td>
                                                    <td rowspan="2">修改内容</td>
                                                </tr>
                                                <tr>
                                                    <td>船体结构</td>
                                                    <td>稳性</td>
                                                    <td>载重线</td>
                                                    <td>机器设备</td>
                                                    <td>电气设备</td>
                                                    <td>救生设备</td>
                                                    <td>消防</td>
                                                    <td>航行设备</td>
                                                    <td>信号设备</td>
                                                    <td>防污染设备</td>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                <tr>
                                                    <td>初审</td>
                                                    <td>No.1</td>
                                                    <?if(drawRepairList[1] != null && drawRepairList[1][0] != null){?>
                                                    <td>{{drawRepairList[1][0].reptime}}</td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][0].qusitem.indexOf("TZXG01")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][0].qusitem.indexOf("TZXG02")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][0].qusitem.indexOf("TZXG03")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][0].qusitem.indexOf("TZXG04")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][0].qusitem.indexOf("TZXG05")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][0].qusitem.indexOf("TZXG06")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][0].qusitem.indexOf("TZXG07")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][0].qusitem.indexOf("TZXG08")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][0].qusitem.indexOf("TZXG09")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][0].qusitem.indexOf("TZXG010")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>
                                                    <td>下载</td>
                                                </tr>
                                                <tr>
                                                    <td rowspan="3">复审</td>
                                                    <td>No.2</td>
                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][1] != null){?>
                                                    <td>{{drawRepairList[1][1].reptime}}</td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][1].qusitem.indexOf("TZXG01")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][1].qusitem.indexOf("TZXG02")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][1].qusitem.indexOf("TZXG03")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][1].qusitem.indexOf("TZXG04")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][1].qusitem.indexOf("TZXG05")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][1].qusitem.indexOf("TZXG06")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][1].qusitem.indexOf("TZXG07")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][1].qusitem.indexOf("TZXG08")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][1].qusitem.indexOf("TZXG09")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][1].qusitem.indexOf("TZXG010")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>
                                                    <td>下载</td>
                                                </tr>
                                                <tr>
                                                    <td>No.3</td>
                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][2] != null){?>
                                                    <td>{{drawRepairList[1][2].reptime}}</td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][2].qusitem.indexOf("TZXG01")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][2].qusitem.indexOf("TZXG02")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][2].qusitem.indexOf("TZXG03")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][2].qusitem.indexOf("TZXG04")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][2].qusitem.indexOf("TZXG05")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][2].qusitem.indexOf("TZXG06")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][2].qusitem.indexOf("TZXG07")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][2].qusitem.indexOf("TZXG08")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][2].qusitem.indexOf("TZXG09")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][2].qusitem.indexOf("TZXG010")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>
                                                    <td>下载</td>
                                                </tr>
                                                <tr>
                                                    <td>No.4</td>
                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][3] != null){?>
                                                    <td>{{drawRepairList[1][3].reptime}}</td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][3].qusitem.indexOf("TZXG01")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][3].qusitem.indexOf("TZXG02")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][3].qusitem.indexOf("TZXG03")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][3].qusitem.indexOf("TZXG04")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][3].qusitem.indexOf("TZXG05")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][3].qusitem.indexOf("TZXG06")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][3].qusitem.indexOf("TZXG07")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][3].qusitem.indexOf("TZXG08")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][3].qusitem.indexOf("TZXG09")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[1] != null &&drawRepairList[1][3].qusitem.indexOf("TZXG010")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>
                                                    <td>下载</td>
                                                </tr>
                                                </tbody>
                                            </table>
                                            <br>
                                            <p style="color:#ffff00;">图纸审查注释：<span class="red"></span>
                                                表示提交渔船设计图纸相关部分内容不符合法规要求或存在设计缺陷
                                            </p>
                                        </div>
                                        <div class="layui-tab-item">

                                            <table id="drawingChange03" class="table">
                                                <thead style="font-weight: 500;">
                                                <tr>
                                                    <td rowspan="2">审查环节</td>
                                                    <td rowspan="2" colspan="2">修改记录</td>
                                                    <td  colspan="10">审查项目</td>
                                                    <td rowspan="2">修改内容</td>
                                                </tr>
                                                <tr>
                                                    <td>船体结构</td>
                                                    <td>稳性</td>
                                                    <td>载重线</td>
                                                    <td>机器设备</td>
                                                    <td>电气设备</td>
                                                    <td>救生设备</td>
                                                    <td>消防</td>
                                                    <td>航行设备</td>
                                                    <td>信号设备</td>
                                                    <td>防污染设备</td>
                                                </tr>
                                                </thead>
                                                <tbody>
                                                <tr>
                                                    <td>初审</td>
                                                    <td>No.1</td>
                                                    <?if(drawRepairList[2] != null && drawRepairList[2][0] != null){?>
                                                    <td>{{drawRepairList[2][0].reptime}}</td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][0].qusitem.indexOf("TZXG01")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][0].qusitem.indexOf("TZXG02")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][0].qusitem.indexOf("TZXG03")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][0].qusitem.indexOf("TZXG04")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][0].qusitem.indexOf("TZXG05")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][0].qusitem.indexOf("TZXG06")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][0].qusitem.indexOf("TZXG07")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][0].qusitem.indexOf("TZXG08")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][0].qusitem.indexOf("TZXG09")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][0].qusitem.indexOf("TZXG010")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>
                                                    <td>下载</td>
                                                </tr>
                                                <tr>
                                                    <td rowspan="3">复审</td>
                                                    <td>No.2</td>
                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][1] != null){?>
                                                    <td>{{drawRepairList[2][1].reptime}}</td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][1].qusitem.indexOf("TZXG01")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][1].qusitem.indexOf("TZXG02")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][1].qusitem.indexOf("TZXG03")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][1].qusitem.indexOf("TZXG04")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][1].qusitem.indexOf("TZXG05")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][1].qusitem.indexOf("TZXG06")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][1].qusitem.indexOf("TZXG07")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][1].qusitem.indexOf("TZXG08")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][1].qusitem.indexOf("TZXG09")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][1].qusitem.indexOf("TZXG010")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>
                                                    <td>下载</td>
                                                </tr>
                                                <tr>
                                                    <td>No.4</td>
                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][2] != null){?>
                                                    <td>{{drawRepairList[2][2].reptime}}</td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][2].qusitem.indexOf("TZXG01")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][2].qusitem.indexOf("TZXG02")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][2].qusitem.indexOf("TZXG03")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][2].qusitem.indexOf("TZXG04")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][2].qusitem.indexOf("TZXG05")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][2].qusitem.indexOf("TZXG06")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][2].qusitem.indexOf("TZXG07")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][2].qusitem.indexOf("TZXG08")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][2].qusitem.indexOf("TZXG09")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][2].qusitem.indexOf("TZXG010")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>
                                                    <td>下载</td>

                                                </tr>
                                                <tr>
                                                    <td>No.3</td>
                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][3] != null){?>
                                                    <td>{{drawRepairList[2][3].reptime}}</td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][3].qusitem.indexOf("TZXG01")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][3].qusitem.indexOf("TZXG02")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][3].qusitem.indexOf("TZXG03")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][3].qusitem.indexOf("TZXG04")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][3].qusitem.indexOf("TZXG05")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][3].qusitem.indexOf("TZXG06")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][3].qusitem.indexOf("TZXG07")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][3].qusitem.indexOf("TZXG08")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][3].qusitem.indexOf("TZXG09")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>

                                                    <?if(drawRepairList[2] != null &&drawRepairList[2][3].qusitem.indexOf("TZXG010")>=0){?>
                                                    <td><span class="red"></span></td>
                                                    <?}else{?>
                                                    <td><span></span></td>
                                                    <?}?>
                                                    <td>下载</td>
                                                </tr>
                                                </tbody>
                                            </table>
                                            <br>
                                            <p style="color:#ffff00;">图纸审查注释：<span class="red"></span>
                                                表示提交渔船设计图纸相关部分内容不符合法规要求或存在设计缺陷
                                            </p>
                                        </div>

                                    </div>
                                </div>
                            </script>

                        </div>
                    </div>
                </div>
                <div class="col-sm-6">
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="box01 box">
                                <p class="margin35"><b class="iconSum"></b></p>
                                <p class="numberColor numberStyle"><span class="number repairCount" id="repairCount"></span>次</p>
                                <p class="textSum">图纸整改次数(次)</p >
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-sm-12">
                            <div class="box01 box">
                                <p class="margin35"><b class="iconSum"></b></p>
                                <p class="numberColor numberStyle"><span class="number onShipCount" id="shipCount">7</span>艘</p>
                                <p class="textSum">应用图纸建造渔船数量(艘)</p>
                            </div>
                        </div>
                        <div id='drawing01'></div>
                        <script id="drawingBuild" type="text/template">
                            <div class="picbox">
                                <div id="featured">
                                    <? for(var i = 0;i<shipCountList.length;i++){ ?>
                                    <div class="image" id="image_pic-0<?= (i+1) ?>">
                                        <img src="<?=imaList[i]?>">
                                        <div class="word">
                                            <h3>船名： <span><?=shipCountList[i].shipname?></span></h3>
                                            <p>渔船编号：<span><?=shipCountList[i].shipcode?></span></p>
                                            <p>船舶所有人：<span><?=shipCountList[i].ownername?></span></p>
                                            <p>渔船建造企业：<span><?=shipCountList[i].entnamebul?></span></p>
                                            <p>渔船建造完工日期：<span><?=shipCountList[i].completdate?></span></p>
                                            <p>渔船建造检验日期：<span><?=shipCountList[i].ownerobtdate?></span></p>
                                        </div>
                                    </div>
                                    <?} ?>
                                </div>
                                <div id="thumbs">
                                    <ul>
                                        <li class="first btnPrev"><img id="play_prev" src="../../../resources/style/images/btn_prev.png"></li>
                                      <? for(var i = 0;i<shipCountList.length;i++) { ?>
                                        <li class="slideshowItem"><a id="thumb_pic-0<?= (i+1) ?>" href="javascript:"><img
                                                src="<?=imaList[i]?>" width="78"
                                                height="37"></a></li>
                                        <?}?>
                                        <li class="last btnNext"><img id="play_next" src="../../../resources/style/images/btn_next.png"></li>
                                    </ul>
                                    <div class="clear"></div>
                                </div>

                            </div>

                        </script>

                    </div>
                </div>

            </div>
            <div class="col-sm-6">
                <div class="col-sm-12">
                    <div class="box02 box">
                        <h3 class="title01">关键指标</h3>
                        <div class="row">
                            <div class="col-sm-6">
                                <p class="numberColor numberStyle"><span style="font-size: 48px"class="number" id="shipNo"></span></p>
                                <p class="textSum">船舶型号</p>
                            </div>
                            <div class="col-sm-6">
                                <p class="numberColor numberStyle"><span class="number" id="maxShipCount"></span>艘</p>
                                <p class="textSum">拟建造艘数</p>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-sm-6">
                                <p style="margin-bottom: 10px;" class="numberColor numberStyle" id="shipArea"><span style="font-size: 34px;" class="number"></span></p>
                                <p class="textSum">航区</p>
                            </div>
                            <div class="col-sm-6">
                                <p style="margin-bottom: 10px;" class="numberColor numberStyle" id="shipType"><span style="font-size: 34px;" class="number"></span></p>
                                <p class="textSum">船舶种类</p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

    <div class="row">
        <div class="col-md-12" style="padding-right:5px;width: 1140px;margin-left: 15px;">
            <div class="time" style="height: 660px;">
                <div class="title01">图纸审查历程</div>
                <div class="layui-tab layui-tab-card" lay-filter="demo" style="border: none;">
                    <ul class="layui-tab-title" style="top: 10px;width: 98.4%;left: 10px; border-bottom: none;">
                        <li class="layui-this">第一次审核</li>
                        <li>第二次审核</li>
                        <li>第三次审核</li>
                    </ul>
                    <div class="layui-tab-content">
                        <div class="layui-tab-item layui-show">
                            <div class="time">
                                <div class="wrapper-t">
                                    <div class="content-t">
                                    </div>
                                </div>
                                <%--<div class="t-back"></div>--%>
                                <%--<div class="t-go"></div>--%>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
     </div>
  </div>
        <script type="text/template" id="proc1">
            <div class="xiangqing">
                <p><span class="xiangqingTitle">申请单位：</span><span class="xiangqingCon">{{company}}</span></p>
                <p><span class="xiangqingTitle">申请时间：</span><span class="xiangqingCon">{{time}}</span></p>
                <p><span class="xiangqingTitle">受理机构：</span><span class="xiangqingCon">{{approcompany}}</span></p>
                <p><span class="xiangqingTitle">分批送审：</span><span class="xiangqingCon">{{inturn}}</span></p>
                <p><span class="xiangqingTitle">重大修改：</span><span class="xiangqingCon">{{bigchange}}</span></p>
                <p><span class="xiangqingTitle">修改类型：</span><span class="xiangqingCon">{{bigchangetype}}</span></p>
                <p><span class="xiangqingTitle">附件：</span><span class="xiangqingCon">{{doc1}}</span></p>
            </div>
        </script>
        <script type="text/template" id="proc2">
            <div class="xiangqing">
                <p><span class="xiangqingTitle">受理次数：</span><span class="xiangqingCon">{{acceptcount}}</span></p>
                <p><span class="xiangqingTitle">受理意见：</span><span class="xiangqingCon">{{acceptsugg}}</span></p>
                <p><span class="xiangqingTitle">受理时间：</span><span class="xiangqingCon">{{accepttime}}</span></p>
                <p><span class="xiangqingTitle">农业部审批：</span><span class="xiangqingCon">{{needappro}}</span></p>
                <p<span class="xiangqingTitle">>审批意见：</span><span class="xiangqingCon">{{approsugg}}</span></p>
            </div>
        </script>
        <script type="text/template" id="proc3">
            <div class="xiangqing lis1">
                <p><span class="xiangqingTitle">审查机构：</span><span class="xiangqingCon">{{company}}</span></p>
                <p><span class="xiangqingTitle">审查负责人：</span><span class="xiangqingCon">{{people}}</span></p>
                <p><span class="xiangqingTitle">审查次数：</span><span class="xiangqingCon">{{acceptcount}}</span></p>
                <p><span class="xiangqingTitle">初审时间：</span><span class="xiangqingCon">{{firsttime}}</span></p>
                <p><span class="xiangqingTitle">初审意见：</span><span class="xiangqingCon">{{firstsugg}}</span></p>
                <p><span class="xiangqingTitle">复审时间：</span><span class="xiangqingCon">{{repeattime}}</span></p>
                <p><span class="xiangqingTitle">复审意见：</span><span class="xiangqingCon">{{repeatsugg}}</span></p>
                <p><span class="xiangqingTitle">附件：</span><span class="xiangqingCon">{{doc1}}</span></p>
            </div>
        </script>
        <script type="text/template" id="proc4">
            <div class="xiangqing">
                <p><span class="xiangqingTitle">办结单位：</span><span class="xiangqingCon">{{company}}</span></p>
                <p><span class="xiangqingTitle">审查负责人：</span><span class="xiangqingCon">{{people}}</span></p>
                <p><span class="xiangqingTitle">审查时间：</span><span class="xiangqingCon">{{accepttime}}</span></p>
                <p><span class="xiangqingTitle">审批决定：</span><span class="xiangqingCon">{{acceptsugg}}</span></p>
                <p><span class="xiangqingTitle">图纸有效期：</span><span class="xiangqingCon">{{acceptintime}}</span></p>
                <p><span class="xiangqingTitle">审图计费：</span><span class="xiangqingCon">{{money}}</span></p>
                <p><span class="xiangqingTitle">附件：</span><span class="xiangqingCon">{{doc1}}</span></p>
            </div>
        </script>

    <script type="text/javascript">
        var target = ["pic-01","pic-02","pic-03","pic-04","pic-05","pic-06","pic-07"];
    </script>
        <script src='${script}/chinasofti/ent/drawingapprovalPanel.js'></script>
    </div>