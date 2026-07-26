package com.javajson.streaming.policy.writer;

import jakarta.json.Json;
import jakarta.json.stream.JsonGenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class PolicyStreamingWriter {
    public static void main(String[] args) throws FileNotFoundException {
        JsonGenerator jsonGenerator = Json.createGenerator(new FileOutputStream(new File("D:\\newPolicy.json")));

        jsonGenerator.writeStartObject();
        jsonGenerator.write("policyNo", "P94884" );
        jsonGenerator.write("policyHolder", "Jack");
        jsonGenerator.writeStartArray("benefits");
        jsonGenerator.write("easy premium payment option");
        jsonGenerator.write("higher return");
        jsonGenerator.writeEnd();
        jsonGenerator.writeEnd();
        jsonGenerator.close();
    }
}
