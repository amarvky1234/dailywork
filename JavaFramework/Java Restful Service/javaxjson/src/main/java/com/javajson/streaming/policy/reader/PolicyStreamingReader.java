package com.javajson.streaming.policy.reader;

import jakarta.json.Json;
import jakarta.json.stream.JsonParser;

public class PolicyStreamingReader {
    public static void main(String[] args) {
        JsonParser jsonParser = Json.createParser(
                PolicyStreamingReader.class.getClassLoader().getResourceAsStream("policy.json"));

        boolean isAge = false;
        int age = 0;

        while (jsonParser.hasNext()){
            JsonParser.Event event = jsonParser.next();
            switch (event){
                case KEY_NAME -> {
                    String key = jsonParser.getString();
                    if(key.equals("age")){
                        isAge = true;
                    }else {
                        isAge = false;
                    }
                }
                case VALUE_NUMBER -> {
                    if(isAge){
                       age = jsonParser.getInt();
                    }
                }
            }
        }
        System.out.println("age : "+age);
    }
}
