<%--
  Created by IntelliJ IDEA.
  User: a
  Date: 2017/8/29
  Time: 18:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/WEB-INF/common/taglibs.jsp" %>
<link rel="stylesheet" href="${plug}/js-utils/ssmk.css">
<%--搜索页面--%>
<link rel="stylesheet" href="${ctx}/resources/style/css/panel-searchindex.css">
<style>
    /*定义选中的样式*/
    .s-active{
      color:#fff;
        font-weight: bold;
        /*text-decoration:underline;*/
        border-bottom: 1px solid #fff;
    }
    .detailLis{
        cursor: pointer;
    }

 /*   .radioBox{
        width: 18px;
        height: 15px;
        float: left;
        margin-top: 4px;

    }*/
</style>
<div class="container searchIndex" >
    <%--局徽--%>
    <div class="row" style="margin-top: 140px;">
        <div class="col-sm-5" style="text-align: right;">
            <img src="${ctx}/resources/style/images/juhui02.png" alt="船检局徽" class="shipSearchIcon">
        </div>
        <div class="col-sm-7" style="text-align: left;">
            <h1 class="searchTit">智慧船检</h1>
        </div>
    </div>
    <%--搜索 全部    --%>
    <div class="row">
        <%--<div class="searchAll">
            <div class="radioBox radioOn">
                <input type="radio" value="">
            </div>
            <span class="radioName searchWord s-active" data-type=" ">全部</span>
        </div>--%>
        <div class="searchKeyWords">
            <div class="col-sm-2"><span class="searchWord s-active" data-type="">全&nbsp;&nbsp;&nbsp;&nbsp;部</span></div>
            <div class="col-sm-2"><span class="searchWord" data-type="1">检验机构</span></div>
            <div class="col-sm-2"><span class="searchWord"data-type="2">验船师</span></div>
            <div class="col-sm-2"><span class="searchWord"data-type="4">渔业船舶</span></div>
            <div class="col-sm-2"><span class="searchWord"data-type="5">船用产品</span></div>
            <div class="col-sm-2"><span class="searchWord"data-type="6">设计图纸</span></div>
            <div class="col-sm-2"><span class="searchWord"data-type="3">涉渔企业</span></div>
            <%--精确搜索--%>
        </div>
    </div>
    <%--搜索框--%>
    <div class="row">
        <div class="col-sm-2"></div>
        <div class="col-sm-8 searchBox">
            <span  id="ssxlmk">
                <input id="keyWord" name="key"  type="text" placeholder="" class="findBox" autocomplete="off">
                <button class="find" id="search_submit"></button>
            </span>


        </div>
        <div class="col-sm-2"></div>
    </div>
    <%--footer--%>
    <%--<div class="row">--%>
        <%--<div class="col-sm-12 footer">--%>
            <%--农业部渔业船舶检验局&copy;--%>
        <%--</div>--%>
    <%--</div>--%>
</div>
<script>
//    alert($(window).height());
    $('.container').css('height',$(window).height()-100);
    $(document).off("click",".detailLis").delegate(".detailLis","click",function(){
          // console.log($(this).attr("data-value"));
        var dataId=$(this).attr("data-value");  // 3300000
        console.log(searchResult.dataMap[dataId])
        var domain=searchResult.dataMap[dataId];
        if(system.isBlank(domain)||system.isBlank(domain["TYPE"])){
            return;
        }
        var urlLoad="";
        var titleMsg="";
        //机构
        if("1"==domain["TYPE"]){
            urlLoad=get_root+"/ship/org/index?uid="+dataId;
            titleMsg=$(this).find("li").eq(0).text();
        }
        //验船师
        else if("2"==domain["TYPE"]){
            urlLoad=get_root+"/ship/sur/toindex?ycscertnum="+dataId;

            titleMsg=$(this).find("li").eq(0).text()+","+$(this).find("li").eq(1).text().replace("工作单位：","");

        }
        //企业
        else if("3"==domain["TYPE"]){
            urlLoad=get_root+"/ship/ent/index?pid="+dataId+"&entcate="+domain["TYPEEXT"];
            titleMsg=$(this).find("li").eq(0).text();
        }
        //图纸
        else if("6"==domain["TYPE"]){
            //todo:
            urlLoad=get_root+"/ship/draw/index?pid="+dataId+"&entcate="+domain["TYPEEXT"];
            titleMsg=$(this).find("li").eq(0).text();
        }
        //产品信息
        else if("5"==domain["TYPE"]){
            //todo:
            urlLoad=get_root+"/ship/ent/toShipProduct?pid="+dataId;
            titleMsg=$(this).find("li").eq(0).text();
        }else{
            //渔船和产品
//            alert("暂无渔船和产品页面");
            urlLoad=get_root+"/ship/index?shipcode="+dataId;
            titleMsg=$(this).find("li").eq(0).text();

//            /ship/index?shipcode=3302011986030001
//            return;
        }
       console.log(urlLoad);
//        console.log(titleMsg);

        system.load(urlLoad,titleMsg);

    }) ;
</script>
<script src='${script}/chinasofti/search/search_index.js'></script>
<script src='${script}/chinasofti/search/searchPanel.js'></script>
<script type="text/javascript" src="${plug}/js-utils/ssmk.js"></script>

