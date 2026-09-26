package com.bp;

import com.bp.beans.ConnectionManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BPBootApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BPBootApplication.class, args);
        ConnectionManager connectionManager = applicationContext.getBean(ConnectionManager.class);
        System.out.println(connectionManager);
    }
}
