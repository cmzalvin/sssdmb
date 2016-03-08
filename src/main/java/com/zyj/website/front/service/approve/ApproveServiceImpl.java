package com.zyj.website.front.service.approve;

import com.zyj.website.front.bean.PublishForm;
import org.springframework.stereotype.Service;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 审批服务
 * Created by ZhangYJ on 15/12/1.
 */
@Service
public class ApproveServiceImpl implements ApproveService {

    private ConcurrentHashMap<Integer, PublishForm> forms = new ConcurrentHashMap<Integer, PublishForm>();

    public void saveApprove(){

    }
}
