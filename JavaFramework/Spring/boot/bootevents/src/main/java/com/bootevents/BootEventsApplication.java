package com.bootevents;

import com.bootevents.beans.Toy;
import com.bootevents.listeners.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class BootEventsApplication {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplicationBuilder(BootEventsApplication.class)
                .listeners(new EnvironmentPreparedListeners(), new StartingListeners()
                , new StartedEventListener(), new PreparedEventListener(), new ReadyEventListener()).build();

        ApplicationContext applicationContext = springApplication.run(args);
        Toy toy = applicationContext.getBean(Toy.class);
        System.out.println("from SBApp : "+ toy);
    }
}
