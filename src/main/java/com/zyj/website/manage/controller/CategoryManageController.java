package com.zyj.website.manage.controller;

import com.zyj.website.manage.service.CategoryService;
import com.zyj.website.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 栏目管理
 * @author ZhangYJ
 */
@Controller
@RequestMapping(value = "/manage")
public class CategoryManageController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/categores", method = RequestMethod.GET)
    public String categorys(Model model){

        model.addAttribute("categores",categoryService.getCategorys());
        return "manage/category";
    }

    @RequestMapping(value = "/category/{id}", method = RequestMethod.GET)
    public String categorys(@PathVariable Integer id, Model model){

        model.addAttribute("category", categoryService.getCategoryById(id));
        return "manage/category";
    }

    @RequestMapping(value = "/category", method = RequestMethod.POST)
    public String categorys(Category category, Model model){

        categoryService.save(category);
        return "redirect:/manage/category/categorys";
    }
}
