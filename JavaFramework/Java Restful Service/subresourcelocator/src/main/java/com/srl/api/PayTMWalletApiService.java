package com.srl.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.security.SecureRandom;

public class PayTMWalletApiService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{mobile}/balance")
    public double getBalance(@PathParam("mobileNo") String mobileNo){
        return new SecureRandom().nextDouble(99999);
    }
}
