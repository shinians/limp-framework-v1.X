package com.chinasofti.sevice.impl;

import com.alibaba.fastjson.JSONObject;
import com.chinasofti.domain.*;
import com.chinasofti.mapper.oracle.SurveyorMapper;
import com.chinasofti.sevice.SurveyorService;
import com.chinasofti.utils.DateUtils;
import com.chinasofti.utils.StrUtil;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.utils.StrUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-11
 * Time: 下午6:44
 * To change this template use File | Settings | File Templates.
 */
@Service
public class SurveyorServiceImpl implements SurveyorService {
    @Resource
    private SurveyorMapper surveyorMapper;

    @Override
    public boolean save(Surveyor entry) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    /**
     * 根据验船师身份证【uid】号获取验船师信息
     * @param id
     * @return
     */
    @Override
    public Surveyor get(Serializable id) {
        SurveyorExample surveyorExample = new SurveyorExample();
        SurveyorExample.Criteria surveyorExampleCriteria = surveyorExample.createCriteria();//创建查询参数
        surveyorExampleCriteria.andUidEqualTo(id.toString());
        List<Surveyor>surveyorList=surveyorMapper.selectByExample(surveyorExample);
        return surveyorList.size()>0?surveyorList.get(0):null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean update(Surveyor entry) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(Serializable id) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Surveyor> getList() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Pager<Surveyor> getSurveyorPage(Surveyor surveyor, Pager pager, String orderName, String orderType) {
        SurveyorExample surveyorExample = new SurveyorExample();
        surveyorExample.setPage(pager);   //设置分页
        SurveyorExample.Criteria surveyorExampleCriteria = surveyorExample.createCriteria();//创建查询参数
        //如果验船师身份证号不为空，则作为查询条件
        if (!StrUtils.isBlank(surveyor.getYcscertnum())) {
            //surveyorExampleCriteria.andYcscertnumEqualTo(surveyor.getYcscertnum());
            //使用surid对应验船师身份证号，modify by chen 8.2
            surveyorExampleCriteria.andUidEqualTo(surveyor.getYcscertnum());
        }
        //支持验船师名称模糊搜索
        if (!StrUtils.isBlank(surveyor.getYcsname())) {
            surveyorExampleCriteria.andYcsnameLike("%" + surveyor.getYcsname() + "%");
        }
        //支持验船师所属机构id搜索
        if (!StrUtils.isBlank(surveyor.getOrganid())) {
            surveyorExampleCriteria.andOrganidEqualTo(surveyor.getOrganid());
        }
        //todo 设置其他查询条件

        //排序设置
        if (!StrUtils.isBlank(orderName)) {
            //orderName 排序字段 数据库对应的字段
            orderType=StrUtils.isBlank(orderType)?"DESC": orderType;
            surveyorExample.setOrderByClause(orderName+"  "+orderType);
        }
        List<Surveyor>surveyorList=surveyorMapper.selectByExample(surveyorExample);
        pager.setPagerInfo(surveyorList,surveyorMapper.countByExample(surveyorExample));
        return pager;
    }

    @Override
    public Map<String,List> getSurCertMap(Surveyor surveyor) {
        List<Map<String,String>> certList = surveyorMapper.getCertListByCerynum(surveyor);
        List<Map<String,String>> zyjbList = new ArrayList<Map<String,String>>();
        List<Map<String,String>> zxzgList = new ArrayList<Map<String,String>>();
        for(Map<String,String> tmp : certList){
            String level = tmp.get("CERLEVEL");
            String major = tmp.get("MAJOR");
            if("特殊资格".equals(level)){
                Map tmpMap = new HashMap();
                tmpMap.put(Constant.CODE_TRANS_PRE+"MAJOR",major);
                zxzgList.add(tmpMap);
            }else{
                Map tmpMap = new HashMap();
                tmpMap.put(Constant.CODE_TRANS_PRE+"CERLEVEL",level);
                tmpMap.put("MAJOR",major);
                zyjbList.add(tmpMap);
            }
        }
        Map<String,List> tmpMap = new HashMap<String,List>();
        tmpMap.put("certList",certList);
        tmpMap.put("zxzgList",zxzgList);
        tmpMap.put("zyjbList",zyjbList);
        return tmpMap;
    }

    @Override
    public SurveyorShow getSurShow(Map tmpMap) {
        String checknum = StringUtils.isEmpty(tmpMap.get("checknum"))?"":tmpMap.get("checknum").toString();
        String trainnum = StringUtils.isEmpty(tmpMap.get("trainnum"))?"":tmpMap.get("trainnum").toString();
        Surveyor currSur = tmpMap.get("currSur")==null?new Surveyor():(Surveyor)tmpMap.get("currSur");
        currSur = getSurveyorFormat(currSur);
        Map<String,List> certMap = tmpMap.get("certMap")==null?new HashMap<String, List>():(Map<String, List>)tmpMap.get("certMap");
        String score = StringUtils.isEmpty(tmpMap.get("score"))?"":tmpMap.get("score").toString();
        List<ImageManager> imgUrls = tmpMap.get("imgUrls")==null?new ArrayList<ImageManager>():(ArrayList<ImageManager>)tmpMap.get("imgUrls");
        Map<String,List<Map<String,String>>> workMap = tmpMap.get("workMap")==null?new HashMap<String, List<Map<String,String>>>():(HashMap<String, List<Map<String,String>>>)tmpMap.get("workMap");
        SurveyorShow surshow = new SurveyorShow();
        //主键
        surshow.setId(currSur.getId());
        //年龄
        surshow.setBirthdate(currSur.getBirthdate());
        //所属机构
        surshow.setOrganname(currSur.getOrganname());
        //验船师姓名
        surshow.setYcsname(currSur.getYcsname());
        //验船师身份证号
        surshow.setYcscertnum(currSur.getYcscertnum());
        //船检工作年限
        surshow.setShipchecktime(currSur.getShipchecktime());
        //性别
        surshow.setSex(currSur.getSex());
        //学历
        surshow.setEducertcode(currSur.getEducertcode());
        //累计检修渔船船次
        surshow.setShipchecknum(checknum);
        //参加培训期数
        surshow.setSurtrainnum(trainnum);
        //验船师能力评估分数
        surshow.setCapscore(score);
        //验船师证书最高级别,最高专业
        List<Map<String,String>> certList = certMap.get("certList");
        Map<String,String> topLevel = new HashMap<String,String>();
        Map<String,String> topMajor = new HashMap<String,String>();
        for (Map<String,String> cert:certList) {
            String cerlevel = cert.get("CERLEVEL");
            String major = cert.get("MAJOR");
            if (cerlevel!=null){
                if(!"特殊资格".equals(cerlevel)){
                    if("20_1".equals(cerlevel)){
                        topLevel.put("1","高级验船师");
                    }else if("20_2".equals(cerlevel)&&!"20_1".equals(topLevel)){
                        topLevel.put("2","中级验船师");
                    }else if("20_3".equals(cerlevel)
                            &&!("20_2".equals(topLevel)||"20_1".equals(topLevel))){
                        topLevel.put("3","助理验船师");
                    }else if("20_4".equals(cerlevel)&&("".equals(topLevel)||"验船员".equals(topLevel))){
                        topLevel.put("4","验船员");
                    }

                    if(major.indexOf("电气")!=-1) {
                        topMajor.put("1", "电气");
                    }
                    if(major.indexOf("轮机")!=-1) {
                        topMajor.put("2", "轮机");
                    }
                    if(major.indexOf("船体")!=-1) {
                        topMajor.put("3", "船体");
                    }
                    if(major.indexOf("小型渔业船舶检验")!=-1) {
                        topMajor.put("4", "小型检验");
                    }
                    if(major.indexOf("渔业船舶检验管理")!=-1){
                        topMajor.put("5", "检验管理");
                    }
                }
            }
        }
        if(topLevel.size()>0){
            surshow.setSurlevel(JSONObject.toJSONString(topLevel));
        }else{
            surshow.setSurlevel("无");
        }
        if(topMajor.size()>0){
            surshow.setMajor(JSONObject.toJSONString(topMajor));
        }else{
            surshow.setMajor("无");
        }
        //专项资格
        List<Map> zxzgList = certMap.get("zxzgList");
        Map<String,String> topZxzg = new HashMap<String,String>();
        for(Map zxzgMap : zxzgList){
            String zxzg = (String)zxzgMap.get(Constant.CODE_TRANS_PRE+"MAJOR");
            if("68_1".equals(zxzg)){
                topZxzg.put("1","远洋渔业船舶检验");
            }else if("68_2".equals(zxzg)&&!"68_1".equals(zxzg)){
                topZxzg.put("2","境外船舶检验");
            }else if("68_3".equals(zxzg)&&
                    !("68_2".equals(zxzg)||"68_1".equals(zxzg))){
                topZxzg.put("3","船用产品检验");
            }else if("68_4".equals(zxzg)&&
                    !("68_3".equals(zxzg)||"68_2".equals(zxzg)||"68_1".equals(zxzg))){
                topZxzg.put("4","境外船用产品检验");
            }else if("68_5".equals(zxzg)&&("".equals(topZxzg)||"图纸审查".equals(topZxzg))){
                topZxzg.put("5","图纸审查");
            }
        }
        if(topZxzg.size()>0){
            surshow.setZxzg(JSONObject.toJSONString(topZxzg));
        }else{
            surshow.setZxzg("无");
        }
        //验船师照片
        surshow.setSurimg(imgUrls);
        //工作量走势
        surshow.setWorkMap(workMap);
        return surshow;
    }

    public Surveyor getSurveyorFormat(Surveyor surveyor) {
        //出生日期
        String birthday = surveyor.getBirthdate();
        if(StringUtils.hasText(birthday)&&birthday.length()>=10){
            birthday = birthday.substring(0,10);
        }
        surveyor.setBirthdate(birthday);

        //船检工作年限
        String shipyear = "";
        if(StringUtils.hasText(surveyor.getShipchecktime())){
            int checktime = Integer.parseInt(surveyor.getShipchecktime());
            Calendar a=Calendar.getInstance();
            int curryear = a.get(Calendar.YEAR);
            if(curryear>=checktime){
                shipyear = String.valueOf(curryear-checktime+1);
            }
        }
        surveyor.setShipchecktime(shipyear);
        //性别
//        String sex = "";
//        if("XB1".equals(surveyor.getSex())){
//            sex = "男";
//        }else{
//            sex = "女";
//        }
//        surveyor.setSex(sex);
        //学历
//        String edu = "";
//        if("XL4".equals(surveyor.getEducertcode())){
//            edu = "硕士及以上";
//        }else if("XL3".equals(surveyor.getEducertcode())){
//            edu = "大学本科";
//        }else if("XL2".equals(surveyor.getEducertcode())){
//            edu = "大学专科";
//        }else{
//            edu = "中专及以下";
//        }
//        surveyor.setEducertcode(edu);

        //相关学历
//        String xgedu = "";
//        if("XL4".equals(surveyor.getEducertcode1())){
//            edu = "硕士及以上";
//        }else if("XL3".equals(surveyor.getEducertcode1())){
//            edu = "大学本科";
//        }else if("XL2".equals(surveyor.getEducertcode1())){
//            edu = "大学专科";
//        }else{
//            edu = "中专及以下";
//        }
//        surveyor.setEducertcode1(xgedu);

        return surveyor;
    }

    @Override
    public Pager<SurWorkRecord> getSurWorkRecordList(SurWorkRecord surWorkRecord) {
        List<SurWorkRecord> swrList = surveyorMapper.getSurWorkRecordByCertnum(surWorkRecord);
        int rowCount = surveyorMapper.countSurWorkRecord(surWorkRecord);
        Pager pager = surWorkRecord.getPage();
        pager.setPagerInfo(swrList,rowCount);
        return pager;
    }

    @Override
    public List<Credentials> getCreList(Surveyor surveyor) {
        List<Credentials> creList = surveyorMapper.getCreListByCertnum(surveyor);
        return creList;
    }

    @Override
    public Pager<Surveyor> getSurveyorListByOrgcode(Surveyor surveyor, Pager pager) {
        Pager<Surveyor> surPage = getSurveyorPage(surveyor,pager,null,null);
        List<Credentials> creList = surveyorMapper.getCreList(surveyor);
        List<Surveyor> surList = surPage.getDataList();
        for(Surveyor sur: surList){
            String ycsnum = sur.getYcscertnum();
            Map<String,String> tempMap = new HashMap<String,String>();
            Map<String,String> topLevel = new HashMap<String,String>();
            String major = "";
            String zxzg = "";
            for(Credentials cre: creList){
                String cuid = cre.getCuid();
                if(ycsnum.equals(cuid)){
                    if("特殊资格".equals(cre.getClevel())){
                        if(!StrUtils.isBlank(cre.getMajor())){
                            zxzg += cre.getMajor()+",";
                        }
                    }else{
                        if("20_1".equals(cre.getClevel())){
                            topLevel.put("top","高级");
                            major = cre.getMajor();
                        }else if("20_2".equals(cre.getClevel())&&!"20_1".equals(topLevel)){
                            topLevel.put("top","中级");
                            major = cre.getMajor();
                        }else if("20_3".equals(cre.getClevel())
                                &&!("20_2".equals(topLevel)||"20_1".equals(topLevel))){
                            topLevel.put("top","助理验船师");
                            major = cre.getMajor();
                        }else if("20_4".equals(cre.getClevel())&&("".equals(topLevel)||"验船员".equals(topLevel))){
                            topLevel.put("top","验船员");
                            major = cre.getMajor();
                        }
                    }
                }
            }
            if(!StrUtils.isBlank(zxzg)){
                zxzg = zxzg.substring(0,zxzg.length()-1);
            }
            tempMap.put("level",topLevel.get("top"));
            tempMap.put("major",major);
            tempMap.put("zxzg",zxzg);
            sur = getSurveyorFormat(sur);

            //年龄
            String birthday = sur.getBirthdate();
            String old = "";
            if(StringUtils.hasText(birthday)){
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                try {
                    Date bd = sdf.parse(birthday);
                    int year = DateUtils.getAge(bd);
                    old = String.valueOf(year);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            sur.setBirthdate(old);

            sur.setCertMap(tempMap);
        }
        surPage.setDataList(surList);
        return surPage;
    }
}
