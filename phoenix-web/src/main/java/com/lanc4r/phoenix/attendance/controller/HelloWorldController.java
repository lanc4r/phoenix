package com.lanc4r.phoenix.attendance.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author Lanc4r
 * @create 2019-11-12 1:28 PM
 */

@RestController
public class HelloWorldController {


    @RequestMapping("/hello")
    public String helloWorld(){
        return "hello world~";
    }

//    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
//    public UserEntity getUserById(@PathVariable(name = "id") Long userId){
//        return userBiz.getUserById(userId);
//    }
//
//    @RequestMapping(value = "/add-usertask/{id}", method = RequestMethod.GET)
//    public String addUser(@PathVariable(name = "id") Long userId){
//        userBiz.addUserTask(userId);
//        return "添加成功";
//    }

    /**
     * 获取用户打卡信息
     *
     * @param userId
     * @return
     */
    @RequestMapping("/get-attendance.json")
    @ResponseBody
    public Map<String, Object> getUserAttendance(@RequestParam(name = "id") Long userId){
        return null;
    }

}
