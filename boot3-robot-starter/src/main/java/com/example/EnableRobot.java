package com.example;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * Author:pric
 * Date:2023/11/7 18:37
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({RobotAutoConfiguration.class})
public @interface EnableRobot {
}
