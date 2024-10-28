package org.ust.CreationDesignPattern.Singleton;
import java.lang.reflect.Constructor;

// Singleton class
class Singleton {
    // Single instance of the Singleton class
    private static Singleton instance = null;

    // Private constructor
    private Singleton() {

    }

    // Method to provide global access to the Singleton instance
    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }


}

// Reflection breaking Singleton

public class ReflectionBreakingSingleton {
    public static void main(String[] args) throws Exception {
        Singleton instance1 = Singleton.getInstance();

        // Use reflection to access the private constructor
        Constructor<Singleton> constructor = Singleton.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Singleton instance2 = constructor.newInstance();

        System.out.println(instance1 == instance2);  // This will print 'false'
        Singleton instance3 = constructor.newInstance();
        System.out.println(instance2 == instance3);  // This will print 'false'

    }
}

