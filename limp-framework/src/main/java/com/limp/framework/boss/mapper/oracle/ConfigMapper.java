package com.limp.framework.boss.mapper.oracle;

import com.limp.framework.boss.domain.Config;
import com.limp.framework.boss.domain.ConfigExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ConfigMapper {
    int countByExample(ConfigExample example);

    int deleteByExample(ConfigExample example);

    int insert(Config record);

    int insertSelective(Config record);

    List<Config> selectByExample(ConfigExample example);

    List<Config> selectByExampleByMsql(ConfigExample example);

    int updateByExampleSelective(@Param("record") Config record, @Param("example") ConfigExample example);

    int updateByExample(@Param("record") Config record, @Param("example") ConfigExample example);
}