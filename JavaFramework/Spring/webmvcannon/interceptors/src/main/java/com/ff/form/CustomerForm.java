package com.ff.form;

import com.ff.formatter.annotation.PhoneNumberFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;

@Data
public class CustomerForm {
    private String fullname;
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private LocalDate dob;
    private String gender;
    @PhoneNumberFormat
    private PhoneNumber phoneNumber;
    private String email;

    public CustomerForm(){
        phoneNumber = new PhoneNumber();
    }
}
