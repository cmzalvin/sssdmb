package com.zyj.website.front.service.auth;


import com.zyj.website.front.bean.User;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 用户服务
 * Created by ZhangYJ on 15/12/1.
 */
@Service
public class UserServiceImpl implements UserService {

    private ConcurrentHashMap<String, User> users = new ConcurrentHashMap<String, User>();

    public void save(User user) {
        //if(!users.containsKey(user.getLoginName())) {
            users.put(user.getLoginName(), user);
        //}
    }

    public User findUserByLoginName(String loginName) {
        return users.get(loginName);
    }
}
