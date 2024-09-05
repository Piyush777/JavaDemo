package org.ust.AtomicVariables;

import java.util.concurrent.atomic.AtomicBoolean;

public class AtomicBooleanExample {
    public static void main(String[] args) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(true);

        System.out.println("Initial value "+ atomicBoolean.get());
        atomicBoolean.set(false);
        System.out.println("Updated value "+ atomicBoolean.get());

        boolean updated = atomicBoolean.compareAndSet(false,true);
        System.out.println("Compare and set success "+ updated);
        System.out.println("Updated value "+ atomicBoolean.get());

        updated = atomicBoolean.compareAndSet(false,true);
        System.out.println("Compare and set success "+ updated);


    }
}
