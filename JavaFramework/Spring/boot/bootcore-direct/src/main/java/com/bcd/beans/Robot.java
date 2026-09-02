package com.bcd.beans;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@ToString
public class Robot {
    @Value("${robot.name}")
    private String name;
}
