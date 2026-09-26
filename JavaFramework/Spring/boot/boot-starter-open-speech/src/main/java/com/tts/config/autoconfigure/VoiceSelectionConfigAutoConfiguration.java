package com.tts.config.autoconfigure;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tts.com.config.VoiceSelectionConfig;

@Configuration
@ConditionalOnProperty(name = "tts.open-speech.enabled", havingValue = "true")
public class VoiceSelectionConfigAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public VoiceSelectionConfig voiceSelectionConfig(@Value("${tts.voice.selection.language}") String language,
                                                     @Value("${tts.voice.selection.gender}") String gender){
        VoiceSelectionConfig voiceSelectionConfig = new VoiceSelectionConfig();
        voiceSelectionConfig.setGender(gender);
        voiceSelectionConfig.setLanguage(language);

        return voiceSelectionConfig;
    }
}
