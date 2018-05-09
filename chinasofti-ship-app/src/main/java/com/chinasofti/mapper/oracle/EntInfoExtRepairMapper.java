package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.EntInfoExtRepair;
import com.chinasofti.domain.EntInfoExtRepairExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EntInfoExtRepairMapper {
    int countByExample(EntInfoExtRepairExample example);

    int deleteByExample(EntInfoExtRepairExample example);

    int insert(EntInfoExtRepair record);

    int insertSelective(EntInfoExtRepair record);

    List<EntInfoExtRepair> selectByExample(EntInfoExtRepairExample example);

    int updateByExampleSelective(@Param("record") EntInfoExtRepair record, @Param("example") EntInfoExtRepairExample example);

    int updateByExample(@Param("record") EntInfoExtRepair record, @Param("example") EntInfoExtRepairExample example);
}