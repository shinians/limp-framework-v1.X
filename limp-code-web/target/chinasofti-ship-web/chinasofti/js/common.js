// JavaScript Document
/*���˵��ű�*/
$(document).ready(function(){
 // $(".content:first").show();
  $(".leftsider h4").click(function(){
  $(this).addClass("on")
  .siblings().removeClass("on");  
      var checkElement = $(this).next();
      if((checkElement.is('.content')) && (checkElement.is(':visible'))) {
        return false;
        }
      if((checkElement.is('.content')) && (!checkElement.is(':visible'))) {
        $('.content:visible').slideUp('normal');
        checkElement.slideDown('normal');
        return false;
        }
});
  
   $(".sub_menu li a").click(function(){
    	$(".sub_menu li a").removeClass("on");
		this.className += " on" ;
  });
   
   
   $(".nav_onlick a").click(function(){
  var checkElement = $(this).next();
      if((checkElement.is('.menu_list')) && (checkElement.is(':visible'))) {
        return false;
        }
      if((checkElement.is('.menu_list')) && (!checkElement.is(':visible'))) {
        $('.menu_list:visible').slideUp('normal');
        checkElement.slideDown('normal');
        return false;
        }
  }); 
  
});


/*�����ű�*/
$(document).ready(function(){
$(".inputbox").focus(function(){
							  $(this).addClass("inputbox_on");
							  }).blur(function(){				
							  $(this).removeClass("inputbox_on");		
							  });
$(".selectbox").focus(function(){
							  $(this).addClass("selectbox_on");
							  }).blur(function(){				
							  $(this).removeClass("selectbox_on");		
							  });
/*��ť�ű�*/
$(".btn_submit").hover(function(){
								$(this).addClass("btn_submit_on");
								},function(){
									$(this).removeClass("btn_submit_on")
								});

/*��ť�ű�*/
$(".btn_common").hover(function(){
								$(this).addClass("btn_common_on");
								},function(){
									$(this).removeClass("btn_common_on")
								});
/*��ť�ű�*/
$(".btn_menu").hover(function(){
								$(this).addClass("btn_menu_on");
								},function(){
									$(this).removeClass("btn_menu_on")
								});

$(".btn_code").hover(function(){
								$(this).addClass("btn_code_hover");
								},function(){
									$(this).removeClass("btn_code_hover")
								});

/*������������*/
$(".btn_up").live("click", function(){
				$(".search_criteria").hide();
				$(this).addClass("btn_down");
				$(this).removeClass("btn_up");
							});

/*��������չ��*/
$(".btn_down").live("click", function(){
				$(".search_criteria").show();
				$(this).addClass("btn_up");
				$(this).removeClass("btn_down");
							});

});