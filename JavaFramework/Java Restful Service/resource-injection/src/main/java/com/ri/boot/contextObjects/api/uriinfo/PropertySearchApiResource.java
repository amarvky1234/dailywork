package com.ri.boot.contextObjects.api.uriinfo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.UriInfo;

import java.util.stream.Collectors;

@Path("/popertySearch")
final public class PropertySearchApiResource {

    @GET
    @Path("/{city}/{propertyType}")
    @Produces(MediaType.TEXT_PLAIN)
    final public String searchProperty(final @Context UriInfo uriInfo){
        final StringBuilder builder = new StringBuilder();

        builder.append(uriInfo.getPathSegments().stream().map(pathSegment -> {
            return "PathParam :"+ pathSegment.getPath() + " matrixParam:{" +extractMultiValuedMap(pathSegment.getMatrixParameters());
        }).collect(Collectors.joining("};")));

        builder.append(" queryParam: ").append(extractMultiValuedMap(uriInfo.getQueryParameters()));

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
