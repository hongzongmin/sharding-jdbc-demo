package com.example.demo.config.controller;

import com.example.demo.entity.UserInfo;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * created by hzm.
 */
@RequestMapping("user")
public class UserController {

    @Autowired
    private DemoService demoService;

    @RequestMapping("/addUser")
    public int addUser(@RequestBody UserInfo userInfo){
        demoService.addUser();
        return 0;
    }
}
