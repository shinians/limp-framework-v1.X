package com.limp.framework.boss.mapper.oracle;

import com.limp.framework.boss.domain.UserGroupUserMap;
import com.limp.framework.boss.domain.UserGroupUserMapExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserGroupUserMapMapper {
    int countByExample(UserGroupUserMapExample example);

    int deleteByExample(UserGroupUserMapExample example);

    int insert(UserGroupUserMap record);

    int insertSelective(UserGroupUserMap record);

    List<UserGroupUserMap> selectByExample(UserGroupUserMapExample example);

    int updateByExampleSelective(@Param("record") UserGroupUserMap record, @Param("example") UserGroupUserMapExample example);

    int updateByExample(@Param("record") UserGroupUserMap record, @Param("example") UserGroupUserMapExample example);
}