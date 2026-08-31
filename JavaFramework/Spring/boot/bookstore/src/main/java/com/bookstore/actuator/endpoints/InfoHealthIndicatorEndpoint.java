package com.bookstore.actuator.endpoints;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

@Component
public class InfoHealthIndicatorEndpoint implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        builder.withDetail("applicationName", "bookstore").withDetail("version", "1.0.0").build();
    }
}
