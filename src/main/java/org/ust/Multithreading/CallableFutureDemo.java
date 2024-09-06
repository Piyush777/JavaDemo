package org.ust.Multithreading;


import java.util.concurrent.*;

class SumCallable implements Callable<Integer>{


    @Override
    public Integer call() throws Exception {
        int sum=0;
        for(int i=1;i<=100;++i){
            sum+=i;
        }
        return sum;
    }
}

public class CallableFutureDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<Integer> callableTask = new SumCallable();
        Future<Integer> future = executorService.submit(callableTask);

        try{
            Integer result = future.get(2,TimeUnit.SECONDS);
            System.out.println("Sum = " + result);
        }catch (InterruptedException | ExecutionException| TimeoutException e){
            e.printStackTrace();
        }finally {
            executorService.shutdownNow();
        }

    }
}
