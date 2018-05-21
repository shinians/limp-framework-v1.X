$(function(){
    var url=new Base64();
    var code=url.encode(system.getCookie("uname"));
    var uname=system.getCookie("uname");
    var pwd=system.getCookie("password");
    if(!system.isBlank(uname)){
        var jmUname=uname.replace(/%/g,"=");
        $("#account").val(url.decode(jmUname));
    }
    if(!system.isBlank(pwd)){
        var jmPwd=pwd.replace(/%/g,"=");
        $("#password").val(url.decode(jmPwd));
    }
    $("#log-btn").click(function(){
        loginIndex.login();
    })
})
function tips(msg){
    alert(msg);
}
var loginIndex = {
    login: function () {
        if (system.isBlank($("#account").val())) {
            tips("登录账号不可为空");
            return;
        }
        system.post(get_root + "/system/user/loginAdmin.action", {usrAccount: $("#account").val(),
            usrPassword: $("#password").val()}, function (data) {
            //console.info(data);

            setTimeout(function () {
                $('.authent').show().animate({ right: 90 }, {
                    easing: 'easeOutQuint',
                    duration: 600,
                    queue: false
                });
                $('.authent').animate({ opacity: 0 }, {
                    duration: 200,
                    queue: false
                }).addClass('visible');
                $('.login').removeClass('testtwo'); //平移特效
            }, 2000);
            setTimeout(function () {
                $('.authent').hide();
                $('.login').removeClass('test');
                if (data.code == '200') {
                    //登录成功
                    $('.login div').fadeOut(100);
                    $('.success').fadeIn(1000);
                    //**登陆选项
                var msg='<br> <div class="login_fields__submit click-bt" data-value="1"> <input type="button" style=" width: 140px !important; " value="我要学习">' +
                    ' </div> <div class="login_fields__submit click-bt" data-value="2"> <input type="button" style=" width: 140px !important; " value="我是管理"> </div>'
                    $('.success').html(data.msg+msg);

                    $(".click-bt").click(function(){
                        if($(this).attr("data-value")==1){
                            window.location.href=get_root+"/"
                        }else{
                            window.location.href=get_root+"/system/main"
                        }
                    })
                    var url=new Base64();
                    system.setCookie("uname", url.encode($("#account").val()).replace(/=/g,"%"), 100);
                    system.setCookie("password", url.encode($("#password").val().replace(/=/g,"%")), 30);

                   /* system.setCookie("uname", $("#account").val(), 100);
                    system.setCookie("password", $("#password").val(), 30);
              */
                 //window.location.href = get_root+"/";
                    //跳转操作
                } else {
                    AjaxErro(data);
                }
            }, 2400);
        })
    }
}