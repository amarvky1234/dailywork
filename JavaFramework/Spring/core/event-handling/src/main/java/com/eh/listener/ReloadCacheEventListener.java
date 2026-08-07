package com.eh.listener;

import com.eh.event.ReloadCacheEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class ReloadCacheEventListener implements ApplicationListener<ReloadCacheEvent> {

    @Override
    public void onApplicationEvent(ReloadCacheEvent event) {
        System.out.println("reloading the data of key : " + event.getCacheKey());
    }
}
