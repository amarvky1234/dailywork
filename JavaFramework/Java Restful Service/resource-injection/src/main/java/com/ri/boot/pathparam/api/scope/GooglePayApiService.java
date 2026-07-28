package com.ri.boot.pathparam.api.scope;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.security.SecureRandom;

@Path("/{mobileNo}/gpay")
public class GooglePayApiService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/balance")
    public String getBalance(@PathParam("mobileNo") String mobileNo){
        return "balance : "+ new SecureRandom().nextDouble(99999) + "for mobile : "+ mobileNo;
    }

    @PUT
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{mobileNo}/change")
    public String changeGPayNumber(@PathParam("mobileNo") String newMobileNo){
        return "new mobileNo : "+newMobileNo + " changed";
    }
}
