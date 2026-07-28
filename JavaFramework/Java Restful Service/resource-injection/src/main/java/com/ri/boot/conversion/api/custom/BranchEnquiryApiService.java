package com.ri.boot.conversion.api.custom;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ri.boot.conversion.dto.BranchAddress;
import com.ri.boot.conversion.dto.IFSCCode;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/branch")
public class BranchEnquiryApiService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{ifscCode}/address")
    public String getBranchAddress(@PathParam("ifscCode") IFSCCode ifscCode) throws JsonProcessingException {
        final BranchAddress branchAddress = BranchAddress.of().addressLine1("Near Main Market")
                                            .city("Hyderabad")
                                            .state("TS").zip(30015)
                                            .country("India")
                                            .openHours(ifscCode.getBankCode())
                                            .closingHours(ifscCode.getBranchCode()).build();

        final ObjectMapper objectMapper = new ObjectMapper();
        final String resp = objectMapper.writeValueAsString(branchAddress);
        return resp;
    }
}
