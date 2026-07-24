package com.cch.dto;

import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(builderMethodName = "of")
@AllArgsConstructor
@NoArgsConstructor
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "account-details")
public class AccountDetails {
    @XmlElement(name = "account-no")
    private String accountNo;
    @XmlElement(name = "account-holder-name")
    private String accountHolderName;
    @XmlElement(name = "contact-no")
    private String contactNo;
    @XmlElement(name = "email-address")
    private String emailAddress;
    @XmlElement(name = "ifsc-code")
    private String ifscCode;
    private String status;
}
