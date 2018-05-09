package com.limp.framework.boss.mapper.oracle;

import com.limp.framework.boss.domain.Menu;
import com.limp.framework.boss.domain.MenuExample;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface MenuMapper {

    int countByExample(MenuExample example);

    int deleteByExample(MenuExample example);

    int deleteByPrimaryKey(String id);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExampleByMsql(MenuExample example);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByExample(@Param("record") Menu record, @Param("example") MenuExample example);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);

    /**
     * 根据guid删除菜单
     *
     * @param guid id
     * @return
     */
    boolean deleteMenuByGuid(String guid);

    /**
     * 查询用户菜单
     *
     * @param userId 用户Id
     * @return 用户菜单列表
     */
    List<Menu> selectUserMenus(@Param("userId") String userId);

    /**
     * 根据id获取此菜单以下的所有Tree数据 （包括当前查询id）
     * @param id 此菜单的id
     * @return 返回此菜单
     */
    List<Menu> getTreeById(@Param("id") String id);
}