package com.limp.framework.boss.mapper.oracle;

import java.util.List;
import java.util.Map;


public interface CommonMapper {

    public Map<String, Object> login(Map<String, Object> params);

    public List<Map<String, Object>> callList(Map<String, Object> params);

}
