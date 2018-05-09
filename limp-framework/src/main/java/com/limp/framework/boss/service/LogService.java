package com.limp.framework.boss.service;

import com.limp.framework.boss.domain.KeyValueMap;
import com.limp.framework.boss.domain.LoginLog;
import com.limp.framework.boss.domain.PageLog;
import com.limp.framework.core.abs.AbstractService;
import com.limp.framework.core.bean.Pager;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author:shinian
 * @description:
 * @date:Created in 14:56 2017/12/8
 * @modified By:
 */

public interface LogService extends AbstractService<PageLog> {
    /**
     * 根据条件获取log分页日志
     * @param orderStr
     * @param pageLog
     * @param pager
     * @return
     */
    public Pager<PageLog> getPageDomainList(String orderStr,PageLog  pageLog, Pager pager) ;

    public List<LoginLog> selectLoginLogByExample(Date startDate, Date endDate, LoginLog loginLog) ;

    }
