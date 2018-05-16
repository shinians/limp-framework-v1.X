/***
 * 业务说明： 操作左侧菜单管理 权限部分
 * @type {{getLeftMenus: Function}}
 */
var menu={
    /**
     * todo:采用oracle 特有的树形结构语句查询
     * 获得左侧菜单|权限菜单功能
     * @param pid 父类权限id
     */
    getLeftMenus:function(pid){
        //直接暴露action url
        system.post(get_root+system.action["getMenuById"]["url"],{id:pid},function(data){
            var menuFirstNum=0;
            //初始化 左侧菜单
            for(var i in data.result){
                var domain=data.result[i]; //获得一级菜单选项|如系统管理
                //菜单类型为5的不显示：如果是数据维度的菜单则不展示
                if("5"==domain.menType||domain.menType>9){
                    continue;
                }

                menuFirstNum+=1;//第一以及菜单的数量

                /**----------title大模块信息-0级菜单---------------**/
                var ulP=$('<ul class="topnav"></ul>');
                //定义class样式 居右
                var clasName=system.isBlank(domain.menImgUrl)
                    ?"entypo-cog pull-right config-wrap":"entypo-cog pull-right "+domain.menImgUrl;
                //加载大标题
                var liFirst= $('<li> </li>');
                liFirst.append('<a href="javascript:void(0);" class="title-menu-left">' +
                    ' <span class="widget-menu">'+domain.menName+'</span><i data-toggle="tooltip" class="'+clasName+'"></i> </a>');
                 //ulP.append(liFirst);
                //TODO 如果展示一级菜单则 打开注释

                /**----------content详细信息--循环第一层目录--------------**/
                for(var m in domain.children){
                    var child=domain.children[m];
                    //定义菜单图标
                    var clas=system.isBlank(child.menImgUrl) ? "icon-document-edit" : child.menImgUrl;
                    var childFir=$("<li></li>");
                    var aLi=$("<a class='tooltip-tip ajax-load' href=javascript:void(0) data-value='"+child.id+"' title='"+child.menName+"'> </a>");
                    aLi.append('<i class="' + clas + '"></i><span>' + child.menName+'</span>');
                    if(child.children.length>0){  //如果没有子类则显示图例
                       aLi.append('<h4 style="display: inline-block; float: none;"><img src='+get_root+'"/systemsite/assets/img/plus.png"></h4>') ;
                    } else{
                    }
                    childFir.append(aLi);
                    //加载二级菜单
                    var childSec=$('<ul></ul>');
                    for(var n in child.children){
                        var child1=child.children[n];
                        var clas1=child1.menImgUrl==""||child1.menImgUrl==undefined
                            ?"entypo-doc-text":child1.menImgUrl;
                        var temLi=$('<li></li>');
                        var temA=$('<a class="tooltip-tip2 ajax-load" href="javascript:void(0);" data-value="'+child1.id+'" title="'+child1.menName+'">' +
                            '<i class="'+clas1+'"></i><span>'+child1.menName+'</span></a>');

                         if(child1.children.length>0){  //如果没有子类则显示图例
                             temA.append('<h4 style="display: inline-block; float: none;"><img src='+get_root+'"/systemsite/assets/img/plus.png"></h4>') ;
                         } else{
                         }
                        temLi.append(temA);
                        childSec.append(temLi);

                        var childThird=$('<ul></ul>');

                        for(var j in child1.children){
                            var child2=child1.children[j];
                            var clas2=child2.menImgUrl==""||child2.menImgUrl==undefined
                                ?"entypo-doc-text":child2.menImgUrl;
                            var c2Li=$('<li>  </li>');
                            var c2Al=$('<a class="tooltip-tip2 ajax-load" href="javascript:void(0);" data-value="'+child2.id+'" title="'+child2.menName+'">' +
                            '<i class="'+clas2+'"></i><span>'+child2.menName+'</span></a>');

                            c2Li.append(c2Al) ;
                            childThird.append(c2Li);

                        }
                        temLi.append(childThird);

                        }
                    childFir.append(childSec);
                    ulP.append(childFir)    ;

                    $(".side-bar").append(ulP);
                }
            }
                /**********加载完后样式控制**************/
                if(menuFirstNum<2){ //如果只有一个菜单则不加载一级菜单
                  $(".title-menu-left").html('');
                }
        })
    } ,
    /**
     * 显示导航条
     * @param menuId
     */
    showNav:function(menuId){
        $("#breadcrumb").html('');
        var bnav=$("#breadcrumb");
        var indexN=get_root+"/system/main";
       bnav.append('<li><a title="主页" href="'+indexN+'">主页</a></li>');
        //var $()
       if(!system.isBlank(menuId)&&!system.isBlank(main.menuData[menuId])){
           var domain=main.menuData[menuId];
           var endN=$('<li>/</li>');
           bnav.append(endN);
           bnav.append('<li><a href="javascript:void(0)" id="nav_name" style="color: #666;font-weight: 500;">'+domain.menName+'</a></li>');
           console.log(domain)
           if(!system.isBlank(domain.menFatherid)&&!system.isBlank(main.menuData[domain.menFatherid])){
               var domainSec=main.menuData[domain.menFatherid];
               if("0"==domainSec.menFatherid){
                   return;
               }
               console.log("---->domainSec");
               console.log(domainSec);
               endN.before('<li>/</li><li><a href="javascript:void(0)" id="nav_name" style="color: #666;font-weight: 500;">'+domainSec.menName+'</a></li>');

           }
       }



    },
    /**
     * 处理左侧菜单action请求：
     * @param sid  菜单ID（menuId）
     */
    handleAction:function(sid){
        $("#breadcrumb").show();
        if(system.isBlank(sid)){
            main.tip("sid is not null",0);
            return;
        }
        if(system.isBlank(main.menuData[sid])){
            main.tip("menu data error",0);
            return;
        }

        var domain=main.menuData[sid];
        //定义点击菜单名称
        //$("#nav_name").html(domain.menName);
        menu.showNav(sid);
        var url=domain.menUrl;
        console.debug("请求action:");
        console.info(url);
        console.info(domain);


        //加载 url页面
        if(!system.isBlank(url)){
            //新窗口打开
            //菜单类型 0系统 1菜单（本窗口打开） 2页面 3Tab标签  4新窗口（页面新窗口打开） 5：隐藏  6:iframe控制
            if("4"==domain.menType){
                window.open(get_root+url);
            }else if("6"==domain.menType){
                //$("#breadcrumb").hide();
                $("#nav_intro").hide();
                $("#nav_iframe").attr("src",get_root+url)  ;
                $("#nav_iframe").fadeIn(200)
            }else{ //本窗口打开
                $("#nav_iframe").hide();
                $("#nav_intro").load(get_root+url,function(){
                    $("#nav_intro").fadeIn(200)
                });
            }

            /*$("#nav_intro").html("<jsp:include page='sys_menu.jsp'></jsp:include>");*/

        }
    },
    /**
     * 根据传入参数跳转到指定链接
     * type：1 ->div 2-> iframe
     * http://127.0.0.1:8082/system/main?service=http://www.baidu.com&type=1
     */
    goService:function(){
        if(!system.isBlank(main.service)){
            console.log("加载..")
            console.log(main.type);
            console.log(main.service);
           if("1"==main.type){
               $("#nav_iframe").hide();
               $("#nav_intro").load(main.service,function(){
                   $("#nav_intro").fadeIn(200)
               });
            }else  if ("2"==main.type){ //本窗口打开
               $("#nav_intro").hide();
               $("#nav_iframe").attr("src",main.service)  ;
               $("#nav_iframe").fadeIn(200);
            }
        }
    }
}

/**
 * 点击菜单事件
 */
$(document).off("click",".topnav  a").delegate(".topnav  a", "click", function () {
    //************样式处理*****begin**********
    $(this).parent().children().eq("1").slideToggle(400);
    //$(this).toggleClass("j-up");添加class
    //定义点击的图片 判断是否被点击
    var imgSrc=$(this).find("img").attr("src");
    if(!system.isBlank(imgSrc)&&imgSrc.indexOf("plus.png")>-1){
        $(this).find("img").attr("src",get_root+"/systemsite/assets/img/minus.png");
    }else if(!system.isBlank(imgSrc)&&imgSrc.indexOf("minus.png")>-1){
        $(this).find("img").attr("src",get_root+"/systemsite/assets/img/plus.png");
    }
    //隐藏其他点击开的ul，并且更换图标
    $(this).parent().siblings().find("ul").hide(300);
    $(this).parent().siblings().find("img").attr("src",get_root+"/systemsite/assets/img/plus.png");
    //************action handel******begin*********

    // action handle
    main.hideTip();
    if (!system.isBlank($(this).attr("data-value"))) {
        //$("#nav_name").html(domain.menName);
        menu.handleAction($(this).attr("data-value"));
    }
})
