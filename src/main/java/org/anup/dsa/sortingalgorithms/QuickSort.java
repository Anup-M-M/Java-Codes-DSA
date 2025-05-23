package main.java.org.anup.dsa.sortingalgorithms;

import java.util.Arrays;

//It picks an elements as a pivot and partitions the given array around the pivot by placing pivot in it's correct position in the sorted array.
public class QuickSort {

    //Time Complexity:
    //Worst Case: O(n²) - When the pivot chosen is the smallest or largest element repeatedly (e.g., in already sorted or reverse-sorted arrays).
    //Average Case: O(n log n) - For random order, with a good pivot selection.
    //Best Case: O(n log n) - When the pivot divides the array into two nearly equal halves.
    //Space Complexity:
    //Auxiliary Space: O(log n) - For the recursive stack space. Quick Sort is an in-place sorting algorithm.
    public static void main(String[] args) {
        int[] arr = {5,3,6,1,4,2};
        System.out.println("Original Array: " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }

    // Main function to implement QuickSort
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Find the partition index
            int pi = partition(arr, low, high);

            System.out.println(" pi " + pi);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);  // Left of pivot
            quickSort(arr, pi + 1, high); // Right of pivot
        }
    }

    // Function to partition the array
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // Select the pivot (last element)
        int i = low - 1; // Index of smaller element
        // Move elements smaller than the pivot to the left and larger elements to the right
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the pivot element in the correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        System.out.println(Arrays.toString(arr));
        return i + 1; // Return the partition index
    }
}
