package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.DrawProc2;
import com.chinasofti.domain.DrawProc2Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrawProc2Mapper {
    int countByExample(DrawProc2Example example);

    int deleteByExample(DrawProc2Example example);

    int insert(DrawProc2 record);

    int insertSelective(DrawProc2 record);

    List<DrawProc2> selectByExample(DrawProc2Example example);

    int updateByExampleSelective(@Param("record") DrawProc2 record, @Param("example") DrawProc2Example example);

    int updateByExample(@Param("record") DrawProc2 record, @Param("example") DrawProc2Example example);
}