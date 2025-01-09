package main.java.org.anup.dsa.sortingalgorithms;

import java.util.Arrays;

// It arranges elements of list or arrays in specific order.
// Compares the adjacent elements and swaps them if they are in the wrong order
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,9,6,1,3};
        int length = arr.length;

        int[] result = bubbleSort(arr,length);
        System.out.println(Arrays.toString(result));
    }

    //Time Complexity:
    //Worst Case: O(n²) - When the array is sorted in reverse order.
    //Average Case: O(n²) - For random order.
    //Best Case: O(n) - When the array is already sorted (with an optimized version that checks for swaps).
    //Space Complexity:
    //Auxiliary Space: O(1) - Bubble Sort is an in-place sorting algorithm.
    private static int[] bubbleSort(int[] arr, int length) {
        int temp = 0;
        // outer loops for number of pass
        // i < length-1 : After each pass one element placed it's correct position.
        for (int i = 0; i < length-1; i++) {
            // inner loops for comparing adjacent element
            // i < n-i-1 : i element is already sorted at the end of array
            for (int j = 0; j < length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
