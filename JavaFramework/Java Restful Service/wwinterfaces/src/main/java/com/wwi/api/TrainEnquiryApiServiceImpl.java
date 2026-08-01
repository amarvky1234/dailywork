package com.wwi.api;

import jakarta.ws.rs.Path;

@Path("/enquiry")
public class TrainEnquiryApiServiceImpl implements TrainEnquiryApiService{
    @Override
    public String liveStatus(long trainNo) {
        return "2 Kms a head to Mathura.. (Travelling West)";
    }
}
