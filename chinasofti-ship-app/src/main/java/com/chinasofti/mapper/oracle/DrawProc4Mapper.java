package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.DrawProc4;
import com.chinasofti.domain.DrawProc4Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrawProc4Mapper {
    int countByExample(DrawProc4Example example);

    int deleteByExample(DrawProc4Example example);

    int insert(DrawProc4 record);

    int insertSelective(DrawProc4 record);

    List<DrawProc4> selectByExample(DrawProc4Example example);

    int updateByExampleSelective(@Param("record") DrawProc4 record, @Param("example") DrawProc4Example example);

    int updateByExample(@Param("record") DrawProc4 record, @Param("example") DrawProc4Example example);
}