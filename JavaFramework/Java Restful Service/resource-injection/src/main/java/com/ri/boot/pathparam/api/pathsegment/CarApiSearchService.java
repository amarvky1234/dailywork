package com.ri.boot.pathparam.api.pathsegment;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.PathSegment;

import java.security.SecureRandom;
import java.util.stream.Collectors;

@Path("/car")
public class CarApiSearchService {

    @GET
    @Path("/{city}/{manufacturer}/search")
    @Produces(MediaType.TEXT_PLAIN)
    final public String search(final @PathParam("city") PathSegment city,
                               final @PathParam("manufacturer") PathSegment manufacturer,
                               final @QueryParam("model") String model,
                               final @QueryParam("year") int year){
        final StringBuilder builder = new StringBuilder();

        builder.append("city :").append(city.getPath())
                .append(" matrixParam :").append(extractMultiValuedMap(city.getMatrixParameters()))
                .append(" manufacturer :").append(manufacturer.getPath())
                .append(" matrixParam :").append(extractMultiValuedMap(manufacturer.getMatrixParameters()))
                .append(" model :").append(model).append(" year :").append(year);
        return builder.toString();
    }

    final private String extractMultiValuedMap(final MultivaluedMap<String, String> matrixParam){
        final StringBuilder builder = new StringBuilder();
        matrixParam.forEach((k, v) -> {
            builder.append(k).append("={").append(v.stream().collect(Collectors.joining(",")))
                    .append("}");
        });
        return builder.toString();
    }
}
