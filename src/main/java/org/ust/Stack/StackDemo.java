package org.ust.Stack;

import java.util.Stack;

public class StackDemo {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Initial Stack "+ stack);

        System.out.println("Popped element "+ stack.pop());
        System.out.println("Popped element "+ stack.pop());
        System.out.println("Stack After Popping 2 elements"+ stack);

        // peek at the top of the stack
        System.out.println("Top  element (peek) "+ stack.peek());
        System.out.println("Stack After Peeking "+ stack);

        boolean isStackEmpty  = stack.isEmpty();
        System.out.println("Is Stack Empty? "+ isStackEmpty);

        searchEleInStack(stack,2);
        searchEleInStack(stack, 10);
        searchEleInStack(stack, 3);
        searchEleInStack(stack, 1);
    }

    private static void searchEleInStack(Stack<Integer> stack, int searchElement){
        int position = stack.search(searchElement);

        if(position ==-1){
            System.out.println("Element "+ searchElement + " does not exist in the given stack");
        }else{
            System.out.println("Element "+ searchElement+ " is found at position "+ position);
        }
    }
}
