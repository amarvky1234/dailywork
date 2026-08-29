package com.busyatra.controller;

import com.busyatra.dto.PassengerDto;
import com.busyatra.form.PassengerCriteriaForm;
import com.google.common.collect.ImmutableList;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.stream.IntStream;

@Controller
public class PassengerController {

    @PostMapping("/searchPassengers.htm")
    public String searchPassengers(final @ModelAttribute("passengerCriteriaForm") PassengerCriteriaForm passengerCriteriaForm,
                                   final ModelMap modelMap){
        System.out.println(passengerCriteriaForm);

        final ImmutableList<PassengerDto> passengerDtos = IntStream.range(0, 15).mapToObj(n -> {
            return PassengerDto.of()
                    .passengerName("Passenger" + n)
                    .age(n)
                    .gender(n%2 == 0 ? "male" : "female")
                    .mobileNo("7654321456" + n)
                    .email("passenger" + n + "@gmail.com").build();
        }).collect(ImmutableList.toImmutableList());

        modelMap.addAttribute("passengers", passengerDtos);
        return "list-passengers";
    }

    @GetMapping("/allPassengers.htm")
    public String getAllPassengers(final @ModelAttribute("passengerCriteriaForm") PassengerCriteriaForm passengerCriteriaForm,
                                   final ModelMap modelMap){
        final ImmutableList<PassengerDto> passengerDtos = IntStream.range(16, 30).mapToObj(n -> {
            return PassengerDto.of()
                    .passengerName("Passenger" + n)
                    .age(n)
                    .gender(n%2 == 0 ? "male" : "female")
                    .mobileNo("7654321456" + n)
                    .email("passenger" + n + "@gmail.com").build();
        }).collect(ImmutableList.toImmutableList());

        modelMap.addAttribute("passengers", passengerDtos);
        return "listPassengers";
    }
}
