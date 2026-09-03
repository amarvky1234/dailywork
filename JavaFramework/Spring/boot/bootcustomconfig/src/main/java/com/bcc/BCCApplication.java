package com.bcc;

import com.bcc.beans.Artist;
import com.bcc.factory.YamlPropertySourceFactory;
import com.bcc.initializer.YamlPropertySourceApplicationContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(name = "config", value="classpath:config.yml", factory = YamlPropertySourceFactory.class)
public class BCCApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BCCApplication.class, args);
        /*SpringApplicationBuilder builder = new SpringApplicationBuilder(BCCApplication.class).initializers(new YamlPropertySourceApplicationContextInitializer());
        SpringApplication springApplication = builder.build();
        
        ApplicationContext applicationContext = springApplication.run(args);*/
        Artist artist = applicationContext.getBean(Artist.class);
        System.out.println(artist);
    }
}
