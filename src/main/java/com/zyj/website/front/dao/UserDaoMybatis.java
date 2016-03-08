package com.zyj.website.front.dao;


import com.zyj.website.front.bean.Role;
import com.zyj.website.front.bean.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class UserDaoMybatis implements UserDao {

    private ConcurrentHashMap<String, User> users = new ConcurrentHashMap<String, User>();

    public User findUserByUserName(String userName) {
        User user = users.get(userName);
        if(user == null) {
            user = new User();
            if (userName.equals("ZhangYJ")) {
                user.setAutograph("张亚杰");
            }
            user.setDepartment("开发部");
            Role role = new Role();
            user.setRoles(Arrays.asList(role));
            users.put(userName, user);
        }
        return user;
    }
}
