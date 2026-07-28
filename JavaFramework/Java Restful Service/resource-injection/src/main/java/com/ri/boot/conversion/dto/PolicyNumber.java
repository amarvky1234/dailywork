package com.ri.boot.conversion.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class PolicyNumber {
    private String policyType;
    private String branch;
    private long uniqueNo;

    /*public PolicyNumber(String no){
        this.policyType = no.substring(0, 3);
        this.branch = no.substring(4, 6);
        this.uniqueNo = Long.parseLong(no.substring(7, 12));
    }*/

    /*public static PolicyNumber valueOf(String no){
        PolicyNumber policyNumber = new PolicyNumber();
        policyNumber.policyType = no.substring(0, 3);
        policyNumber.branch = no.substring(4,6);
        policyNumber.uniqueNo = Long.parseLong(no.substring(7,12));
        return policyNumber;
    }*/

    public static PolicyNumber fromString(String no){
        PolicyNumber policyNumber = new PolicyNumber();
        policyNumber.policyType = no.substring(0, 3);
        policyNumber.branch = no.substring(3,6);
        policyNumber.uniqueNo = Long.parseLong(no.substring(6,12));
        return policyNumber;
    }

    @Override
    public String toString() {
        return policyType + branch +uniqueNo;
    }
}
