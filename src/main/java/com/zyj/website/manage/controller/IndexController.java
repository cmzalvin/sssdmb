package com.zyj.website.manage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 后台管理首页
 */
@Controller
@RequestMapping("manage")
public class IndexController {

    @RequestMapping("index")
    public String index(){
        return "manage/category";
    }
}
