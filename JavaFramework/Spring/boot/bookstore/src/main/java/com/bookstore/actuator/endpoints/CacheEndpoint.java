package com.bookstore.actuator.endpoints;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.stereotype.Component;

@Endpoint(id = "cache")
@Component
public class CacheEndpoint {

    @DeleteOperation
    public String evict(@Selector String key) {
        return "evicted key : " + key + " from cache";
    }
}
