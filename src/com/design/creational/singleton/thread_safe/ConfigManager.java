package com.design.creational.singleton.thread_safe;

import java.util.HashMap;
import java.util.Map;
/*
* the simplest way of achieving the thread safety
*  in the singleton design pattern is to make the getInstance() method synchronized.
* */
public class ConfigManager {
    private static ConfigManager instance;
    private Map<String, String> configMap = new HashMap<String, String>();
    {
        configMap.put("host", "hostname");
        configMap.put("port", "8080");
        configMap.put("user", "root");
        configMap.put("password", "root");

    }
    private ConfigManager(){

    }
    public void update(String key,String value){
        configMap.put(key,value);
    }
    public void get(String key){
        System.out.println(configMap.get(key));
    }
    public  static synchronized ConfigManager getInstance(){
        if(instance==null)
            instance = new ConfigManager();
        return instance;
    }
}
