package com.srl.api;

import jakarta.ws.rs.Path;

@Path("/payTM")
public class PayTMGroupApiService {

    @Path("/wallet")
    public PayTMWalletApiService walletService(){
        return new PayTMWalletApiService();
    }

    @Path("/payment")
    public PayTMPaymentApiService paymentService(){
        return new PayTMPaymentApiService();
    }
}


