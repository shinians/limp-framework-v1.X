<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>智慧船检</title>
<link href="css/common.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="js/jquery-1.3.2.min.js"></script>
</head>
<style>
    .search_list_box{
        background:none;
    }
    .search_list li a{
        color:#fff;
    }
    .headTitle{
        font-size: 14px;
    }
    #line{
        margin:0px;
        padding:0px;
        height:1px;
        background-color: #1389CC;
    }
    .header{
        height:150px;
    }
    
</style>
<body>
<!--<div class="add_box">
<h3><img src="images/add_dui_pic.gif" /></h3>

<ul>
<li>
  <label>
    <input type="checkbox" name="checkbox" id="checkbox" />
  </label>
  <a href="#">民营企业面临诸多法律风险专家呼吁<span>法律法规</span>应为民企发展保驾护航</a></li>
  <li>
  <label>
    <input type="checkbox" name="checkbox" id="checkbox" />
  </label>
  <a href="#">民营企业面临诸多法律风险专家呼吁<span>法律法规</span>应为民企发展保驾护航</a></li>
</ul>
<div class="aligncenter"><a href="contrast.html"><img src="images/btn_add_pic.gif" width="82" height="27" /></a></div>
</div>-->
<script>
    $(function(){

        $("#search").click(function(){
          var key=$("#search-key").val();
            if($.trim(key)==""){
              alert("输入关键字");
                return;
            }

            console.log(key);
            $.post('/index/s.action', {
                        "key" : $.trim(key),
                        page:1,
                        pagesize:10
                    },// ajax 的post不能提交中文提交，在动作页面进行获取后需要解码，注意字符格式，然后搜索后返回
                    function(data) {

                        var dataMap = eval("(" + data + ")");
                        data_array=eval("(" + dataMap.result + ")");
                        console.log("ajax----");
                        var num=data_array.length>10 ? 10:data_array.length;
                        var lis="";
                       var list= $(".list_info").html('');
                        var k= $.trim($("#search-key").val());
                        for(var i=0;i<num;i++){
                           var domain= data_array[i];
                            var domainName=domain.NAME;
                            domainName=domainName.replace(k,"<span>"+k+"</span>");
                            var li=$(' <li> <div class="add"><a href="#"><img src="images/btn_add.gif"  /></a><br />' +
                                    ' <a href="#"> <input name="input" type="checkbox" value="" /> 添加对比</a></div> ' +
                                    '<div class="btnbox"><input name="" type="button" class="btn" value="简介" />' +
                                    '<input name="" type="button" class="btn_yl"data-typeext="'+domain.TYPEEXT+'"data-type="'+domain.TYPE+'" data-id="'+domain.id+'" value="预览" />' +
                                    '<input name="" type="button" class="btn_sc" value="收藏" /></div>' +
                                    ' <h3><a href="#">'+domainName+'</a></h3> <p>点击预览跳转到相应微观一张图...</p> </li>');
                            list.append(li);
                        }



                        $(".btn_yl").click(function(){
                            var type=$(this).attr("data-type");
                            var sid=$(this).attr("data-id");
                            var etype=$(this).attr("data-typeext");
                            console.log(type)
                            if("1"==type){
                                window.location.href="/ship/org/index?uid="+sid;
                            } if("4"==type){
                                window.location.href="/ship/index";
                            } if("2"==type){
                                window.location.href="/ship/sur/toindex?ycscertnum="+sid;
                            } if("3"==type){
                                window.location.href="/ship/ent/index?entcate="+etype+"&registnum="+sid;
                            }
                        })


                        console.log(data_array)
                    })
        })
    })
</script>

<div class="header">
<div class="warrper">
<p class="headTitle">欢迎您使用智慧船检大数据平台</p>
<div class="floatleft" style="margin: 65px 0px 0px 104px;    color: #F0FF00;">
    <span id="logo"></span>
    <!--<img src="../resources/style/images/juhui.png" style="width: 70px" />-->

</div>
<div class=" floatright" style=" width:730px;  margin-top:15px;">
        <ul class="search_list">
        <li ><a href="#">全部</a></li>
        <li ><a href="#">检验机构</a></li>
        <li><a href="#">渔船信息</a></li>
        <li><a href="#">验船师</a></li>
        <li><a href="#">企业信息</a></li>
        <li><a href="#">精确搜索</a></li>
        </ul>
  <div class="search_list_box">
    <input id="search-key" placeholder="页面配色暂未调整，需进一步优化（检索后！点击预览可查看微观一张图）" name="apdiv" type="text" class="input" />
      <input id="search" name="" type="button"  class="btn"/>
  </div>
</div>
</div>
</div>
<p id="line"></p>
<script type="text/javascript">
    $(function(){
        $("#gy").click(function(){
            console.log($("#gy"))
              if($(".menu_list").attr("style").indexOf("none")>-1){
                  $(".menu_list").slideDown(1000,function(){
                      console.log("success")
                  });
              } else{
                  $(".menu_list").slideUp(1000,function(){
                      console.log("success")
                  });
              }

        })
    })
</script>

<div id="container">
    <div class="warrper" style="padding-top:30px;">
        <div class="leftsider">
            <h2 title="点检分类,则显示该分类下的信息">分类检索</h2>
            <ul class="sub_menu">
                <li class="on"><a href="#" id="gy">所属省份</a>
                    <dd id="u" style="display: block;">
                        <ul class="menu_list" style="display: none">

                            <li>
                                <a href="javascript:void(0)">
                                    北京<span style="font-size:10px;color:red"></span>
                                </a>

                            </li>

                            <li>
                                <a href="javascript:void(0)" onclick="subSearch('applyUnit','82')">
                                    河北<span style="font-size:10px;color:red"></span>
                                </a>

                            </li>

                            <li>
                                <a href="javascript:void(0)" onclick="subSearch('applyUnit','1')">
                                    天津<span style="font-size:10px;color:red"></span>
                                </a>

                            </li>


                        </ul>
                    </dd>
                </li>

                <li><a href="#">职能类型</a></li>
                <li><a href="#">业务类别</a></li>
                <li><a href="#">经费来源</a></li>
                <li><a href="#">机构级别</a></li>
                <li><a href="#">其他</a></li>

            </ul>
        </div>
        <div class="page_center">
            <div class="list_info_title">
                <h3>找到相检验机构约 <span class="red">131,000</span> 个：</h3>
                <h4><input name="" type="button"  value="点击率 "  class="btn"/> <input name="" type="button"  value="收藏"  class="btn_on"/></h4>
            </div>
            <ul class="list_info">
                <li>
                    <div class="add"><a href="#"><img src="images/btn_add.gif"  /></a><br />
                        <a href="#">
                            <input name="input" type="checkbox" value="" />
                            添加对比</a></div>
                    <div class="btnbox"><input name="" type="button" class="btn" value="简介" /><input name="" type="button" class="btn_yl" value="预览" /><input name="" type="button" class="btn_sc" value="收藏" /></div>
                    <h3><a href="#">中华人民<span>共和国</span>北京渔业船舶检验局</a></h3>
                    <p>1、辖区内县级渔业船舶检验机构检验业务的指导、协调和监督管理（包括检验业务计算机网络的管理);2、辖区内验船人员的<span>业务培训</span>;3、辖区内船长12米以上或主机功率...</p>
                </li>
                <li>
                    <div class="add"><a href="#"><img src="images/btn_add.gif"  /></a><br />
                        <a href="#">
                            <input name="input" type="checkbox" value="" />
                            添加对比</a></div>
                    <div class="btnbox"><input name="" type="button" class="btn" value="简介" /><input name="" type="button" class="btn_yl" value="预览" /><input name="" type="button" class="btn_sc" value="收藏" /></div>
                    <h3><a href="#">中华人民<span>共和国</span>北京渔业船舶检验局</a></h3>
                    <p>1、辖区内县级渔业船舶检验机构检验业务的指导、协调和监督管理（包括检验业务计算机网络的管理);2、辖区内验船人员的<span>业务培训</span>;3、辖区内船长12米以上或主机功率...</p>
                </li>
                <li>
                    <div class="add"><a href="#"><img src="images/btn_add.gif"  /></a><br />
                        <a href="#">
                            <input name="input" type="checkbox" value="" />
                            添加对比</a></div>
                    <div class="btnbox"><input name="" type="button" class="btn" value="简介" /><input name="" type="button" class="btn_yl" value="预览" /><input name="" type="button" class="btn_sc" value="收藏" /></div>
                    <h3><a href="#">中华人民<span>共和国</span>北京渔业船舶检验局</a></h3>
                    <p>1、辖区内县级渔业船舶检验机构检验业务的指导、协调和监督管理（包括检验业务计算机网络的管理);2、辖区内验船人员的<span>业务培训</span>;3、辖区内船长12米以上或主机功率...</p>
                </li>
                <li>
                    <div class="add"><a href="#"><img src="images/btn_add.gif"  /></a><br />
                        <a href="#">
                            <input name="input" type="checkbox" value="" />
                            添加对比</a></div>
                    <div class="btnbox"><input name="" type="button" class="btn" value="简介" /><input name="" type="button" class="btn_yl" value="预览" /><input name="" type="button" class="btn_sc" value="收藏" /></div>
                    <h3><a href="#">中华人民<span>共和国</span>北京渔业船舶检验局</a></h3>
                    <p>1、辖区内县级渔业船舶检验机构检验业务的指导、协调和监督管理（包括检验业务计算机网络的管理);2、辖区内验船人员的<span>业务培训</span>;3、辖区内船长12米以上或主机功率...</p>
                </li>
                <li>
                    <div class="add"><a href="#"><img src="images/btn_add.gif"  /></a><br />
                        <a href="#">
                            <input name="input" type="checkbox" value="" />
                            添加对比</a></div>
                    <div class="btnbox"><input name="" type="button" class="btn" value="简介" /><input name="" type="button" class="btn_yl" value="预览" /><input name="" type="button" class="btn_sc" value="收藏" /></div>
                    <h3><a href="#">中华人民<span>共和国</span>北京渔业船舶检验局</a></h3>
                    <p>1、辖区内县级渔业船舶检验机构检验业务的指导、协调和监督管理（包括检验业务计算机网络的管理);2、辖区内验船人员的<span>业务培训</span>;3、辖区内船长12米以上或主机功率...</p>
                </li>
                <li>
                    <div class="add"><a href="#"><img src="images/btn_add.gif"  /></a><br />
                        <a href="#">
                            <input name="input" type="checkbox" value="" />
                            添加对比</a></div>
                    <div class="btnbox"><input name="" type="button" class="btn" value="简介" /><input name="" type="button" class="btn_yl" value="预览" /><input name="" type="button" class="btn_sc" value="收藏" /></div>
                    <h3><a href="#">中华人民<span>共和国</span>北京渔业船舶检验局</a></h3>
                    <p>1、辖区内县级渔业船舶检验机构检验业务的指导、协调和监督管理（包括检验业务计算机网络的管理);2、辖区内验船人员的<span>业务培训</span>;3、辖区内船长12米以上或主机功率...</p>
                </li>

            </ul>
            <div class="page_btn">
                <a href="" class="btn_prev"><strong><</strong></a>
                <a href="" class="on">1</a>
                <a href="">2</a>
                <a href="">3</a>
                <a href="" class="btn_next"><strong>></strong></a>
                跳转：
                <label>
                    <input type="text" name="text"  style="width:30px; text-align:center; height:20px;" />
                </label>
                <a href="" class="btn_next"><strong>GO</strong></a>
            </div>


        </div>

        <div class="page_right">
            <div class="common_box">
                <h3>最新能力评估排名</h3>
                <ul class="common_box_list">
                    <li><span>1</span><a href="#">福建渔业船舶检验局长乐检验站</a></li>
                    <li><span>2</span><a href="#">四川渔业船舶检验局绵阳检验处</a></li>
                    <li><span>3</span><a href="#">广西玉林市渔业船舶检验处</a></li>
                    <li><span>4</span><a href="#">四川渔业船舶检验局遂宁检验处</a></li>
                    <li><span>5</span><a href="#">四川渔业船舶检验局遂宁检验处</a></li>
                    <li><span>6</span><a href="#">四川渔业船...</a></li>
                    <li><span>7</span><a href="#">四川渔业船...</a></li>
                    <li><span>8</span><a href="#">四川渔业船...</a></li>
                    <li><span>9</span><a href="#">四川渔业船...</a></li>
                    <li><span>10</span><a href="#">四川渔业船...</a></li>
                </ul>


            </div>

            <div class="common_box">
                <h3>最近搜索热门排名</h3>
                <ul class="common_box_list">
                    <li><span>1</span><a href="#">河北渔业船舶检验局( 122)</a></li>
                    <li><span>2</span><a href="#">烟台冰轮股份有限公司</a></li>
                    <li><span>3</span><a href="#">浙苍渔02508</a></li>
                    <li><span>4</span><a href="#">张三</a></li>
                    <li><span>5</span><a href="#">河北渔业...</a></li>
                    <li><span>6</span><a href="#">河北渔业...</a></li>
                    <li><span>7</span><a href="#">河北渔业...</a></li>
                    <li><span>8</span><a href="#">河北渔业...</a></li>
                    <li><span>9</span><a href="#">河北渔业...</a></li>
                    <li><span>10</span><a href="#">河北渔业...</a></li>
                </ul>


            </div>
        </div>
    </div>
</div>


</body>
</html>
