package com.ri.boot.conversion.provider;

import com.ri.boot.conversion.converter.IFSCCodeParamConverter;
import com.ri.boot.conversion.dto.IFSCCode;
import jakarta.ws.rs.ext.ParamConverter;
import jakarta.ws.rs.ext.ParamConverterProvider;
import jakarta.ws.rs.ext.Provider;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

@Provider
public class AppParamConverterProvider implements ParamConverterProvider {
    @Override
    public <T> ParamConverter<T> getConverter(Class<T> aClass, Type genericType, Annotation[] annotations) {
        ParamConverter paramConverter = null;

        if (aClass.isAssignableFrom(IFSCCode.class)){
            paramConverter = new IFSCCodeParamConverter();
        }
        return paramConverter;
    }
}
