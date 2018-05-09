<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 16-11-26
  Time: 上午12:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<%--消息nav_show4part4消息部分--%>

<%--
  ~ Copyright (c) 2018. 北京中软国际信息技术有限公司 .
  --%>

<div class="container-fluid">
    <div class="row">
        <div class="col-sm-12">
            <div class="nest" id="parseStaticClose">
                <div class="title-alt">
                    <h6>
                        消息列表</h6>

                    <div class="titleClose">
                        <a class="gone" href="#parseStaticClose">
                            <%--<span class="entypo-cancel"></span>--%>
                        </a>
                    </div>
                    <div class="titleToggle">
                        <a class="nav-toggle-alt" href="#prasetableStatic"><span class="entypo-up-open"></span></a>
                    </div>

                </div>
                <ul class="nav nav-tabs" id="nav_3" style="margin-top: 10px">
                    <li class="active" value="1" style="margin-left: 20px;">
                        <select size="1" id="msgZT" style="width: 100px;height:34px;">
                        <option value="" selected="selected">全部</option>
                        <%--用于发送邮件使用,利用格式化工具，格式邮件内容，定时发动给用户--%>
                        <option value="0">魔板消息</option>
                        <%--用于发送内部消息使用，用于用户之间的交流【发件人和收集人如是同一用户意味着是便签的概念】--%>
                        <option value="1">用户消息</option>
                        <option value="2">系统消息</option>

                        <%--<option value="1">百度云视频</option>--%>
                        <%--<option value="2">学习网站（快捷标签）</option>--%>
                        <%--<option value="3">Java技术相关</option>--%>
                        <%--<option value="8">休闲娱乐</option>--%>
                        <%--<option value="9">个人链接</option>--%>
                        <%--<option value="222">私密链接</option>--%>
                    </select></li>
                    <li style="margin-left: 10px;" value="1"><button  onclick="SysMsg.getMsgList(1,1,1,1);" type="button" data-color="#39B3D7" data-opacity="0.95" class="btn button test">
                        <span class="entypo-arrows-ccw"></span>&nbsp;&nbsp;确定</button></li>
                </ul>

                <div id="nav_3_1" class="nav_3">
                    <div class="row">
                        <div class="content-panel padding0">
                            <div class="table-responsive">

                                <table class="table  table-striped" style="margin-top:-15px;" id="sysMsgList">
                                  </table>
                            </div>


                            </div>
                        </div>
                    </div>
                </div>
               <%-- <div id="nav_3_2" class="nav_3" >
                    <form action="${ctx}/system/msg/saveMsg.action" method="post" id="msgForm"  class="form-horizontal bucket-form">
                        <div class="form-group" style="margin-top: 20px">
                            <label class="col-sm-3 control-label">链接类型</label>
                            <div class="col-sm-6">
                                <select size="1" name="ltype" style="width: 200px">
                                    <option value="" selected="selected">全部</option>
                                    <option value="1">百度云视频</option>
                                    <option value="2">学习网站（快捷标签）</option>
                                    <option value="3">Java技术相关</option>
                                    <option value="8">休闲娱乐</option>
                                    <option value="9">个人链接</option>
                                    <option value="222">私密链接</option>
                                </select>
                            </div> </div>
                        <div class="form-group" style="margin-top: 10px">
                            <label class="col-sm-3 control-label">消息标题</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="title">
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-3 control-label">魔板标识</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="usridfrom">
                            </div>
                        </div>


                        <div class="form-group">
                            <label class="col-sm-3 control-label">消息内容</label>
                            <div class="col-sm-6">
                                <textarea type="text" style="height: 100px" name="intro"></textarea>
                            </div>
                        </div>
                        <div class="form-group">
                            <div style="text-align:center ">
                                <input class="btn btn-danger" type="button" onclick="system.saveDomain('#msgForm')" value="提交表单">
                            </div>
                        </div>
                        <input type="hidden" value="0" name="type">
                    </form>
                </div>--%>
            </div>


        </div>
    </div>
</div>


<!---js引入区域-->
<script type="text/javascript" src="${ctx}/systemsite/assets/js/main/sys_msg.js"></script>
