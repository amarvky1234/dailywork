package com.bv.constraint.validator;

import com.bv.constraint.annotation.DecimalRange;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class DecimalRangeConstraintValidator implements ConstraintValidator<DecimalRange, Double> {
    private DecimalRange decimalRange;

    @Override
    public boolean isValid(Double val, ConstraintValidatorContext constraintValidatorContext) {
        if (val == null) {
            return false;
        }
        if (val < decimalRange.min() || val > decimalRange.max()) {
            return false;
        }
        return true;
    }

    @Override
    public void initialize(DecimalRange decimalRange) {
        this.decimalRange = decimalRange;
    }
}
