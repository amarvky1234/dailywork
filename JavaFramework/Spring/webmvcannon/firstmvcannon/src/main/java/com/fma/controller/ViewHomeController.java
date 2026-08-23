package com.fma.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewHomeController {

    @RequestMapping("/home.htm")
    public String showHome(){
        return "home";
    }

    @RequestMapping("/business.htm")
    public String businessHome(){
        return "businessHome";
    }

    @RequestMapping("/healthcare.htm")
    public String healthcareHome(){
        return "healthcareHome";
    }

    @RequestMapping("/portfolio.htm")
    public String portfolioHome(){
        return "portfolioHome";
    }

    @RequestMapping("/restaurant.htm")
    public String restaurantHome(){
        return "restaurantHome";
    }

}
