package com.ecommerce.resources;

import com.ecommerce.dto.Seller;
import com.ecommerce.dto.UpdateSeller;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.ws.rs.*;

import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Path("/seller")
public class SellerResource {
    //assumption:database
    private static Map<Long, Seller> sellerMapDb = new ConcurrentHashMap<>();

    @POST
    @Consumes("application/json")
    @Produces("text/plain")
    public long newSeller(InputStream in) throws IOException {
        long id = 0;
        Seller seller = null;
        ObjectMapper objectMapper = null;

        //read data send as-part of the req body (InputStream in) and
        //convert seller into object
        objectMapper = new ObjectMapper();
        seller = objectMapper.readValue(in, Seller.class);

        //generate an id for the seller and store in database
        id = new SecureRandom().nextLong(Long.MAX_VALUE);
        seller.setId(id);

        sellerMapDb.put(id, seller);
        return id;
    }

    @GET
    @Produces("application/json")
    public String getSeller(@QueryParam("id") long id) throws JsonProcessingException {
        Seller seller = null;
        ObjectMapper objectMapper = null;
        String json = null;

        if(!sellerMapDb.containsKey(id)){
            throw new NotFoundException("seller not found");
        }

        seller = sellerMapDb.get(id);
        objectMapper = new ObjectMapper();
        json = objectMapper.writeValueAsString(seller);

        return json;
    }

    @PUT
    @Consumes("application/json")
    @Produces("application/json")
    public String UpdateSeller(InputStream in) throws IOException {
        Seller seller = null;
        ObjectMapper objectMapper = null;
        UpdateSeller updateSeller = null;
        String json = null;

        objectMapper = new ObjectMapper();
        seller = objectMapper.readValue(in, Seller.class);

        if(sellerMapDb.containsKey(seller.getId()) == false){
            throw new NotFoundException("seller not found to update");
        }

        sellerMapDb.put(seller.getId(), seller);

        updateSeller = new UpdateSeller();
        updateSeller.setId(seller.getId());
        updateSeller.setTxReferenceNo(UUID.randomUUID().toString());
        updateSeller.setStatus("SUCCESS");

        json = objectMapper.writeValueAsString(updateSeller);

        return json;
    }

    @DELETE
    @Produces("text/plain")
    public String deleteSeller(@QueryParam("id") long id){

        if (sellerMapDb.containsKey(id)){
            throw new NotFoundException("seller id not found to delete");
        }

        sellerMapDb.remove(id);
        return "seller with id : " + id + " is removed";
    }
}
