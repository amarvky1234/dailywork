package com.blc.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.ToString;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@ToString
public class Calculator implements InitializingBean, DisposableBean {
    private int a;
    private int b;
    private int sum;

    public Calculator(@Value("${a}") int a) {
        this.a = a;
    }

    @Value("${b}")
    public void setB(int b) {
        this.b = b;
    }

    @Override
    public void destroy() throws Exception {
        this.a = 0;
        this.b = 0;
        this.sum = 0;
        System.out.println("destroying()...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertySet()..");
        this.sum = this.a + this.b;
    }

    /* public Calculator(@Value("${a}") int a) {
        this.a = a;
    }

    @PostConstruct
    public void init(){
        System.out.println("init()");
        this.sum = this.a + this.b;
    }

    @Value("${b}")
    public void setB(int b) {
        this.b = b;
    }

    @PreDestroy
    public void release(){
        a = 0;
        b = 0;
        sum = 0;
        System.out.println("release()");
    }*/
}
