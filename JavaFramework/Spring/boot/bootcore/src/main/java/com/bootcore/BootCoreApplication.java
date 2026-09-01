package com.bootcore;

import com.bootcore.beans.Radio;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootCoreApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BootCoreApplication.class);
        Radio radio = context.getBean(Radio.class);
        radio.on();
    }
}
