<%@include file="/WEB-INF/content/chinasofti/common/head.jsp" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>微观检索</title>
    <link rel="stylesheet" href="${ctx}/plug/bootstrap-3.3.7-dist/css/bootstrap.min.css" >
    <link rel="stylesheet" href="${style}/css/main.css">
    <link rel="stylesheet" href="${ctx}/resources/style/chinasofti/css/surInformation.css">
    <style>

        .search{
            width: 50%;
            height: 30px;
            margin-top: 25px;
            margin-left: 10px;
            border: 1px solid #41578D;
            background: #476FA8;
            color: #fff;
        }
        .searchIcon{
            display: inline-block;
            position: absolute;
            top:30px;
            left: 565px;
            width: 28px;
            height: 25px;
            background:url("/resources/style/img/icon-white.png") no-repeat scroll -348px -113px transparent;
        }
        .media-object {
            width: 128px;
        }

        .demo {
            width: 95%;
            border: 1px solid #ddd;
            padding: 15px;
            border-radius: 5px;
            box-shadow: 5px 15px 20px 0px #C0C0C0;
            background-color: #eee;
            margin-top: 20px;
            margin-left: 15px;
        }

        .progress {
            margin-bottom: 0px;
        }

        .text {
            font-size: 12px;
            color: #000;
        }

        .demo hr {
            border-top-color: #3399ff;
        }
        .container{
            height:930px;
        }
        
    </style>
</head>
<body style="background:url('${ctx}/resources/style/images/bg.png') top center no-repeat;background-size: cover ">
<div class="container">
    <div style="height: 75px" class="row">
        <div class="col-md-12">
            <b class="searchIcon"></b>
            <input class="search" placeholder="魏岚" type="search">
        </div>
    </div>

    <div class="row">
        <div class="col-md-12">
            <div class="col-md-12 box00 box">
                <%--<b class="iconClose"></b>--%>
                <div class="col-md-12">
                    <h6 class="title01">本次共检索到<span style="color: red">3</span>条微观线索</h6>
                    <div class='demo'>
                        <div class="media">
                            <div class="media-left media-middle">
                                <a href="#">
                                    <img class="media-object" src="${ctx}/resources/style/images/person1.png" alt="...">
                                </a>
                            </div>
                            <div class="media-body">
                                <h4 class="media-heading"><a style="cursor: hand;" onclick="window.location.href='/ship/sur/toindex?ycscertnum='+'35032219680802901X'">魏岚</a></h4>
                                <button type="button" class="btn btn-xs btn-success">小型渔业船舶检验</button>
                                <button type="button" class="btn btn-xs btn-success">本科</button>
                                <button type="button" class="btn btn-xs btn-success">中级验船师</button>
                                <button type="button" class="btn btn-xs btn-info">审图</button>
                                <hr />
                                <p class='text'>
                                    魏岚，1980年9月7日出生，就职于北京渔业船舶检验局，任职科长，相关专业为船舶与海洋工程。于2015年4月5日获得中级验船师证书，证书编号C1710046。
                                </p>
                                <div class="progress progress-striped active">

                                    <div class="progress-bar progress-bar-info" style="width: 33.3%">
                                        从事渔船检验工作时间：2年
                                    </div>
                                    <div class="progress-bar progress-bar-warning progress-bar-striped" style="width: 33.3%">
                                        累计检验渔船：1艘
                                    </div>
                                    <div class="progress-bar progress-bar-danger" style="width: 33.3%">
                                        参加培训：1期
                                    </div>

                                </div>

                                <div class="progress progress-striped active">

                                    <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="99" aria-valuemin="0" aria-valuemax="100" style="width: 92%;">
                                        验船师能力得分：108分
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class='demo'>
                        <div class="media">
                            <div class="media-left media-middle">
                                <a href="#">
                                    <img class="media-object" src="${ctx}/resources/style/images/person1.png" alt="...">
                                </a>
                            </div>
                            <div class="media-body">
                                <h4 class="media-heading">韩琦</h4>
                                <button type="button" class="btn btn-xs btn-success">船体</button>
                                <button type="button" class="btn btn-xs btn-success">本科</button>
                                <button type="button" class="btn btn-xs btn-success">中级验船师</button>
                                <button type="button" class="btn btn-xs btn-info">产品</button>
                                <hr />
                                <p class='text'>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ut blanditiis officia similique quisquam facilis reprehenderit omnis illum mollitia rem labore ipsum ipsa excepturi maxime voluptate provident quidem amet placeat ipsam.</p>
                                <div class="progress progress-striped active">

                                    <div class="progress-bar progress-bar-info" style="width: 33.3%">
                                        从事渔船检验工作时间：2年
                                    </div>
                                    <div class="progress-bar progress-bar-warning progress-bar-striped" style="width: 33.3%">
                                        累计检验渔船：62艘
                                    </div>
                                    <div class="progress-bar progress-bar-danger" style="width: 33.3%">
                                        参加培训：4期
                                    </div>

                                </div>

                                <div class="progress progress-striped active">

                                    <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="92" aria-valuemin="0" aria-valuemax="100" style="width: 92%;">
                                        验船师能力得分：92分
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class='demo'>
                        <div class="media">
                            <div class="media-left media-middle">
                                <a href="#">
                                    <img class="media-object" src="${ctx}/resources/style/images/person1.png" alt="...">
                                </a>
                            </div>
                            <div class="media-body">
                                <h4 class="media-heading">袁斌</h4>
                                <button type="button" class="btn btn-xs btn-success">轮机</button>
                                <button type="button" class="btn btn-xs btn-success">本科</button>
                                <button type="button" class="btn btn-xs btn-success">中级验船师</button>
                                <button type="button" class="btn btn-xs btn-info">远洋</button>
                                <hr />
                                <p class='text'>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Ut blanditiis officia similique quisquam facilis reprehenderit omnis illum mollitia rem labore ipsum ipsa excepturi maxime voluptate provident quidem amet placeat ipsam.</p>
                                <div class="progress progress-striped active">

                                    <div class="progress-bar progress-bar-info" style="width: 33.3%">
                                        从事渔船检验工作时间：8年
                                    </div>
                                    <div class="progress-bar progress-bar-warning progress-bar-striped" style="width: 33.3%">
                                        累计检验渔船：682艘
                                    </div>
                                    <div class="progress-bar progress-bar-danger" style="width: 33.3%">
                                        参加培训：4期
                                    </div>

                                </div>

                                <div class="progress progress-striped active">

                                    <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="98" aria-valuemin="0" aria-valuemax="100" style="width: 92%;">
                                        验船师能力得分：98分
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="navBottom">
                    <nav aria-label="Page navigation">
                        <ul class="pagination">
                            <li>
                                <a href="#" aria-label="Previous">
                                    <span aria-hidden="true">&lt;</span>
                                </a>
                            </li>
                            <li class="active"><a href="#">1</a></li>
                            <li><a href="#">2</a></li>
                            <li><a href="#">3</a></li>
                            <li><a href="#">4</a></li>
                            <li><a href="#">5</a></li>
                            <li>
                                <a href="#" aria-label="Next">
                                    <span aria-hidden="true">&gt;</span>
                                </a>
                            </li>
                        </ul>
                    </nav>
                </div>
            </div>
        </div>
    </div>
</div>
    <script type="text/javascript" src="${ctx}/plug/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
    <script type="text/javascript">
        $(function(){

        });

    </script>
</body>
</html>