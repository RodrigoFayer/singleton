package com.example;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    private static Cache instance = new Cache();
    private Map<String, Object> config;

    private Cache() {
        config = new HashMap<>();
    }

    public static synchronized Cache getInstance() {
        return instance;
    }

    public void setConfiguration(String key, Object value) {
        config.put(key, value);
    }

    public Object getConfiguration(String key) {
        return config.get(key);
    }
}
