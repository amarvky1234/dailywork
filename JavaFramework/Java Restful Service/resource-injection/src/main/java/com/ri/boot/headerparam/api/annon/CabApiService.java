package com.ri.boot.headerparam.api.annon;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/cab")
public class CabApiService {

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{source}/{destination}/ride")
    public String ride(@PathParam("source") String source,
                       @PathParam("destination") String destination,
                       @QueryParam("cabType") @DefaultValue("mini") String cabType,
                       @HeaderParam("app-code") String appCode,
                       @CookieParam("access-token") String accessToken){

        return "source : " +source +" destination : " +destination +" cabType : " +cabType +" appCode : " +appCode
                +" accessToken : " +accessToken;
    }
}
