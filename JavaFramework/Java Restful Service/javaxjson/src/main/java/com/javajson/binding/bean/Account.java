package com.javajson.binding.bean;

import jakarta.json.bind.annotation.JsonbProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(builderMethodName = "of")
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    private String accountNo;
    private String accountHolderName;
    private String accountType;
    @JsonbProperty("branchCode")
    private String ifscCode;
    private String[] nominees;
    private double balance;
}
