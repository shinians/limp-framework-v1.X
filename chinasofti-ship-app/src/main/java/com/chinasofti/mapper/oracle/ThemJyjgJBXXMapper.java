package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.ThemJyjgJBXX;
import com.chinasofti.domain.ThemJyjgJBXXExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ThemJyjgJBXXMapper {
    int countByExample(ThemJyjgJBXXExample example);

    int deleteByExample(ThemJyjgJBXXExample example);

    int insert(ThemJyjgJBXX record);

    int insertSelective(ThemJyjgJBXX record);

    List<ThemJyjgJBXX> selectByExample(ThemJyjgJBXXExample example);

    int updateByExampleSelective(@Param("record") ThemJyjgJBXX record, @Param("example") ThemJyjgJBXXExample example);

    int updateByExample(@Param("record") ThemJyjgJBXX record, @Param("example") ThemJyjgJBXXExample example);
}