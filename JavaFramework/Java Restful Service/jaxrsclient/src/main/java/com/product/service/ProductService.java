package com.product.service;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;

public class ProductService {
    private final static String ROOT_URI = "http://localhost:8080/resource-injection/api/product";
    private final Client client = ClientBuilder.newClient();

    public String searchProduct(String category, String manufacturer, String model, String color){
        String productDetails = null;

        WebTarget target = client.target(ROOT_URI).path("/{category}").matrixParam("model", model)
                .path("/{manufacturer}").matrixParam("color", color).path("/search")
                .resolveTemplate("category", category).resolveTemplate("manufacturer", manufacturer);

        Invocation invocation = target.request().buildGet();
        Response response = invocation.invoke();
        if(response.getStatus() == 200){
            productDetails = response.readEntity(String.class);
        }
        return productDetails;
    }
}
