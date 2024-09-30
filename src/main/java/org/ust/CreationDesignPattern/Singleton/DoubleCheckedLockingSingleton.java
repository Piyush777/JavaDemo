package org.ust.CreationDesignPattern.Singleton;

import java.util.Objects;

public class DoubleCheckedLockingSingleton {

    //volatile ensure that multiple threads handle instance variable correctly
    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton(){}

    public static DoubleCheckedLockingSingleton getInstance(){
        if(Objects.isNull(instance)){ //first check no locking

            synchronized (DoubleCheckedLockingSingleton.class){

                if(Objects.isNull(instance)){ // second check with locking
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }


}
