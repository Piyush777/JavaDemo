package org.ust.Multithreading;



class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run(){

        for(int i=0;i<5;++i){
            System.out.println("Thread running: "+i);
            System.out.println(Thread.currentThread().getId());
            System.out.println(Thread.currentThread().getName());

            /*try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
        }
    }
}

public class ThreadClassDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("Custom Thread");
        MyThread myThread2 = new MyThread("Another Thread");
        myThread.setPriority(Thread.MAX_PRIORITY);
        myThread2.setPriority(Thread.MIN_PRIORITY);
        myThread.start();
        myThread2.start();
        //System.out.println(Thread.currentThread().getName());
    }
}
