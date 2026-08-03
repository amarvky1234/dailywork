package com.blc.config;

import com.blc.beans.Rectangle;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app.properties")
@ComponentScan(basePackages = "com.blc.beans")
public class BLCConfig {

    @Bean(initMethod = "init", destroyMethod = "terminate")
    public Rectangle rectangle(@Value("${length}") double length, @Value("${breadth}") double breadth) {
        Rectangle rectangle = new Rectangle(length);
        rectangle.setBreadth(breadth);
        return rectangle;
    }
}
