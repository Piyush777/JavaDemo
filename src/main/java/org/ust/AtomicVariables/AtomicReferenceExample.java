package org.ust.AtomicVariables;

import java.util.concurrent.atomic.AtomicReference;

public class AtomicReferenceExample {

    public static void main(String[] args) {

        AtomicReference<String> atomicReference = new AtomicReference<>("Initial");
        System.out.println("Initial value "+ atomicReference.get());

        boolean updated = atomicReference.compareAndSet("Initial","New Value");
        System.out.println("Compare and set success "+ updated);
        System.out.println("Updated value "+ atomicReference.get());

    }
}
