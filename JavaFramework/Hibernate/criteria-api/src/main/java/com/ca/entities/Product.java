package com.ca.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Data
@Entity
@Table(name = "product_hql")
public class Product implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_no")
    private int productNo;
    @Column(name = "product_nm")
    private String productName;
    private String description;
    private String category;
    private double price;

    @ManyToOne
    @JoinColumn(name = "manufacturer_no", nullable = false)
    private Manufacturer manufacturer;
}
