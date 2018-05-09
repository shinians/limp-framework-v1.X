package com.limp.framework.boss.service.impl;

import com.limp.framework.boss.domain.*;
import com.limp.framework.boss.mapper.oracle.RoleMapper;
import com.limp.framework.boss.mapper.oracle.RoleMenuMapMapper;
import com.limp.framework.boss.mapper.oracle.UserRoleMapMapper;
import com.limp.framework.boss.service.RoleService;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.utils.StrUtils;
import com.limp.framework.utils.TextUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 16-2-28
 * Time: 下午4:33
 * To change this template use File | Settings | File Templates.
 */
@Service
public class RoleServiceImpl implements RoleService{
    @Resource
    private RoleMapper roleMapper; //@service
    @Resource
    private UserRoleMapMapper userRoleMapMapper; //@service
    @Resource
    private RoleMenuMapMapper roleMenuMapMapper; //@service

    private static Logger log = Logger.getLogger(RoleServiceImpl.class.getName());

    @Override
    public Role getRoleByID(String roleId) {
        RoleExample roleExample = new  RoleExample();
        roleExample.createCriteria().andIdEqualTo(roleId);
        List<Role> roleList = roleMapper.selectByExample(roleExample);
        return roleList.size()>0?roleList.get(0):null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<String> getRoleByUser(String userId) {
        log.info("根据用户ID获取角色ID列表");
        UserRoleMapExample userRoleMapExample = new UserRoleMapExample();
        userRoleMapExample.createCriteria().andUrmUsrguidEqualTo(userId);
        List<UserRoleMap> userRoleMaps = userRoleMapMapper.selectByExample(userRoleMapExample);
        List<String> roleIdList = new ArrayList<String>();
        for (Iterator<UserRoleMap> iterator = userRoleMaps.iterator(); iterator.hasNext(); ) {
            roleIdList.add(iterator.next().getUrmUreguid());
        }
        return roleIdList;
    }

    /**
     * 删除多条记录
     *
     * @param ids ids
     * @return
     */
    @Override
    public boolean deletes(List<String> ids) {
        log.info(TextUtils.format("批量删除角色记录 : {0}", Arrays.toString(ids.toArray(new String[0]))));
        if (null == ids) {
            return false;
        }
        Role role = new Role();
        role.setUreState(Constant.STATE_DELETE);
        RoleExample roleExample = new RoleExample();
        roleExample.createCriteria().andIdIn(ids);
        return roleMapper.updateByExampleSelective(role, roleExample) > 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Pager<Role> getListExample(RoleExample roleExample) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
    /**
     * 根据角色id获取角色对应的所有菜单id
     *
     * @param rid 角色id
     * @return
     */
    @Override
    public List<String> getMenus(String rid) {
        log.info(TextUtils.format("根据角色id获取角色对应的所有菜单id : {0}", rid));
        return roleMapper.selectMenusByRoleId(rid);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean deleteMenuById(String rid, List<String> ids) {
        log.info(TextUtils.format("根据{0},删除菜单权限 :", rid));
        if (ids == null) {
            return false;
        }
        RoleMenuMapExample roleMenuMapExample = new RoleMenuMapExample();
        roleMenuMapExample.createCriteria().andRoleIdEqualTo(rid).andMenuIdIn(ids);
        return roleMenuMapMapper.deleteByExample(roleMenuMapExample) > 0;
    }

    @Override
    public boolean addMenuById(String rid, List<String> ids) {
        log.info(TextUtils.format("角色{0}/绑定菜单{1} :", rid, Arrays.toString(ids.toArray(new String[0]))));
        if (ids == null) {
            return false;
        }
        for (int i = 0; i < ids.size(); i++) {
            if (null == ids.get(i) ||
                    "".equals(ids.get(i))) {
                continue;
            }
            RoleMenuMap roleMenuMap = new RoleMenuMap();
            roleMenuMap.setRoleId(rid);
            roleMenuMap.setMenuId(ids.get(i));
            roleMenuMapMapper.insert(roleMenuMap);
        }
        return true;
    }

    @Override
    public String getApi(String id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean deleteDataById(String id, String sysId, String sysVdoId) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean addDataById(String id, String sysId, String sysVdoId, List<String> ids) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<String> getDatasByVdoId(String roleId, String sysId, String vdoTypeID) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean destroys(List<String> ids) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean save(Role entry) {
        boolean flay = false;
        if (StrUtils.isBlank(entry.getId())) {
            entry.setId(StrUtils.randomUUID());
            entry.setUreState(Constant.NUMBER_1);
            flay = roleMapper.insert(entry) == 1 ? true : false;
        } else {
            flay = roleMapper.updateByPrimaryKeySelective(entry) == 1 ? true : false;
        }
        return flay;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Role get(Serializable id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean update(Role entry) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(Serializable id) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Role> getList() {
        RoleExample roleExample = new RoleExample();
        roleExample.createCriteria().andUreStateEqualTo(Constant.NUMBER_1);
      //  roleExample.setOrderByClause("MEN_SORT ASC");
        List<Role> roleList = roleMapper.selectByExample(roleExample);
        return roleList;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
