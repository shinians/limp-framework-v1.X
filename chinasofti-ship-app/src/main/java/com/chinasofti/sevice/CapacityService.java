package com.chinasofti.sevice;

import com.chinasofti.domain.Capacity;
import com.chinasofti.domain.Surveyor;
import com.limp.framework.core.abs.AbstractService;
import com.limp.framework.core.bean.Pager;

import java.util.List;

/**
 * 能力评估模型service层
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-11
 * Time: 下午6:43
 * To change this template use File | Settings | File Templates.
 */
public interface CapacityService extends AbstractService<Capacity> {

    /**
     * 根据验船师身份证号获取能力评估分数
     * @param surveyor
     * @return
     */
    public String getSurScore(Surveyor surveyor);

    /**
     * 根据验船师身份证号获取能力评估模型
     * @param capacity
     * @return
     */
    public Capacity getLateCapacity(Capacity capacity);

    /**
     * 查询该模型的所有子类
      * @param capacity
     * @return
     */
    public List<Capacity> getModelCapacitList(Capacity capacity);
}
