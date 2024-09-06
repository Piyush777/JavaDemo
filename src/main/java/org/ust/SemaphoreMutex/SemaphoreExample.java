package org.ust.SemaphoreMutex;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    private static final Semaphore semaphore = new Semaphore(3);

    static class Task implements Runnable{

        private final int taskId;

        Task(int taskId){
            this.taskId = taskId;
        }

        @Override
        public void run(){
            try{
                semaphore.acquire();
                System.out.println("Task "+ taskId+ " acquired a permit on "+ Thread.currentThread().getName());
                Thread.sleep(2000);
            }catch (InterruptedException interruptedException){
                Thread.currentThread().interrupt();
            }finally {
                System.out.println("Task "+ taskId+ " released a permit on "+ Thread.currentThread().getName());
                semaphore.release();
            }
        }
    }

    public static void main(String[] args) {

        for(int index=0;index<15;++index){

            new Thread(new Task(index)).start();
        }
    }
}
