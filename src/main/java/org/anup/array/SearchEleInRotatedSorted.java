package main.java.org.anup.array;

// Given an integer array arr of size N, sorted in ascending order (with distinct values) and a target value.
// Now the array is rotated at some pivot point unknown to you.
// Find the index at which target is present and if target is not present return -1.
public class SearchEleInRotatedSorted {
    public static void main(String[] args) {
        int[] arr = {9,11,14,15,20,22,25,2,3,5,7,9};
        int target = 22 ;
//        int ans = searchByLinearSearch(arr, target);
//        if (ans == -1)
//            System.out.println("Target is not present.");
//        else
//            System.out.println("The index is: " + ans);

        int minIndex = findMin(arr);
        int ans = binarySearch(arr, 0 , minIndex-1, target);
        if(ans == -1)
           ans = binarySearch(arr, minIndex, arr.length-1, target);
        System.out.println(ans);
    }

    private static int findMin(int[] arr) {
        int left = 0, right = arr.length-1;
        while(left < right ){
            int mid = (left+right)/2;
            if(arr[mid] < arr[right])
                right = mid;
            else
                left = mid +1;
        }
        return left;
    }

    // Binary search - Time Complexity : O(log_2N), Space Complexity : O(1)
    private  static int binarySearch(int[] arr, int left, int right, int target){
        while (left <= right){
            int mid = (left + right)/2;
            if(arr[mid]  == target)
                return mid;
            else if(arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return -1;
    }

    // Linear Search : Time Complexity: O(N), Space Complexity: O(1)
    private static int searchByLinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}
