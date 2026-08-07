package com.eh.test;

import com.eh.beans.UpdateCityService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EventHandlingTest {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext("com.eh.beans", "com.eh.listener");
        UpdateCityService service = context.getBean(UpdateCityService.class);

        service.updateCity(25, "Patna");
    }
}
