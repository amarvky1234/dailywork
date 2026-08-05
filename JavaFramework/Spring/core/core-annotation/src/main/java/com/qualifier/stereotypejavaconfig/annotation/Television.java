package com.qualifier.stereotypejavaconfig.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//sourcecode
@Component
public class Television {
    @Autowired
    //@Qualifier("airtelSettopBox")  not recommeded
    @Qualifier("preferred")
    private ISetTopBox iSetTopBox;

    public void on(String channelNo){
        iSetTopBox.stream(channelNo);
        System.out.println("tv is on and streaming...");
    }
}
