package org.ust.Multithreading;



class MyRunnable implements Runnable {


    @Override
    public void run() {
        for (int i = 0; i < 5; ++i) {
            System.out.println("Runnable running: " + i);
            System.out.println(Thread.currentThread().getId());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class RunnableDemo {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }
}

