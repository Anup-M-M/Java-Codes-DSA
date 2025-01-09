package main.java.org.anup.dsa.sortingalgorithms;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {8,5,9,1,6,7};
        mergeSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    //Time Complexity:
    //Worst Case: O(n log n) - Consistent for all cases.
    //Average Case: O(n log n) - Consistent for all cases.
    //Best Case: O(n log n) - Consistent for all cases.
    //Space Complexity:
    //Auxiliary Space: O(n) - Requires additional space proportional to the size of the array for merging.
    private static void mergeSort(int[] arr, int l, int r) {
        if(l < r){
            int mid = (l + r) / 2;
            // Recursively sort the left half
            mergeSort(arr, l, mid);
            // Recursively sort the right half
            mergeSort(arr, mid+1, r);
            // Merge the sorted halves
            merge(arr, l, mid, r);
        }
    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        // Temporary arrays to hold the two halves
        int[] lArry = new int[n1];
        int[] rArry = new int[n2];

        // Copy data to temporary arrays
        // System.arraycopy(arr, left, leftArray, 0, n1);
        // System.arraycopy(arr, mid + 1, rightArray, 0, n2);
        for (int x = 0; x < n1; x++) {
            lArry[x] = arr[l+x];
        }
        for (int y = 0; y < n2; y++) {
            rArry[y] = arr[mid+1+y];
        }

        int i = 0, j = 0, k = l;

        // Merge the two arrays back into arr[]
        while(i < n1 && j < n2){
            if(lArry[i] <= rArry[j]){
                arr[k] = lArry[i];
                i++;
            }else{
                arr[k] = rArry[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of leftArray (if any)
        while(i < n1){
            arr[k++] = lArry[i++];
        }
        // Copy remaining elements of rightArray (if any)
        while(j < n2){
            arr[k++] = rArry[j++];
        }
    }
}
