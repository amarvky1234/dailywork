package com.bcc.initializer;

import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.PropertySource;

import java.io.IOException;
import java.util.List;

public class YamlPropertySourceApplicationContextInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext applicationContext) {
        YamlPropertySourceLoader yamlPropertySourceLoader = new YamlPropertySourceLoader();
        try {
            List<PropertySource<?>> propertySources =
                    yamlPropertySourceLoader.load("config", applicationContext.getResource("classpath:config.yml"));
            ConfigurableEnvironment environment = applicationContext.getEnvironment();
            propertySources.forEach(propertySource -> {
                environment.getPropertySources().addLast(propertySource);
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
