package com.bookstore.validator;

import com.bookstore.form.AuthorForm;
import com.bookstore.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Component
@AllArgsConstructor
public class AuthorFormValidator implements Validator {
    private final AuthorService authorService;

    @Override
    public boolean supports(Class<?> clazz) {
        return clazz.isAssignableFrom(AuthorForm.class);
    }

    @Override
    public void validate(Object target, Errors errors) {
        AuthorForm form = (AuthorForm) target;

        if (errors.hasFieldErrors("contactNo") == false){
            long cnt = authorService.countByContactNo(form.getContactNo());
            if(cnt > 0){
                errors.rejectValue("contactNo", "user.contactNo.found");
            }
        }

        if (errors.hasFieldErrors("emailAddress") == false){
            long cnt = authorService.countByEmailAddress(form.getEmailAddress());
            if(cnt > 0){
                errors.rejectValue("emailAddress", "user.emailAddress.found");
            }
        }
    }
}
