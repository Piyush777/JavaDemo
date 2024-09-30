package org.ust.CreationDesignPattern.Singleton;

import java.util.Objects;

public class LazySingleton {

    //Private constructor to prevent instantiation from other classes
    private LazySingleton(){

    }

    private static LazySingleton instance;

    public static LazySingleton getInstance(){
        if(Objects.isNull(instance)){
            System.out.println("Creating instance of the Lazy Singleton class");
            instance = new LazySingleton();
        }
        return instance;
    }
}
