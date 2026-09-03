package com.bcp.beans;

import lombok.AllArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@ToString
public class Launcher {
    private final Rocket rocket;
}
