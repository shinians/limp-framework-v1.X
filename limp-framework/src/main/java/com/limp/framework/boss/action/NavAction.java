package com.limp.framework.boss.action;

import com.limp.framework.core.annotation.Access;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * @author:zzh
 * Date: 16-1-30
 * Time: 下午7:36
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/system/nav")
public class NavAction extends  BaseAction{
    private static Logger log = Logger.getLogger(NavAction.class);
    /**
     *  权限首页
     * @return
     * @throws Exception
     */
    @Access(login = true,privilege = true)
    @RequestMapping(value = "permission")
    public String index() throws Exception {
        return "../system/nav/sys_permission";

    }
    /**
     * 菜单管理页面
     * @return
     */
    @Access(login = true,privilege = true)
    @RequestMapping(value = "menu")
    public String menu() {
        return "../system/nav/sys_menu";
    }
    /**
     * 菜单数据同步
     * @return
     */
    @Access(login = true,privilege = true)
    @RequestMapping(value = "menuSyn")
    public String menuSyn() {
        return "../system/nav/sys_menu_syn";
    }
    /**
     * 角色配置页面
     * @return
     */
    @Access(login = true,privilege = true)
    @RequestMapping(value = "role")
    public String role() {
        return "../system/nav/sys_role";
    }

    /**
     * 用户管理页面
     * @return
     */
    @Access(login = true,privilege = true)
    @RequestMapping(value = "user")
    public String user() {
        return "../system/nav/sys_user";
    }

    /**
     * 用户管理页面
     * @return
     */
    @Access(login = true,privilege = true)
    @RequestMapping(value = "conf")
    public String conf() {
        return "../system/nav/sys_conf";
    }

    /**
     * 信息 邮件管理
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value = "msg")
    public String msg() {
        return "../system/nav/sys_msg";
    }

    /**
     * 系统监控页面：
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value = "monitor")
    public String monitor() {
        return "../system/nav/sys_monitor";
    } /**
     /*
     ：字典表管理页面
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value = "dict")
    public String dict() {
        return "../system/nav/sys_dict";
    }
    /*
     ：字典表管理页面
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value = "area")
    public String area() {
        return "../system/nav/sys_area";
    }
    /*
     ：命令集合
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value = "command")
    public String command() {
        return "../system/nav/sys_command";
    }
    /*
    ：page Log日志管理页面
    * @return
    */
    @Access(login = true,privilege = false)
    @RequestMapping(value = "plog")
    public String pageLog() {
        return "../system/nav/sys_page_log";
    }



}
