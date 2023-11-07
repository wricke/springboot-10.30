package com.example.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Author:pric
 * Date:2023/11/7 18:20
 */
@ConfigurationProperties(prefix = "robot")
@Component
@Data
public class RobotProperties {
    private String name;
    private int age;

}
