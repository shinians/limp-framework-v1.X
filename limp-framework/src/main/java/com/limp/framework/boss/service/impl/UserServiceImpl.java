package com.limp.framework.boss.service.impl;

import com.limp.framework.boss.ApplicationContext;
import com.limp.framework.boss.domain.*;
import com.limp.framework.boss.mapper.oracle.*;
import com.limp.framework.boss.service.ConfigFieldService;
import com.limp.framework.boss.service.PermissionService;
import com.limp.framework.boss.service.UserService;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.bean.ResultCode;
import com.limp.framework.core.constant.Constant;
import com.limp.framework.core.constant.ResultMsg;
import com.limp.framework.utils.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * @author: zzh
 * Date: 16-2-28
 * Time: 下午5:07
 * To change this template use File | Settings | File Templates.
 */
@Service
public class UserServiceImpl implements UserService {
    private static final Log log = LogFactory.getLog(UserServiceImpl.class);
    @Resource
    private UserMapper userMapper;
    @Resource
    private MenuMapper menuMapper;
    @Resource
    private LoginLogMapper loginLogMapper;
    @Resource
    private UserSetMapper userSetMapper;
    @Resource
    private UserMenuMapMapper userMenuMapMapper;
    @Resource
    private UserRoleMapMapper userRoleMapMapper;
    @Resource
    private PermissionService permissionService;
    @Resource
    private ConfigFieldService configFieldService;

    @Override
    public List<User> getUserInfo(String account) {
        return userMapper.getUserInfo(account);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delURoleMapByUId(String uid, List<String> roleIds) {
        log.info(TextUtils.format("根据{0},删除用户角色 :", uid));
        if (StrUtils.isBlank(uid)) {
            return false;
        }
        UserRoleMapExample  userRoleMapExample = new UserRoleMapExample();
        userRoleMapExample.createCriteria().andUrmUsrguidEqualTo(uid).andUrmUreguidIn(roleIds);
        return userRoleMapMapper.deleteByExample(userRoleMapExample) > 0;
    }

    @Override
    public boolean addURoleMapByUId(String uid, List<String> roleIds) {
        log.info(TextUtils.format("用户{0}/绑定角色{1} :", uid, Arrays.toString(roleIds.toArray(new String[0]))));
        if (StrUtils.isBlank(roleIds)) {
            return false;
        }
        for (int i = 0; i < roleIds.size(); i++) {
            if (StrUtils.isBlank(roleIds.get(i))) {
                continue;
            }
            UserRoleMap userRoleMap = new UserRoleMap();
            userRoleMap.setUrmUsrguid(uid);
            userRoleMap.setUrmUreguid(roleIds.get(i));
            userRoleMapMapper.insert(userRoleMap);
        }
        return true;
    }
@Override
    /**
     * 重置密码
     * @param account 账号
     * @param ip ip  i
     * @param nickName 昵称
     * @return
     */
    public Integer getIpLoginSize(String account,String ip,String nickName){
        if(StrUtils.isBlank(nickName)){
            LoginLogExample example=new LoginLogExample();
            example.createCriteria().andUllLogstateEqualTo(Constant.NUMBER_1)
            .andUllAccountEqualTo(account).andUllIpEqualTo(ip);
            return loginLogMapper.countByExample(example);
        }
        return 0;
    }

    @Override
    public boolean deleteMenuById(String uid, List<String> ids) {
        log.info(TextUtils.format("根据用户{0},删除菜单权限 :", uid));
        if (StrUtils.isBlank(uid)) {
            return false;
        }
        UserMenuMapExample uMenuMapExample = new UserMenuMapExample();
        uMenuMapExample.createCriteria().andUseridEqualTo(uid).andMenuidIn(ids);
        return userMenuMapMapper.deleteByExample(uMenuMapExample) > 0;
    }

    @Override
    public boolean addMenuById(String uid, List<String> ids) {
        log.info(TextUtils.format("角色{0}/绑定菜单{1} :", uid, Arrays.toString(ids.toArray(new String[0]))));
        if (ids == null) {
            return false;
        }
        for (int i = 0; i < ids.size(); i++) {
            if (StrUtils.isBlank(ids.get(i))) {
                continue;
            }
            UserMenuMap uMenuMap = new UserMenuMap();
            uMenuMap.setUserid(uid);
            uMenuMap.setMenuid(ids.get(i));
            userMenuMapMapper.insert(uMenuMap);
        }
        return true;
    }

    @Override
    public List<String> getMenus(String uid) {
        log.info(TextUtils.format("根据用户id获取用户对应的所有菜单id : {0}", uid));
        return userMapper.selectMenusByUserId(uid);  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<User> getUserList(User user) {
        UserExample userExample = new UserExample();

        UserExample.Criteria userCriteria = userExample.createCriteria();
        /**
         * 用户状态
         */
        if(!StrUtils.isBlank(user.getUsrState())){

            userCriteria.andUsrStateEqualTo(user.getUsrState());

        }
        /**
         * 用户类型
         */
        if(!StrUtils.isBlank(user.getUsrRc3())){

            userCriteria.andUsrRc3EqualTo(user.getUsrRc3());

        }
        /**
         * 用户是否过期
         */
        if(!StrUtils.isBlank(user.getUsrIsautoexpire())){

            userCriteria.andUsrIsautoexpireEqualTo(user.getUsrIsautoexpire());

        }
        if(!StrUtils.isBlank(user.getUsrAccount())){

            userCriteria.andUsrAccountLike("%" + user.getUsrAccount() + "%");

        }
        if(!StrUtils.isBlank(user.getUsrRc1())){

            userCriteria.andUsrRc1EqualTo(user.getUsrRc1());

        }

        List<User>users=new ArrayList<User>();
        if(Constant.DB_MYSQL.equals(StoreControl.getValue(Constant.DB_KEY))){
            log.debug("开始查询mysql数据库用户信息...");
            users=userMapper.selectByExampleByMsql(userExample);
        }else{
            users=userMapper.selectByExample(userExample);
        }
        return users;
    }


    @Override
    public List<UserSet> getUserSet(UserSet userSet) {
        UserSetExample userSetExample = new UserSetExample();
        UserSetExample.Criteria userCriteria = userSetExample.createCriteria();
        userCriteria.andStatusEqualTo((short) (Constant.NUMBER_1));
        if(userSet.getUserid()!=null&&!"".equals(userSet.getUserid())){
            userCriteria.andUseridEqualTo(userSet.getUserid());
        }if(userSet.getMenuid()!=null&&!"".equals(userSet.getMenuid())){
            userCriteria.andMenuidEqualTo(userSet.getMenuid());
        }
        List<UserSet>userSets=userSetMapper.selectByExample(userSetExample);
        return userSets.size()>0?userSets:null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<Map<String, Object>> getUserSetMenuMapById(String userId) {
        return  userSetMapper.selectUserSetByUserId(userId);
    }

    @Override
    public List<UserSet> getUserSetByIDKeyWord(String userId, String keyWord) {
        return  userSetMapper.selectUserSetByIDKeyWord(userId, keyWord); //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean saveUserSet(UserSet set) {
        return userSetMapper.insertSelective(set) == 1 ? true : false;
    }
    @Override
    public boolean updateUserSetByUsrMenuId(UserSet set) {
        UserSetExample userSetExample=new UserSetExample();
        userSetExample.createCriteria().andUseridEqualTo(set.getUserid()).andMenuidEqualTo(set.getMenuid());
        return userSetMapper.updateByExampleSelective(set, userSetExample) == 1 ? true : false;
    }

    /**
     * todo：事务需要优化
     * 用户登录
     * @param user
     * @param request
     * @return
     */
    @Override
    @Transactional(propagation= Propagation.REQUIRED)
    public Result login(User user,HttpServletRequest request) {
        if (log.isDebugEnabled()) {
            log.debug(TextUtils.format("用户登录->({0}:{1})", user.getUsrAccount(), user.getUsrPassword()));
        }
        //账户校验 是否为空
        if (user == null || StrUtils.isBlank(user.getUsrAccount())) {
            return Result.getInstance(ResultCode.ERROR.toString(), ResultMsg.LOGIN_NOTNULL, "", "");
        }
        //加载系统属性
        try {
            if (!permissionService.initSessionConfig(request.getSession())) {
                log.error("加载失败initSessionConfig失败，错误原因：表不存在");
            }
            ;
        } catch (Exception e) {
            log.error("--->【获取系统配置异常】<---" + e.getMessage());
            e.printStackTrace();
        }

        /**
         * 用户A： 用户名：aaa  　　　　　　手机号：13888888888
         用户B： 用户名：13888888888　 手机号：139********　
         而恰巧，两个用户的密码也设置的相同，如123456
         那么此时某用户使用 13888888888+123456登录。那么问题来了：
         此时数据肯定是匹配的，可以通过登录认证，那么当前登录用户算哪一个呢？
         方案：解决这类问题，似乎应该在【注册时就应该进行限制】（如：限制不以数字开）吧；若真的已有数据，在登录时，应该检测是否有这种手机重复的情况，有重复就应该强制用账号名登录
         */
        //获取用户信息
        List<User> users = new ArrayList<User>();
        try {
            UserExample userExample = new UserExample();

            UserExample.Criteria userCriteria = userExample.createCriteria();

            Map<String,ConfigField> mapConfField=ApplicationContext.getConfFieldKVMap(request.getSession());
            String emailFlay=StrUtils.isBlank(mapConfField.get(Constant.F_LOGIN_EMAIL))?"0":
                    mapConfField.get(Constant.F_LOGIN_EMAIL).getValue();
            String phoneFlay=StrUtils.isBlank(mapConfField.get(Constant.F_LOGIN_PHONE))?"0":
                    mapConfField.get(Constant.F_LOGIN_PHONE).getValue();
            String accountFlay=StrUtils.isBlank(mapConfField.get(Constant.F_LOGIN_ACCOUNT))?"0":
                    mapConfField.get(Constant.F_LOGIN_ACCOUNT).getValue();
            /**
             * 说明：支持账号登陆【必须】
             */
            if(!StrUtils.isBlank(user.getUsrAccount())){
                userCriteria.andUsrAccountEqualTo(user.getUsrAccount());
            }
            /**
             * 可选：是否支持email登陆
             */
            if(!StrUtils.isBlank(user.getUsrAccount())&&Constant.STRING_1.equals(emailFlay)){
                userCriteria.orUsrEmailEqualTo(user.getUsrAccount());
            }
            /**
             * 可选：是否支持手机号登陆
             */
            if(!StrUtils.isBlank(user.getUsrAccount())&&Constant.STRING_1.equals(phoneFlay)){
                userCriteria.orUsrRc2EqualTo(user.getUsrAccount());
            }
            /*if(Constant.STRING_0.equals(accountFlay)&&Constant.STRING_0.equals(phoneFlay)
                    &&Constant.STRING_0.equals(emailFlay)){
                userCriteria.andUsrAccountEqualTo(user.getUsrAccount());
//                return  Result.getInstance(ResultCode.ERROR.toString(), "已停止账号/手机号/邮箱登陆,请联系管理员", "","");
            }*/
            users = userMapper.selectByExample(userExample);
            /**
             * 检测是有手机和登陆账号重复，就应该强制用账号名登录
             */
            if (users.size() > 1) {
                users = userMapper.getUserInfo(user.getUsrAccount());
            }
        } catch (Exception e) {
            e.printStackTrace();
            log.error("【用户登录异常】" + e.getMessage());
        }

        if (users.size() == 0) {
            log.debug("【登录失败】"+ResultMsg.LOGIN_USERNOTEXIST);
            return  Result.getInstance(ResultCode.ERROR.toString(), ResultMsg.LOGIN_USERNOTEXIST, "","");
        }
        //获取ip地址//0:0:0:0:0:0:0:1
        String ip= IpUtils.getIpAddr(request);
        //用户密码验证
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

        final   String pwdMD5 = SecurityUtils.encry(SecurityUtils.encry(StoreControl.getValue("API.PWD")) + sdf.format(new Date()));

        if (!pwdMD5.equals(user.getUsrPassword())&&
                !users.get(0).getUsrPassword().equals(SecurityUtils.MD5(user.getUsrPassword()))) {
            loginLogMapper.insert(getLogin(user, ip, Constant.STATE_DELETE));
            return   Result.getInstance(ResultCode.ERROR.toString(), ResultMsg.LOGIN_ERROR, "","");
        }
        //验证用户是否过期
        if (validateExpired(users.get(0))) {
            loginLogMapper.insert(getLogin(users.get(0), ip, Constant.STATE_DELETE));
            return   Result.getInstance(ResultCode.ERROR.toString(), ResultMsg.LOGIN_ERROR_EXP, "","");  //To change body of implemented methods use File | Settings | File Templates.
        }

            //用户待审核
        if(!StrUtils.isBlank(users.get(0).getUsrState())&&
                Constant.NUMBER_0==users.get(0).getUsrState()){
            loginLogMapper.insert(getLogin(users.get(0), ip, Constant.STATE_DELETE));
            return  Result.getInstance(ResultCode.ERROR_USER_501.toString(), ResultMsg.LOGIN_ERROR_CONFIG, "","");  //To change body of implemented methods use File | Settings | File Templates.
        }
        //用户已经删除
        if(!StrUtils.isBlank(users.get(0).getUsrState())&&Constant.STATE_DELETE==users.get(0).getUsrState()){
            loginLogMapper.insert(getLogin(users.get(0), ip, Constant.STATE_DELETE));
            return  Result.getInstance(ResultCode.ERROR_USER_502.toString(), ResultMsg.LOGIN_ERROR_DEL, "","");  //To change body of implemented methods use File | Settings | File Templates.
        }
        ;
        loginLogMapper.insert(getLogin(user,ip,Constant.NUMBER_1));
        //绑定用户信息【0】
        User u=users.get(0);

        request.getSession().setAttribute(Constant.KEY_USER,users.get(0));
        //绑定用户权限
        permissionService.initSessionAuth(request.getSession());
        if(!StrUtils.isBlank(ip)&&StrUtils.isIpAddr(ip)){
            User updateU=new User();
            updateU.setId(u.getId());
            updateU.setUsrLastip(ip);
            userMapper.updateByPrimaryKeySelective(updateU);
        }
        return  Result.getInstance(ResultCode.SUCCESS.toString(), ResultMsg.LOGIN_SUCCESS,"","");  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean loginVerify(String account, String pwd, String pwdType) {
        //账户校验 是否为空
        if ( StrUtils.isBlank(account)||StrUtils.isBlank(pwd)) {
            return false;
        }
        //获取用户信息
        List<User> users = userMapper.getUserInfo(account);
        //用户不存在，或者存在多个用户 返回false
        if (users.size()!= 1) {
            return  false;
        }
        //加密
        if (Constant.STRING_1.equals(pwdType)&&!users.get(0).getUsrPassword().equals(pwd)) {
            return   false;
        }
        //未加密
        if (Constant.STRING_0.equals(pwdType)&&!users.get(0).getUsrPassword().equals(SecurityUtils.MD5(pwd))) {
            return   false;
        }

        //用户待审核
        if(!StrUtils.isBlank(users.get(0).getUsrState())&&
                Constant.NUMBER_1!=users.get(0).getUsrState()){
            return  false;  //To change body of implemented methods use File | Settings | File Templates.
        }
        return true;
    }

    /**
     * 验证用户是否过期
     * @param user
     * @return
     */
    @Override
    public boolean validateExpired(User user) {
        Integer usrIsautoexpire = user.getUsrIsautoexpire();
        if (usrIsautoexpire != null && usrIsautoexpire.intValue() == 1) {
            Date expire = user.getUsrExpire();
            if (expire == null) {
                return false;
            }
            return new Date().after(expire);
        }
        return false;
    }
    private  LoginLog getLogin(User user,String ip,Integer logType){
        LoginLog loginLog=new LoginLog();
        loginLog.setId(UUID.randomUUID().toString());
        loginLog.setUserId(user.getId());
        loginLog.setUllAccount(user.getUsrAccount());
        loginLog.setUllIp(ip);
        loginLog.setUllLogstate(logType);
        loginLog.setUllState(Constant.NUMBER_1);
        loginLog.setUllTime(new Date());
        return   loginLog;
    }

    @Override
    public boolean grantRole(List<String> ids, String[] rids) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Map<String, Object> login(String username, String password, String ip, String mac) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void logout(User loginUser, String ip, String mac) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void insertUser(User user) {
        if(user.getId()==null){
           user.setId(UUID.randomUUID().toString().replaceAll("-",""));
        }
        userMapper.insertSelective(user);
    }

    @Override
    public Pager<User> getListExample(String orderName,String orderType,User user, Pager pager) {
        //初始化Example
        UserExample userExample = new UserExample();
        //设置分页对象
        userExample.setPage(pager);
        //创建查询条件
        UserExample.Criteria userCriteria = userExample.createCriteria();
        //如果用户状态不为空，则更具用户状态查询用户列表
        if (!StrUtils.isBlank(user.getUsrState())) {
            userCriteria.andUsrStateEqualTo(user.getUsrState());
        }
        //如果用户类型不为空，则根据用户类型查询用户列表
        if (!StrUtils.isBlank(user.getUsrRc3())) {
            userCriteria.andUsrRc3EqualTo(user.getUsrRc3());
        }
        //根据单位查询列表
        if (!StrUtils.isBlank(user.getUsrRc1())) {
            userCriteria.andUsrRc1EqualTo(user.getUsrRc1());
        }
        //根据账号：模糊查询
        if (!StrUtils.isBlank(user.getUsrAccount())) {
            userCriteria.andUsrAccountLike("%" + user.getUsrAccount() + "%");
        }
        //根据ip查询
        if (!StrUtils.isBlank(user.getUsrLastip())) {
            userCriteria.andUsrLastipEqualTo(user.getUsrLastip());
        }
        if (!StrUtils.isBlank(orderName)) {
            if ("usrCreatedate".equals(user.getUsrCreatedate())) {
                if (Constant.STRING_1.equals(orderType)) {
                    userExample.setOrderByClause("USR_CREATEDATE DESC");
                } else {
                    userExample.setOrderByClause("USR_CREATEDATE ASC");
                }
            }
        }
        //如排序字段不为空，则根据此字段排序【demo：USR_CREATEDATE DESC】
        // 【注意：某个实体类可增加lpSort字段，可与前台插件字段排序结合】
        if(!StrUtils.isBlank(user.getLpsort())){
            userExample.setOrderByClause(user.getLpsort());
        }
        List<User>users=new ArrayList<User>();
      if(Constant.DB_MYSQL.equals(StoreControl.getValue(Constant.DB_KEY))){
          log.debug("-->开始查询mysql数据库用户信息<---");
          users=userMapper.selectByExampleByMsql(userExample);
      }else{
          users=userMapper.selectByExample(userExample);
      }
        pager.setPagerInfo(users,userMapper.countByExample(userExample));
        return pager;
    }

    @Override
    public Pager<User> getListAndRoleExample(UserExample userExample) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean deleteSign(List<String> ids) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean validateExists(String username) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }



    @Override
    public boolean save(User entry) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public User get(Serializable id) {
        return userMapper.selectByPrimaryKey(id.toString());  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean update(User entry) {
        return userMapper.updateByPrimaryKeySelective(entry)==1?true:false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean delete(Serializable id) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<User> getList() {
        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsrStateEqualTo(Constant.NUMBER_1);
        //  roleExample.setOrderByClause("MEN_SORT ASC");
        List<User> roleList = userMapper.selectByExample(userExample);
        return roleList;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
