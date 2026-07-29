package com.paytm.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

import java.security.SecureRandom;

@Path("/wallet")
public class WalletResource {

    @GET
    @Produces("text/plain")
    public double getBalance(String mobileNo){

        //perform business logic
        return new SecureRandom().nextDouble(84844);
    }
}
