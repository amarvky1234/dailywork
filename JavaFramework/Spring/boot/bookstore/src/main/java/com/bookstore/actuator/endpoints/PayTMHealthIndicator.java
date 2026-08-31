package com.bookstore.actuator.endpoints;

import lombok.AllArgsConstructor;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component("paytm")
@AllArgsConstructor
public class PayTMHealthIndicator implements HealthIndicator {
    private final String PAYTM_ENDPOINT = "https://www.paytm.com";
    private final RestTemplate restTemplate;

    @Override
    public Health health() {
        final ResponseEntity<String> response = restTemplate.getForEntity(PAYTM_ENDPOINT, String.class);
        if(response.getStatusCode() == HttpStatusCode.valueOf(200)) {
            return Health.up().build();
        }else {
            return Health.down().build();
        }
    }
}
