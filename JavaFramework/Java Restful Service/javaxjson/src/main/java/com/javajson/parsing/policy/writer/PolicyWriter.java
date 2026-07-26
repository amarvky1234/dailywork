package com.javajson.parsing.policy.writer;

import jakarta.json.Json;
import jakarta.json.JsonObject;
import jakarta.json.JsonObjectBuilder;
import jakarta.json.JsonWriter;

import java.io.StringWriter;

public class PolicyWriter {
    public static void main(String[] args) {
        StringWriter out = new StringWriter();
        JsonWriter jsonWriter = Json.createWriter(out);

        JsonObjectBuilder policyBuilder = Json.createObjectBuilder();
        policyBuilder.add("policyNo", "U48495");
        policyBuilder.add("policyHolder", "Jason");
        policyBuilder.add("tenure", 48);
        policyBuilder.add("premium", 4500);
        policyBuilder.add("maturityAmount", 150000);

        JsonObject policyObject = policyBuilder.build();

        jsonWriter.writeObject(policyObject);

        System.out.println(out.toString());
    }
}
