package com.limp.framework.boss.mapper.oracle;

import com.limp.framework.boss.domain.User;
import com.limp.framework.boss.domain.UserExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    /**
     * 获得用户信息
     * @param account
     * @return
     */
    public List<User> getUserInfo(String account);

    /**
     * 用户登陆
     *
     * @param params 存储过程参数
     * @return 登陆信息
     */
    public Map<String, Object> login(Map<String, Object> params);
    /**
     * 根据角色id获取角色对应的所有菜单id
     *
     * @param rid
     * @return
     */
    List<String> selectMenusByUserId(String rid);


    int countByExample(UserExample example);

    /**
     *  "删除一条记录"
     */
    int deleteByExample(UserExample example);

    /**
     * "根据主键删除一条记录"
     */
    int deleteByPrimaryKey(String id);

    /**
     * "添加一个用户"
     */
    int insert(User record);


    int insertSelective(User record);

    /**
     * "查询对象进行查询"
     */
    List<User> selectByExample(UserExample example);

    List<User> selectByExampleByMsql(UserExample example);

    /**
     * "根据主键进行查询"
     */
    User selectByPrimaryKey(String id);

    /**
     * "修改对象修改    可带条件
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * “根据用户主键选择修改”
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * "根据主键修改用户"
     */
    int updateByPrimaryKey(User record);

    List<User> selectByExampleAndRole(UserExample userExample);

    /**
     * 查询用户信息根据主键
     * @param example
     * @return
     */
    List<String> selectPrimaryKeyByExample(UserExample example);

}

