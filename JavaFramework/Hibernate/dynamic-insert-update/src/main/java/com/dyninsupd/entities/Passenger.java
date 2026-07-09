package com.dyninsupd.entities;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

@Data
@Entity
@Table(name = "passenger")
//@DynamicInsert(value = true)
@DynamicUpdate(value = true)
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "passenger_no")
    private int passengerNo;
    @Column(name = "full_nm")
    private String fullName;
    private int age;
    private String gender;
    @Column(name = "mobile_no")
    private String mobileNo;
    @Column(name = "email_address")
    private String emailAddress;
}
