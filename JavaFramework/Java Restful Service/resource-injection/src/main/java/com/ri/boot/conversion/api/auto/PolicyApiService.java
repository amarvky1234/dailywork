package com.ri.boot.conversion.api.auto;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ri.boot.conversion.dto.PolicyDue;
import com.ri.boot.conversion.dto.PolicyNumber;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.time.LocalDate;

@Path("/policy")
public class PolicyApiService {

    @GET
    @Path("/{policyNo}/due")
    @Produces(MediaType.APPLICATION_JSON)
    public String getPolicyDue(@PathParam("policyNo") PolicyNumber policyNumber) throws JsonProcessingException {
        PolicyDue policyDue = PolicyDue.of().policyNumber(policyNumber.toString())
                .dueDate(LocalDate.now().plusMonths(6))
                .policyHolderName("Adam")
                .amount(4675).build();

        ObjectMapper objectMapper = new ObjectMapper();
        String jsonResponse = objectMapper.writeValueAsString(policyDue);
        return jsonResponse;
    }
}
