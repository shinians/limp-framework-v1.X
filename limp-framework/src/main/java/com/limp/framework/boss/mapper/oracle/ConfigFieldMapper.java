package com.limp.framework.boss.mapper.oracle;

import com.limp.framework.boss.domain.ConfigField;
import com.limp.framework.boss.domain.ConfigFieldExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConfigFieldMapper {
    int countByExample(ConfigFieldExample example);

    int deleteByExample(ConfigFieldExample example);

    int insert(ConfigField record);

    int insertSelective(ConfigField record);

    List<ConfigField> selectByExample(ConfigFieldExample example);

    List<ConfigField> selectByExampleByMsql(ConfigFieldExample example);

    int updateByExampleSelective(@Param("record") ConfigField record, @Param("example") ConfigFieldExample example);

    int updateByExample(@Param("record") ConfigField record, @Param("example") ConfigFieldExample example);
}