package com.account.dto;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

@Data
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "application-form")
public class ApplicationForm {
    @XmlElement(name = "applicant-name")
    private String applicantName;
    private int age;
    private String gender;
    @XmlElement(name = "mobile-no")
    private String mobileNo;
    @XmlElement(name = "email-address")
    private String emailAddress;
    @XmlElement(name = "account-type")
    private String accountType;
    @XmlElement(name = "aadhar-no")
    private String aadharNo;
    @XmlElement(name = "pan-no")
    private String panNo;
}
