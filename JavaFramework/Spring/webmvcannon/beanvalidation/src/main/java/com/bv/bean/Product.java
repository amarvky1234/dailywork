package com.bv.bean;

import com.bv.constraint.annotation.DecimalRange;
import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder(builderMethodName = "of")
public class Product {
    @Positive(message = "Product No must be non-zero positive number")
    private int productNo;
    @NotBlank(message = "Product Name cannot be blank")
    private String productName;
    @NotBlank(message = "Description cannot be blank")
    private String description;
    @NotBlank(message = "Manufacturer cannot be blank")
    private String manufacturer;
    @Past(message = "Manufacturer Date should  be in past")
    private LocalDate manufacturerDate;
    //@DecimalMin(value = "1", message = "Price should be minimum 1")
    //@DecimalMax(value = "99999", message = "Price cannot exceed 99999")
    @DecimalRange(message = "price should be between 100 to 9999", min = 100, max = 9999)
    private double price;
}
