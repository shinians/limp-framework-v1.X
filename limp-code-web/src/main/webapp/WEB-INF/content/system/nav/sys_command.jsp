<%--
  系统管理员查询企业人员信息列表
  User: 张磊
  Date: 2017-8-5
  Time: 21:14
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/content/system/common/taglibs.jsp" %>

<%--
  ~ Copyright (c) 2017. 北京中软国际信息技术有限公司 .
  --%>

<%--<link rel="stylesheet" href="${ctx}/systemsite/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">--%>
<%--<script type="text/javascript" src="${ctx}/systemsite/ztree/js/jquery.ztree.core.js"></script>--%>
<%--<script type="text/javascript" src="${ctx}/systemsite/ztree/js/jquery.ztree.excheck.js"></script>--%>

<%--新增json解析--%>
<link rel="stylesheet" href="${plug}/json-plug/jsonFormater.css" type="text/css">
<script type="text/javascript" src="${plug}/json-plug/jsonFormater.js"></script>

<div class="content-wrap">
    <div class="row">
        <!-- /企业机构信息 -->
        <%--查询功能区--%>
        <div class="col-sm-12 padding0">
            <div class="row">
                <div class="content-panel content-panel-border" style="min-height: 130px !important;">
                    <div class="table-responsive" >
                        <form action="" method="post" id="sform"  class="form-horizontal bucket-form">
                            <div class="form-group" style="margin-top: 10px">
                                <label class="col-sm-2 control-label"> 命令名称</label>
                                <div class="col-sm-3">
                                    <input type="text" id="sname" name="sname"  placeholder="模糊查询..." autocomplete="off" class="form-control">
                                </div>

                                <label class="col-sm-2 control-label"> 命令编码</label>
                                <div class="col-sm-3">
                                    <input type="text" id="scode" name="scode"  placeholder="输入命令编码..." autocomplete="off" class="form-control">
                                </div>

                            </div>

                            <div style="float: right">
                                <button type="button" class="btn btn-primary btn-reset"  onclick="system.resetById('sform')" >重置</button>
                                <%--<button type="button" class="btn btn-primary">查询</button>--%>
                                <button onclick="sysCommand.getCommandList(1)" id="searchLogBtn"  type="button" class="btn btn-primary" >
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
                            <table class="table" >
                                <tbody>
                                <tr id="newPerson">
                                    <td style="padding-top: 10px; text-align: left;" colspan="5">
                                        <button type="button"  onclick="sysCommand.toSave()" class="btn btn-primary" >
                                            <span class="entypo-floppy"></span>&nbsp;&nbsp;新增命令
                                        </button>
                                    </td>

                                </tr>
                                </tbody>
                            </table>
                            <hr style="margin-top: -20px !important; margin-bottom: 15px !important;">
                        </div>


                        <table class="table  table-striped" style="margin-top:-15px;" id="sysCommandList">

                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<!-- 弹框通用 -->
<div class="container">
    <a href="#common_commond" id="commonWin_commond"  data-toggle="modal" data-target="#common_commond" class="btn btn-primary" style="display: none" >点击登录</a>
    <div aria-labelledby="myLargeModalLabel" role="dialog" tabindex="-1" class="modal fade bs-example-modal-lg" style="display: none;"id="common_commond">
        <div class="modal-dialog ">
            <div class="modal-content">
                <div class="modal-header model-header-new">
                    <button aria-hidden="true" data-dismiss="modal" class="close" type="button">
                        <span class="entypo-cancel"></span>
                    </button>
                    <span class="modal-title-logo"><i style="color: #f8bb2b" class="fontawesome-fighter-jet"></i></span>
                    <h6 class="modal-title modal-title-new">新增命令
                    </h6>

                </div>
                <div class="modal-body" style=" height: 270px; overflow: hidden; overflow-y: auto;">
                    <div class="compose_mail">
                        <form role="form" id="commandForm" action="#" method="POST">
                            <table class="table  table-striped-no-border">
                                <tbody>
                                <tr>
                                    <td><span><span style="color: red">*&nbsp;</span>命令名称:</span></td>
                                    <td>
                                        <input type="text" id="cname"  name="cname" autocomplete="off"  class="form-control">
                                    </td>
                                    <td>
                                        <span><span style="color: red">*&nbsp;</span>命令编码:</span>
                                    </td>
                                    <td>
                                        <input type="text" id="ccode" name="ccode" class="form-control" autocomplete="off">

                                    </td>

                                </tr>

                                <tr>
                                    <td>
                                        命令类型:</td>
                                    <td>
                                        <input type="text"name="ctype"  id="ctype"  class="form-control">
                                    </td>
                                </tr>
                                <tr>
                                    <td><span>命令详情:</span></td>
                                    <td colspan="3">
                                        <textarea style="width: 97%; float: left; border: 1px solid; border-radius: 4px;" class="model-text-new" rows="3" cols="30" name="csql" id="csql" autocomplete="off" ></textarea>

                                    </td>

                                </tr>
                                <tr>
                                    <td><span>命令介绍:</span></td>
                                    <td colspan="3">
                                        <textarea class="model-text-new" style="width: 97%; float: left; border: 1px solid; border-radius: 4px;" rows="3" cols="20" name="cintro"  id="cintro" autocomplete="off"></textarea>

                                    </td>

                                </tr>
                                </tbody></table>

                            <input type="hidden" id="id" name="id" value=""/>
                        </form>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" id="usr-add-btn" onclick="sysCommand.save()" class="btn btn-primary">提交</button>
                </div>
            </div>
        </div>
    </div>
</div>
<div class="container">
    <a href="#common1" id="commonWin1"  data-toggle="modal" data-target="#common1" class="btn btn-primary" style="display: none" >点击登录</a>
    <div aria-labelledby="myLargeModalLabel" role="dialog" tabindex="-1" class="modal fade bs-example-modal-lg" style="display: none;background: none repeat scroll 0 0 rgba(0, 0, 0, 0.1)"id="common1">
        <div class="modal-dialog ">
            <div class="modal-content" style="background-color:black;width: 900px;    border-bottom: 1px solid #048cee;">
                <div class="modal-header model-header-new" style="background: black;border-bottom: 1px solid black;border-top: 2px solid #048cee;">
                    <button aria-hidden="true" data-dismiss="modal" class="close" type="button">
                        <span class="entypo-cancel"></span>
                    </button>
                    <span class="modal-title-logo">SQL<%--<i style="color: #f8bb2b" class="fontawesome-fighter-jet"></i>--%></span>
                    <h6 class="modal-title modal-title-new">> &nbsp;running...
                    </h6>

                </div>
                <div class="modal-body" style=" height: 470px; overflow: hidden; overflow-y: auto;">
                    <div class="compose_mail">
                        <form role="form" id="commandForm1" action="#" method="POST">
                            <table class="table  table-striped-no-border">
                                        <div id="cont"></div>
                            </table>

                        </form>
                    </div>
                </div>
                <div class="modal-footer" style="background-color: black">
                    <button type="button"style="background: black !important;" onclick="main.closeOpenWin()" class="btn btn-primary">关闭</button>
                </div>
            </div>
        </div>
    </div>
</div>


<style>
    /*json 样式*/
    pre {background-color:black;outline: 1px solid black; padding: 5px; margin: 5px;border: 1px solid black !important; }
</style>
<script type="text/javascript" src="${system}/js/main/sys_command.js"></script>
<script src="${system}/js/jquery-migrate-1.3.0.min.js" type="text/javascript"></script>
<link href="${system}/css/jbox.min.css" rel="stylesheet" />
<script src="${system}/js/jquery.jBox-2.3.min.js" type="text/javascript"></script>
