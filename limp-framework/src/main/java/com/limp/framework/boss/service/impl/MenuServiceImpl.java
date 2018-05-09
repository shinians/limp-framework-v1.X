package com.limp.framework.boss.service.impl;

import com.limp.framework.boss.domain.*;
import com.limp.framework.boss.mapper.oracle.MenuMapper;
import com.limp.framework.boss.mapper.oracle.RoleMapper;
import com.limp.framework.boss.service.MenuService;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.utils.StoreControl;
import com.limp.framework.utils.StrUtils;
import com.limp.framework.utils.TextUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 16-2-27
 * Time: 下午10:07
 * To change this template use File | Settings | File Templates.
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuMapper menuMapper;
    @Resource
    private RoleMapper roleMapper;

    private static final Log log = LogFactory.getLog(MenuService.class);


    @Override
    public boolean synMenuByKeyWord(Menu menu) {
        if(StrUtils.isBlank(menu.getMenKeyword())){
            return false;
        }
        MenuExample example=new MenuExample();
        MenuExample.Criteria criteria=example.createCriteria();
        criteria.andMenKeywordEqualTo(menu.getMenKeyword()).andMenStateEqualTo(Constant.NUMBER_1);

        List<Menu> menus=menuMapper.selectByExample(example);

        log.debug(TextUtils.format("同步菜单{0}的数量:{1}",menu.getMenKeyword(),menus.size()));

        //新增一条数据
        if(menus.size()==0){
            //如果为空则插入一条数据
            menu.setId(StrUtils.randomUUID());
            menu.setMenUpdatetime(new Date());
            menu.setMenState(Constant.NUMBER_1);
            //通过父类key查找相应的ID:如何构建父类ID 通过构建父类KEY查找相应的ID
            Menu search=new Menu();
            search.setMenKeyword(menu.getMenFKeyword());
            List<Menu> searchList=getList(search);
            if(searchList.size()>0){
                menu.setMenFatherid(searchList.get(0).getId());
            }
            return  menuMapper.insertSelective(menu)==Constant.NUMBER_1?true:false;

        }
        //更新一条数据
        else if(menus.size()==1){
            //同步部分数据
            Menu m=menus.get(0);
            //菜单名称
            m.setMenName(menu.getMenName());
            m.setMenRc0(menu.getMenRc0());
            m.setMenSort(menu.getMenSort());
            m.setMenImgUrl(menu.getMenImgUrl());

            m.setMenType(menu.getMenType());
            m.setMenUrl(menu.getMenUrl());
            m.setMenDesc(menu.getMenDesc());
            //同步父类ID|解决改变分类情况
            Menu search=new Menu();
            search.setMenKeyword(menu.getMenFKeyword());
            List<Menu> searchList=getList(search);
            if(searchList.size()>0){
                m.setMenFatherid(searchList.get(0).getId());
            }

            return  menuMapper.updateByPrimaryKeySelective(m)==Constant.NUMBER_1?true:false;
        }
        //含有多条更新失败
        return false;
    }

    /**
     * 查询菜单列表
     * @param orderStr  排序字符串：如 USR_CREATEDATE DESC
     * @param menu  要查询的实体类：查询条件可初始化dicCode
     * @param pager  分页对象
     * @return 每页的数据 Pager
     */
    @Override
    public Pager<Menu> getPageDomainList(Menu  menu,String orderStr, Pager pager) {
        MenuExample menuExample = new MenuExample();
        menuExample.setPage(pager);
        MenuExample.Criteria criteria = menuExample.createCriteria();

        //如果 MenField值不为空，则根据MenField值模糊查询数据
        if (!StrUtils.isBlank(menu.getMenFatherid())) {
            criteria.andMenFatheridEqualTo(menu.getMenFatherid());
        }
        //如果 menu.getId()不为空，则根据menu.getId()值模糊查询数据
        if (!StrUtils.isBlank(menu.getId())) {
            criteria.andIdEqualTo(menu.getId());
        }

        //如果 getMenName名称不为空，则根据getMenName模糊查询数据
        if (!StrUtils.isBlank(menu.getMenName())){
            criteria.andMenNameLike("%" + menu.getMenName()+"%");
        } //如果 分类miaoshu不为空，则根据分类名称模糊查询数据
        if (!StrUtils.isBlank(menu.getMenKeyword())) {
            criteria.andMenKeywordEqualTo(menu.getMenKeyword());
        }
        criteria.andMenStateEqualTo(Constant.NUMBER_1);
        //若排序字段不为空，则根据此字段排序
        if (!StrUtils.isBlank(orderStr)) {
            //"USR_CREATEDATE DESC"
            menuExample.setOrderByClause(orderStr);
        }
        //插件优先级比较高
        if (!StrUtils.isBlank(menu.getLpsort())) {
            menuExample.setOrderByClause(menu.getLpsort());
        }

        List<Menu> menuList=new ArrayList<Menu>();
        if(Constant.DB_MYSQL.equals(StoreControl.getValue(Constant.DB_KEY))){
            log.debug("-->开始查询mysql数据库用户信息<---");
            menuList=menuMapper.selectByExampleByMsql(menuExample);
        }else{
            menuList=menuMapper.selectByExample(menuExample);
        }
        pager.setPagerInfo(menuList,menuMapper.countByExample(menuExample));
        return pager;
    }

    @Override
    public List<Menu> getList(Serializable id) {
        MenuExample menuExample = new MenuExample();
        menuExample.createCriteria().andMenStateEqualTo(Constant.NUMBER_1)
        .andIdEqualTo(id + "");
        List<Menu> menList = menuMapper.selectByExample(menuExample);
        return menList;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Menu> getList(Menu menu) {
        MenuExample menuExample = new MenuExample();
        MenuExample.Criteria  menuExampleCriteria= menuExample.createCriteria();
        menuExampleCriteria.andMenStateEqualTo(Constant.NUMBER_1) ;
        //根据menuid获得menu
        if(!StrUtils.isBlank(menu.getId())){
            menuExampleCriteria.andIdEqualTo(menu.getId());
        }
        //menuKeyWord菜单关键字
        if(!StrUtils.isBlank(menu.getMenKeyword())){
           menuExampleCriteria.andMenKeywordEqualTo(menu.getMenKeyword());
        }
        List<Menu> menList = menuMapper.selectByExample(menuExample);
        return menList;
    }

    @Override
    public List<Menu> getChild3LVMenusByKeyWord(String keyWord) {
        if (StrUtils.isBlank(keyWord)) {
            return null;
        }
        MenuExample example = new MenuExample();
        MenuExample.Criteria criteria = example.createCriteria();
        criteria.andMenKeywordEqualTo(keyWord);
        List<Menu> list = menuMapper.selectByExample(example);
        List<Menu> backMenus = new ArrayList<Menu>();
        if (list.size() > 0) {
            //获取查询的ID
            Menu menu = list.get(0);
            //【0】本级别
            backMenus.add(menu);
            List<Menu> firMenuList = getListByPId(menu.getId());
            //【1】级别
            backMenus.addAll(firMenuList);
            for (Menu menuSec : firMenuList) {
                List<Menu> secMenuList = getListByPId(menuSec.getId());
                //【2】级别
                backMenus.addAll(secMenuList);
                for (Menu menuThr : secMenuList) {
                    List<Menu> thrMenuList = getListByPId(menuThr.getId());
                    //【3】级别
                    backMenus.addAll(thrMenuList);
                }
            }
        }
        return backMenus;
    }

    @Override
    public List<Menu> getCheckedMenu(Menu menu, String roleId) {
        List<String>  arr=roleMapper.selectMenusByRoleId(roleId);
        List<Menu> menuList = getList(menu);
        List<Menu> bakMenu=new ArrayList<Menu>();
        for(Menu menuObj:menuList){
            if(!StrUtils.isBlank(arr)&&arr.contains(menuObj.getId())){
                bakMenu.add(menuObj);
            }

        }
        return bakMenu;
    }

    @Override
    public List<Menu> getListByPId(Serializable pid) {
        MenuExample menuExample = new MenuExample();
        menuExample.createCriteria().andMenStateEqualTo(Constant.NUMBER_1)
                .andMenFatheridEqualTo(pid + "").andMenStateEqualTo(Constant.NUMBER_1);
        menuExample.setOrderByClause("MEN_SORT ASC");
        List<Menu> menList = menuMapper.selectByExample(menuExample);
        return menList;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int countByFatherId(Serializable fatherId) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean deleteByGuid(String uuid) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Menu> getTreeById(String id) {
        if(!StrUtils.isBlank(id)){
            return menuMapper.getTreeById(id);
        }
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean save(Menu entry) {
        if (StrUtils.isBlank(entry.getId())) {
            entry.setId(StrUtils.randomUUID());
        }
        if (StrUtils.isBlank(entry.getMenSsmguid())) {
            entry.setMenSsmguid(Constant.STRING_0);
        }
        if (StrUtils.isBlank(entry.getMenCreatedate())) {
            entry.setMenCreatedate(new Date());
        }
        return menuMapper.insertSelective(entry)==1?true:false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Menu get(Serializable id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean update(Menu entry) {
        if(StrUtils.isBlank(entry.getId())){
            log.error("更新失败,Menu类ID为空");
            return false;
        }
        entry.setMenUpdatetime(new Date());
        return  menuMapper.updateByPrimaryKeySelective(entry)==1?true:false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(Serializable id) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Menu> getList() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
