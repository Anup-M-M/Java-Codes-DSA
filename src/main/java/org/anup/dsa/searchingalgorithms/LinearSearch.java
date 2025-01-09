package main.java.org.anup.dsa.searchingalgorithms;

import java.util.Arrays;

// Search key element from multiple elements, It starts from one end goes through each element in list
// until it found the desired element otherwise the search continues till the end of data set.
public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,50,30,40,70,20,60};
        int target = 20;

//      int result = linearSearch(arr, target);
        int result = linearSearchByRecursion(arr,0, arr.length, target);

        if(result >= 0)
            System.out.println("Element found at index : " + result );
        else
            System.out.println("Element not found ");
    }

    private static int linearSearchByRecursion(int[] arr, int left, int right, int target) {
        Arrays.sort(arr);
        if(left <= right){
            int mid = left + (right-1) / 2;

            if(arr[mid] == target)
                return mid;

            if(arr[mid] < target)
                return linearSearchByRecursion(arr, mid+1, right, target);

            return linearSearchByRecursion(arr,left, mid-1, target);
        }
        return -1;
    }

    // Time Complexity : O(n)
    private static int linearSearch(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target)
                return i;
        }
        return -1;
    }
}
