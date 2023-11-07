package com.example.Service;

import com.example.properties.RobotProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Author:pric
 * Date:2023/11/7 18:30
 */
@Service
public class RobotService {

     @Autowired
    RobotProperties robotProperties;
     public String say(){
         return  "名字是"+robotProperties.getName() +"\n年龄是"+robotProperties.getAge();
     }

}
