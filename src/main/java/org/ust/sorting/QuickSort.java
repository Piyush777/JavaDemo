package org.ust.sorting;

public class QuickSort {

    // Function to perform Quick Sort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Function to partition the array
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choose the last element as pivot
        int i = (low - 1);  // Index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        i++;
        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;
        //printArray(arr);

        return i ;
    }

    // Helper function to print the array
    private static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Main function to test the Quick Sort algorithm
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 7, 2, 6, 4, 1};
        System.out.println("Original Array:");
        printArray(arr);

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array:");
        printArray(arr);
    }
}
