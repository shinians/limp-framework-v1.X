package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.DicCode;
import com.chinasofti.domain.DicCodeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DicCodeMapper {
    int countByExample(DicCodeExample example);

    int deleteByExample(DicCodeExample example);

    int insert(DicCode record);

    int insertSelective(DicCode record);

    List<DicCode> selectByExample(DicCodeExample example);

    int updateByExampleSelective(@Param("record") DicCode record, @Param("example") DicCodeExample example);

    int updateByExample(@Param("record") DicCode record, @Param("example") DicCodeExample example);
}