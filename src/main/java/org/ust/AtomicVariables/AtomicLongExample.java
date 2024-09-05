package org.ust.AtomicVariables;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class AtomicLongExample {
    public static void main(String[] args) {
        AtomicLong atomicLong = new AtomicLong(0);

        System.out.println("Initial value "+ atomicLong.get());
        System.out.println("After Increment value "+ atomicLong.incrementAndGet());

        System.out.println("After Decrement value "+ atomicLong.decrementAndGet());

        atomicLong.addAndGet(10L);
        System.out.println("After adding 10: "+ atomicLong.get());

        atomicLong.set(100L);
        System.out.println("After updating: "+ atomicLong.get());

        boolean updated = atomicLong.compareAndSet(100L,200);
        System.out.println("Compare and set success "+ updated);
        System.out.println("Updated value "+ atomicLong.get());



    }
}
