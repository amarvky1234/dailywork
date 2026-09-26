package com.bp.beans;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "db")
@Data
public class ConnectionManager {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
}
