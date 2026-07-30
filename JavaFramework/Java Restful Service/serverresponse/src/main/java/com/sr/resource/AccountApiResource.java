package com.sr.resource;

import com.sr.dto.AccountDetails;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.NewCookie;
import jakarta.ws.rs.core.Response;

@Path("/account")
public class AccountApiResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{accountNo}")
    public Response getAccountDetails(@PathParam("accountNo") String accountNo){
        AccountDetails accountDetails = null;
        Response response = null;

        accountDetails = AccountDetails.of().accountNo(accountNo)
                .accountType("saving").accountHolderName("Smith").price(4500).build();

        Response.ResponseBuilder builder = Response
                .status(201).header("k1","v1")
                .header("k2","v2").cookie(new NewCookie("ck1", "cv1"))
                .entity(Entity.json(accountDetails));
        response = builder.build();

        return response;
    }
}
