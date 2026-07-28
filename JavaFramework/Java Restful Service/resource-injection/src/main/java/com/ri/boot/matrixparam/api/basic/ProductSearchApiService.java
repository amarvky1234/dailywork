package com.ri.boot.matrixparam.api.basic;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("product")
public class ProductSearchApiService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/{category}/{manufacturer}/search")
    public String searchProduct(@PathParam("category") String category, @PathParam("manufacturer") String manufacturer,
                                @MatrixParam("model") String model, @MatrixParam("color") String color){
        return "category : "+category + " manufacturer : "+manufacturer + " model : "+model + " color : "+color;
    }
}
