package com.limp.framework.boss.service.impl;

import com.limp.framework.boss.domain.Command;
import com.limp.framework.boss.domain.CommandExample;
import com.limp.framework.boss.domain.PageLog;
import com.limp.framework.boss.domain.PageLogExample;
import com.limp.framework.boss.mapper.oracle.CommandMapper;
import com.limp.framework.boss.mapper.oracle.ObjectUtilMapper;
import com.limp.framework.boss.mapper.oracle.PageLogMapper;
import com.limp.framework.boss.service.CommandService;
import com.limp.framework.boss.service.LogService;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.utils.StrUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author:shinian
 * @description:
 * @date:Created in 15:00 2017/12/8
 * @modified By:
 */
@Service
public class CommandServiceImpl implements CommandService {
    @Resource
    CommandMapper commandMapper;
    @Resource
    ObjectUtilMapper objectUtilMapper;

    @Override
    public Pager<Command> getCommandDomainList(String orderStr,Command  command, Pager pager) {
        CommandExample example = new CommandExample();
        example.setPage(pager);
        CommandExample.Criteria criteria = example.createCriteria();

        //类型查询
        if (!StrUtils.isBlank(command.getCtype())) {
            criteria.andCtypeEqualTo(command.getCtype());
        }
        //code 查询
        if (!StrUtils.isBlank(command.getCcode())) {
            criteria.andCcodeEqualTo(command.getCcode());
        }
        /**
         * 参数模糊查询
         */
        if (!StrUtils.isBlank(command.getCname())) {
            criteria.andCnameLike("%" + command.getCname() + "%");
        }
        //若排序字段不为空，则根据此字段排序
        if (!StrUtils.isBlank(orderStr)) {
            //"USR_CREATEDATE DESC"
            example.setOrderByClause(orderStr);
        }else{
            example.setOrderByClause("SC_IDT ASC");
        }
        /**
         * 查询mysql TODO
         */
        List<Command> commandList=commandMapper.selectByExample(example);

        pager.setPagerInfo(commandList,commandMapper.countByExample(example));
        return pager;
    }

    @Override
    public List<Map<String, Object>> runCommand(String code) {
        if(StrUtils.isBlank(code)){
            return null;
        }
        List<Map<String,Object>> listMap=new ArrayList<Map<String, Object>>();
        CommandExample commandExample=new CommandExample();
        commandExample.createCriteria().andCcodeEqualTo(code);
        List<Command> list=commandMapper.selectByExample(commandExample);
        if(list.size()==1){
            Command command=list.get(0);

            String sql=command.getCsql();
            if(!StrUtils.isCommandIllSql(sql)){
                 listMap=objectUtilMapper.selectDynamicCommandSql(sql);
            }

        }
        return listMap;
    }

    @Override
    public boolean save(Command entry) {
        if(StrUtils.isBlank(entry.getId())){
            entry.setId(StrUtils.randomUUID());
        }
        entry.setState(Constant.NUMBER_1);
        return 1==commandMapper.insertSelective(entry)?true:false;
    }

    @Override
    public Command get(Serializable id) {
        return null;
    }

    @Override
    public boolean update(Command entry) {
        return 1==commandMapper.updateByPrimaryKeySelective(entry)?true:false;

    }

    @Override
    public boolean delete(Serializable id) {
        return false;
    }

    @Override
    public List<Command> getList() {
        return null;
    }
}
