package com.limp.framework.boss.service;

import com.limp.framework.boss.domain.Command;
import com.limp.framework.boss.domain.PageLog;
import com.limp.framework.core.abs.AbstractService;
import com.limp.framework.core.bean.Pager;

import java.util.List;
import java.util.Map;

/**
 * @author:shinian
 * @description:
 * @date:Created in 14:56 2017/12/8
 * @modified By:
 */

public interface CommandService extends AbstractService<Command> {
    /**
     * 根据条件获取log分页日志
     * @param orderStr
     * @param command
     * @param pager
     * @return
     */
    public Pager<Command> getCommandDomainList(String orderStr, Command command, Pager pager) ;

    /**
     * 执行命令
     * @param code
     * @return
     */
    public List<Map<String,Object>> runCommand(String code);



    }
