<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 16-11-25
  Time: 下午11:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!--如有兼容问题，则注释掉下面一行代码（taglibs）-->
<%@include file="/WEB-INF/content/system/common/taglibs.jsp" %>

<%--树形菜单--%>
<%--<link rel="stylesheet" href="${ctx}/systemsite/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">
<script type="text/javascript" src="${ctx}/systemsite/ztree/js/jquery.ztree.core.js"></script>
<script type="text/javascript" src="${ctx}/systemsite/ztree/js/jquery.ztree.excheck.js"></script>--%>


<!-- 弹框通用 -->
<div class="container">                                                                           <%--  --%>
    <a href="#commonMenu" id="commonWinMenu"  data-toggle="modal" data-target="#commonMenu" class="btn btn-primary" style="display: none" >点击登录</a>
    <div aria-labelledby="myLargeModalLabel" role="dialog" tabindex="-1" class="modal fade bs-example-modal-lg" style="display: none;"id="commonMenu">
        <div class="modal-dialog ">     <%-- modal-lg--%>
            <div class="modal-content">
                <div class="modal-header model-header-new">
                    <button aria-hidden="true" data-dismiss="modal"  class="close" type="button" id="commonClose">
                        <span class="entypo-cancel"></span>
                    </button>
                    <span class="modal-title-logo"><i style="color: #f8bb2b" class="entypo-flow-tree"></i></span>
                    <h6 class="modal-title modal-title-new">菜单权限配置
                    </h6>

                </div>
                <div class="modal-body" style="max-height: 350px; overflow-y: auto;">
                    <form id="commonForm" action="#" method="post" class="form-horizontal bucket-form">
                        <div class="content_wrap" style="margin-left: 30px;">
                            <div id="loadMenu_role" style="background:url('${ctx}/systemsite/assets/img/loading.gif') no-repeat;width:20px;height:20px;margin: 20px auto;"></div>
                            <div class="zTreeDemoBackground  left">
                                <ul id="treeAuthRole" class="ztree"></ul>
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

<%--指派角色范围--%>
<div class="container">                                                                           <%--  --%>
    <a href="#roleRange" id="roleRangeWin"  data-toggle="modal" data-target="#roleRange" class="btn btn-primary" style="display: none" >点击登录</a>
    <div aria-labelledby="myLargeModalLabel" role="dialog" tabindex="-1" class="modal fade bs-example-modal-lg" style="display: none;"id="roleRange">
        <div class="modal-dialog ">     <%-- modal-lg--%>
            <div class="modal-content">
                <div class="modal-header model-header-new">
                    <button aria-hidden="true" data-dismiss="modal"  class="close" type="button" id="roleRWinClose">
                        <span class="entypo-cancel"></span>
                    </button>
                    <span class="modal-title-logo"><i style="color: #f8bb2b" class="fontawesome-hand-right"></i></span>
                    <h6 class="modal-title modal-title-new">配置可选角色数据范围
                    </h6>

                </div>
                <div class="modal-body">
                    <form id="roleRangeForm" action="#" method="post" class="form-horizontal bucket-form">
                        <div class="content_wrap" style="margin-left: 30px;">
                            <div id="loadRange" style="background:url('${ctx}/systemsite/assets/img/loading.gif') no-repeat;width:20px;height:20px;margin: 20px auto;"></div>
                            <div class="zTreeDemoBackground  left">
                                <ul id="treeRoleRange" class="ztree"></ul>
                            </div>
                        </div>
                    </form>
                </div>

                <div class="modal-footer">
                    <button type="button" id="commonRoleRangeBtn" class="btn btn-primary">提交</button>
                </div>
            </div>
        </div>
    </div>
</div>

<%--角色配置元素角色--%>
<div class="container">                                                                           <%--  --%>
    <a href="#rolePer" id="rolePerWin"  data-toggle="modal" data-target="#rolePer" class="btn btn-primary" style="display: none" >点击登录</a>
    <div aria-labelledby="myLargeModalLabel" role="dialog" tabindex="-1" class="modal fade bs-example-modal-lg" style="display: none;"id="rolePer">
        <div class="modal-dialog ">     <%-- modal-lg--%>
            <div class="modal-content">
                <div class="modal-header">
                    <button aria-hidden="true" data-dismiss="modal"  class="close" type="button" id="perWinClose">
                        <span class="entypo-cancel"></span>
                    </button>
                    <h6 class="modal-title">权限配置
                    </h6>

                </div>
                <div class="modal-body">
                    <form id="perForm" action="#" method="post" class="form-horizontal bucket-form">
                        <div class="content_wrap" style="margin-left: 30px;">
                            <div id="loadPer" style="background:url('${ctx}/systemsite/assets/img/loading.gif') no-repeat;width:20px;height:20px;margin: 20px auto;"></div>
                            <div class="zTreeDemoBackground  left">
                                <ul id="treePer" class="ztree"></ul>
                            </div>
                        </div>
                    </form>
                </div>

                <div class="modal-footer">
                    <button type="button" id="commonPerBtn" class="btn btn-primary">提交</button>
                </div>
            </div>
        </div>
    </div>
</div>
<!--nav_show3 角色区域-->
<div class="content-wrap">
    <div class="row">
        <!-- SIDEMENU MAIL -->
        <div class="col-sm-2" style="padding-right: 10px; padding-left: 0px;">
            <div class="side-mail" style="height: 700px">
                <div class="btn btn-info button-mail"
                     onclick="SysRole.getRoleList();" >

                    <span class="entypo-arrows-ccw"></span>
                    &nbsp;   角色管理

                </div>
                <c:if test="${KEY_CODE.BTN_ROLE_MENUSET.VALUE==1||KEY_CODE.ROLE_DEMO_MANAGE.VALUE==1}">
                    <div class="list-btn-mail" style="cursor: pointer" onclick="SysRole.openMenuAuth();">
                        <span class="entypo-flow-tree"></span><a>配置菜单</a>
                    </div>
               </c:if>
                <c:if test="${KEY_CODE.BTN_USER_ROLERANGE.VALUE==1||KEY_CODE.ROLE_DEMO_MANAGE.VALUE==1}">
                    <div class="list-btn-mail" style="cursor: pointer" onclick="SysRole.openRoleRange();">
                        <span class="fontawesome-hand-right"></span><a>指派角色</a>
                    </div>
                </c:if>
                <c:if test="${KEY_CODE.BTN_ROLE_ADD.VALUE==1||KEY_CODE.ROLE_DEMO_MANAGE.VALUE==1}">

                    <div class="list-btn-mail" style="cursor: pointer" onclick="SysRole.toAddRole()">
                        <span class="fontawesome-plus"></span><a>新增角色</a>
                    </div>
                </c:if>
                <c:if test="${KEY_CODE.BTN_ROLE_DEL.VALUE==1}">
                    <div class="list-btn-mail"  onclick="SysRole.delRole('roleCKB')" style="cursor: pointer">
                        <span class="entypo-trash"></span><a>删除角色</a>
                    </div>
                </c:if>
                <c:if test="${KEY_CODE.BTN_ROLE_UPDATE.VALUE==1||KEY_CODE.ROLE_DEMO_MANAGE.VALUE==1}">

                    <div class="list-btn-mail" style="cursor: pointer" onclick="SysRole.toUpdateRole()">
                        <span class="entypo-pencil"></span><a>修改角色</a>
                    </div>
                </c:if>
                <div>&nbsp;</div>

            <%-- <div class="list-btn-mail" style="cursor: pointer" onclick="SysRole.openPermissionAuth();">
                    <span class="fontawesome-key"></span><a>配置权限</a>
                </div>--%>





            </div>
            <a href="#role-win-form" id="open-role-form"  data-toggle="modal" data-target="#role-win-form" class="btn btn-primary" style="display: none">点击登录</a>
            <div aria-labelledby="myLargeModalLabel" role="dialog" tabindex="-1" class="modal fade bs-example-modal-lg" style="display: none;" id="role-win-form">
                <div class="modal-dialog modal-lg" style="width: 600px;">
                    <div class="modal-content">

                        <div class="modal-header model-header-new">
                            <button aria-hidden="true" data-dismiss="modal" class="close" type="button">
                                <span class="entypo-cancel"></span>
                            </button>
                            <span class="modal-title-logo"><i style="color: #f8bb2b" class="entypo-users"></i></span>
                            <h6 id="myLargeModalLabel" class="modal-title modal-title-new">保存角色</h6>
                        </div>
                        <div class="modal-body">

                            <div class="compose_mail">

                                <form role="form" id="role-form" action="${ctx}/system/role/save.action" method="POST">
                                    <div class="form-group" style="margin-top: 10px;margin-left:20px;width: 80%">
                                        <label>角色名称:</label>
                                        <input type="text" name="ureName"placeholder="" id="ureName" class="form-control">
                                    </div>
                                    <div class="form-group" style="margin-top: 10px;margin-left:20px;width: 80%">
                                        <label>角色类型:</label>
                                        <select size="1" id="ureRc3" name="ureRc3" class="form-control">
                                            <option value="1">超级管理员角色</option>
                                            <option value="2">管理角色</option>
                                            <option value="3" >普通角色</option>
                                            <option value="0"  selected="selected">请选择</option>
                                        </select>
                                    </div>
                                    <div class="form-group" style="margin-top: 10px;margin-left:20px;width: 80%">
                                        <label>角色编码:</label>
                                        <input type="text" name="ureRc0"placeholder="唯一识别码" id="ureRc0" class="form-control">
                                    </div>
                                    <div class="form-group" style="margin-top: 10px;margin-left:20px;width: 80%">
                                        <label>角色描述:</label>
                                        <textarea style="height:100px!important;width: 100%"name="ureRemarks" id="ureRemarks" class="form-control" rows="8"></textarea>
                                    </div>
                                    <input type="hidden" name="id" id="id" value="">

                                </form>

                            </div>

                        </div>
                        <div class="modal-footer">
                            <button class="btn" type="button" style="margin-left: 20px;" id="cancel-opt">取消</button>
                            <button class="btn" type="button" style="margin-left: 20px;" id="save-role">
                                <span class="fontawesome-save"></span>&nbsp;&nbsp;保存</button>
                        </div>
                    </div>
                </div>

            </div>
        </div>
        <!-- /SIDEMENU MAIL -->
        <!-- CONTENT MAIL -->
        <div class="col-sm-10 padding0">
            <div class="content-panel padding0">
                <div class="table-responsive">
                    <table class="table  table-striped cf footable-res footable" >
                        <thead>
                        <tr>
                            <th><input type="checkbox" onclick="system.toCheckedBoxByName('roleCKB',this)"></th>
                            <th>序号</th>
                            <th>角色名称</th>
                            <th>角色类型</th>
                            <th>角色编码</th>
                            <th>描述</th>
                        </tr>
                        </thead>
                        <tbody >
                        <tr>
                        </tr>

                        </tbody>
                        <tbody id="roleTable">
                        </tbody>
                    </table>
                    <div style="text-align: center;margin:50px auto;" id="load">
                        <div style="background: url('${ctx}/systemsite/assets/img/loading.gif') no-repeat; height: 20px;margin:50px 50px;" ></div>
                    </div>
                </div>
                <!-- /.table-responsive -->


            </div>
        </div>

        <!-- /CONTENT MAIL -->
    </div>
</div>
<style>
    @media screen and (max-width: 600px) {

        .modal-dialog {
            margin: 30px;
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

<!---js引入区域引入角色控制-->
<script type="text/javascript" src="${system}/js/main/sys_role.js"></script>







