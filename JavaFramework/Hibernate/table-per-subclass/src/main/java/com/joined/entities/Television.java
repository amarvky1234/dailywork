package com.joined.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "television")
@Inheritance(strategy = InheritanceType.JOINED)
public class Television implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "television_product_code")
    private int televisionProductCode;
    @Column(name = "serial_no")
    private String serialNo;
    @Column(name = "model_no")
    private String modelNo;
    private String manufacturer;
    private String dimensions;
    private double price;
}
