package com.vw.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName = "of")
public class PassengersDto {
    private String passengerName;
    private int age;
    private String gender;
    private String mobileNo;
    private String busStopName;
}
