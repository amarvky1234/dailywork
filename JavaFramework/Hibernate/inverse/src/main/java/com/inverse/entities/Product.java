package com.inverse.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@ToString(exclude = "manufacturer")
@EqualsAndHashCode(exclude = "manufacturer")
@AllArgsConstructor
@NoArgsConstructor
@Builder(builderMethodName = "of")
@Entity
@Table(name = "products1")
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
