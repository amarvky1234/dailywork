package com.busgene.controller;

import com.busgene.dto.BusDto;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.IntStream;

@Controller
public class BusController {

    //@RequestMapping("/search-buses.htm")
    public ModelAndView searchBuses(final HttpServletRequest request, final HttpServletResponse response){
        final ModelAndView modelAndView = new ModelAndView();
        final String source = request.getParameter("source");
        final String destination = request.getParameter("destination");
        final LocalDate journeyDate = LocalDate.parse(request.getParameter("journeyDate"),
                                            DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        final List<BusDto> buses = buildBusList(source, destination, journeyDate);
        modelAndView.addObject("source", source);
        modelAndView.addObject("destination", destination);
        modelAndView.addObject("journeyDate", journeyDate);
        modelAndView.addObject("buses", buses);
        modelAndView.setViewName("bus-availability");

        return modelAndView;
    }

    //@RequestMapping("/search-buses.htm")
    public ModelAndView searchBusesNative(final NativeWebRequest request){
        final ModelAndView modelAndView = new ModelAndView();
        final String source = request.getParameter("source");
        final String destination = request.getParameter("destination");
        final LocalDate journeyDate = LocalDate.parse(request.getParameter("journeyDate"),
                DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        final List<BusDto> buses = buildBusList(source, destination, journeyDate);
        modelAndView.addObject("source", source);
        modelAndView.addObject("destination", destination);
        modelAndView.addObject("journeyDate", journeyDate);
        modelAndView.addObject("buses", buses);
        modelAndView.setViewName("bus-availability");

        return modelAndView;
    }

    @RequestMapping("/search-buses.htm")
    public String searchBusParams(final @RequestParam("source") String source,
                                  final @RequestParam("destination") String destination,
                                  final @RequestParam("journeyDate") LocalDate journeyDate,
                                  final @RequestHeader("User-Agent") String userAgent,
                                  final ModelMap modelMap,
                                  final HttpMethod httpMethod){


        final List<BusDto> buses = buildBusList(source, destination, journeyDate);
        System.out.println(httpMethod.name());
        System.out.println("Browser : "+userAgent);
        modelMap.addAttribute("source", source);
        modelMap.addAttribute("destination", destination);
        modelMap.addAttribute("journeyDate", journeyDate);
        modelMap.addAttribute("buses", buses);

        return "bus-availability";
    }

    private List<BusDto> buildBusList(final String source, final String destination, final LocalDate journeyDate){
        return IntStream.range(0, 15).mapToObj(busNo -> {
            return BusDto.of().busNo("TG 09 TH 478"+busNo).busType("Express")
                    .arrivalTime(LocalDateTime.now().plusHours(busNo))
                    .departureTime(LocalDateTime.now().plusHours(busNo+2))
                    .totalHours(busNo)
                    .status("onTime").build();
        }).toList();
    }
}
