package com.eh.event;

import lombok.Getter;
import lombok.NonNull;
import org.springframework.context.ApplicationEvent;

public class ReloadCacheEvent extends ApplicationEvent {
    @Getter
    @NonNull
    private String cacheKey;
    public ReloadCacheEvent(Object source, String cacheKey) {
        super(source);
        this.cacheKey = cacheKey;
    }
}
