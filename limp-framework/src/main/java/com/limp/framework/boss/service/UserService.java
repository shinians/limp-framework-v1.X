package com.limp.framework.boss.service;

import com.limp.framework.boss.domain.*;
import com.limp.framework.core.abs.AbstractService;
import com.limp.framework.core.annotation.Access;
import com.limp.framework.core.bean.Pager;
import com.limp.framework.core.bean.Result;
import com.limp.framework.core.constant.OPERATION;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
import java.util.Map;
@Service
public interface UserService extends AbstractService<User> {

    /**
     * 获得用户信息
     * @param account
     * @return
     */
    public List<User> getUserInfo(String account);


    /**
     * 删除用户角色 根据uid
     * @param uid
     * @param roleIds
     * @return
     */
    public boolean delURoleMapByUId(String uid, List<String> roleIds) ;
    /**
     * 增加用户角色 根据uid
     * @param uid
     * @param roleIds
     * @return
     */
    public boolean addURoleMapByUId(String uid, List<String> roleIds) ;


    public Integer getIpLoginSize(String account, String ip, String nickName);
    /**
     * 根据id删除菜单权限
     *
     * @param uid 角色id
     * @param ids 菜单id
     * @return
     */
    boolean deleteMenuById(String uid, List<String> ids);

    /**
     * 根据id添加菜单权限
     *
     * @param uid 角色id
     * @param ids 菜单id
     * @return
     */
    boolean addMenuById(String uid, List<String> ids);


        /**
         * 根据用户id获取user对应的所有菜单id
         *
         * @param uid 用户id
         * @return
         */
    public List<String> getMenus(String uid) ;

    public List<User> getUserList(User user);

    public List<UserSet> getUserSet(UserSet userSet);

    public List<Map<String,Object>> getUserSetMenuMapById(String userId);

    public List<UserSet> getUserSetByIDKeyWord(String userId, String keyWord);

    public boolean saveUserSet(UserSet set);

    /**
     * 根据用户 菜单id更新
     * @return
     */
    public boolean updateUserSetByUsrMenuId(UserSet set);

    /**
     * 用户登录
     * @param user  登录的用户信息
     * @param request  HttpServletRequest
     * @return           登录结果
     */
    public Result login(User user, HttpServletRequest request);

    /**
     * 验证用时是否通过访问
     * @param account 访问账号
     * @param pwd  访问密码
     * @param pwdType 密码类型 0 未加密 1 已加密
     * @return
     */
    public boolean loginVerify(String account,String pwd,String pwdType);
    /**
     * 授权角色
     *
     * @param ids  用户ID列表
     * @param rids 角色ID列表
     * @return 是否授权成功
     */
    boolean grantRole(List<String> ids, String[] rids);

    public static enum State {
        /**
         * 删除
         */
        DELETE(-1),
        /**
         * 审核
         */
        AUDIT(0),
        /**
         * 正常
         */
        NORMAL(1);

        private Integer value;

        private State(Integer value) {
            this.value = value;
        }

        public String getValue() {
            return value.toString();
        }
    }



    /**
     * 用户登陆
     *
     * @param username 用户名
     * @param password 密码
     * @param ip       ip地址
     * @param mac      mac地址
     * @return 登陆信息
     */
    public Map<String, Object> login(String username, String password, String ip, String mac);

    /**
     * 用户登出
     *
     * @param loginUser 登陆用户
     * @param ip        ip地址
     * @param mac       mac地址
     */
    public void logout(User loginUser, String ip, String mac);

    public void insertUser(User user);

    /**
     * @return 用户列表
     */
    public Pager<User> getListExample(String orderName, String orderType, User user, Pager pager);

    /**
     * 根据用户模版查询用户列表(包含角色id)
     *
     * @param userExample
     * @return 用户列表
     */
    public Pager<User> getListAndRoleExample(UserExample userExample);

    /**
     * "批量删除"
     *
     * @param ids
     * @return
     */

    public boolean deleteSign(List<String> ids);

    public boolean validateExists(String username);

    public boolean validateExpired(User user);

}