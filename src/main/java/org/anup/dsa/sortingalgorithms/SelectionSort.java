package main.java.org.anup.dsa.sortingalgorithms;

import java.util.Arrays;

// It repeatedly selects the smallest or largest element from the unsorted portion of list and swaps it to the
// sorted portion of the list. this process is repeated for the remaining unsorted portion until entire list is sorted.
public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original Array: " + Arrays.toString(arr));

        selectionSort(arr);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    //Time Complexity:
    //Worst Case: O(n²) - Regardless of the initial order of the array.
    //Average Case: O(n²) - For random order.
    //Best Case: O(n²) - For an already sorted or reverse-sorted array.
    //Space Complexity:
    //Auxiliary Space: O(1) - Selection Sort is an in-place sorting algorithm.
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Loop through each element to place it in the correct position
        for (int i = 0; i < n - 1; i++) {
            // Assume the current index is the minimum
            int minIndex = i;

            // Find the index of the smallest element in the remaining unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex])
                    minIndex = j;  // Update minIndex if a smaller element is found
            }
            // swapping
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
