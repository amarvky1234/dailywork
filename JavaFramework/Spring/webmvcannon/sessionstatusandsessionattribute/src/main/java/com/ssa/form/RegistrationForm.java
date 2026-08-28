package com.ssa.form;

import lombok.Data;

@Data
public class RegistrationForm {
    private String fullname;
    private int age;
    private String gender;
    private String password;
    private String reTypePassword;
    private String email;
    private String addressLine1;
    private String city;
    private String state;
    private int zip;
    private String country;
}
