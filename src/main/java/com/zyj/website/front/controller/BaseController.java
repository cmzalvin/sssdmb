package com.zyj.website.front.controller;

import org.apache.shiro.SecurityUtils;

public class BaseController {
    protected String getLoginUserName(){
        return SecurityUtils.getSubject().getPrincipal().toString();
    }
}
