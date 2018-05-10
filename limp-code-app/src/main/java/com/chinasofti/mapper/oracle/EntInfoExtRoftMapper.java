package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.EntInfoExtRoft;
import com.chinasofti.domain.EntInfoExtRoftExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EntInfoExtRoftMapper {
    int countByExample(EntInfoExtRoftExample example);

    int deleteByExample(EntInfoExtRoftExample example);

    int insert(EntInfoExtRoft record);

    int insertSelective(EntInfoExtRoft record);

    List<EntInfoExtRoft> selectByExample(EntInfoExtRoftExample example);

    int updateByExampleSelective(@Param("record") EntInfoExtRoft record, @Param("example") EntInfoExtRoftExample example);

    int updateByExample(@Param("record") EntInfoExtRoft record, @Param("example") EntInfoExtRoftExample example);
}