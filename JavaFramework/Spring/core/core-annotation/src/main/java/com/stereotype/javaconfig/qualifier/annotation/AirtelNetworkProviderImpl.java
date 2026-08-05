package com.stereotype.javaconfig.qualifier.annotation;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.UUID;

//sourcecode
@Component("airtel")
public class AirtelNetworkProviderImpl implements INetworkProvider{
    @Override
    public String eSim(String packageName, String cid) {
        System.out.println("airtel eSim generated...");
        return UUID.randomUUID().toString();
    }
}
