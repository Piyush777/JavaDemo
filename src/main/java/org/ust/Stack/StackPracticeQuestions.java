package org.ust.Stack;

import java.util.Stack;


public class StackPracticeQuestions {

    public static void main(String[] args) {

        //Q1. Reverse an array using stack
        int arr[]={1,2,3,4,5};
        arr = reverseArray(arr);

        System.out.println("Reversed Array");
        for(int num: arr){
            System.out.println(num);
        }
    }

    private static int[] reverseArray(int []arr){

        Stack<Integer> numStack = new Stack<>();
        for(int num: arr){

            numStack.push(num);
        }

        int []result = new int[arr.length];
        int index=0;

        while(!numStack.isEmpty()){

            result[index] = numStack.pop();
            index++;
        }

        return result;
    }
}


//String input = "hello", reverse this string using stack
// String expression = "(())", expression="(()))", expression ="))((", check whether expression is balanced or not