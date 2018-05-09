package com.chinasofti.action;

import com.chinasofti.common.Const;
import com.chinasofti.domain.*;
import com.chinasofti.sevice.GISService;
import com.limp.framework.boss.service.CommonService;
import com.limp.framework.core.abs.AbstractAction;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.constant.ResultMsg;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * GIS加载
 * Created with IntelliJ IDEA.
 * User: chen
 * Date: 17-9-20
 * Time: 下午3:14
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping("/gis")
public class GisAction extends AbstractAction {

    @Autowired
    private GISService gisService;

    private int defalutRow =10;

    private static Logger log= Logger.getLogger(GisAction.class);
    @Autowired
    private CommonService commonService;


    @Access(login = true,privilege = false)
    @RequestMapping(value ="toGisMain")
    public String toGisMain(Model model ,String cate){
        model.addAttribute("urlList",gisService.getUrlByCate(cate));
        return "gis/gis_main";
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="constructionOrg")
    public String toConstructionOrg(Model model ){
        return "gis/gis_org";
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="gisTemplate")
    public String toTemplate(Model model ){
        return "gis/gis_template";
    }

    /**
     * 验船师人员匹配分布
     * @param model
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="toGisSurveyor")
    public String toGisSurveyor(Model model ){
        return "gis/gis_surveyor";
    }

    /**
     * 验船师能力分布gis_historyTraining
     * @param model
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="toGisSurAblity")
    public String toGisSurveyorAblity(Model model ){
        return "gis/gis_surveyorAblity";
    }

    /**
     * 验船师培训分布(历史培训)
     * @param model
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="toGisHistoryTrain")
    public String toGisHistoryTrain(Model model ){
        return "gis/gis_historyTraining";
    }

    /**
     * 验船师培训分布(当前培训)
     * @param model
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="toGisCurrentTrain")
    public String toGisCurrentTrain(Model model ){
        return "gis/gis_currentTraining";
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="toGnMap")
    public String toGnMap(Model model ){
        return "gis/gis_gnShip";
    }

    /**
     * 产品检验企业能力分布
     * @param model
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="toGisProduction")
    public String toGisProduction(Model model ){
        return "gis/gis_productionTest";
    }

    /**
     * 产品制造企业能力分布
     * @param model
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="toGisProCreate")
    public String toGisProCreate(Model model ){
        return "gis/gis_productCreate";
    }

    /**
     *筏站能力分布
     * @param model
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="toGisRaftStation")
    public String toGisRaftStation(Model model ){
        return "gis/gis_raftStation";
    }

    /**
     * 检测机构能力分布
     * @param model
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="toCheckOrg")
    public String toCheckOrg(Model model ){
        return "gis/gis_checkOrg";
    }

    /**
     * GMDSS维修站能力分布
     * @param model
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="toGisGMDSS")
    public String toGisGMDSS(Model model ){
        return "gis/gis_GMDSS";
    }


    /**
     * 产品类型分布
     * @param model
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="toProductType")
    public String toProductType(Model model ){
        return "gis/gis_productType";
    }

    /**
     * 产品监督抽查分析
     * @param model
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="toProChecAnalysis")
    public String toProChecAnalysis(Model model ){
        return "gis/gis_proCheAnalysis";
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="toDesignCompany")
    public String toDesignCompany(Model model ){
        return "gis/gis_designCompany";
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="toShipRepair")
    public String toShipRepair(Model model ){
        return "gis/gis_shipRepair";
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="toDrawingCheck")
    public String toDrawingCheck(Model model ){
        return "gis/gis_blueprintReview";
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="toOcean")
    public String toOcean(Model model ){
        return "gis/gis_ocean";
    }
    @Access(login = true,privilege = false)
    @RequestMapping(value ="toGisSave")
    public String toGisSave(Model model ){
        return "gis/gis_save";
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="toGisSafe")
    public String toGisSafe(Model model ){
        return "gis/gis_safe";
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="toStandScore")
    public String toStandScore(Model model ){
        return "gis/gis_standardScore_gn";
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="toSafeScore")
    public String toSafeScore(Model model ){
        return "gis/gis_safeScore_gn";
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="toFirPasRate")
    public String toFirPasRate(Model model ){
        return "gis/gis_firPasRate_gn";
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="toCheckStatus")
    public String toCheckStatus(Model model ){
        return "gis/gis_checkStatus_gn";
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="toShipAge")
    public String toShipAge(Model model ){
        return "gis/gis_shipAge_gn";
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="toYYShipAge")
    public String toYYShipAge(Model model ){
        return "gis/gis_shipAge";
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="toYYShipState")
    public String toYYShipState(Model model ){
        return "gis/gis_shipState";
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="toYYFirPasRate")
    public String toYYFirPasRate(Model model ){
        return "gis/gis_firPassRate";
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="toGisTemp")
    public String toGisTemp(Model model ){
        return "gis/gis_temp";
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="toOcean3d")
    public String toOcean3d(Model model ){
        return "gis/ocean3d";
    }

//------------------------------------------------------检验机构能力分布begin---------------------------------
    /**
     * 获取检验机构坐标及基本信息
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getConstructionOrg",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getConstructionOrg(OrganInfo org){
        Object obj = this.gisService.getConstructionOrg(org);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, obj,"").getJson(commonService);
    }

    /**
     * 获取各省机构统计信息
     * @param org
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getOrgData",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getOrgData(OrganInfo org){
        Map map= this.gisService.getOrgData(org);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson(commonService);
    }

    /**
     * 各省机构能力得分分布图 数据接口
     * @param org
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getOrgData1",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getOrgData1(OrganInfo org){
        List list= this.gisService.getOrgData1(org);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     * 各省机构数量 数据接口
     * @return
     */
    @RequestMapping(value ="getOrgData2",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getOrgData2(){
        List list= this.gisService.getOrgData2();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }
//-----------------------------------------------------检验机构能力分布end-------------------------------------


//------------------------------------------------------验船师能力分布begin---------------------------------

    /**
     *各省机构数量统计 接口
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getSurAbilityData1",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getSurAbilityData1(){
        List list= this.gisService.getSurAbilityData1();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     *各省验船师能力得分分布图接口
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getSurAbilityData2",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getSurAbilityData2(OrganInfo org){
        List list= this.gisService.getSurAbilityData2(org);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     * 专业分类统计验船师数量  数据接口
     * @param org
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getSurAbilityData3",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getSurAbilityData3(OrganInfo org){
        Map map= this.gisService.getSurAbilityData3(org);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson();
    }

//------------------------------------------------------验船师能力分布end---------------------------------

//------------------------------------------------------验船师人员匹配分布begin---------------------------------

    /**
     * 验船师数量匹配分布图数据接口
     * @param org
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getGisSurData1",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getGisSurData1(OrganInfo org){
        List list= this.gisService.getGisSurData1(org);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     * 验船师数量的详细统计信息 数据接口
     * @param org
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getGisSurData2",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getGisSurData2(OrganInfo org){
        List list = this.gisService.getGisSurData2(org);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }
//------------------------------------------------------验船师人员匹配分布end---------------------------------

//------------------------------------------------------验船师培训分布begin---------------------------------

    /**
     * 各省渔船检验机构的验船师培训人次数量 数据接口
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getGisTrainData1",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getGisTrainData1(){
        List list = this.gisService.getGisTrainData1();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     * 省验船师培训人次分布的饼状图 数据接口
     * @param org
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getGisTrainData2",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getGisTrainData2(OrganInfo org){
        List list = this.gisService.getGisTrainData2(org);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     * 验船师培训人次
     * @param org
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getGisTrainData3",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getGisTrainData3(OrganInfo org){
        Map map = this.gisService.getGisTrainData3(org);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson();
    }

    /**
     * 培训班的详细信息
     * @param orgcode
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getGisTrainData4",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getGisTrainData4(String orgcode){
        List list = this.gisService.getGisTrainData4(orgcode);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     * 培训班点位信息
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getGisTrainData5",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getGisTrainData5(){
        List list = this.gisService.getGisTrainData5();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }
    /**
     * 按照名字查询培训班
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="findTrainByName",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String findTrainByName(String name){
        List list = this.gisService.findTrainByName(name);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }
//------------------------------------------------------验船师培训分布end---------------------------------

//------------------------------------------------------产品检验业务统计begin---------------------------------

    /**
     * 各省渔船检验机构产品检验数量
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getProductCheckData1",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getProductCheckData1(){
        List list = this.gisService.getProductCheckData1();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     *数据接口:产品类别分类统计各省渔船检验机构产品检验数量
     * @param org
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getProductCheckData2",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getProductCheckData2(OrganInfo org){
        Map map = this.gisService.getProductCheckData2(org);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson();
    }
//------------------------------------------------------产品检验业务统计end---------------------------------

//------------------------------------------------------产品制造企业能力分布begin---------------------------------

    /**
     * 数据接口:产品制造企业位置及基本信息
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getProductCreateData1",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getProductCreateData1(String name){
        List list = this.gisService.getProductCreateData1(name);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     *数据接口:全国各省制造企业数量
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getProductCreateData2",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getProductCreateData2(){
        List list = this.gisService.getProductCreateData2();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     * 数据接口:产品制造企业能力分布的饼状图
     * @param org
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getProductCreateData3",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getProductCreateData3(OrganInfo org){
        List list= this.gisService.getProductCreateData3(org);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     * 产品制造企业数量
     * @param uid
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getProductCreateData4",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getProductCreateData4(String uid){
        Map map = this.gisService.getProductCreateData4(uid);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson(commonService);
    }
//------------------------------------------------------产品制造企业能力分布end---------------------------------
//------------------------------------------------------产品型号统计begin---------------------------------

    /**
     * 数据接口:各省产品认可型号数量
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getProductTypeData1",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getProductTypeData1(){
        List list= this.gisService.getProductTypeData1();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     * 数据接口:各省产品认可型号数量统计
     * @param org
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getProductTypeData2",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getProductTypeData2(OrganInfo org){
        Map map = this.gisService.getProductTypeData2(org);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson();
    }
//------------------------------------------------------产品型号统计end---------------------------------

//------------------------------------------------------筏站能力分布begin---------------------------------

    /**
     * 数据接口:筏站点位分布
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getRaftStationData1",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getRaftStationData1(String name){
        List list = this.gisService.getRaftStationData1(Const.RAFT_ENT_CATE ,name);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     * 数据接口:筏站维修产品数量统计
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getRaftStationData2",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getRaftStationData2(EntInfo ent){
        Map map = this.gisService.getRaftOrGMDSSData(ent,Const.PRO_REPAIR_RAFT);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson();
    }
//------------------------------------------------------筏站能力分布end---------------------------------
//------------------------------------------------------GMDSS维修站能力分布begin---------------------------------

    /**
     * 数据接口:GMDSS维修产品数量统计
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getGMDSSData1",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getGMDSSData1(String name){
        List list = this.gisService.getRaftStationData1(Const.GMDSS_ENT_CATE,name);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }
    /**
     * 数据接口:GMDSS点位分布
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getGMDSSData2",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getGMDSSData2(EntInfo ent){
        Map map = this.gisService.getRaftOrGMDSSData(ent,Const.PRO_REPAIR_GMDSS);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson();
    }
//------------------------------------------------------GMDSS维修站能力分布end---------------------------------
//------------------------------------------------------检测机构能力分布begin---------------------------------

    /**
     * 数据接口:检测机构点位分布
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getCheckOrgData1",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getCheckOrgData1(String name){
        List list = this.gisService.getRaftStationData1("7",name);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     * 数据接口:检测机构点位分布
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getCheckOrgData2",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getCheckOrgData2(EntInfo ent){
        Map map = this.gisService.getCheckOrgData2(ent);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson();
    }

//------------------------------------------------------检测机构能力分布end---------------------------------
//------------------------------------------------------产品监督抽查分析begin---------------------------------

    /**
     * 数据接口:各企业抽查情况点位
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getProCheckAnalysis1",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getProCheckAnalysis1(){
        Map map = this.gisService.getProCheckAnalysis1();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson();
    }

    /**
     * 被抽查企业的详细信息
     * @param ent
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getProCheckAnalysis2",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getProCheckAnalysis2(EntInfo ent){
        Map map = this.gisService.getProCheckAnalysis2(ent);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson();
    }

    /**
     * 各省检验工作完成率
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getProCheckAnalysis3",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getProCheckAnalysis3(){
        List list = this.gisService.getProCheckAnalysis3();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     * 数据接口:各类企业抽查的进度柱状图
     * @param uid
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getProCheckAnalysis4",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getProCheckAnalysis4(String uid){
        Map map = this.gisService.getProCheckAnalysis4(uid);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson();
    }
//------------------------------------------------------产品监督抽查分析end---------------------------------

//------------------------------------------------------船籍港begin---------------------------------

    /**
     * 获取船籍港位置信息
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getShipPortPos",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getShipPortPos(){
        List list = this.gisService.getShipPortPos();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }
//------------------------------------------------------船籍港end---------------------------------

//------------------------------------------------------远洋渔船企业分布begin---------------------------------


    /**
     * 人船握手页面初始化信息
     * @param
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="surShipHs",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String surShipHs(String bYear,String eYear){
        List list = this.gisService.getSurShipHs(bYear,eYear);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson(commonService);
    }
    /**
     * 远洋渔船高级查询
     * @param param
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="queryOceanShip",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String queryOceanShip(OceanShipParam param){
        List list = this.gisService.queryOceanShip(param);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson(commonService);
    }

    /**
     * 远洋渔船企业点位信息
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getOceanShipData1",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getOceanShipData1(){
        List list = this.gisService.getOceanShipData1();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     * 企业的渔船数量
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getOceanShipData2",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getOceanShipData2(String id){
        Map map = this.gisService.getOceanShipData2(id);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson();
    }

    /**
     * 远洋渔船点位
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getOceanShipData3",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getOceanShipData3(){
        List list = this.gisService.getOceanShipData3();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }
    /**
     * 远洋渔船综合安全指数分布
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getOceanShipData4",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getOceanShipData4(){
        Map map = this.gisService.getOceanShipData4();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson();
    }

    /**
     * 远洋渔船点位信息和一次检验合格率
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getOceanShipData5",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getOceanShipData5(){
        Map map = this.gisService.getOceanShipData5();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson();
    }

    /**
     * 渔船船龄分布
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getOceanShipData6",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getOceanShipData6(){
        Map map = this.gisService.getOceanShipData6();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson();
    }

    /**
     * 渔船检验状态分布
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getOceanShipData7",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getOceanShipData7(){
        Map map = this.gisService.getOceanShipData7();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson();
    }

    /**
     * 境外检验点数据接口
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getOceanShipData8",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getOceanShipData8(){
        List list = this.gisService.getOceanShipData8();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     *获取检验团组的信息
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getOceanShipData9",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getOceanShipData9(String orgcode){
        List list = this.gisService.getOceanShipData9(orgcode);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     * 获取远洋渔船信息
     * @param shipcode
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getOceanShipData10",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getOceanShipData10(String shipcode){
        Map map = this.gisService.getOceanShipData10(Const.YY_POS_TAB,shipcode);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson();
    }

    /**
     * 境外检验点检验的渔船数量
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getOceanShipData11",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getOceanShipData11(Pager pager,String orgcode){
        pager = new Pager(pager.getPage(), defalutRow);
        pager = this.gisService.getOceanShipData11(pager,orgcode);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, pager,"").getJson();
    }
//------------------------------------------------------远洋渔船企业分布end---------------------------------
//------------------------------------------------------设计企业能力分布begin---------------------------------

    /**
     * 设计企业点位能力分布
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getDesignEntData1",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getDesignEntData1(){
        List list = this.gisService.getDesignEntData1();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    @Access(login = true,privilege = false)
    @RequestMapping(value ="getDesignEntData2",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getDesignEntData2(String pid){
        Map map = this.gisService.getDesignEntData2(pid);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson();
    }
//------------------------------------------------------设计企业能力分布end---------------------------------
//------------------------------------------------------渔船修造企业能力分布begin---------------------------------

    /**
     * 渔船修造企业点位能力分布
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getRepairEntData1",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getRepairEntData1(){
        List list = this.gisService.getRepairEntData1();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     * 各省渔船修造企业数量
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getRepairEntData2",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getRepairEntData2(){
        List list = this.gisService.getRepairEntData2();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }

    /**
     * 各省渔船修造企业能力分布的饼状图数据接口
     * @param uid 省份编码
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getRepairEntData3",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getRepairEntData3(String uid){
        List list = this.gisService.getRepairEntData3(uid);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }


    /**
     *渔船修造企业的统计信息
     * @param uid
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getRepairEntData4",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getRepairEntData4(String uid){
        Map map = this.gisService.getRepairEntData4(uid);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson();
    }

//------------------------------------------------------渔船修造企业能力分布end---------------------------------
//------------------------------------------------------图纸审查统计分析begin---------------------------------

    /**
     * 各省渔船检验机构的图纸审查数量
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getDrawCheck1",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getDrawCheck1(){
        Map map = this.gisService.getDrawCheck1();
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson();
    }

    /**
     * 各省图纸申请情况统计
     * @param uid
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getDrawCheck2",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getDrawCheck2(String uid){
        List list = this.gisService.getDrawCheck2(uid);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, list,"").getJson();
    }
//------------------------------------------------------图纸审查统计分析end---------------------------------

//------------------------------------------------------国内海洋渔船begin---------------------------------

    /**
     * 获取屏幕内船位信息
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getInGnShipPos",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getInGnShipPos(GNShipPos pos){
        List dataList = this.gisService.getInShipPos(pos,Const.GN_POS_TAB);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, dataList,"").getJson();
    }

    /**
     * 获取屏幕远洋渔船船位位信息
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getInYYShipPos",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getInYYShipPos(YYShipPos pos){
        List dataList = this.gisService.getInShipPos(pos,Const.YY_POS_TAB);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, dataList,"").getJson();
    }

    /**
     * 获取国内渔船详细信息
     * @param shipcode
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getGNShipDetail",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getGNShipDetail(String shipcode){
        Map map = this.gisService.getOceanShipData10(Const.GN_POS_TAB,shipcode);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, map,"").getJson();
    }

    /**
     * 获取国内渔船轨迹数据
     * @param pos
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getGNShipTrack",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getGNShipTrack(GNShipPos pos){
        List dataList = this.gisService.getShipTrack(pos,Const.GN_POS_TAB);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, dataList,"").getJson();
    }

    /**
     * 获取远洋渔船轨迹数据
     * @param pos
     * @return
     */
    @Access(login = true,privilege = false)
    @RequestMapping(value ="getYYShipTrack",produces = "text/plain;charset=UTF-8")
    public @ResponseBody String getYYShipTrack(YYShipPos pos){
        List dataList = this.gisService.getShipTrack(pos,Const.YY_POS_TAB);
        return new Result(ResultCode.SUCCESS.toString(), ResultMsg.SUCCESS, dataList,"").getJson();
    }
//------------------------------------------------------国内海洋渔船end---------------------------------
}
