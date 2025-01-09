package main.java.org.anup.array;

import java.util.Arrays;

// Given an array of integers, nums, and an integer target, return the indices of the two numbers that add up to the target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//Subarray with Given Sum
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {11, 20, 3, 7, 9,2, 14};
        int target = 17;
        int[] ans = new int[2];

        ans = twoSumV1(arr, target);
        System.out.println(Arrays.toString(ans));

        int[] res = new int[2];
        res = twoSumV2(arr, target);
        System.out.println(Arrays.toString(res));

    }

//Brute Force Approach : systematically explores every option until a problem’s answer is discovered.
//Time Complexity : O(n2) where n is the length of the array.
//Space Complexity : O(1). This approach does not use any additional data structures that grow with input size.
// Same problem solved by HashMAp
    private static int[] twoSumV1(int[] arr, int target) {
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target)
                    return new int[]{i, j};
            }
        }
        return null;
    }

// Given an array of integers arr[] and an integer target. Return YES if there exist two numbers such that their sum is equal to the target. Otherwise, return NO
    // using two-pointer -  we will first sort the array and will try to choose the numbers in a greedy way.
    // Time Complexity: O(N) + O(N*logN), where N = size of the array.
    //Reason: The loop will run at most N times. And sorting the array will take N*logN time complexity.
    //Space Complexity: O(1) as we are not using any extra space.
    private static int[] twoSumV2(int[] arr, int target) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int len = arr.length;
        int left = 0, right = len -1;
        while(left < right){
            int sum = arr[left] + arr[right];
            if(sum == target)
                return new int[]{left, right};
              // return true;
            else if (sum < target)
                left ++;
            else
                right--;
        }
        return null;
        //return false;
    }
}
