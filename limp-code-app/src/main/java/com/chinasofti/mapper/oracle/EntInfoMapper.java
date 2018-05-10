package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.EntInfo;
import com.chinasofti.domain.EntInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface EntInfoMapper {
    int countByExample(EntInfoExample example);

    int deleteByExample(EntInfoExample example);

    int insert(EntInfo record);

    int insertSelective(EntInfo record);

    List<EntInfo> selectByExample(EntInfoExample example);

    int updateByExampleSelective(@Param("record") EntInfo record, @Param("example") EntInfoExample example);

    int updateByExample(@Param("record") EntInfo record, @Param("example") EntInfoExample example);

    //自定义方法↓↓↓↓↓↓↓↓↓↓↓↓↓↓
    int getCpzzCount(@Param("nowDate") String nowDate,@Param("like") String like);
    int getRepairCount(@Param("nowDate") String nowDate,@Param("like") String like);

    List<Map<String,Object>> getEnt3List(EntInfoExample entExample);
    int getEnt3ListCount(EntInfoExample entExample);

    List<Map<String,Object>> getEnt7List(EntInfoExample entExample);
    int getEnt7ListCount(EntInfoExample entExample);

}