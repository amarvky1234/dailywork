package com.bootevents.listeners;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;

public class EnvironmentPreparedListeners implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        ConfigurableEnvironment environment = event.getEnvironment();

        environment.getPropertySources().stream().iterator().forEachRemaining( propertySource -> {
            if (propertySource.containsProperty("toy.name")){
                System.out.println(propertySource.getProperty("toy.name"));
            }
        });
    }
}
