package com.ff.controller;

import com.ff.form.CustomerForm;
import com.ff.validator.CustomerFormValidator;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@AllArgsConstructor
public class CustomerController {
    private final CustomerFormValidator customerFormValidator;

    @GetMapping("/add-customer.htm")
    public String showAddCustomerPage(Model model) {
        CustomerForm customerForm = new CustomerForm();
        model.addAttribute("customerForm", customerForm);
        return "add-customer";
    }

    @PostMapping("/add-customer.htm")
    public String addCustomer(@ModelAttribute("customerForm") CustomerForm customerForm, BindingResult errors, Model model) {

        if(customerFormValidator.supports(customerForm.getClass())) {
            customerFormValidator.validate(customerForm, errors);
        }
        if(errors.hasErrors()) {
            return "add-customer";
        }
        System.out.println(customerForm);

        model.addAttribute("customerName", customerForm.getFullname());
        return "add-customer-success";
    }

}
