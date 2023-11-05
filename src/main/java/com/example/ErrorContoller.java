package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
