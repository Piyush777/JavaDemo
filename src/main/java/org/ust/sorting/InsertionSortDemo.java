package org.ust.sorting;

public class InsertionSortDemo {
    public static void insertionSort(int[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
            System.out.println("After pass: ");
            for(int num: array){
                System.out.print (num+" ");
            }
            System.out.println();
        }
    }

    public static void insertionSort(char[] array) {
        int n = array.length;
        for (int i = 1; i < n; i++) {
            char key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        System.out.println("Original Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }

        insertionSort(arr);

        System.out.println("\nSorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }


        char[] arrChar = {'a', 'z', 'f', 'c'};
        System.out.println("Original Array:");
        for (char c : arrChar) {
            System.out.print(c + " ");
        }

        insertionSort(arrChar);

        System.out.println("\nSorted Array:");
        for (char c : arrChar) {
            System.out.print(c + " ");
        }
    }
}
