package com.pp.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;

@Path("/courier")
public class CourierResource {

    @GET
    @Produces("text/plain")
    @Path("/{awbNo}/tracking/{zipCode}/details")
    public String tracking(@PathParam("awbNo") String awbNo, @PathParam("zipCode") long zipCode){
        return "Tracking details for awbNo : " +awbNo + ", zipCode : " + zipCode + " is in-transit";
    }
}
