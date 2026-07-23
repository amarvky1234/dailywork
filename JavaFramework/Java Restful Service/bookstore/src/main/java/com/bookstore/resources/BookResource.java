package com.bookstore.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;

import java.security.SecureRandom;

@Path("/book")
public class BookResource {

    @GET
    @Produces("text/plain")
    public double getBookPrice(@QueryParam("isbn") String isbn){
        //perform business logic in computing the price of the book
        return new SecureRandom().nextDouble();
    }
}
