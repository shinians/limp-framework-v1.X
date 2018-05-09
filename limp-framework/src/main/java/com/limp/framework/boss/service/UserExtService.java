package com.limp.framework.boss.service;

import com.limp.framework.boss.domain.User;
import com.limp.framework.boss.domain.UserExt;
import com.limp.framework.core.abs.AbstractService;

/**
 * User: tAngo
 * Date: 14-8-8
 * Time: 上午11:00
 */
public interface UserExtService extends AbstractService<UserExt> {

    public boolean update(User user, UserExt ext);

    public boolean insert(User user, UserExt ext);

}
