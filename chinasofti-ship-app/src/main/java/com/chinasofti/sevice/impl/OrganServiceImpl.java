package com.chinasofti.sevice.impl;

import com.chinasofti.common.Const;
import com.chinasofti.domain.*;
import com.chinasofti.mapper.oracle.*;
import com.chinasofti.sevice.OrganService;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.utils.StrUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-11
 * Time: 下午6:42
 * To change this template use File | Settings | File Templates.
 */
@Service
public class OrganServiceImpl implements OrganService{

    @Resource
    private OrgcheckHistoryMapper orgCheckHistoryMapper;
    @Resource
    private OrganInfoMapper organInfoMapper;
    @Resource
    private ShipMapper shipMapper;
    @Resource
    private SurveyorMapper surveyorMapper;
    @Resource
    private EntInfoMapper entInfoMapper;
    @Resource
    private ThemJyjgJBXXMapper themJyjgJBXXMapper;
    @Resource
    private OrgCertificateMapper orgCertificateMapper;
    @Resource
    private BIThemMapper biThemMapper;
    @Override
    public boolean save(OrganInfo entry) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public OrganInfo get(Serializable id) {
        OrganInfoExample organInfoExample = new OrganInfoExample();
        OrganInfoExample.Criteria organInfoExampleCriteria = organInfoExample.createCriteria();
        organInfoExampleCriteria.andUidEqualTo(id.toString());
        List<OrganInfo>organInfoList=organInfoMapper.selectByExample(organInfoExample);
        OrganInfo org = null;
        if (organInfoList!=null&&organInfoList.size()>0){
            org = organInfoList.get(0);
            String naturetype = org.getNaturetype();
            String bodertype = org.getBodertype();
            String headhas = org.getHeadhas();
            //字典解析不了的暂时设置为其他 TODO
            if ("105_0".equals(naturetype) || "105_".equals(naturetype)) {
                org.setNaturetype("其他");
            }
            if ("1".equals(bodertype)) {
                org.setBodertype("是");
            } else if("2".equals(bodertype)){
                org.setBodertype("否");
            }
            if ("1".equals(headhas)) {
                org.setHeadhas("是");
            } else if("2".equals(headhas)){
                org.setHeadhas("否");
            }
        }
        return organInfoList.size()>0?organInfoList.get(0):null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean update(OrganInfo entry) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(Serializable id) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<OrganInfo> getList() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Map<String, Object> getKeyNum(String uid) {
        Map<String,Object> map=new HashMap<String,Object>();
        ShipExample shipExample=new ShipExample();
        ShipExample.Criteria criteria=shipExample.createCriteria();
        criteria.andOrgidEqualTo(uid);
        map.put("SHIPNUM",shipMapper.countByExample(shipExample));

        SurveyorExample surveyorExample=new SurveyorExample();
        SurveyorExample.Criteria criteria1=surveyorExample.createCriteria();
        criteria1.andOrganidEqualTo(uid);
        map.put("SURNUM",surveyorMapper.countByExample(surveyorExample));

        EntInfoExample entInfoExample=new EntInfoExample();
        EntInfoExample.Criteria criteria2=entInfoExample.createCriteria();
        criteria2.andOrgcodeEqualTo(uid).andEntcateEqualTo("3");
        map.put("ENT3NUM",entInfoMapper.countByExample(entInfoExample));

        EntInfoExample entInfoExample1=new EntInfoExample();
        EntInfoExample.Criteria criteria3=entInfoExample1.createCriteria();
        List type=new ArrayList();
        type.add("7");
        type.add("5");
        type.add("6");
        criteria3.andOrgcodeEqualTo(uid).andEntcateIn(type);
        map.put("ENT4NUM",entInfoMapper.countByExample(entInfoExample1));
        return map;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Pager<OrganInfo> getOrganPage(OrganInfo organInfo, Pager pager,String orderName, String orderType) {
        OrganInfoExample organInfoExample = new OrganInfoExample();
        organInfoExample.setPage(pager);
        OrganInfoExample.Criteria organInfoExampleCriteria = organInfoExample.createCriteria();
        //如果机构代码不为空则作为条件查询
        if (!StrUtils.isBlank(organInfo.getOrgcode())) {
            organInfoExampleCriteria.andOrgcodeEqualTo(organInfo.getOrgcode());
        }
        if (!StrUtils.isBlank(organInfo.getOrgname())) {
            organInfoExampleCriteria.andOrgnameLike("%" + organInfo.getOrgname() + "%");
        }
        if (!StrUtils.isBlank(orderName)) {
            //orderName 排序字段 数据库对应的字段
            orderType=StrUtils.isBlank(orderType)?"DESC": orderType;
            organInfoExample.setOrderByClause(orderName+"  "+orderType);
        }
        List<OrganInfo>organInfoList=organInfoMapper.selectByExample(organInfoExample);
        pager.setPagerInfo(organInfoList,organInfoMapper.countByExample(organInfoExample));
        return pager;
    }

    @Override
    public List<OrgcheckHistory> getOrgCheckHistoryList(OrgcheckHistory orgCheckHistory) {
        OrgcheckHistoryExample orgCheckHistoryExample=new OrgcheckHistoryExample();
        OrgcheckHistoryExample.Criteria orgCheckHistoryExampleCriteria=orgCheckHistoryExample.createCriteria();
        orgCheckHistoryExampleCriteria.andUidEqualTo(orgCheckHistory.getUid());
        //排序
        orgCheckHistoryExample.setOrderByClause("COH_CHECKTIME ASC");
        orgCheckHistoryMapper.selectByExample(orgCheckHistoryExample);
        return  orgCheckHistoryMapper.selectByExample(orgCheckHistoryExample);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Map<String, String>> getGroupNum(String orgCode, String group,String date ) {
        return organInfoMapper.getGroupNum(group,orgCode,date);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<ThemJyjgJBXX> getCheckFinishRate(ThemJyjgJBXX jyjgJBXX,String start,String ent) {
        ThemJyjgJBXXExample themJyjgJBXXExample = new ThemJyjgJBXXExample();
        ThemJyjgJBXXExample.Criteria themJyjgJBXXExampleCriteria = themJyjgJBXXExample.createCriteria();
        if(!StrUtils.isBlank(jyjgJBXX.getId())){
            themJyjgJBXXExampleCriteria.andIdEqualTo(jyjgJBXX.getId());
        }
        if(!StrUtils.isBlank(start)&&!StrUtils.isBlank(ent)){
            themJyjgJBXXExampleCriteria.andYearBetween(start,ent);
        }
        List<ThemJyjgJBXX>themJyjgJBXXList=themJyjgJBXXMapper.selectByExample(themJyjgJBXXExample);
        return themJyjgJBXXList;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public OrgCertificate getLastCert(String certId) {
        OrgCertificateExample orgCertificateExample=new OrgCertificateExample();
        OrgCertificateExample.Criteria criteria=orgCertificateExample.createCriteria();
        criteria.andUidEqualTo(certId);
        List<OrgCertificate> list=orgCertificateMapper.selectByExample(orgCertificateExample);
        return list.size()>0?list.get(0):null;
    }

    @Override
    public List<Map<String, String>> getYCSMatchRate(String orgCode, String startY, String endY,String line) {
        return organInfoMapper.getYCSMatchRate(orgCode,startY,endY,line) ; //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Map getYcsQkrsData(String uid) {
        Map map = new HashMap();
        Map params = new HashMap();
        params.put("likeStr", uid);
        params.put("type", Constant.NUMBER_1);
        List<Map> surCertList = biThemMapper.selectListMapByMethod("getYcsQkrsData",params);//持证验船师
        params.put("type", Constant.NUMBER_2);
        List surOnlineList = biThemMapper.selectListMapByMethod("getYcsQkrsData",params);//一线验船师
        map.put("surCertList", surCertList);
        map.put("surOnlineList", surOnlineList);
        return map;
    }
}
