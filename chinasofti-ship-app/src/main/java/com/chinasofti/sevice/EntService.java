package com.chinasofti.sevice;

import com.chinasofti.domain.*;
import com.limp.framework.core.bean.Pager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-4-27
 * Time: 下午4:47
 * To change this template use File | Settings | File Templates.
 */
public interface EntService {

    //基础接口：获取企业信息
    public EntInfo getEntInfo(EntInfo ent);

    //接口2：获取主页所有信息
    public GmdssAllInfo getGmdssAllInfo(EntInfo ent);

    //接口3：Gmdss装船数量列表
    public List<ProductCheck> getGmdssShipList(EntInfo ent);

    //接口4：筏站检修期内救生筏列表
    public Pager getRoftInTimeList(EntInfo ent, Pager pager);

    //接口5：产品制造企业：出厂检验产品列表
    public List<ProductCheck> getOutCheckProductList(EntInfo ent);

    //接口6：分页接口1：gmdss：维修设备；筏站：修筏；检测机构：检测产品
    public Pager<ProductRepair> getListByPage1(EntInfo entInfo, Pager pager, String orderName, String orderType, String type);

    //接口7：分页接口2：产品制造企业：产品认可型号
    public Pager<ProCheckList> getListByPage2(EntInfo entInfo, Pager pager, String orderName, String orderType);

    //接口8：监督抽查合格率列表 弹窗三
    public Map getCheckPercentList(Pager pager, EntInfo entInfo, ProductCheck productCheck);

    //获取弹窗一的年份和数量
    public Map<String, Object> getCountByYear(EntInfo entInfo, String type, String beginTime, String endTime);

    //累计检测产品数目列表
    public Map<String,Object> getCheckList(Pager pager, EntInfo entInfo,  ProductCheck productCheck);

    //产品制造企业，产品检验合格率列表
    public Map<String,Object> getCpzzPercentList(Pager pager, EntInfo entInfo, ProductCheck productCheck);

    //获取产品认可型号
    public Map<String, Object> getCpzzTypes(EntInfo entInfo, String which,String name);

    //分页接口  productcheck表
    public Pager<ProductCheck> getListByPage3(EntInfo entInfo, Pager page,String orderName,String orderType,String type1,String type2);

    //营业执照
    public String getCompanyPicture(EntInfo entInfo);
    //接口9：获取维修企业一张图页面的基本信息
    public Map<String,Object> getRepairEntInfo(EntInfo ent);

    //接口10：获取维修渔船信息
    public Pager getRepairShipInfo(EntInfo ent, Pager pager, String shipName);

    //获取维修渔船分类统计信息
    List<Map<String,Object>> getShipRepairPercent(EntInfo ent, String type);

    //获取渔船首次维修后一次检验合格率(按年分组)
    Map getFirstPassGroupRate(EntInfo ent, String beginYear, String endYear);

    //得到维修企业每年的渔船维修数量
    Map<String, Object> getRepairTimesGroupYear(EntInfo ent, String beginYear, String endYear);

    //得到企业分级信息列表
    Pager<EntClass> getEntClassList(EntInfo ent, Pager pager);

    /*******************************设计单位************************/
    //获取设计单位一张图页面的基本信息
    Map<String,Object> getDrawEntInfo(EntInfo ent);

    //渔船维修记录下载
    void repairRecordDownload(HttpServletResponse response, HttpServletRequest request, String fid);

    //获取设计图纸列表
    Pager getDrawInfoList(EntInfo ent,Pager pager,String keyWord);

    //获取图纸建造的渔船信息
    Pager getDrawBuildList(EntInfo ent, Pager pager, String keyWord);

    //获取图纸通过率
    List getDrawPassRate(EntInfo ent);

    /************************************修造企业******************************/
    //获取修造企业页面基本信息
    Map<String,Object> getDrawBuildEntInfo(EntInfo ent);

    //获取修造企业建造的渔船信息
    Pager getBuildShipInfo(EntInfo ent, Pager pager, String shipName);

    //获取企业建造渔船饼图信息
    List<Map<String,Object>> getShipBuildPercent(EntInfo ent, String type);

    //获取渔船建造后一次检验合格率
    List<Map<String,Object>> getBuildFirstPassRate(EntInfo ent);

    //获取修造企业建造的渔船数量和一次检验合格率
    Map getBuildNumsGroupYear(EntInfo ent, String beginYear, String endYear);

    //获取修造企业列表
    Pager<Map<String,Object>> getEnt3ListByOrgcode(EntInfo ent, Pager page);
    //获取检测机构列表
    Pager<Map<String,Object>> getEnt7ListByOrgcode(EntInfo ent, Pager page);
    //GMDSS客户评价列表
    Pager getComments(Pager pager,EntInfo ent, String commcate);

    //获取产品检验列表
    Pager getProductCheckList(Pager pager, EntInfo ent, ProductCheck productCheck);

    //获取示范渔船图片和渔船信息
    List getExampleShipPic(EntInfo entInfo,String typeNum);

    //查询该模型的所有子类
    public List<Capacity> getModelCapacitList(Capacity capacity);

    //产品制造企业:产品检验合格率折线图数据接口
    Map getCpzzPercent(EntInfo ent, ProductCheck productCheck, String bYear, String eYear);

    //检验工作完成情况:渔业船舶检验，图纸审查，船用产品检验
    Map<String,Object> getJygzwcqk(String orgCode,String startY,String endY);
}
