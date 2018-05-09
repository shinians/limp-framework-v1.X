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
<!DOCTYPE html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${ctx}/systemsite/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">
    <script type="text/javascript" src="${ctx}/systemsite/ztree/js/jquery.ztree.core.js"></script>
    <script type="text/javascript" src="${ctx}/systemsite/ztree/js/jquery.ztree.excheck.js"></script>
    <%--树形结构end--%>

</head>

<!-- END OF BREADCRUMB -->

<!--nav_show2菜单区域-->
<div class="content-wrap">
    <div class="row">
        <!-- SIDEMENU MAIL -->
        <div class="col-sm-4"style="padding-left: 1px">
            <div class="side-mail">
                <div class="btn btn-info button-mail" id="mtitle" onclick="SysPermission.initTree();">
                    <i class="icon icon-menu"></i>&nbsp;&nbsp;权限管理 &nbsp;&nbsp;&nbsp;&nbsp; <span class="entypo-arrows-ccw"></span>&nbsp;&nbsp;Refresh
                </div>
                <div id="load" style="background:url('${ctx}/systemsite/assets/img/loading.gif') no-repeat;width:20px;height:20px"></div>
                <div class="content_wrap">
                    <div class="TreeDemoBackground left" style="height: 360px; overflow: auto;">
                        <ul id="treeDemo" class="ztree"></ul>
                    </div>
                </div>
            </div>
        </div>
        <!-- /SIDEMENU MAIL -->
        <!-- CONTENT MAIL -->
        <div class="col-sm-8" style="padding-left: 1px;padding-right:1px">
            <div class="mail_header">
                <div class="row">
                    <div class="col-sm-6"style="width: 100%;padding-left:1px">
                        <button style="margin-right:4px" onclick="SysPermission.toSavePermission()" type="button" data-color="#39B3D7" data-opacity="0.95" class="btn button test pull-left">
                            <span class="maki-hospital"></span><a>&nbsp;&nbsp;新建</a></button>

                        <button style="margin-right:4px" onclick="SysPermission.savePermission()" type="button" data-color="#39B3D7" data-opacity="0.95" class="btn button test pull-left">
                            <span class="entypo-floppy"></span><a>&nbsp;&nbsp;保存</a></button>


                        <button style="margin-right:4px" onclick="SysPermission.delPermission()" type="button" data-color="#39B3D7" data-opacity="0.95" class="btn button test pull-left">
                            <span class="entypo-trash"></span><a>&nbsp;&nbsp;删除</a></button>

                    </div>
                </div>
            </div>
            <div>
                <div class="table-responsive" style=" background-color: white;margin-top: 20px">
                    <form action=""id="permissionForm"method="post">
                        <table class="table table-bordered table-striped cf" style="color:rebeccapurple;">
                            <thead>
                            <tr>
                                <th colspan="2" style="text-align: center">权限详情</th>
                            </tr>
                            </thead>
                            <tbody id="permissionDetail">

                            </tbody>
                        </table>
                    </form>
                </div>
                <!-- /.table-responsive -->
            </div>
        </div>
        <!-- /CONTENT MAIL -->
    </div>
</div>

<!---js引入区域-->
<script type="text/javascript" src="${ctx}/systemsite/assets/js/main/sys_permission.js"></script>
