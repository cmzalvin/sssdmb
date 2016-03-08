package com.zyj.website.front.bean;

import com.alibaba.fastjson.JSON;

/**
 * 返回信息
 * Created by ZhangYJ on 15/12/1.
 */
public class ResponseMessage {

    private String status;

    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseMessage success(String msg){
        this.status = "success";
        this.message = msg;
        return this;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
