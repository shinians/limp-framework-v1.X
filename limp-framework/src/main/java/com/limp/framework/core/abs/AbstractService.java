package com.limp.framework.core.abs;

import com.limp.framework.boss.domain.User;
import com.limp.framework.core.bean.Pager;

import java.io.Serializable;
import java.util.List;

public interface AbstractService<T extends AbstractModel> {

    public abstract boolean save(T entry);

    public abstract T get(Serializable id);

    public abstract boolean update(T entry);

    public abstract boolean delete(Serializable id);

    public abstract List<T> getList();




/*
    public abstract List<T> getListExample(T entry);

    public abstract List<T> getListPage(Pager pager);
*/
}
