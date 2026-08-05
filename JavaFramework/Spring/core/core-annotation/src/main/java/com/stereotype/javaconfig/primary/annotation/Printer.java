package com.stereotype.javaconfig.primary.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//sourcecode
@Component
public class Printer {
    @Autowired
    //@Qualifier("hpToner")
    private IToner toner;

    public void print(String doc){
        toner.roll(doc);
        System.out.println("printing...");
    }
}
