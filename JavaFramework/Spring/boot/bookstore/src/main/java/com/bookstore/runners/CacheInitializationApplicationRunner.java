package com.bookstore.runners;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CacheInitializationApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("non-option arguments");
        args.getNonOptionArgs().forEach(System.out::println);

        System.out.println("option arguments");
        args.getOptionNames().forEach(optionName->{
            System.out.println("optionName: " +optionName+ " , optionValue: "+ args.getOptionValues(optionName));
        });
    }
}
