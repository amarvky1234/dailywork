package com.bookstore.bo;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder(builderMethodName = "of")
public class AuthorBo {
    private int authorId;
    private String fullName;
    private String gender;
    private LocalDate dob;
    private String contactNo;
    private String emailAddress;
}
