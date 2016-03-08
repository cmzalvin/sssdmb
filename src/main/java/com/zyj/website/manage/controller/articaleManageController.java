package com.zyj.website.manage.controller;

import com.baidu.ueditor.upload.Uploader;
import com.zyj.website.manage.service.ArticaleService;
import com.zyj.website.manage.service.CategoryService;
import com.zyj.website.model.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 文章管理
 * @author ZhangYJ
 */
@Controller
@RequestMapping("/manage")
public class articaleManageController {

    @Autowired
    private CategoryService categoryService;
    @Autowired
    private ArticaleService articaleService;

    @RequestMapping(value = "/articales", method = RequestMethod.GET)
    public String articale(Model model){

        model.addAttribute("articales", articaleService.getArticales());
        return "manage/articales";
    }

    @RequestMapping(value = "/articale/{id}", method = RequestMethod.GET)
    public String articale(Integer id, Model model){

        model.addAttribute("articale", articaleService.getArticale(id));
        model.addAttribute("categores", categoryService.getCategorys());
        return "manage/articale";
    }

    @RequestMapping(value = "/articale", method = RequestMethod.GET)
    public String newArticale(Model model){

        return "manage/articale";
    }

    @RequestMapping(value = "/articale", method = RequestMethod.POST)
    public String newArticale(Article article, Model model){

        articaleService.save(article);
        return "manage/articale";
    }
}
