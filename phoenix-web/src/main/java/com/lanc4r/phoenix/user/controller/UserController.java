package com.lanc4r.phoenix.user.controller;

import com.lanc4r.phoenix.user.dao.entity.UserEntity;
import com.lanc4r.phoenix.user.form.UserForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author Lanc4r
 * @create 2019-11-18 10:11 AM
 *
 * 用户相关操作映射：<br/>
 *  1. 用户注册相关
 *  2. 用户登录相关
 *  3. 相关页面的映射关系
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

    /**
     * 用户主页，返回用户主页页面
     *
     * @param userId
     * @return
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String getUserById(@PathVariable(name = "id") Long userId){
        return null;
    }

    /**
     * 注册用户接口
     *
     * @param user
     * @return
     */
    @RequestMapping("/register.json")
    public Map<String, Object> registerUser(UserForm user){

        return null;
    }

    /**
     * 保存用户信息:
     * 1. 编辑用户信息时候调用
     * 2. 需要从用户上下文中取用户ID (或者是从 session 中取用户ID)
     *
     * @param user
     * @return
     */
    @RequestMapping("/save.json")
    public Map<String, Object> saveUser(UserForm user){

        // 从 session 中获取用户ID，进行修改

        return null;
    }

    /**
     * 获取用户基本数据接口(注意是返回成 Json 格式)
     *
     * @param userId
     * @return
     */
    @RequestMapping("/info.json")
    @ResponseBody
    public Map<String, Object> getUserInfo(@RequestParam(name = "id") Long userId){
        return null;
    }


}
