package com.chinasofti.action;

import com.limp.framework.boss.action.BaseAction;
import com.limp.framework.boss.domain.User;
import com.limp.framework.boss.service.CacheService;
import com.limp.framework.boss.service.CommonService;
import com.limp.framework.boss.service.DictCodesService;
import com.limp.framework.boss.service.UserService;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.constant.ResultMsg;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * @author: Administrator
 * Date: 16-1-11
 * Time: 下午9:08
 * To change this template use File | Settings | File Templates.
 */
//后台管理action
@Controller
@RequestMapping("/index")
public class IndexAction extends BaseAction {
    private static Logger log= Logger.getLogger(IndexAction.class);

    @Autowired
    private UserService userService;
    @Autowired
    private CacheService cacheService;
    @Autowired
    private CommonService commonService;
    @Autowired
    private DictCodesService dictCodesService;




    /**
     * 获取缓存的key值
     * @param key
     * @return
     */
    @RequestMapping(value ="getCode",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getCode(String key) {

     /*   OrganInfo organInfo=new OrganInfo();
        organInfo.setId("123");
        organInfo.setFuntype(key);*/
        return  Result.getInstance(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, "organInfo", "").getJson(commonService);
    }
    /**
     * 管理员登录 :验证是否有权限访问
     * @param request
     * @param session
     * @param user
     * @param loginType  登录类型
     * @return
     */
    @RequestMapping(value ="mainValidate",produces = "text/plain;charset=UTF-8",method = RequestMethod.POST)
    public @ResponseBody String loginAdmin(HttpServletRequest request, HttpSession session, User user, String loginType) {
        Result action=userService.login(user,request);

        //验证是否存在权限
        action.getResultMap().put("ext", new HashMap<String, String>() {
            {
                put("url", "/index/main");
            }
        });
        return  action.getJson();
    }

    /**
     * 登录后跳转到后台首页
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value =MAIN)
    public String main(HttpServletRequest request, Model model){
        model.addAttribute("loadUrl",request.getParameter("loadUrl"));
        model.addAttribute("hideType", request.getParameter("hideType"));
        return "../chinasofti/platform";
    }

    /**
     * 微观检索
     * @return
     */
    @Access(login = false,privilege = false)
    @RequestMapping(value =PANEL)
    public String mainPanel(){

        //临时免登陆  login = true

        return "../chinasofti/microQuery";
    }


    /**
     * 登录页面
     * @return
     */
    @Access(login = false,privilege = false)
    @RequestMapping(value ="ssoLogin")
    public String login(){
        return "../chinasofti/ssoLogin";
    }


    /**
     * 测试
     * @param key
     * @return
     */
    @RequestMapping(value ="saveTest",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String saveTest(String key) {

        return  Result.getInstance(ResultCode.SUCCESS.toString(),ResultMsg.SUCCESS,"","").getJson(commonService);
    }

}
