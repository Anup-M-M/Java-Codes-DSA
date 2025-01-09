package main.java.org.anup.hashmap;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Given an array of integers, nums, and an integer target, return the indices of the two numbers that add up to the target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {11, 3, 7, 9, 14, 2};
        int target = 17;

        // One-Pass Hash Table
        twoSumByOnePassHT(arr, target);

        int[] diffApproch = new int[2];
        diffApproch = twoSum(arr, target);
        System.out.println(Arrays.toString(diffApproch));
    }

    // One-Pass Hash Table : As we iterate over the array, we insert elements into the hash map and simultaneously check for the complement.
    //as it optimizes the time by reducing the number of iterations over the array to one.
    //Time Complexity : O(n), as we are looping through the array once.
    //Space Complexity : O(n), because a hash map is used to store the array elements and their indices.
    private static void twoSumByOnePassHT(int[] arr, int target) {

        int[] ans = new int[2];
        // Create a map to store the numbers and their indices.
        HashMap<Integer, Integer> map = new HashMap<>();

        // iterate over the array
        for (int i = 0; i < arr.length; i++) {
            // Calculate the complement of the current number.
            int compliment = target - arr[i];
            // check complement.
            if (map.containsKey(compliment)) {
                // If complement exists, return the indices.
                ans[0] = map.get(compliment);
                ans[1] = i;
                break;
            }
            // otherwise, insert the insert element and index
            map.put(arr[i], i);
        }
        System.out.println(ans[0] + " , " + ans[1]);

    }


    // Two-Pass Hash Table
    //Time Complexity : O(n), as we only loop iterate over the array twice sequentially (not nested).
    //Space Complexity : O(n), because we use a hash map to store the array elements and their indices, needing space that grows linearly with the input size.
    public static int[] twoSum(int[] nums, int target) {
        // Create a map to store the numbers and their indices.
        Map<Integer, Integer> numMap = new HashMap<>();
        // Add each number and its index to the map.
        for (int i = 0; i < nums.length; i++) {
            numMap.put(nums[i], i);
        }
        // Check for each number, if its complement exists in the map.
        for (int i = 0; i < nums.length; i++) {
            // Calculate the complement of the current number.
            int complement = target - nums[i];
            // Ensure the complement is not the number itself.
            if (numMap.containsKey(complement) && numMap.get(complement) != i) {
                // If complement exists, return the indices.
                return new int[]{i, numMap.get(complement)};
            }
        }
        // If no two numbers sum up to the target, return null.
        return null;
    }
}
