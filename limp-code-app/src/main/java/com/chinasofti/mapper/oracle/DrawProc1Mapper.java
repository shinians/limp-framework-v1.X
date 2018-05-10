package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.DrawProc1;
import com.chinasofti.domain.DrawProc1Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrawProc1Mapper {
    int countByExample(DrawProc1Example example);

    int deleteByExample(DrawProc1Example example);

    int insert(DrawProc1 record);

    int insertSelective(DrawProc1 record);

    List<DrawProc1> selectByExample(DrawProc1Example example);

    int updateByExampleSelective(@Param("record") DrawProc1 record, @Param("example") DrawProc1Example example);

    int updateByExample(@Param("record") DrawProc1 record, @Param("example") DrawProc1Example example);
}