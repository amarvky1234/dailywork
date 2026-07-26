package com.javajson.binding.marshaller;

import com.javajson.binding.bean.Account;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.json.bind.JsonbConfig;

import java.io.StringWriter;

public class AccountMarshaller {
    public static void main(String[] args) {
        Account account = Account.of().accountNo("ac56473").accountHolderName("James").accountType("saving")
                .ifscCode("ICICN06584").nominees(new String[]{"Jane", "Jack"})
                .balance(5467.5).build();

        JsonbConfig jsonbConfig = new JsonbConfig();
        jsonbConfig.withFormatting(true);

        Jsonb jsonb = JsonbBuilder.create(jsonbConfig);
        StringWriter stringWriter = new StringWriter();
        jsonb.toJson(account, stringWriter);
        System.out.println(stringWriter.toString());
    }
}
