package com.ri.boot.formparam.api.basic;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

@Path("/subscriber")
public class SubscriberApiService {

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public String newSubscriber(@FormParam("subscriberName") String subscriberName,
                                @FormParam("age") int age,
                                @FormParam("gender") String gender,
                                @FormParam("mobileNo") String mobileNo,
                                @FormParam("emailAddress") String emailAddress){

        return "subscriberName : "+subscriberName +" age : "+age +" gender : "+gender +" mobileNo : "+mobileNo
                +" emailAddress : "+emailAddress;

    }
}
