package com.limp.framework.boss.service;

import com.limp.framework.boss.domain.AreaCode;
import com.limp.framework.boss.domain.Command;
import com.limp.framework.core.abs.AbstractService;
import com.limp.framework.core.bean.Pager;
import org.springframework.stereotype.Service;

import java.util.List;

public interface AreaCodeService   extends AbstractService<AreaCode> {


    public Pager<AreaCode> getAreaPageList(Pager pager,AreaCode areaCode) ;

    /**
     * 获取行政区划代码
      * @param areaCode
     * @return
     */
    public List<AreaCode> getAreaCodeListByDomain(AreaCode areaCode) ;


}