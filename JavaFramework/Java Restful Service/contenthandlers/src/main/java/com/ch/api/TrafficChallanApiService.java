package com.ch.api;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.MultivaluedMap;
import jakarta.ws.rs.core.StreamingOutput;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.util.stream.Collectors;

@Path("/traffic")
public class TrafficChallanApiService {

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/in")
    public String newChallan(InputStream in) throws IOException {
        int c = 0;
        StringBuilder builder = new StringBuilder();

        while((c = in.read()) != -1){
            builder.append((char) c);
        }
        return builder.toString();
    }

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/reader")
    public String newChallan(Reader reader) throws IOException {
        char buff[] = new char[255];
        StringBuilder builder = new StringBuilder();

        while(reader.read(buff) != -1){
            builder.append(buff);
        }
        return builder.toString();
    }

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/string")
    public String newChallan(String body) throws IOException {
        return body;
    }

    @POST
    @Consumes(MediaType.TEXT_PLAIN)
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/bytearray")
    public byte[] newChallan(byte[] body) throws IOException {
        return body;
    }

    @POST
    @Consumes(MediaType.APPLICATION_OCTET_STREAM)
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
    @Path("/upload")
    public File newChallan(File file) throws IOException {
        return file;
    }

    @POST
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/form-data")
    public String newChallan(MultivaluedMap<String, String> formData) throws IOException {
        return extractMultivaluedMap(formData);
    }

    final private String extractMultivaluedMap(final MultivaluedMap<String, String > matrixParam){
        final StringBuilder builder = new StringBuilder();
        matrixParam.forEach((k, v) -> {
            builder.append(k).append("=[").append(v.stream().collect(Collectors.joining(",")))
                    .append("];");
        });
        return builder.toString();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/streaming")
    public StreamingOutput newChallanStreaming(final InputStream in){
        return (os) ->{
            int b = 0;
            while ((b = in.read()) != -1){
                os.write(b);
            }
            os.close();
        };
    }
}
