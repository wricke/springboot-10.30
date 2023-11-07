package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Author:pric
 * Date:2023/11/2 15:56
 */
@Controller
public class ErrorContoller {

 @GetMapping("ok")
    public String ok(){
     return "list";
 }


}
