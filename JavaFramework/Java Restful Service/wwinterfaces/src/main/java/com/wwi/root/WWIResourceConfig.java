package com.wwi.root;

import com.wwi.api.TrainEnquiryApiServiceImpl;
import com.wwi.api.TrainEnquiryApiServiceV2Impl;
import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api")
public class WWIResourceConfig extends ResourceConfig {

    public WWIResourceConfig(){
        register(TrainEnquiryApiServiceImpl.class);
        register(TrainEnquiryApiServiceV2Impl.class);
    }
}
