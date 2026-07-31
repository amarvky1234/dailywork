package com.wwa.api;

import com.wwa.dto.Parcel;
import com.wwa.dto.Receipt;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

import java.io.InputStream;
import java.security.SecureRandom;

public abstract class AbstractParcelApiService {

    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String newParcel(InputStream in) throws Throwable {
        Parcel parcel = null;
        Receipt receipt = null;

        parcel = buildParcel(in);
        //business logic & persistence logic

        receipt = new Receipt();
        receipt.setAwbNo("awb"+ new SecureRandom().nextInt(99999999));
        //receipt.setBookedDate(parcel.getBookedDate());
        //receipt.setDeliveryDate(parcel.getBookedDate().plusDays(3));
        receipt.setAmount(parcel.getAmount());

        String resp = toReceipt(receipt);
        return resp;
    }

    protected abstract Parcel buildParcel(InputStream in) throws Throwable;

    protected abstract String toReceipt(Receipt receipt) throws Throwable;
}
