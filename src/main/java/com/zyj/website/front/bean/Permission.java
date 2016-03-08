package com.zyj.website.front.bean;

/**
 * 权限
 * Created by ZhangYJ on 15/11/23.
 */
public class Permission implements org.apache.shiro.authz.Permission {
    private Integer id;
    private String name;

    public boolean implies(org.apache.shiro.authz.Permission permission) {
        return false;
    }
}
