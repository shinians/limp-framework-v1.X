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
    //$("#account").val(system.getCookie("uname"));
    //$("#password").val(system.getCookie("password"));
    $("#log-btn").click(function(){
        sysLogin.login();
    })
})
function tips(msg){
    alert(msg);
}
var sysLogin = {
    login: function () {
        if (system.isBlank($("#account").val())) {
            tips("登录账号不可为空");
            return;
        }
        system.post(get_root + "/system/user/loginAdmin.action", {usrAccount: $("#account").val(),
            usrPassword: $("#password").val()}, function (data) {
            log.info(data);
            if (data.code == "200") {
                var url=new Base64();
                system.setCookie("uname", url.encode($("#account").val()).replace(/=/g,"%"), 100);
                system.setCookie("password", url.encode($("#password").val().replace(/=/g,"%")), 30);
                window.location.href = get_root + data.ext.url;
            } else {
                alert(data.msg);
            }
        })
    }
}