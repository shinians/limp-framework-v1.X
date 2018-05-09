package com.chinasofti.sevice;

import com.chinasofti.domain.*;
import com.chinasofti.domain.OrgcheckHistory;
import com.limp.framework.core.abs.AbstractService;
import com.limp.framework.core.bean.Pager;

import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-11
 * Time: 下午6:40
 * To change this template use File | Settings | File Templates.
 */
public interface OrganService  extends AbstractService<OrganInfo> {
    /**
     * 获取机构的关键指标
     * @param uid
     * @return
     */
    public Map<String,Object> getKeyNum(String uid);

    /**
     * @return 机构列表
     */
    public Pager<OrganInfo> getOrganPage(OrganInfo organInfo, Pager pager,String orderName, String orderType);

    /**
     * 获取此机构的核定历程信息
     * @param orgCheckHistory
     * @return
     */
    public List<OrgcheckHistory> getOrgCheckHistoryList(OrgcheckHistory orgCheckHistory);

    public List<Map<String,String>> getGroupNum( String orgCode, String group,String date);

    public List<ThemJyjgJBXX> getCheckFinishRate(ThemJyjgJBXX jyjgJBXX,String start,String ent);

    public OrgCertificate getLastCert(String certId);

    public List<Map<String,String>> getYCSMatchRate(String orgCode,String startY,String endY,String line);

    public Map getYcsQkrsData(String uid);

}
