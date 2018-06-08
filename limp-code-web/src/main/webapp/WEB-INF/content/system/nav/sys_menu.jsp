<%--
   菜单管理
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 16-11-22
  Time: 下午10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/content/system/common/taglibs.jsp" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <%--树形结构end--%>
</head>

<!-- END OF BREADCRUMB -->

<!--nav_show2菜单区域-->
<div class="content-wrap">
    <div class="row">

        <!-- SIDEMENU MAIL -->
        <div class="col-sm-2"style="padding-left: 1px">
            <div class="side-mail" <%--style="border: 1px dashed #ccc";--%>>
                <div class="btn btn-info button-mail" id="mtitle">
                    <span class="entypo-flow-tree"></span>&nbsp;菜单管理
                    <span style=" float: right; ">
                        <span class="entypo-arrows-ccw" onclick="SysMenu.fresh();"></span>&nbsp;
                        <span class="entypo-down-open" id="expand1"onclick="SysMenu.expandTreeNode(1)"></span>
                         <span class="entypo-up-open" id="expand0" style="display: none" onclick="SysMenu.expandTreeNode(0)"></span>
                    </span>

                </div>
                <%--<span style="font-size: 11px;color: #cccccc;">&nbsp;&nbsp;&nbsp;可点击右键操作菜单</span>--%>
                <br/>
                <div id="load_menu" class="lpLoading"></div>
                <div class="content_wrap">
                    <div class="TreeDemoBackground left" style="height: 640px; overflow: auto;padding-left: 5px;">
                        <ul id="treeDemo" class="ztree"></ul>
                    </div>
                </div>
            </div>
        </div>

        <div class="col-sm-10 padding0" >
                <div class="row">
                    <div class="content-panel content-panel-border" style="min-height: 130px !important;">
                        <div class="table-responsive">
                            <form action="" method="post" id="sysDictForm" class="form-horizontal bucket-form">
                                <div class="form-group" style="margin-top: 10px">
                                    <label class="col-sm-2 control-label">菜单名称</label>
                                    <div class="col-sm-3">
                                        <input type="text" id="menName" name="menName" placeholder="输入菜单名称..." autocomplete="off" class="form-control">

                                    </div>
                                    <label class="col-sm-2 control-label"> KEY值</label>
                                    <div class="col-sm-3">
                                        <input type="text" id="menKeyword" name="menKeyword" placeholder="输入KEY..." autocomplete="off" class="form-control">
                                    </div>

                                </div>

                                <div style="float: right">
                                    <button type="button" class="btn btn-primary btn-reset" onclick="system.resetById('sysDictForm')" id="resetUserBtn">重置</button>

                                    <button onclick="SysMenu.getMenuPageList(1)" id="searchDictBtn" type="button" class="btn btn-primary">
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
                                    <tr id="newPerson">
                                        <td style="padding-top: 10px; text-align: left;">
                                            <button type="button" onclick="SysMenu.synData()" class="btn btn-primary">
                                                <span class="fontawesome-retweet"></span>&nbsp;&nbsp;数据同步
                                            </button>
                                        </td>

                                    </tr>
                                    </tbody>
                                </table>
                                <hr style="margin-top: -20px !important; margin-bottom: 15px !important;">
                            </div>
                            <table class="table table-bordered table-striped cf" style="margin-top:-15px;"
                                   id="sysMenuList">

                            </table>
                        </div>
                    </div>
                </div>


            <div>
               <%-- <div class="table-responsive" style="margin-top: 20px">
                    <form action=""id="menuForm"method="post">
                        <table class="table table-bordered table-striped cf" id="menuDetail——">
                          &lt;%&ndash;  <thead>
                                <tr>
                                    <th colspan="2" style="text-align: center">菜单详情</th>
                                </tr>
                            </thead>
                            <tbody>

                            </tbody>&ndash;%&gt;
                        </table>
                    </form>
                </div>--%>
                <!-- /.table-responsive -->
            </div>
        </div>
        <!-- /CONTENT MAIL -->
    </div>
    <%--右键操作--%>
    <div id="rMenu">
        <ul>
            <c:if test="${KEY_CODE.BTN_MENU_ADD.VALUE==1||KEY_CODE.ROLE_DEMO_MANAGE.VALUE==1}">
                <li id="m_add" onclick="SysMenu.tosaveMenu()"><span class="fontawesome-plus"></span>&nbsp;&nbsp;&nbsp;新增菜单</li>
            </c:if>
            <c:if test="${KEY_CODE.BTN_MENU_DEL.VALUE==1||KEY_CODE.ROLE_DEMO_MANAGE.VALUE==1}">
                <li id="m_del" onclick="SysMenu.delMenu()"><span class="entypo-trash"></span>&nbsp;&nbsp;&nbsp;删除菜单</li>
            </c:if>
            <%--<li id="m_check" onclick="checkTreeNode(true);">Check节点</li>--%>
        </ul>
    </div>
</div>


<!-- 弹框通用 -->
<div class="container">
    <a href="#common_menu" id="commonWin_menu"  data-toggle="modal" data-target="#common_menu" class="btn btn-primary" style="display: none" >点击登录</a>
    <div aria-labelledby="myLargeModalLabel" role="dialog" tabindex="-1" class="modal fade bs-example-modal-lg" style="display: none;"id="common_menu">
        <div class="modal-dialog ">
            <div class="modal-content">
                <div class="modal-header model-header-new">
                    <button aria-hidden="true" data-dismiss="modal" class="close" type="button">
                        <span class="entypo-cancel"></span>
                    </button>
                    <span class="modal-title-logo"><i style="color: #f8bb2b" class="entypo-flow-tree"></i></span>
                    <h6 class="modal-title modal-title-new">新增菜单
                    </h6>

                </div>
                <div class="modal-body" style=" height: 380px; overflow: hidden; overflow-y: auto;">
                    <div class="compose_mail">
                        <form role="form" id="menuForm" action="#" method="POST">
                            <table class="table  table-striped-no-border">
                                <tbody>
                                <tr>
                                    <td><span><span style="color: red">*&nbsp;</span>菜单名称:</span></td>
                                    <td>
                                        <input type="text" id="mName"  name="menName" autocomplete="off"  class="form-control">
                                    </td>
                                    <td>
                                        <span>父类菜单:</span>
                                    </td>
                                    <td>
                                        <input type="text" id="fname"  class="form-control" autocomplete="off" readonly="readonly">

                                    </td>

                                </tr>

                                <tr>
                                    <td>
                                        权限标识Key:</td>
                                    <td>
                                        <input type="text"name="menKeyword"  id="menKeyword1"  class="form-control">
                                    </td>
                                    <td>
                                        <span>标识VALUE:</span>
                                    </td>
                                    <td>
                                        <input type="text" placeholder="1可以访问；0不可访问" id="menRc01" name="menRc0" class="form-control" autocomplete="off">
                                    </td>


                                </tr>
                                <tr>
                                    <td>排序:</td>
                                    <td>
                                        <input type="number" id="menSort1" name="menSort" class="form-control" >

                                    </td>
                                    <td>
                                        <span>样式:</span></td>
                                    <td>
                                        <input type="text" id="menImgUrl1" name="menImgUrl" autocomplete="off" placeholder="" class="form-control" >
                                    </td>

                                </tr>

                                <tr>
                                    <td><span>菜单类型:</span></td>
                                    <td>
                                        <select size="1"name="menType"  id="menType" title="0系统 1菜单 2页面 3Tab标签  4新窗口（页面新窗口打开） 5：隐藏  6:iframe控制  10功能按钮" class="form-control"> ' +
                                            '
                                            <option value="0" title="一级菜单定义为系统级别菜单">系统</option>
                                            <option value="1" title="定义左侧菜单">菜单</option>
                                            <option value="2">页面</option>
                                            <option value="4" title="点击左侧菜单在新窗口打开">新窗口打开</option>
                                            <option value="5" title="左侧菜单不显示">隐藏菜单</option>
                                            <option value="6" title="点击左侧菜单，右侧是iframe加载，样式不影响">IFrame加载</option>
                                            <option value="10">功能按钮</option>
                                        </select>

                                    </td>


                                </td>
                                </tr>
                                <tr>
                                    <td><span>Url地址:</span></td>
                                    <td colspan="3">
                                        <textarea style="width: 97%; float: left; border: 1px solid; border-radius: 4px;" class="model-text-new" rows="3" cols="20" name="menUrl" id="menUrl1" autocomplete="off" ></textarea>

                                    </td>

                                </tr>
                                <tr>
                                    <td><span>描述:</span></td>
                                    <td colspan="3">
                                        <textarea class="model-text-new" style="width: 97%; float: left; border: 1px solid; border-radius: 4px;" rows="3" cols="20" name="menDesc"  autocomplete="off"  id="menDesc1"></textarea>

                                    </td>

                                </tr>
                                </tbody></table>


                            <input type="hidden" id="mId" name="id" value=""/>
                            <input type="hidden" id="fId" name="menFatherid" value=""/>

                        </form>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" id="usr-add-btn" onclick="SysMenu.saveMenu()" class="btn btn-primary">提交</button>
                </div>
            </div>
        </div>
    </div>
</div>


<!---js引入区域-->
<script type="text/javascript" src="${ctx}/systemsite/assets/js/main/sys_menu.js"></script>
