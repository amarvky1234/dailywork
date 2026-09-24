package com.bootjdbc.bo;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder(builderMethodName = "of")
public class AuthorBo {
    private int authorId;
    private String fullName;
    private LocalDate dob;
    private String gender;
    private String emailAddress;
    private String contactNo;
}
