package org.ust.Multithreading;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class TimedTask implements Callable<String> {
    @Override
    public String call() throws Exception {
        // Simulate a long-running task
        Thread.sleep(5000);
        return "Task Finished";
    }
}

public class CheckFutureStatus {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(new TimedTask());

        System.out.println("Task submitted, checking status...");

        try {
            // Periodically check if the task is done
            while (!future.isDone()) {
                System.out.println("Task is not done yet...");
                Thread.sleep(1000); // Wait before checking again
            }

            // Now we know the task is done, we can retrieve the result
            String result = future.get();
            System.out.println("Task completed with result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}
