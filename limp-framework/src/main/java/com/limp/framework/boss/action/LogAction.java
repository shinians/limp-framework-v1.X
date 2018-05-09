package com.limp.framework.boss.action;

import com.limp.framework.boss.domain.PageLog;
import com.limp.framework.boss.service.LogService;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.constant.ResultMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author:shinian
 * @description:
 * @date:Created in 16:21 2017/12/8
 * @modified By:
 */
@Controller
@RequestMapping("/system/log")
public class LogAction {
    @Autowired
    private LogService logService;

    /**
     * 每页显示的条数
     */
    private static final Integer DEFAULT_ROW = 10;

    /**
     *  一共多少行
     */
    private Integer rowCount;
    /**
     * 查询数据字段方法Pager
     * @param pager
     * @param pageLog
     * @param orderStr
     * @param orderType
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getList",produces = "text/plain;charset=UTF-8")
    public @ResponseBody
    String getUserList(Pager pager,PageLog pageLog,String orderStr,String orderType) {
        pager = new Pager(pager.getPage(), DEFAULT_ROW);
        Pager<PageLog> pageDomainList = logService.getPageDomainList(orderStr,pageLog, pager);
        rowCount = pager.getRowCount();
        return  new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS,pageDomainList,"").getJson();
    }

}
