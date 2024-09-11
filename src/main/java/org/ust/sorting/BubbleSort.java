package org.ust.sorting;

public class BubbleSort {

    public static void bubbleSort(int[]arr){
        int n = arr.length;
        boolean swapped;

        for(int i=0;i<n-1;++i){
            swapped=false;

            for(int j=0;j<n-1-i;++j){

                if(arr[j]>arr[j+1]){

                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true;
                }
            }

            if(!swapped){
                break;
            }
            System.out.println("After pass "+(i+1));
            printArray(arr);
        }
    }

    public static void printArray(int[]arr){
        for(int num:arr){
            System.out.print(num+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int []arr={5,3,8,4,2};
        System.out.println("Original Array ");
        printArray(arr);
        bubbleSort(arr);
        System.out.println("Sorted Array ");
        printArray(arr);
    }
}
