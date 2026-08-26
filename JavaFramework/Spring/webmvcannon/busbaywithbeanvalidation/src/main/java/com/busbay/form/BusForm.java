package com.busbay.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class BusForm {
    @NotBlank
    private String busNo;
    @NotBlank
    private String modelNo;
    @NotBlank
    private String manufacturer;
    @NotBlank
    private String chassisNo;
    @NotBlank
    private String engineNo;
    @NotBlank
    private String fuelType;
    @Positive
    private double price;
}
