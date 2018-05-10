package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.ThemProductYwhz;
import com.chinasofti.domain.ThemProductYwhzExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ThemProductYwhzMapper {
    int countByExample(ThemProductYwhzExample example);

    int deleteByExample(ThemProductYwhzExample example);

    int insert(ThemProductYwhz record);

    int insertSelective(ThemProductYwhz record);

    List<ThemProductYwhz> selectByExample(ThemProductYwhzExample example);

    int updateByExampleSelective(@Param("record") ThemProductYwhz record, @Param("example") ThemProductYwhzExample example);

    int updateByExample(@Param("record") ThemProductYwhz record, @Param("example") ThemProductYwhzExample example);

    int countNum(@Param("entcate") String entcate,@Param("like") String like,@Param("date") String date);
}