package com.chinasofti.mapper.oracle;

import com.chinasofti.domain.BiManage;
import com.chinasofti.domain.BiManageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface BIThemMapper {
    /**
     * 统一调用方法
     * @param method
     * @param params
     * @return
     */
    List<Map<String,Object>> selectListMapByMethod(@Param("method") String method,@Param("params") Map<String,Object> params);
}