package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.DrawProc;
import com.chinasofti.domain.DrawProcExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface DrawProcMapper {
    int countByExample(DrawProcExample example);

    int deleteByExample(DrawProcExample example);

    int insert(DrawProc record);

    int insertSelective(DrawProc record);

    List<DrawProc> selectByExample(DrawProcExample example);

    int updateByExampleSelective(@Param("record") DrawProc record, @Param("example") DrawProcExample example);

    int updateByExample(@Param("record") DrawProc record, @Param("example") DrawProcExample example);

    //获取各省图纸审查数量
    List<Map> getDrawNumsGroupPrv(@Param("year")String year);
}