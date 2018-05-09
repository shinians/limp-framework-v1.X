package com.chinasofti.sevice;

import com.chinasofti.domain.DrawInfo;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by zhangxiaojin on 2017/8/2.
 * 描述：图纸审查一张图
 */

public interface DrawService {
    Map<String,Object> getDrawCheckAllInfo(DrawInfo drawInfo);

    Map<String,Object> shipCountList(DrawInfo drawInfo);

    Map<String, Object> shipRepairList(DrawInfo drawInfo);

    Map<String, Object>  drawProList(DrawInfo drawInfo);
}
