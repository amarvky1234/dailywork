package com.rein.resources;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.QueryParam;
import jakarta.ws.rs.client.ClientBuilder;

import java.util.Map;

@Path("/policy")
public class PolicyResource {

    @GET
    @Produces("text/plain")
    public String getPolicyHolder(@QueryParam("policyNo") int policyNo) throws JsonProcessingException {
        String response = null;
        String policyHolderName = null;
        Map<String, Object> reponseMap = null;

        //remote rest endpoint
        response = ClientBuilder.newClient().target("https://randomuser.me/api")
                .request().accept("application/json").acceptEncoding("utf-8").get(String.class);

        //extracting the response data
        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode rootNode = objectMapper.readTree(response);
        ArrayNode userNodes = rootNode.withArray("results");
        JsonNode userNode = userNodes.get(0);
        policyHolderName = userNode.get("name").get("first") + " " + userNode.get("name").get("last");

        return policyHolderName;
    }
}
