package com.gaoxi.gaoxiuser.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.gaoxi.gaoxicommonservicefacade.service.UserService;

/**
 * @author mengxu
 * @date 2020/4/29 16:11
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public String login(String loginReq) {
        System.out.println("hello world");
        return "hello world";
    }
}
