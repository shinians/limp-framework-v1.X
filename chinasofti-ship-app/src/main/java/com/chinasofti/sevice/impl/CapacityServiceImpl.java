package com.chinasofti.sevice.impl;

import com.chinasofti.domain.*;
import com.chinasofti.domain.Capacity;
import com.chinasofti.domain.CapacityExample;
import com.chinasofti.mapper.oracle.CapacityMapper;
import com.chinasofti.sevice.CapacityService;
import com.limp.framework.utils.StrUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 能力评估模型
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-11
 * Time: 下午6:44
 * To change this template use File | Settings | File Templates.
 */
@Service
public class CapacityServiceImpl implements CapacityService {
    @Resource
    private CapacityMapper capacityMapper;

    @Override
    public boolean save(Capacity entry) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Capacity get(Serializable id) {
        return null;
    }

    @Override
    public boolean update(Capacity entry) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(Serializable id) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Capacity> getList() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getSurScore(Surveyor surveyor) {
        String score = capacityMapper.getScoreByCertnum(surveyor);
        return score;
    }

    @Override
    public Capacity getLateCapacity(Capacity capacity) {
        Capacity newCap = new Capacity();
        String lateBatch = capacityMapper.getLateBatch(capacity.getRefid(), capacity.getBelongmodel());
        capacity.setBatch(lateBatch);
        List<Capacity> capList = capacityMapper.getCapacityByCertnum(capacity);
        for(Capacity cap1:capList){
            if("0".equals(cap1.getPid())){
                List<Capacity> child2 = new ArrayList<Capacity>();
                for(Capacity cap2:capList){
                    if(cap1.getId().equals(cap2.getPid())){
                        List<Capacity> child3 = new ArrayList<Capacity>();
                        for(Capacity cap3:capList){
                            if(cap2.getId().equals(cap3.getPid())){
                                child3.add(cap3);
                            }
                        }
                        cap2.setChildList(child3);
                        child2.add(cap2);
                    }
                }
                cap1.setChildList(child2);
                newCap = cap1;
            }
        }
        return newCap;
    }

    @Override
    public List<Capacity> getModelCapacitList(Capacity capacity) {
        CapacityExample capacityExample=new CapacityExample();
        CapacityExample.Criteria criteria=capacityExample.createCriteria();

        if(!StrUtils.isBlank(capacity.getRefid())){
            criteria.andRefidEqualTo(capacity.getRefid());
        }
        if(!StrUtils.isBlank(capacity.getType())){
            criteria.andTypeEqualTo(capacity.getType());
        }
        if(!StrUtils.isBlank(capacity.getBelongmodel())){
            criteria.andBelongmodelEqualTo(capacity.getBelongmodel());
        }
        String lateBatch = capacityMapper.getLateBatch(capacity.getRefid(), capacity.getBelongmodel());
        criteria.andBatchEqualTo(lateBatch);

        return capacityMapper.selectByExample(capacityExample);
    }
}
