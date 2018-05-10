package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.DrawCheck;
import com.chinasofti.domain.DrawCheckExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface DrawCheckMapper {
    int countByExample(DrawCheckExample example);

    int deleteByExample(DrawCheckExample example);

    int insert(DrawCheck record);

    int insertSelective(DrawCheck record);

    List<DrawCheck> selectByExample(DrawCheckExample example);

    int updateByExampleSelective(@Param("record") DrawCheck record, @Param("example") DrawCheckExample example);

    int updateByExample(@Param("record") DrawCheck record, @Param("example") DrawCheckExample example);


    List<Map> getDrawCheckNumsByYear(@Param("year")String year, @Param("orgCode")String orgCode);

    List<Map> getDrawCheckNumsByYearType(@Param("orgCode")String orgCode,@Param("startYear")String startYear,@Param("endYear")String endYear);
    //图纸审查的套数
    int getDrawNumsByOrgCode(@Param("likeStr")String likeStr);
}