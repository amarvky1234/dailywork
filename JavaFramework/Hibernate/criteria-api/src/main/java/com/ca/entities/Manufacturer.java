package com.ca.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Data
@Entity
@Table(name = "manufacturer_hql")
public class Manufacturer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "manufacturer_no")
    private int manufacturerNo;
    @Column(name = "business_nm")
    private String businessName;
    @Column(name = "established_dt")
    private LocalDate establishedDate;
    @Column(name = "contact_no")
    private String contactNo;
    @Column(name = "email_address")
    private String emailAddress;

    @OneToMany(mappedBy = "manufacturer")
    private Set<Product> products;
}
