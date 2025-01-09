package main.java.org.anup.dsa.searchingalgorithms.que;

//Given a 0-indexed integer array nums, find a peak element, and return its index.
// If the array contains multiple peaks, return the index to any of the peaks.
// element is always considered to be strictly greater than a neighbor that is outside the array.
public class PeakElement {
    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 1, 3, 5, 6, 4};

        System.out.println("Peak Index in nums2: " + findPeakElementByBS(nums2)); // Output: 2, 5
    }

    // Time Complexity : O(log n) Space Complexity : O(1)
    private static int findPeakElementByBS(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < nums[mid + 1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return left;
    }

}
