package com.cch.resource;

import com.cch.dto.AccountDetails;
import com.cch.dto.ApplicationForm;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.util.UUID;

@Path("/account")
public class AccountApiResource {

    @POST
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, "application/yml"})
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML, "application/yml"})
    public AccountDetails openAccount(ApplicationForm applicationForm){
        AccountDetails accountDetails = null;

        System.out.println("opening account with details : "+applicationForm);
        //business logic
        accountDetails = AccountDetails.of().accountNo(UUID.randomUUID().toString().substring(1, 12))
                .accountHolderName(applicationForm.getApplicantName())
                .contactNo(applicationForm.getMobileNo())
                .emailAddress(applicationForm.getEmailAddress())
                .ifscCode("SBIN79909")
                .status("pending kyc").build();

        return accountDetails;
    }
}
