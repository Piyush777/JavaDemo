package org.ust.Multithreading;

/*
    This code can also be used to monitor mutex properties
    because mutex properties are already followed by semaphore keyword
*/

class Counter{
    private int count=0;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}

class CounterTask implements Runnable{

    private Counter counter;

    public CounterTask(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i=0;i<1000;++i){
            counter.increment();
        }
    }
}

public class CounterWithoutSync {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread t1 = new Thread(new CounterTask(counter));
        Thread t2 = new Thread(new CounterTask(counter));

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }

        System.out.println("Final value of counter without synchronisation "+ counter.getCount());
    }
}
