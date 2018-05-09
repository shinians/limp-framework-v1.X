package com.limp.framework.boss.service;

import com.limp.framework.boss.domain.MSG;
import com.limp.framework.boss.domain.PageLog;
import com.limp.framework.core.bean.Pager;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * @author: zzh
 * Date: 16-1-30
 * Time: 下午7:37
 * To change this template use File | Settings | File Templates.
 */

public interface CommonService {
    /**
     * 保存日志
     * @param pageLog
     */
    public void insertPageLog(PageLog pageLog);

    /**
     * 将jsonStr中的码表转换
     * @param jsonStr
     * @return
     */
    public String transCodeZN(String jsonStr);

    /**
     * 获取码表中的valu值
     * @param key 码表code
     * @return value
     */
    public String getCacheCodeValue(String key);

}
