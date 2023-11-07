package com.example.controller;

import com.example.utils.JwtUtils;
import com.example.pojo.Result;
import com.example.pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Author:pric
 * Date:2023/11/1 21:47
 */
@RestController
@RequestMapping("/user")
@CrossOrigin
public class LoginController {
    @PostMapping("/login")
    public Result login (@RequestBody User user){
        Map<String, Object> claims = new HashMap<>();
        claims.put("username",user.getUsername());
        claims.put("password",user.getPassword());
        String token = JwtUtils.generateJwt(claims);
        return Result.ok().data("token",token);
    }

    @GetMapping("/info")
    public Result info(String token){
        String subject = JwtUtils.parseJWT(token).getSubject();
        Map<String, Object> claims = new HashMap<>();
        claims.put("username","admin");
        claims.put("password",111111);
        System.out.println(subject);
        return Result.ok().data("name",subject).data("avatar","www.baidu.com").data("roles",new int[]{1,2}).data("introduction","I am a super administrator");

    }
}
