package org.ust.CreationDesignPattern.Singleton;

public class EagerSingleton {
    //instance if created at time of class loading
    private static final EagerSingleton instance = new EagerSingleton();

    //Private constructor to prevent instantiation from other classes
    private EagerSingleton(){

    }

    public void show(){
        System.out.println("I am function of Singleton class");
    }

    //public method to provide access to instance
    public static EagerSingleton getInstance(){
        return instance;
    }

}
