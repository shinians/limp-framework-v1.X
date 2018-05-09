package com.limp.framework.boss.action;

import com.google.gson.Gson;
import com.limp.framework.boss.ApplicationContext;
import com.limp.framework.boss.domain.Menu;
import com.limp.framework.boss.domain.User;
import com.limp.framework.boss.post.HttpRequestUtil;
import com.limp.framework.boss.service.MenuService;
import com.limp.framework.boss.service.UserService;
import com.limp.framework.core.abs.AbstractAction;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.core.constant.OPERATION;
import com.limp.framework.core.constant.ResultMsg;
import com.limp.framework.utils.StrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

import static com.limp.framework.core.constant.Constant.TREE;

/**
 * @author:zzh
 * 菜单管理
 */
@Controller
@RequestMapping("/system/menu")
public class MenuAction extends AbstractAction {
    @Autowired
    private MenuService menuService;
    @Autowired
    private UserService userService;
    private Menu menu;
    private String mk;
    private String encoder;
    private String isExist;
    /**
     * 每页显示的条数
     */
    private static final Integer DEFAULT_ROW = 10;

    /**
     *  一共多少行
     */
    private Integer rowCount;

    /**
     *获取菜单列表
     * @param session
     * @param menu
     * @return
     */
    @Access(login=true,privilege = false)
    @RequestMapping(value ="getMenuList", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getMenuList(HttpSession session,Menu menu) {
        List<Menu> menuList = menuService.getList(menu);
        return Result.getInstance(ResultCode.SUCCESS.toString()
        , ResultMsg.SUCCESS,menuList,"").getJson();
    }
    /**
     *根据key获取本级菜单以下的3级别菜单
     * @param session
     * @param keyWord
     * @return
     */
    @Access(login=false,privilege = false)
    @RequestMapping(value ="getChild3LvMenu", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getChild3LVMenusByKeyWord(HttpSession session,String keyWord) {
        List<Menu> menuList = menuService.getChild3LVMenusByKeyWord(keyWord);
        return Result.getInstance(ResultCode.SUCCESS.toString()
        , ResultMsg.SUCCESS,menuList,"").getJson();
    }
    /**
     *
     * 同步该菜单
     * @param session
     * @param menu
     * @return
     */
    @Access(login=true,privilege = false)
    @RequestMapping(value ="synMenuByKeyWord", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String synMenuByKeyWord(HttpSession session,Menu menu) {
        if(menuService.synMenuByKeyWord(menu)){
            return Result.getInstance(ResultCode.SUCCESS.toString()
                    , ResultMsg.SUCCESS,"","").getJson();
        };
        return Result.getInstance(ResultCode.ERROR.toString()
        , ResultMsg.ERROR,"","").getJson();
    }

    @Access(login=true,privilege = false)
    @RequestMapping(value ="httpUrl", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String synMenuByKeyWdord(HttpSession session,String url,String paramStr) {
//        url="http://202.127.45.165:8093/system/api/getAreaCodeByDomain";
        if(StrUtils.isBlank(url)){
            return "";
        }
        String content="";
        try{
             content = HttpRequestUtil.sendPost(url, paramStr);
        }catch (Exception e){
            return "";
        }
        return content;
    }

    /**
     * 查询菜单方法Pager
     * @param pager
     * @param menu
     * @param orderStr
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getMenuPageList",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getMenuPageList(Pager pager,Menu menu,String orderStr) {
        pager = new Pager(pager.getPage(), DEFAULT_ROW);
        Pager<Menu> menuPager = menuService.getPageDomainList(menu, orderStr, pager);
        rowCount = pager.getRowCount();
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,menuPager,"").getJson();
    }

    @Access(login=true,privilege = false)
    @RequestMapping(value = TREE)
    public @ResponseBody String tree(String uid) {
        List<Menu> menuList = menuService.getListByPId(uid);
        List<Menu> newMenuList = new ArrayList<Menu>();
        for (Integer i = 0; i < menuList.size(); i++) {
            Menu menu = menuList.get(i);
            menu.setChildren(menuService.getListByPId(menu.getId()));
            newMenuList.add(menu);
        }
        Gson gson = new Gson();
        String listStr = gson.toJson(newMenuList);
        return listStr;
    }

    //获得菜单内容
    @RequestMapping(value = "getMenu")
    public @ResponseBody
    String getMenu(Model model, String id) {
        List<Menu> menuList = menuService.getList(id);
        Gson gson = new Gson();
        Menu menu = new Menu();
        model.addAttribute("menu", menu);
        return menuList.size() > 0 ? gson.toJson(menuList.get(0)) : null;
    }

    /**
     * 根据guid删除菜单
     *
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "delById", method = RequestMethod.POST)
    public @ResponseBody String list() {
        boolean isOk = menuService.deleteByGuid(this.getUuid());
        String flag = isOk == true ? "1" : "0";
        return flag;
    }
    /**
     * 删除菜单：删除只更新状态，其他操作不进行操作
     * @param id ：菜单ID
     * @param menState 菜单状态： -1删除  1正常
     * @return
     */
    @Access(login = true,privilege = true,operationLog = OPERATION.DELETE,operationIntro = "管理员删除菜单")
    @RequestMapping(value = "delMenu", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody String del(String id,String menState,HttpServletRequest request) {
            if(!StrUtils.isBlank(id)){
                 Menu menuDel=new Menu();
                menuDel.setId(id);
                User user=(User)ApplicationContext.getLoginUser(request);
                menuDel.setMenRc1(user.getUsrAccount());
                //更新菜单状态，如果menu菜单为空，则制成删除操作
                menuDel.setMenState(StrUtils.isBlank(menState)? Constant.STATE_DELETE:Integer.parseInt(menState));
                if (menuService.update(menuDel)) {
                    return new Result(ResultCode.SUCCESS.toString(), ResultMsg.DEL_SUCCESS, "","").getJson();
                }
            }
        return new Result(ResultCode.ERROR.toString(), ResultMsg.DEL_ERROR, "","").getJson();
    }
    /**
     * 管理员修改菜单
     * @param menu
     * @return
     */
    @Access(login = true,privilege = true,operationLog = OPERATION.UPDATE,operationIntro = "管理员修改菜单")
    @RequestMapping(value = "updateMenu", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody String updateMenu(Menu menu,HttpServletRequest request) {

        if(!StrUtils.isBlank(menu.getId())){
            User user=(User)ApplicationContext.getLoginUser(request);
            menu.setMenRc1(user.getUsrAccount());
            if (menuService.update(menu)) {
                return new Result(ResultCode.SUCCESS.toString(), ResultMsg.UPDATE_SUCCESS, "","").getJson();
            }
        } ;
        return new Result(ResultCode.ERROR.toString(), ResultMsg.UPDATE_ERROR, "","").getJson();
    }
    /**
     * 管理员新增菜单
     * @param menu
     * @return
     */
    @Access(login = true,privilege = true,operationLog = OPERATION.UPDATE,operationIntro = "管理员新增菜单")
    @RequestMapping(value = "addMenu", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody String addMenu(Menu menu,HttpServletRequest request) {
        //id为空则是添加菜单
        if(StrUtils.isBlank(menu.getId())){
            User user=(User)ApplicationContext.getLoginUser(request);
            menu.setMenRc1(user.getUsrAccount());
            if (menuService.save(menu)) {
                return new Result(ResultCode.SUCCESS.toString(), ResultMsg.ADD_SUCCESS, "","").getJson();
            }
        }
        return new Result(ResultCode.ERROR.toString(), ResultMsg.ADD_ERROR, "","").getJson();
    }
    /**
     * @Deprecated
     * 添加Or更新菜单
     * id为空则是添加菜单
     * @param menu
     * @return
     */
    @Access(login = true,privilege = true,operationLog = OPERATION.UPDATE,operationIntro = "保存菜单")
    @RequestMapping(value = "saveOrUpdate", method = RequestMethod.POST, produces = "text/plain;charset=UTF-8")
    public @ResponseBody String save(Menu menu) {
        //id为空则是添加菜单
        if(StrUtils.isBlank(menu.getId())){
            if (menuService.save(menu)) {
                return new Result(ResultCode.SUCCESS.toString(), ResultMsg.UPDATE_SUCCESS, "","").getJson();
            }
        }else{
            if (menuService.update(menu)) {
                return new Result(ResultCode.SUCCESS.toString(), ResultMsg.UPDATE_SUCCESS, "","").getJson();
            }
        } ;
        return new Result(ResultCode.ERROR.toString(), ResultMsg.UPDATE_ERROR, "","").getJson();
    }
    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public String getEncoder() {
        return encoder;
    }

    public void setEncoder(String encoder) {
        this.encoder = encoder;
    }

    public String getMk() {
        return mk;
    }

    public void setMk(String mk) {
        this.mk = mk;
    }

    public String getExist() {
        return isExist;
    }

    public void setExist(String exist) {
        isExist = exist;
    }
}
