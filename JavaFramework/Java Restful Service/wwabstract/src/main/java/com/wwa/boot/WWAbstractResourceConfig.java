package com.wwa.boot;

import com.wwa.api.ParcelJsonApiService;
import com.wwa.api.ParcelXmlApiService;
import jakarta.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;

@ApplicationPath("/api")
public class WWAbstractResourceConfig extends ResourceConfig {
    public WWAbstractResourceConfig(){
        register(ParcelJsonApiService.class);
        register(ParcelXmlApiService.class);
    }
}
