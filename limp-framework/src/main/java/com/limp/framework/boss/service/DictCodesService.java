package com.limp.framework.boss.service;

import com.limp.framework.boss.domain.DicCodes;
import com.limp.framework.core.abs.AbstractService;
import com.limp.framework.core.bean.Pager;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * @author: zzh
 * Date: 17-7-9
 * Time: 下午8:24
 * To change this template use File | Settings | File Templates.
 */

public interface DictCodesService extends AbstractService<DicCodes> {
    /**
     * 查询码表列表
     * @param orderStr  排序字符串：如 USR_CREATEDATE DESC
     * @param dicCodes  要查询的实体类：查询条件可初始化dicCode
     * @param pager  分页对象
     * @return 每页的数据 Pager
     */
    public Pager<DicCodes> getPageDomainList(String orderStr,DicCodes  dicCodes, Pager pager) ;

//    public boolean add(DicCodes dicCodes);

    public List<DicCodes> getDomainList(DicCodes  dicCodes) ;

    Map getDicByCates(String cates);
}
