package com.tts.service.autoconfigure;

import com.tts.config.autoconfigure.AudioConfigAutoConfiguration;
import com.tts.config.autoconfigure.VoiceSelectionConfigAutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tts.com.config.AudioConfig;
import tts.com.config.VoiceSelectionConfig;
import tts.com.service.TextToSpeechService;

@Configuration
@ConditionalOnBean({AudioConfig.class, VoiceSelectionConfig.class})
@AutoConfigureAfter({AudioConfigAutoConfiguration.class, VoiceSelectionConfigAutoConfiguration.class})
public class TextToSpeechServiceAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public TextToSpeechService textToSpeechService(final AudioConfig audioConfig, final VoiceSelectionConfig voiceSelectionConfig){
        return new TextToSpeechService(audioConfig, voiceSelectionConfig);
    }
}
