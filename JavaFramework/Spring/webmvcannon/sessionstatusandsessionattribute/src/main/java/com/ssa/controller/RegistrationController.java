package com.ssa.controller;

import com.ssa.form.RegistrationForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes("registrationForm")
public class RegistrationController {

    @GetMapping("/register.htm")
    public String showRegisterForm(Model model) {
        RegistrationForm form = new RegistrationForm();
        model.addAttribute("registrationForm", form);
        return "register";
    }

    @PostMapping("/register-address.htm")
    public String processRegisterAndShowAddress(@ModelAttribute("registrationForm") RegistrationForm form, BindingResult errors){
        if (errors.hasErrors()) {
            return "register";
        }

        return "register-address";
    }

    @PostMapping("/doRegister.htm")
    public String doRegister(@ModelAttribute("registrationForm") RegistrationForm form,
                             BindingResult errors,
                             SessionStatus sessionStatus) {
        if (errors.hasErrors()) {
            return "register-address";
        }

        // service / dao

        sessionStatus.setComplete();

        return "registration-success";
    }
}

