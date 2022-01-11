package com.design.creational.singleton.lazy_initialization;

import java.util.HashMap;
import java.util.Map;
/*
* Lazy Initialization restricts the instance creation until it is requested for the first time.
* */
/*
disadvantage
* It is not thread safe
*  if two threads try to create an instance of a singleton class at the same time.
 In a multi-threaded environment, there is a possibility that separate objects get created,
  due to different times of accessing the (instance == null) check.
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
    public  static ConfigManager getInstance(){
        if(instance==null)
            instance = new ConfigManager();
        return instance;
    }
}
