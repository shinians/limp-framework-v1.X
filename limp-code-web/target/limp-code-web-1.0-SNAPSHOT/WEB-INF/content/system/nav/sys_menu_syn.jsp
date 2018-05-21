<%--
   菜单数据同步
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 16-11-22
  Time: 下午10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/content/system/common/sys_head.jsp" %>
<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

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

    <%--引入layer弹框组件--%>
    <script src="${plug}/layer-v3.1.1/layer/layer.js" type="text/javascript"></script>
    <script type="text/javascript" src="${plug}/vue-2.5.6/vue.js"></script>


    <link rel="stylesheet" href="${ctx}/systemsite/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">
    <link rel="stylesheet" href="${ctx}/systemsite/ztree/css/metroStyle/metroStyle.css" type="text/css">
    <script type="text/javascript" src="${ctx}/systemsite/ztree/js/jquery.ztree.core.js"></script>
    <script type="text/javascript" src="${ctx}/systemsite/ztree/js/jquery.ztree.excheck.js"></script>
    <script type="text/javascript" src="${ctx}/systemsite/ztree/js/jquery.ztree.exedit.js"></script>
    <%--树形结构end--%><%--树
    形结构end--%>
    <%--引入layer弹框组件--%>

</head>

<!-- END OF BREADCRUMB -->

<!--nav_show2菜单区域-->
<div class="content-wrap">
<div class="row">
<div class="col-sm-12 padding0" >
    <div class="row">
      <div class="content-panel">
          <addForm ref="addForm">
              <table class="table  table-striped-no-border" id="lp-syn">
                  <tbody>
                  <tr>
                      <td><span><span style="color: red">*&nbsp;</span>数据源地址:</span></td>
                      <td>
                          <input type="text" v-model="domain.url" name="url" class="form-control">
                      </td>
                      <td>
                          <span>父级菜单KEY:</span>
                      </td>
                      <td>
                          <input type="text" v-model="domain.keyWord" name="keyWord" class="form-control"
                                 autocomplete="off">
                      </td>

                  </tr>
                  <%--隐藏按钮：解决方法1->用于控制不在一个单元的点击事件--%>
                  <tr>
                      <td>
                          <input type="button" @click="parseWebData" class="btn btn-primary btn-reset"
                                 name="id" id="synMbt" value="异步加载数据" style="display: none"></td>
                  </tr>

                <%--  <button type="button" class="btn btn-primary" id="synWD" @click="parseWebData1" >
                      &nbsp;&nbsp;异步加载数据
                  </button>--%>

                  <%--<tr>
                      <td>
                          <span>层级:</span></td>
                      <td>
                          <textarea type="text" v-model="domain.level" name="level" autocomplete="off" placeholder="" class="form-control">
                      </td>
                  </tr>--%>
                  </tbody>
              </table>
              </addForm>
          <hr>
          <div class="table-responsive">
              <div class="row">
                  <div class="col-sm-2">
                      <button type="button" class="btn btn-primary" onclick="SysMenuSyn.initClickParse()">
                          &nbsp;&nbsp;异步加载数据
                      </button>
                      <ul id="synTree" class="ztree"></ul>
                  </div>
                  <div class="col-sm-10 padding0">
                      <div class="modal-body">
                          <div class="compose_mail synForm">

                          </div>
                      </div>
                  </div>
              </div>
          </div>
      </div>
    </div>
 </div>
</div>
</div>
<%--菜单表单文件：魔板文件--%>
<script type="text/template" id="synFormScr">
       <form role="form" id="synForm" action="#" method="POST">
      <table class="table  table-striped-no-border">
          <tbody>
          <tr>
              <td><span><span style="color: red">*&nbsp;</span>菜单名称:</span></td>
              <td>
                  <input type="text" v-model="domain.menName" name="menName"
                         class="form-control">
              </td>

              <td>
                  权限标识Key:
              </td>
              <td>
                  <input type="text" v-model="domain.menKeyword" name="menKeyword"
                         class="form-control">
              </td>
          </tr>
          <tr>
              <td>
                  <span>父类菜单:</span>
              </td>
              <td>
                  <input type="text"  disabled value="通过父类标识KEY匹配上级"
                         class="form-control"  style="background-color: #EEA;" autocomplete="off">
              </td>

              <td>
                  <span>标识VALUE:</span>
              </td>
              <td>
                  <input type="text" placeholder="1可以访问；0不可访问" v-model="domain.menRc0"
                         name="menRc0" class="form-control" autocomplete="off">
              </td>

          </tr>
          <tr>

              <td>
                  <span>父类标识KEY:</span></td>
              <td>
                  <input type="text" v-model="domain.menFKeyword" name="menFKeyword"
                         autocomplete="off" placeholder="" class="form-control">
              </td>
              <td>
                  <span>样式:</span></td>
              <td>
                  <input type="text" v-model="domain.menImgUrl" name="menImgUrl"
                         autocomplete="off" placeholder="" class="form-control">
              </td>

          </tr>

          <tr>
              <td><span>菜单类型:</span></td>
              <td>
                  <select size="1" name="menType" v-model="domain.menType"
                          title="0系统 1菜单 2页面 3Tab标签  4新窗口（页面新窗口打开） 5：隐藏  6:iframe控制  10功能按钮"
                          class="form-control">
                      <option value="0" title="一级菜单定义为系统级别菜单">系统</option>
                      <option value="1" title="定义左侧菜单">菜单</option>
                      <option value="2">页面</option>
                      <option value="4" title="点击左侧菜单在新窗口打开">新窗口打开</option>
                      <option value="5" title="左侧菜单不显示">隐藏菜单</option>
                      <option value="6" title="点击左侧菜单，右侧是iframe加载，样式不影响">IFrame加载</option>
                      <option value="10">功能按钮</option>
                  </select>
              </td>
              <td>排序:</td>
              <td>
                  <input type="number" v-model="domain.menSort" name="menSort"
                         class="form-control">

              </td>


          </tr>
          <tr>
              <td><span>Url地址:</span></td>
              <td colspan="3">
                  <textarea
                          style="width: 97%; float: left; border: 1px solid; border-radius: 4px;"
                          class="model-text-new" rows="2" cols="20" name="menUrl"
                          v-model="domain.menUrl" autocomplete="off"></textarea>

              </td>

          </tr>
          <tr>
              <td><span>描述:</span></td>
              <td colspan="3">
                  <textarea class="model-text-new"
                            style="width: 97%; float: left; border: 1px solid; border-radius: 4px;"
                            rows="2" cols="20" name="menDesc" autocomplete="off"
                            v-model="domain.menDesc"></textarea>

              </td>

          </tr>
          <tr>
              <td colspan="2"></td>
              <td>
                  <input type="button" @click="submitMenu" class="btn btn-primary btn-reset"
                         name="id" value="同步该数据">
              </td>
          </tr>
          </tbody>
      </table>


      <input type="hidden" v-model="domain.id" name="id"
             value="12bf8bea67b04fc7998e74b08914bea7">
      <input type="hidden" v-model="domain.menFatherid" name="menFatherid"
             value="DEB05AFBE62DBC6BE040007F01006DFE">

  </form>

</script>
<!---js引入区域-->
<script type="text/javascript" src="${ctx}/systemsite/assets/js/main/sys_menu_syn.js"></script>
<script type="text/javascript" src="${system}/js/preloader.js"></script>
<script type="text/javascript" src="${system}/js/bootstrap.js"></script>
<script type="text/javascript" src="${system}/js/app.js"></script>
<script type="text/javascript" src="${system}/js/load.js"></script>
<%--左侧菜单控制--%>
<script type="text/javascript" src="${system}/js/main/menu.js"></script>
<%--主函数控住--%>
<script type="text/javascript" src="${system}/js/main.js"></script>
<!-- PLUG IN 提示插件-->
<script type="text/javascript" src="${system}/js/pnotify/pnotify.custom.min.js"></script>

