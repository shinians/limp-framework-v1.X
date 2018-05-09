package com.chinasofti.sevice.impl;

import com.chinasofti.domain.*;
import com.chinasofti.mapper.oracle.ShipMapper;
import com.chinasofti.mapper.oracle.TrainMapper;
import com.chinasofti.sevice.ShipService;
import com.chinasofti.sevice.TrainService;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.utils.StrUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * 获取培训信息
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-11
 * Time: 下午6:44
 * To change this template use File | Settings | File Templates.
 */
@Service
public class TrainServiceImpl implements TrainService {
    @Resource
    private TrainMapper trainMapper;

    @Override
    public boolean save(Ship entry) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Ship get(Serializable id) {
        return null;
    }

    @Override
    public boolean update(Ship entry) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(Serializable id) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Ship> getList() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getSurTrainnum(Surveyor surveyor) {
        String trainnum = trainMapper.getSurTrainnumByCertnum(surveyor);
        return trainnum;
    }

    @Override
    public List<SurTrainShow> getSurTrainList(SurTrainShow surTrainShow) {
        List<SurTrainShow> stsList = trainMapper.getSurTrainByCertnum(surTrainShow);
        return stsList;
    }

    @Override
    public Map<String, String> getCoreNum(String procode) {
        Map<String, String> map = new HashMap<String, String>();

        if (StrUtils.isBlank(procode)) {
            procode = null;
        }

        // 累计培训总人次,trainingNum
        map.put("trainingNum", trainMapper.getSurtrainRecordCount(procode,Constant.CODE_TRANS_PRE) + "");

        // 培训需求总人数,countPersonNum
        map.put("countPersonNum", trainMapper.getPersonnumCount(procode) + "");

        // 培训平均完成率,percent
        map.put("percent", trainMapper.getPERCENT(procode) + "");

        // 年度培训计划人数,planNum
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        map.put("planNum", trainMapper.getPlannumByYear(simpleDateFormat.format(new Date()), procode) + "");

        return map;
    }

    @Override
    public List<Map<String, String>> getTrainingNumStatistics(String procode, String startDate, String endDate) {
        List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();

        if (StrUtils.isBlank(procode)) {
            procode = null;
        }

        List<String> list = new ArrayList<String>();
        if (StrUtils.isBlank(startDate) && StrUtils.isBlank(endDate)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
            String newYearString = simpleDateFormat.format(new Date());
            int newYearInt = Integer.parseInt(newYearString);
            for (int i = 5; i > 0; i--) {
                list.add((newYearInt - i) + "");
            }
        } else if (!StrUtils.isBlank(startDate) && !StrUtils.isBlank(endDate)) {
            int startYearInt = Integer.parseInt(startDate);
            int endYearInt = Integer.parseInt(endDate);
            list.add(startDate);
            for (int i = 1; i < endYearInt - startYearInt; i++) {
                list.add((startYearInt + i) + "");
            }
            list.add(endDate);
        } else if (!StrUtils.isBlank(startDate)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
            String newYearString = simpleDateFormat.format(new Date());
            int newYearInt = Integer.parseInt(newYearString);
            list.add(startDate);
            int startYearInt = Integer.parseInt(startDate);
            for (int i = 1; i < 5; i++) {
                if ((startYearInt + i) < newYearInt) {
                    list.add((startYearInt + i) + "");
                }
            }
        } else if (!StrUtils.isBlank(endDate)) {
            int endYearInt = Integer.parseInt(endDate);
            for (int i = 4; i > 0; i--) {
                list.add((endYearInt - i) + "");
            }
            list.add(endDate);
        }

        for (int i = 0; i < list.size(); i++) {
            Map<String, String> map = new HashMap<String, String>();
            map.put("year", list.get(i));
            map.put("count", trainMapper.getSurtrainRecordCountByYear(list.get(i), procode) + "");
            mapList.add(map);
        }

        return mapList;
    }

    @Override
    public List<Map<String, String>> getPercentStatistics(String orderBy, String procode) {
        List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
        if (StrUtils.isBlank(procode)) {
            procode = null;
        }
        if (!StrUtils.isBlank(orderBy) && "asc".equals(orderBy)) {
            mapList = trainMapper.getPercentStatistics("asc", procode);
        } else {
            mapList = trainMapper.getPercentStatistics("desc", procode);
        }
        return mapList;
    }

    @Override
    public List<Map<String, String>> getTrainRateStatistics(List<String> ids, String orderBy, String procode) {
        List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
        if (!StrUtils.isBlank(orderBy) && "asc".equals(orderBy)) {
            orderBy = "asc";
        } else {
            orderBy = "desc";
        }
        if (StrUtils.isBlank(procode)) {
            procode = null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        String newYearString = simpleDateFormat.format(new Date()) + "%";
        if (0 == ids.size()) {
            mapList = trainMapper.getTrainRateStatistics(newYearString, null, orderBy, procode);
        } else {
            mapList = trainMapper.getTrainRateStatistics(newYearString, ids, orderBy, procode);
        }
        return mapList;
    }

    @Override
    public List<Map<String, String>> getTrainNames(String procode) {
        if (StrUtils.isBlank(procode)) {
            procode = null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        String newYearString = simpleDateFormat.format(new Date()) + "%";
        List<Map<String, String>> mapList = trainMapper.getTrainNames(newYearString, procode);
        return mapList;
    }

    @Override
    public List<Map<String, String>> getTrainingNumStatisticsByYear(String year, List<String> ids, String procode) {
        List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
        if (StrUtils.isBlank(procode)) {
            procode = null;
        }
        if (StrUtils.isBlank(year)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
            year = simpleDateFormat.format(new Date());
        }
        if (0 == ids.size()) {
            List<Map<String, String>> trainingNamesMapList = getTrainingNamesStatisticsByYear(year, procode);
            for (Map<String, String> map : trainingNamesMapList) {
                String trainid = map.get("TRAINID");
                Map<String, String> trainingNumMap = new HashMap<String, String>();
                trainingNumMap.put("trainid", trainid);
                trainingNumMap.put("trainname", map.get("TRAINNAME"));
                trainingNumMap.put("count", trainMapper.getTrainingNumByTrainid(trainid) + "");
                mapList.add(trainingNumMap);
                if (mapList.size() > 4) {
                    break;
                }
            }
        } else {
            for (String trainid : ids) {
                Map<String, String> trainingNumMap = new HashMap<String, String>();
                trainingNumMap.put("trainid", trainid);
                trainingNumMap.put("trainname", trainMapper.getTrainingNameByTrainid(trainid));
                trainingNumMap.put("count", trainMapper.getTrainingNumByTrainid(trainid) + "");
                mapList.add(trainingNumMap);
            }
        }
        return mapList;
    }

    @Override
    public List<Map<String, String>> getTrainingNamesStatisticsByYear(String year, String procode) {
        List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
        if (StrUtils.isBlank(procode)) {
            procode = null;
        }
        if (StrUtils.isBlank(year)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
            String newYearString = simpleDateFormat.format(new Date());
            mapList = trainMapper.getTrainingNamesByYear(newYearString, procode);
        } else {
            mapList = trainMapper.getTrainingNamesByYear(year, procode);
        }
        return mapList;
    }

    @Override
    public List<Map<String, String>> getSurtrainRecordCountByTrainplaceAndYear(String year, String procode) {
        List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
        if (StrUtils.isBlank(procode)) {
            procode = null;
        }
        if (StrUtils.isBlank(year)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
            year = simpleDateFormat.format(new Date());
        }

        List<String> trainbaseList = trainMapper.getTrainbaseByYear(year, procode);
        for (String trainbase : trainbaseList) {
            if(!StrUtils.isBlank(trainbase)){
                Map<String, String> trainingNumMap = new HashMap<String, String>();
                trainingNumMap.put("trainbase", trainbase);
                trainingNumMap.put("count", trainMapper.getSurtrainRecordCountByTrainbaseAndYear(trainbase, year, procode) + "");
                mapList.add(trainingNumMap);
                if (mapList.size() > 4) {
                    break;
                }
            }

        }
        return mapList;
    }

    @Override
    public List<Map<String, String>> getTeacherNumStatistics(String year, String procode) {
        List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
        if (StrUtils.isBlank(procode)) {
            procode = null;
        }
        if (StrUtils.isBlank(year)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
            year = simpleDateFormat.format(new Date());
        }

        List<String> trainbaseList = trainMapper.getTrainbaseByYear(year, procode);
        for (String trainbase : trainbaseList) {
            if(!StrUtils.isBlank(trainbase)) {
                Map<String, String> teacherNumMap = new HashMap<String, String>();
                teacherNumMap.put("trainbase", trainbase);
                teacherNumMap.put("type1Num", trainMapper.getType1NumByTrainbaseAndYear(trainbase, year) + "");
                teacherNumMap.put("type2Num", trainMapper.getType2NumByTrainbaseAndYear(trainbase, year) + "");
                mapList.add(teacherNumMap);
                if (mapList.size() > 4) {
                    break;
                }
            }
        }
        return mapList;
    }

    @Override
    public List<Map<String, String>> getTrainEvaluateStatistics(String year, List<String> ids, String procode) {
        List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
        if (StrUtils.isBlank(procode)) {
            procode = null;
        }
        if (StrUtils.isBlank(year)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
            year = simpleDateFormat.format(new Date());
        }

        if (0 == ids.size()) {
            List<String> cteTypenamesList = getCTETypenames(year, procode);
            List<Map<String, String>> cteNamesMapList = getCTENames(year, procode);
            for (Map<String, String> cteNamesMap : cteNamesMapList) {
                String id = cteNamesMap.get("ID");
                Map<String, String> map = new HashMap<String, String>();
                map.put("id", id);
                map.put("name", cteNamesMap.get("NAME"));
                List<Map<String, String>> cteMapList = trainMapper.getCTEByUID(year, id);
                for (int i = 0; i < cteTypenamesList.size(); i++) {
                    String cteTypename = cteTypenamesList.get(i);
                    if (!StrUtils.isBlank(cteTypename)) {
                        for (Map<String, String> cteMap : cteMapList) {
                            if (cteTypename.equals(cteMap.get("TYPENAME"))) {
                                map.put("typename" + i, cteMap.get("SCORE"));
                            }
                        }
                    }
                }
                for (int i = 0; i < cteTypenamesList.size(); i++) {
                    if (!map.containsKey("typename" + i)) {
                        map.put("typename" + i, "0");
                    }
                }
                mapList.add(map);
                if (mapList.size() > 4) {
                    break;
                }
            }
        } else {
            List<String> cteTypenamesList = getCTETypenames(year, procode);
            for (String id : ids) {
                Map<String, String> map = new HashMap<String, String>();
                map.put("id", id);
                map.put("name", trainMapper.getCTENameByUID(id));
                List<Map<String, String>> cteMapList = trainMapper.getCTEByUID(year, id);
                for (int i = 0; i < cteTypenamesList.size(); i++) {
                    String cteTypename = cteTypenamesList.get(i);
                    if (!StrUtils.isBlank(cteTypename)) {
                        for (Map<String, String> cteMap : cteMapList) {
                            if (cteTypename.equals(cteMap.get("TYPENAME"))) {
                                map.put("typename" + i, cteMap.get("SCORE"));
                            }
                        }
                    }
                }
                for (int i = 0; i < cteTypenamesList.size(); i++) {
                    if (!map.containsKey("typename" + i)) {
                        map.put("typename" + i, "0");
                    }
                }
                mapList.add(map);
            }
        }
        return mapList;
    }

    @Override
    public List<Map<String, String>> getCTENames(String year, String procode) {
        List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
        if (StrUtils.isBlank(procode)) {
            procode = null;
        }
        if (StrUtils.isBlank(year)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
            year = simpleDateFormat.format(new Date());
        }
        mapList = trainMapper.getCTENames(year, procode);
        return mapList;
    }

    @Override
    public List<Map<String, String>> getTrainDemandAnalysisStatistics(String procode) {
        List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
        if (StrUtils.isBlank(procode)) {
            procode = null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        String newYearString = simpleDateFormat.format(new Date());
        List<String> sidList = trainMapper.getTrainDemandIdByYear(newYearString, procode);
        for (String sid : sidList) {
            Map<String, String> map = new HashMap<String, String>();
            List<Map<String, Object>> trainDemandMapList = trainMapper.getTrainDemandByYear(newYearString, sid + "%");
            if (StrUtils.isBlank(procode)) {
                sid = sid + "0000";
            } else {
                sid = sid + "00";
            }
            map.put("provname", trainMapper.getNameByCode(sid));
            for (Map<String, Object> trainDemandMap : trainDemandMapList) {
                map.put("majortype" + trainDemandMap.get("MAJORTYPE"), trainDemandMap.get("PERSONNUM").toString());
            }
            if (!map.containsKey("majortype0")) {
                map.put("majortype0", "0");
            }
            if (!map.containsKey("majortype1")) {
                map.put("majortype1", "0");
            }
            if (!map.containsKey("majortype2")) {
                map.put("majortype2", "0");
            }
            mapList.add(map);
        }
        return mapList;
    }

    @Override
    public List<Map<String, String>> getSurveyorGapStatistics(String procode) {
        List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
        if (StrUtils.isBlank(procode)) {
            procode = null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        String newYearString = simpleDateFormat.format(new Date());
        List<String> scodeList = trainMapper.getYCSorgcodeByYear(newYearString, procode);
        for (String scode : scodeList) {
            Map<String, String> map = new HashMap<String, String>();
            List<Map<String, Object>> ycsgapMapList = trainMapper.getYCSgapByYear(newYearString, scode + "%");
            if (StrUtils.isBlank(procode)) {
                scode = scode + "0000";
            } else {
                scode = scode + "00";
            }
            map.put("provname", trainMapper.getNameByCode(scode));
            for (Map<String, Object> ycsgapMap : ycsgapMapList) {
                map.put("majortype" + ycsgapMap.get("MAJORTYPE"), ycsgapMap.get("YCSGAPNUM").toString());
            }
            if (!map.containsKey("majortype0")) {
                map.put("majortype0", "0");
            }
            if (!map.containsKey("majortype1")) {
                map.put("majortype1", "0");
            }
            if (!map.containsKey("majortype2")) {
                map.put("majortype2", "0");
            }
            mapList.add(map);
        }
        return mapList;
    }

    @Override
    public List<Map<String, String>> getTrainPlanningStatistics(String procode) {
        List<Map<String, String>> mapList = new ArrayList<Map<String, String>>();
        if (StrUtils.isBlank(procode)) {
            procode = null;
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
        String newYearString = simpleDateFormat.format(new Date());
        int newYearInt = Integer.parseInt(newYearString);
        for (int i = 0; i < 5; i++) {
            Map<String, String> map = new HashMap<String, String>();
            List<Map<String, Object>> trainPlanningMapList = trainMapper.getTrainPlanningByYear((newYearInt + i) + "", procode);
            map.put("year", newYearInt + i + "");
            for (Map<String, Object> trainPlanningMap : trainPlanningMapList) {
                map.put("majortype" + trainPlanningMap.get("MAJORTYPE"), trainPlanningMap.get("PERSONNUM").toString());
            }
            if (!map.containsKey("majortype0")) {
                map.put("majortype0", "0");
            }
            if (!map.containsKey("majortype1")) {
                map.put("majortype1", "0");
            }
            if (!map.containsKey("majortype2")) {
                map.put("majortype2", "0");
            }
            mapList.add(map);
        }
        return mapList;
    }

    @Override
    public List<String> getCTETypenames(String year, String procode) {
        List<String> mapList = new ArrayList<String>();
        if (StrUtils.isBlank(procode)) {
            procode = null;
        }
        if (StrUtils.isBlank(year)) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy");
            year = simpleDateFormat.format(new Date());
        }
        mapList = trainMapper.getCTETypenames(year, procode);
        return mapList;
    }

}
