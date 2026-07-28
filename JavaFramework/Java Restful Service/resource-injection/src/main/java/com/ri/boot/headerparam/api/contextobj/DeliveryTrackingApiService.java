package com.ri.boot.headerparam.api.contextobj;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.HttpHeaders;
import jakarta.ws.rs.core.MultivaluedMap;

import java.util.stream.Collectors;

@Path("/delivery")
public class DeliveryTrackingApiService {

    @GET
    @Path("/{orderNo}/track")
    public String track(@PathParam("orderNo") String orderNo, @Context HttpHeaders httpHeaders){
        final StringBuilder builder = new StringBuilder();
        builder.append("orderNo : ").append(orderNo)
                .append(" headers : ")
                .append(extractMultiValuedMap(httpHeaders.getRequestHeaders()));
        return builder.toString();
    }

    private String extractMultiValuedMap(final MultivaluedMap<String, String> matrixParams){
        final StringBuilder builder = new StringBuilder();

        matrixParams.forEach((k,v) -> {
            builder.append(k).append("={").append(v.stream().collect(Collectors.joining(","))).append("}");
        });
        return builder.toString();
    }
}
