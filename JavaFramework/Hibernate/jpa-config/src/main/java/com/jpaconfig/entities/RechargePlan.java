package com.jpaconfig.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "recharge_plan")
public class RechargePlan implements Serializable {
    @Id
    @Column(name = "plan_no")
    private int planNo;
    @Column(name = "plan_nm")
    private String planName;
    private String circle;
    @Column(name = "validity_days")
    private int validityDays;
    private String description;
    @Column(name = "recharge_amt")
    private double rechargeAmount;

}
