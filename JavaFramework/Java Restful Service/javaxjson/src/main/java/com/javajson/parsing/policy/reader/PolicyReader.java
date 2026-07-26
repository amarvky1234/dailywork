package com.javajson.parsing.policy.reader;

import jakarta.json.Json;
import jakarta.json.JsonArray;
import jakarta.json.JsonObject;
import jakarta.json.JsonReader;

public class PolicyReader {
    public static void main(String[] args) {
        JsonReader jsonReader = Json.createReader(
                PolicyReader.class.getClassLoader().getResourceAsStream("policy.json"));
        JsonObject policyObject = jsonReader.readObject();

        System.out.println("policyNo : " + policyObject.getString("policyNo"));
        System.out.println("age : " + policyObject.getInt("age"));

        System.out.println("Benefits :");
        JsonArray benefits = policyObject.getJsonArray("benefits");
        benefits.stream().forEach(System.out::println);

        System.out.println("address");
        JsonObject address = policyObject.getJsonObject("address");
        System.out.println(address.getString("addressLine1"));
        System.out.println();
        System.out.println("address : ");
        Object addressObject = policyObject.getJsonObject("address");
        System.out.println(addressObject);
    }
}
