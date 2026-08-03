package com.blc.hook;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

public class ShutdownHook implements Runnable{
    private ApplicationContext context;


    public ShutdownHook(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run() {
        ((ConfigurableApplicationContext)context).close();
    }
}
