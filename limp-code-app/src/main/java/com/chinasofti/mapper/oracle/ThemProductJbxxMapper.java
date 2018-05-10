package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.ThemProductJbxx;
import com.chinasofti.domain.ThemProductJbxxExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ThemProductJbxxMapper {
    int countByExample(ThemProductJbxxExample example);

    int deleteByExample(ThemProductJbxxExample example);

    int insert(ThemProductJbxx record);

    int insertSelective(ThemProductJbxx record);

    List<ThemProductJbxx> selectByExample(ThemProductJbxxExample example);

    int updateByExampleSelective(@Param("record") ThemProductJbxx record, @Param("example") ThemProductJbxxExample example);

    int updateByExample(@Param("record") ThemProductJbxx record, @Param("example") ThemProductJbxxExample example);
}