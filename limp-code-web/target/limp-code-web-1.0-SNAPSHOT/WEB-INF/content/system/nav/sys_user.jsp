<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 16-11-22
  Time: 下午10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/content/system/common/taglibs.jsp" %>

<!--top标题 【content_part_1】 -->
<!--/ TITLE -->
<link rel="stylesheet" href="${bootstrap}/css/bootstrap-datetimepicker.min.css">
<link rel="stylesheet" href="${ctx}/systemsite/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">
<script type="text/javascript" src="${ctx}/systemsite/ztree/js/jquery.ztree.core.js"></script>
<script type="text/javascript" src="${ctx}/systemsite/ztree/js/jquery.ztree.excheck.js"></script>

<div class="col-sm-2">
    <div aria-labelledby="myLargeModalLabel" role="dialog" tabindex="-1" class="modal fade bs-example-modal-lg" style="display: none;" id="test">
        <div class="modal-dialog modal-lg" style="width: 70%;">
            <div class="modal-content">

                <div class="modal-header">
                    <button aria-hidden="true" data-dismiss="modal" class="close" type="button">
                        <span class="entypo-cancel"></span>
                    </button>
                    <h6 id="test1" class="modal-title">test</h6>
                </div>
                <div class="modal-body">

                    <div class="compose_mail">

                        <form role="form">
                            <div class="form-group" style="margin-top: 10px;margin-left:20px;width: 80%">

                                <input type="email" placeholder="收件人" id="exampleInputEmail1" class="form-control">
                            </div>
                            <div class="form-group" style="margin-top: 10px;margin-left:20px;width: 80%">

                                <input type="email" placeholder="邮件标题" id="exampleInputPassword1" class="form-control">
                            </div>
                            <%-- <div class="btn-group">
                                 <button data-toggle="dropdown" class="btn dropdown-toggle" type="button">
                                     <span class="fontawesome-font"></span>Normal text
                                     <span class="caret"></span>
                                 </button>
                                 <ul role="menu" class="dropdown-menu">
                                     <li><a href="#">Action</a>
                                     </li>
                                     <li><a href="#">Another action</a>
                                     </li>
                                     <li><a href="#">Something else here</a>
                                     </li>

                                 </ul>

                             </div>--%>

                            <button type="button" class="btn"  style="margin-left:20px;">
                                <span class="entypo-link"></span>
                            </button>
                            <button type="button" class="btn">
                                <span class="entypo-attach"></span>
                            </button>
                            <button type="button" class="btn">
                                <span class="fontawesome-table"></span>
                            </button>
                            <button type="button" class="btn">
                                <span class="fontawesome-camera"></span>
                            </button>


                            <textarea style="height:200px!important;margin-left:20px;margin-top:20px;width: 80%" class="form-control" rows="8"></textarea>


                            <button class="btn" type="submit" style="margin-bottom:20px;margin-top:20px;margin-left: 20px;">发送</button>
                            <button class="btn" type="submit" style="margin-bottom:20px;margin-top:20px;margin-left: 20px;">
                                <span class="fontawesome-save"></span>&nbsp;&nbsp;保存</button>
                        </form>

                    </div>

                </div>
            </div>

        </div>

    </div>
</div>
<style>
    @media screen and (max-width: 600px) {
         #userForm{
             max-height: 400px;  overflow-y: auto;
         }
        .form-group{
            margin-bottom:3px;
            width: 80%;

        }
        .form-horizontal .form-group{
            margin-left:20px;

        }
        .col-sm-6{
            margin-bottom:5px;
        }
        .modal-dialog {
            margin: 7px;
        }
        .content-wrap{     /* <!--适应手机间距-->*/
            padding: 0 10px;
        }
        .col-sm-10{
            padding-right: 5px;
            padding-left: 5px;
        }
    }
</style>
<!-- 弹框用户 -->
<div class="container">
    <a href="#user" id="userWin"  data-toggle="modal" data-target="#user" class="btn btn-primary" style="display: none">点击登录</a>
    <div aria-labelledby="myLargeModalLabel" role="dialog" tabindex="-1" class="modal fade bs-example-modal-lg" style="display: none;"id="user">
        <div class="modal-dialog"> <%-- modal-lg--%>
            <div class="modal-content">
                <div class="modal-header model-header-new">
                    <button aria-hidden="true" data-dismiss="modal" class="close" type="button">
                        <span class="entypo-cancel"></span>
                    </button>
                    <span class="modal-title-logo"><i style="color: #f8bb2b" class="icon icon-document-edit"></i></span>

                    <h6 class="modal-title modal-title-new">用户基本信息
                    </h6>

                </div>
                <div class="modal-body" style="    height: 400px; overflow-y: auto; overflow-x: hidden;">
                    <form id="userForm" action="${ctx}/system/user/updates.action" method="post" class="form-horizontal bucket-form">
                        <div class="form-group" style="margin-top: 10px">
                            <label class="col-sm-3 control-label">账号</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="usrAccount" id="usrAccount" disabled >
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-3 control-label">用户昵称</label>
                            <div class="col-sm-6">
                                <input type="text"  class="form-control" name="usrName" id="usrName"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">用户是否到期</label>
                            <div class="col-sm-6">
                                <select size="1"  name="usrIsautoexpire" id="usrIsautoexpire"  class="form-control">
                                    <option value="0" selected="selected">否</option>
                                    <option value="1">是</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group" >
                            <label class="col-sm-3 control-label">用户到期时间</label>
                            <div class="col-sm-6">
                                <input type="text"  class="form-control input-append date" name="usrExpire"style="width: 200px;float: left" id="usrExpire" readonly/>
                               <%-- <span class="add-on"><i class="icon-remove"></i></span>--%>
                                <span class="input-group-addon add-on entypo-calendar" style="width: 10px;padding:8px 10px;line-height: 17px" id="usrExpireBtn"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">身份证</label>
                            <div class="col-sm-6">
                                <input type="text"  class="form-control" id="rc0" name="usrRc0"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">机构编码</label>
                            <div class="col-sm-6">
                                <input type="text"  class="form-control" id="rc1" name="usrRc1"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">用户类型</label>
                            <div class="col-sm-6">
                                <select size="1"  id="usrRc3" name="usrRc3"  class="form-control">
                                    <option value="" selected="selected">未设置</option>
                                    <option value="0">管理员</option>
                                    <option value="1">type1</option>
                                    <option value="2">type2</option>
                                    <option value="3">type3</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">手机号</label>
                            <div class="col-sm-6">
                                <input type="text"  class="form-control" id="rc2" name="usrRc2"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">邮箱</label>
                            <div class="col-sm-6">
                                <input type="text"  class="form-control" id="usrEmail" name="usrEmail"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">用户状态</label>
                            <div class="col-sm-6">
                                <select size="1"  name="usrState" id="usrState" style="width:130px"  class="form-control">
                                    <option value="0" selected="selected">待审核</option>
                                    <option value="1">正常</option>
                                    <option value="-1">已删除</option>
                                </select>
                            </div> </div>


                        <input type="hidden" name="id" id="userId"/>
                    </form>
                </div>

                <div class="modal-footer">
                    <button type="button" id="usrBtn" class="btn btn-primary">提交</button>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- 新增用户 -->
<div class="container">
    <a href="#user-add" id="userAddWin"  data-toggle="modal" data-target="#user-add" class="btn btn-primary" style="display: none">user-add</a>
    <div aria-labelledby="myLargeModalLabel" role="dialog" tabindex="-1" class="modal fade bs-example-modal-lg" style="display: none;"id="user-add">
        <div class="modal-dialog"> <%-- modal-lg--%>
            <div class="modal-content">
                <div class="modal-header model-header-new">
                    <button aria-hidden="true" data-dismiss="modal" class="close" type="button">
                        <span class="entypo-cancel"></span>
                    </button>
                    <span class="modal-title-logo"><i style="color: #f8bb2b" class="fontawesome-plus"></i></span>
                    <h6 class="modal-title modal-title-new">新增用户
                    </h6>

                </div>
                <div class="modal-body">
                    <form id="userAddForm" action="${ctx}/system/user/add.action" method="post" class="form-horizontal bucket-form">
                        <div class="form-group" style="margin-top: 10px">
                            <label class="col-sm-3 control-label">账号</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="usrAccount"  >
                            </div>
                        </div>

                        <div class="form-group">
                            <label class="col-sm-3 control-label">用户昵称</label>
                            <div class="col-sm-6">
                                <input type="text"  class="form-control" name="usrName"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">密码</label>
                            <div class="col-sm-6">
                                <input type="password"  class="form-control" name="usrPassword"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">身份证</label>
                            <div class="col-sm-6">
                                <input type="text"  class="form-control" name="usrRc0"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">单位编码</label>
                            <div class="col-sm-6">
                                <input type="text"  class="form-control" name="usrRc1"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">用户类型</label>
                            <div class="col-sm-6">
                                <select size="1"  name="usrRc3"  class="form-control">
                                    <option value="" selected="selected">未设置</option>
                                    <option value="0">管理员</option>
                                    <option value="1">type1</option>
                                    <option value="2">type2</option>
                                    <option value="3">type3</option>
                                </select>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">手机号</label>
                            <div class="col-sm-6">
                                <input type="text"  class="form-control" name="usrRc2"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">邮箱</label>
                            <div class="col-sm-6">
                                <input type="text"  class="form-control" name="usrEmail"/>
                            </div>
                        </div>



                        <div class="form-group">
                            <label class="col-sm-3 control-label">用户状态</label>
                            <div class="col-sm-6">
                                <select size="1"  name="usrState"  style="width:130px"  class="form-control">
                                    <option value="0" selected="selected">待审核</option>
                                    <option value="1">正常</option>
                                    <option value="-1">已删除</option>
                                </select>
                            </div> </div>

                    </form>
                </div>

                <div class="modal-footer">
                    <button type="button" id="usr-add-btn" class="btn btn-primary">提交</button>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- 用户配置角色 -->
<div class="container">
    <a href="#userRole" id="user-role-Win"  data-toggle="modal" data-target="#user-role" class="btn btn-primary" style="display: none">点击登录</a>
    <div aria-labelledby="myLargeModalLabel" role="dialog" tabindex="-1" class="modal fade bs-example-modal-lg" style="display: none;"id="user-role">
        <div class="modal-dialog"> <%-- modal-lg--%>
            <div class="modal-content">
                <div class="modal-header model-header-new">
                    <button aria-hidden="true" data-dismiss="modal" class="close" type="button">
                        <span class="entypo-cancel"></span>
                    </button>
                    <span class="modal-title-logo"><i style="color: #f8bb2b" class="icon icon-user-group"></i></span>
                    <h6 class="modal-title modal-title-new">用户角色配置
                    </h6>

                </div>
                <div class="modal-body">
                    <form id="userRoleForm" action="${ctx}/system/user/updates.action" method="post" class="form-horizontal bucket-form">
                        <div class="form-group" style="margin-top: 10px">
                            <label class="col-sm-3 control-label">账号</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="usrAccount" id="uAccount" disabled >
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-3 control-label">角色</label>
                            <div class="col-sm-6">
                                <span class="usr-role-select-btn entypo-down-dir" data-value="" id="roleSet"></span>

                                <input type="text" class="form-control" name="" autocomplete="off"
                                       style="" placeholder="未设置" data-value="" disabled id="role-select" >

                                <ul class="ul-choose" style="display: none">
                                    <li>普通用户</li>
                                    <li>注册用户</li>
                                    <li>管理员</li>
                                </ul>
                            </div>
                            <div class="col-sm-3">
                                <span style="font-size: 12px;color: #ccc"></span>
                            </div>
                        </div>
                        <div class="form-group" style="margin-top: 10px">
                            <label class="col-sm-9 control-label" ><span style="font-size: 12px;color: red">提示：授权后方可选择角色</span><span style="font-size: 12px;">&nbsp;(配置路径：角色管理->指派角色)</span></label>
                        </div>
                        <input type="hidden" name="id" id="userRoleId"/>
                    </form>
                </div>

                <div class="modal-footer">
                    <button type="button" id="usrRoleBtn"  class="btn btn-primary">提交</button>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- 弹框配置次数time -->
<div class="container">
    <a href="#setWin" id="setWinForm"  data-toggle="modal" data-target="#setWin" class="btn btn-primary" style="display: none">点击登录</a>
    <div aria-labelledby="myLargeModalLabel" role="dialog" tabindex="-1" class="modal fade bs-example-modal-lg" style="display: none;"id="setWin">
        <div class="modal-dialog modal-lg" style="width: 600px;">
            <div class="modal-content">
                <div class="modal-header">
                    <button aria-hidden="true" data-dismiss="modal" class="close" type="button">
                        <span class="entypo-cancel"></span>
                    </button>
                    <h6 class="modal-title">权限配置</h6>
                </div>
                <div class="modal-body">
                    <div class="row">
                        <div class="col-sm-12">

                            <div class="nest">

                                <div class="body-nest"  style="display: block;">

                                    <section>
                                        <table class="table table-bordered table-striped cf"id="authT">
                                            <thead class="cf">
                                            <tr>
                                                <th>#</th>
                                                <th>权限名称</th>
                                                <th>关键字</th>
                                                <th>总次数</th>
                                                <th>已使用</th>
                                                <th>剩余</th>
                                                <th>新增</th>
                                                <th>操作</th>
                                            </tr>
                                            </thead>
                                            <tbody>
                                            </tbody>
                                        </table>
                                        <hr>
                                    </section>

                                </div>

                            </div>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" id="authBtn" onclick="main.closeOpenWin()" class="btn btn-primary">关闭</button>
                </div>
            </div>
        </div>
    </div>
</div>

<!-- END OF BREADCRUMB -->
<!--nav_show1 用户区域-->
<div class="content-wrap">
    <div class="row">
        <!-- SIDEMENU MAIL -->
        <div class="col-sm-2"  style="padding-right: 10px; padding-left: 0px;">
            <div class="side-mail">
                <div class="btn btn-info button-mail"  onclick="SysUser.getUserListForTemp(1);">
                    <span class="entypo-arrows-ccw"></span>&nbsp;&nbsp;用户管理</div>
                <%--<c:if test="${KEY_CODE.BTN_USER_MENUSET.VALUE==1||KEY_CODE.ROLE_DEMO_MANAGE.VALUE==1}">
                    <div class="list-btn-mail" style="cursor: pointer" id="userMenu">
                        <span class="entypo-flow-tree"></span><a>配置菜单</a>
                    </div>
                </c:if>--%>
              <%--  <c:if test="${KEY_CODE.BTN_USER_PERMSET.VALUE==1||KEY_CODE.ROLE_DEMO_MANAGE.VALUE==1}">
                    <div class="list-btn-mail" style="cursor: pointer" id="userPerm">
                        <span class="fontawesome-key"></span><a>配置权限</a>&lt;%&ndash;<i>648</i>&ndash;%&gt;
                    </div>
                </c:if>--%>
                <c:if test="${KEY_CODE.BTN_USER_ROLESET.VALUE==1||KEY_CODE.ROLE_DEMO_MANAGE.VALUE==1}">
                    <div class="list-btn-mail" style="cursor: pointer" id="user-role-set">
                        <span class="icon icon-user-group"></span><a>配置角色</a><%--<i>648</i>--%>
                    </div>
                </c:if>
                <c:if test="${KEY_CODE.BTN_USER_ADD.VALUE==1||KEY_CODE.ROLE_DEMO_MANAGE.VALUE==1}">
                    <div class="list-btn-mail" style="cursor: pointer" id="user-to-add">
                        <span class="fontawesome-plus"></span><a>新增用户</a><%--<i>648</i>--%>
                    </div>
                </c:if>
                <c:if test="${KEY_CODE.BTN_USER_DEL.VALUE==1||KEY_CODE.ROLE_DEMO_MANAGE.VALUE==1}">

                    <div class="list-btn-mail" style="cursor: pointer" id="udel">
                        <span class="entypo-trash"></span><a>删除账户</a>
                    </div>
                </c:if>
                <c:if test="${KEY_CODE.BTN_USER_UPDATE.VALUE==1||KEY_CODE.ROLE_DEMO_MANAGE.VALUE==1}">
                    <div class="list-btn-mail" style="cursor: pointer" id="user-basic">
                        <span class="icon icon-document-edit"></span><a>修改用户</a><%--<i>648</i>--%>
                    </div>
                </c:if>
                <c:if test="${KEY_CODE.BTN_USER_PWDRESET.VALUE==1||KEY_CODE.ROLE_DEMO_MANAGE.VALUE==1}">
                    <div class="list-btn-mail" style="cursor: pointer" id="pwd">
                        <span class="fontawesome-key"></span><a>密码重置</a>
                    </div>
                </c:if>
                <hr/>
                <div>&nbsp;&nbsp;&nbsp;组织结构</div>
            <%--组织结构加载--%>
                <div id="loadTree" class="lpLoading"></div>
                <div style="display: none" id="unitId"></div>
                <div class="content_wrap">
                    <div class="TreeDemoBackground left" style="height: 460px; overflow: auto;">
                        <ul id="treeUnitDemo" class="ztree"></ul>
                    </div>
                </div>






               <%-- <div class="list-btn-mail">
                    <span class="fontawesome-bullhorn"></span><a id="utip" style="color: red">...</a>
                </div>--%>

            </div>
            <div aria-labelledby="myLargeModalLabel" role="dialog" tabindex="-1" class="modal fade bs-example-modal-lg" style="display: none;" id="myModalWin">
                <span  data-toggle="modal" id="emailWin" data-target="#myModalWin"></span>
                <div class="modal-dialog ">    <%-- modal-lg--%>
                    <div class="modal-content">

                        <div class="modal-header">
                            <button aria-hidden="true" data-dismiss="modal" class="close" type="button">
                                <span class="entypo-cancel"></span>
                            </button>
                            <h6 id="myLargeModalLabel" class="modal-title">邮件发送</h6>
                        </div>
                        <div class="modal-body">

                            <div class="compose_mail">

                                <form role="form" id="email-form" action="${ctx}/system/msg/saveMsg.action" method="POST">
                                    <div class="form-group" style="margin-top: 10px;margin-left:20px;width: 80%">

                                        <input type="email" placeholder="收件人" id="toName" class="form-control" disabled>
                                    </div>
                                    <div class="form-group" style="margin-top: 10px;margin-left:20px;width: 80%">

                                        <input type="email" name="title" placeholder="邮件标题" id="" class="form-control">
                                    </div>

                                    <textarea name="intro" style="height:200px!important;margin-left:20px;margin-top:20px;width: 80%" class="form-control" rows="8"></textarea>

                                     <input type="hidden" name="type" value="2">
                                     <input type="hidden" name="usridto" id="usridto" value="">
                                    <button class="btn" type="button" style="margin-bottom:20px;margin-top:20px;margin-left: 20px;" id="canle-email">取消</button>
                                    <button class="btn" type="button" style="margin-bottom:20px;margin-top:20px;margin-left: 20px;" id="send-email">
                                        <span class="fontawesome-envelope"></span>&nbsp;&nbsp;发送</button>
                                </form>

                            </div>

                        </div>
                    </div>

                </div>

            </div>
        </div>
        <!-- /SIDEMENU MAIL -->
        <!-- CONTENT MAIL -->
        <div class="col-sm-10 padding0">
                <div class="row">
                    <div class="content-panel content-panel-border" style="min-height: 130px !important;">
                        <div class="table-responsive">
                            <div  action="" method="post" id="sform" class="form-horizontal bucket-form">
                                <div class="form-group" style="margin-top: 10px">
                                    <label class="col-sm-2 control-label">账号名称</label>
                                    <div class="col-sm-4">
                                        <input type="text" id="seaAccount" placeholder="请输入账号..."  class="form-control" >
                                    </div>
                                   <%-- <label class="col-sm-2 control-label">其他参数</label>
                                    <div class="col-sm-3">
                                        <input type="text" class="form-control">
                                    </div>--%>
                                </div>
                                <div style="float: right">
                                    <button type="button" class="btn btn-primary btn-reset" onclick="system.reset()">重置</button>
                                    <button type="button" id="searchUserBtn" class="btn btn-primary" onclick="SysUser.getUserListForTemp(1);">查询</button>
                                </div>
                            </div>
                        </div>
                        <!-- /.table-responsive -->
                    </div>
                    </div>
                <div class="row">
                    <div class="content-panel padding0">
                    <div class="table-responsive">
                        <table class="table  table-striped" id="userTable">

                        </table>
                    </div>
                  </div>
                </div>

        </div>
        <!-- /CONTENT MAIL -->
    </div>
</div>

<!-- 弹框通用 -->
<div class="container">                                                                           <%--  --%>
    <a href="#common" id="commonWin"  data-toggle="modal" data-target="#common" class="btn btn-primary" style="display: none" >点击登录</a>
    <div aria-labelledby="myLargeModalLabel" role="dialog" tabindex="-1" class="modal fade bs-example-modal-lg" style="display: none;"id="common">
        <div class="modal-dialog ">     <%-- modal-lg--%>
            <div class="modal-content">
                <div class="modal-header">
                    <button aria-hidden="true" data-dismiss="modal"  class="close" type="button" id="commonClose">
                        <span class="entypo-cancel"></span>
                    </button>
                    <h6 class="modal-title">用户权限配置
                    </h6>

                </div>
                <div class="modal-body">
                    <form id="commonForm" action="#" method="post" class="form-horizontal bucket-form">
                        <%--<div class="form-group" style="margin-top: 10px">
                            <label class="col-sm-3 control-label">账号</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="usrAccount" id="usrAccount" disabled >
                            </div>
                        </div>--%>

                        <div class="content_wrap" style="margin-left: 30px;">
                            <div id="loadMenu" style="background:url('${ctx}/systemsite/assets/img/loading.gif') no-repeat;width:20px;height:20px;margin: 20px auto;"></div>
                            <div class="zTreeDemoBackground  left">
                                <ul id="treeAuth" class="ztree"></ul>
                            </div>
                        </div>
                    </form>
                </div>

                <div class="modal-footer">
                    <button type="button" id="commonBtn" class="btn btn-primary">提交</button>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- 用户-配置元素权限弹出框-->
<div class="container">                                                                           <%--  --%>
    <a href="#commonPerm" id="commonPermWin"  data-toggle="modal" data-target="#commonPerm" class="btn btn-primary" style="display: none" >点击登录</a>
    <div aria-labelledby="myLargeModalLabel" role="dialog" tabindex="-1" class="modal fade bs-example-modal-lg" style="display: none;"id="commonPerm">
        <div class="modal-dialog ">     <%-- modal-lg--%>
            <div class="modal-content">
                <div class="modal-header">
                    <button aria-hidden="true" data-dismiss="modal"  class="close" type="button" id="commonPermClose">
                        <span class="entypo-cancel"></span>
                    </button>
                    <h6 class="modal-title">用户权限配置
                    </h6>

                </div>
                <div class="modal-body">
                    <form id="commonPermForm" action="#" method="post" class="form-horizontal bucket-form">
                        <%--<div class="form-group" style="margin-top: 10px">
                            <label class="col-sm-3 control-label">账号</label>
                            <div class="col-sm-6">
                                <input type="text" class="form-control" name="usrAccount" id="usrAccount" disabled >
                            </div>
                        </div>--%>

                        <div class="content_wrap" style="margin-left: 30px;">
                            <div id="loadPerm" style="background:url('${ctx}/systemsite/assets/img/loading.gif') no-repeat;width:20px;height:20px;margin: 20px auto;"></div>
                            <div class="zTreeDemoBackground  left">
                                <ul id="treePermAuth" class="ztree"></ul>
                            </div>
                        </div>
                    </form>
                </div>

                <div class="modal-footer">
                    <button type="button" id="commonPermBtn" class="btn btn-primary">提交</button>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="${ctx}/systemsite/assets/js/main/sys_user.js"></script>
<script type="text/javascript" src="${bootstrap}/js/bootstrap-datetimepicker.min.js"></script>
<script type="text/javascript" src="${bootstrap}/js/bootstrap-datetimepicker.zh-CN.js"></script>

<script type="text/javascript">
     SysUser.DemoType="${KEY_CODE.ROLE_DEMO_MANAGE.VALUE}";
    //usrExpireBtn    http://www.bootcss.com/p/bootstrap-datetimepicker/
    $("#usrExpireBtn").datetimepicker({
        language:  'zh-CN',
        format: 'yyyy-mm-dd',
        weekStart: 1,
        todayBtn:  1,
        autoclose: 1,
        linkField: "usrExpire",
        todayHighlight: 1,
        startView: 2,
        maxView:2,//Number, String. 默认值：4, 'decade'  日期时间选择器最高能展示的选择范围视图。
        minView:1,//Number, String. 默认值：4, 'decade'  日期时间选择器最高能展示的选择范围视图。
        forceParse: 0,
        showMeridian: 1 ,
        pickerPosition: "bottom-left"
    });
</script>





