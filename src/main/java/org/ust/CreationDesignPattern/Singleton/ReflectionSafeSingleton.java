package org.ust.CreationDesignPattern.Singleton;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class SingletonReflectionS {
    // Single instance of the Singleton class
    private static SingletonReflectionS instance = null;

    // Private constructor
    private SingletonReflectionS() {
        // Check if instance is already created
        if (instance != null) {
            throw new RuntimeException("Reflection is not allowed! Singleton instance already exists.");
        }
    }

    // Method to provide global access to the Singleton instance
    public static SingletonReflectionS getInstance() {
        if (instance == null) {
            synchronized (SingletonReflectionS.class) {
                if (instance == null) {
                    instance = new SingletonReflectionS();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton instance method called!");
    }
}


public class ReflectionSafeSingleton {
    public static void main(String[] args) {
        // Normal way to get the Singleton instance
        SingletonReflectionS instance1 = SingletonReflectionS.getInstance();
        //instance1.showMessage();

        try {
            // Use reflection to try and create another instance of SingletonReflectionS
            Class<SingletonReflectionS> singletonClass = SingletonReflectionS.class;

            // Get the private constructor of the Singleton class
            Constructor<SingletonReflectionS> constructor = singletonClass.getDeclaredConstructor();

            // Bypass the private access of the constructor
            constructor.setAccessible(true);

            // Attempt to create a new instance of Singleton
            SingletonReflectionS instance2 = constructor.newInstance();
            System.out.println("Reflection succeeded, new instance created!");

        } catch (RuntimeException e ) {
            // Catch and print any exceptions that occur (in this case, RuntimeException from the Singleton)
            System.out.println("Reflection failed: " + e.getMessage());
        }catch (NoSuchMethodException e){
            System.out.println("No Such Method Exception : " + e.getMessage());
        }catch (InstantiationException instantiationException){
            System.out.println("Instantiation Exception: "+ instantiationException.getMessage());
        }catch (IllegalAccessException illegalAccessException){
            System.out.println("Illegal Access Exception "+ illegalAccessException.getMessage());
        }catch (InvocationTargetException invocationTargetException){
            System.out.println("Invocation Target Exception "+ invocationTargetException.getCause().getMessage());
        }

        // Check if both instances are the same
        SingletonReflectionS instance3 = SingletonReflectionS.getInstance();
        System.out.println("Are instance1 and instance3 the same? " + (instance1 == instance3));
    }
}