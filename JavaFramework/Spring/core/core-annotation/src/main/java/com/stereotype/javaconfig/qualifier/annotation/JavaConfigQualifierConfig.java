package com.stereotype.javaconfig.qualifier.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.stereotype.javaconfig.qualifier.annotation"})
public class JavaConfigQualifierConfig {

    @Bean
    public Mobile mobile(@Qualifier("airtel")INetworkProvider networkProvider){
        Mobile mobile = new Mobile();
        mobile.setNetworkProvider(networkProvider);
        return mobile;
    }
}
