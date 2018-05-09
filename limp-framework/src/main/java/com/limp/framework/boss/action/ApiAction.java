package com.limp.framework.boss.action;

import com.limp.framework.boss.ApplicationContext;
import com.limp.framework.boss.domain.*;
import com.limp.framework.boss.mapper.oracle.ObjectUtilMapper;
import com.limp.framework.boss.service.*;
import com.limp.framework.core.abs.AbstractAction;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.core.constant.ResultMsg;
import com.limp.framework.utils.SecurityUtils;
import com.limp.framework.utils.StoreControl;
import com.limp.framework.utils.StrUtils;
import com.limp.framework.utils.TextUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resources;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 为查询权限权限API
 *
 * @author: zzh
 * Date: 17-6-27
 * Time: 上午9:14
 * To change this template use File | Settings | File Templates.
 */


@Controller
@RequestMapping("/system/api")
public class ApiAction extends AbstractAction {

    private static Logger log = Logger.getLogger(ApiAction.class);

    @Autowired
    private PermissionService permissionService;

    @Autowired
    private MenuService menuService;

    @Autowired
    private AreaCodeService areaCodeService;
    @Autowired
    private RoleService roleService;

    @Autowired
    private UserService userService;
    /**
     *
     */
    @Autowired
    private ObjectUtilMapper objectUtilMapper;

    /**
     * 获取区域代码
     * @param areaCode
     * @return
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getAreaCodeByDomain", produces = "text/plain;charset=UTF-8")
    public
    @ResponseBody
    String getTreeById(AreaCode areaCode) {

        if (StrUtils.isBlank(areaCode)) {
            return new Result(ResultCode.ERROR.toString(), ResultMsg.SUCCESS, "非法参数", "").getJson();
        }

        List<AreaCode> areaCodeList = areaCodeService.getAreaCodeListByDomain(areaCode);

        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, areaCodeList, "").getJson();
    }

    /**
     * 菜单树：
     * 根据id获取此菜单以下的所有Tree数据
     * @param id 此菜单的id
     * @return 返回此菜单
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getTreeById", produces = "text/plain;charset=UTF-8")
    public
    @ResponseBody
    String getTreeById(String id) {
        List<Menu> menuList = menuService.getTreeById(id);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, menuList, "").getJson();
    }

    /**
     * 菜单树
     * 根据id获取此菜单以下的所有Tree数据
     *
     * @param id 此菜单的id
     * @return 返回此菜单
     */
    @Access(login = false, privilege = false)
    @RequestMapping(value = "getAuthTreeById", produces = "text/plain;charset=UTF-8")
    public
    @ResponseBody
    String getAuthTreeById(String id, HttpSession session) {
        //该id以下的所有菜单
        List<Menu> menuList = menuService.getTreeById(id);
        //返回所有的权限菜单
        Map<String, Menu> menuKVMap = ApplicationContext.getMenuKVMap(session);
        //定义返回map
        List<Menu> menuListReturn = new ArrayList<Menu>();

        if (StrUtils.isBlank(menuList) || StrUtils.isBlank(menuKVMap)) {
            return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, menuListReturn, "").getJson();
        }
        //过滤无权限的菜单
        for (Menu menu : menuList) {
            if (menuKVMap.containsKey(menu.getId())) {
                menuListReturn.add(menu);
            }
        }
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, menuListReturn, "").getJson();
    }

    /**
     * 前台和后台的交互（ObjectUtilMapper.xml文件）
     * @param method 方法名称 1、selectDictGroupByCate
     * @param params 参数名称
     * @return  list Map 集合
     */
    @Access(login=true,privilege = false)
    @RequestMapping(value ="getListMap", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getCompNames(String method,@RequestParam Map<String,Object>params) {
       //        Map params=new HashMap(); getCompNames  |areaCode
        if(StrUtils.isBlank(method)){
            return Result.getInstance(ResultCode.ERROR.toString(), ResultMsg.ERROR, "", "").getJson();

        }
        List<Map<String,Object>> listMap=objectUtilMapper.selectListMapByMethod(method,params);

        return Result.getInstance(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, listMap, "").getJson();

    }
   /* @Access(login=true,privilege = false)
    @RequestMapping(value ="commandSql", produces = "text/plain;charset=UTF-8")
    public @ResponseBody String commandSql(String command) {
        //        Map params=new HashMap(); getCompNames  |areaCode
        if(StrUtils.isBlank(command)){
            return Result.getInstance(ResultCode.ERROR.toString(), ResultMsg.ERROR, "", "").getJson();

        }
        String sql="SELECT * FROM USER_TABLES";
        List<Map<String,Object>> listMap=objectUtilMapper.selectDynamicCommandSql(sql);

        return Result.getInstance(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, listMap, "").getJson();

    }
   */ /*************************对外提供接口begin************************************/

    /**
     * 【1】获取角色列表
     * demo:http://127.0.0.1:8084/system/api/getRoleList?name=icss&pwd=6C0DEE8F6DFA78F9A693BEEE72EEDACF&account=admin
     * 获取角色列表 对外提供API
     * @param name 登陆账号
     * @param pwd  登陆密码
     * @param account 获取该账号的角色
     * @return  {"roleId":"3006b107287346a286e70e04a98b1ee4","roleName":"测试添加编码","checked":"0"}   checked：1 被赋予该角色
     */
    @Access(login = false,privilege = false)
    @RequestMapping(value ="getRoleList",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getRoleList(@RequestParam(required = true)String name,
                                            @RequestParam(required = true)String pwd,@RequestParam(required = true)String account) {
        if(!StoreControl.getValue("API.USERNAME").equals(name)){
            return Result.getInstance(ResultCode.ERROR.toString(), "用户名错误", "", "").getJson();
        }
        if(!StrUtils.isBlank(pwd)){
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String pwdmd5 = SecurityUtils.encry(SecurityUtils.encry(StoreControl.getValue("API.PWD")) + sdf.format(new Date()));
            if(!pwdmd5.equals(pwd)){
               // return Result.getInstance(ResultCode.ERROR.toString(), "密码错误", "", "").getJson();
            }

        }else{
            return Result.getInstance(ResultCode.ERROR.toString(), "密码错误", "", "").getJson();
        }


        List<User> users=userService.getUserInfo(account);
        if(users.size()==0){
            return Result.getInstance(ResultCode.ERROR.toString(), "用户不存在", "", "").getJson();
        }
        User user=users.get(0);

       //   获取角色列表
        List<String> idsList=roleService.getRoleByUser(user.getId());

        List<Role> menuList=roleService.getList();
        List roleReturn=new ArrayList<Map<String,String>>();
        for(Role role:menuList){
            Map  map=new HashMap();
            map.put("roleId", role.getId());
            map.put("roleName" ,role.getUreName());
            //选中为 1
            map.put("checked" ,idsList.contains(role.getId())?Constant.STRING_1:Constant.STRING_0);
            roleReturn.add(map);
        }
        return  Result.getInstance(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,roleReturn,"").getJson();
    }


    /**
     * 修改用户密码
     * @param name
     * @param pwd
     * @param account 账号
     * @param password1 初始密码
     * @param password2 重置密码
     * @return
     */
    @Access(login = false,privilege = false)
    @RequestMapping(value ="modPwd",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String modPwd(@RequestParam(required = true)String name,
                                       @RequestParam(required = true)String pwd,@RequestParam(required = true)String account,
                                       @RequestParam(required = true)String password1,@RequestParam(required = true)String password2) {
        log.debug(TextUtils.format("修改密码:account{0}/password{1}/repPassword{2}:",account,password1,password2));
        if(!StoreControl.getValue("API.USERNAME").equals(name)){
            return Result.getInstance(ResultCode.ERROR.toString(), "用户名错误", "", "").getJson();
        }
        if(!StrUtils.isBlank(pwd)){
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String pwdmd5 = SecurityUtils.encry(SecurityUtils.encry(StoreControl.getValue("API.PWD")) + sdf.format(new Date()));
            if(!pwdmd5.equals(pwd)){
                return Result.getInstance(ResultCode.ERROR.toString(), "密码错误", "", "").getJson();
            }

        }else{
            return Result.getInstance(ResultCode.ERROR.toString(), "密码错误", "", "").getJson();
        }
        List<User>  users= userService.getUserInfo(account);
        if (users.size()<=0||!users.get(0).getUsrPassword().equals(SecurityUtils.MD5(password1))){
            return  new Result(ResultCode.ERROR.toString(), ResultMsg.LOGIN_ERROR,"","").getJson();
        }
        User entity=users.get(0);
        entity.setUsrPassword(SecurityUtils.MD5(password2));
        userService.update(entity);
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.UPDATE_SUCCESS,"","").getJson();
    }

    /**
     * 用户管理：授予用户角色
     * demo:http://127.0.0.1:8084/system/api/updateUserRole?name=icss&pwd=6C0DEE8F6DFA78F9A693BEEE72EEDACF&account=test0&roleIdDel=3006b107287346a286e70e04a98b1ee4&roleIdAdd=1ffac2fd584942a6a3a412c23d3d8faf
     * @param name 登陆账户 【必填项】
     * @param pwd  登陆密码 【必填项】
     * @param account 授权角色账号【必填项】
     * @param roleIdDel 需要删除的角色ID【必填项】 不加引号
     * @param roleIdAdd 需要新增的角色ID【必填项】不加引号
     * @return
     */
    @Access(login = false,privilege = false)
    @RequestMapping(value ="updateUserRole",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String saveRoleMenus(@RequestParam(required = true)String name,
                                              @RequestParam(required = true)String pwd,@RequestParam(required = true)String account,
                                              @RequestParam(required = true)String roleIdDel, @RequestParam(required = true)String roleIdAdd) {
        if(!StoreControl.getValue("API.USERNAME").equals(name)){
            return Result.getInstance(ResultCode.ERROR.toString(), "用户名错误", "", "").getJson();
        }
        if(!StrUtils.isBlank(pwd)){
            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
            String pwdmd5 = SecurityUtils.encry(SecurityUtils.encry(StoreControl.getValue("API.PWD")) + sdf.format(new Date()));
           if(!pwdmd5.equals(pwd)){
//                return Result.getInstance(ResultCode.ERROR.toString(), "密码错误", "", "").getJson();
            }

        }else{
            return Result.getInstance(ResultCode.ERROR.toString(), "密码错误", "", "").getJson();
        }/*
        //验证用户是否登陆
        if(!userService.loginVerify(name,pwd, Constant.STRING_1)){
            return Result.getInstance(ResultCode.ERROR.toString(), ResultMsg.ERROR,"用户验证失败","").getJson();
        }*/
        List<User> users=userService.getUserInfo(account);
        if(users.size()==0){
            return Result.getInstance(ResultCode.ERROR.toString(), "用户不存在", "", "").getJson();
        }
        User user=users.get(0);

        if(!StrUtils.isBlank(roleIdDel)){
            //最终删除
            List oldListTemp=StrUtils.compSourceListDiff(Arrays.asList(roleIdDel.split(Constant.DHAO)),
                    Arrays.asList(roleIdAdd.split(Constant.DHAO)));
            if(!StrUtils.isBlank(oldListTemp)&&oldListTemp.size()!=0){
                userService.delURoleMapByUId(user.getId(), oldListTemp);
            }
        }

        if(!StrUtils.isBlank(roleIdAdd)){
            //最终新增
            List listTemp=StrUtils.compSourceListDiff(Arrays.asList(roleIdAdd.split(Constant.DHAO)),
                    Arrays.asList(roleIdDel.split(Constant.DHAO)));
            log.debug("删除源{0};新增源{1}"+roleIdDel+"/"+roleIdAdd);
            if(!StrUtils.isBlank(roleIdAdd)&&listTemp.size()!=0){
                userService.addURoleMapByUId(user.getId(),listTemp);
            }
        }

        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,"","").getJson();
    }

    /**
     * 获取该角色拥有的菜单权限
     * demo:http://127.0.0.1:8084/system/api/getCheckedMenu?name=icss&pwd=6C0DEE8F6DFA78F9A693BEEE72EEDACF&roleId=3006b107287346a286e70e04a98b1ee4
     * @param name
     * @param pwd
     * @param roleId
     * @return
     */
    @Access(login = false,privilege = false)
    @RequestMapping(value ="getCheckedMenu",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String saveRoleMenus(@RequestParam(required = true)String name,
                                              @RequestParam(required = true)String pwd, @RequestParam(required = true) String roleId) {

        List<Menu>menus=menuService.getCheckedMenu(new Menu(), roleId);
        return     new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,menus,"").getJson();
    }
    /*************************页面跳转*end************************************/


}
