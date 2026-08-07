package com.fb.config;

import com.fb.helper.CalendarFactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Calendar;
import java.util.Properties;

@Configuration
@PropertySource("classpath:app.properties")
@ComponentScan(basePackages = {"com.fb.beans"})
public class FBJavaConfig {

    @Bean
    public CalendarFactoryBean reminderDateTime(@Value("${day}") int day,
                                                @Value("${month}") int month,
                                                @Value("${year}") int year,
                                                @Value("${hour}") int hour,
                                                @Value("${minutes}") int minutes){

        CalendarFactoryBean calendarFactoryBean = new CalendarFactoryBean(day, month, year, hour, minutes);
        return calendarFactoryBean;
    }
}
