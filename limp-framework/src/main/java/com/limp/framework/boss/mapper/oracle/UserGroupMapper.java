package com.limp.framework.boss.mapper.oracle;

import com.limp.framework.boss.domain.UserGroup;
import com.limp.framework.boss.domain.UserGroupExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserGroupMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USERGROUP
     *
     * @mbggenerated Thu Jun 20 11:55:59 CST 2013
     */
    int countByExample(UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USERGROUP
     *
     * @mbggenerated Thu Jun 20 11:55:59 CST 2013
     */
    int deleteByExample(UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USERGROUP
     *
     * @mbggenerated Thu Jun 20 11:55:59 CST 2013
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USERGROUP
     *
     * @mbggenerated Thu Jun 20 11:55:59 CST 2013
     */
    int insert(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USERGROUP
     *
     * @mbggenerated Thu Jun 20 11:55:59 CST 2013
     */
    int insertSelective(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USERGROUP
     *
     * @mbggenerated Thu Jun 20 11:55:59 CST 2013
     */
    List<UserGroup> selectByExample(UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USERGROUP
     *
     * @mbggenerated Thu Jun 20 11:55:59 CST 2013
     */
    UserGroup selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USERGROUP
     *
     * @mbggenerated Thu Jun 20 11:55:59 CST 2013
     */
    int updateByExampleSelective(@Param("record") UserGroup record, @Param("example") UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USERGROUP
     *
     * @mbggenerated Thu Jun 20 11:55:59 CST 2013
     */
    int updateByExample(@Param("record") UserGroup record, @Param("example") UserGroupExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USERGROUP
     *
     * @mbggenerated Thu Jun 20 11:55:59 CST 2013
     */
    int updateByPrimaryKeySelective(UserGroup record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USERGROUP
     *
     * @mbggenerated Thu Jun 20 11:55:59 CST 2013
     */
    int updateByPrimaryKey(UserGroup record);
}