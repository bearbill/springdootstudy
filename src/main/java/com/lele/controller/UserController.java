package com.lele.controller;

import com.lele.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {

    private UserService userService;
    @RequestMapping("/testBoot")
    public String GetUser(){
       // return userService.queryUserById(id).toString();
        return "hello";
    }


}
