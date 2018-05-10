package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.EntClass;
import com.chinasofti.domain.EntClassExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EntClassMapper {
    int countByExample(EntClassExample example);

    int deleteByExample(EntClassExample example);

    int insert(EntClass record);

    int insertSelective(EntClass record);

    List<EntClass> selectByExample(EntClassExample example);

    int updateByExampleSelective(@Param("record") EntClass record, @Param("example") EntClassExample example);

    int updateByExample(@Param("record") EntClass record, @Param("example") EntClassExample example);
}