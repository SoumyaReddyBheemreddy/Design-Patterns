package com.design.creational.singleton.eager_initialization;

import java.util.HashMap;
import java.util.Map;
/*
* In eager initialization, the instance of the singleton class is created at the time of class loading.
* This approach offers the easiest execution and helps improve the runtime performance of the application.
 * */

/*
* disadvantage :
* the instance is always created even though the application is not utilizing it.
 * */
public class ConfigManager {
    private static final ConfigManager instance = new ConfigManager();


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
    public  static  ConfigManager getInstance(){
        return instance;
    }
}
