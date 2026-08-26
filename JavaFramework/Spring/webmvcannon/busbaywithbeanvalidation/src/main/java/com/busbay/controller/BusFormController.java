package com.busbay.controller;

import com.busbay.form.BusForm;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BusFormController {

    @GetMapping("/add-bus.htm")
    public String setupForm(final Model model){
        final BusForm busForm = new BusForm();
        model.addAttribute("busForm", busForm);
        return "add-bus";
    }

    @PostMapping("/add-bus.htm")
    public String addBus(final @ModelAttribute("busForm") @Valid BusForm busForm, final BindingResult errors, final Model model){

            if (errors.hasErrors()){
                return "add-bus";
            }

        System.out.println("adding bus into the system...");
        model.addAttribute("busNo", busForm.getBusNo());
        model.addAttribute("manufacturer", busForm.getManufacturer());
        model.addAttribute("fuelType", busForm.getFuelType());

        return "add-bus-success";
    }
}
