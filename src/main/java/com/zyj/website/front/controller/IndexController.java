package com.zyj.website.front.controller;

import com.zyj.website.front.bean.PermissionConstant;
import com.zyj.website.front.bean.ResponseMessage;
import com.zyj.website.front.bean.User;
import com.zyj.website.front.service.approve.ApproveService;
import com.zyj.website.front.service.auth.UserService;
import org.apache.commons.lang.time.DateFormatUtils;
import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.Date;

/**
 * 审批
 * Created by ZhangYJ on 15/11/30.
 */
@Controller
@RequestMapping("index")
public class IndexController extends BaseController{

    @Resource UserService userService;
    @Resource ApproveService approveService;

    /**
     * 新建发布单
     */
    @RequestMapping(value = "index", method = RequestMethod.GET)
    @RequiresRoles(value = "dev")
    public String index(Model model){
        model.addAttribute("login", getLoginUserName())
        .addAttribute("time", DateFormatUtils.format(new Date(), "yyyy-MM-dd hh:mm:ss"));
        return "/approve/approve";
    }

    /**
     * 显示发布单
     */
    @RequestMapping(value = "show", method = RequestMethod.GET)
    public String show(Model model){
        model.addAttribute("login", getLoginUserName())
                .addAttribute("time", DateFormatUtils.format(new Date(), "yyyy-MM-dd hh:mm:ss"));
        return "/approve/approve";
    }

    /**
     * 保存发布单
     */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(Model model){
        model.addAttribute("login", getLoginUserName())
                .addAttribute("time", DateFormatUtils.format(new Date(), "yyyy-MM-dd hh:mm:ss"));
        return "/approve/approve";
    }

    /**
     * 签名
     */
    @RequestMapping(value = "autograph", method = RequestMethod.GET)
    @RequiresRoles(value = {PermissionConstant.DEV, PermissionConstant.PRODUCT, PermissionConstant.LEADER, PermissionConstant.TEST}, logical = Logical.OR)
    public @ResponseBody String autograph(Model model){
        model.addAttribute("login", super.getLoginUserName())
                .addAttribute("time", DateFormatUtils.format(new Date(), "yyyy-MM-dd hh:mm:ss"));
        User user = userService.findUserByLoginName(super.getLoginUserName());
        return new ResponseMessage().success(user.getDepartment() + " " + user.getAutograph() + " 签名").toString();
    }
}
