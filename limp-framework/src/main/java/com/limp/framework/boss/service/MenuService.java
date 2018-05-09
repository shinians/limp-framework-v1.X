package com.limp.framework.boss.service;

import com.limp.framework.boss.domain.Menu;
import com.limp.framework.core.abs.AbstractService;
import com.limp.framework.core.bean.Pager;

import java.io.Serializable;
import java.util.List;


public interface MenuService extends AbstractService<Menu> {

    public  boolean synMenuByKeyWord(Menu menu);

    /**
     * 获取菜单列表【分页】
     * @param menu 查询条件
     * @param orderStr 排序条件
     * @param pager
     * @return
     */
    public Pager<Menu> getPageDomainList(Menu  menu,String orderStr, Pager pager) ;

    /**
     * 根据id获得菜单
     * @param id
     * @return
     */
    List<Menu> getList(Serializable id);

    /**
     * 查询菜单：根据menu设置选项【】
     * @param menu id key_word
     * @return
     */
    List<Menu> getList(Menu menu);

    /**
     * 获取所有子类的菜单根据查询条件
     * @param  keyWord  关键值
     * @return
     */
    List<Menu> getChild3LVMenusByKeyWord(String keyWord);

    /**
     * 获取该角色含有的权限
     * @param menu
     * @param roleId
     * @return
     */
    List<Menu>getCheckedMenu(Menu menu,String roleId);

    /**
     * 获得菜单列表
     * @param pid 根据父类id
     * @return
     */
    List<Menu> getListByPId(Serializable pid);

    /**
     * 统计子菜单个数
     *
     * @param fatherId 父节点ID
     * @return 子菜单个数
     */
    int countByFatherId(Serializable fatherId);

    /**
     * 根据guid删除菜单
     * @param uuid
     * @return
     */
    boolean deleteByGuid(String uuid);

    List<Menu> getTreeById(String id);
}
