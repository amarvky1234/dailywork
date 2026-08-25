package com.bv.test;

import com.bv.bean.Product;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;

import java.util.Set;

public class ProductTest {
    public static void main(String[] args) {
        Product product = Product.of().productNo(87).productName("Led Television").price(10).build();


        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();

        Set<ConstraintViolation<Product>> constraintViolations = validator.validate(product);
        constraintViolations.forEach(constraintViolation -> {
            System.out.println(constraintViolation.getMessage());
        });
    }
}
