package main.java.org.anup.array;

import java.util.Arrays;

//Given an array arr[], the task is to find the subarray that has the maximum sum and return its sum.
public class MaxSubarraySum {
    public static void main(String[] args) {

       // int[] arr = {2, 3, -8, 7, -1, 2, 3};
        int[] arr = {-4, -2, -3};
        int maxSum = maxSubarraySumV1(arr);
        //int maxSum = maxSubarraySumV2(arr);
        System.out.println(maxSum);
        
        int[] result = findMaxSumSubArray(arr);
        System.out.println(Arrays.toString(result));
    }

    // O(n) Time and O(1) Space
    private static int maxSubarraySumV2(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either continue the existing subarray or start a new subarray
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update the maxSum if needed
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }

    //O(n^2) Time and O(1) Space
    public static int maxSubarraySumV1(int[] nums) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0;
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j];
                // Update maxSum inside the inner loop to check every subarray
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        return maxSum;
    }

    private static int[] findMaxSumSubArray(int[] arr) {
        int currentSum = arr[0]; // Max sum ending at the current position
        int maxSum = arr[0];  // Max sum found so far
        int start = 0;           // Start index of the max subarray
        int end = 0;             // End index of the max subarray
        int tempStart = 0;       // Temporary start index

        for (int i = 1; i < arr.length; i++) {
            // Decide whether to include arr[i] in the current subarray or start a new subarray
            if (arr[i] > currentSum + arr[i]) {
                currentSum = arr[i];
                tempStart = i; // Start a new subarray
            } else {
                currentSum += arr[i];
            }

            // Update global maximum and subarray indices
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i; // Update end to the current index
            }
        }

        // Return the subarray
        return Arrays.copyOfRange(arr, start, end + 1);
    }
}
