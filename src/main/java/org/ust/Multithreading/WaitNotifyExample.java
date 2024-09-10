package org.ust.Multithreading;

class Message {
    private String message;
    private boolean isEmpty = true;


    // Method for the producer to set the message
    public synchronized void produce(String message) {
        while (!isEmpty) {
            try {
                wait(); // Wait until the message is consumed
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.message = message;
        isEmpty = false;
        System.out.println("Produced: " + message);
        notify(); // Notify the consumer that the message is available
    }

    // Method for the consumer to get the message
    public synchronized String consume() {
        while (isEmpty) {
            try {
                wait(); // Wait until the message is produced
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isEmpty = true;
        System.out.println("Consumed: " + message);
        notify(); // Notify the producer that the message is consumed
        return message;
    }
}

class Producer implements Runnable {
    private Message message;

    public Producer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String[] messages = {"Hello", "World", "from", "wait", "notify"};
        for (String msg : messages) {
            message.produce(msg);
            try {
                Thread.sleep(1000); // Simulate some delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        message.produce("DONE"); // Send termination message
    }
}

class Consumer implements Runnable {
    private Message message;

    public Consumer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String msg;
        do {
            msg = message.consume();
            try {
                Thread.sleep(1000); // Simulate some delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while (!msg.equals("DONE")); // Stop when "DONE" message is received
    }
}

public class WaitNotifyExample {
    public static void main(String[] args) {
        Message message = new Message();
        Thread producerThread = new Thread(new Producer(message));
        Thread consumerThread = new Thread(new Consumer(message));

        producerThread.start();
        consumerThread.start();
    }
}
