package org.ust.CreationDesignPattern.Singleton;

public class SingletonDriver {


    public static void main(String[] args) {

        //Eager Singleton

        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        //following not permitted as its a singleton class
        //EagerSingleton eagerSingleton1 = new EagerSingleton();

        System.out.println(eagerSingleton.toString());

        eagerSingleton.show();

        for(int index=0;index<10;++index){
            System.out.println(EagerSingleton.getInstance().toString());
        }


        //Lazy Singleton

        LazySingleton lazySingleton = LazySingleton.getInstance();

        LazySingleton secondLazySingleton = LazySingleton.getInstance();

        System.out.println(lazySingleton);
        System.out.println(secondLazySingleton);

        if(lazySingleton == secondLazySingleton){
            System.out.println("Same Objects Only Of Lazy Singleton");
        }
    }
}
