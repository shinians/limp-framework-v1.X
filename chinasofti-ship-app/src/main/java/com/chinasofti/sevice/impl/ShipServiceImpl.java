package com.chinasofti.sevice.impl;

import com.chinasofti.common.Const;
import com.chinasofti.domain.*;
import com.chinasofti.mapper.oracle.*;
import com.chinasofti.sevice.ShipService;
import com.chinasofti.utils.StrUtil;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.utils.StrUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

/**
 * 获取渔船信息
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-11
 * Time: 下午6:44
 * To change this template use File | Settings | File Templates.
 */
@Service
public class ShipServiceImpl implements ShipService {
    @Resource
    private ShipMapper shipMapper;
    @Resource
    private ImageManagerMapper imageManagerMapper;
    @Resource
    private DocumentManagerMapper documentManagerMapper;
    @Resource
    private GNShipPosMapper gnShipMapper;
    @Resource
    private YYShipPosMapper yyShipMapper;

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
    public int getShipCountNum(Ship ship) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getShipChecknum(Surveyor surveyor) {
        ShipCheckShow scs = new ShipCheckShow();
        scs.setDistinct(true);
        scs.setSurid(surveyor.getYcscertnum());
        int num = shipMapper.countShipCheck(scs);
        return String.valueOf(num);
    }

    @Override
    public Pager<ShipCheckShow> getShipCheckList(ShipCheckShow shipCheckShow) {
        List<ShipCheckShow> scsList = shipMapper.getShipCheckList(shipCheckShow);
        int rowCount = shipMapper.countShipCheck(shipCheckShow);
        Pager pager = shipCheckShow.getPage();
        pager.setPagerInfo(scsList,rowCount);
        return pager;
    }

    @Override
    public Map getShipCheckYear(ShipCheckShow shipCheckShow) {
        List<String> yearList = shipMapper.countCheckYear(shipCheckShow);
        Map tmpMap = new HashMap();
        tmpMap.put("yearList",yearList);
        return tmpMap;
    }

    @Override
    public Map<String,List<Map<String,Object>>> getCheckChart(ShipCheckShow shipCheckShow){
        List<Map<String,Object>> shipLengthList = shipMapper.getLengthList(shipCheckShow);
        List<Map<String,Object>> materialList = shipMapper.getmaterialList(shipCheckShow);
        List<Map<String,Object>> jobAreaList = shipMapper.getJobAreaList(shipCheckShow);
        Map<String,List<Map<String,Object>>> tmpMap = new HashMap<String,List<Map<String,Object>>>();
        tmpMap.put("shipLengthList",shipLengthList);
        tmpMap.put("materialList",materialList);
        tmpMap.put("jobAreaList",jobAreaList);
        return tmpMap;
    }

    @Override
    public Map getWorkload(ShipCheck shipCheck) {
        String startYear = shipCheck.getStartYear();
        String endYear = shipCheck.getEndYear();
        Calendar cal=Calendar.getInstance();
        if(!StringUtils.hasText(startYear)&&!StringUtils.hasText(endYear)){
            shipCheck.setStartYear(String.valueOf(cal.get(Calendar.YEAR)-6));
            shipCheck.setEndYear(String.valueOf(cal.get(Calendar.YEAR)-1));
        }else if(!StringUtils.hasText(startYear)&&StringUtils.hasText(endYear)){
            shipCheck.setStartYear(String.valueOf(Integer.parseInt(endYear)-5));
        }else if(StringUtils.hasText(startYear)&&!StringUtils.hasText(endYear)){
            shipCheck.setEndYear(String.valueOf(Integer.parseInt(startYear)+5));
        }else{}
        //默认国内海洋
        if(shipCheck.getJobarea()==null||"".equals(shipCheck.getJobarea())){
            shipCheck.setJobarea("国内海洋");
        }
        //本人每年检验工作量
        List<Map<String,Object>> selfWorkList = shipMapper.getMyWorkList(shipCheck);
        //所有人检验工作量
        List<Map<String,Object>> allWorkList = new ArrayList<Map<String,Object>>();
        //每年有多少人检验工作
        List<Map<String,Object>> allPersonList = new ArrayList<Map<String,Object>>();

        if(selfWorkList.size()==0){
            shipCheck.setJobarea("内河");
            selfWorkList =  shipMapper.getMyWorkList(shipCheck);
            if(selfWorkList.size()==0){
                shipCheck.setJobarea("远洋");
                selfWorkList =  shipMapper.getMyWorkList(shipCheck);
                if(selfWorkList.size()==0){
                    shipCheck.setJobarea("图纸");
                    selfWorkList =  shipMapper.getMyWorkForDrawList(shipCheck);
                    allWorkList = shipMapper.getInsAllForDrawList(shipCheck);
                    allPersonList = shipMapper.getPersonNumForDraw(shipCheck);
                    if(selfWorkList.size()==0){
                        shipCheck.setJobarea("产品");
                        selfWorkList =  shipMapper.getMyWorkForProductList(shipCheck);
                        allWorkList = shipMapper.getInsAllForProductList(shipCheck);
                        allPersonList = shipMapper.getPersonNumForProduct(shipCheck);
                    }
                }
            }
        }

        //所有人平均每年检验工作量(验船)
        if(allWorkList.size()==0){
            allWorkList = shipMapper.getInsAllList(shipCheck);
            allPersonList = shipMapper.getPersonNum(shipCheck);
        }

        //所有人平均检验工作量
        List<Map<String,Object>> avgWorkList = getAvgListFormula(allWorkList,allPersonList);
        //检验量最大值
        BigDecimal maxval = getInsMaxValue(selfWorkList,avgWorkList);

        Map tmpMap = new HashMap<String, List<Map<String,Object>>>();
        tmpMap.put("self",selfWorkList);
        tmpMap.put("avg",avgWorkList);
        tmpMap.put("type",shipCheck.getJobarea());
        tmpMap.put("maxval",maxval.toString());

        return tmpMap;
    }

    @Override
    public Map getWorkloadByYear(ShipCheck shipCheck) {
        String startYear = shipCheck.getStartYear();
        String endYear = shipCheck.getEndYear();
        Calendar cal=Calendar.getInstance();
        if(!StringUtils.hasText(startYear)&&!StringUtils.hasText(endYear)){
            shipCheck.setStartYear(String.valueOf(cal.get(Calendar.YEAR)-6));
            shipCheck.setEndYear(String.valueOf(cal.get(Calendar.YEAR)-1));
        }else if(!StringUtils.hasText(startYear)&&StringUtils.hasText(endYear)){
            shipCheck.setStartYear(String.valueOf(Integer.parseInt(endYear)-5));
        }else if(StringUtils.hasText(startYear)&&!StringUtils.hasText(endYear)){
            shipCheck.setEndYear(String.valueOf(Integer.parseInt(startYear)+5));
        }else{}

        //本人每年检验工作量
        List<Map<String,Object>> selfWorkList = new ArrayList<Map<String,Object>>();
        //所有人每年检验工作量
        List<Map<String,Object>> allWorkList = new ArrayList<Map<String,Object>>();
        //每年检验人数
        List<Map<String,Object>> allPersonList = new ArrayList<Map<String,Object>>();

        if("图纸".equals(shipCheck.getJobarea())){
            selfWorkList =  shipMapper.getMyWorkForDrawList(shipCheck);
            allWorkList = shipMapper.getInsAllForDrawList(shipCheck);
            allPersonList = shipMapper.getPersonNumForDraw(shipCheck);
        }else if("产品".equals(shipCheck.getJobarea())){
            selfWorkList =  shipMapper.getMyWorkForProductList(shipCheck);
            allWorkList = shipMapper.getInsAllForProductList(shipCheck);
            allPersonList = shipMapper.getPersonNumForProduct(shipCheck);
        }else{
            selfWorkList =  shipMapper.getMyWorkList(shipCheck);
            allWorkList = shipMapper.getInsAllList(shipCheck);
            allPersonList = shipMapper.getPersonNum(shipCheck);
        }

        //所有人平均检验量
        List<Map<String,Object>> avgWorkList = getAvgListFormula(allWorkList,allPersonList);

        //检验量最大值
        BigDecimal maxval = getInsMaxValue(selfWorkList,avgWorkList);

        Map tmpMap = new HashMap<String, List<Map<String,Object>>>();
        tmpMap.put("self",selfWorkList);
        tmpMap.put("avg",avgWorkList);
        tmpMap.put("type",shipCheck.getJobarea());
        tmpMap.put("maxval",maxval.toString());

        return tmpMap;
    }

    /**
     * 计算每年平均验船数
     * @param molecule 分子
     * @param denominator 分母
     * @return
     */
    private List<Map<String,Object>> getAvgListFormula(List<Map<String,Object>> molecule, List<Map<String,Object>> denominator){
        List<Map<String,Object>> avgList = new ArrayList<Map<String,Object>>();
        for(int i=0;i<molecule.size();i++){
            Map dMap = denominator.get(i);
            Map mMpa = molecule.get(i);
            String checkYear1 = (String)mMpa.get("CHECKYEAR");
            String checkYear2 = (String)dMap.get("CHECKYEAR");
            BigDecimal insNum = (BigDecimal)mMpa.get("CHECKNUM");
            BigDecimal personNum = (BigDecimal)dMap.get("PERSONNUM");
            if(checkYear1.equals(checkYear2)){
                BigDecimal avgNum = insNum.divide(personNum, 0, RoundingMode.HALF_UP);
                Map<String,Object> tmpMap = new HashMap<String,Object>();
                tmpMap.put("CHECKNUM",avgNum);
                tmpMap.put("CHECKYEAR",checkYear1);
                avgList.add(tmpMap);
            }
        }
        return avgList;
    }

    /**
     * 计算当前条件下最大检验量
     * @param selfList 本人检验量
     * @param avgList 平均检验量
     * @return
     */
    private BigDecimal getInsMaxValue(List<Map<String,Object>> selfList,List<Map<String,Object>> avgList){
        List maxList = new ArrayList<Map<String,Object>>();
        BigDecimal maxval = new BigDecimal(0);
        maxList.addAll(selfList);
        maxList.addAll(avgList);
        for(int i=0;i<maxList.size();i++){
            Map<String,BigDecimal> tmp = (Map<String,BigDecimal>)maxList.get(i);
            BigDecimal val = tmp.get("CHECKNUM");
            if(val.compareTo(maxval)==1){
                maxval = val;
            }
        }
        return maxval;
    }

    @Override
    public Pager<Ship> getShipListByOrgcode(ShipQueryParams queryParams, Pager pager) {
        ShipExample shipExample = new ShipExample();
        shipExample.setPage(pager);   //设置分页
        ShipExample.Criteria shipExampleCriteria = shipExample.createCriteria();//创建查询参数
        if (!StrUtils.isBlank(queryParams.getId())) {
            shipExampleCriteria.andOrgidEqualTo(queryParams.getId());
        }
        if (!StrUtils.isBlank(queryParams.getShipid())) {
            shipExampleCriteria.andShipcodeEqualTo(queryParams.getShipid());
        }
        if (!StrUtils.isBlank(queryParams.getShipname())) {
            shipExampleCriteria.andShipnameLike("%" + queryParams.getShipname() + "%");
        }
        if (!StrUtils.isBlank(queryParams.getPowerBegin())&&!StrUtils.isBlank(queryParams.getPowerEnd())) {
            shipExampleCriteria.andPowerBetween(Float.parseFloat(queryParams.getPowerBegin()),Float.parseFloat(queryParams.getPowerEnd()));
        }
        if (!StrUtils.isBlank(queryParams.getMaterial())) {
            List<String> materials = Arrays.asList(queryParams.getMaterial().split(","));
            shipExampleCriteria.andShipmaterialIn(materials);
        }
        if (!StrUtils.isBlank(queryParams.getJobArea())) {
            shipExampleCriteria.andJobareaIn(Arrays.asList(queryParams.getJobArea().split(",")));
        }
        if (!StrUtils.isBlank(queryParams.getLengthType())) {
            String[] lengthType = queryParams.getLengthType().split(",");
            StringBuffer sb = new StringBuffer(100);
            sb.append("1=1 and (");
            for (int i=0;i<lengthType.length;i++){
                if ("0".equals(lengthType[i])) {
                    sb.append(" cs_shiplength between 0 and 12");
                    if (i!=lengthType.length-1) {
                        sb.append(" or");
                    }
                }else if("1".equals(lengthType[i])){
                    sb.append(" cs_shiplength between 12 and 24");
                    if (i!=lengthType.length-1) {
                        sb.append(" or");
                    }
                }else if("2".equals(lengthType[i])){
                    sb.append(" cs_shiplength between 24 and 45");
                    if (i!=lengthType.length-1) {
                        sb.append(" or");
                    }
                }else if("3".equals(lengthType[i])){
                    sb.append(" cs_shiplength > 45");
                }
            }
            sb.append(")");
            shipExampleCriteria.addCondition(sb.toString());
        }
        List<Ship> shipList=shipMapper.selectByExample(shipExample);
        pager.setPagerInfo(shipList,shipMapper.countByExample(shipExample));
        return pager;
    }

    @Override
    public ShipShow getShipInfo(ShipShow ship) {
        ShipShow ss = shipMapper.getShipinfo(ship);
        return ss;
    }

    @Override
    public List<ProductShow> getProductsCheckList(ShipShow ship)
    {
        List<ProductShow> backList = new ArrayList<ProductShow>();
        ProductShow ps0 = new ProductShow();
        ps0.setProductName("该船产品列表");
        ps0.setId("yjml");
        ps0.setPid("root");
        backList.add(ps0);

        List<ProductShow> psList = shipMapper.getProChcByCt(ship);//查询此渔船上产品的最新产品检验信息?
        if (psList != null && psList.size() > 0)
        {
            ProductShow productShow = psList.get(0);
            List<Map> ptList = shipMapper.getProductsGroupPt(productShow);//查询此渔船上产品的所有产品类别
            for(int i=0;i<ptList.size();i++)
            {
                Map map =ptList.get(i);
                if(map!=null)
                {
                    ProductShow ps = new ProductShow();
                    if(!StrUtils.isBlank(map.get("PTYPE")))
                    {
                        ps.setProductType(map.get("PTYPE").toString());
                        ps.setProductName(map.get(Constant.CODE_TRANS_PRE+"PNAME").toString());
                    }
                    else
                    {
                        ps.setProductType("");
                        ps.setProductName("其他");
                    }
                    ps.setCheckTime(productShow.getCheckTime());
                    ps.setShipcode(ship.getShipcode());
                    ps.setShipCheckType(productShow.getShipCheckType());
                    ps.setPid("yjml");
                    ps.setId(String.valueOf(i));

                    List<ProductShow> psLists = shipMapper.getProductsByScpt(ps);//查询每个类别下的所有产品
                    ps.setProductSum(psLists.size());
                    backList.add(ps);

                    for(int j=0;j<psLists.size();j++)
                    {
                        ProductShow ps1 =psLists.get(j);
                        if(!StrUtils.isBlank(map.get("PTYPE")))
                        {
                            ps1.setProductType(map.get("PTYPE").toString());
                        }
                        else
                        {
                            ps1.setProductType("");
                        }
                        ps1.setPid(String.valueOf(i));
                        backList.add(ps1);
                    }
                }
            }
        }

//        List<ProductShow> backList = new ArrayList<ProductShow>();
//        ProductShow ps0 = new ProductShow();
//        ps0.setProductName("该船产品列表");
//        ps0.setId("yjml");
//        ps0.setPid("root");
//
//        List<ProductShow> psList = shipMapper.getProChcByCt(ship);
//        if (psList != null && psList.size() > 0)
//        {
//            ProductShow productShow = psList.get(0);
//            List<Map> ptList = shipMapper.getProductsGroupPt(productShow);
//            List<ProductShow> p2List = new ArrayList<ProductShow>();
//            for(int i=0;i<ptList.size();i++)
//            {
//                Map map =ptList.get(i);
//                if(map!=null)
//                {
//                    ProductShow ps = new ProductShow();
//                    ps.setProductType(map.get("PTYPE").toString());
//                    ps.setProductName(map.get(Constant.CODE_TRANS_PRE+"PNAME").toString());
//                    ps.setCheckTime(productShow.getCheckTime());
//                    ps.setShipcode(ship.getShipcode());
//                    ps.setShipCheckType(productShow.getShipCheckType());
//                    ps.setPid("yjml");
//                    ps.setId(String.valueOf(i));
//
//                    List<ProductShow> psLists = shipMapper.getProductsByScpt(ps);
//                    List<ProductShow> p3List = new ArrayList<ProductShow>();
//                    for(int j=0;j<psLists.size();j++)
//                    {
//                        ProductShow ps1 =psLists.get(j);
//                        ps1.setProductType(map.get("PTYPE").toString());
//                        ps1.setPid(String.valueOf(i));
//                        p3List.add(ps1);
//                    }
//                    ps.setChildList(p3List);
//                    p2List.add(ps);
//                }
//            }
//            ps0.setChildList(p2List);
//        }
//        backList.add(ps0);
        return backList;
    }

    @Override
    public ProductShow getProductsList(ShipShow ship) {
        List<ProductShow> pcList = shipMapper.getProductsList(ship);
        List<Map<String,String>> dictList = shipMapper.getCplbList();
        ProductShow ps0 = new ProductShow();
        List<ProductShow> list1 = new ArrayList<ProductShow>();
        List<ProductShow> list2 = new ArrayList<ProductShow>();
        List<ProductShow> list3 = new ArrayList<ProductShow>();
        for(Map<String,String> tmpMap : dictList){
            String name = tmpMap.get("NAME");
            String value = tmpMap.get("VALUE");
            String cate = tmpMap.get("CATE");
            String pvalue = tmpMap.get("PVALUE");
            if(Const.PRO_TYPE_FIR.equals(cate)){
                ProductShow ps1 = new ProductShow();
                ps1.setProductType(value);
                ps1.setProductName(name);
                ps1.setpProductType(pvalue);
                list1.add(ps1);
            }
            if(Const.PRO_TYPE_SEC.equals(cate)){
                ProductShow ps2 = new ProductShow();
                ps2.setProductType(value);
                ps2.setProductName(name);
                ps2.setpProductType(pvalue);
                list2.add(ps2);
            }
            if(Const.PRO_TYPE_THI.equals(cate)){
                ProductShow ps3 = new ProductShow();
                ps3.setProductType(value);
                ps3.setProductName(name);
                ps3.setpProductType(pvalue);
                list3.add(ps3);
            }
        }

        for (ProductShow pp: pcList) {
            if (pp.getProductType3() == null) {
                for (ProductShow p2: list2) {
                    List<ProductShow> childList = p2.getChildList();
                    if (childList == null) {
                        childList = new ArrayList<>();
                    }
                    if (pp.getProductType2().equals(p2.getProductType())) {
                        childList.add(pp);
                        p2.setChildList(childList);
                        break;
                    }
                }
            }else {
                for (ProductShow p3: list3) {
                    List<ProductShow> childList = p3.getChildList();
                    if (childList == null) {
                        childList = new ArrayList<>();
                    }
                    if (pp.getProductType2().equals(p3.getProductType())) {
                        childList.add(pp);
                        p3.setChildList(childList);
                        break;
                    }
                }
            }
        }

        for (ProductShow p3: list3){
            for (ProductShow p2: list2) {
                List<ProductShow> childList = p2.getChildList();
                if (childList == null) {
                    childList = new ArrayList<>();
                }
                if (p3.getpProductType().equals(p2.getProductType())) {
                    childList.add(p3);
                    p2.setChildList(childList);
                    break;
                }
            }
        }

        for (ProductShow p2: list2){
            for (ProductShow p1: list1) {
                List<ProductShow> childList = p1.getChildList();
                if (childList == null) {
                    childList = new ArrayList<>();
                }
                if (p2.getpProductType()!=null&&p2.getpProductType().equals(p1.getProductType())) {
                    childList.add(p2);
                    p1.setChildList(childList);
                    break;
                }
            }
        }


//        List<ProductShow> ps1List = new ArrayList<ProductShow>();
//        for(ProductShow ps1 : list1){
//            List<ProductShow> ps2List = new ArrayList<ProductShow>();
//            for(ProductShow pp: list2){
//                if(ps1.getProductType().equals(pp.getpProductType())){
//                    ps2List.add(pp);
//                }
//            }
//            //-----二级目录
//            for(ProductShow ps2 : ps2List){
//                List<ProductShow> ps3List = new ArrayList<ProductShow>();
//                for(ProductShow pp: list3){
//                    if(ps2.getProductType().equals(pp.getpProductType())){
//                        ps3List.add(pp);
//                    }
//                }
//                //------三级目录
//                for (ProductShow p3:ps3List){
//                    List<ProductShow> ps4List = new ArrayList<ProductShow>();
//                    for(ProductShow pp:pcList){
//                        if (pp.getProductType3()!=null&&pp.getProductType2().equals(p3.getpProductType())){
//                            ps4List.add(pp);
//                        }
//                    }
//                    if (ps4List.size() > 0) {
//                        p3.setChildList(ps4List);
//                    }
//                }
//
//                for (ProductShow pp:pcList){
//                    if (pp.getProductType3() == null&&pp.getProductType2().equals(ps2.getpProductType())) {
//                        ps3List.add(pp);
//                    }
//                }
//                if(ps3List.size()>0){
//                    ps2.setChildList(ps3List);
//                    ps2List.add(ps2);
//                }
//            }
//            ps1.setChildList(ps2List);
//            ps1List.add(ps1);
//        }
        ps0.setProductName("该船产品列表");
        ps0.setProductType("0");
        ps0.setChildList(list1);
        return ps0;
    }

    @Override
    public ProductShow getProductsList2(ShipShow ship) {

        ProductShow ps0 = new ProductShow();
        ps0.setProductName("该船产品列表");
        ps0.setId("yjml");
        ps0.setPid("root");
        List<ProductShow> psList = shipMapper.getProChcByCt(ship);
        if (psList != null && psList.size() > 0)
        {
            ProductShow productShow = psList.get(0);
            List<Map> ptList = shipMapper.getProductsGroupPt(productShow);
            List<ProductShow> p2List = new ArrayList<ProductShow>();
            for(int i=0;i<ptList.size();i++)
            {
                Map map =ptList.get(i);
                if(map!=null)
                {
                    ProductShow ps = new ProductShow();
                    ps.setProductType(map.get("PTYPE").toString());
                    ps.setProductName(map.get(Constant.CODE_TRANS_PRE+"pName").toString());
                    ps.setCheckTime(productShow.getCheckTime());
                    ps.setShipcode(ship.getShipcode());
                    ps.setShipCheckType(productShow.getShipCheckType());
                    ps.setPid("yjml");
                    ps.setId(String.valueOf(i));

                    List<ProductShow> psLists = shipMapper.getProductsByScpt(ps);
                    List<ProductShow> p3List = new ArrayList<ProductShow>();
                    for(int j=0;j<psLists.size();j++)
                    {
                        ProductShow ps1 =psLists.get(j);
                        ps1.setProductType(map.get("PTYPE").toString());
                        ps1.setPid(String.valueOf(i));
                        p3List.add(ps1);
                    }
                    ps.setChildList(p3List);
                    p2List.add(ps);
                }
            }
            ps0.setChildList(p2List);
        }
        return ps0;
    }

    @Override
    public List<ShipTrace> getShipFollowList(ShipShow ship) {
        if(ship.getShipcode()==null){
            return new ArrayList<ShipTrace>();
        }
        List<ShipTrace> stList = shipMapper.getShipTraceList(ship);
        List<ImageManager> imgList = imageManagerMapper.getAllImageList();
        List<DocumentManager> docList = documentManagerMapper.getAllDocList();
        for(ShipTrace st: stList){
            List<ImageManager> tmpImgList = new ArrayList<ImageManager>();
            for(ImageManager imm: imgList){
                if(!StrUtils.isBlank(st.getRefid())&&st.getRefid().equals(imm.getRefid2())){
                    tmpImgList.add(imm);
                }
            }
            st.setImgList(tmpImgList);
            List<DocumentManager> tmpDocList = new ArrayList<DocumentManager>();
            for(DocumentManager docm: docList){
                if(!StrUtils.isBlank(st.getRefid())&&st.getRefid().equals(docm.getRefid2())){
                    tmpDocList.add(docm);
                }
            }
            st.setDocList(tmpDocList);
            if(!StrUtils.isBlank(st.getAuditTime())){
                st.setAuditYear(st.getAuditTime().substring(0,4));
            }
        }
        return stList;
    }

    @Override
    public List<ProductTrace> getProductsCheckList(ProductShow ps) {
        if(ps.getCheckUid()==null){
            return new ArrayList<ProductTrace>();
        }
        List<ProductTrace> ptList = shipMapper.getProductTraceList(ps);
        List<ImageManager> imgList = imageManagerMapper.getAllImageList();
        List<DocumentManager> docList = documentManagerMapper.getAllDocList();
        for(ProductTrace pt: ptList){
            List<ImageManager> tmpImgList = new ArrayList<ImageManager>();
            for(ImageManager imm: imgList){
                if(!StrUtils.isBlank(pt.getUuid())&&pt.getUuid().equals(imm.getRefid2())){
                    tmpImgList.add(imm);
                }
            }
            pt.setImgList(tmpImgList);
            List<DocumentManager> tmpDocList = new ArrayList<DocumentManager>();
            for(DocumentManager docm: docList){
                if(!StrUtils.isBlank(pt.getUuid())&&pt.getUuid().equals(docm.getRefid2())){
                    tmpDocList.add(docm);
                }
            }
            pt.setDocList(tmpDocList);
            if(!StrUtils.isBlank(pt.getInsTime())){
                pt.setAuditYear(pt.getInsTime().substring(0,4));
            }
        }
        return ptList;
    }

    @Override
    public ProductShow getProductShow(ProductShow ps) {
        ProductShow psNew = shipMapper.getProductShow(ps);
        if(psNew == null){
            psNew = ps;
        }
        return psNew;
    }

    @Override
    public Map<String, String> getGNShipGis(ShipShow ship) {
        Map map = new HashMap();
        map = gnShipMapper.getByShipShow(ship);
        return map;
    }

    @Override
    public Map<String, String> getYYShipGis(ShipShow ship) {
        Map map = new HashMap();
        map = yyShipMapper.getByShipShow(ship);
        return map;
    }
    @Override
    public Pager getInspectList(Pager pager){
        ShipCheckShow shi=new ShipCheckShow();
        shi.setPage(pager);
        List<Map<String,String>> list=shipMapper.getInspectList(shi);
        for(int i=0;i<list.size();i++){
            if(StrUtils.isBlank(list.get(i).get("CS_REGCERTDATE"))){
                list.get(i).put("CS_REGCERTDATE","0");
            }
            if(StrUtils.isBlank(list.get(i).get("CS_OWNERTEL"))){
                list.get(i).put("CS_OWNERTEL","0");
            }
        }
        pager.setPagerInfo(list,shipMapper.getInspectListCount(shi));
        return pager;
    }
    @Override
    public List getFinalList(List proShipList) {

        Collections.sort(proShipList,new Comparator<Object>(){
            public int compare(Object arg0, Object arg1) {
                ShipTrace st0 = new ShipTrace();
                ProductTrace pt0 = new ProductTrace();
                ShipTrace st1 = new ShipTrace();
                ProductTrace pt1 = new ProductTrace();
                if(arg0 instanceof ShipTrace){
                    st0 = (ShipTrace)arg0;
                    if(arg1 instanceof ShipTrace){
                        st1 = (ShipTrace)arg1;
                        if (st0.getAuditTime() != null) {
                            return st0.getAuditTime().compareTo(st1.getAuditTime());
                        }else{
                            return -1;
                        }
                    }else{
                        pt1 = (ProductTrace)arg1;
                        if (st0.getAuditTime() != null) {
                            return st0.getAuditTime().compareTo(pt1.getInsTime());
                        }else{
                            return -1;
                        }
                    }
                }else{
                    pt0 = (ProductTrace)arg0;
                    if(arg1 instanceof ShipTrace){
                        st1 = (ShipTrace)arg1;
                        return pt0.getInsTime().compareTo(st1.getAuditTime());
                    }else{
                        pt1 = (ProductTrace)arg1;
                        return pt0.getInsTime().compareTo(pt1.getInsTime());
                    }
                }
            }
        });

        List finalList = new ArrayList();
        String lastYear = "";
        Map map = new HashMap();
        List curList = new ArrayList();
        for (int i = 0; i < proShipList.size(); i++) {
            Object obj = proShipList.get(i);
            String curYear;

            if (obj instanceof ShipTrace) {
                curYear = ((ShipTrace) obj).getAuditYear();
            } else {
                curYear = ((ProductTrace) obj).getAuditYear();
            }
            if (curYear == null) {
                curYear = "";
            }
            if (i == 0) {
                curList.add(obj);
                map.put("year",curYear);
                map.put("dataList", curList);
            }else{
                if (curYear.equals(lastYear)) {
                    curList.add(obj);
                    if (i == proShipList.size()) {
                        finalList.add(map);
                    }
                } else {
                    finalList.add(map);
                    map = new HashMap();
                    map.put("year", curYear);
                    curList = new ArrayList();
                    curList.add(obj);
                    map.put("dataList", curList);
                }
            }
            lastYear=curYear;
        }
        return finalList;
    }

    @Override
    public Ship getShipDetail(Ship ship) {
        Ship shipDetail = shipMapper.getShipDetail(ship);
        return shipDetail;
    }

    /**
     * 根据产品编码获取产品信息
     */
    @Override
    public Map getProductinfo(ProductShow ps) {
        Map productShow= shipMapper.getProductinfo(ps);
        if(productShow!=null){
            if(StrUtils.isBlank(productShow.get("CP_NAME"))){
                productShow.put("CP_NAME","0");
            }
            if(StrUtils.isBlank(productShow.get("CP_CPBH"))){
                productShow.put("CP_CPBH","0");
            }
            if(StrUtils.isBlank(productShow.get("CP_CERTNUM"))){
                productShow.put("CP_CERTNUM","0");
            }
            if(StrUtils.isBlank(productShow.get("CE_CREDITCODE"))){
                productShow.put("CE_CREDITCODE","0");
            }
            if(StrUtils.isBlank(productShow.get("CP_CPXH"))){
                productShow.put("CP_CPXH","0");
            }
            if(StrUtils.isBlank(productShow.get("CE_ENTNAME"))){
                productShow.put("CE_ENTNAME","0");
            }
            if(StrUtils.isBlank(productShow.get("CE_ADDRESS"))){
                productShow.put("CE_ADDRESS","0");
            }
            if(StrUtils.isBlank(productShow.get("CP_TZPZH"))){
                productShow.put("CP_TZPZH","0");
            }
            if(StrUtils.isBlank(productShow.get("CE_ENTNAME"))){
                productShow.put("CE_ENTNAME","0");
            }
            if(StrUtils.isBlank(productShow.get("CE_ADDRESS"))){
                productShow.put("CE_ADDRESS","0");
            }
            if(StrUtils.isBlank(productShow.get("CEQ_ENTEMAIL"))){
                productShow.put("CEQ_ENTEMAIL","0");
            }
            if(StrUtils.isBlank(productShow.get("CEQ_POSTALCODE"))){
                productShow.put("CEQ_POSTALCODE","0");
            }
            if(StrUtils.isBlank(productShow.get("CEQ_TELPHONE"))){
                productShow.put("CEQ_TELPHONE","0");
            }
            if(StrUtils.isBlank(productShow.get("CEQ_CONTACT"))){
                productShow.put("CEQ_CONTACT","0");
            }
            if(StrUtils.isBlank(productShow.get("CPH_ENTID"))){
                productShow.put("CPH_ENTID","0");
            }
            if(StrUtils.isBlank(productShow.get("CPH_CHECKTIMENEXT"))){
                productShow.put("CPH_CHECKTIMENEXT","0");
            }
            if(StrUtils.isBlank(productShow.get("CPH_CERTADDR"))){
                productShow.put("CPH_CERTADDR","0");
            }
            if(StrUtils.isBlank(productShow.get("CPH_CERTTIME"))){
                productShow.put("CPH_CERTTIME","0");
            }
            if(StrUtils.isBlank(productShow.get("CP_CATE"))){
                productShow.put("CP_CATE","0");
            }
        }
        return productShow;
    }

    /**
     * 根据产品编码获取产品追溯信息
     * @param ps
     * @return
     */
    @Override
   public List<Map<String,String>> getProductHistory(ProductShow ps){
        List<Map<String,String>> list=shipMapper.getProductHistory(ps);
        for(int i=0;i<list.size();i++){
            if(StrUtils.isBlank(list.get(i).get("STARTTIME"))){
                list.get(i).put("STARTTIME","0");
            }
            if(StrUtils.isBlank(list.get(i).get("NAME"))){
                list.get(i).put("NAME","0");
            }
            if(StrUtils.isBlank(list.get(i).get("TYPE"))){
                list.get(i).put("TYPE","0");
            }
            if(StrUtils.isBlank(list.get(i).get("CERTIFICATENUMBER"))){
                list.get(i).put("CERTIFICATENUMBER","0");
            }
            if(StrUtils.isBlank(list.get(i).get("VALIDTIMEORRESULT"))){
                list.get(i).put("VALIDTIMEORRESULT","0");
            }
            if(StrUtils.isBlank(list.get(i).get("HISTORYTYPE"))){
                list.get(i).put("HISTORYTYPE","0");
            }
            if(StrUtils.isBlank(list.get(i).get("PRODUCTNUMBER"))){
                list.get(i).put("PRODUCTNUMBER","0");
            }
        }
        return list;
    }

    @Override
    public Object getShipPos(Ship ship) {
        Object result = null;
        if (!StrUtils.isBlank(ship.getShipcode())){
            ShipExample shipExample = new ShipExample();
            ShipExample.Criteria criteria = shipExample.createCriteria();
            criteria.andShipcodeEqualTo(ship.getShipcode());
            List<Ship> ships = shipMapper.selectByExample(shipExample);
            if (ships.size()>0){
                String jobArea = ships.get(0).getJobarea();
                if (jobArea.equals(Const.OCEAN_STR)) {//远洋
                    result = yyShipMapper.getByCode(ship.getShipcode());
                }else if(jobArea.equals(Const.DOMESTIC_OCEAN_STR)){//国内海洋
                    result = gnShipMapper.getByCode(ship.getShipcode());
                }
            }
        }
        return result;
    }

}
