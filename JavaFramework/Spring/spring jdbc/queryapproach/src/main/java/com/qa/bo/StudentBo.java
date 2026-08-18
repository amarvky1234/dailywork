package com.qa.bo;

import lombok.Builder;
import lombok.Data;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder(builderMethodName = "of")
public class StudentBo {
    private int studentNo;
    private String studentName;
    private int age;
    private String gender;
    private String mobileNo;
    private String emailAddress;
}
