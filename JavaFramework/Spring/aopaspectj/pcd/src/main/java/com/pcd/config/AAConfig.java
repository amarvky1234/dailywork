package com.pcd.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"com.pcd.beans", "com.pcd.aspect"})
@EnableAspectJAutoProxy
public class AAConfig {
}
