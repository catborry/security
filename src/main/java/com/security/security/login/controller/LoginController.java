package com.security.security.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/")
public class LoginController {

    @GetMapping
    public String login(){
        return "login";
    }
//    @PostMapping("login")
//    public String loingIN(HttpServletRequest request, Model model){
//        String userName = request.getParameter("userName");
//        String passWord = request.getParameter("passWord");
//
//        return null;
//    }
}
