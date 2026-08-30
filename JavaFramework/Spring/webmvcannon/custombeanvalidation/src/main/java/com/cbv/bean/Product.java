package com.cbv.bean;

import com.cbv.constraint.annotation.DecimalRange;
import jakarta.validation.constraints.*;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder(builderMethodName = "of")
public class Product {
    @Positive(message = "Product No must be non-zero positive number")
    private int productNo;
    @NotBlank
    private String productName;
    @NotBlank(message = "Description cannot be blank")
    private String description;
    @NotBlank(message = "Manufacturer cannot be blank")
    private String manufacturer;
    @Past(message = "Manufacturer Date should  be in past")
    private LocalDate manufacturerDate;
    @DecimalRange(message = "price should be between 20 to 120", min = 20, max = 120)
    private double price;
}
