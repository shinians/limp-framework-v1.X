<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 16-11-26
  Time: 上午12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/content/system/common/sys_head.jsp" %>

<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <%--动态加载css样式--%>
    <link rel="stylesheet" href="${system}/css/loader-style.css">
    <link rel="stylesheet" href="${system}/css/bootstrap.css">
    <link rel="stylesheet" href="${plug}/css/system.css">
    <link rel="stylesheet" href="${system}/css/mail.css">
    <!-- 整体菜单控制 -->
    <!--视频播放-->
    <link rel="stylesheet" href="${system}/css/social.css">
    <%--自定义样式文件：注意，个性话样式请在此文件书写--%>
    <link rel="stylesheet" href="${ctx}/resources/properties/sys_user_main.css">
    <!--表格兼容性-->
    <link href="${system}/js/stackable/stacktable.css" rel="stylesheet">
    <link href="${system}/js/stackable/responsive-table.css" rel="stylesheet">

    <link rel="stylesheet" href="${system}/css/style.css">
    <script type="text/javascript" src="${plug}/vue-2.5.6/vue.js"></script>

    <style type="text/css">
        /* 控制下拉框*/
        body{
            line-height: 1.428571429;
        }
        [v-cloak] {
            display: none;
        }
        /*当vue需要加载数据多或者网络慢时，加载数据时候会先出现vue模板（例如item.name），用户体验特别不好
        解决方法：
        1、可以通过VUE内置的指令v-cloak解决这个问题（推荐）
         具体实现：<ul v-cloak v-for="item in items">
            <li>{{ item.name }}</li> </ul> CSS中添加 [v-cloak]{ display: none; }
        2、可以在需要编译的元素前后加上<template></template>
        3、通过切换需要编译元素的display属性，最开始设为none，请求完数据后设为block
        4、VUE前置加载*/
    </style>
    <script>
        $(function(){
            var va=new Vue({
                el:"#allPerson",
                data:{per:{nan:113,nv:112,weizhi:211}},
                methods:{
                    handleInput: function() {

                    }
                }
            })
        })

    </script>
</head>
<!--视频-->
<div class="content-wrap" style="height: 400px;padding: 18px 24px;">
    <div class="row">
        <div class="col-sm-3">
            <div class="panel panel-default">
                <div class="panel-facebook">
                                <span class="entypo-users middle-social">

                                </span>
                </div>
                <div class="panel-body">
                    <p class="lead">用户总量</p>
                    <p class="social-follower" v-cloak id="allPerson">   <%--<input type="text" v-model="per.nan" @input="handleInput">--%>男 {{per.nan}}人, 女 {{per.nv}}人，未知 {{per.weizhi}}人</p>

                    <p>
                        <img src="${ctx}/systemsite/assets/img/tx.png" alt="" class="social-pic img-circle">
                        <img src="${ctx}/systemsite/assets/img/tx.png" alt="" class="social-pic img-circle">

                        <a href="#" class="link-social">
                            <span class="entypo-link"></span>
                        </a>
                        <a href="#" class="link-social">
                            <span class="entypo-mail"></span>
                        </a>

                    </p>
                </div>
            </div>
        </div>
        <!--/col-->

        <div class="col-sm-3">
            <div class="panel panel-default">
                <div class="panel-twitter">
                    <span class="entypo-chart-line middle-social"></span>
                </div>
                <div class="panel-body">
                    <p class="lead">一周内新增量</p>
                    <p>男 34人, 女 50人，未知 26人</p>

                    <p>
                        <img src="${ctx}/systemsite/assets/img/tx.png" alt="" class="social-pic img-circle">
                        <img src="${ctx}/systemsite/assets/img/tx.png" alt="" class="social-pic img-circle">

                        <a href="#" class="link-social">
                            <span class="entypo-link"></span>
                        </a>
                        <a href="#" class="link-social">
                            <span class="entypo-mail"></span>
                        </a>
                    </p>
                </div>
            </div>
        </div>
        <!--/col-->

        <div class="col-sm-3">
            <div class="panel panel-default">
                <div class="panel-instagram">
                    <span class="entypo-login middle-social"></span>
                </div>
                <div class="panel-body">
                    <p class="lead">当天登陆人数</p>
                    <p>男 34人, 女 50人，未知 26人</p>

                    <p>
                        <img src="${ctx}/systemsite/assets/img/tx.png" alt="" class="social-pic img-circle">
                        <img src="${ctx}/systemsite/assets/img/tx.png" alt="" class="social-pic img-circle">

                        <a href="#" class="link-social">
                            <span class="entypo-link"></span>
                        </a>
                        <a href="#" class="link-social">
                            <span class="entypo-mail"></span>
                        </a>
                    </p>
                </div>
            </div>
        </div>
        <!--/col-->

        <div class="col-sm-3">
            <div class="panel panel-default">
                <div class="panel-google">
                    <span class="entypo-user middle-social"></span>
                </div>
                <div class="panel-body">
                    <p class="lead">当前在线人数</p>
                    <p>男 14人, 女 30人，未知 16人</p>

                    <p>
                        <img src="${ctx}/systemsite/assets/img/tx.png" alt="" class="social-pic img-circle">
                        <img src="${ctx}/systemsite/assets/img/tx.png" alt="" class="social-pic img-circle">

                        <a href="#" class="link-social">
                            <span class="entypo-link"></span>
                        </a>
                        <a href="#" class="link-social">
                            <span class="entypo-mail"></span>
                        </a>
                    </p>
                </div>
            </div>
        </div>
    </div>
    <div class="row">
        <div class="col-md-12">
            <div class="box" style="background-color: #cccccc">
                <div class="box-body">
                    <div class="row">
                        <div class="col-md-8">
                            <div class="chart">
                                <div id="myChart" style="height: 320px; width: 640px;"></div>
                                <%--<script src="http://echarts.baidu.com/dist/echarts.common.min.js"></script>--%>
                            </div>
                            <!-- /.chart-responsive -->
                        </div>
                        </div>
                    <script>
                        var option = {
                            title : {
    //                            text: '2018-4统计'
                            },
                            tooltip : {
                                trigger: 'axis'
                            },
                            legend: {
                                data:['接口访问量','人员登录量','数据同步量']
                            },
                            toolbox: {
                                show : true,
                                feature : {
                                    mark : {show: true},
                                    dataView : {show: true, readOnly: false},
                                    magicType : {show: true, type: ['line', 'bar', 'stack', 'tiled']},
                                    restore : {show: true},
                                    saveAsImage : {show: true}
                                }
                            },
                            calculable : true,
                            grid : {
                                top: '49',
                                right: '40',
                                bottom: '30'
                            },
                            xAxis : [
                                {
                                    type : 'category',
                                    boundaryGap : false,
                                    data : ['周一','周二','周三','周四','周五','周六','周日']
                                }
                            ],
                            yAxis : [
                                {
                                    type : 'value'
                                }
                            ],
                            series : [
                                {
                                    name:'接口访问量',
                                    type:'line',
                                    smooth:true,
                                    itemStyle: {normal: {areaStyle: {type: 'default'}}},
                                    data:[10, 12, 21, 54, 260, 830, 710]
                                },
                                {
                                    name:'人员登录量',
                                    type:'line',
                                    smooth:true,
                                    itemStyle: {normal: {areaStyle: {type: 'default'}}},
                                    data:[30, 182, 434, 791, 390, 30, 10]
                                },
                                {
                                    name:'数据同步量',
                                    type:'line',
                                    smooth:true,
                                    itemStyle: {normal: {areaStyle: {type: 'default'}}},
                                    data:[1320, 1132, 601, 234, 120, 90, 20]
                                }
                            ]
                        };
                        $(function(){
//                            $("#myChart").initBIOption(option,21,{})
                        })

                </script>

                    <!-- /.col -->
                    </div>
                    <!-- /.row -->
                </div>
                <!-- ./box-body -->

                <!-- /.box-footer -->
            </div>
            <!-- /.box -->
        </div>
        <!-- /.col -->
    </div>
</div>
<script type="text/javascript" src="${ctx}/systemsite/assets/js/preloader.js"></script>
<script type="text/javascript" src="${ctx}/systemsite/assets/js/bootstrap.js"></script>
<script type="text/javascript" src="${ctx}/systemsite/assets/js/load.js"></script>
<%--<script type="text/javascript" src="${script}/chinasofti/bi/bi_option.js"></script>--%>



<!-- /END OF CONTENT -->
