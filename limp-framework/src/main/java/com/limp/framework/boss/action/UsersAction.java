package com.limp.framework.boss.action;

import com.limp.framework.boss.ApplicationContext;
import com.limp.framework.boss.domain.Menu;
import com.limp.framework.boss.domain.PageLog;
import com.limp.framework.boss.domain.User;
import com.limp.framework.boss.domain.UserSet;
import com.limp.framework.boss.service.CommonService;
import com.limp.framework.boss.service.RoleService;
import com.limp.framework.boss.service.UserService;
import com.limp.framework.core.abs.AbstractCRUDAction;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.core.constant.OPERATION;
import com.limp.framework.core.constant.ResultMsg;
import com.limp.framework.utils.SecurityUtils;
import com.limp.framework.utils.StrUtils;
import com.limp.framework.utils.TextUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 后台用户管理
 * Created with IntelliJ IDEA.
 * @author:zzh
 * Date: 16-2-22
 * Time: 下午11:35
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/system/user")
public class UsersAction extends AbstractCRUDAction<User> {
    @Autowired
    private CommonService logService;
    @Autowired
    private UserService userService;
    @Autowired
    private RoleService roleService;

    private static Logger log = Logger.getLogger(UsersAction.class.getName());
    /**
     *  一共多少行
     */
    private Integer rowCount;

    private static final Integer DEFAULT_ROW = 10;


    /**
     * 获得用户列表
     * @param pager 分页
     * @param user 用户
     * @param orderName
     * @param orderType
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getUserList",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getUserList(Pager pager,User user,String orderName,String orderType) {
        pager = new Pager(pager.getPage(), DEFAULT_ROW);
        Pager<User> userPager = userService.getListExample(orderName,orderType,user,pager);
        rowCount = pager.getRowCount();
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,userPager,"").getJson();
    }

    /**
     * 管理员登录 :验证是否有权限访问
     * @param request
     * @param session
         * @param user
     * @param loginType  登录类型
     * @return
     */
    @Access(login = false,privilege = false,operationLog= OPERATION.SELECT)
    @RequestMapping(value ="loginAdmin",produces = "text/plain;charset=UTF-8",method = RequestMethod.POST)
    public @ResponseBody String loginAdmin(HttpServletRequest request,HttpSession session,User user,String loginType) {
        Result action=userService.login(user, request);

        //验证是否存在权限
         action.getResultMap().put("ext", new HashMap<String, String>(1) {
            {
                put("url", "/system/main");
            }
        });
        String str=action.getJson() ;
        return  str;
    }


    /**
     * 用户个人中心
     * @param session
     * @param model
     * @param user
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="index")
    public  String index(HttpSession session,Model model,User user) {
        model.addAttribute("user", user);
        User userSession = (User) session.getAttribute(Constant.KEY_USER);
        if (StrUtils.isBlank(userSession)) {
            return new Result(ResultCode.ERROR.toString(), ResultMsg.LOGOUT_ERROR, "", "").getJson();
        }
        log.info("初始化用户权限信息");
        List<Map<String, Object>> mapUserSet = userService.getUserSetMenuMapById(userSession.getId());
        Map map = new HashMap();
        for (Map obj : mapUserSet) {
            if (!StrUtils.isBlank(obj.get(Constant.SET_MEN_KEYWORD))) {
                map.put(obj.get(Constant.SET_MEN_KEYWORD), obj);
            }
        }
        model.addAttribute(Constant.KEY_SET, map);
        return "../system/user/user_personal";
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="getAuthSet",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getAuthSet(String userId) {
        if(StrUtils.isBlank(userId)){
            return new Result(ResultCode.ERROR.toString(), ResultMsg.PARAMS_ERROR,"","").getJson();
        }
        List<Map<String,Object>> mapUserSet=userService.getUserSetMenuMapById(userId);
        List<Map<String,Object>> setList=new ArrayList<Map<String,Object>>();
        for (Map obj:mapUserSet){
           setList.add(obj);
        }
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,setList,"").getJson();
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="updateSet",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String updateSet(HttpSession session,HttpServletRequest request,UserSet userSet) {
        if(StrUtils.isBlank(userSet.getUserid())||StrUtils.isBlank(userSet.getMenuid())){
            return  new Result(ResultCode.ERROR.toString(), ResultMsg.UPDATE_ERROR,"","").getJson();
        }
        userService.updateUserSetByUsrMenuId(userSet);
        logService.insertPageLog(new PageLog(ApplicationContext.getLoginUser(session).getUsrAccount()
                ,Constant.UPDATE,"更新用户配置",request.getRequestURI(),Result.toJSONString(userSet),
                ""));

        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.UPDATE_SUCCESS,"","").getJson();
    }

    /**
     *  根据父类id获得菜单 【session中获得】
     * @param request
     * @param session
     * @param id
     * @return
     */
    @Access(login=true,privilege = false)
    @RequestMapping(value ="getMenuById",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getMenuById(HttpServletRequest request,HttpSession session,String id) {
        List<Menu> menusbak=(ArrayList<Menu>)session.getAttribute(Constant.KEY_MENU);
        if(StrUtils.isBlank(menusbak)){
            return Result.getInstance(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, menusbak, new HashMap<String,String>()).getJson();
        }
        List<Menu> menus=new ArrayList<Menu>();
        for(Menu menub:menusbak){
               if(menub.getMenType()<10){
                   menus.add(menub) ;
               }
        }
        if(StrUtils.isBlank(menus)){
            return  Result.getInstance(ResultCode.ERROR.toString(),"error","未登录","").getJson();
        }
        List<Menu>authMenus=new ArrayList<Menu>();
         for (Menu menu:menus){
             //如果是查询id的子目录
             if(menu.getMenFatherid().equals(id)){
                 //查找一级菜单 以及它的子类
                 List<Menu> menuChilds=new ArrayList<Menu>();
                 for (Menu menuChild:menus){
                     if(menuChild.getMenFatherid().equals(menu.getId())){
                         //查找二级菜单以及子类
                         List<Menu> menuChildChild=new ArrayList<Menu>();
                         for (Menu menuChildC:menus){
                             if(menuChildC.getMenFatherid().equals(menuChild.getId())){
                                 //查找三级菜单以及子类
                                 List<Menu> lastChilds=new ArrayList<Menu>();
                                 for (Menu lastChild:menus){
                                     if(lastChild.getMenFatherid().equals(menuChildC.getId())){
                                        //查找四级菜单以及子类
                                         List<Menu> lastChildsLast=new ArrayList<Menu>();
                                         for(Menu lastChildLast:menus){
                                             if(lastChildLast.getMenFatherid().equals(lastChild.getId())){
                                                 lastChildsLast.add(lastChildLast);
                                             }
                                         }
                                         lastChild.setChildren(lastChildsLast);
                                         lastChilds.add(lastChild);
                                     }
                                 }
                                 menuChildC.setChildren(lastChilds);
                                 menuChildChild.add(menuChildC);
                             }
                             menuChild.setChildren(menuChildChild);
                         }
                         menuChilds.add(menuChild);
                     }
                 }
                 menu.setChildren(menuChilds);
                 authMenus.add(menu);
             }
         }
        return Result.getInstance(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, authMenus, new HashMap<String,String>()).getJson();
    }
    /**
     * 根据用户角色id获得menuids
     * @param rid   todo
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getMenusByUserId",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getMenusByRoleId(String rid) {
        return   Result.getInstance(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,userService.getMenus(rid),"").getJson();
    }

    /**
     * 用户管理：授予用户角色
     * @param request
     * @param session
     * @param uid  用户ID
     * @param roleIdDel  需要删除的roleId
     * @param roleIdAdd   新增的roleId
     * @return
     */
    @Access(login = true,privilege = true,operationLog = OPERATION.UPDATE,operationIntro = "授予用户角色")
    @RequestMapping(value ="updateUserRoleMap",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String saveRoleMenus(HttpServletRequest request,HttpSession session,String uid,String roleIdDel,String roleIdAdd) {
        //最终删除
        List oldListTemp=StrUtils.compSourceListDiff(Arrays.asList(roleIdDel.split(",")),
                Arrays.asList(roleIdAdd.split(",")));
        //最终新增
        List listTemp=StrUtils.compSourceListDiff(Arrays.asList(roleIdAdd.split(",")),
                Arrays.asList(roleIdDel.split(",")));
        log.debug(TextUtils.format("删除源{0};新增源{1}",roleIdDel,roleIdAdd));
        log.debug(TextUtils.format("删除角色ID{0};新增角色ID{1}",oldListTemp,listTemp));

        if(!StrUtils.isBlank(oldListTemp)&&oldListTemp.size()!=0){
            userService.delURoleMapByUId(uid, oldListTemp);
        }
        if(!StrUtils.isBlank(roleIdAdd)&&listTemp.size()!=0){
            userService.addURoleMapByUId(uid,listTemp);
        }
        Map param=new HashMap();
        param.put("uid",uid);
        param.put("roleIdAdd",roleIdAdd);
        param.put("roleIdDel",roleIdDel);
        logService.insertPageLog(new PageLog(ApplicationContext.getLoginUser(session).getUsrAccount()
                ,Constant.UPDATE,"更新用户角色",request.getRequestURI(),Result.toJSONString(param),
                ""));
        return   Result.getInstance(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,"","").getJson();
    }

    /**
     * 退出
     * @param session
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="logOut",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String logOut(HttpSession session) {
        /**
         * 移除 特定的用户session
         * session.removeAttribute("USER_KEY")
         */
        session.invalidate();
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.LOGOUT_SUCCESS,"","").getJson();
    }

    /**
     * 修改密码
     * @param user
     * @param repPassword
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="modPwd",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String modPwd(User user,String repPassword) {
        log.debug(TextUtils.format("修改密码:account{0}/password{1}/repPassword{2}:",user.getUsrAccount(),user.getUsrPassword(),repPassword));
        if(StrUtils.isBlank(user)||StrUtils.isBlank(user.getUsrAccount())){
            return  new Result(ResultCode.ERROR.toString(), ResultMsg.LOGIN_ERROR,"","").getJson();
        }
        List<User>  users= userService.getUserInfo(user.getUsrAccount());
        if (users.size()<=0||!users.get(0).getUsrPassword().equals(SecurityUtils.MD5(user.getUsrPassword()))){
            return  new Result(ResultCode.ERROR.toString(), ResultMsg.LOGIN_ERROR,"","").getJson();
        }
        User entity=users.get(0);
        entity.setUsrPassword(SecurityUtils.MD5(repPassword));
        userService.update(entity);
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.UPDATE_SUCCESS,"","").getJson();
    }

    /**
     * 更新用户菜单权限
     * @param uid
     * @param menuIdsDel
     * @param menuIdsAdd
     * @return
     */
    @Access(login = true,privilege = true)
    @RequestMapping(value ="saveUserMenuMap",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String saveUserMenuMap(HttpServletRequest request,HttpSession session,String uid,String menuIdsDel,String menuIdsAdd) {
        if(!StrUtils.isBlank(menuIdsDel)){
            userService.deleteMenuById(uid, Arrays.asList(menuIdsDel.split(",")));
        }
        if(!StrUtils.isBlank(menuIdsAdd)){
            userService.addMenuById(uid,Arrays.asList(menuIdsAdd.split(",")));
        }
        logService.insertPageLog(new PageLog(ApplicationContext.getLoginUser(session).getUsrAccount()
                , Constant.UPDATE, "更新用户菜单", request.getRequestURI(), "",
                ""));
        return   Result.getInstance(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,"","").getJson();
    }

    /**
     * 重置密码操作
     * ids（逗号分隔）：以及密码
     * @param user
     * @return
     */
    @Access(login = true,privilege = true,operationLog = OPERATION.UPDATE,operationIntro = "重置密码")
    @RequestMapping(value ="resetPwd" ,method = RequestMethod.POST)
    public @ResponseBody String repPwd(HttpSession session,HttpServletRequest request,User user) {
        if(user==null||"".equals(user.getId())||user.getId()==null){
            return  new Result(ResultCode.ERROR.toString(), ResultMsg.PARAMS_ERROR,"","").getJson();
        }
        //支持批量操作
        String []ids=user.getId().split(",");
        for(int i=0;i<ids.length;i++){
            User u=new User();
            u.setId(ids[i]);
            u.setUsrPassword(SecurityUtils.MD5(user.getUsrPassword()));
            userService.update(u);
        }
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.UPDATE_SUCCESS,"","").getJson();
    }

    /**
     *  管理员删除用户信息
     * @param user
     * @return
     */
    @Access(login = true,privilege = true,operationLog = OPERATION.DELETE,operationIntro = "管理员删除用户信息")
    @RequestMapping(value ="delUser",produces = "text/plain;charset=UTF-8",method = RequestMethod.POST)
    public @ResponseBody String delUser(HttpServletRequest request,User user) {
        if(StrUtils.isBlank(user)||StrUtils.isBlank(user.getId())){
            return  new Result(ResultCode.ERROR.toString(), ResultMsg.DEL_ERROR,"","").getJson();
        }
        User logUser=ApplicationContext.getLoginUser(request);
        User delUser=new User();
        delUser.setId(user.getId());
        delUser.setUsrState(StrUtils.isBlank(user.getUsrState()) ? Constant.STATE_DELETE : user.getUsrState());
        delUser.setUpdateDate(new Date());
        delUser.setOptAccount(logUser.getUsrAccount());
        if(!userService.update(delUser)){
            return  new Result(ResultCode.ERROR.toString(), ResultMsg.DEL_ERROR,"","").getJson();
        };
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.DEL_SUCCESS,"","").getJson();
    }
    /**
     *  更新用户  1、必须登录后更新
     * @param user
     * @return
     */
    @Access(login = true,privilege = true,operationLog = OPERATION.UPDATE,operationIntro = "管理员更新用户信息")
    @RequestMapping(value ="updates",produces = "text/plain;charset=UTF-8",method = RequestMethod.POST)
    public @ResponseBody String updates(HttpServletRequest request,User user) {
        if(StrUtils.isBlank(user)||StrUtils.isBlank(user.getId())){
            return  new Result(ResultCode.ERROR.toString(), ResultMsg.UPDATE_ERROR,"","").getJson();
        }
        User logUser=ApplicationContext.getLoginUser(request);
        user.setUpdateDate(new Date());
        user.setOptAccount(logUser.getUsrAccount());
        if(!userService.update(user)){
            return  new Result(ResultCode.ERROR.toString(), ResultMsg.UPDATE_ERROR,"","").getJson();
        };
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.UPDATE_SUCCESS,"","").getJson();
    }

    /**
     * 日期格式 处理 前台传入后台
     * @param binder
     */
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
          //true:允许输入空值，false:不能为空值
    }
    /**
     *   更新用户
     * @param user
     * @return
     */
    @RequestMapping(value ="update",produces = "text/plain;charset=UTF-8",method = RequestMethod.POST)
    public @ResponseBody String update(HttpSession session,User user) {
        //TODO 如何防止其他人更新 别人的用户
        if(user==null||"".equals(user.getId())||user.getId()==null){
            return  new Result(ResultCode.ERROR.toString(), ResultMsg.LOGIN_ERROR,"","").getJson();
        }
        userService.update(user);
        //跟新session
        User u=(User)session.getAttribute(Constant.KEY_USER);
        u.setUsrName(user.getUsrName());
        session.setAttribute(Constant.KEY_USER,u);
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.UPDATE_SUCCESS,"","").getJson();
    }

    /**
     * 新增用户
     * @param user
     * @return
     */
    @Access(login = true,privilege = true,operationLog = OPERATION.INSERT,operationIntro = "新增用户")
    @RequestMapping(value ="add",produces = "text/plain;charset=UTF-8",method = RequestMethod.POST)
    public @ResponseBody String addUser(User user) {
        if(user==null||StrUtils.isBlank(user.getUsrAccount())){
            return  Result.getInstance(ResultCode.ERROR.toString(), ResultMsg.PARAMS_ERROR,"","").getJson();
        }
        //判断用户是否存在
        List<User>  users= userService.getUserInfo(user.getUsrAccount());
        if (users.size()>0){
            return  Result.getInstance(ResultCode.ERROR.toString(), ResultMsg.USER_EXIST,"","").getJson();
        }
        user.setUsrPassword(SecurityUtils.MD5(user.getUsrPassword()));
        userService.insertUser(user);
        return  Result.getInstance(ResultCode.SUCCESS.toString(), ResultMsg.ADD_SUCCESS,"" ,"").getJson();
    }

    @Override
    protected void prepare() {
        //To change body of implemented methods use File | Settings | File Templates.
    }


}
