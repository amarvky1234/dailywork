package com.ri.boot.pathparam.api.regex;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/parcel")
public class ParcelApiService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{awbNo:[a-zA-Z0-9]{11}}/track")
    public String track(@PathParam("awbNo") String awbNo){
        return "awbNo : " + awbNo + " status: out-for-delivery";
    }
}
