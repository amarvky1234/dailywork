package com.book.service;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;

public class BookService {
    public double getBookPrice(String isbn){
        double price = 0;
        Client client = null;
        ClientBuilder builder = null;
        WebTarget webTarget = null;
        Invocation invocation = null;
        Invocation.Builder invocationBuilder = null;

        builder = ClientBuilder.newBuilder();
        builder.property("connection.timeout", "1000");

        client = builder.build();
        webTarget = client.target("http://localhost:8080/bookstore/api/book");
        webTarget = webTarget.queryParam("isbn", isbn);

        invocationBuilder = webTarget.request();
        invocation = invocationBuilder.buildGet();

        Response response = invocation.invoke();
        if (response.getStatus() == 200){
            price = response.readEntity(Double.class);
        }

        return price;
    }
}
