package com.bpp.test;

import com.bpp.beans.Processor;
import com.bpp.helper.ObjectWatcher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BPPTest {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext
                ("com.bpp.beans", "com.bpp.postprocessor");

        System.out.println("no of bean instance : "+ ObjectWatcher.get());

        context.getBean(Processor.class);
        context.getBean(Processor.class);

        System.out.println("after processor, no of bean instance : "+ ObjectWatcher.get());
    }
}
