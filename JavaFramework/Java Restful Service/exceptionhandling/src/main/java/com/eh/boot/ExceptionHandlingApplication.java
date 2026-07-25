package com.eh.boot;

import com.eh.resource.BilldeskPaymentApiService;
import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api")
public class ExceptionHandlingApplication extends ResourceConfig {
    public ExceptionHandlingApplication() {
        register(JacksonFeature.class);
        register(BilldeskPaymentApiService.class);
    }
}
