package com.busyatra.form;

import lombok.Data;

@Data
public class PassengerCriteriaForm {
    private String passengerName;
    private String mobileNo;
    private String email;
    private String gender;
    private int ageFrom;
    private int ageTo;
}
