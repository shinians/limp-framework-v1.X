package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.EntInfoExtOne;
import com.chinasofti.domain.EntInfoExtOneExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EntInfoExtOneMapper {
    int countByExample(EntInfoExtOneExample example);

    int deleteByExample(EntInfoExtOneExample example);

    int insert(EntInfoExtOne record);

    int insertSelective(EntInfoExtOne record);

    List<EntInfoExtOne> selectByExample(EntInfoExtOneExample example);

    int updateByExampleSelective(@Param("record") EntInfoExtOne record, @Param("example") EntInfoExtOneExample example);

    int updateByExample(@Param("record") EntInfoExtOne record, @Param("example") EntInfoExtOneExample example);
}