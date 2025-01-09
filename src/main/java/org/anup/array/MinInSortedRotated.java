package main.java.org.anup.array;

// Given an integer array arr of size N, sorted in ascending order (with distinct values).
// Now the array is rotated between 1 to N times which is unknown. Find the minimum element in the array.
public class MinInSortedRotated {
    public static void main(String[] args) {
        // int[] arr = {1,2,5,7,9,11,14,15,22,24};
        int[] arr = {9,11,14,15,22,24,1,2,5,7};
//        int[] arr = {14,15,22,24,2,3,5,7,9,11};
        int ans = findMinByBinarySearch(arr);
    //    int ans = findMinByLinearSearch(arr);
        System.out.println(ans);
    }

    // Binary search - Time Complexity : O(log_2N), Space Complexity : O(1)
    private static int findMinByBinarySearch(int[] arr) {
        int left = 0, right = arr.length-1;
        while(left < right){ // distinct values no need to consider equal
            int mid = (left+right)/2;
            if(arr[mid] < arr[right])
                right = mid;
            else
                left = mid +1;
        }
        return arr[left];
    }

    // Linear Search : Time Complexity: O(N), Space Complexity: O(1)
    private static int findMinByLinearSearch(int[] arr) {
        int n = arr.length; // size of the array.
        int mini = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            // Always keep the minimum.
            mini = Math.min(mini, arr[i]);
        }
        return mini;
    }
}
