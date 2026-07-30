package com.srl.api;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.srl.dto.DebitCardApplicationDto;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

public class PayTMPaymentApiService {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.TEXT_PLAIN)
    public String applyDebitCard(InputStream in) throws IOException {
        final ObjectMapper objectMapper = new ObjectMapper();
        DebitCardApplicationDto debitCardApplication = null;

        debitCardApplication = objectMapper.readValue(in, DebitCardApplicationDto.class);
        System.out.println("processing application : " + debitCardApplication.toString());

        return UUID.randomUUID().toString().substring(1, 10);
    }
}
