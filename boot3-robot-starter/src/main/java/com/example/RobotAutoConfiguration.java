package com.example;

import com.example.Service.RobotService;
import com.example.controller.RobotController;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Author:pric
 * Date:2023/11/7 18:30
 */
@Configuration
@Import({RobotController.class, RobotService.class})
public class RobotAutoConfiguration {
}
