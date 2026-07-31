package com.wwa.api;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JSR310Module;
import com.wwa.dto.Parcel;
import com.wwa.dto.Receipt;
import jakarta.ws.rs.Path;

import java.io.IOException;
import java.io.InputStream;

@Path("/json/parcel")
public class ParcelJsonApiService extends AbstractParcelApiService{
    @Override
    protected Parcel buildParcel(InputStream in) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JSR310Module());
        objectMapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false);
        objectMapper.configure(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS, false);

        Parcel parcel = objectMapper.readValue(in, Parcel.class);
        return parcel;
    }

    @Override
    protected String toReceipt(Receipt receipt) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JSR310Module());
        objectMapper.configure(SerializationFeature.WRITE_DATE_KEYS_AS_TIMESTAMPS, false);
        objectMapper.configure(DeserializationFeature.READ_DATE_TIMESTAMPS_AS_NANOSECONDS, false);

        String resp = objectMapper.writeValueAsString(receipt);
        return resp;
    }
}
