package com.chinasofti.sevice.impl;

import com.chinasofti.common.Const;
import com.chinasofti.domain.*;
import com.chinasofti.mapper.oracle.*;
import com.chinasofti.sevice.EntService;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.utils.StrUtils;
import org.apache.commons.collections.map.HashedMap;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-4-27
 * Time: 下午4:50
 * To change this template use File | Settings | File Templates.
 */
@Service
public class EntServiceImpl implements EntService {
    private static Logger log = Logger.getLogger(EntServiceImpl.class);

    @Resource
    private EntInfoMapper entInfoMapper;
    @Resource
    private EntInfoExtGmdssMapper entInfoExtGmdssMapper;
    @Resource
    private ProductRepairMapper productRepairMapper;
    @Resource
    private ProductCheckMapper productCheckMapper;
    @Resource
    private DrawCheckMapper drawCheckMapper;
    @Resource
    private ImageManagerMapper imageManagerMapper;
    @Resource
    private EntProHistoryMapper entProHistoryMapper;
    @Resource
    private CommentMapper commentMapper;
    @Resource
    private ProCheckListMapper proCheckListMapper;
    @Resource
    private EntInfoExtOneMapper entInfoExtOneMapper;
    @Resource
    private EntInfoExtRoftMapper entInfoExtRoftMapper;
    @Resource
    private EntInfoExtCheckOrgMapper entInfoExtCheckOrgMapper;
    @Resource
    private CertProHistoryMapper certProHistoryMapper;
    @Resource
    private ShipRepairMapper shipRepairMapper;
    @Resource
    private ShipMapper shipMapper;
    @Resource
    private EntInfoExtRepairMapper entInfoExtRepairMapper;
    @Resource
    private EntClassMapper entClassMapper;
    @Resource
    private DrawInfoMapper drawInfoMapper;
    @Resource
    private DocumentManagerMapper documentManagerMapper;
    @Resource
    private EntInfoExtRepairBuildMapper entInfoExtRepairBuildMapper;
    @Resource
    private ShipCheckMapper shipCheckMapper;
    @Resource
    private CapacityMapper capacityMapper;
    //接口1：获取企业信息基本表
    @Override
    public EntInfo getEntInfo(EntInfo ent) {
        EntInfoExample entInfoExample = new EntInfoExample();
        EntInfoExample.Criteria entInfoCriteria = entInfoExample.createCriteria();

        if (!StrUtils.isBlank(ent.getRegistnum())) {
            entInfoCriteria.andPidEqualTo(ent.getRegistnum());
        }
        if (!StrUtils.isBlank(ent.getPid())) {
            entInfoCriteria.andPidEqualTo(ent.getPid());
        }
        //企业名称
        if (!StrUtils.isBlank(ent.getEntname())) {
            entInfoCriteria.andEntnameEqualTo(ent.getEntname());
        }
        //企业注册号
        //if (!StrUtils.isBlank(ent.getRegistnum())) {
        //    entInfoCriteria.andRegistnumEqualTo(ent.getRegistnum());
        //}

        //状态为2或null为有效数据，状态为12的是测试数据
        entInfoCriteria.andIsNullOrIn();

        List<EntInfo> entInfos = entInfoMapper.selectByExample(entInfoExample);
        return entInfos.size() > 0 ? entInfos.get(0) : null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    //接口2：获取页面所有展示信息
    @Override
    public GmdssAllInfo getGmdssAllInfo(EntInfo ent) {
        GmdssAllInfo gmdssAllInfo = new GmdssAllInfo();
        //企业基本信息
        EntInfo entInfo = getEntInfo(ent);
        if(entInfo == null){
            return gmdssAllInfo;
        }
        gmdssAllInfo.setEntInfo(entInfo);
        //图片展示  typenum:哪一类的图片
        List<String> pictures = getPictures(entInfo, null,"1");
        //pictures.clear();
        //pictures.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502332224&di=41e9debb04540499783f26bbca5987cd&imgtype=jpg&er=1&src=http%3A%2F%2Fwww.chinazy.org%2Fupfile%2F20110217%2F02171111631368.jpg");
        //pictures.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1501737634165&di=1c9f0f265e795f12cbe4f6c5aee8d5e2&imgtype=0&src=http%3A%2F%2Fcfanclub.kudidai.com%2F20150126%2F20150126095736826.jpg400x400.jpg");
        //pictures.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1501737721771&di=a8c1f86a6754b0016aef8353788aa5e2&imgtype=0&src=http%3A%2F%2Fcimage.eshiptrading.com%2Fupload%2Fent%2F19756%2Fproduct%2Flogo%2F2012%2F02%2F27%2F913f4b9d8c58490b.jpg");
        //pictures.add("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1205205218,1505936639&fm=26&gp=0.jpg");
        gmdssAllInfo.setPrictures(pictures);
        //认可历程
        List<EntProHistory> entProHistory = getEntProHistory(entInfo);
        gmdssAllInfo.setEntProHistoryList(entProHistory);
        gmdssAllInfo.setCommentNums(this.getCommentsNums(entInfo));

        //获取方式不同的数据-----------------begin-----------------
        switch (entInfo.getEntcate()) {
            case "1":
                //产品制造企业
                System.out.println("获取补充信息++++++++++++产品制造企业");
                //补充信息
                EntInfoExtOne entInfoExtOne = getEntInfoExtOne(entInfo);
                if(entInfoExtOne != null ) {
                    if (!StrUtils.isBlank(entInfoExtOne.getSetdate()) && entInfoExtOne.getSetdate().length() > 6) {
                        String substring = entInfoExtOne.getSetdate().substring(0, 7).replace("-", ".");
                        entInfoExtOne.setSetdate(substring);
                    }
                    gmdssAllInfo.setEntInfoExt(entInfoExtOne);
                    //企业注册年限
                    String setdate = entInfoExtOne.getSetdate();//2017-01-01
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM");
                    Calendar start = Calendar.getInstance();
                    Calendar now = Calendar.getInstance();
                    if (!StrUtils.isBlank(setdate)) {
                        try {
                            start.setTime(simpleDateFormat.parse(setdate));
                            int years = now.get(Calendar.YEAR) - start.get(Calendar.YEAR);
                            gmdssAllInfo.setYears(years);
                        } catch (ParseException e) {
                            e.printStackTrace();
                        }
                    }
                }
                //产品认可型号
                int productTypes = getProductTypes(entInfo, "");
                gmdssAllInfo.setRepairCount(productTypes);
                //出厂检验产品
                int outCheckProductCount = getOutCheckProductCount(entInfo);
                gmdssAllInfo.setOnShipCount(outCheckProductCount);
                //产品抽查合格率 1代表产品制造企业
                String yesNo1 = getYesNo(entInfo, null);
                gmdssAllInfo.setPercentOfPass(yesNo1);
                //折线图
                CheckPercent checkPercent = getPercentList("1", entInfo);
                gmdssAllInfo.setCheckPercent(checkPercent);

                break;
            case "5":
                //筏站
                System.out.println("获取补充信息++++++++++++筏站");
                //补充信息
                EntInfoExtRoft entInfoExtRoft = getEntInfoExtRoft(entInfo);
                if(entInfoExtRoft != null) {
                    if (!StrUtils.isBlank(entInfoExtRoft.getSetdate()) && entInfoExtRoft.getSetdate().length() > 6) {
                        String substring = entInfoExtRoft.getSetdate().substring(0, 7).replace("-", ".");
                        entInfoExtRoft.setSetdate(substring);
                    }
                    gmdssAllInfo.setEntInfoExt(entInfoExtRoft);
                }
                //累计检修筏数量
                int repairCount = getRepairCount(entInfo, "");
                gmdssAllInfo.setRepairCount(repairCount);
                //修筏产品形式
                int roftProTypes = getProductTypes(entInfo, "");
                gmdssAllInfo.setProductTypes(roftProTypes);
                //检修期内救生筏数
                int i = inTimeRoft(entInfo, "", "", "");
                gmdssAllInfo.setOnShipCount(i);
                //监督抽查合格率 5代表筏站
                String yesNo5 = getYesNo(entInfo, "");
                gmdssAllInfo.setPercentOfPass(yesNo5);

                break;
            case "6":
                //Gmdss
                System.out.println("获取补充信息++++++++++++Gmdss");
                //补充信息
                EntInfoExtGmdss entInfoExtGmdss = getEntInfoExtGmdss(entInfo);
                if(entInfoExtGmdss!=null){
                    if (!StrUtils.isBlank(entInfoExtGmdss.getSetdate()) && entInfoExtGmdss.getSetdate().length() > 6) {
                        String substring = entInfoExtGmdss.getSetdate().substring(0, 7).replace("-", ".");
                        entInfoExtGmdss.setSetdate(substring);
                    }
                    gmdssAllInfo.setEntInfoExt(entInfoExtGmdss);
                }
                //维修gmdss设备数 type：设备类型，不确定
                int gmdssRepairCount = getRepairCount(entInfo, "");
                gmdssAllInfo.setRepairCount(gmdssRepairCount);
                //装船数量
                int toShipCount = inTimeRoft(entInfo,null,null,null);
                gmdssAllInfo.setOnShipCount(toShipCount);
                //维修产品型式
                int repairProductTypes = getProductTypes(entInfo, "");
                gmdssAllInfo.setProductTypes(repairProductTypes);
                //监督抽查合格率 productType:产品类型
                String yesNo6 = getYesNo(entInfo, "");
                gmdssAllInfo.setPercentOfPass(yesNo6);
                //监督抽查合格率折线图
                CheckPercent checkPercent6 = getPercentList("6", entInfo);
                gmdssAllInfo.setCheckPercent(checkPercent6);

                break;
            case "7":
                //检测机构
                System.out.println("获取补充信息++++++++++++检测机构");
                //补充信息
                EntInfoExtCheckOrg entInfoExtCheckOrg = getEntInfoExtCheckOrg(entInfo);
                if(entInfoExtCheckOrg != null) {
                    if (!StrUtils.isBlank(entInfoExtCheckOrg.getSetdate()) && entInfoExtCheckOrg.getSetdate().length() > 6) {
                        String substring = entInfoExtCheckOrg.getSetdate().substring(0, 7).replace("-", ".");
                        entInfoExtCheckOrg.setSetdate(substring);
                    }
                    gmdssAllInfo.setEntInfoExt(entInfoExtCheckOrg);
                }
                //累计检测产品数量
                int checkProCount = getCheckCount(entInfo, "");
                gmdssAllInfo.setRepairCount(checkProCount);
                //检测产品形式
                int checkOrgProTypes = getProductTypes(entInfo, "");
                gmdssAllInfo.setProductTypes(checkOrgProTypes);

                break;
        }
        //获取方式不同的数据-----------------end-----------------

        return gmdssAllInfo;
    }

    //获取客户好评郁差评数量
    private List getCommentsNums(EntInfo ent) {
        List list = new ArrayList();
        Map goodNums = new HashMap();
        goodNums.put("name","好评");
        Map badNums = new HashMap();
        badNums.put("name", "差评");

        CommentExample example = new CommentExample();
        CommentExample.Criteria criteria = example.createCriteria();

        criteria.andCommcateEqualTo((short) 1);
        goodNums.put("value", commentMapper.countByExample(example));
        if (!StrUtils.isBlank(ent.getRegistnum())) {
            criteria.andEntidEqualTo(ent.getRegistnum());
        }
        example.clear();
        criteria.andCommcateEqualTo((short) 2);
        if (!StrUtils.isBlank(ent.getRegistnum())) {
            criteria.andEntidEqualTo(ent.getRegistnum());
        }
        badNums.put("value", commentMapper.countByExample(example));
        list.add(goodNums);
        list.add(badNums);
        return list;
    }

    //营业执照
    public String getCompanyPicture(EntInfo entInfo){
        ImageManagerExample imageManagerExample = new ImageManagerExample();
        ImageManagerExample.Criteria imageManagerExampleCriteria = imageManagerExample.createCriteria();
        String registnum = entInfo.getRegistnum();
        String pid = entInfo.getPid();
        if(!StrUtils.isBlank(registnum)||!StrUtils.isBlank(pid)){
            imageManagerExampleCriteria.andRefidEqualTo(!StrUtils.isBlank(registnum)?registnum:pid);
            imageManagerExampleCriteria.andTypenumEqualTo(Const.ENT_LICENCE_TYPE);
        }
        List<ImageManager> imageManagers = imageManagerMapper.selectByExample(imageManagerExample);
        return imageManagers.size()>0?imageManagers.get(0).getPath():"";
    }

    //接口3：Gmdss装船数量列表
    @Override
    public List<ProductCheck> getGmdssShipList(EntInfo ent) {
        ProductCheckExample productCheckExample = new ProductCheckExample();
        ProductCheckExample.Criteria criteria = productCheckExample.createCriteria();
        if (!StrUtils.isBlank(ent.getRegistnum())) {
            criteria.andEntidEqualTo(ent.getRegistnum());
        }
        List<ProductCheck> productCheckList = productCheckMapper.selectByExample(productCheckExample);
        return productCheckList;
    }

    //接口4：检修期内救生筏数列表
    @Override
    public Pager getRoftInTimeList(EntInfo ent, Pager pager) {
        ProductRepairExample productRepairExample = new ProductRepairExample();
        productRepairExample.setPage(pager);
        ProductRepairExample.Criteria criteria = productRepairExample.createCriteria();
        if (!StrUtils.isBlank(ent.getRegistnum())) {
            criteria.andEntidEqualTo(ent.getRegistnum());
        }
        //判断是否处于检修期内
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(new Date());
        System.out.println("判断是不是出于检修期内的时候用到的时间：" + format);
        criteria.andChecktimenextGreaterThanOrEqualTo(format);
        List<ProductRepair> productRepairs = productRepairMapper.selectByExample(productRepairExample);
        pager.setPagerInfo(productRepairs,productRepairMapper.countByExample(productRepairExample));
        return pager;
    }

    //接口5：产品制造企业：出厂检验产品列表
    @Override
    public List<ProductCheck> getOutCheckProductList(EntInfo ent) {
        ProductCheckExample productCheckExample = new ProductCheckExample();
        ProductCheckExample.Criteria criteria = productCheckExample.createCriteria();
        if (!StrUtils.isBlank(ent.getRegistnum())) {
            criteria.andEntidEqualTo(ent.getRegistnum());
        }
        List<ProductCheck> productCheckList = productCheckMapper.selectByExample(productCheckExample);
        return productCheckList;
    }

    //接口6：分页接口1：gmdss：维修设备；筏站：修筏；检测机构：检测产品
    @Override
    public Pager<ProductRepair> getListByPage1(EntInfo entInfo, Pager pager, String orderName, String orderType, String type) {
        ProductRepairExample productRepairExample = new ProductRepairExample();
        productRepairExample.setPage(pager);
        ProductRepairExample.Criteria criteria = productRepairExample.createCriteria();
        if (!StrUtils.isBlank(entInfo.getRegistnum())) {
            log.debug("getlistbypage1:"+entInfo.getRegistnum());
            criteria.andEntidEqualTo(entInfo.getRegistnum());
        }
        if (!StrUtils.isBlank(type)) {
            criteria.andProtypeEqualTo(type);
        }
        //排序设置
        if (!StrUtils.isBlank(orderName)) {
            //orderName 排序字段 数据库对应的字段
            orderType = StrUtils.isBlank(orderType) ? "DESC" : orderType;
            productRepairExample.setOrderByClause(orderName + "  " + orderType);
        }
        List<ProductRepair> productRepairList = productRepairMapper.selectByExample(productRepairExample);
        log.debug(productRepairList);
        pager.setPagerInfo(productRepairList, productRepairMapper.countByExample(productRepairExample));

        return pager;
    }

    //接口7：分页接口2：产品制造企业：产品认可型号
    @Override
    public Pager<ProCheckList> getListByPage2(EntInfo entInfo, Pager pager, String orderName, String orderType) {
        ProCheckListExample proCheckListExample = new ProCheckListExample();
        proCheckListExample.setPage(pager);
        ProCheckListExample.Criteria criteria = proCheckListExample.createCriteria();
        if (!StrUtils.isBlank(entInfo.getRegistnum())) {
            criteria.andEntidEqualTo(entInfo.getRegistnum());
        }
        List<ProCheckList> proCheckLists = proCheckListMapper.selectByExample(proCheckListExample);
        pager.setPagerInfo(proCheckLists, proCheckListMapper.countByExample(proCheckListExample));
        return pager;
    }

    //接口8：监督抽查合格率列表 弹窗三 接口性质
    @Override
    public Map<String, Object> getCheckPercentList(Pager pager, EntInfo entInfo, ProductCheck productCheck) {
        Map<String, Object> map = new HashMap<>();

        //监督抽查合格率，现在就这一个
//        int unitPercent = getPercent(entInfo, type, "1");
//        map.put("unitPercent", unitPercent);
//        pager = getProductCheckList(pager,entInfo, type, "1");
//        map.put("pager", pager);
        //update by ly
        productCheck.setChecktype("1");
        int unitPercent = getCheckPercent1(entInfo, productCheck);
        map.put("unitPercent", unitPercent);
        pager = getProductCheckList(pager,entInfo,productCheck);
        map.put("pager", pager);
        return map;
    }

    //获取弹窗一的年份和数量
    @Override
    public Map<String, Object> getCountByYear(EntInfo entInfo, String type, String beginTime, String endTime) {
        Map<String, Object> map = new HashMap<>();
        int beginYear;
        int endYear;
        if (StrUtils.isBlank(beginTime) || StrUtils.isBlank(endTime)) {
//            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
//            String format = simpleDateFormat.format(new Date());
//            System.out.println("不传时间就给你个时间行不行" + format);
//            beginTime = format;
//            endTime = format;
            endYear = Calendar.getInstance().get(Calendar.YEAR);
            beginYear = endYear-4;
        }else{
            beginYear = Integer.parseInt(beginTime);
            endYear = Integer.parseInt(endTime);
        }
        List<Integer> years = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();
        while (beginYear <= endYear) {
            ProductRepairExample productRepairExample = new ProductRepairExample();
            ProductRepairExample.Criteria criteria = productRepairExample.createCriteria();
            if (!StrUtils.isBlank(entInfo.getRegistnum())) {
                criteria.andEntidEqualTo(entInfo.getRegistnum());
            }
            if (!StrUtils.isBlank(type)) {
                criteria.andProtypeEqualTo(type);
            }
            criteria.andChecktimeLike(beginYear + "%");
            int i = productRepairMapper.countByExample(productRepairExample);
            years.add(beginYear);
            counts.add(i);
            beginYear++;
        }
        map.put("years", years);
        map.put("counts", counts);
        return map;
    }

    @Override
    public Map<String, Object> getCheckList(Pager pager, EntInfo entInfo, ProductCheck productCheck) {
        Map<String, Object> map = new HashMap<>();

        //型式认可检测 productmodel=4 产品装船后检测 productmodel=5
        productCheck.setChecktype("4");
        Pager<ProductCheck> xingshiPager = getProductCheckList(pager,entInfo, productCheck);
        int xingshiPercent = getCheckPercent1(entInfo, productCheck);
        map.put("xingshiPercent", xingshiPercent);
        map.put("xingshiPager", xingshiPager);

        productCheck.setChecktype("5");
        Pager<ProductCheck> checkAfterShip = getProductCheckList(pager,entInfo, productCheck);
        int checkAfterShipPercent = getCheckPercent1(entInfo, productCheck);
        map.put("checkAfterShipPercent", checkAfterShipPercent);
        map.put("checkAfterShip", checkAfterShip);
        return map;

    }

    //产品制造企业
    @Override
    public Map<String, Object> getCpzzPercentList(Pager pager, EntInfo entInfo, ProductCheck productCheck) {
        Map<String, Object> map = new HashMap<>();

        //产品质量 1     跟随渔船2    渔船安全技术3 的区别
        productCheck.setChecktype("1");
        int percent1 = getCheckPercent1(entInfo, productCheck);
        Pager<ProductCheck> pager1 = getProductCheckList(pager, entInfo, productCheck);
        map.put("pager1", pager1);
        map.put("percent1", percent1);

        productCheck.setChecktype("2");
        Pager<ProductCheck> pager2 = getProductCheckList(pager, entInfo,productCheck);
        int percent2 = getCheckPercent1(entInfo, productCheck);
        map.put("percent2", percent2);
        map.put("pager2", pager2);

        productCheck.setChecktype("3");
        Pager<ProductCheck> pager3 = getProductCheckList(pager, entInfo, productCheck);
        int percent3 = getCheckPercent1(entInfo, productCheck);
        map.put("percent3", percent3);
        map.put("pager3", pager3);

        return map;

    }

    //获取产品认可型号
    @Override
    public Map<String, Object> getCpzzTypes(EntInfo entInfo, String which,String name) {
        Map<String,Object> map = new HashMap<>();
        ProCheckListExample proCheckListExample = new ProCheckListExample();
        ProCheckListExample.Criteria criteria = proCheckListExample.createCriteria();
        String entid = "";
        if(!StrUtils.isBlank(entInfo.getRegistnum())){
            entid=entInfo.getRegistnum();
        }
        if (!StrUtils.isBlank(entInfo.getRegistnum())) {
            System.out.println("Registnum!!!!!!!!null"+ entInfo.getRegistnum());
            entid = entInfo.getRegistnum();
        }
        switch (which){
            case "1":
                //获取产品类型
                System.out.println("获取产品类型"+entid+";;;"+name);
                List<String> productTypes = proCheckListMapper.getProductTypes(entid);
                map.put("productTypes", productTypes);
                break;
            case "2":
                //获取产品名称
                List<String> productNames = proCheckListMapper.getProductNames(entid, name);
                map.put("productNames", productNames);
                break;
            case "3":
                //获取产品证书
                List<String> crets = proCheckListMapper.getCrets(entid, name);
                if(crets.contains("null")){
                    crets.remove("null");
                }
                if(crets.contains(null)){
                    crets.remove(null);
                }
                map.put("crets", crets);
                break;
                case "4":
                    CertProHistoryExample certProHistoryExample = new CertProHistoryExample();
                    certProHistoryExample.setOrderByClause("CCH_CHECKTIME ASC");
                    CertProHistoryExample.Criteria criteria1 = certProHistoryExample.createCriteria();
                    if(!StrUtils.isBlank(entid)){
                        criteria1.andEntidEqualTo(entid);
                    }
                    if(!StrUtils.isBlank(name)){
                        criteria1.andCertidEqualTo(name);
                    }
                    List<CertProHistory> certProHistories = certProHistoryMapper.selectByExample(certProHistoryExample);
                    map.put("certProHistories", certProHistories);

                    break;
            default:
                break;
        }
        return map;
    }

    //type1：gmdss或者筏站等大类别 type2:小的分类
    @Override
    public Pager<ProductCheck> getListByPage3(EntInfo entInfo, Pager page, String orderName, String orderType, String type1, String type2) {
        ProductCheckExample productCheckExample = new ProductCheckExample();
        ProductCheckExample.Criteria criteria = productCheckExample.createCriteria();
        if(!StrUtils.isBlank(orderName)){
            String orderType1 = StrUtils.isBlank(orderType)?"DESC":orderType;
            productCheckExample.setOrderByClause(orderName + "  " + orderType1);
        }
        if(!StrUtils.isBlank(type1)){
            criteria.andProducttypeEqualTo(type1);
        }
        if(!StrUtils.isBlank(entInfo.getRegistnum())){
            criteria.andEntidEqualTo(entInfo.getRegistnum());
        }
        if(!StrUtils.isBlank(type2)){
            criteria.andChecktypeEqualTo(type2);
        }
        productCheckExample.setPage(page);
        List<ProductCheck> productCheckList = productCheckMapper.selectByExample(productCheckExample);
        int i = productCheckMapper.countByExample(productCheckExample);
        page.setPagerInfo(productCheckList,i);

        return page;
    }
    //检测机构产品数量
    public int getCheckCount(EntInfo entInfo, String type) {
        ProductCheckExample productCheckExample = new ProductCheckExample();
        ProductCheckExample.Criteria criteria = productCheckExample.createCriteria();
        if (!StrUtils.isBlank(entInfo.getRegistnum())) {
            criteria.andEntidEqualTo(entInfo.getRegistnum());
        }
        if (!StrUtils.isBlank(type)) {
            criteria.andChecktypeEqualTo(type);
        }
        return productCheckMapper.countByExample(productCheckExample);
    }

    //检测机构弹窗一：累计检测产品数量百分比 type:企业类型  productMode:型式认可或其他
    public int getCheckPercent1(EntInfo entInfo, ProductCheck productCheck) {
        int percent = 0;
        ProductCheckExample productCheckExample = new ProductCheckExample();
        ProductCheckExample.Criteria criteria = productCheckExample.createCriteria();
        if (!StrUtils.isBlank(entInfo.getRegistnum())) {
            criteria.andEntidEqualTo(entInfo.getRegistnum());
        }
        if (!StrUtils.isBlank(productCheck.getProducttype())) {
            criteria.andProducttypeEqualTo(productCheck.getProducttype());
        }
        if (!StrUtils.isBlank(productCheck.getProdutmodel())) {
            criteria.andProdutmodelEqualTo(productCheck.getProdutmodel());
        }
        if (!StrUtils.isBlank(productCheck.getChecktype())) {
            criteria.andChecktypeEqualTo(productCheck.getChecktype());
        }
        int all = productCheckMapper.countByExample(productCheckExample);
        criteria.andCheckpassEqualTo((short) 1);//代表合格
        int yes = productCheckMapper.countByExample(productCheckExample);
        if (all > 0) {
            percent = yes * 100 / all;
        }
        return percent;
    }

    //监督抽查合格率列表 type：哪种企业  unitOrothertype：单位抽查还是产品抽查--张进
//    public int getPercent(EntInfo entInfo, String type, String unitOrOtherType) {
//        int percent = 0;
//        ProductCheckExample productCheckExample = new ProductCheckExample();
//        ProductCheckExample.Criteria criteria = productCheckExample.createCriteria();
//        if (!StrUtils.isBlank(entInfo.getRegistnum())) {
//            criteria.andEntidEqualTo(entInfo.getRegistnum());
//        }
//        if (!StrUtils.isBlank(type)) {
//            criteria.andProducttypeEqualTo(type);
//        }
//        if (!StrUtils.isBlank(unitOrOtherType)) {
//            criteria.andChecktypeEqualTo(unitOrOtherType);
//        }
//        int all = productCheckMapper.countByExample(productCheckExample);
//        criteria.andCheckpassEqualTo((short) 1);//代表合格
//        int yes = productCheckMapper.countByExample(productCheckExample);
//        if (all > 0) {
//            percent = yes * 100 / all;
//        }
//        return percent;
//    }
    //获取产品检验列表
    public Pager<ProductCheck> getProductCheckList(Pager pager, EntInfo entInfo, ProductCheck productCheck) {
        ProductCheckExample productCheckExample = new ProductCheckExample();
        productCheckExample.setPage(pager);
        ProductCheckExample.Criteria criteria = productCheckExample.createCriteria();
        if (!StrUtils.isBlank(entInfo.getRegistnum())) {
            criteria.andEntidEqualTo(entInfo.getRegistnum());
        }
        if (!StrUtils.isBlank(productCheck.getProducttype())) {
            criteria.andProducttypeEqualTo(productCheck.getProducttype());
        }
        if (!StrUtils.isBlank(productCheck.getProdutmodel())) {
            criteria.andProdutmodelEqualTo(productCheck.getProdutmodel());
        }
        if (!StrUtils.isBlank(productCheck.getChecktype())) {
            criteria.andChecktypeEqualTo(productCheck.getChecktype());
        }
        List<ProductCheck> productCheckList = productCheckMapper.selectByExample(productCheckExample);
        int nums = productCheckMapper.countByExample(productCheckExample);
        Pager dataPager = new Pager(pager.getPage(),pager.getRows());
        dataPager.setPagerInfo(productCheckList,nums);
        return dataPager;
    }




    //监督抽查列表
//    public Pager getProductCheckList(Pager pager, EntInfo entInfo, String type, String unitOrOthers) {
//        ProductCheckExample productCheckExample = new ProductCheckExample();
//        productCheckExample.setPage(pager);
//        ProductCheckExample.Criteria criteria = productCheckExample.createCriteria();
//        if (!StrUtils.isBlank(entInfo.getRegistnum())) {
//            criteria.andEntidEqualTo(entInfo.getRegistnum());
//        }
//        if (!StrUtils.isBlank(type)) {
//            criteria.andProducttypeEqualTo(type);
//        }
//        if (!StrUtils.isBlank(unitOrOthers)) {
//            criteria.andChecktypeEqualTo(unitOrOthers);
//        }
//        List<ProductCheck> productCheckList = productCheckMapper.selectByExample(productCheckExample);
//        pager.setPagerInfo(productCheckList,productCheckMapper.countByExample(productCheckExample));
//        return pager;
//    }

    //-------------------------------------------可共用方法-----begin----------------------------
//图片展示  typenum:哪一类的图片
    public List<String> getPictures(EntInfo entInfo, String typeNum,String type) {
        List<String> list = new ArrayList<>();
        ImageManagerExample imageManagerExample = new ImageManagerExample();
        ImageManagerExample.Criteria criteria = imageManagerExample.createCriteria();
        criteria.andStatusEqualTo((short) 1);
        if(!StrUtils.isBlank(type)){
            criteria.andTypenumEqualTo(type);
        }
        if (!StrUtils.isBlank(typeNum)) {
            criteria.andTypenumEqualTo(typeNum);
        }
        if (!StrUtils.isBlank(entInfo.getRegistnum())) {
            criteria.andRefidEqualTo(entInfo.getRegistnum());
        }
        if (!StrUtils.isBlank(entInfo.getPid())) {
            criteria.andRefidEqualTo(entInfo.getPid());
        }
        List<ImageManager> imageManagers = imageManagerMapper.selectByExample(imageManagerExample);
        if (imageManagers.size() > 0) {
            for (int i = 0; i < imageManagers.size(); i++) {
                //list.add(imageManagers.get(i).getUrl() + imageManagers.get(i).getPath());
                list.add(imageManagers.get(i).getPath());
            }
        }
        return list;
    }

    //认可历程
    public List<EntProHistory> getEntProHistory(EntInfo entInfo) {
        EntProHistoryExample entProHistoryExample = new EntProHistoryExample();
        EntProHistoryExample.Criteria criteria = entProHistoryExample.createCriteria();
        if (!StrUtils.isBlank(entInfo.getRegistnum())) {
            criteria.andEntidEqualTo(entInfo.getRegistnum());
        }
        return entProHistoryMapper.selectByExample(entProHistoryExample);
    }

    //产品合格率折线图数据  参数COO：1代表全国 2代表本企业
    public int getCheckPercent(EntInfo entInfo, String productType, String year, String COO) {
        ProductCheckExample productCheckExample = new ProductCheckExample();
        ProductCheckExample.Criteria criteria = productCheckExample.createCriteria();
        criteria.andChecktimeLike(year + "%");
        //if (!StrUtils.isBlank(productType)) {
        //    criteria.andProducttypeEqualTo(productType);
        //}
        if ("2".equalsIgnoreCase(COO)) {//代表本企业
            if (!StrUtils.isBlank(entInfo.getRegistnum())) {
                criteria.andEntidEqualTo(entInfo.getRegistnum());
            }
        }
        //全部
        int all = productCheckMapper.countByExample(productCheckExample);
        //合格
        criteria.andCheckpassEqualTo((short) 1);
        int yes = productCheckMapper.countByExample(productCheckExample);
        int percent = 0;
        if (all > 0) {
            percent = Integer.valueOf(String.format("%d", yes * 100 / all));
        }
        return percent;

    }

    //客户评价
    @Override
    public Pager getComments(Pager pager,EntInfo entInfo, String commcate) {
        List<Comment> list = new ArrayList<>();
        CommentExample commentExample = new CommentExample();
        commentExample.setPage(pager);
        CommentExample.Criteria criteria = commentExample.createCriteria();
        if (!StrUtils.isBlank(entInfo.getRegistnum())) {
            criteria.andEntidEqualTo(entInfo.getRegistnum());
        }
        if (!StrUtils.isBlank(commcate)) {
            criteria.andCommcateEqualTo(Short.parseShort(commcate));
        }
        List<Comment> comments = commentMapper.selectByExample(commentExample);
        if(comments!=null){
            list =  comments;
        }
        pager.setPagerInfo(list,commentMapper.countByExample(commentExample));
        return pager;
    }

    //Gmdss:维修设备数。筏站：累计检筏数量
    public int getRepairCount(EntInfo entInfo, String type) {
        ProductRepairExample productRepairExample = new ProductRepairExample();
        ProductRepairExample.Criteria criteria = productRepairExample.createCriteria();
        if (!StrUtils.isBlank(entInfo.getRegistnum())) {
            criteria.andEntidEqualTo(entInfo.getRegistnum());
        }
        if (!StrUtils.isBlank(type)) {
            criteria.andProtypeEqualTo(type);
        }
        return productRepairMapper.countByExample(productRepairExample);
    }

    //Gmdss:维修产品形式。筏站：修筏产品形式。检测机构：检测产品形式。产品制造企业：产品认可型号。
    public int getProductTypes(EntInfo entInfo, String type) {
        ProCheckListExample proCheckListExample = new ProCheckListExample();
        ProCheckListExample.Criteria criteria = proCheckListExample.createCriteria();
        if (!StrUtils.isBlank(entInfo.getRegistnum())) {
            criteria.andEntidEqualTo(entInfo.getRegistnum());
        }
        if (!StrUtils.isBlank(type)) {
            criteria.andProtypeEqualTo(type);
        }
        return proCheckListMapper.countByExample(proCheckListExample);
    }

    //监督抽查合格率，产品检验合格率
    public String getYesNo(EntInfo entInfo, String productType) {
        ProductCheckExample productCheckExample = new ProductCheckExample();
        ProductCheckExample.Criteria criteria = productCheckExample.createCriteria();
        if (!StrUtils.isBlank(entInfo.getRegistnum())) {
            criteria.andEntidEqualTo(entInfo.getRegistnum());
        }
        if (!StrUtils.isBlank(productType)) {
            criteria.andProducttypeEqualTo(productType);
        }
        //2为不合格
        int all = productCheckMapper.countByExample(productCheckExample);
        criteria.andCheckpassEqualTo((short) 2);
        int j = productCheckMapper.countByExample(productCheckExample);
        String pass = "0";
        if (all > 0) {
            pass = String.format("%d", (all - j) * 100 / all);
        }
        return pass;

    }

    //监督抽查合格率折线图
    public CheckPercent getPercentList(String type, EntInfo entInfo) {
        //Date date = new Date();
        //int year = date.getYear();
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println("今年是哪一年" + year);
        CheckPercent checkPercent = new CheckPercent();
        List<Integer> xAxis = new ArrayList<>();
        List<Integer> ownerList = new ArrayList<>();
        List<Integer> countryList = new ArrayList<>();
        for (int i = 5; i >= 0; i--) {
            xAxis.add(year - i);
            //全国
            int company = getCheckPercent(entInfo, type, String.valueOf(year - i), "1");
            countryList.add(company);
            //本企业
            int owner = getCheckPercent(entInfo, type, String.valueOf(year - i), "2");
            ownerList.add(owner);
        }
        checkPercent.setxAxis(xAxis);
        checkPercent.setCountryList(countryList);
        checkPercent.setOwnerList(ownerList);
        return checkPercent;
    }
//-------------------------------------------可共用方法-----end----------------------------

    //-------------------------------------------产品制造企业-----begin----------------------------
//产品制造企业补充信息
    public EntInfoExtOne getEntInfoExtOne(EntInfo entInfo) {
        EntInfoExtOneExample entInfoExtOneExample = new EntInfoExtOneExample();
        EntInfoExtOneExample.Criteria criteria = entInfoExtOneExample.createCriteria();
        if (!StrUtils.isBlank(entInfo.getRegistnum())) {
            criteria.andPidEqualTo(entInfo.getRegistnum());
        }
        List<EntInfoExtOne> entInfoExtOnes = entInfoExtOneMapper.selectByExample(entInfoExtOneExample);
        return entInfoExtOnes.size() > 0 ? entInfoExtOnes.get(0) : null;
    }

    //出厂检验产品
    public int getOutCheckProductCount(EntInfo entInfo) {
        ProductCheckExample productCheckExample = new ProductCheckExample();
        ProductCheckExample.Criteria criteria = productCheckExample.createCriteria();
        if (!StrUtils.isBlank(entInfo.getRegistnum())) {
            criteria.andEntidEqualTo(entInfo.getRegistnum());
        }
        return productCheckMapper.countByExample(productCheckExample);
    }
//-------------------------------------------产品制造企业-----end----------------------------

    //-------------------------------------------筏站-----begin----------------------------
//获取筏站补充基本信息
    public EntInfoExtRoft getEntInfoExtRoft(EntInfo entInfo) {
        EntInfoExtRoftExample entInfoExtRoftExample = new EntInfoExtRoftExample();
        EntInfoExtRoftExample.Criteria criteria = entInfoExtRoftExample.createCriteria();
        if (!StrUtils.isBlank(entInfo.getRegistnum())) {
            criteria.andPidEqualTo(entInfo.getRegistnum());
        }
        List<EntInfoExtRoft> entInfoExtRofts = entInfoExtRoftMapper.selectByExample(entInfoExtRoftExample);
        return entInfoExtRofts.size() > 0 ? entInfoExtRofts.get(0) : null;
    }

    //检修期内救生筏数  检修期内救生筏数
    public int inTimeRoft(EntInfo entInfo, String checkTime, String checkTimeNext, String type) {
        int i = 0;
        ProductRepairExample productRepairExample = new ProductRepairExample();
        ProductRepairExample.Criteria criteria = productRepairExample.createCriteria();
        if (!StrUtils.isBlank(type)) {
            criteria.andProtypeEqualTo(type);
        }
        if (!StrUtils.isBlank(entInfo.getRegistnum())) {
            criteria.andEntidEqualTo(entInfo.getRegistnum());
        }
        //判断是否处于检修期内
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(new Date());
        System.out.println("判断是不是出于检修期内的时候用到的时间：" + format);
        criteria.andChecktimenextGreaterThanOrEqualTo(format);
        i = productRepairMapper.countByExample(productRepairExample);
        return i;
    }
//-------------------------------------------筏站-----end----------------------------

    //-------------------------------------------gmdss-----begin----------------------------

    //gmdss装船数量
    public int getToShipCount(EntInfo entInfo) {
        ProductCheckExample productCheckExample = new ProductCheckExample();
        ProductCheckExample.Criteria criteria = productCheckExample.createCriteria();
        if (!StrUtils.isBlank(entInfo.getRegistnum())) {
            criteria.andEntidEqualTo(entInfo.getRegistnum());
        }
        return productCheckMapper.countByExample(productCheckExample);
    }


    //获取Gmdss补充基本信息
    public EntInfoExtGmdss getEntInfoExtGmdss(EntInfo entInfo) {
        EntInfoExtGmdssExample entInfoExtGmdssExample = new EntInfoExtGmdssExample();
        EntInfoExtGmdssExample.Criteria criteria = entInfoExtGmdssExample.createCriteria();
        if (!StrUtils.isBlank(entInfo.getRegistnum())) {
            criteria.andPidEqualTo(entInfo.getRegistnum());
        }
        List<EntInfoExtGmdss> entInfoExtGmdsses = entInfoExtGmdssMapper.selectByExample(entInfoExtGmdssExample);
        return entInfoExtGmdsses.size() > 0 ? entInfoExtGmdsses.get(0) : null;
    }

    //-------------------------------------------gmdss-----end----------------------------
//-------------------------------------------检测机构-----begin----------------------------
//获取检测机构补充基本信息
    public EntInfoExtCheckOrg getEntInfoExtCheckOrg(EntInfo entInfo) {
        EntInfoExtCheckOrgExample entInfoExtCheckOrgExample = new EntInfoExtCheckOrgExample();
        EntInfoExtCheckOrgExample.Criteria criteria = entInfoExtCheckOrgExample.createCriteria();
        if (!StrUtils.isBlank(entInfo.getRegistnum())) {
            criteria.andPidEqualTo(entInfo.getRegistnum());
        }
        List<EntInfoExtCheckOrg> entInfoExtCheckOrgs = entInfoExtCheckOrgMapper.selectByExample(entInfoExtCheckOrgExample);
        return entInfoExtCheckOrgs.size() > 0 ? entInfoExtCheckOrgs.get(0) : null;
    }
//-------------------------------------------检测机构-----end----------------------------

    //--------------------------------维修企业------------------------------------
    //获取维修企业页面展示信息
    @Override
    public Map<String, Object> getRepairEntInfo(EntInfo ent) {
        Map<String, Object> map = new HashMap<>();
        EntInfo entInfo = this.getEntInfo(ent);
        EntInfoExtRepair entInfoExtRepair = this.getEntInfoExtRepair(ent);
        entInfoExtRepair.setEntarea(Float.parseFloat(entInfoExtRepair.getEntarea())*30/2+"");//万平方千米转换为亩
        List<String> pictures = this.getPictures(ent, "1",null);
        int repairTimes = 0;//维修渔船总船次
        List<String> shipIds = new ArrayList<>();
        if (!StrUtils.isBlank(ent.getPid())) {
            ShipRepairExample shipRepairExample = new ShipRepairExample();
            ShipRepairExample.Criteria criteria = shipRepairExample.createCriteria();
            criteria.andEntidEqualTo(ent.getPid());
            shipIds = this.shipRepairMapper.getShipIdsByEnt(ent.getPid());
            repairTimes = this.shipRepairMapper.countByExample(shipRepairExample);
        }
//        pictures.clear();
//        pictures.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1502332224&di=41e9debb04540499783f26bbca5987cd&imgtype=jpg&er=1&src=http%3A%2F%2Fwww.chinazy.org%2Fupfile%2F20110217%2F02171111631368.jpg");
//        pictures.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1501737634165&di=1c9f0f265e795f12cbe4f6c5aee8d5e2&imgtype=0&src=http%3A%2F%2Fcfanclub.kudidai.com%2F20150126%2F20150126095736826.jpg400x400.jpg ");
//        pictures.add("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1501737721771&di=a8c1f86a6754b0016aef8353788aa5e2&imgtype=0&src=http%3A%2F%2Fcimage.eshiptrading.com%2Fupload%2Fent%2F19756%2Fproduct%2Flogo%2F2012%2F02%2F27%2F913f4b9d8c58490b.jpg");
//        pictures.add("https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=1205205218,1505936639&fm=26&gp=0.jpg");
        map.put("entInfo", entInfo);
        map.put("pictures", pictures);
        map.put("repairTimes", repairTimes);
        map.put("entInfoExtRepair", entInfoExtRepair);
        if (shipIds.size()>0) {
            map.put("firstPassRate", this.shipMapper.getFirstPassRate(shipIds).get("firstPassRate"));
        }

        return map;
    }

    private EntInfoExtRepair getEntInfoExtRepair(EntInfo ent) {
        EntInfoExtRepair entInfoExtRepair = new EntInfoExtRepair();
        EntInfoExtRepairExample entInfoExtRepairExample = new EntInfoExtRepairExample();
        EntInfoExtRepairExample.Criteria criteria = entInfoExtRepairExample.createCriteria();
        if (!StrUtils.isBlank(ent.getPid())) {
            criteria.andPidEqualTo(ent.getPid());
            entInfoExtRepair = this.entInfoExtRepairMapper.selectByExample(entInfoExtRepairExample).get(0);
        }
        return entInfoExtRepair;
    }

    //获取维修渔船信息
    @Override
    public Pager getRepairShipInfo(EntInfo ent, Pager pager, String shipName) {
        int page = pager.getPage();
        int rows = pager.getRows();
        if (!StrUtils.isBlank(shipName)) {
            shipName = "%"+shipName+"%";
        }else{
            shipName = null;
        }
        if (!StrUtils.isBlank(ent.getPid())){
            List<Map<String,Object>> shipRepairInfo = this.shipRepairMapper.selectByEntId(ent.getPid(),page*rows,(page-1)*rows+1,shipName);
            pager.setPagerInfo(shipRepairInfo,this.shipRepairMapper.countByEntId(ent.getPid(),shipName));
        }
        return pager;
    }

    //获取维修渔船分类统计信息
    @Override
    public List<Map<String, Object>> getShipRepairPercent(EntInfo ent, String type) {
        List<Map<String, Object>> list = new ArrayList<>();
        List<String> shipIds = new ArrayList<>();
        if (!StrUtils.isBlank(ent.getPid())) {
            shipIds = this.shipRepairMapper.getShipIdsByEnt(ent.getPid());
        }
        if (shipIds != null && shipIds.size()>0){
            if ("length".equals(type)) {
                list = this.shipMapper.countByLength(shipIds);
            }else if("meterial".equals(type)){
                list = this.shipMapper.countByMeterial(shipIds);
            }else if("workarea".equals(type)){
                list = this.shipMapper.countByWorkarea(shipIds);
            }
        }

        return list;
    }

    //获取渔船首次维修后一次检验合格率(按年分组)
    @Override
    public Map getFirstPassGroupRate(EntInfo ent, String beginYear, String endYear) {
        List<String> shipIds = null;
        Map map = new HashMap();
        if (!StrUtils.isBlank(ent.getPid())) {
            List<String> list = this.shipRepairMapper.getShipIdsByEnt(ent.getPid());
            if (list.size() > 0) {
                shipIds = list;
            }
        }
        if (StrUtils.isBlank(beginYear)) {
            beginYear =  (Calendar.getInstance().get(Calendar.YEAR)-4)+"";
        }
        if (StrUtils.isBlank(endYear)) {
            endYear = (Calendar.getInstance().get(Calendar.YEAR) ) + "";
        }
        List<Map<String, Object>> list = this.shipMapper.getFirstPassGroupRate(shipIds,beginYear,endYear);//企业
        List<Map<String, Object>> qglist = this.shipMapper.getFirstPassGroupRate(null,beginYear,endYear);//全国
        map.put("entData", list);
        map.put("qgData", qglist);
        return map;
    }
    //得到维修企业每年的渔船维修数量
    @Override
    public Map<String, Object> getRepairTimesGroupYear(EntInfo ent, String beginYear, String endYear) {
        List<Map<String, Object>> repairTimesGroupYear = new ArrayList<>();
        Map<String,Object> map = new HashedMap();
        if (StrUtils.isBlank(beginYear)) {
            beginYear =  (Calendar.getInstance().get(Calendar.YEAR)-7)+"";
        }
        if (StrUtils.isBlank(endYear)) {
            endYear = (Calendar.getInstance().get(Calendar.YEAR) - 2) + "";
        }
        if (!StrUtils.isBlank(ent.getPid())) {
            repairTimesGroupYear = this.shipRepairMapper.countTimesGroupYear(ent.getPid(), beginYear, endYear);
            map.put("rates_L<12",this.shipRepairMapper.countRatesGroupYear(ent.getPid(), beginYear, endYear,0,12));
            map.put("rates_12≤L<24",this.shipRepairMapper.countRatesGroupYear(ent.getPid(), beginYear, endYear,12,24));
            map.put("rates_24≤L<45",this.shipRepairMapper.countRatesGroupYear(ent.getPid(), beginYear, endYear,24,45));
            map.put("rates_45≤L",this.shipRepairMapper.countRatesGroupYear(ent.getPid(), beginYear, endYear,45, Integer.MAX_VALUE));
        }
        map.put("times",repairTimesGroupYear);
        return map;
    }
    //得到企业分级信息列表
    @Override
    public Pager<EntClass> getEntClassList(EntInfo ent, Pager pager) {
        EntClassExample entClassExample = new EntClassExample();
        entClassExample.setPage(pager);
        EntClassExample.Criteria criteria = entClassExample.createCriteria();
        if (!StrUtils.isBlank(ent.getPid())) {
            criteria.andEntidEqualTo(ent.getPid());
        }
        pager.setPagerInfo(this.entClassMapper.selectByExample(entClassExample),this.entClassMapper.countByExample(entClassExample));
        return pager;
    }

    //渔船维修记录下载
    @Override
    public void repairRecordDownload(HttpServletResponse response, HttpServletRequest request, String fid) {
        if (fid != null) {
            DocumentManager documentManagers = new DocumentManager();
            DocumentManagerExample documentManagerExample = new DocumentManagerExample();
            DocumentManagerExample.Criteria criteria = documentManagerExample.createCriteria();
            criteria.andRefidEqualTo(fid);
            List<DocumentManager> list = this.documentManagerMapper.selectByExample(documentManagerExample);
            if (list != null && list.size()>0) {
                documentManagers = list.get(0);
            }
            String filePath = "C:/Users/Administrator/Desktop/stander05.jpg";
            String fileName = "sta中文nder05.jpg";
//            String filePath = documentManagers.getName();
//            String fileName = documentManagers.getPath();
            byte[] buffer = new byte[1024];
            FileInputStream fis = null;
            BufferedInputStream bis = null;
            OutputStream os = null;


            try {
                fileName = new String(fileName.getBytes("UTF-8"),"iso-8859-1");
                response.setCharacterEncoding("utf-8");
                response.setContentType("multipart/form-data");
                response.setHeader("Content-Disposition", "attachment;filename=" +fileName);
                File file = new File(filePath);
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);

                os = response.getOutputStream();
                int i = bis.read(buffer);
                while (i != -1) {
                    os.write(buffer, 0, i);
                    i = bis.read(buffer);
                }
            } catch (Exception e){
                e.printStackTrace();
            }finally {
                if (os != null) {
                    try {
                        os.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (bis != null) {
                    try {
                        bis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }

    //获取设计单位一张图页面的基本信息
    @Override
    public Map<String, Object> getDrawEntInfo(EntInfo ent) {
        Map<String, Object> map = new HashMap<>();
        EntInfo entInfo = new EntInfo();//企业基本信息
//        EntInfoExtDraw entInfoExtDraw = this.getEntInfoExtDraw(ent);//企业扩展信息
        int drawings = 0;//设计图纸数;
        int drawBuildShips = 0;//图纸建造渔船数
        float drawFirstPassRate = 0f;//图纸一次通过率
        String pid = ent.getPid();
        if (!StrUtils.isBlank(pid)) {
            DrawInfoExample drawInfoExample = new DrawInfoExample();
            DrawInfoExample.Criteria criteria = drawInfoExample.createCriteria();
            criteria.andEntidEqualTo(pid);

            drawings = this.drawInfoMapper.countByExample(drawInfoExample);
            drawBuildShips = this.drawInfoMapper.getShipsOfDrawBuid(pid);
            entInfo = this.getEntInfo(ent);
            drawFirstPassRate = this.drawInfoMapper.getDrawPassRate(pid,1);//1待表一次通过率
        }

        map.put("entInfo", entInfo);
        map.put("drawings", drawings);
        map.put("drawBuildShips", drawBuildShips);
        map.put("drawFirstPassRate", drawFirstPassRate);
        map.put("companyPicture", getCompanyPicture(ent));
        return map;
    }

    //获取设计图纸列表
    @Override
    public Pager getDrawInfoList(EntInfo ent,Pager pager,String keyWord) {
        int page = pager.getPage();
        int rows = pager.getRows();

        keyWord = !StrUtils.isBlank(keyWord)? keyWord + "%": null;
        if (!StrUtils.isBlank(ent.getPid())) {
            pager.setPagerInfo(this.drawInfoMapper.getDrawInfoByEntId(ent.getPid(),page*rows+1,(page-1)*rows,keyWord),this.drawInfoMapper.countDrawInfoByEntId(ent.getPid(),keyWord));
        }
        return pager;
    }

    //获取图纸建造的渔船信息
    @Override
    public Pager getDrawBuildList(EntInfo ent, Pager pager, String keyWord) {
        int page = pager.getPage();
        int rows = pager.getRows();

        keyWord = !StrUtils.isBlank(keyWord)? keyWord + "%": null;
        if (!StrUtils.isBlank(ent.getPid())) {
            pager.setPagerInfo(this.drawInfoMapper.getDrawBuildByEntId(ent.getPid(),page*rows+1,(page-1)*rows,keyWord),this.drawInfoMapper.countDrawBuildByEntId(ent.getPid(),keyWord));
        }
        return pager;
    }

    //获取图纸通过率
    @Override
    public List getDrawPassRate(EntInfo ent) {
        List<Map<String, Object>> list = new ArrayList<>();
        String pid = ent.getPid();

        if (!StrUtils.isBlank(pid)) {
            Map<String, Object> map1 = new HashedMap();
            Map<String, Object> map2 = new HashedMap();
            Map<String, Object> map3 = new HashedMap();
            map1.put("name","一次通过");
            map1.put("value",drawInfoMapper.getDrawPassRate(pid,1));
            list.add(map1);

            map2.put("name","二次通过");
            map2.put("value",drawInfoMapper.getDrawPassRate(pid,2));
            list.add(map2);

            map3.put("name","三次通过");
            map3.put("value",drawInfoMapper.getDrawPassRate(pid,3));
            list.add(map3);
        }
        return list;
    }

    //获取修造企业页面基本信息
    @Override
    public Map<String, Object> getDrawBuildEntInfo(EntInfo ent) {
        Map<String, Object> map = new HashMap<>();
        EntInfo entInfo = this.getEntInfo(ent);
        EntInfoExtRepairBuild entInfoExt = this.getEntInfoExtRepairBuild(ent);//修造企业扩展信息
        if (!StrUtils.isBlank(entInfoExt.getAreaspace())) {
            entInfoExt.setAreaspace(Float.parseFloat(entInfoExt.getAreaspace())*30/2+"");//数据库单位为万平方米,转换为亩
        }else{
            entInfoExt.setAreaspace("0");
        }
        List<String> pictures = this.getPictures(ent, "1",null);
        int repairTimes = 0;//维修渔船总船次
        int buildShipNums = 0;//建造渔船数量
        List<String> shipIds = new ArrayList<>();
        if (!StrUtils.isBlank(ent.getPid())) {
            ShipExample shipExample = new ShipExample();
            ShipExample.Criteria criteriaShip = shipExample.createCriteria();
            criteriaShip.andEntbulidEqualTo(ent.getPid());

            ShipRepairExample shipRepairExample = new ShipRepairExample();
            ShipRepairExample.Criteria criteria = shipRepairExample.createCriteria();
            criteria.andEntidEqualTo(ent.getPid());

            shipIds = this.shipRepairMapper.getShipIdsByEnt(ent.getPid());
            buildShipNums = this.shipMapper.countByExample(shipExample);
            repairTimes = this.shipRepairMapper.countByExample(shipRepairExample);
        }
        map.put("entInfo", entInfo);//基本信息
        map.put("pictures", pictures);//企业展示图片
        map.put("buildShipNums", buildShipNums);//建造渔船数量
        map.put("repairTimes", repairTimes);//维修渔船船次
        map.put("entInfoExt", entInfoExt);
        return map;
    }

    private EntInfoExtRepairBuild getEntInfoExtRepairBuild(EntInfo ent) {
        EntInfoExtRepairBuild entInfoExtRepairBuild = new EntInfoExtRepairBuild();
        EntInfoExtRepairBuildExample entInfoExtRepairBuildExample = new EntInfoExtRepairBuildExample();
        EntInfoExtRepairBuildExample.Criteria criteria = entInfoExtRepairBuildExample.createCriteria();
        if (!StrUtils.isBlank(ent.getPid())) {
            criteria.andEntpidEqualTo(ent.getPid());
            List<EntInfoExtRepairBuild> list = this.entInfoExtRepairBuildMapper.selectByExample(entInfoExtRepairBuildExample);
            if (list != null && list.size() > 0) {
                entInfoExtRepairBuild = list.get(0);
            }
        }
        return entInfoExtRepairBuild;
    }

    //获取修造企业建造的渔船信息
    @Override
    public Pager getBuildShipInfo(EntInfo ent, Pager pager, String shipName) {
        ShipExample shipExample = new ShipExample();
        ShipExample.Criteria criteria = shipExample.createCriteria();
        if (!StrUtils.isBlank(ent.getPid())) {
            criteria.andEntbulidEqualTo(ent.getPid());
        }
        if (!StrUtils.isBlank(shipName)) {
            criteria.andShipnameLike(shipName + "%");
        }
        shipExample.setPage(pager);
        pager.setPagerInfo(shipMapper.selectByExample(shipExample),shipMapper.countByExample(shipExample));
        return pager;
    }

    //获取企业建造渔船饼图信息
    @Override
    public List<Map<String, Object>> getShipBuildPercent(EntInfo ent, String type) {
        List<Map<String, Object>> list = new ArrayList<>();
        List<String> shipCodes = new ArrayList<>();
        if (!StrUtils.isBlank(ent.getPid())) {
           shipCodes = this.shipMapper.getShipIdsByBulEntId(ent.getPid());
        }
        if (shipCodes != null && shipCodes.size()>0){
            if ("length".equals(type)) {
                list = this.shipMapper.countByLength(shipCodes);
            }else if("meterial".equals(type)){
                list = this.shipMapper.countByMeterial(shipCodes);
            }else if("workarea".equals(type)){
                list = this.shipMapper.countByWorkarea(shipCodes);
            }
        }

        return list;
    }

    //获取渔船建造后一次检验合格率
    @Override
    public List<Map<String, Object>> getBuildFirstPassRate(EntInfo ent) {
        List list = new ArrayList();
        list.add(this.shipCheckMapper.getBuildFirstPassRate(ent.getPid(),0,9));
        list.add(this.shipCheckMapper.getBuildFirstPassRate(ent.getPid(),10,15));
        list.add(this.shipCheckMapper.getBuildFirstPassRate(ent.getPid(),16,20));
        list.add(this.shipCheckMapper.getBuildFirstPassRate(ent.getPid(),21,25));
        list.add(this.shipCheckMapper.getBuildFirstPassRate(ent.getPid(),26,30));
        list.add(this.shipCheckMapper.getBuildFirstPassRate(ent.getPid(),31,Integer.MAX_VALUE));
        return list;
    }
    //获取修造企业建造的渔船数量和一次检验合格率
    @Override
    public Map getBuildNumsGroupYear(EntInfo ent, String beginYear, String endYear) {
        List<Map<String, Object>> buildTimesGroupYear = new ArrayList<>();
        Map<String,Object> map = new HashedMap();
        if (StrUtils.isBlank(beginYear)) {
            beginYear =  (Calendar.getInstance().get(Calendar.YEAR)-7)+"";
        }
        if (StrUtils.isBlank(endYear)) {
            endYear = (Calendar.getInstance().get(Calendar.YEAR) - 2) + "";
        }
        if (!StrUtils.isBlank(ent.getPid())) {
            buildTimesGroupYear = this.shipMapper.countTimesGroupYear(ent.getPid(), beginYear, endYear);
            map.put("rates_L<12",this.shipMapper.countRatesGroupYear(ent.getPid(), beginYear, endYear,0,12));
            map.put("rates_12≤L<24",this.shipMapper.countRatesGroupYear(ent.getPid(), beginYear, endYear,12,24));
            map.put("rates_24≤L<45",this.shipMapper.countRatesGroupYear(ent.getPid(), beginYear, endYear,24,45));
            map.put("rates_45≤L",this.shipMapper.countRatesGroupYear(ent.getPid(), beginYear, endYear,45, Integer.MAX_VALUE));
        }
        map.put("times",buildTimesGroupYear);
        return map;
    }

    @Override
    public Pager<Map<String,Object>> getEnt3ListByOrgcode(EntInfo ent, Pager pager) {
        EntInfoExample entExample = new EntInfoExample();
        entExample.setPage(pager);
        EntInfoExample.Criteria entExampleCriteria = entExample.createCriteria();
        if (!StrUtils.isBlank(ent.getOrgcode())) {
            entExampleCriteria.andOrgcodeEqualTo(ent.getOrgcode());
        }
        entExampleCriteria.andEntcateEqualTo("3");
        if (!StrUtils.isBlank(ent.getPid())) {
            entExampleCriteria.andPidEqualTo(ent.getPid());
        }
        if (!StrUtils.isBlank(ent.getEntname())) {
            entExampleCriteria.andEntnameLike("%"+ent.getEntname()+"%");
        }
        List<Map<String,Object>> ent3List = entInfoMapper.getEnt3List(entExample);
        int count = entInfoMapper.getEnt3ListCount(entExample);
        pager.setPagerInfo(ent3List,count);
        return pager;
    }

    @Override
    public Pager<Map<String,Object>> getEnt7ListByOrgcode(EntInfo ent, Pager pager) {
        EntInfoExample entExample = new EntInfoExample();
        entExample.setPage(pager);
        EntInfoExample.Criteria entExampleCriteria = entExample.createCriteria();
        if (!StrUtils.isBlank(ent.getOrgcode())) {
            entExampleCriteria.andOrgcodeEqualTo(ent.getOrgcode());
        }
        List<String> entcateList = new ArrayList<String>();
        entcateList.add("5");
        entcateList.add("6");
        entcateList.add("7");
        if (!StrUtils.isBlank(ent.getPid())) {
            entExampleCriteria.andPidEqualTo(ent.getPid());
        }
        if (!StrUtils.isBlank(ent.getEntname())) {
            entExampleCriteria.andEntnameLike("%"+ent.getEntname()+"%");
        }
        entExampleCriteria.andEntcateIn(entcateList);
        List<Map<String,Object>> ent7List = entInfoMapper.getEnt7List(entExample);
        int count = entInfoMapper.getEnt7ListCount(entExample);
        pager.setPagerInfo(ent7List,count);
        return pager;
    }

    //获取示范渔船图片和渔船信息
    @Override
    public List getExampleShipPic(EntInfo entInfo,String typeNum) {
        List<Map> list = new ArrayList<>();
        list = this.shipMapper.getExampleShipPics(entInfo.getPid(),typeNum);
        return list;
    }

    //查询该模型的所有子类
    @Override
    public List<Capacity> getModelCapacitList(Capacity capacity) {
        String lateBatch = capacityMapper.getLateBatch(capacity.getRefid(),capacity.getBelongmodel());
        if (StrUtils.isBlank(lateBatch)) {
            return new ArrayList<>();
        }
        CapacityExample capacityExample=new CapacityExample();
        CapacityExample.Criteria criteria=capacityExample.createCriteria();
        criteria.andBatchEqualTo(lateBatch);
        if(!StrUtils.isBlank(capacity.getRefid())){
            criteria.andRefidEqualTo(capacity.getRefid());
        }
        if(!StrUtils.isBlank(capacity.getType())){
            criteria.andTypeEqualTo(capacity.getType());
        }
        if(!StrUtils.isBlank(capacity.getBelongmodel())){
            criteria.andBelongmodelEqualTo(capacity.getBelongmodel());
        }
        criteria.andTypeLessThan("4");//前台只展示4级以下的分数
        return capacityMapper.selectByExample(capacityExample);
    }

    //产品制造企业:产品检验合格率折线图数据接口
    @Override
    public Map getCpzzPercent(EntInfo ent, ProductCheck productCheck, String bYear, String eYear) {
        Map map = new HashMap();
        if (StrUtils.isBlank(bYear)) {
            bYear=Calendar.getInstance().get(Calendar.YEAR)-5+"";
        }
        if (StrUtils.isBlank(eYear)) {
            eYear=Calendar.getInstance().get(Calendar.YEAR)-1+"";
        }
        List xData = new ArrayList();
        List yData = new ArrayList();
        List yData_qg = new ArrayList();

        List<Map> list = this.productCheckMapper.getCpzzPercent(ent,productCheck,bYear,eYear);

        ent.setRegistnum(null);
        List<Map> list_qg = this.productCheckMapper.getCpzzPercent(ent,productCheck,bYear,eYear);
        for (int i = 0; i <= Integer.parseInt(eYear) - Integer.parseInt(bYear); i++) {
            String year = Integer.parseInt(bYear)+i+"";
            xData.add(year);
            String rate = "0";
            String rate_qg = "0";
            for (Map dataMap:list) {
                if (dataMap.get("YEAR").equals(year)) {
                    rate = dataMap.get("RATES").toString();
                }
            }
            for (Map dataMap:list_qg) {
                if (dataMap.get("YEAR").equals(year)) {
                    rate_qg = dataMap.get("RATES").toString();
                }
            }
            yData.add(rate);
            yData_qg.add(rate_qg);
        }
        map.put("xData", xData);
        map.put("yData", yData);
        map.put("yData_qg", yData_qg);
        return map;
    }

    @Override
    public Map<String, Object> getJygzwcqk(String orgCode,String startY,String endY) {
        Map<String,Object> objectMap = new HashMap<>();
        List<Map<String,Object>> objectList = new ArrayList<>();
        List<String> yearList = getYearList(startY, endY);

        String startYear = yearList.get(0);
        String endYear = yearList.get(yearList.size()-1);

        List<Map<String,String>> scList=shipCheckMapper.getShipCheckNumGroup(orgCode,startYear,endYear);
        Map<String,Object> scMap = new HashMap<>();
        scMap.put("typ","0");
        scMap.put("data",scList);
        objectList.add(scMap);

        List<Map> drawlist = drawCheckMapper.getDrawCheckNumsByYearType(orgCode,startYear,endYear);
        Map<String,Object> drawMap = new HashMap<>();
        drawMap.put("typ","1");
        drawMap.put("data",drawlist);
        objectList.add(drawMap);

        List<String> checkType = new ArrayList<>();
        checkType.add("1");
        checkType.add("2");
        checkType.add("3");
        checkType.add("4");
        List<Map> productlist = productCheckMapper.getProductCheckGroup(checkType,orgCode,startYear,endYear);
        Map<String,Object> productMap = new HashMap<>();
        productMap.put("typ","2");
        productMap.put("data",productlist);
        objectList.add(productMap);

        objectMap.put("data",objectList);
        return objectMap;
    }

    //拿到开始结束之间年数的集合
    public List<String> getYearList(String startYear,String endYear){
        List<String> list = new ArrayList<>();
        if(StrUtils.isBlank(startYear)||StrUtils.isBlank(endYear)){
            Calendar calendar = Calendar.getInstance();
            int iC = calendar.get(Calendar.YEAR);
            int jC = iC - 4;
            endYear= String.valueOf(iC);
            startYear= String.valueOf(jC);
        }
        System.out.println("startyear:"+startYear+"endyear:"+endYear);
        int i = Integer.parseInt(startYear);
        int j = Integer.parseInt(endYear);
        while (i <= j) {
            list.add(String.valueOf(i));
            i++;
        }
        return list;
    }
}
