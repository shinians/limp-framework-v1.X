package com.limp.framework.boss.mapper.oracle;

import com.limp.framework.boss.domain.UserMenuMap;
import com.limp.framework.boss.domain.UserMenuMapExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMenuMapMapper {
    int countByExample(UserMenuMapExample example);

    int deleteByExample(UserMenuMapExample example);

    int insert(UserMenuMap record);

    int insertSelective(UserMenuMap record);

    List<UserMenuMap> selectByExample(UserMenuMapExample example);

    int updateByExampleSelective(@Param("record") UserMenuMap record, @Param("example") UserMenuMapExample example);

    int updateByExample(@Param("record") UserMenuMap record, @Param("example") UserMenuMapExample example);
}