package com.bec;

import com.bec.beans.Rocket;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BootExitCodeApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(BootExitCodeApplication.class, args);

        Rocket rocket = applicationContext.getBean(Rocket.class);
        rocket.launch(0);

        System.exit(SpringApplication.exit(applicationContext));
    }

    @Bean
    public ExitCodeGenerator exitCodeGenerator(){
        return () -> 39;
    }

    @Bean
    public ApplicationListener<ExitCodeEvent> exitCodeEventApplicationListener(){
        return (ExitCodeEvent e)-> System.out.println("Application exited with exitCode "+ e.getExitCode());
    }

    @Bean
    public ExitCodeExceptionMapper exitCodeExceptionMapper(){
        return (Throwable e) -> {
            if (e instanceof IllegalArgumentException){
                return 50;
            }
            return 1;
        };
    }

    @Bean
    public CommandLineRunner commandLineRunner(){
        return (String[] args) -> {
            throw new IllegalArgumentException("unable to launch");
        };
    }
}
