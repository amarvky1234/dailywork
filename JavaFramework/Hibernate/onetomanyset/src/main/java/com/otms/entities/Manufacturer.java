package com.otms.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Data
@Builder(builderMethodName = "of")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "manufacturer")
public class Manufacturer implements Serializable {
    @Id
    @Column(name = "manufacturer_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int manufacturerNo;
    @Column(name = "business_nm")
    private String businessName;
    @Column(name = "establish_dt")
    private LocalDate establishDate;
    private String headquarters;
    @Column(name = "contact_no")
    private String contactNo;
    @Column(name = "email_address")
    private String emailAddress;

    @OneToMany
    @JoinColumn(name = "manufacturer_no", nullable = true)
    private Set<Product> products;
}
