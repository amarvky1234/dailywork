package com.don.helper;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {
    private static Cache instance;
    private Map<String, Object> dataMap;

    private Cache(){
        dataMap = new ConcurrentHashMap<>();
    }

    public static Cache getInstance(){
        synchronized (Cache.class){
            if(instance == null){
                instance = new Cache();
            }
        }
        return instance;
    }

    public void put(String key, Object val){
        this.dataMap.put(key, val);
    }
    public Object get(String key){
        return this.dataMap.get(key);
    }
    public boolean containKey(String key){
        return this.dataMap.containsKey(key);
    }

    public void putAll(Map<String, Object> objectMap){
        this.dataMap.putAll(objectMap);
    }
}
