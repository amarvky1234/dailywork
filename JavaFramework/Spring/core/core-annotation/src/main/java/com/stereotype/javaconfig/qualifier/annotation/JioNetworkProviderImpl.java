package com.stereotype.javaconfig.qualifier.annotation;

import org.springframework.stereotype.Component;

import java.util.UUID;

//sourcecode
@Component("jio")
public class JioNetworkProviderImpl implements INetworkProvider{
    @Override
    public String eSim(String packageName, String cid) {
        System.out.println("Jio eSim generated...");
        return UUID.randomUUID().toString();
    }
}
