package main.java.org.anup.dsa.searchingalgorithms.que;

// leetcode #162
// Given a 0-indexed integer array nums, find a peak element, and return its index.
// If the array contains multiple peaks, return the index to any of the peaks.
// element is always considered to be strictly greater than a neighbor that is outside the array.
public class PeakElement {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};

        System.out.println("Peak Index in nums2: " + findPeakElementByBS(nums2)); // Output: 5
    }

    // Time Complexity : O(log n) | Space Complexity : O(1)
    private static int findPeakElementByBS(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        // element is considered a peak if it is greater than its neighbors
        while (left < right) {
            int mid = left + (right - left) / 2;
            //If nums[mid] is less than nums[mid + 1], the peak lies on the right side.
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                //If nums[mid] is greater than nums[mid + 1], it means the peak lies on the left side (including mid itself).
                right = mid;
            }
        }

        return left;
    }

}
