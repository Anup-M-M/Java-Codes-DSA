package main.java.org.anup.dsa.sortingalgorithms;

import java.util.Arrays;

// It works by iteratively inserting each element of an unsorted list into its correct position in a sorted portion of the list.
public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array: " + Arrays.toString(arr));

        insertionSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    //Time Complexity:
    //Worst Case: O(n²) - When the array is sorted in reverse order.
    //Average Case: O(n²) - For random order.
    //Best Case: O(n) - When the array is already sorted.
    //Space Complexity:
    //Auxiliary Space: O(1) - Insertion Sort is an in-place sorting algorithm.
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        // Loop through each element starting from the second element
        for (int i = 1; i < n; i++) {
            int key = arr[i];  // The element to be inserted
            int j = i - 1;

            //Compare it with the previous elements and shift them to the right if they are greater.
            // Move elements of arr[0..i-1] that are greater than key to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Insert the key into the correct position
            arr[j + 1] = key;
        }
    }
}
