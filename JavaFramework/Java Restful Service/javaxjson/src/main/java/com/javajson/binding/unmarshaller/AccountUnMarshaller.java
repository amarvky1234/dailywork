package com.javajson.binding.unmarshaller;

import com.javajson.binding.bean.Account;
import jakarta.json.bind.Jsonb;
import jakarta.json.bind.JsonbBuilder;
import jakarta.json.bind.JsonbConfig;

public class AccountUnMarshaller {
    public static void main(String[] args) {
        JsonbConfig jsonbConfig = new JsonbConfig();
        jsonbConfig.withFormatting(true);

        Jsonb jsonb = JsonbBuilder.create(jsonbConfig);
        Account account = jsonb.fromJson(
                AccountUnMarshaller.class.getClassLoader().getResourceAsStream("account.json"), Account.class);

        System.out.println(account);
    }
}
