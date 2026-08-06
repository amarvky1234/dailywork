package com.don.helper;

import com.don.accessor.IAccessor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CacheManager {
    private Cache cache;
    private List<IAccessor> accessors;

    public CacheManager(Cache cache, List<IAccessor> accessors) {
        this.cache = cache;
        this.accessors = accessors;
        System.out.println("cacheManager()");

        init();
    }

    public void init(){
        Map<String, Object> objectMap = new HashMap<>();

        accessors.parallelStream().forEach(accessor ->{
            objectMap.put(accessor.getKey(), accessor.getData());
        });
        cache.putAll(objectMap);
    }
}
