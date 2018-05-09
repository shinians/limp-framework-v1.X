package com.chinasofti.sevice.impl;

import com.chinasofti.domain.ImageManager;
import com.chinasofti.domain.ImageManagerExample;
import com.chinasofti.domain.Surveyor;
import com.chinasofti.mapper.oracle.ImageManagerMapper;
import com.chinasofti.sevice.ImageService;
import com.chinasofti.sevice.TestService;
import com.limp.framework.boss.domain.MSG;
import com.limp.framework.boss.domain.MSGExample;
import com.limp.framework.boss.mapper.oracle.MSGMapper;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.utils.StrUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * 获取图片地址
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-11
 * Time: 下午6:44
 * To change this template use File | Settings | File Templates.
 */
@Service
public class TestServiceImpl implements TestService {
    @Resource
    private ImageManagerMapper imageManagerMapper;
    @Resource
    public MSGMapper mapper;


    @Override
    @Transactional
    public String saveTest() {
        MSG msg=new MSG();
        msg.setId(StrUtils.randomUUID());
        Random random=new Random();
        msg.setTitle("dddd"+random.nextInt(100));

        if(StrUtils.isBlank(msg.getId())){
            msg.setId(StrUtils.randomUUID());
        }
        if(StrUtils.isBlank(msg.getRead())){
            msg.setRead(new Short(Constant.STRING_0));
        }
        if(StrUtils.isBlank(msg.getIdt())){
            msg.setIdt(new Date());
            msg.setUdt(new Date());
        }
        msg.setStatus(new Short(Constant.STRING_1));
        mapper.insert(msg);

       Integer.parseInt("te");
        return null;
    }
}
