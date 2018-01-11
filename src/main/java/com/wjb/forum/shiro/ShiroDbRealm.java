package com.wjb.forum.shiro;

import com.wjb.forum.db.po.User;
import com.wjb.forum.service.UserService;
import com.wjb.forum.utils.BeanUtil;
import com.wjb.forum.vo.UserVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

public class ShiroDbRealm extends AuthorizingRealm {
    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserService userService;
    @Autowired
    private BeanUtil beanUtil;

    /**
     * 为当前登录的Subject授予角色和权限
     * -----------------------------------------------------------------------------------------------
     * 经测试：本例中该方法的调用时机为需授权资源被访问时
     * 经测试：并且每次访问需授权资源时都会执行该方法中的逻辑，这表明本例中默认并未启用AuthorizationCache
     * 个人感觉若使用了Spring3.1开始提供的ConcurrentMapCache支持，则可灵活决定是否启用AuthorizationCache
     * 比如说这里从数据库获取权限信息时，先去访问Spring3.1提供的缓存，而不使用Shior提供的AuthorizationCache
     * -----------------------------------------------------------------------------------------------
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        UserVO userVO =(UserVO)principals.getPrimaryPrincipal();
        ////为当前用户设置角色和权限
        SimpleAuthorizationInfo simpleAuthorInfo = new SimpleAuthorizationInfo();
        simpleAuthorInfo.addRole(userVO.getRole());
        return simpleAuthorInfo;
    }

    /**
     * 验证当前登录的Subject
     * 经测试：本例中该方法的调用时机为LoginController.login()方法中执行Subject.login()的时候
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        //获取基于用户名和密码的令牌
        //实际上这个authcToken是从LoginController里面currentUser.login(token)传过来的
        //两个token的引用都是一样的，本例中是：org.apache.shiro.authc.UsernamePasswordToken@33799a1e
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        User user = userService.getUserByName(token.getUsername());
        UserVO userVO = beanUtil.toUserVO(user);
        //此处无需比对，比对的逻辑Shiro会做，我们只需返回一个和令牌相关的正确的验证信息
        //说白了就是第一个参数填登录用户名，第二个参数填合法的登录密码（可以是从数据库中取到的）
        //这样一来，在随后的登录页面上就只有这里指定的用户和密码才能通过验证
        //没有返回登录用户名对应的SimpleAuthenticationInfo对象时，就会在LoginController中抛出UnknownAccountException异常
        if (userVO == null)
            return null;
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(userVO,userVO.getPassword(), ByteSource.Util.bytes(userVO.getSalt()),this.getName());
        return authenticationInfo;
    }

    /**
     * 将一些数据放到ShiroSession中，以便于其它地方使用
     * 比如Controller里面，使用时直接用HttpSession.getAttribute(key)就可以取到
     */
    private void setAuthenticationSession(Object value) {
        Subject currentUser = SecurityUtils.getSubject();
        if (null != currentUser) {
            Session session = currentUser.getSession();
            System.out.println("当前Session超时时间为[" + session.getTimeout() + "]毫秒");
            session.setTimeout(1000 * 60 * 60 * 2);
            System.out.println("修改Session超时时间为[" + session.getTimeout() + "]毫秒");
            session.setAttribute("currentUser", value);
        }
    }
}
