package com.ri.boot.queryparam.api.multivalue;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;
import java.util.stream.Collectors;

@Path("/property")
public class PropertySearchApiService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{city}/{propertyType}/search")
    public String searchForRentals(@PathParam("city") String city,@PathParam("propertyType") String propertyType,
                                   @QueryParam("facing") List<String> facings){

        StringBuilder builder = new StringBuilder();
        builder.append("city : ").append(city)
                .append(" propertyType : ").append(propertyType)
                .append(" facing : ").append(facings.stream().collect(Collectors.joining(",")));
        return builder.toString();
    }

}
