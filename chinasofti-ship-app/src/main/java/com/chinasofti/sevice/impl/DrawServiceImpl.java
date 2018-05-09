package com.chinasofti.sevice.impl;

import com.chinasofti.domain.*;
import com.chinasofti.mapper.oracle.*;
import com.chinasofti.sevice.DrawService;
import com.limp.framework.utils.StrUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhangxiaojin on 2017/8/2.
 * 描述：图纸审查一张图
 */
@Service
public class DrawServiceImpl implements DrawService{
    @Resource
    DrawInfoMapper drawInfoMapper;
    @Resource
    ShipMapper shipMapper;
    @Resource
    DrawRepairMapper drawRepairMapper;
    @Resource
    DrawProcMapper drawProcMapper;
    @Resource
    DrawProc1Mapper drawProc1Mapper;
    @Resource
    DrawProc2Mapper drawProc2Mapper;
    @Resource
    DrawProc3Mapper drawProc3Mapper;
    @Resource
    DrawProc4Mapper drawProc4Mapper;
    @Resource
    ImageManagerMapper imageManagerMapper;
    //图纸审查基本信息
    @Override
    public Map<String, Object> getDrawCheckAllInfo(DrawInfo drawInfo) {
        Map<String,Object> map = new HashMap<>();
        DrawInfo drawInfoObj = getDrawInfo(drawInfo);
        map.put("drawinfo", drawInfoObj);

        int repairCount = getShipRepairCount(drawInfo);
        map.put("repairCount", repairCount);

        int shipCount = getShipCount(drawInfo);
        map.put("shipCount",shipCount);

        return map;
    }

    //应用图纸建造图纸列表
    @Override
    public Map<String, Object> shipCountList(DrawInfo drawInfo) {
        Map<String,Object> map = new HashMap<>();
        ShipExample shipExample = new ShipExample();
        ShipExample.Criteria criteria = shipExample.createCriteria();
        if(!StrUtils.isBlank(drawInfo.getDrawno())){
            criteria.andDrawnoEqualTo(drawInfo.getDrawno());
        }
        List<Ship> shipCountList = shipMapper.selectByExample(shipExample);
        map.put("shipCountList", shipCountList);
        List<String> imgList = new ArrayList<>();
        for (int i = 0; i < shipCountList.size(); i++) {
                ImageManagerExample imageManagerExample = new ImageManagerExample();
            ImageManagerExample.Criteria imageManagerExampleCriteria = imageManagerExample.createCriteria();
            if(!StrUtils.isBlank(shipCountList.get(i).getShipcode())){
                imageManagerExampleCriteria.andRefidEqualTo(shipCountList.get(i).getShipcode());
            }
            List<ImageManager> imageManagers = imageManagerMapper.selectByExample(imageManagerExample);
            if(!StrUtils.isBlank(imageManagers)&& imageManagers.size()>0){
                imgList.add(imageManagers.get(0).getUrl()+imageManagers.get(0).getPath());
            }else {
//                imgList.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502082088738&di=58781b40cc754f86058b664fe6d83c00&imgtype=0&src=http%3A%2F%2Fpic.58pic.com%2F58pic%2F14%2F27%2F47%2F59i58PICCvj_1024.jpg");
            }
        }
        imgList.add("../../resources/style/images/draw01.jpg");
        imgList.add("../../resources/style/images/draw02.jpg");
        imgList.add("../../resources/style/images/draw03.jpg");
        imgList.add("../../resources/style/images/draw04.jpg");
        map.put("imaList",imgList);
        return map;
    }

    //图纸修改列表
    @Override
    public Map<String, Object> shipRepairList(DrawInfo drawInfo) {
        Map<String,Object> map = new HashMap<>();
        List<DrawRepair> listByProcUid = getListByProcUid(drawInfo);
        List<Object> list = new ArrayList<>();
        if(listByProcUid != null & listByProcUid.size() >0){
            for (int i = 0;i<listByProcUid.size();i++){
                DrawRepairExample drawRepairExample = new DrawRepairExample();
                drawRepairExample.setOrderByClause("CDR_REPTIME ASC");
                DrawRepairExample.Criteria criteria = drawRepairExample.createCriteria();
                criteria.andProcuidEqualTo(listByProcUid.get(i).getProcuid());
                //criteria.andReptypeEqualTo("2");//复查
                List<DrawRepair> drawRepairs = drawRepairMapper.selectByExample(drawRepairExample);
                list.add(drawRepairs);
            }
        }
        map.put("drawRepairList",list);
        return map;
    }

    //图纸审查历程
    @Override
    public Map<String, Object> drawProList(DrawInfo drawInfo) {
        Map<String,Object> map = new HashMap<>();
        List<DrawProc> drawProcUIDs = getDrawProcUIDs(drawInfo);
        List<Map<String,Object>> list  = new ArrayList<>();
        if(drawProcUIDs != null && drawProcUIDs.size()>0){
            for (int i = 0; i < drawProcUIDs.size(); i++) {
                Map<String, Object> drawProcs = getDrawProcs(drawProcUIDs.get(i).getUid());
                list.add(drawProcs);
            }
        }
        map.put("drawProList", list);
        return map;
    }
    //根据历程id去查询四个阶段的历程
    public Map<String,Object> getDrawProcs(String procUID){
        Map<String,Object> map = new HashMap<>();
        //历程1
        DrawProc1Example drawProc1Example = new DrawProc1Example();
        DrawProc1Example.Criteria criteria1 = drawProc1Example.createCriteria();
        if(!StrUtils.isBlank(procUID)){
            criteria1.andProcuidEqualTo(procUID);
        }
        List<DrawProc1> drawProc1s = drawProc1Mapper.selectByExample(drawProc1Example);
        if(drawProc1s != null && drawProc1s.size() >0){
            map.put("proc1",drawProc1s.get(0));
        }
        //历程2
        DrawProc2Example drawProc2Example = new DrawProc2Example();
        DrawProc2Example.Criteria criteria2 = drawProc2Example.createCriteria();
        if (!StrUtils.isBlank(procUID)) {
            criteria2.andProcuidEqualTo(procUID);
        }
        List<DrawProc2> drawProc2s = drawProc2Mapper.selectByExample(drawProc2Example);
        if (drawProc2s != null && drawProc2s.size() > 0) {
            map.put("proc2", drawProc2s.get(0));
        }
        //历程3
        DrawProc3Example drawProc3Example = new DrawProc3Example();
        DrawProc3Example.Criteria criteria3 = drawProc3Example.createCriteria();
        if (!StrUtils.isBlank(procUID)) {
            criteria3.andProcuidEqualTo(procUID);
        }
        List<DrawProc3> drawProc3s = drawProc3Mapper.selectByExample(drawProc3Example);
        if (drawProc3s != null && drawProc3s.size() > 0) {
            map.put("proc3", drawProc3s.get(0));
        }
        //历程4
        DrawProc4Example drawProc4Example = new DrawProc4Example();
        DrawProc4Example.Criteria criteria4 = drawProc4Example.createCriteria();
        if (!StrUtils.isBlank(procUID)) {
            criteria4.andProcuidEqualTo(procUID);
        }
        List<DrawProc4> drawProc4s = drawProc4Mapper.selectByExample(drawProc4Example);
        if (drawProc4s != null && drawProc4s.size() > 0) {
            map.put("proc4", drawProc4s.get(0));
        }

        return  map;

    }


    //审查历程次数列表
    public List<DrawProc> getDrawProcUIDs(DrawInfo drawInfo){
        DrawProcExample drawProcExample = new DrawProcExample();
        drawProcExample.setOrderByClause("CDP_APPRTIME ASC");
        DrawProcExample.Criteria criteria = drawProcExample.createCriteria();
        if(!StrUtils.isBlank(drawInfo.getDrawno())){
            criteria.andDrawnoEqualTo(drawInfo.getDrawno());
        }
        List<DrawProc> drawProcs = drawProcMapper.selectByExample(drawProcExample);
        return drawProcs;
    }

    //图纸修改拿到图纸审查流程唯一id列表
    public List<DrawRepair> getListByProcUid(DrawInfo drawInfo){
       DrawRepairExample drawRepairExample = new DrawRepairExample();
       drawRepairExample.setOrderByClause("CDR_REPTIME ASC");
        DrawRepairExample.Criteria criteria = drawRepairExample.createCriteria();
       if(!StrUtils.isBlank(drawInfo.getDrawno())){
           criteria.andDrawnoEqualTo(drawInfo.getDrawno());
       }
       criteria.andReptypeEqualTo("1");//初审
        List<DrawRepair> drawRepairs = drawRepairMapper.selectByExample(drawRepairExample);
        return drawRepairs;
    }
    //获取图纸基本信息
    public DrawInfo getDrawInfo(DrawInfo drawInfo){
        DrawInfoExample drawInfoExample = new DrawInfoExample();
        DrawInfoExample.Criteria criteria = drawInfoExample.createCriteria();
        if (!StrUtils.isBlank(drawInfo.getDrawno())) {
            criteria.andDrawnoEqualTo(drawInfo.getDrawno());
        }
        List<DrawInfo> drawInfos = drawInfoMapper.selectByExample(drawInfoExample);

        return drawInfos.size()>0?drawInfos.get(0):null;
    }
    //图纸修改次数
    public int getShipRepairCount(DrawInfo drawInfo){
        DrawRepairExample drawRepairExample = new DrawRepairExample();
        DrawRepairExample.Criteria criteria = drawRepairExample.createCriteria();
        criteria.andReptypeEqualTo("1");
        if(!StrUtils.isBlank(drawInfo.getDrawno())){
            criteria.andDrawnoEqualTo(drawInfo.getDrawno());
        }
        int i = drawRepairMapper.countByExample(drawRepairExample);
        return i;
    }

    //应用图纸建造渔船数量
    public int getShipCount(DrawInfo drawInfo){
        ShipExample shipExample = new ShipExample();
        ShipExample.Criteria criteria = shipExample.createCriteria();
        if(!StrUtils.isBlank(drawInfo.getDrawno())){
            criteria.andDrawnoEqualTo(drawInfo.getDrawno());
        }
        int i = shipMapper.countByExample(shipExample);
        return i;
    }
}
