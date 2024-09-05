package org.ust.Lock;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLockExample {
    private int counter =0;
    private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock(true);

    public void increment(){
        readWriteLock.writeLock().lock();
        try{
            counter++;
            System.out.println("Counter incremented to "+ counter);
        }finally {
            readWriteLock.writeLock().unlock();
        }
    }

    public void readCounter(){
        readWriteLock.readLock().lock();
        try{
            System.out.println("Counter value is "+ counter);
        }finally {
            readWriteLock.readLock().unlock();
        }
    }

    static class IncrementCounter extends Thread{
        ReadWriteLockExample lockExample;
        public IncrementCounter(ReadWriteLockExample lockExample){
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


    static class ReadCounter extends Thread{
        ReadWriteLockExample lockExample;
        public ReadCounter(ReadWriteLockExample lockExample){
            this.lockExample = lockExample;
        }

        @Override
        public void run(){
            for(int i=0;i<10;++i){
                lockExample.readCounter();
                try{
                    Thread.sleep(100);
                }catch (InterruptedException interruptedException){
                    interruptedException.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        ReadWriteLockExample readWriteLockExample = new ReadWriteLockExample();
        IncrementCounter incrementCounter = new IncrementCounter(readWriteLockExample);
        ReadCounter readCounter = new ReadCounter(readWriteLockExample);
        incrementCounter.start();
        readCounter.start();
    }
}
