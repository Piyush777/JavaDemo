package org.ust.BehavioralDesignPattern.StrategyPattern.SortStrategyDemo;

//Concrete Strategy B: Quick Sort
public class QuickSort implements SortStrategy{


    @Override
    public void sort(int[] numbers) {
        System.out.println("Sorting using Quick Sort");

        quickSort(numbers,0,numbers.length-1);
        printNumbers(numbers);
    }

    private void quickSort(int []arr, int low, int high){
        if(low<high){
            int pi = partition(arr,low,high);
            quickSort(arr, low, pi-1);
            quickSort(arr,pi+1, high);
        }
    }

    private int partition(int []arr, int low, int high){
        int pivot = arr[high];
        int i=low-1;
        for(int j=low;j<high;++j){
            if(arr[j]<=pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j]=temp;
            }
        }
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i+1;
    }

    public void printNumbers(int []numbers){
        for(int num: numbers){

            System.out.println(num);
        }
    }
}
