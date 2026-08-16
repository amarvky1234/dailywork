package com.aa.helper;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {
    private static Cache instance;
    private Map<String, Object> dataMap;

    private Cache(){
        this.dataMap = new ConcurrentHashMap<>();
    }

    public static synchronized Cache getInstance(){
        if(instance == null){
            instance = new Cache();
        }
        return instance;
    }

    public void put(String key, Object val){
        this.dataMap.put(key, val);
    }

    public Object get(String key){
        return this.dataMap.get(key);
    }

    public boolean containsKey(String key){
        return dataMap.containsKey(key);
    }
}
