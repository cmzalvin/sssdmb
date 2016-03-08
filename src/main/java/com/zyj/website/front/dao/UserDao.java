package com.zyj.website.front.dao;

import com.zyj.website.front.bean.User;

/**
 * 用户表
 * Created by ZhangYJ on 15/12/1.
 */
public interface UserDao {

    User findUserByUserName(String userName);
}
