package com.railyatra.resources.ticket;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;

@Path("/ticket")
public class TicketResource {

    public TicketResource() {
        System.out.println("new TicketResource()");
    }

    @GET
    @Produces("text/plain")
    public String pnrStatus(@QueryParam("pnrNo") String pnrNo){

        return "CNF";
    }
}
