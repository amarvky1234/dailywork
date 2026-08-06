package com.don.accessor;

import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class CibilScoreInterestRatePropertiesAccessor implements IAccessor{
    @Value("${cibilscoreri.key}")
    private String key;

    @Override
    public String getKey() {
        return key;
    }

    @SneakyThrows
    @Override
    public Properties getData() {
        Properties properties = null;

        properties = new Properties();
        properties.load(this.getClass().getClassLoader().getResourceAsStream("cibilscore-ri.properties"));

        return properties;
    }
}
