package com.chinasofti.sevice;

import com.chinasofti.domain.Credentials;
import com.chinasofti.domain.SurWorkRecord;
import com.chinasofti.domain.Surveyor;
import com.chinasofti.domain.SurveyorShow;
import com.limp.framework.core.abs.AbstractService;
import com.limp.framework.core.bean.Pager;

import java.util.List;
import java.util.Map;

/**
 * 验船师service层
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-11
 * Time: 下午6:43
 * To change this template use File | Settings | File Templates.
 */
public interface SurveyorService extends AbstractService<Surveyor> {
    /**
     * 获取验船师列表
     * @param surveyor 验船师查询参数
     * @param pager 分页
     * @param orderName 排序字段 p
     * @param orderType 升降序
     * @return
     */
    public Pager<Surveyor> getSurveyorPage(Surveyor surveyor, Pager pager,String orderName, String orderType);

    /**
     * 根据身份证号获取验船师级别
     * @param surveyor
     * @return
     */
    public Map<String,List> getSurCertMap(Surveyor surveyor);

    /**
     * 根据验船师身份证号获取证书资质历程
     * @param surveyor
     * @return
     */
    public List<Credentials> getCreList(Surveyor surveyor);

    /**
     * 根据map得到页面展示
     * @param tmpMap
     * @return
     */
    public SurveyorShow getSurShow(Map tmpMap);

    /**
     * 得到格式化的验船师
     * @param surveyor
     * @return
     */
    public Surveyor getSurveyorFormat(Surveyor surveyor);

    /**
     * 获取验船师工作记录
     * @param surWorkRecord
     * @return
     */
    public Pager<SurWorkRecord> getSurWorkRecordList(SurWorkRecord surWorkRecord);

    /**
     * 获取验船师工作记录
     * @param surveyor
     * @param pager
     * @return
     */
    public Pager<Surveyor> getSurveyorListByOrgcode(Surveyor surveyor,Pager pager);

}
