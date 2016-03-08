package com.zyj.website.front.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 表单设计
 * Created by ZhangYJ on 15/11/30.
 */
@Controller
@RequestMapping("form")
public class FormController {

    @RequestMapping(value = "preview.do", method = RequestMethod.POST)
    public void preview(String parse_form, Model model){
        model.addAttribute("form", JSON.parseObject(parse_form).getString("template"));
    }

    @RequestMapping(value = "save.do", method = RequestMethod.POST)
    public @ResponseBody String save(String type_value, String formid, String parse_form){
        //FIXME 保存表单
        return "success";
    }
}
