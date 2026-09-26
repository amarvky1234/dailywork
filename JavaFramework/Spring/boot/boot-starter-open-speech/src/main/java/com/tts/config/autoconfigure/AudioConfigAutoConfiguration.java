package com.tts.config.autoconfigure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tts.com.config.AudioConfig;

@Configuration
@ConditionalOnProperty(name = "tts.open-speech.enabled", havingValue = "true")
public class AudioConfigAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public AudioConfig audioConfig(@Value("${tts.audio.encoding}") String audioEncoding,
                                   @Value("${tts.audio.quality}") String quality){
        AudioConfig audioConfig = new AudioConfig();
        audioConfig.setAutoEncoding(audioEncoding);
        audioConfig.setQuality(quality);

        return audioConfig;
    }
}
