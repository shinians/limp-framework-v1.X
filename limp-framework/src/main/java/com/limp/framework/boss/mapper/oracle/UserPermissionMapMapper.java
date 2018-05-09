package com.limp.framework.boss.mapper.oracle;


import com.limp.framework.boss.domain.UserPermissionMap;
import com.limp.framework.boss.domain.UserPermissionMapExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserPermissionMapMapper {
    int countByExample(UserPermissionMapExample example);

    int deleteByExample(UserPermissionMapExample example);

    int insert(UserPermissionMap record);

    int insertSelective(UserPermissionMap record);

    List<UserPermissionMap> selectByExample(UserPermissionMapExample example);

    int updateByExampleSelective(@Param("record") UserPermissionMap record, @Param("example") UserPermissionMapExample example);

    int updateByExample(@Param("record") UserPermissionMap record, @Param("example") UserPermissionMapExample example);
}