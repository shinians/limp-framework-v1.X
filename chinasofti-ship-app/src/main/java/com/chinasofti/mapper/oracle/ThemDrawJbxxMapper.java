package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.ThemDrawJbxx;
import com.chinasofti.domain.ThemDrawJbxxExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ThemDrawJbxxMapper {
    int countByExample(ThemDrawJbxxExample example);

    int deleteByExample(ThemDrawJbxxExample example);

    int insert(ThemDrawJbxx record);

    int insertSelective(ThemDrawJbxx record);

    List<ThemDrawJbxx> selectByExample(ThemDrawJbxxExample example);

    int updateByExampleSelective(@Param("record") ThemDrawJbxx record, @Param("example") ThemDrawJbxxExample example);

    int updateByExample(@Param("record") ThemDrawJbxx record, @Param("example") ThemDrawJbxxExample example);

    //审图中心图纸审查一次合格率
    List getDrawFirPassRate(@Param("orgUid")String orgUid, @Param("bYear")String bYear, @Param("eYear")String eYear);
}