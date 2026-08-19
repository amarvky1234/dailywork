package com.studmgmt.bo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName = "of")
public class StudentBo {
    private String studentName;
    private int age;
    private String gender;
    private String mobileNo;
    private String emailAddress;
}
