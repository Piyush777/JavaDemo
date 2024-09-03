package org.ust.Multithreading;



class MyThread extends Thread{

    @Override
    public void run(){
        for(int i=0;i<5;++i){
            System.out.println("Thread running: "+i);
            System.out.println(Thread.currentThread().getId());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class ThreadClassDemo {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        //System.out.println(Thread.currentThread().getName());
    }
}
