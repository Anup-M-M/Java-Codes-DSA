package main.java.org.anup.dsa.searchingalgorithms.que;

//leetcode 33
// Given an integer array arr of size N, sorted in ascending order (with distinct values) and a target value.
// Now the array is rotated at some pivot point unknown to you.
// Find the index at which target is present and if target is not present return -1.
public class SearchEleInRotatedSorted {
    public static void main(String[] args) {
        int[] arr = {9,11,14,15,20,22,25,2,3,5,7,9};
        int target = 22 ;

      //int index = searchByLinearSearch(arr, target);
        int index = searchByBinarySearch(arr, target);
        System.out.println(index);
    }

    public static int searchByBinarySearch(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        // Perform binary search
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid element is the target
            if (nums[mid] == target) {
                return mid; // Return the index if target is found
            }

            // Determine which side is sorted
            if (nums[left] <= nums[mid]) {
                // Left half is sorted
                if (nums[left] <= target && target < nums[mid]) {
                    // Target is in the sorted left half
                    right = mid - 1; // Narrow search to the left half
                } else {
                    // Target is in the unsorted right half
                    left = mid + 1; // Narrow search to the right half
                }
            } else {
                // Right half is sorted
                if (nums[mid] < target && target <= nums[right]) {
                    // Target is in the sorted right half
                    left = mid + 1; // Narrow search to the right half
                } else {
                    // Target is in the unsorted left half
                    right = mid - 1; // Narrow search to the left half
                }
            }
        }

        return -1; // Target not found, return -1

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
