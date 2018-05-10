package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.EntInfoExtGmdss;
import com.chinasofti.domain.EntInfoExtGmdssExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EntInfoExtGmdssMapper {
    int countByExample(EntInfoExtGmdssExample example);

    int deleteByExample(EntInfoExtGmdssExample example);

    int insert(EntInfoExtGmdss record);

    int insertSelective(EntInfoExtGmdss record);

    List<EntInfoExtGmdss> selectByExample(EntInfoExtGmdssExample example);

    int updateByExampleSelective(@Param("record") EntInfoExtGmdss record, @Param("example") EntInfoExtGmdssExample example);

    int updateByExample(@Param("record") EntInfoExtGmdss record, @Param("example") EntInfoExtGmdssExample example);
}