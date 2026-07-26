package com.courier.service;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;

public class CourierService {
    private final static String ROOT_URI = "http://localhost:8080/pathparam/api/courier";
    private final Client client;

    public CourierService() {
        ClientBuilder builder = ClientBuilder.newBuilder();
        builder.property("connection.timeout", "1000");
        client = builder.build();
    }

    public String tracking(String awbNo, long zipCode){
        String trackingInfo = null;

        WebTarget target = client.target(ROOT_URI).path("/{awbNo}/tracking/{zipCode}/details");
        target = target.resolveTemplate("awbNo", awbNo).resolveTemplate("zipCode", zipCode);

        Invocation.Builder builder = target.request();
        Invocation invocation = builder.buildGet();
        Response response = invocation.invoke();
        if (response.getStatus() == 200){
            response.bufferEntity();
            trackingInfo = response.readEntity(String.class);
        }
        return trackingInfo;
    }
}
