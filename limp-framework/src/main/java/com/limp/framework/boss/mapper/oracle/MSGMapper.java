package com.limp.framework.boss.mapper.oracle;

import com.limp.framework.boss.domain.MSG;
import com.limp.framework.boss.domain.MSGExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MSGMapper {
    int countByExample(MSGExample example);

    int deleteByExample(MSGExample example);

    int insert(MSG record);

    int insertSelective(MSG record);

    List<MSG> selectByExample(MSGExample example);

    List<MSG> selectByExampleByMsql(MSGExample example);

    int updateByExampleSelective(@Param("record") MSG record, @Param("example") MSGExample example);

    int updateByExample(@Param("record") MSG record, @Param("example") MSGExample example);
}