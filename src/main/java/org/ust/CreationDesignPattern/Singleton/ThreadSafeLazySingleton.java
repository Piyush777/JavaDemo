package org.ust.CreationDesignPattern.Singleton;

import java.util.Objects;

public class ThreadSafeLazySingleton {

    private static ThreadSafeLazySingleton instance;

    private ThreadSafeLazySingleton(){}

    //synchronised method to control simultaneous access
    public static synchronized  ThreadSafeLazySingleton getInstance(){
        if(Objects.isNull(instance)){
            System.out.println("Creating instance of the Thread Safe Lazy Singleton class");
            instance = new ThreadSafeLazySingleton();
        }
        return instance;
    }
}
