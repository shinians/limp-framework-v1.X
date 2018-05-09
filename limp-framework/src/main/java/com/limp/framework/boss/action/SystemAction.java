package com.limp.framework.boss.action;

import com.limp.framework.core.annotation.Access;
import com.limp.framework.utils.StoreControl;
import com.limp.framework.utils.StrUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * @author:zzh
 * Date: 16-1-11
 * Time: 下午9:08
 * To change this template use File | Settings | File Templates.
 */
//后台管理action
@Controller
@RequestMapping("/system")
public class SystemAction extends BaseAction {

    private static Logger log = Logger.getLogger(SystemAction.class.getName());

    /**
     * 登录后跳转到后台首页
     * @param model
     * @param service 指定跳转链接
     *                【注意：service="http://www.shinians.com/?id=222&param=sss"作为一个整体进行传递】
     *                方法：参数中含有一些特殊字符 所以这里使用escape将这些特殊字符使用%xx编码代替
     *                demo：var url = "aaa.action?id=111&url="+escape("http://www.shinians.com/?id=222&param=sss");
     * @param type  1 div 2 iframe 跳转地址
     * @param hide  1 div 2 iframe 跳转地址
     * @return
     */
    @Access(login = true, privilege = true)
    @RequestMapping(value = MAIN)
    public String main(Model model,String service,String type,String hide) {
        String site="../system/main";
        log.debug("------------站点名称-----------");
        String siteName=StoreControl.getValue("SYSTEMSITE.NAME");
        if(!StrUtils.isBlank(siteName)){
            site=site.replace("system","system/"+siteName);
        }
        //传递给前台，用于 跳转
        model.addAttribute("service",service);
        model.addAttribute("type", type);
        model.addAttribute("hide", hide);
        log.debug(site);
        //重定向方式
        return site;
    }

    /**
     * 登录后跳转到后台首页
     *
     * @return
     */
    @Access(login = true, privilege = false)
    @RequestMapping(value = "api")
    public String api() {
        return "../system/api/sys_api";
    }


    /**
     * 管理员登录页面
     *
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "login")
    public String login() {
        return "../system/login_admin";
    }


}
