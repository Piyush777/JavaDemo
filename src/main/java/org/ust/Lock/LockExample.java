package org.ust.Lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockExample {

    private int counter=0;

    private final Lock lock  = new ReentrantLock();

    public void increment(){
        lock.lock();
        try{
            counter++;
            System.out.println("Counter incremented to "+ counter);
        }finally {
            lock.unlock();
        }
    }

    public void decrement(){
        lock.lock();
        try{
            counter--;
            System.out.println("Counter decremented to "+ counter);
        }finally {
            lock.unlock();
        }
    }

    static class IncrementCounter extends Thread{
        LockExample lockExample;
        public IncrementCounter(LockExample lockExample){
            this.lockExample = lockExample;
        }

        @Override
        public void run(){
            for(int i=0;i<10;++i){
                lockExample.increment();
                try{
                    Thread.sleep(100);
                }catch (InterruptedException interruptedException){
                    interruptedException.printStackTrace();
                }
            }
        }
    }

    static class DecrementCounter extends Thread{
        LockExample lockExample;
        public DecrementCounter(LockExample lockExample){
            this.lockExample = lockExample;
        }

        @Override
        public void run(){
            for(int i=0;i<10;++i){
                lockExample.decrement();
                try{
                    Thread.sleep(200);
                }catch (InterruptedException interruptedException){
                    interruptedException.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        LockExample lockExample = new LockExample();
        IncrementCounter incrementCounter = new IncrementCounter(lockExample);
        DecrementCounter decrementCounter = new DecrementCounter(lockExample);

        incrementCounter.start();
        decrementCounter.start();

    }
}
