package com.ecommerce.dto;

import lombok.Data;

@Data
public class Seller {
    private long id;
    private String businessName;
    private Address address;
    private String contactNo;
    private String emailAddress;
    private String[] serviceAreas;
}
