package com.security.security.regist.controller;

import com.security.security.regist.domain.Regist;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("regist")
public class RegistController {

    @PostMapping
    public void register(Regist regist){
        System.out.println(regist);
    }
}
