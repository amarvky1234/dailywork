package com.busbay.form;

import lombok.Data;

@Data
public class BusForm {
    private String busNo;
    private String modelNo;
    private String manufacturer;
    private String chassisNo;
    private String engineNo;
    private String fuelType;
    private double price;
}
