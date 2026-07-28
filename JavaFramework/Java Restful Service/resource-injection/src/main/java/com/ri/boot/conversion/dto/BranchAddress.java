package com.ri.boot.conversion.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName = "of")
public class BranchAddress {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private int zip;
    private String country;
    private String openHours;
    private String closingHours;
}
