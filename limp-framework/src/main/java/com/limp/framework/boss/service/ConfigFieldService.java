package com.limp.framework.boss.service;

import com.limp.framework.boss.domain.*;
import com.limp.framework.core.abs.AbstractService;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.bean.Result;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface ConfigFieldService extends AbstractService<ConfigField> {

  public   Pager<ConfigField> getConfigFieldList(Pager pager,ConfigField configField);

  public   Pager<Config> getConfigList(Pager pager,Config config);



}