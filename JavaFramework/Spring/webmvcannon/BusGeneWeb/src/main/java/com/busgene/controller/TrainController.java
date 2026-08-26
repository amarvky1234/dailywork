package com.busgene.controller;

import com.busgene.dto.TrainDto;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.IntStream;

@Controller
public class TrainController {

    @RequestMapping("/search-trains.htm")
    public String searchTrain(final @RequestParam("source") String source,
                              final @RequestParam("destination") String destination,
                              final @RequestParam("journeyDate") LocalDate journeyDate,
                              final @RequestHeader("User-Agent") String userAgent,
                              final ModelMap modelMap,
                              final HttpMethod httpMethod){
        final List<TrainDto> trains = buildTrainList(source, destination, journeyDate);

        System.out.println("HTTP Method : " + httpMethod.name());
        System.out.println("Browser : " + userAgent);

        modelMap.addAttribute("source", source);
        modelMap.addAttribute("destination", destination);
        modelMap.addAttribute("journeyDate", journeyDate);
        modelMap.addAttribute("trains", trains);
        return "train-results";
    }

    private List<TrainDto> buildTrainList(String source, String destination, LocalDate journeyDate){
        return IntStream.range(0, 10).mapToObj(trainNo -> {
            return TrainDto.of()
                    .trainNumber("12791" + trainNo)
                    .trainName("Express Train" + trainNo)
                    .source(source)
                    .destination(destination)
                    .departureTime(LocalDateTime.now().plusHours(trainNo))
                    .arrivalTime(LocalDateTime.now().plusHours(trainNo + 5))
                    .durationHours(trainNo + 5)
                    .trainType("Express")
                    .status("On Time").build();
        }).toList();
    }
}
