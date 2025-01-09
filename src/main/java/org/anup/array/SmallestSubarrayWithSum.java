package main.java.org.anup.array;

// finding the smallest subarray with a sum ≥ target
public class SmallestSubarrayWithSum {

    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 2, 4, 3};
        int target = 7;
        //int result = minSubArrayLenByBF(target, nums);
        int result = minSubArrayLenBySW(target, nums);
        System.out.println("The smallest subarray length is: " + result);
    }

    // Time Complexity : O(n) - Each element is added to and removed from the window once.
    // Space Complexity : O(1)
    public static int minSubArrayLenBySW(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE; // To track the minimum length
        int currentSum = 0; // Current sum of the window
        int start = 0; // Start index of the window

        // Iterate through the array
        for (int end = 0; end < nums.length; end++) {
            currentSum += nums[end]; // Add current element to the window

            // Shrink the window as long as the currentSum is >= target
            while (currentSum >= target) {
                minLength = Math.min(minLength, end - start + 1);
                currentSum -= nums[start]; // Remove the element at 'start'
                start++; // Move the start of the window
            }
        }

        // If minLength was not updated, no valid subarray was found
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    // Time Complexity : O(n^2)
    // Space Complexity : O(1)
    public static int minSubArrayLenByBF(int target, int[] nums) {
        int minLength = Integer.MAX_VALUE; // To track the minimum length

        // Outer loop to fix the start of the subarray
        for (int i = 0; i < nums.length; i++) {
            int currentSum = 0; // Initialize sum for each subarray

            // Inner loop to fix the end of the subarray
            for (int j = i; j < nums.length; j++) {
                currentSum += nums[j]; // Add the current element to the sum

                // If the sum is >= target, update the minimum length
                if (currentSum >= target) {
                    minLength = Math.min(minLength, j - i + 1);
                    break; // No need to check longer subarrays starting from 'i'
                }
            }
        }

        // If no valid subarray is found, return 0
        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }
}
