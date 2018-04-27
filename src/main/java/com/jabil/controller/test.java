package com.jabil.controller;

import com.jabil.pojo.Users;
import com.jabil.service.Users.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/test")
public class test {
    @Autowired
    UserService userService;
    @RequestMapping(value = "/test")
    @ResponseBody
    public List<Users> test(){
        return userService.findAllUsers();
    }
}

