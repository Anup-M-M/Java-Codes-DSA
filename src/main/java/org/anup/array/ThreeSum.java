package main.java.org.anup.array;

import java.util.HashSet;
import java.util.Set;

// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k,
// and j != k, and nums[i] + nums[j] + nums[k] == 0.
//Notice that the solution set must not contain duplicate triplets.

public class ThreeSum {
    public static void main(String[] args) {
        int[] arr = {7,-6,3,8,-1,8,-11};
        int len = arr.length;
        int target = 0;

        threeSum(arr,target,len);

    }

    //Time Complexity : O(n3).
    //Space Complexity : O(1)
    // better solved by HashMap
    private static void threeSum(int[] arr, int target, int len) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                for (int k = j+1; k < len; k++) {
                    if(arr[i] + arr[j] + arr[k] == target && !set.contains(arr[i] +" "+arr[j] + " "+ arr[k])){
                        System.out.println(arr[i] +" "+arr[j] + " "+ arr[k]);
                        set.add(arr[i] +" "+arr[j] + " "+ arr[k]);
                        System.out.println(" Set : "+ set);
                    }
                }
            }
        }
    }
}
