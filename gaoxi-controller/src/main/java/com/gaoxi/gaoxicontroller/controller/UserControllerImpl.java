package com.gaoxi.gaoxicontroller.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.rpc.Result;
import com.gaoxi.gaoxicommonservicefacade.service.UserService;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * @author mengxu
 * @date 2020/4/29 16:19
 */
@RestController
public class UserControllerImpl  {

    @Reference(version = "1.0.0")
    private UserService userService;

    public String login(String loginReq, HttpServletResponse httpRsp) {

        return userService.login("hllo");
    }
}
