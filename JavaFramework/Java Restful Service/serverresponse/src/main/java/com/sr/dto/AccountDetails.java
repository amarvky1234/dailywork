package com.sr.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(builderMethodName = "of")
@AllArgsConstructor
@NoArgsConstructor
public class AccountDetails {
    private String accountNo;
    private String accountHolderName;
    private String accountType;
    private double price;
}
