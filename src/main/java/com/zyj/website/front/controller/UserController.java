package com.zyj.website.front.controller;

import com.zyj.website.front.bean.ResponseMessage;
import com.zyj.website.front.bean.User;
import com.zyj.website.front.service.auth.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 用户
 * Created by ZhangYJ on 15/12/3.
 */
@Controller
@RequestMapping(value = "user")
public class UserController extends BaseController{

    @Resource UserService userService;

    @RequestMapping(value = "register", method = RequestMethod.GET)
    public void register(){
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public @ResponseBody String save(User user){
        userService.save(user);
        return new ResponseMessage().success("注册成功").toString();
    }
}
