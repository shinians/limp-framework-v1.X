package com.limp.framework.boss.mapper.oracle;

import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author shinian
 * 通用工具类
 */
public interface ObjectUtilMapper {
    /**
     * 统一调用方法
     * @param method
     * @param params
     * @return
     */
    List<Map<String,Object>> selectListMapByMethod(@Param("method") String method, @Param("params") Map<String, Object> params);

    /**
     * 动态命令执行
     * @param commandSql
     * @return
     */
    List<Map<String,Object>> selectDynamicCommandSql(@Param("commandSql") String commandSql);
}