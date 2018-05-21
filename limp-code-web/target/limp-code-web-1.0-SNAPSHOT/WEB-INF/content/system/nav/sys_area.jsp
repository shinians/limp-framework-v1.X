<%--
  系统管理员查询企业人员信息列表
  User: 张磊
  Date: 2017-8-5
  Time: 21:14
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/content/system/common/taglibs.jsp" %>

<%--
  ~ Copyright (c) 2018. 北京中软国际信息技术有限公司 .
  --%>

<link rel="stylesheet" href="${ctx}/systemsite/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">
<%--（1）加载layui--%>
<%--<link rel="stylesheet" href="${plug}/layui-v2.2.6/css/layui.css" type="text/css">--%>
<link rel="stylesheet" href="${ctx}/systemsite/ztree/css/zTreeStyle/zTreeStyle.css" type="text/css">
<link rel="stylesheet" href="${ctx}/systemsite/ztree/css/metroStyle/metroStyle.css" type="text/css">
<%--<script type="text/javascript" src="${ctx}/systemsite/ztree/js/jquery.ztree.exedit.js"></script>--%>

<script type="text/javascript" src="${ctx}/systemsite/ztree/js/jquery.ztree.core.js"></script>
<script type="text/javascript" src="${ctx}/systemsite/ztree/js/jquery.ztree.excheck.js"></script>
<div class="content-wrap">
    <div class="row">
        <div class="col-sm-2" style="padding-right: 20px;padding-left: 1px" id="comp-tree">
            <div class="side-mail">
                <div class="btn btn-info button-mail"  onclick="sysDict.refresh()">
                    <span class="entypo-arrows-ccw"></span> &nbsp;&nbsp;码表信息
                </div>
                <%--企业信息加载--%>
                <div id="loadTree" style="background:url('${ctx}/systemsite/assets/img/loading.gif') no-repeat;width:20px;height:20px"></div>
                <div style="display: none" id="unitId"></div>
                <div class="content_wrap">
                    <div class="TreeDemoBackground left" style="height: 760px; overflow: auto;">
                        <ul id="treeInfo" class="ztree"></ul>
                    </div>
                </div>
            </div>
        </div>
        <!-- /企业机构信息 -->
        <%--查询功能区--%>
        <div class="col-sm-10 padding0">
            <div class="row">
                <div class="content-panel content-panel-border" style="min-height: 130px !important;">
                    <div class="table-responsive" >
                        <form action="" method="post" id="sysDictForm"  class="form-horizontal bucket-form">
                            <div class="form-group" style="margin-top: 10px">
                                <label class="col-sm-2 control-label"> KEY值</label>
                                <div class="col-sm-3">
                                    <input type="text" id="code" name="code"  placeholder="输入code..." autocomplete="off" class="form-control">
                                </div>
                                <label class="col-sm-2 control-label">地区名称</label>
                                <div class="col-sm-3">
                                    <input type="text" id="name" name="name"  placeholder="输入地区名称..." autocomplete="off" class="form-control">

                                </div>
                            </div>

                            <div style="float: right">
                                <button type="button" class="btn btn-reset"  onclick="system.resetById('sysDictForm')" id="resetUserBtn">重置</button>
                                <%--<button type="button" class="btn btn-primary">查询</button>--%>
                                <button onclick="sysArea.getDomainList(1)" id="searchDictBtn"  type="button" class="btn btn-primary" >
                                    查询
                                </button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>

            <div class="row">
            <div class="content-panel padding0">
                <div class="table-responsive" id="area-info">
                    <div class="table-tools">
                        <table class="table">
                            <tbody>
                            <tr>
                                    <%--open-addUser-form--%>
                                <td style="padding-top: 10px; text-align: left;" colspan="5">
                                    <%--<c:if test="${KEY_CODE.COMP_BTN_USER_ADD.VALUE==1}">--%>
                                        <button  @click="handleAddDomain" style="margin-right:4px" type="button" data-color="#39B3D7" data-opacity="0.95" class="btn button test pull">
                                            <span class="entypo-plus-circled"></span>&nbsp;&nbsp;新增地区
                                        </button>
                                    <%--</c:if>--%>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                        <hr style="margin-top: -20px !important; margin-bottom: 15px !important;">
                    </div>
                    <table class="table  table-striped" style="margin-top:-15px;" id="sysAreaList">

                    </table>
                </div>
                <%--<div class="opera-layer">
                    <ul class="opera-layer-ul">
                        <li><span class="opera-layer-logo"></span>示例弹层</li>
                        <li><span class="opera-layer-logo"></span>示例弹层</li>
                        <li><span class="opera-layer-logo"></span>示例弹层</li>
                        <li><span class="opera-layer-logo"></span>示例弹层</li>
                        <li><span class="opera-layer-logo"></span>示例弹层</li>
                    </ul>
                </div>--%>
            </div>
            </div>
        </div>
    </div>
</div>

<script type="text/javascript" src="${system}/js/main/sys_area.js"></script>
<script src="${system}/js/jquery-migrate-1.3.0.min.js" type="text/javascript"></script>
<link href="${system}/css/jbox.min.css" rel="stylesheet" />
<script src="${system}/js/jquery.jBox-2.3.min.js" type="text/javascript"></script>
<%--修改信息--%>
<script type="text/template" id="tkUpdateDomain" >
    <div class="modal-body" style="overflow: hidden; overflow-y: auto;">
        <div class="compose_mail">
            <form role="form" class="lpform" action="#" method="POST">

            <table class="table  table-striped-no-border">
                <tbody>
                <tr>
                    <td><span><span style="color: red">*&nbsp;</span>地区编码:</span></td>
                    <td>
                        <%--<input type="text" v-model="domain.intro"  @input="handleInput"  class="form-control">--%>
                        <input type="text"  v-model="domain.code" name="code" class="form-control">
                    </td>
                    <td>
                        <span>地区名称:</span>
                    </td>
                    <td>
                        <input type="text" v-model="domain.name" name="name" class="form-control" autocomplete="off">
                    </td>
                </tr>
                <tr>
                    <td>状态:</td>
                    <td>
                        <select size="1"  v-model="domain.state" name="state" class="form-control"> ' +
                            <option value="1" title="正常">正常</option>
                            <option value="-1" title="">删除</option>
                        </select>
                    </td>
                    <td>
                        <span>父类编码:</span></td>
                    <td>
                        <input type="text"  v-model="domain.pcode" disabled name="pcode" autocomplete="off" placeholder="" class="form-control">
                    </td>

                </tr>

                <tr>
                    <td>
                        <span>层级:</span></td>
                    <td>
                        <input type="text" v-model="domain.lv" name="lv" autocomplete="off" placeholder="" class="form-control">
                    </td>
                    <td><span>是否含有子集:</span></td>
                    <td>
                        <select size="1"  v-model="domain.rc3" name="rc3" class="form-control"> ' +
                            <option value="1" title="正常">true</option>
                            <option value="0" title="">false</option>
                        </select>  </td>
                </tr>
                </tbody>
            </table>
                </form>
        </div>
    </div>
    <div class="modal-footer">
        <button type="button" @click="handleSubmit" class="btn btn-primary">提交</button>
    </div>
    <%--</div>--%>
</script>

<script type="text/template" id="tkAddDomain" >
    <div class="modal-body" style="overflow: hidden; overflow-y: auto;">
        <div class="compose_mail">
            <form role="form" class="lpform" action="#" method="POST">
                <table class="table  table-striped-no-border">
                    <tbody>
                    <tr>
                        <td><span><span style="color: red">*&nbsp;</span>地区编码:</span></td>
                        <td>
                            <%--<input type="text" v-model="domain.intro"  @input="handleInput"  class="form-control">--%>
                            <input type="text"  v-model="domain.code" name="code" class="form-control">
                        </td>
                        <td>
                            <span>地区名称:</span>
                        </td>
                        <td>
                            <input type="text" v-model="domain.name" name="name" class="form-control" autocomplete="off">
                        </td>
                    </tr>
                    <tr>
                        <td>状态:</td>
                        <td>
                            <select size="1"  v-model="domain.state" name="state" class="form-control"> ' +
                                <option value="1" title="正常">正常</option>
                                <option value="-1" title="">删除</option>
                            </select>
                        </td>
                        <td>
                            <span>父类编码:</span></td>
                        <td>
                            <input type="text"  v-model="domain.pcode"  name="pcode" autocomplete="off" placeholder="" class="form-control">
                        </td>

                    </tr>

                    <tr>
                        <td>
                            <span>层级:</span></td>
                        <td>
                            <input type="text" v-model="domain.level" name="level" autocomplete="off" placeholder="" class="form-control">
                        </td>
                        <td><span>是否含有子集:</span></td>
                        <td>
                            <select size="1"  v-model="domain.rc3" name="rc3" class="form-control"> ' +
                                <option value="1" title="正常">true</option>
                                <option value="0" title="">false</option>
                            </select>  </td>
                    </tr>
                    </tbody>
                </table>
            </form>
        </div>
    </div>
    <div class="modal-footer">
        <button type="button" @click="handleAdd" class="btn btn-primary">提交</button>
    </div>
    <%--</div>--%>
</script>



