package com.limp.framework.boss.service.impl;

import com.limp.framework.boss.domain.*;
import com.limp.framework.boss.mapper.oracle.LoginLogMapper;
import com.limp.framework.boss.mapper.oracle.PageLogMapper;
import com.limp.framework.boss.service.LogService;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.utils.StoreControl;
import com.limp.framework.utils.StrUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author:shinian
 * @description:
 * @date:Created in 15:00 2017/12/8
 * @modified By:
 */
@Service
public class LogServiceImpl implements LogService {
    private static Logger log = Logger.getLogger(LogServiceImpl.class.getName());

    @Resource
    PageLogMapper pageLogMapper;

    @Resource
    private LoginLogMapper loginLogMapper;
    @Override
    public boolean save(PageLog entry) {
        return false;
    }

    @Override
    public PageLog get(Serializable id) {
        return null;
    }

    @Override
    public boolean update(PageLog entry) {
        return false;
    }

    @Override
    public boolean delete(Serializable id) {
        return false;
    }

    @Override
    public List<PageLog> getList() {
        return null;
    }
    @Override
    public Pager<PageLog> getPageDomainList(String orderStr,PageLog  pageLog, Pager pager) {
        //初始化Example
        PageLogExample pageLogExample = new PageLogExample();
        //设置分页对象
        pageLogExample.setPage(pager);
        //创建查询条件
        PageLogExample.Criteria criteria = pageLogExample.createCriteria();

        //如果操作类型操作类型
        if (!StrUtils.isBlank(pageLog.getOtlType())) {
            criteria.andOtlTypeEqualTo(pageLog.getOtlType());
        }
        //账号【关联表查询扩展】
        if (!StrUtils.isBlank(pageLog.getAccount())) {
            criteria.andAccountEqualTo(pageLog.getAccount());
        }
        /**
         * 参数模糊查询
         */
        if (!StrUtils.isBlank(pageLog.getOtlParams())) {
            criteria.andOtlParamsLike("%"+pageLog.getOtlParams()+"%");
        }
        //若排序字段不为空，则根据此字段排序
        if (!StrUtils.isBlank(orderStr)) {
            //"USR_CREATEDATE DESC"
            pageLogExample.setOrderByClause(orderStr);
        }else{
            pageLogExample.setOrderByClause("OTL_TIME DESC");
        }
        if(!StrUtils.isBlank(pageLog.getLpsort())){
            pageLogExample.setOrderByClause(pageLog.getLpsort());
        }
        List<PageLog> pageLogList=new ArrayList<PageLog>();
        if(Constant.DB_MYSQL.equals(StoreControl.getValue(Constant.DB_KEY))){
            log.debug("-->开始查询mysql数据库用户信息<---");
            pageLogList=pageLogMapper.selectByExampleByMsql(pageLogExample);
        }else{
            pageLogList=pageLogMapper.selectByExample(pageLogExample);
        }
        pager.setPagerInfo(pageLogList,pageLogMapper.countByExample(pageLogExample));
        return pager;
    }

    @Override
    public List<LoginLog> selectLoginLogByExample(Date startDate, Date endDate, LoginLog loginLog) {
        LoginLogExample example=new LoginLogExample();
        LoginLogExample.Criteria login=example.createCriteria();
        //用户登录状态
        if(!StrUtils.isBlank(loginLog.getUllLogstate())){
            login.andUllLogstateEqualTo(loginLog.getUllLogstate());
        }
        if(!StrUtils.isBlank(startDate)&&!StrUtils.isBlank(startDate)){
            login.andUllTimeBetween(startDate,endDate);
        }


        List<LoginLog> list=new ArrayList<LoginLog>();
        if(Constant.DB_MYSQL.equals(StoreControl.getValue(Constant.DB_KEY))){
            log.debug("-->开始查询mysql数据库用户信息<---");
            list=loginLogMapper.selectByExampleByMsql(example);
        }else{
            list=loginLogMapper.selectByExample(example);
        }
        return list;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
