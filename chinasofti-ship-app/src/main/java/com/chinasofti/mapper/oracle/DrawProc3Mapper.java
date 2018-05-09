package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.DrawProc3;
import com.chinasofti.domain.DrawProc3Example;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DrawProc3Mapper {
    int countByExample(DrawProc3Example example);

    int deleteByExample(DrawProc3Example example);

    int insert(DrawProc3 record);

    int insertSelective(DrawProc3 record);

    List<DrawProc3> selectByExample(DrawProc3Example example);

    int updateByExampleSelective(@Param("record") DrawProc3 record, @Param("example") DrawProc3Example example);

    int updateByExample(@Param("record") DrawProc3 record, @Param("example") DrawProc3Example example);
}