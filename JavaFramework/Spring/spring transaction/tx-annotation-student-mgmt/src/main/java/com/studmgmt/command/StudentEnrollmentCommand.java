package com.studmgmt.command;

import lombok.Builder;
import lombok.Data;

@Data
@Builder(builderMethodName = "of")
public class StudentEnrollmentCommand {
    private String studentName;
    private int age;
    private String gender;
    private String mobileNo;
    private String emailAddress;
    private int courseNo;
}
