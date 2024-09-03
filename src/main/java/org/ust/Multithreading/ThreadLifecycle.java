package org.ust.Multithreading;

class LifecycleExample extends Thread{

    @Override
    public void run(){
        try{
            System.out.println("Thread started and running");
            Thread.sleep(5000);
            System.out.println("Thread is back from sleep");
        }catch (InterruptedException interruptedException){
            System.out.println("Thread Interrupted");
        }
        System.out.println("Thread finished execution");
    }
}

public class ThreadLifecycle {
    public static void main(String[] args) {
        LifecycleExample lifecycleExampleThread = new LifecycleExample();
        System.out.println("Thread state after creation "+ lifecycleExampleThread.getState());
        lifecycleExampleThread.start();
        System.out.println("Thread state after start: "+ lifecycleExampleThread.getState());
        try{
            Thread.sleep(1000);
            System.out.println("Thread state after sleeping for a while "+ lifecycleExampleThread.getState());
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }

        try{
            lifecycleExampleThread.join();
            lifecycleExampleThread.interrupted();
            //System.out.println("Main thread on waiting "+ Thread.currentThread().getState());
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }
        System.out.println("Thread state after completion "+ lifecycleExampleThread.getState());
    }
}
