package com.limp.framework.boss.service.impl;

import com.limp.framework.boss.domain.KeyValueMap;
import com.limp.framework.boss.domain.KeyValueMapExample;
import com.limp.framework.boss.domain.Role;
import com.limp.framework.boss.mapper.oracle.KeyValueMapMapper;
import com.limp.framework.boss.mapper.oracle.RoleMapper;
import com.limp.framework.boss.service.KeyValueMapService;
import com.limp.framework.utils.StrUtils;
import com.limp.framework.utils.TextUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-6
 * Time: 下午12:39
 * To change this template use File | Settings | File Templates.
 */
@Service
public class KeyValueMapImpl implements KeyValueMapService{

    private static Logger log = Logger.getLogger(KeyValueMapImpl.class.getName());

    @Resource
    KeyValueMapMapper keyValueMapMapper;
    @Resource
    RoleMapper roleMapper;

    @Override
    public boolean save(KeyValueMap entry) {
        return keyValueMapMapper.insertSelective(entry)==1?true:false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public KeyValueMap get(Serializable id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean update(KeyValueMap entry) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(Serializable id) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<KeyValueMap> getList() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
    @Override
    public boolean delKVMapByK(String kid, List<String> ids) {
        log.info(TextUtils.format("根据{0},删除Value范围 :", kid));
        if (ids == null) {
            return false;
        }
        KeyValueMapExample keyValueMapExample = new KeyValueMapExample();
        keyValueMapExample.createCriteria().andKeyEqualTo(kid).andValueIn(ids);
        return keyValueMapMapper.deleteByExample(keyValueMapExample) > 0;
    }
    @Override
    public boolean addValuesByKId(String kid, List<String> ids) {
        log.info(TextUtils.format("KV{0}/绑定Value{1} :", kid, Arrays.toString(ids.toArray(new String[0]))));
        if (StrUtils.isBlank(ids)) {
            return false;
        }
        for (int i = 0; i < ids.size(); i++) {
            if (StrUtils.isBlank(ids.get(i))) {
                continue;
            }
            KeyValueMap keyValueMap = new KeyValueMap();
            keyValueMap.setKey(kid);
            keyValueMap.setValue(ids.get(i));
            keyValueMapMapper.insert(keyValueMap);
        }
        return true;
    }

    @Override
    public List<KeyValueMap> getKVList(KeyValueMap keyValueMap) {
        KeyValueMapExample keyValueMapExample = new KeyValueMapExample();
        KeyValueMapExample.Criteria keyValueMapExampleCriteria = keyValueMapExample.createCriteria();

        if(!StrUtils.isBlank(keyValueMap.getKey())){
            keyValueMapExampleCriteria.andKeyEqualTo(keyValueMap.getKey()) ;
        }
        if(!StrUtils.isBlank(keyValueMap.getValue())){
            keyValueMapExampleCriteria.andValueEqualTo(keyValueMap.getValue()) ;
        }
        return keyValueMapMapper.selectByExample(keyValueMapExample);
    }

    @Override
    public List<Role> getRoleListByKid(List<String> roleIds) {
        List<Role> list=new ArrayList<Role>();
        if(!StrUtils.isBlank(roleIds)&&roleIds.size()>0){
            list=roleMapper.getRoleListByKid(roleIds);
        }
        return list;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
