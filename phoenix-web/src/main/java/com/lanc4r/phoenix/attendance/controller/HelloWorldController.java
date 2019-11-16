package com.lanc4r.phoenix.attendance.controller;

import com.lanc4r.phoenix.attendance.biz.IUserBiz;
import com.lanc4r.phoenix.attendance.dao.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @author Lanc4r
 * @create 2019-11-12 1:28 PM
 */

@RestController
public class HelloWorldController {

    @Autowired
    private IUserBiz userBiz;

    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello world~";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public UserEntity getUserById(@PathVariable(name = "id") Long userId){
        return userBiz.getUserById(userId);
    }

    @RequestMapping(value = "/add-usertask/{id}", method = RequestMethod.GET)
    public String addUser(@PathVariable(name = "id") Long userId){
        userBiz.addUserTask(userId);
        return "添加成功";
    }

}
