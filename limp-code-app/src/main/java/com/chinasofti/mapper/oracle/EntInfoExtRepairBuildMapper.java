package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.EntInfoExtRepairBuild;
import com.chinasofti.domain.EntInfoExtRepairBuildExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EntInfoExtRepairBuildMapper {
    int countByExample(EntInfoExtRepairBuildExample example);

    int deleteByExample(EntInfoExtRepairBuildExample example);

    int insert(EntInfoExtRepairBuild record);

    int insertSelective(EntInfoExtRepairBuild record);

    List<EntInfoExtRepairBuild> selectByExample(EntInfoExtRepairBuildExample example);

    int updateByExampleSelective(@Param("record") EntInfoExtRepairBuild record, @Param("example") EntInfoExtRepairBuildExample example);

    int updateByExample(@Param("record") EntInfoExtRepairBuild record, @Param("example") EntInfoExtRepairBuildExample example);
}