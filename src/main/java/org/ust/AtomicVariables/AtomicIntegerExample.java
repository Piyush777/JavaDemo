package org.ust.AtomicVariables;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {

    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger(0);

        System.out.println("Initial value "+ atomicInteger.get());
        System.out.println("After Increment value "+ atomicInteger.incrementAndGet());

        System.out.println("After Decrement value "+ atomicInteger.decrementAndGet());

        atomicInteger.addAndGet(10);
        System.out.println("After adding 10: "+ atomicInteger.get());

        atomicInteger.set(100);
        System.out.println("After updating: "+ atomicInteger.get());

        boolean updated = atomicInteger.compareAndSet(100,200);
        System.out.println("Compare and set success "+ updated);
        System.out.println("Updated value "+ atomicInteger.get());



    }
}
