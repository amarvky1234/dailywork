package com.railyatra.dto;

import lombok.Data;

@Data
public class TrainInfo {
    private long trainNo;
    private String source;
    private String destination;
    private String departureTime;
    private String arrivalTime;
    private String day;
    private int runtime;
}
