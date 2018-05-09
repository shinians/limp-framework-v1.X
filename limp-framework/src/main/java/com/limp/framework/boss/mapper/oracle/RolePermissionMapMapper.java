package com.limp.framework.boss.mapper.oracle;

import com.limp.framework.boss.domain.RolePermissionMap;
import com.limp.framework.boss.domain.RolePermissionMapExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RolePermissionMapMapper {
    int countByExample(RolePermissionMapExample example);

    int deleteByExample(RolePermissionMapExample example);

    int insert(RolePermissionMap record);

    int insertSelective(RolePermissionMap record);

    List<RolePermissionMap> selectByExample(RolePermissionMapExample example);

    int updateByExampleSelective(@Param("record") RolePermissionMap record, @Param("example") RolePermissionMapExample example);

    int updateByExample(@Param("record") RolePermissionMap record, @Param("example") RolePermissionMapExample example);
}