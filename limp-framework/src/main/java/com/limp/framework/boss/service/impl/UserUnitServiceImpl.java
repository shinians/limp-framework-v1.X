package com.limp.framework.boss.service.impl;

import com.limp.framework.boss.domain.UserUnit;
import com.limp.framework.boss.domain.UserUnitExample;
import com.limp.framework.boss.mapper.oracle.UserUnitMapper;
import com.limp.framework.boss.service.UserUnitService;
import com.limp.framework.core.constant.Constant;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-7-6
 * Time: 下午11:10
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserUnitServiceImpl implements UserUnitService {
  @Resource
  private UserUnitMapper userUnitMapper;
    @Override
    public boolean save(UserUnit entry) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public UserUnit get(Serializable id) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean update(UserUnit entry) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(Serializable id) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<UserUnit> getList() {
        UserUnitExample userUnitExample=new UserUnitExample();
        userUnitExample.createCriteria().andStateEqualTo(new Short(Constant.STRING_1));
        return userUnitMapper.selectByExample(userUnitExample);  //To change body of implemented methods use File | Settings | File Templates.
    }
}
