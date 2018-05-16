package com.limp.framework.boss.service.impl;

import com.limp.framework.boss.ApplicationContext;
import com.limp.framework.boss.domain.*;
import com.limp.framework.boss.mapper.oracle.*;
import com.limp.framework.boss.service.ConfigFieldService;
import com.limp.framework.boss.service.PermissionService;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.utils.JsonUtils;
import com.limp.framework.utils.StrUtils;
import com.limp.framework.utils.TextUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-6-29
 * Time: 上午11:30
 * To change this template use File | Settings | File Templates.
 */
@Service
public class PermissionServiceImpl implements PermissionService {
    @Resource
    PermissionMapper permissionMapper;
    @Resource
    RolePermissionMapMapper rolePermissionMapMapper;
    @Resource
    UserPermissionMapMapper userPermissionMapMapper;
    //菜单
    @Resource
    private MenuMapper menuMapper;

    @Resource
    private RoleMapper roleMapper;

    @Resource
    private ConfigFieldService configFieldService;

    private static Logger log = Logger.getLogger(PermissionServiceImpl.class.getName());


    /**
     * 保存权限实体类
     * @param entry
     * @return
     */
    @Override
    public boolean save(Permission entry) {
        if (StrUtils.isBlank(entry.getId())) {
            entry.setId(StrUtils.randomUUID());
        }
        return   permissionMapper.insertSelective(entry) == 1 ? true : false;
    }

    @Override
    public Permission get(Serializable id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean update(Permission entry) {
        PermissionExample permissionExample=new PermissionExample();
        permissionExample.createCriteria().andIdEqualTo(entry.getId());
        entry.setUdt(new Date());
        return  permissionMapper.updateByExampleSelective(entry,permissionExample)==1?true:false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * 删除权限记录 根据id
     * @param id
     * @return
     */
    @Override
    public boolean delete(Serializable id) {
        PermissionExample permissionExample = new PermissionExample();
        permissionExample.createCriteria().andIdEqualTo(id.toString());
        return permissionMapper.deleteByExample(permissionExample) > 0;
    }


    @Override
    public List<Permission> getList() {
        PermissionExample permissionExample = new PermissionExample();
        permissionExample.createCriteria().andStateEqualTo(new Short(Constant.STRING_1));
        permissionExample.setOrderByClause("PER_SORT ASC");
        return permissionMapper.selectByExample(permissionExample);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<RolePermissionMap> getPermByRoleId(String rid) {
        RolePermissionMapExample rolePermissionMapExample=new RolePermissionMapExample();
        if(!StrUtils.isBlank(rid)){
            rolePermissionMapExample.createCriteria().andRoleidEqualTo(rid);
        }
        return rolePermissionMapMapper.selectByExample(rolePermissionMapExample);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<UserPermissionMap> getPermByUserId(String uid) {
        UserPermissionMapExample userPermissionMapExample=new UserPermissionMapExample();
        if(!StrUtils.isBlank(uid)){
            userPermissionMapExample.createCriteria().andUsridEqualTo(uid);
        }
        return userPermissionMapMapper.selectByExample(userPermissionMapExample);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delPermsByRId(String rid, List<String> ids) {
        log.debug(TextUtils.format("根据{0},删除元素权限 :", rid));
        if (ids == null) {
            return false;
        }
        RolePermissionMapExample rolePermissionMapExample = new RolePermissionMapExample();
        rolePermissionMapExample.createCriteria().andRoleidEqualTo(rid).andSprmPeridIn(ids);
        return rolePermissionMapMapper.deleteByExample(rolePermissionMapExample) > 0;
    }
    @Override
    public boolean addPermsByRId(String rid, List<String> ids) {
        log.debug(TextUtils.format("角色{0}/绑定元素权限{1} :", rid, Arrays.toString(ids.toArray(new String[0]))));
        if (StrUtils.isBlank(ids)) {
            return false;
        }
        for (int i = 0; i < ids.size(); i++) {
            if (StrUtils.isBlank(ids.get(i))) {
                continue;
            }
            RolePermissionMap rolePermissionMap = new RolePermissionMap();
            rolePermissionMap.setRoleid(rid);
            rolePermissionMap.setSprmPerid(ids.get(i));
            rolePermissionMapMapper.insert(rolePermissionMap);
        }
        return true;
    }
    @Override
    public boolean delPermsByUId(String uid, List<String> ids) {
        log.debug(TextUtils.format("根据{0},删除元素权限 :",uid));
        if (ids == null) {
            return false;
        }
        UserPermissionMapExample userPermissionMapExample = new UserPermissionMapExample();
        userPermissionMapExample.createCriteria().andUsridEqualTo(uid).andPeridIn(ids);
        return userPermissionMapMapper.deleteByExample(userPermissionMapExample) > 0;
    }
    @Override
    public boolean addPermsByUId(String uid, List<String> ids) {
        log.info(TextUtils.format("用户{0}/绑定元素权限{1} :", uid, Arrays.toString(ids.toArray(new String[0]))));
        if (StrUtils.isBlank(ids)) {
            return false;
        }
        for (int i = 0; i < ids.size(); i++) {
            if (StrUtils.isBlank(ids.get(i))) {
                continue;
            }
            UserPermissionMap userPermissionMap = new UserPermissionMap();
            userPermissionMap.setUsrid(uid);
            userPermissionMap.setPerid(ids.get(i));
            userPermissionMapMapper.insert(userPermissionMap);
        }
        return true;
    }

    @Override
    public boolean initSessionAuth(HttpSession session) {
        //只有登录的用户才可绑定权限  用户信息session获取
        User user=ApplicationContext.getLoginUser(session);
        if(StrUtils.isBlank(user)){
            return false;
        }
        //绑定角色
        List<Role> roleList=roleMapper.selectRoles(user.getId());
        session.setAttribute(Constant.KEY_ROLE,roleList);

        //绑定单位:todo


        //绑定用户菜单权限【2】
        List<Menu> menuList=menuMapper.selectUserMenus(user.getId());
        //通过MenKeyword获取 CODE、URL、NAME、VALUE :包括menu、permission两部分权限
        Map  mapKeyAuth=new  HashMap<String,Map<String,String>>();
        //id:menu json格式
        HashMap menuMap=new HashMap<String,Object>();
        HashMap authMap=new HashMap<String,String>();
        for(final Menu menu:menuList){
            menuMap.put(menu.getId(),menu);
           /* if (!StrUtils.isBlank(menu.getMenKeyword())){
                authMap.put(menu.getMenKeyword(),menu.getMenUrl());
            }*/

            //根据code绑定用户权限，前台可通过${KEY_CODE.特定CODE.VALUE==1}判定是否有该权限
            if(!StrUtils.isBlank(menu.getMenKeyword())&&!StrUtils.isBlank(menu.getMenRc0())){
                mapKeyAuth.put(menu.getMenKeyword(),new HashMap<String,String>(){
                    {
                    put("CODE",StrUtils.isBlank(menu.getMenKeyword())?"":menu.getMenKeyword());
                    put("URL",StrUtils.isBlank(menu.getMenUrl())?"":menu.getMenUrl());
                    put("NAME",StrUtils.isBlank(menu.getMenName())?"":menu.getMenName());
                    put("VALUE",StrUtils.isBlank(menu.getMenRc0())?"":menu.getMenRc0());
                }
               });
            }
        }
        //绑定角色：演示角色 SYS_ROLE_VIEW
        for(final Role role:roleList){
            //根据code绑定用户权限，前台可通过${KEY_CODE.特定CODE.VALUE==1}判定是否有该权限
            if(!StrUtils.isBlank(role.getUreRc0())){
                mapKeyAuth.put(role.getUreRc0(),new HashMap<String,String>(){
                    {
                    put("CODE",StrUtils.isBlank(role.getUreRc0())?"":role.getUreRc0());
                    put("URL", "");
                    put("NAME",StrUtils.isBlank(role.getUreName())?"":role.getUreName());
                    put("VALUE",Constant.STRING_1);
                }
               });
            }
        }
       /* //权限 keyWord：url
        session.setAttribute(Constant.KEY_AUTH_MAP, JsonUtils.toJson(authMap));*/
        //id:menu json格式
        session.setAttribute(Constant.KEY_MENU_JSON, JsonUtils.toJson(menuMap));
        //id:menu map格式
        session.setAttribute(Constant.KEY_MENU_KVMAP, menuMap);
         //  List<Menu> 获取权限菜单
        session.setAttribute(Constant.KEY_MENU, menuList);
        log.debug(TextUtils.format("获取登录用户session账号{0},菜单权限数量{1}个",
                user.getUsrAccount(), menuList.size()));

        session.setAttribute(Constant.KEY_CODE, mapKeyAuth);
       /* //获取所有的 map key
        Map map1 = (HashMap<String,Map<String,String>>)session.getAttribute(Constant.KEY_CODE);
        //是否含有此菜单
        Map<String,String>obj=(Map<String,String>) map1.get("设定的KEY");
        if(!StrUtils.isBlank(obj)) {
            String value = obj.get("VALUE");//判斷是否为1
        }*/
        return true;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean initSessionConfig(HttpSession session) {
        //只有登录的用户才可绑定权限  用户信息session获取
        List<ConfigField> configFieldList=new ArrayList<ConfigField>();
        try {
            Pager<ConfigField> configFieldsPager=configFieldService.getConfigFieldList(new Pager(1, 1000), new ConfigField());

            configFieldList=configFieldsPager.getDataList();
        }catch (Exception e){
            log.error("--->【获取系统配置异常】<---" + e.getMessage());
            return false;
        }


        Map  mapKeyAuth=new  HashMap<String,Map<String,String>>();
        //id:configField json格式
        HashMap configFieldMap=new HashMap<String,Object>();
        HashMap authMap=new HashMap<String,String>();
        for(final ConfigField configField:configFieldList){
            //根据code绑定用户权限，前台可通过${KEY_CODE.特定CODE.VALUE==1}判定是否有该权限
            if(!StrUtils.isBlank(configField.getKey())&&!StrUtils.isBlank(configField.getValue())){
                configFieldMap.put(configField.getKey(),configField);

                mapKeyAuth.put(configField.getKey(),new HashMap<String,String>(){
                    {
                        put("CODE",configField.getKey());
                        put("NAME",StrUtils.isBlank(configField.getTitle())?"":configField.getTitle());
                        put("VALUE",configField.getValue());
                        put("URL","");
                    }
                });
            }


        }


        session.setAttribute(Constant.KEY_CONFFIELD_KVMAP, configFieldMap);
        //  List<Menu> 获取权限菜单
        session.setAttribute(Constant.KEY_CONFFIELD, configFieldList);

        log.debug(TextUtils.format("系统配置数量{0}个", configFieldList.size()));

        //在之前的权限上进行追加
        if(!StrUtils.isBlank(session.getAttribute(Constant.KEY_CODE))){
            HashMap<String, Map<String, String>> mapKeyAuthBefore =
                    (HashMap<String, Map<String, String>>) session.getAttribute(Constant.KEY_CODE);
            for(String key:mapKeyAuthBefore.keySet()){
                mapKeyAuth.put(key,mapKeyAuthBefore.get(key));
            }

        }
        session.setAttribute(Constant.KEY_CODE, mapKeyAuth);


        return true;
    }
}
