package com.qualifier.stereotypejavaconfig.annotation;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.qualifier.stereotypejavaconfig.annotation"})
public class SJQualifierConfig {

    @Bean
    public ISetTopBox airtelSettopBox(){
        ISetTopBox iSetTopBox = new AirtelSetTopBoxImpl();
        return iSetTopBox;
    }

    @Bean
    @Qualifier("preferred")
    public ISetTopBox tataskySettopBox(){
        ISetTopBox iSetTopBox = new TataskySetTopBoxImpl();
        return iSetTopBox;
    }
}
