package com.railyatra.resources.train;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.railyatra.dto.TrainInfo;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;

@Path("/railenquiry")
public class RailEnquiryResource {

    public RailEnquiryResource(){
        System.out.println("new RailEnquiryResource()");
    }

    @GET
    @Produces("application/json")
    public String trainInfo(@QueryParam("trainNo") long trainNo, @QueryParam("day") String day) throws JsonProcessingException {
        String response = null;
        TrainInfo trainInfo = null;
        ObjectMapper objectMapper = null;

        //retrieve info about train from database
        trainInfo = new TrainInfo();
        trainInfo.setTrainNo(trainNo);
        trainInfo.setSource("New Delhi");
        trainInfo.setDay(day);
        trainInfo.setDestination("Chennai");
        trainInfo.setDepartureTime("9:30 PM");
        trainInfo.setArrivalTime("12:30 PM");
        trainInfo.setRuntime(15);

        objectMapper = new ObjectMapper();
        response = objectMapper.writeValueAsString(trainInfo);

        return response;
    }
}
