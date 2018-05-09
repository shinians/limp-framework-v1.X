package com.limp.framework.boss.mapper.oracle;

import com.limp.framework.boss.domain.AreaCode;
import com.limp.framework.boss.domain.AreaCodeExample;
import com.limp.framework.boss.domain.DicCodes;
import com.limp.framework.boss.domain.DicCodesExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AreaCodeMapper {
    int countByExample(AreaCodeExample example);

    int deleteByExample(AreaCodeExample example);

    int deleteByPrimaryKey(String code);

    int insert(AreaCode record);

    int insertSelective(AreaCode record);

    List<AreaCode> selectByExample(AreaCodeExample example);

    AreaCode selectByPrimaryKey(String code);

    int updateByExampleSelective(@Param("record") AreaCode record, @Param("example") AreaCodeExample example);

    int updateByExample(@Param("record") AreaCode record, @Param("example") AreaCodeExample example);

    int updateByPrimaryKeySelective(AreaCode record);

    int updateByPrimaryKey(AreaCode record);

    List<AreaCode> selectByExampleByMsql(AreaCodeExample example);

}