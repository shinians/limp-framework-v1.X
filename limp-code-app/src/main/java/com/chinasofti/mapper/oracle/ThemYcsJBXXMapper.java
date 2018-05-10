package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.ThemYcsJBXX;
import com.chinasofti.domain.ThemYcsJBXXExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ThemYcsJBXXMapper {
    int countByExample(ThemYcsJBXXExample example);

    int deleteByExample(ThemYcsJBXXExample example);

    int insert(ThemYcsJBXX record);

    int insertSelective(ThemYcsJBXX record);

    List<ThemYcsJBXX> selectByExample(ThemYcsJBXXExample example);

    int updateByExampleSelective(@Param("record") ThemYcsJBXX record, @Param("example") ThemYcsJBXXExample example);

    int updateByExample(@Param("record") ThemYcsJBXX record, @Param("example") ThemYcsJBXXExample example);

    List<Map<String,String>> getYcsNumGroupByYear(ThemYcsJBXX record);

    List<Map<String,String>> getYcsXLGroupIndex(ThemYcsJBXX record);

    List<Map<String,String>> getYcsCateIndex(ThemYcsJBXX record);

}