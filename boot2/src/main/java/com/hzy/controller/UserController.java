package com.hzy.controller;

import com.hzy.entity.User;
import com.hzy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
    @RequestMapping("findall")
    public List<User> findall(){
        return userService.findall();
    }
    @RequestMapping("save")
    public void save(User user){
        userService.save(user);
        System.out.println("hello");


    }
}
