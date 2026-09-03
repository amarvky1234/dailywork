package com.bcc.beans;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "artist")
public class Artist {
    private String name;
    private String artType;
    private int experience;
    private String gender;
    private Address address = new Address();

    @Data
    public class Address{
        private String addressLine1;
        private String addressLine2;
        private String city;
        private String state;
        private String country;
    }
}
