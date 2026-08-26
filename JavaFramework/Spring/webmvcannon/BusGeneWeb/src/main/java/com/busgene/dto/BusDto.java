package com.busgene.dto;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder(builderMethodName = "of")
public class BusDto {
    private String busNo;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private String busType;
    private int totalHours;
    private String status;
}
