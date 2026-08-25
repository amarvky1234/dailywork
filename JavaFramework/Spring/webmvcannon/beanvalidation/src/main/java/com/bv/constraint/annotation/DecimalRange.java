package com.bv.constraint.annotation;

import com.bv.constraint.validator.DecimalRangeConstraintValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = DecimalRangeConstraintValidator.class)
public @interface DecimalRange {
    String message() default "Decimal Range should be between min and max value";

    double min() default 0.0;

    double max() default 0.0;

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
