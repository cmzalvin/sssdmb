package com.zyj.website.front.bean;

import java.util.List;

/**
 * 角色
 * Created by ZhangYJ on 15/11/23.
 */
public class Role {
    private String name;
    private List<Permission> permissions;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }
}
