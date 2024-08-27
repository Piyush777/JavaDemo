package org.ust.Queue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

    public static void main(String[] args) {

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.add(30);
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(40);
        priorityQueue.add(50);
        priorityQueue.add(60);
        priorityQueue.add(110);


        System.out.println("Priority Queue after adding elements "+ priorityQueue);

        Integer top = priorityQueue.peek();
        System.out.println(" Peek Element "+ top);

        Integer removedElement  = priorityQueue.poll();
        System.out.println(" Removed Element "+ removedElement);
        System.out.println(" Queue contents after removal "+ priorityQueue);

        System.out.println("Removing 2 more elements ");
        System.out.println(priorityQueue.poll());
        System.out.println(priorityQueue.poll());

        boolean isEQueueEmpty = priorityQueue.isEmpty();
        System.out.println("Is Queue Empty "+ isEQueueEmpty);

        System.out.println("Iterating through Priority Queue");
        System.out.println("Iterating without removing");
        for(Integer element: priorityQueue){
            System.out.println(element);
        }

        System.out.println("Iterating with removal");

        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }

        isEQueueEmpty = priorityQueue.isEmpty();
        System.out.println("Is Queue Empty "+ isEQueueEmpty);
    }
}



// Task : Score
// Task prioritsed by score, task with higher score gets priority

// add tasks, process task by deadline and display all at once