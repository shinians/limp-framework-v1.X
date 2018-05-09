package com.chinasofti.sevice.impl;

import com.chinasofti.domain.*;
import com.chinasofti.mapper.oracle.ImageManagerMapper;
import com.chinasofti.mapper.oracle.SurveyorMapper;
import com.chinasofti.sevice.ImageService;
import com.chinasofti.sevice.SurveyorService;
import com.limp.framework.boss.domain.MSG;
import com.limp.framework.boss.domain.User;
import com.limp.framework.boss.mapper.oracle.MSGMapper;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.utils.StrUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.*;

/**
 * 获取图片地址
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-11
 * Time: 下午6:44
 * To change this template use File | Settings | File Templates.
 */
@Service
public class ImageServiceImpl implements ImageService {
    @Resource
    private ImageManagerMapper imageManagerMapper;
    @Resource
    public MSGMapper mapper;

    @Override
    public boolean save(ImageManager entry) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public ImageManager get(Serializable id) {
        return null;
    }

    @Override
    public boolean update(ImageManager entry) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(Serializable id) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<ImageManager> getList() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<ImageManager> getSurImg(Surveyor surveyor) {
        List<ImageManager> imgUrls = imageManagerMapper.getSurImgByCertnum(surveyor);
        return imgUrls;
    }

    @Override
    public Pager<ImageManager> getImagesPage(ImageManager imageManager, Pager pager, String orderName, String orderType) {
        ImageManagerExample imageManagerExample = new ImageManagerExample();
        imageManagerExample.setPage(pager);   //设置分页
        ImageManagerExample.Criteria imagesExampleCriteria = imageManagerExample.createCriteria();//创建查询参数
        //企业id，机构id等实体类的的关联id
        if (!StrUtils.isBlank(imageManager.getRefid())) {
            imagesExampleCriteria.andRefidEqualTo(imageManager.getRefid());
        }
        //关联表的id（如该企业下船的图片对应的船的id）
        if (!StrUtils.isBlank(imageManager.getRefid2())) {
            imagesExampleCriteria.andRefid2EqualTo(imageManager.getRefid2());
        }
        //多个类别查询 逗号分隔
        if (!StrUtils.isBlank(imageManager.getTypenum())) {
            imagesExampleCriteria.andTypenumIn(Arrays.asList(imageManager.getTypenum().split(",")));
        }
        //todo 设置其他查询条件
        //排序设置
        if (!StrUtils.isBlank(orderName)) {
            //orderName 排序字段 数据库对应的字段
            orderType=StrUtils.isBlank(orderType)?"DESC": orderType;
            imageManagerExample.setOrderByClause(orderName+"  "+orderType);
        }
        List<ImageManager>imagesList=imageManagerMapper.selectByExample(imageManagerExample);
        pager.setPagerInfo(imagesList,imageManagerMapper.countByExample(imageManagerExample));
        return pager;
    }

    @Override
    @Transactional(propagation= Propagation.NOT_SUPPORTED)
    public String saveTest() {
        MSG msg=new MSG();
        msg.setId(StrUtils.randomUUID());
        Random random=new Random();
        msg.setTitle("dddd"+random.nextInt(100));

        if(StrUtils.isBlank(msg.getId())){
            msg.setId(StrUtils.randomUUID());
        } if(StrUtils.isBlank(msg.getRead())){
            msg.setRead(new Short(Constant.STRING_0));
        }  if(StrUtils.isBlank(msg.getIdt())){
            msg.setIdt(new Date());
            msg.setUdt(new Date());
        }
        msg.setStatus(new Short(Constant.STRING_1));

        mapper.insert(msg);

        Integer.parseInt("te");
        return null;
    }
}
