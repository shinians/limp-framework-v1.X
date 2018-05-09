package com.limp.framework.boss.mapper.oracle;

import com.limp.framework.boss.domain.VdoMap;
import com.limp.framework.boss.domain.VdoMapExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface VdoMapMapper {
    int countByExample(VdoMapExample example);

    int deleteByExample(VdoMapExample example);

    int insert(VdoMap record);

    int insertSelective(VdoMap record);

    List<VdoMap> selectByExample(VdoMapExample example);

    int updateByExampleSelective(@Param("record") VdoMap record, @Param("example") VdoMapExample example);

    int updateByExample(@Param("record") VdoMap record, @Param("example") VdoMapExample example);
}