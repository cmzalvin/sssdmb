package com.zyj.website.manage.controller;

import com.baidu.ueditor.ActionEnter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * ueditor
 * @author ZhangYJ
 */
@Controller
@RequestMapping("/ueditor")
public class UeditorController {

    @RequestMapping(value = "/config")
    public @ResponseBody String ueditorConfig(HttpServletRequest request){

        String rootPath = request.getRealPath("");
        ActionEnter actionEnter = new ActionEnter( request,  rootPath );
        return actionEnter.exec().trim();
    }
}
