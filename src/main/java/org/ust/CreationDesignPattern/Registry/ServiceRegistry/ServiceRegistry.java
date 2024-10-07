package org.ust.CreationDesignPattern.Registry.ServiceRegistry;

import java.util.HashMap;
import java.util.Map;

public class ServiceRegistry {

    private Map<String,Service> serviceMap = new HashMap<>();

    //singleton
    private static ServiceRegistry instance = new ServiceRegistry();

    private ServiceRegistry(){

    }

    public static ServiceRegistry getInstance(){
        return instance;
    }

    public void registerService(String name, Service service){
        serviceMap.put(name, service);
        System.out.println("Service "+ name+" added successfully");
    }
    public Service getService(String name){
        return serviceMap.get(name);
    }
}
