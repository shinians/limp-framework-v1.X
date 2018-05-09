package com.limp.framework.boss.service;

import com.limp.framework.boss.domain.MSG;
import com.limp.framework.core.bean.Pager;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 16-1-30
 * Time: 下午7:37
 * To change this template use File | Settings | File Templates.
 */

public interface MsgService {
    public Pager<MSG> getListExample(String orderName, String orderType, MSG msg, Pager pager);

    public boolean saveMsg(MSG msg);

    public boolean update(MSG msg);

    public Integer getMsgNum(MSG msg);

    public List<MSG> getListMsg();
}
