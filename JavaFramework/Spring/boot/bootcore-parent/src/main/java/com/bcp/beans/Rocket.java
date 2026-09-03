package com.bcp.beans;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@ToString
@Component
public class Rocket {
    @Value("${rocket.name}")
    private String name;
    @Value("${rocket.weight}")
    private int weight;
}
