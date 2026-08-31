package com.bookstore.form;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class AuthorForm {
    @NotEmpty
    private String fullName;
    @NotEmpty
    private String gender;
    @Past
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private LocalDate dob;
    @NotEmpty
    @Length(min = 10, max = 13)
    private String contactNo;
    @NotEmpty
    @Length(max = 50)
    @Email
    private String emailAddress;
}
