package org.ust.BehavioralDesignPattern.StrategyPattern.SortStrategyDemo;

//Concrete Strategy A: Bubble Sort
public class BubbleSort implements SortStrategy{

    public void sort(int[] numbers){

        System.out.println("Sorting using Bubble Sort");
        int n = numbers.length;

        for(int index=0;index<n-1;++index){
            for(int secondIndex=0;secondIndex<n-index-1;++secondIndex){
                if(numbers[secondIndex]>numbers[secondIndex+1]){
                    int temp = numbers[secondIndex];
                    numbers[secondIndex]= numbers[secondIndex+1];
                    numbers[secondIndex+1] = temp;
                }
            }
        }

        printNumbers(numbers);
    }


    public void printNumbers(int []numbers){
        for(int num: numbers){

            System.out.println(num);
        }
    }
}
