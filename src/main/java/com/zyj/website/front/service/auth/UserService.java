package com.zyj.website.front.service.auth;

import com.zyj.website.front.bean.User;

/**
 * 用户服务
 * Created by ZhangYJ on 15/11/23.
 */
public interface UserService {
    void save(User user);

    User findUserByLoginName(String loginName);
    //User
}
