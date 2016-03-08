package com.zyj.website.front.bean;

import java.util.List;

/**
 * 发布单
 * Created by ZhangYJ on 15/12/1.
 */
public class PublishForm {

    private Integer id;
    private String 申请人;
    private String 项目名称;
    private String 发布内容;
    private List<User> signs; //通过签名的人
    private Integer status;// 1:创建 2:发布请求签名 3:签名完毕 4:运维签名通过并发布

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String get申请人() {
        return 申请人;
    }

    public void set申请人(String 申请人) {
        this.申请人 = 申请人;
    }

    public String get项目名称() {
        return 项目名称;
    }

    public void set项目名称(String 项目名称) {
        this.项目名称 = 项目名称;
    }

    public String get发布内容() {
        return 发布内容;
    }

    public void set发布内容(String 发布内容) {
        this.发布内容 = 发布内容;
    }

    public List<User> getSigns() {
        return signs;
    }

    public void setSigns(List<User> signs) {
        this.signs = signs;
    }
}
