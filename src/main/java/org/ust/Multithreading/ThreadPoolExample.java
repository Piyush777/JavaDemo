package org.ust.Multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

// Task class that implements Runnable
class Task implements Runnable {
    private final String taskName;

    public Task(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing task: " + taskName);
        try {
            // Simulate task execution time
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " finished executing task: " + taskName);
    }
}

public class ThreadPoolExample {

    // Demonstrate Fixed Thread Pool
    public static void demonstrateFixedThreadPool() {
        System.out.println("Demonstrating Fixed Thread Pool");

        // Create a fixed thread pool with 3 threads
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

        // Submit tasks to the pool
        for (int i = 1; i <= 6; i++) {
            fixedThreadPool.submit(new Task("FixedTask-" + i));
        }

        // Shutdown the pool
        fixedThreadPool.shutdown();
        try {
            fixedThreadPool.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // Demonstrate Cached Thread Pool
    public static void demonstrateCachedThreadPool() {
        System.out.println("Demonstrating Cached Thread Pool");

        // Create a cached thread pool
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();

        // Submit tasks to the pool
        for (int i = 1; i <= 6; i++) {
            cachedThreadPool.submit(new Task("CachedTask-" + i));
        }

        // Shutdown the pool
        cachedThreadPool.shutdown();
        try {
            cachedThreadPool.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // Demonstrate Fixed Thread Pool
        demonstrateFixedThreadPool();

        // Separate the two demonstrations
        System.out.println("-----------------------------");

        // Demonstrate Cached Thread Pool
        demonstrateCachedThreadPool();
    }
}
