package com.limp.framework.boss.service.impl;

import com.limp.framework.boss.domain.AreaCode;
import com.limp.framework.boss.domain.AreaCodeExample;
import com.limp.framework.boss.mapper.oracle.AreaCodeMapper;
import com.limp.framework.boss.service.AreaCodeService;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.utils.StoreControl;
import com.limp.framework.utils.StrUtils;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 16-12-12
 * Time: 下午11:02
 * To change this template use File | Settings | File Templates.
 */
@Service
public class AreaCodeServiceImpl implements AreaCodeService {
    private static Logger log= Logger.getLogger(AreaCodeService.class);

    @Resource
    private AreaCodeMapper areaCodeMapper;


    @Override
    public Pager<AreaCode> getAreaPageList(Pager pager, AreaCode areaCode) {
        AreaCodeExample areaCodeExample = new AreaCodeExample();
        areaCodeExample.setPage(pager);
        AreaCodeExample.Criteria criteria = areaCodeExample.createCriteria();

        if(!StrUtils.isBlank(areaCode.getCode())){
            criteria.andCodeLike("%" + areaCode.getCode() + "%");
        }
        if(StrUtils.isBlank(areaCode.getType())){
            areaCode.setType(new Short(Constant.STRING_1));
        }
        if(!StrUtils.isBlank(areaCode.getName())){
            criteria.andNameLike("%" + areaCode.getName() + "%");
        }
        //类型默认为1
        criteria.andTypeEqualTo(areaCode.getType());

        //层级
        if(!StrUtils.isBlank(areaCode.getLv())){
            criteria.andLvEqualTo(areaCode.getLv());
        }
        if(!StrUtils.isBlank(areaCode.getPcode())){
            criteria.andPcodeEqualTo(areaCode.getPcode());
        }
        /**
         * 排序
         */
        if(!StrUtils.isBlank(areaCode.getLpsort())){
            areaCodeExample.setOrderByClause(areaCode.getLpsort());
        }

        //状态为1
        criteria.andStateEqualTo(new Short(Constant.STRING_1));

        List<AreaCode> areaCodeList=new ArrayList<AreaCode>();
        if(Constant.DB_MYSQL.equals(StoreControl.getValue(Constant.DB_KEY))){
            log.debug("-->开始查询mysql数据库用户信息<---");
            areaCodeList=areaCodeMapper.selectByExampleByMsql(areaCodeExample);
        }else{
            areaCodeList=areaCodeMapper.selectByExample(areaCodeExample);
        }
//        List<DicCodes> dicCodesList=dicCodesMapper.selectByExample(dicCodesExample);

        pager.setPagerInfo(areaCodeList,areaCodeMapper.countByExample(areaCodeExample));
        return pager;
    }

    @Override
    public List<AreaCode> getAreaCodeListByDomain(AreaCode areaCode) {
        AreaCodeExample example=new AreaCodeExample();

        AreaCodeExample.Criteria criteria=example.createCriteria();

        if(!StrUtils.isBlank(areaCode.getCode())){
            criteria.andCodeLike("%" + areaCode.getCode() + "%");
        }
        if(StrUtils.isBlank(areaCode.getType())){
            areaCode.setType(new Short(Constant.STRING_1));
        }
        if(!StrUtils.isBlank(areaCode.getPcode())){
            criteria.andPcodeEqualTo(areaCode.getPcode());
        }
        if(!StrUtils.isBlank(areaCode.getLpsort())){
            example.setOrderByClause(areaCode.getLpsort());
        }
        //类型默认为1
        criteria.andTypeEqualTo(areaCode.getType());

        //层级【只有pcode为空时才走层级判断】
        if(!StrUtils.isBlank(areaCode.getLv())&&StrUtils.isBlank(areaCode.getPcode())){
            criteria.andLvEqualTo(areaCode.getLv());
        }

        //状态为1
        criteria.andStateEqualTo(new Short(Constant.STRING_1));

        return areaCodeMapper.selectByExample(example);
    }

    @Override
    public boolean save(AreaCode entry) {
        if(StrUtils.isBlank(entry.getCode())){
           return false;
        }
        entry.setType(new Short(Constant.STRING_1));
        return 1==areaCodeMapper.insertSelective(entry)?true:false;
    }

    @Override
    public AreaCode get(Serializable id) {
        return null;
    }

    @Override
    public boolean update(AreaCode entry) {
        AreaCodeExample areaCodeExample=new AreaCodeExample();

        if(StrUtils.isBlank(entry.getCode())){
            return  false;
        }
        areaCodeExample.createCriteria().andCodeEqualTo(entry.getCode());

        return Constant.NUMBER_1==areaCodeMapper.updateByExampleSelective(entry,areaCodeExample)?true:false;

    }

    @Override
    public boolean delete(Serializable id) {
        if(StrUtils.isBlank(id)){
            return false;
        }
        //更具key_value 删除
        AreaCodeExample areaCodeExample=new AreaCodeExample();
        AreaCodeExample.Criteria criteria=areaCodeExample.createCriteria();
        criteria.andCodeEqualTo(id.toString());
        AreaCode areaCode=new AreaCode();
        areaCode.setState(new Short(Constant.STRING_DEL_STATE));
        return areaCodeMapper.updateByExampleSelective(areaCode,areaCodeExample)==Constant.NUMBER_1?true:false;
    }

    @Override
    public List<AreaCode> getList() {
        return null;
    }
}
