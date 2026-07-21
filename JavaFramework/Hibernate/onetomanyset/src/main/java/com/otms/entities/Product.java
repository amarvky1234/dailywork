package com.otms.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder(builderMethodName = "of")
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "product1")
public class Product implements Serializable {
    @Id
    @Column(name = "product_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productNo;
    @Column(name = "product_nm")
    private String productName;
    private String description;
    private String category;
    private double price;

}
