package com.zyj.website.front.realm;

import com.zyj.website.front.bean.Role;
import com.zyj.website.front.bean.User;
import com.zyj.website.front.service.auth.UserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import javax.annotation.Resource;
import java.io.Serializable;

/**
 * realm
 * Created by ZhangYJ on 15/11/19.
 */
public class ApproveRealm extends AuthorizingRealm implements Serializable {

    @Resource UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        String currentUsername = (String)super.getAvailablePrincipal(principalCollection);
        SimpleAuthorizationInfo authorization = new SimpleAuthorizationInfo();
        User user = userService.findUserByLoginName(currentUsername);
        for(Role role : user.getRoles()){
            authorization.addRole(role.getName());
        }
        return authorization;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        User user = userService.findUserByLoginName(token.getUsername());
        if(user == null) return null;
        if( user.getPassword().equals( new String( token.getPassword() ) ) ) {
            return new SimpleAuthenticationInfo(token.getPrincipal(), token.getPassword(), this.getName());
        } else {
            throw new IncorrectCredentialsException();
        }
    }
}
