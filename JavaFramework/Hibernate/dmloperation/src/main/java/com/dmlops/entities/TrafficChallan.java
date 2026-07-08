package com.dmlops.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "traffic_challan")
public class TrafficChallan implements Serializable{
    @Id
    @Column(name = "challan_no")
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int challanNo;
    @Column(name = "vehicle_registration_no")
    private String vehicleRegistrationNo;
    @Column(name = "drivers_license_no")
    private String driversLicenseNo;
    @Column(name = "challan_dt")
    private LocalDate challanDate;
    @Column(name = "reason_for_challan")
    private String reasonForChallan;
    private double amount;


}
