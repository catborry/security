package com.security.security.user.controller;

import com.security.security.user.domain.User;
import com.security.security.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController{

    @Autowired
    UserMapper userMapper;
    @GetMapping
    public String users(){

        return userMapper.getUser("aaa").toString()+"</br>"+getUser();

    }
    //获取当前用户信息
    private String getUser(){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if(principal==null){
            return "匿名";
        }
        if(principal instanceof User){
            return ((User)principal).toString();
        }
        return principal.toString();
    }
}
