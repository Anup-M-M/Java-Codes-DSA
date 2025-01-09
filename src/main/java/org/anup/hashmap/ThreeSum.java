package main.java.org.anup.hashmap;

import java.util.Arrays;

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {2, 1, -2, 2, -1, 3, 4, 5, 2};
        int len = arr.length;
        int target = 6;

        threeSum(arr, target, len);
    }

    // Time Complexity : O(n2)
    // space complexity : O(1)

    private static void threeSum(int[] arr, int target, int len) {
        // Sort the array to make it easier to find triplets and avoid duplicates
        Arrays.sort(arr);

        // Iterate through the array
        for (int i = 0; i < len; i++) {
            // Skip duplicate elements to avoid duplicate triplets
            if (i == 0 || (arr[i] != arr[i - 1])) {
                // Initialize two pointers
                int j = i + 1, k = len - 1;
                int tar = target - arr[i];

                // Use two-pointer technique to find pairs that sum to tar
                while (j < k) {
                    if (arr[j] + arr[k] == tar) {
                        // Print the triplet that sums up to the target
                        System.out.println(arr[i] + " " + arr[j] + " " + arr[k]);

                        // Skip duplicate elements for the second pointer
                        while (j < k && (arr[j] == arr[j + 1])) j++;
                        // Skip duplicate elements for the third pointer
                        while (j < k && (arr[k] == arr[k - 1])) k--;

                        // Move both pointers to find the next potential pair
                        j++;
                        k--;
                    } else if (arr[j] + arr[k] < tar) {
                        // Move the left pointer to the right to increase the sum
                        j++;
                    } else {
                        // Move the right pointer to the left to decrease the sum
                        k--;
                    }
                }
            }
        }
    }
}
