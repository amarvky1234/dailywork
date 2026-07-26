package com.account.servcie;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;

public class AccountService {
    private final static String ROOT_URI = "http://localhost:8080/customcontenthandlers/api/account";
    private final Client client;

    public AccountService() {
        ClientBuilder builder = ClientBuilder.newBuilder();
        client = builder.build();
    }
}
