package com.srm.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

import java.security.SecureRandom;

@Path("/account")
public class AccountResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/balance")
    public double getBalance(@QueryParam("/accountNo") String accountNo){
        return new SecureRandom().nextInt(95844);
    }

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/ifscCode")
    public String getIfscCode(@QueryParam("/accountNo") String accountNo){
        return "CNB67"+(new SecureRandom()).nextInt(99999);
    }
}
