package com.busyatra.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName = "of")
public class PassengerDto {
    private String passengerName;
    private String mobileNo;
    private String email;
    private String gender;
    private int age;
}
