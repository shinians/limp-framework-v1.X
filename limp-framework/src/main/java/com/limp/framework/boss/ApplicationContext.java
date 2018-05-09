package com.limp.framework.boss;

import com.limp.framework.boss.domain.*;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.utils.JsonUtils;
import com.limp.framework.utils.StrUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * @author: zzh
 * Date: 16-2-4
 * Time: 下午11:19
 * To change this template use File | Settings | File Templates.
 */
public class ApplicationContext {

    //获得session用户信息

    /**
     * 获取登录用户信息
     * @param request
     * @return
     */
    public static final User getLoginUser(HttpServletRequest request){
        if(StrUtils.isBlank(request.getSession().getAttribute(Constant.KEY_USER))){
            return null;
        }
        return  (User)(request.getSession().getAttribute(Constant.KEY_USER));
    }
    /**
     * 获取登录用户信息
     * @param session
     * @return
     */
    public static final User getLoginUser(HttpSession session){
        if(StrUtils.isBlank(session.getAttribute(Constant.KEY_USER))){
            return null;
        }
        return  (User)(session.getAttribute(Constant.KEY_USER));
    }

    /**
     * 获得用户和角色的 菜单列表权限
     * 获得session List<Menu>
     * @param request
     * @return
     */
    public static final List<Menu> getMenuList(HttpServletRequest request){
        if(StrUtils.isBlank(request.getSession().getAttribute(Constant.KEY_MENU))){
            return null;
        }
        return  (List<Menu>)(request.getSession().getAttribute(Constant.KEY_MENU));
    }
    /**
     * 获得用户和角色的 菜单列表权限
     * @param session
     * @return
     */
    public static final List<Menu> getMenuList(HttpSession session){
        if(StrUtils.isBlank(session.getAttribute(Constant.KEY_MENU))){
            return null;
        }
        return  (List<Menu>)(session.getAttribute(Constant.KEY_MENU));
    }
    /**
     * 获得用户和角色的 菜单列表权限 id:menumap
     * @param session
     * @return
     */
    public static final Map<String,Menu> getMenuKVMap(HttpSession session){
        if(StrUtils.isBlank(session.getAttribute(Constant.KEY_MENU_KVMAP))){
            return null;
        }
        return (Map<String,Menu>)session.getAttribute(Constant.KEY_MENU_KVMAP);
    }
    /**
     * 获得系统配置Map key:menumap
     * @param session
     * @return
     */
    public static final Map<String,ConfigField> getConfFieldKVMap(HttpSession session){
        if(StrUtils.isBlank(session.getAttribute(Constant.KEY_CONFFIELD_KVMAP))){
            return null;
        }
        return (Map<String,ConfigField>)session.getAttribute(Constant.KEY_CONFFIELD_KVMAP);
    }
    /**
     * 获得角色
     * 获得session List<Role>
     * @param request
     * @return
     */
    public static final List<Role> getRoleList(HttpServletRequest request){
        if(StrUtils.isBlank(request.getSession().getAttribute(Constant.KEY_ROLE))){
            return null;
        }
        return  (List<Role>)(request.getSession().getAttribute(Constant.KEY_ROLE));
    }
    /**
     * 获得角色
     * @param session
     * @return
     */
    public static final List<Role> getRoleList(HttpSession session){
        if(StrUtils.isBlank(session.getAttribute(Constant.KEY_ROLE))){
            return null;
        }
        return  (List<Role>)(session.getAttribute(Constant.KEY_ROLE));
    }

}
