package com.cab.service;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;

public class CabService {
    private final static String ROOT_URI = "http://localhost:8080/resource-injection/api/cab";
    private final Client client = ClientBuilder.newClient();
    public String ride(String source, String destination, String cabType, String appCode, String accessToken){
        return client.target(ROOT_URI).path("/{source}/{destination}")
                .resolveTemplate("source", source)
                .resolveTemplate("destination", destination).path("/ride")
                .queryParam("cabType", cabType)
                .request().header("app-code", appCode)
                .cookie("access-token", accessToken)
                .buildPost(null).invoke(String.class);
    }
}
