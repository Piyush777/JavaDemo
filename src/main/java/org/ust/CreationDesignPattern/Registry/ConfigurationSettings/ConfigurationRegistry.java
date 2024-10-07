package org.ust.CreationDesignPattern.Registry.ConfigurationSettings;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationRegistry {

    private Map<String,String> settings = new HashMap<>();
    private static ConfigurationRegistry instance = new ConfigurationRegistry();
    private ConfigurationRegistry(){

    }

    public static ConfigurationRegistry getInstance(){
        return instance;
    }

    public void setSettings(String key, String value){
        settings.put(key,value);
    }

    public String getSetting(String key){
        return settings.get(key);
    }
}
