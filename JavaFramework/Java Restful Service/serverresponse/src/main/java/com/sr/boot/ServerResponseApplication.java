package com.sr.boot;

import com.fasterxml.jackson.core.util.JacksonFeature;
import com.sr.resource.AccountApiResource;
import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api")
public class ServerResponseApplication extends ResourceConfig {
    public ServerResponseApplication() {
        register(AccountApiResource.class);
        register(JacksonFeature.class);
    }
}
