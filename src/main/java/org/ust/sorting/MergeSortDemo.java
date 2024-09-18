package org.ust.sorting;

import java.util.Objects;

public class MergeSortDemo {

    private static void merge(int []arr,int []left, int []right){

        int i=0,j=0,k=0;

        while(i<left.length && j< right.length){
            if(left[i]<=right[j]){
                arr[k] = left[i];
                k++;
                i++;
            }else{
                arr[k] = right[j];
                k++;
                j++;
            }
        }

        while(i<left.length){
            arr[k]= left[i];
            k++;
            i++;
        }

        while(j<right.length){
            arr[k]= right[j];
            k++;
            j++;
        }
    }

    public static void mergeSort(int []arr) {


        if (Objects.isNull(arr) || arr.length <= 1) {
            return;
        }
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < mid; ++i) {
            left[i] = arr[i];
        }

        for (int i = mid; i < arr.length; ++i) {
            right[i - mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(arr, left, right);
    }


    public static void main(String[] args) {
        int[]arr = {3,2,1,5};
        System.out.println("Original ");
        for(int num: arr){
            System.out.println(num);
        }
        mergeSort(arr);
        System.out.println("Modified");
        for(int num: arr){
            System.out.println(num);
        }
    }
}
