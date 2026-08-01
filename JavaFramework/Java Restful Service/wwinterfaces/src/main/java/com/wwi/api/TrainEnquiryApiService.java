package com.wwi.api;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.core.MediaType;

//@Path("/enquiry")
public interface TrainEnquiryApiService {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    String liveStatus(@QueryParam("trainNo") long trainNo);
}
