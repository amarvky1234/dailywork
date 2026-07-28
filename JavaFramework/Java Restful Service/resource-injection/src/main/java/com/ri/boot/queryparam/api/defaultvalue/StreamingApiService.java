package com.ri.boot.queryparam.api.defaultvalue;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/streaming")
public class StreamingApiService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{category}/browse")
    public String browse(@PathParam("category") String category,
                         @QueryParam("criteria") @DefaultValue("popular") String criteria){

        return "category : "+ category +" criteria : "+criteria;
    }
}
