package com.rv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.JstlView;

@Controller
public class HomeController {

    @RequestMapping("/home.htm")
    public View showHomePage(){
        JstlView view = new JstlView("/WEB-INF/jsp/homeP.html");
        return view;
    }
}
