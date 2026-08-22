package com.vw.controller;

import com.google.common.collect.ImmutableList;
import com.vw.dto.PassengersDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

@Controller("/getBusPassengers.htm")
public class GetBusPassengersController extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        final String action = request.getParameter("h_action");
        String viewName = "bus-passengers";

        ImmutableList<PassengersDto> passengersDtos = ImmutableList.of(
                PassengersDto.of().passengerName("Ajay").age(23).gender("Male").mobileNo("8824567432").busStopName("Ameerpet").build(),
                PassengersDto.of().passengerName("Anita").age(26).gender("Female").mobileNo("9931478452").busStopName("Rajendra nagar").build(),
                PassengersDto.of().passengerName("Avinash").age(28).gender("Male").mobileNo("8824876567").busStopName("danapur").build(),
                PassengersDto.of().passengerName("Avantika").age(24).gender("Female").mobileNo("8424567672").busStopName("Kumbharar").build()
        );
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("passengers", passengersDtos);
        modelAndView.addObject("busNo", request.getParameter("busNo"));
        modelAndView.addObject("journeyDate", request.getParameter("journeyDate"));
        if(action != null){
            if(action.equals("pdf")){
                viewName = "bus-passengers-pdf";
            } else if(action.equals("xls")) {
                viewName = "bus-passengers-xls";
            }
        }
        modelAndView.setViewName(viewName);

        return modelAndView;
    }
}
