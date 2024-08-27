package org.ust.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {

    public static void main(String[] args) {

        Queue<String>  stringQueue = new LinkedList<>();

        stringQueue.add("Alice");
        stringQueue.add("Bob");
        stringQueue.add("Charlie");
        stringQueue.add("Diana");
        System.out.println("Queue after enqueue operation "+stringQueue);

        String front  = stringQueue.peek();
        System.out.println("Queue front "+ front);
        System.out.println("Retrieving front element "+ stringQueue.poll());

        System.out.println("After performing DeQueue, updated queue "+ stringQueue);

        boolean isQueueEmpty = stringQueue.isEmpty();
        System.out.println("Is my queue empty "+ isQueueEmpty);

        System.out.println("Iterating through the queue ");
        for(String element: stringQueue){
            System.out.println(element);
        }

        while(!stringQueue.isEmpty()){
            stringQueue.poll();
        }

        isQueueEmpty = stringQueue.isEmpty();
        System.out.println("Is my queue empty "+ isQueueEmpty);
    }
}
