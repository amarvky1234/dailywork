package com.bootevents.listeners;

import com.bootevents.beans.Toy;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;

public class ReadyEventListener implements ApplicationListener<ApplicationReadyEvent> {
    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        ApplicationContext applicationContext = event.getApplicationContext();
        Toy toy = applicationContext.getBean(Toy.class);
        System.out.println("from Listeners : "+ toy);
    }
}
