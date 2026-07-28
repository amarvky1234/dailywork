package com.ri.boot.beanparam.dto;

import jakarta.ws.rs.CookieParam;
import jakarta.ws.rs.FormParam;
import jakarta.ws.rs.HeaderParam;
import jakarta.ws.rs.PathParam;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.jboss.resteasy.annotations.Form;

@Data
@NoArgsConstructor
public class LoanApplication {
    @PathParam("loanType")
    private String loanType;
    @FormParam("applicantName")
    private String applicantName;
    @FormParam("age")
    private int age;
    @FormParam("gender")
    private String gender;
    @FormParam("mobileNo")
    private String mobileNo;
    @FormParam("emailAddress")
    private String emailAddress;
    @FormParam("employeeType")
    private String employeeType;
    @HeaderParam("app-code")
    private String appCode;
    @CookieParam("access-token")
    private String accessToken;
}
