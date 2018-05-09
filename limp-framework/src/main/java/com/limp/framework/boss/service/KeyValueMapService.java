package com.limp.framework.boss.service;

import com.limp.framework.boss.domain.*;
import com.limp.framework.core.abs.AbstractService;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: zzh
 * Date: 17-6-29
 * Time: 上午11:19
 * To change this template use File | Settings | File Templates.
 */
public interface KeyValueMapService extends AbstractService<KeyValueMap> {
    /**
     * 根据KID删除ids
     * @param kid
     * @param ids
     * @return
     */
    public boolean delKVMapByK(String kid, List<String> ids);

    /**
     * 新增
      * @param kid
     * @param ids
     * @return
     */
    public boolean addValuesByKId(String kid, List<String> ids);

    /**
     * 获取kvlist
     * @param keyValueMap
     * @return
     */
    public List<KeyValueMap> getKVList(KeyValueMap keyValueMap);

    public  List<Role> getRoleListByKid(List<String> roleIds);

}
