<%--
   菜单管理
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 16-11-22
  Time: 下午10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/app_head.jsp" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <!--图标-->
    <!-- Le styles -->
    <%--<script type="text/javascript" src="${ctx}/systemsite/assets/js/jquery.js"></script>--%>
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/style.css">
    <%--动态加载css样式--%>
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/loader-style.css">
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/bootstrap.css">
    <link rel="stylesheet" href="${ctx}/resources/style/system.css">

    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/mail.css">
    <!-- 整体菜单控制 -->

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->

    <!--视频播放-->
    <link rel="stylesheet" href="${ctx}/systemsite/assets/css/social.css">

    <!--表格兼容性-->
    <link href="${ctx}/systemsite/assets/js/stackable/stacktable.css" rel="stylesheet">
    <link href="${ctx}/systemsite/assets/js/stackable/responsive-table.css" rel="stylesheet">


</head>


<body >

    <!--  PAPER WRAP -->
    <div class="wrap-fluid">

        <div class="content-wrap">
            <div class="row">


                <div class="col-sm-12">

                    <div class="nest" id="tableStaticClose">
                        <div class="title-alt">
                            <h5 style="padding: 10px 10px;font-size: 18px">
                                系统API:${ctx}/system/api</h5>
                           <%-- <div class="titleClose">
                                <a class="gone" href="#tableStaticClose">
                                    <span class="entypo-cancel"></span>
                                </a>
                            </div>
                            <div class="titleToggle">
                                <a class="nav-toggle-alt" href="#tableStatic">
                                    <span class="entypo-up-open"></span>
                                </a>
                            </div>--%>

                        </div>

                        <div class="body-nest" id="tableStatic">

                            <section id="flip-scroll">

                                <table class="table table-bordered table-striped cf">
                                    <thead class="cf">
                                    <tr>
                                        <th>序号</th>
                                        <th>API地址</th>
                                        <th class="numeric">方法描述</th>
                                        <th class="numeric">参数描述</th>
                                        <th class="numeric">返回结果</th>
                                    </tr>
                                    </thead>
                                    <tbody id="api-list">
                                  <%--  <tr>
                                        <td class="numeric">$1.39</td>
                                        <td class="numeric">$1.38</td>
                                        <td class="numeric">9,395</td>
                                    </tr>--%>

                                    </tbody>
                                </table>
                            </section>

                        </div>

                    </div>


                </div>

            </div>
        </div>
        <script>
              var apiData=[{url:'/system/api/getTreeById?id=0',name:'根据id获取此菜单以下的所有Tree数据',method:'id:当前菜单id',return:'{result:[...]"code":"200","msg":"success"}'},
                  {url:'/system/api/getAuthTreeById?id=0',name:'根据id获取此菜单以下的所有权限Tree数据',method:'id:当前菜单id',return:'{result:[...]"code":"200","msg":"success"}'},
                  {url:'',name:'',method:'',return:''},
                  {url:'',name:'',method:'',return:''},
                  {url:'',name:'',method:'',return:''},
                  {url:'',name:'',method:'',return:''},
                  {url:'',name:'',method:'',return:''},
                  {url:'',name:'',method:'',return:''},
                  {url:'',name:'',method:'',return:''},
                  {url:'',name:'',method:'',return:''},
                  {url:'',name:'',method:'',return:''},
                  {url:'',name:'',method:'',return:''},
                  {url:'',name:'',method:'',return:''},
                  {url:'',name:'',method:'',return:''},
                  {url:'',name:'',method:'',return:''},
                  {url:'',name:'',method:'',return:''}
              ]
            $("#api-list").html('');
            for(var i in apiData){
                var domain=apiData[i];
                var urlS=get_root+domain.url;
                $("#api-list").append('<tr><td>'+i+'</td><td  style="cursor: pointer" onclick=window.open("'+urlS+'")>'+domain.url+'</td><td>'+domain.name+'</td><td>'+domain.method+'</td><td>'+domain.return+'</td></tr>');
            }
        </script>
    </div>
    <!--  END OF PAPER WRAP -->


    <!-- END OF RIGHT SLIDER CONTENT-->







    <!-- /MAIN EFFECT -->





</body>

</html>
