package com.wwi.api;

import jakarta.ws.rs.Path;

@Path("/enquiryV2")
public class TrainEnquiryApiServiceV2Impl implements TrainEnquiryApiService{
    @Override
    public String liveStatus(long trainNo) {
        return "2 Kms a head to Mathura... (Travelling west), 10 Km away from Jhansi";
    }
}
