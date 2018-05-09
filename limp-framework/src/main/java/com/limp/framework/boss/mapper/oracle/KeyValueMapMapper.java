package com.limp.framework.boss.mapper.oracle;

import com.limp.framework.boss.domain.KeyValueMap;
import com.limp.framework.boss.domain.KeyValueMapExample;
import com.limp.framework.boss.domain.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KeyValueMapMapper {
    int countByExample(KeyValueMapExample example);

    int deleteByExample(KeyValueMapExample example);

    int insert(KeyValueMap record);

    int insertSelective(KeyValueMap record);

    List<KeyValueMap> selectByExample(KeyValueMapExample example);

    int updateByExampleSelective(@Param("record") KeyValueMap record, @Param("example") KeyValueMapExample example);

    int updateByExample(@Param("record") KeyValueMap record, @Param("example") KeyValueMapExample example);
}