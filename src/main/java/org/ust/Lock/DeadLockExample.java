package org.ust.Lock;

public class DeadLockExample {

    private final Object object1 = new Object();
    private final Object object2 = new Object();

    public void method1(){
        synchronized (object1){
            System.out.println("Thread 1: Acquired Object1");

            try{Thread.sleep(100);
            } catch (InterruptedException interruptedException){
                interruptedException.printStackTrace();
            }

            synchronized (object2){
                System.out.println("Thread 1 : Acquired Object2");

            }
        }
    }

    public void method2(){
        synchronized (object1){
            System.out.println("Thread 2: Acquired Object1");

            try{Thread.sleep(100);
            } catch (InterruptedException interruptedException){
                interruptedException.printStackTrace();
            }

            synchronized (object2){
                System.out.println("Thread 2 : Acquired Object2");

            }
        }
    }

    public static void main(String[] args) {
        DeadLockExample deadLockExample = new DeadLockExample();
        Thread thread1 = new Thread(deadLockExample::method1);
        Thread thread2 = new Thread(deadLockExample::method2);
        thread1.start();
        thread2.start();
    }
}
