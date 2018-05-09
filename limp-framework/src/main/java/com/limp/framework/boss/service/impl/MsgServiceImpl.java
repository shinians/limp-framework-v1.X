package com.limp.framework.boss.service.impl;

import com.limp.framework.boss.domain.MSG;
import com.limp.framework.boss.domain.MSGExample;
import com.limp.framework.boss.mapper.oracle.MSGMapper;
import com.limp.framework.boss.service.MsgService;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.utils.StoreControl;
import com.limp.framework.utils.StrUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 16-7-9
 * Time: 下午11:23
 * To change this template use File | Settings | File Templates.
 */
@Service
public class MsgServiceImpl implements MsgService {
    @Resource
    private MSGMapper msgMapper;
    private static Logger log = Logger.getLogger(MsgServiceImpl.class.getName());

    @Override
    public Pager<MSG> getListExample(String orderName, String orderType, MSG msg, Pager pager) {
        MSGExample msgExample = new MSGExample();
        msgExample.setPage(pager);
        MSGExample.Criteria msgCriteria = msgExample.createCriteria();
        msgCriteria.andStatusEqualTo(new Short(Constant.STRING_1));
        if(!StrUtils.isBlank(msg.getType())){//消息类型类型
            msgCriteria.andTypeEqualTo(msg.getType());
        } if(!StrUtils.isBlank(msg.getRead())){ //用户已读
            msgCriteria.andReadEqualTo(msg.getRead());
         //   msgCriteria.andUsrAccountLike("%" + user.getUsrAccount() + "%");
        } if(!StrUtils.isBlank(msg.getUsridfrom())){//发件
            msgCriteria.andUsridfromEqualTo(msg.getUsridfrom());
        } if(!StrUtils.isBlank(msg.getUsridto())){//收件
            msgCriteria.andUsridtoEqualTo(msg.getUsridto());
        }
        if (!StrUtils.isBlank(orderName)){
            if(Constant.STRING_1.equals(orderName)){
                if(Constant.STRING_1.equals(orderType)){
                    msgExample.setOrderByClause("MSG_IDT DESC");
                }else{
                    msgExample.setOrderByClause("MSG_IDT ASC");
                }
            }
        }
        List<MSG>msgs=new ArrayList<MSG>();
        if(Constant.DB_MYSQL.equals(StoreControl.getValue(Constant.DB_KEY))){

            log.debug("开始查询mysql数据库用户信息...");

            msgs=msgMapper.selectByExampleByMsql(msgExample);

        }else{
            msgs=msgMapper.selectByExample(msgExample);
        }
        pager.setPagerInfo(msgs,msgMapper.countByExample(msgExample));
        return pager;
    }

    @Override
    public boolean saveMsg(MSG msg) {
        //设置ID
        if(StrUtils.isBlank(msg.getId())){
            msg.setId(StrUtils.randomUUID());
        }
        //未读状态
        if(StrUtils.isBlank(msg.getRead())){
            msg.setRead(new Short(Constant.STRING_0));
        }
        //初始化时间
        if(StrUtils.isBlank(msg.getIdt())){
            msg.setIdt(new Date());
            msg.setUdt(new Date());
        }
        //有效状态
        msg.setStatus(new Short(Constant.STRING_1));
        return  msgMapper.insert(msg)==1?true:false;
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean update(MSG msg) {
        MSGExample msgExample = new MSGExample();
        MSGExample.Criteria msgCriteria = msgExample.createCriteria();
        msg.setUdt(new Date());
        msgCriteria.andIdEqualTo(msg.getId());
        return  msgMapper.updateByExampleSelective(msg,msgExample)==1?true:false;
    }

    @Override
    public Integer getMsgNum(MSG msg) {
        MSGExample msgExample = new MSGExample();
        MSGExample.Criteria msgCriteria = msgExample.createCriteria();
        msgCriteria.andStatusEqualTo(new Short(Constant.STRING_1));
        if(!StrUtils.isBlank(msg.getId())){
            msgCriteria.andIdEqualTo(msg.getId());
        }if(!StrUtils.isBlank(msg.getUsridto())){
            msgCriteria.andUsridtoEqualTo(msg.getUsridto());
        }if(!StrUtils.isBlank(msg.getRead())){
            msgCriteria.andReadEqualTo(msg.getRead());
        }
        return msgMapper.countByExample(msgExample);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<MSG> getListMsg() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
