package com.busbay.validator;

import com.busbay.form.BusForm;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
public class BusFormValidator implements Validator {
    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(BusForm.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        BusForm busForm = (BusForm) target;

        if (!StringUtils.hasText(busForm.getBusNo())) {
            errors.rejectValue("busNo", "busNo.empty");
        } else if (busForm.getBusNo().length() != 10) {
            errors.rejectValue("busNo", "busNo.notValid");
        }

        if (!StringUtils.hasText(busForm.getModelNo())) {
            errors.rejectValue("modelNo", "modelNo.empty");
        } else if (busForm.getModelNo().length() != 12) {
            errors.rejectValue("modelNo", "modelNo.notValid");
        }

        if (!StringUtils.hasText(busForm.getManufacturer())) {
            errors.rejectValue("manufacturer", "manufacturer.empty");
        }

        if (!StringUtils.hasText(busForm.getEngineNo())) {
            errors.rejectValue("engineNo", "engineNo.empty");
        }

        if (!StringUtils.hasText(busForm.getChassisNo())) {
            errors.rejectValue("chassisNo", "chassisNo.empty");
        }

        if (!errors.hasFieldErrors("price")) {
            if (busForm.getPrice() < 800000) {
                errors.rejectValue("price", "price.notValid");
            }
        }
    }
}
