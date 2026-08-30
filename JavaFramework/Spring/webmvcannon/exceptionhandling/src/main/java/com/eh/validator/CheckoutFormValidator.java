package com.eh.validator;

import com.eh.form.CheckoutForm;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.time.LocalDate;

@Component
public class CheckoutFormValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(CheckoutForm.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        CheckoutForm form = (CheckoutForm) target;

        if (StringUtils.hasText(form.getCardNumber()) == false){
            errors.rejectValue("cardNumber", "cardNumber.blank");
        } else if (form.getCardNumber().length() != 16) {
            errors.rejectValue("cardNumber", "cardNumber.invalid");
        }

        if (errors.hasFieldErrors("expiryMonth") == false){
            if (form.getExpiryMonth() < 1 || form.getExpiryMonth() > 12){
                errors.rejectValue("expiryMonth", "expiryMonth.invalid");
            }
        }

        if (errors.hasFieldErrors("expiryYear") == false){
            if (form.getExpiryYear() < LocalDate.now().getYear() || form.getExpiryYear() > LocalDate.now().getYear()+10){
                errors.rejectValue("expiryYear", "expiryYear.invalid");
            }
        }

        if (errors.hasFieldErrors("cvv") == false){
            if (form.getCvv() < 100 || form.getCvv() > 999){
                errors.rejectValue("cvv", "cvv.invalid");
            }
        }

    }
}
