package com.limp.framework.boss.mapper.oracle;

import com.limp.framework.boss.domain.RoleGroupMap;
import com.limp.framework.boss.domain.RoleGroupMapExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RoleGroupMapMapper {
    int countByExample(RoleGroupMapExample example);

    int deleteByExample(RoleGroupMapExample example);

    int insert(RoleGroupMap record);

    int insertSelective(RoleGroupMap record);

    List<RoleGroupMap> selectByExample(RoleGroupMapExample example);

    int updateByExampleSelective(@Param("record") RoleGroupMap record, @Param("example") RoleGroupMapExample example);

    int updateByExample(@Param("record") RoleGroupMap record, @Param("example") RoleGroupMapExample example);
}