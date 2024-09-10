package org.ust.Searching;

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchDemo {
    // Binary Search function
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            // Check if the target is present at mid
            if (array[middle] == target) {
                return middle; // target found, return index
            }

            // If target is greater, ignore the left half
            if (array[middle] < target) {
                left = middle + 1;
            }
            // If target is smaller, ignore the right half
            else {
                right = middle - 1;
            }
        }

        // Target is not present in the array
        return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Array and target to search
        System.out.println("Enter the number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];

        System.out.println("Enter the elements in sorted order:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Enter the target element to search:");
        int target = scanner.nextInt();

        // Perform binary search
        int result = binarySearch(array, target);

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }

        scanner.close();
    }
}
