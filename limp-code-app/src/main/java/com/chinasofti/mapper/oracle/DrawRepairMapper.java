package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.DrawRepair;
import com.chinasofti.domain.DrawRepairExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrawRepairMapper {
    int countByExample(DrawRepairExample example);

    int deleteByExample(DrawRepairExample example);

    int insert(DrawRepair record);

    int insertSelective(DrawRepair record);

    List<DrawRepair> selectByExample(DrawRepairExample example);

    int updateByExampleSelective(@Param("record") DrawRepair record, @Param("example") DrawRepairExample example);

    int updateByExample(@Param("record") DrawRepair record, @Param("example") DrawRepairExample example);

}