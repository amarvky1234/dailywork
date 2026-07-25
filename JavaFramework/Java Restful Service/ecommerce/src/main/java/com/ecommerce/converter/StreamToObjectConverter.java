package com.ecommerce.converter;

import com.ecommerce.dto.Seller;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;

public class StreamToObjectConverter {
    public <T> T convertToObject(InputStream in, Class<T> clazz) throws IOException, InstantiationException, IllegalAccessException {
        ObjectMapper objectMapper = null;

        //read data send as-part of the req body (InputStream in) and
        //convert seller into object
        objectMapper = new ObjectMapper();
        clazz = objectMapper.readValue(in, clazz.getClass());
        return clazz.newInstance();
    }
}

// generalized conversion logic (not related with project it discussed b/w me and my brother)
