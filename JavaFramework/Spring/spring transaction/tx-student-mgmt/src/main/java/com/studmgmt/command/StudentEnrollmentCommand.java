package com.studmgmt.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
