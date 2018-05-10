package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.ThemEntJbxx;
import com.chinasofti.domain.ThemEntJbxxExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ThemEntJbxxMapper {
    int countByExample(ThemEntJbxxExample example);

    int deleteByExample(ThemEntJbxxExample example);

    int insert(ThemEntJbxx record);

    int insertSelective(ThemEntJbxx record);

    List<ThemEntJbxx> selectByExample(ThemEntJbxxExample example);

    int updateByExampleSelective(@Param("record") ThemEntJbxx record, @Param("example") ThemEntJbxxExample example);

    int updateByExample(@Param("record") ThemEntJbxx record, @Param("example") ThemEntJbxxExample example);

    List<Map> getEntNumsGroupPrv(@Param("year")String year,@Param("entcate") String entcate);
}