package com.bootevents.listeners;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;

public class StartedEventListener implements ApplicationListener<ApplicationPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        ApplicationContext applicationContext = event.getApplicationContext();
        System.out.println("Bean def in ioc : "+applicationContext.getBeanDefinitionCount());
    }
}
