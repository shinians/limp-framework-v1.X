<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/sys_head.jsp" %>
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
    <!--表格兼容性-->
    <link href="${system}/js/stackable/stacktable.css" rel="stylesheet">
    <link href="${system}/js/stackable/responsive-table.css" rel="stylesheet">

    <link rel="stylesheet" href="${system}/css/style.css">

</head>

<body>
<div class="wrap-fluid"style="width: auto; ">
    <!--内容区域-->
    <div class="container-fluid paper-wrap1 bevel tlbr" style="margin-top: -1px;position: relative;background: #efefef;min-height: 800px" id="nav_content">
        <div id="nav_intro">
            <!-- 新增用户 -->
            <div class="container">
                <a href="#user-add" id="userAddWin"  data-toggle="modal" data-target="#user-add" class="btn btn-primary" style="display: none">user-add</a>
                <div aria-labelledby="myLargeModalLabel" role="dialog" tabindex="-1" class="modal fade bs-example-modal-lg" style="display: none;"id="user-add">
                    <div class="modal-dialog"> <%-- modal-lg--%>
                        <div class="modal-content">
                            <div class="modal-header">
                                <button aria-hidden="true" data-dismiss="modal" class="close" type="button">
                                    <span class="entypo-cancel"></span>
                                </button>
                                <h6 class="modal-title">添加新链接
                                </h6>

                            </div>
                            <div class="modal-body">
                                <table class="table  table-striped cf footable-res footable">
                                <tbody id="roleTable">
                                <tr class="odd gradeX">
                                    <td><input type="checkbox" name="roleCKB" value="http://www.baidu.com">
                                    </td><td>第一章：百度1</td></td>
                                </tr>
                                <tr class="odd gradeX">
                                    <td><input type="checkbox" name="roleCKB" value="http://www.baidu.com">
                                    </td><td>第二章：百度2</td></td>
                                </tr>
                                <tr class="odd gradeX">
                                    <td><input type="checkbox" name="roleCKB" value="http://mail.126.com/">
                                    </td><td>第三章：126邮箱</td></td>
                                </tr>
                            </table>
                            </div>

                            <div class="modal-footer">
                                <button type="button" id="usr-add-btn" class="btn btn-primary">提交</button>
                            </div>
                            <script>
                                $(function(){
                                    //获取ue的html内容
                                    $("#getUeC").click(function(){
                                        var html= UE.getEditor('editor').getAllHtml();
                                        $("#content").html(html);
                                    })

                                })


                                $("#usr-add-btn").click(function(){
                                 var tab=system.getCheckboxValues("roleCKB");



                                    //当你点击按钮时编辑区域已经失去了焦点，如果直接用getText将不会得到内容，所以要在选回来，然后取得内容
                                    var range = UE.getEditor('editor').selection.getRange();
                                    range.select();
                                    var txt = UE.getEditor('editor').selection.getText();

                                    if(true){
                                        var val="<a target='_blank' name='123' href='"+tab+"' >"+txt+"</a>";
                                        UE.getEditor('editor').execCommand('insertHtml', val)
                                    }
                                  //  alert(tab);
                                    $(".modal-header .close").click();




//                                    var value = prompt('插入html代码', '');


                                })
                            </script>
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

                                <div class="list-btn-mail" style="cursor: pointer" id="user-to-add">
                                    <span class="fontawesome-plus"></span><a>新增用户</a><%--<i>648</i>--%>
                                </div>

                    <script>
                        $("#user-to-add").click(function(){
                            $('#userAddForm')[0].reset()  ;
                            $("#userAddWin").click();

                        })
                    </script>

                        </div>
                    </div>
                    <!-- /SIDEMENU MAIL -->
                    <!-- CONTENT MAIL -->
                    <div class="col-sm-10 padding0">
                        <div class="row">
                            <div class="content-panel" style="min-height: 130px !important;">
                                <div class="table-responsive">
                                        <div class="form-group" style="margin-top: 10px">
                                            <label class="col-sm-12 control-label">文档名称</label>
                                        </div>
                                      <span class="btn" id="getUeC" style="margin-top: 10px">
                                            <label class="col-sm-12 control-label">获取编辑器内容</label>
                                        </span>

                                <hr>

                                <div id="content">
                                    </div>

                            </div>
                                <!-- /.table-responsive -->
                            </div>
                        </div>
                        <div class="row">
                            <div class="content-panel padding0">
                                <div class="table-responsive">
                                    <script id="editor" type="text/plain" style="width:1024px;height:500px;"><p class="MsoNormal" style="text-indent:21.1pt;mso-char-indent-count:2.0;
line-height:16.0pt;layout-grid-mode:char;mso-layout-grid-align:none"><b style="mso-bidi-font-weight:normal"><span lang="EN-US" style="mso-bidi-font-size:
10.5pt">1.2.2.1</span></b><span class="MsoFootnoteReference"><span lang="EN-US" style="mso-bidi-font-size:10.5pt"> </span></span><span lang="EN-US" style="mso-bidi-font-size:10.5pt"><span style="mso-spacerun:yes">&nbsp;</span></span><span style="mso-bidi-font-size:10.5pt;font-family:宋体;mso-ascii-font-family:&quot;Times New Roman&quot;;
mso-hansi-font-family:&quot;Times New Roman&quot;">初次检验：系指渔业船舶（包括重大改建）在首次投入营运以及验船部门第一次对渔业船舶签发证书之前所进行的检验，包括新船的初次检验和现有船的初次检验。</span><span style="mso-bidi-font-size:10.5pt"> <span lang="EN-US"><o:p></o:p></span></span></p>
</script>

                                    <script type="text/javascript">
                                        //实例化编辑器
                                        //建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
                                       $(function(){
                                           var ue = UE.getEditor('editor');
                                       })
                                    </script>
                                </div>
                            </div>
                        </div>

                    </div>
                    <!-- /CONTENT MAIL -->
                </div>
            </div>

        </div>

    </div>
</div>

<!-- END OF RIGHT SLIDER CONTENT-->
<script type="text/javascript" src="${system}/js/bootstrap.js"></script>
<script type="text/javascript" src="${system}/js/load.js"></script>

<script type="text/javascript" charset="utf-8" src="${plug}/ueditor-1.4.3/ueditor.config.js"></script>

<!--<script type="text/javascript" charset="utf-8" src="editor_api.js"></script>-->

<script type="text/javascript" charset="utf-8" src="${plug}/ueditor-1.4.3/ueditor.all.min.js"> </script>
<!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
<!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
<script type="text/javascript" charset="utf-8" src="${plug}/ueditor-1.4.3/lang/zh-cn/zh-cn.js"></script>
<script type="text/javascript" charset="utf-8" src="${plug}/ueditor-1.4.3/plug/addDialog.js"></script>
<script>
</script>

</body>
</html>
