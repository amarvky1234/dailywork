package com.ri.boot.beanparam.api;

import com.ri.boot.beanparam.dto.LoanApplication;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.awt.*;

@Path("/loan")
public class LoanApiService {

    @POST
    @Path("/{loanType}/apply")
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    public String applyLoan(@BeanParam LoanApplication loanApplication){
        return loanApplication.toString();
    }
}
