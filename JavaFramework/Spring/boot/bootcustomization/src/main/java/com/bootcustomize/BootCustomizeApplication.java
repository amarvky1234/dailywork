package com.bootcustomize;

import com.bootcustomize.beans.Truck;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootCustomizeApplication {
    public static void main(String[] args) {
        //ApplicationContext applicationContext = SpringApplication.run(BootCustomizeApplication.class, args);
        SpringApplicationBuilder builder = new SpringApplicationBuilder(BootCustomizeApplication.class);
        //builder.bannerMode(Banner.Mode.OFF);
        SpringApplication springApplication = builder.build();

        ApplicationContext applicationContext = springApplication.run(args);
        Truck truck = applicationContext.getBean(Truck.class);
    }
}
