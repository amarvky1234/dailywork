package com.eh.beans;

import com.eh.event.ReloadCacheEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class UpdateCityService implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;

    public void updateCity(int cityId, String cityName){
        System.out.println("updating the cityName : " + cityName + " for cityId : " + cityId + " in the database...");

        ReloadCacheEvent event = new ReloadCacheEvent(this,"cities");
        applicationEventPublisher.publishEvent(event);
    }

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }
}
