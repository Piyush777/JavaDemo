package org.ust.CreationDesignPattern.Registry.LoggerExample;

import java.util.HashMap;
import java.util.Map;

public class LoggerRegistry {
    private Map<String, Logger> loggerMap = new HashMap<>();

    //singleton pattern
    private static LoggerRegistry instance = new LoggerRegistry();

    public static LoggerRegistry getInstance(){
        return instance;
    }

    public void registerLogger(String name, Logger logger){
        loggerMap.put(name,logger);
        System.out.println("Registered logger: "+ name +" successfully");
    }

    public Logger getLogger(String name){
        return loggerMap.get(name);
    }
}
