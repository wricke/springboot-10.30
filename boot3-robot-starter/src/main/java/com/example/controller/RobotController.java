package com.example.controller;

import com.example.Service.RobotService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:pric
 * Date:2023/11/7 18:18
 */
@RestController
public class RobotController {

    @Autowired
    private RobotService robotService;
    @GetMapping("/robot")
    public String hello(){
        String s = robotService.say();
        return s;

    }
}
