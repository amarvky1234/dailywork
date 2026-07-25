package com.eh.exception.mapper;

import com.eh.exception.CVVMismatchException;
import com.eh.exception.Error;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.ext.ExceptionMapper;
import jakarta.ws.rs.ext.Provider;

@Provider
public class CVVMismatchExceptionMapper implements ExceptionMapper<CVVMismatchException> {
    @Override
    public Response toResponse(CVVMismatchException exception) {
        return Response.status(Response.Status.BAD_REQUEST)
                .entity(Entity.json(Error.of()
                        .errorCode("BD9223").errorMessage("cvv mismatch").build())).build();
    }
}
