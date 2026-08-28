package com.ff.validator;

import com.ff.form.CustomerForm;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import java.time.LocalDate;

@Component
public class CustomerFormValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(CustomerForm.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        CustomerForm customerForm = (CustomerForm) target;

        if(StringUtils.hasText(customerForm.getFullname()) == false){
            errors.rejectValue("fullname", "fullname.blank");
        }

        if(errors.hasFieldErrors("dob") == false){
            if (customerForm.getDob() == null){
                errors.rejectValue("dob","dob.blank");
            } else if(customerForm.getDob().isAfter(LocalDate.now())){
                errors.rejectValue("dob", "dob.future");
            }
        }

        if(StringUtils.hasText(customerForm.getGender()) == false){
            errors.rejectValue("gender", "gender.blank");
        }

        if (StringUtils.hasText(customerForm.getPhoneNumber().getLineNumber()) == false){
            errors.rejectValue("phoneNumber", "phoneNumber.blank");
        } else if(customerForm.getPhoneNumber().getLineNumber().length() != 10){
            errors.rejectValue("phoneNumber", "phoneNumber.invalid");
        }

        if(StringUtils.hasText(customerForm.getEmail()) == false){
            errors.rejectValue("email", "email.blank");
        }
    }
}
