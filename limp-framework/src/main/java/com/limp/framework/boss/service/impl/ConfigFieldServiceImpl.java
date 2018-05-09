package com.limp.framework.boss.service.impl;

import com.limp.framework.boss.domain.Config;
import com.limp.framework.boss.domain.ConfigExample;
import com.limp.framework.boss.domain.ConfigField;
import com.limp.framework.boss.domain.ConfigFieldExample;
import com.limp.framework.boss.mapper.oracle.ConfigFieldMapper;
import com.limp.framework.boss.mapper.oracle.ConfigMapper;
import com.limp.framework.boss.service.ConfigFieldService;
import com.limp.framework.core.abs.AbstractService;
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

@Service
public class ConfigFieldServiceImpl implements ConfigFieldService {

    private static Logger log= Logger.getLogger(ConfigFieldServiceImpl.class);

    @Resource
    private ConfigFieldMapper configFieldMapper;
    @Resource
    private ConfigMapper configMapper;

    @Override
    public boolean save(ConfigField entry) {
        if(StrUtils.isBlank(entry.getId())){
            entry.setId(StrUtils.randomUUID());
        }
        entry.setState(new Short(Constant.STRING_1));
        return Constant.NUMBER_1==configFieldMapper.insertSelective(entry)?true:false;
    }

    @Override
    public ConfigField get(Serializable id) {
        ConfigFieldExample configFieldExample=new ConfigFieldExample();

        if(StrUtils.isBlank(id)){
            return null;
        }
        ConfigField configField=new ConfigField();
        configFieldExample.createCriteria().andIdEqualTo(id.toString());
        List<ConfigField> list=configFieldMapper.selectByExample(configFieldExample);
        if(!StrUtils.isBlank(list)&&list.size()>0){
            return list.get(0);

        }
        return null;
    }

    @Override
    public boolean update(ConfigField entry) {
        ConfigFieldExample configFieldExample=new ConfigFieldExample();

        if(StrUtils.isBlank(entry.getId())){
            entry.setId(StrUtils.randomUUID());
        }
        configFieldExample.createCriteria().andIdEqualTo(entry.getId());
        entry.setUdt(new Date());
        return Constant.NUMBER_1==configFieldMapper.updateByExampleSelective(entry,configFieldExample)?true:false;
    }

    @Override
    public boolean delete(Serializable id) {
        return false;
    }

    @Override
    public List<ConfigField> getList() {
        return null;
    }

    @Override
    public Pager<ConfigField> getConfigFieldList(Pager pager, ConfigField configField) {
        ConfigFieldExample example = new ConfigFieldExample();
        example.setPage(pager);
        ConfigFieldExample.Criteria criteria = example.createCriteria();

        //id查询
        if (!StrUtils.isBlank(configField.getId())) {
            criteria.andIdEqualTo(configField.getId());
        }
        //key 查询
        if (!StrUtils.isBlank(configField.getKey())) {
            criteria.andKeyEqualTo(configField.getKey());
        }
        //key 查询
        if (!StrUtils.isBlank(configField.getPid())) {
            criteria.andPidEqualTo(configField.getPid());
        }
        criteria.andStateEqualTo(new Short(Constant.STRING_1));

        //若排序字段不为空，则根据此字段排序
        if (!StrUtils.isBlank(configField.getLpsort())) {
            example.setOrderByClause(configField.getLpsort());
        }else{
            example.setOrderByClause("CCF_SORT ASC");
        }
        List<ConfigField> configFields=new ArrayList<>();
        if(Constant.DB_MYSQL.equals(StoreControl.getValue(Constant.DB_KEY))){
            log.debug("-->开始查询mysql数据库用户信息<---");
            configFields=configFieldMapper.selectByExampleByMsql(example);
        }else{
           configFields=configFieldMapper.selectByExample(example);
            ;
        }

        pager.setPagerInfo(configFields,configFieldMapper.countByExample(example));
        return pager;
    }

    @Override
    public Pager<Config> getConfigList(Pager pager, Config config) {
        ConfigExample example = new ConfigExample();
        example.setPage(pager);
        ConfigExample.Criteria criteria = example.createCriteria();

        //id查询
        if (!StrUtils.isBlank(config.getId())) {
            criteria.andIdEqualTo(config.getId());
        }
        //key 查询
        if (!StrUtils.isBlank(config.getKey())) {
            criteria.andKeyEqualTo(config.getKey());
        }
        //key 查询
         criteria.andStateEqualTo(new Short(Constant.STRING_1));

        //若排序字段不为空，则根据此字段排序
        if (!StrUtils.isBlank(config.getLpsort())) {
            example.setOrderByClause(config.getLpsort());
        }else{
            example.setOrderByClause("CC_SORT ASC");
        }

        List<Config> configFields=configMapper.selectByExample(example);

        pager.setPagerInfo(configFields,configMapper.countByExample(example));
        return pager;
    }
}