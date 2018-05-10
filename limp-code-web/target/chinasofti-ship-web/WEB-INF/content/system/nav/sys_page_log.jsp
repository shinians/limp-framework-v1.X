<%--
  系统管理员查询企业人员信息列表
  User: 张磊
  Date: 2017-8-5
  Time: 21:14
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<%--
  ~ Copyright (c) 2017. 北京中软国际信息技术有限公司 .
  --%>

<link rel="stylesheet" href="${ctx}/systemsite/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">
<script type="text/javascript" src="${ctx}/systemsite/ztree/js/jquery.ztree.core.js"></script>
<script type="text/javascript" src="${ctx}/systemsite/ztree/js/jquery.ztree.excheck.js"></script>
<div class="content-wrap">
    <div class="row">
        <!-- /企业机构信息 -->
        <%--查询功能区--%>
        <div class="col-sm-12 padding0">
            <div class="row">
                <div class="content-panel content-panel-border" style="min-height: 130px !important;">
                    <div class="table-responsive" >
                        <form action="" method="post" id="sysLogForm"  class="form-horizontal bucket-form">
                            <div class="form-group" style="margin-top: 10px">
                                <label class="col-sm-2 control-label"> 账号</label>
                                <div class="col-sm-3">
                                    <input type="text" id="logAccount" name="logAccount"  placeholder="输入账号..." autocomplete="off" class="form-control">
                                </div>
                                <label class="col-sm-2 control-label">操作类型</label>
                                <div class="col-sm-3">
                                    <select style="height: 36px;" id="logType">
                                        <option value="">全部</option>
                                        <option value="SELECT">查询</option>
                                        <option value="UPDATE">更新</option>
                                        <option value="DELETE">删除</option>
                                        <option value="DELETE">新增</option>
                                    </select>
                                    <%--<input type="text" id="dictdataName" name="dictdataName"  placeholder="输入分类名称..." autocomplete="off" class="form-control">--%>

                                </div>
                            </div>
                            <div class="form-group" style="margin-top: 10px">
                                <label class="col-sm-2 control-label"> 参数</label>
                                <div class="col-sm-3">
                                    <input type="text" id="logParam" name="logAccount"  placeholder="参数模糊查询..." autocomplete="off" class="form-control">
                                </div>

                            </div>

                            <div style="float: right">
                                <button type="button" class="btn btn-primary btn-reset"  onclick="system.resetById('sysLogForm')" >重置</button>
                                <%--<button type="button" class="btn btn-primary">查询</button>--%>
                                <button onclick="sysLog.getLogList(1)" id="searchLogBtn"  type="button" class="btn btn-primary" >
                                    查询
                                </button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>

            <div class="row">
                <div class="content-panel padding0">
                    <div class="table-responsive" id="userInfos">
                        <div class="table-tools">
                            <table class="table">
                                <tbody>
                                <tr>
                                    <%--open-addUser-form--%>

                                    <%-- <td style="padding-top: 10px; text-align: left;" colspan="5">
                                         <c:if test="${KEY_CODE.COMP_BTN_USER_ADD.VALUE==1}">
                                             <button id="addUser" style="margin-right:4px" type="button" data-color="#39B3D7" data-opacity="0.95" class="btn button test pull">
                                                 <span class="entypo-user-add"></span>&nbsp;&nbsp;新增用户
                                             </button>
                                         </c:if>
                                     </td>--%>
                                </tr>
                                </tbody>
                            </table>
                            <hr style="margin-top: -20px !important; margin-bottom: 15px !important;">
                        </div>
                        <table class="table  table-striped" style="margin-top:-15px;" id="sysLogList">

                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="${system}/js/main/sys_page_log.js"></script>
<script src="${system}/js/jquery-migrate-1.3.0.min.js" type="text/javascript"></script>
<link href="${system}/css/jbox.min.css" rel="stylesheet" />
<script src="${system}/js/jquery.jBox-2.3.min.js" type="text/javascript"></script>
