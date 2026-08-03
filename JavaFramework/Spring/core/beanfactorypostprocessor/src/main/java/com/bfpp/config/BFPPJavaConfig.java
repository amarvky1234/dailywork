package com.bfpp.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app.properties")
@ComponentScan(basePackages = {"com.bfpp.beans", "com.bfpp.postprocessor"})
public class BFPPJavaConfig {
}
