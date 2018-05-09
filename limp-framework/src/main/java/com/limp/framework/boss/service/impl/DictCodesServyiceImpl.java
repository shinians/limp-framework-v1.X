package com.limp.framework.boss.service.impl;

import com.limp.framework.boss.domain.DicCodes;
import com.limp.framework.boss.domain.DicCodesExample;
import com.limp.framework.boss.domain.PageLog;
import com.limp.framework.boss.mapper.oracle.DicCodesMapper;
import com.limp.framework.boss.service.DictCodesService;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.utils.StoreControl;
import com.limp.framework.utils.StrUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * @author: zzh
 * Date: 16-12-12
 * Time: 下午11:02
 * To change this template use File | Settings | File Templates.
 */
@Service
public class DictCodesServyiceImpl implements DictCodesService {

    private static Logger log= Logger.getLogger(DictCodesServyiceImpl.class);


    @Resource
    private DicCodesMapper dicCodesMapper ;

    /**
     * 查询码表列表
     * @param orderStr  排序字符串：如 USR_CREATEDATE DESC
     * @param dicCodes  要查询的实体类：查询条件可初始化dicCode
     * @param pager  分页对象
     * @return 每页的数据 Pager
     */
    @Override
    public Pager<DicCodes> getPageDomainList(String orderStr,DicCodes  dicCodes, Pager pager) {
        DicCodesExample dicCodesExample = new DicCodesExample();
        dicCodesExample.setPage(pager);
        DicCodesExample.Criteria criteria = dicCodesExample.createCriteria();

        //如果 key值不为空，则根据key值模糊查询数据
        if (!StrUtils.isBlank(dicCodes.getDictKey())) {
            criteria.andDictKeyEqualTo(dicCodes.getDictKey());
        }
        //如果 cate大分类不为空，则根据cate值模糊查询数据
        if (!StrUtils.isBlank(dicCodes.getDictCate())) {
            criteria.andDictCateEqualTo(dicCodes.getDictCate());
        }
        //如果 vale小分类不为空，则根据value小分类查询数据
        if (!StrUtils.isBlank(dicCodes.getDictdataValue())) {
            criteria.andDictdataValueEqualTo(dicCodes.getDictdataValue());
        }
        //如果 dataname分类名称不为空，则根据分类名称模糊查询数据
        if (!StrUtils.isBlank(dicCodes.getDictdataName())) {
            criteria.andDictdataNameLike("%" + dicCodes.getDictdataName()+"%");
        }
        //如果 分类miaoshu不为空，则根据分类名称模糊查询数据
        if (!StrUtils.isBlank(dicCodes.getDictIntro())) {
            criteria.andDictIntroLike("%" + dicCodes.getDictIntro()+"%");
        }
        //若排序字段不为空，则根据此字段排序
        if (!StrUtils.isBlank(orderStr)) {
            //"USR_CREATEDATE DESC"
            dicCodesExample.setOrderByClause(orderStr);
        }

        List<DicCodes> dicCodesList=new ArrayList<DicCodes>();
        if(Constant.DB_MYSQL.equals(StoreControl.getValue(Constant.DB_KEY))){
            log.debug("-->开始查询mysql数据库用户信息<---");
            dicCodesList=dicCodesMapper.selectByExampleByMsql(dicCodesExample);
        }else{
            dicCodesList=dicCodesMapper.selectByExample(dicCodesExample);
        }
//        List<DicCodes> dicCodesList=dicCodesMapper.selectByExample(dicCodesExample);

        pager.setPagerInfo(dicCodesList,dicCodesMapper.countByExample(dicCodesExample));
        return pager;
    }

    @Override
    public List<DicCodes> getDomainList(DicCodes dicCodes) {
        DicCodesExample dicCodesExample = new DicCodesExample();
        DicCodesExample.Criteria criteria = dicCodesExample.createCriteria();

        //如果 key值不为空，则根据key值模糊查询数据
        if (!StrUtils.isBlank(dicCodes.getDictKey())) {
            criteria.andDictKeyEqualTo(dicCodes.getDictKey());
        }
        //如果 cate大分类不为空，则根据cate值模糊查询数据
        if (!StrUtils.isBlank(dicCodes.getDictCate())) {
            criteria.andDictCateEqualTo(dicCodes.getDictCate());
        }
        //如果 vale小分类不为空，则根据value小分类查询数据
        if (!StrUtils.isBlank(dicCodes.getDictdataValue())) {
            criteria.andDictdataValueEqualTo(dicCodes.getDictdataValue());
        }
        //如果 dataname分类名称不为空，则根据分类名称模糊查询数据
        if (!StrUtils.isBlank(dicCodes.getDictdataName())) {
            criteria.andDictdataNameLike("%" + dicCodes.getDictdataName()+"%");
        }
        //如果 分类miaoshu不为空，则根据分类名称模糊查询数据
        if (!StrUtils.isBlank(dicCodes.getDictIntro())) {
            criteria.andDictIntroLike("%" + dicCodes.getDictIntro()+"%");
        }
        //若排序字段不为空，则根据此字段排序
        //"USR_CREATEDATE DESC"
        dicCodesExample.setOrderByClause("DICT_SORT ASC");

        List<DicCodes> dicCodesList=dicCodesMapper.selectByExample(dicCodesExample);

        return dicCodesList;
    }

    @Override
    public Map getDicByCates(String cates) {
        Map map = new HashMap();
        DicCodes dicCodes = new DicCodes();
        String[] cateArr = cates.split(",");
        if (cateArr.length > 0) {
            for (int i=0;i<cateArr.length;i++) {
                dicCodes.setDictCate(cateArr[i]);
                List<DicCodes> codesList = this.getDomainList(dicCodes);
                map.put(cateArr[i], codesList);
            }
        }
        return map;
    }


    @Override
    public boolean save(DicCodes entry) {
        if(!StrUtils.isBlank(entry)){
           return dicCodesMapper.insertSelective(entry)==Constant.NUMBER_1?true:false;
        }
        return false;
    }

    @Override
    public DicCodes get(Serializable id) {
        return null;
    }

    @Override
    public boolean update(DicCodes entry) {
        if(StrUtils.isBlank(entry)||StrUtils.isBlank(entry.getDictKey())){
            return false;
        }
        DicCodesExample dicCodesExample=new DicCodesExample();
        DicCodesExample.Criteria criteria=dicCodesExample.createCriteria();
        criteria.andDictKeyEqualTo(entry.getDictKey());
        return dicCodesMapper.updateByExampleSelective(entry,dicCodesExample)==Constant.NUMBER_1?true:false;
    }

    @Override
    public boolean delete(Serializable id) {
        if(StrUtils.isBlank(id)){
            return false;
        }
        //更具key_value 删除
        DicCodesExample dicCodesExample=new DicCodesExample();
        DicCodesExample.Criteria criteria=dicCodesExample.createCriteria();
        criteria.andDictKeyEqualTo(id.toString());
        return dicCodesMapper.deleteByExample(dicCodesExample)==Constant.NUMBER_1?true:false;
    }

    @Override
    public List<DicCodes> getList() {
        return null;
    }
}
