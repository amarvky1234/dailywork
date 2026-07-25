package com.eh.resource;

import com.eh.dto.PayRequest;
import com.eh.dto.Receipt;
import com.eh.exception.CVVMismatchException;
import com.eh.exception.Error;
import com.eh.ext.service.VisaPaymentService;
import jakarta.ws.rs.*;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/billPay")
public class BilldeskPaymentApiService {

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response billPay(PayRequest payRequest){
        String txNo = null;
        VisaPaymentService visaPaymentService = new VisaPaymentService();
        try {
            txNo = visaPaymentService.processPayment(payRequest);
        }catch (CVVMismatchException e){
            WebApplicationException wae = new WebApplicationException(Response.status(Response.Status.BAD_REQUEST)
                    .entity(Entity.json(Error.of()
                            .errorCode("BD9223")
                            .errorMessage("cvv mismatch").build()))
                    .build());
            throw wae;
        }


        return Response.ok(Receipt.of().txId(txNo)
                .billNo(payRequest.getBillNo())
                .merchantId(payRequest.getMerchantId())
                .amount(payRequest.getAmount())
                .status("accepted").build()).build();
    }
}
