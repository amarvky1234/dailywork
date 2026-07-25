package com.eh.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(builderMethodName = "of")
@AllArgsConstructor
@NoArgsConstructor
public class Receipt {
    private String txId;
    private String billNo;
    private String merchantId;
    private double amount;
    private String status;
}
