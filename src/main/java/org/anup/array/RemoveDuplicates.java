package main.java.org.anup.array;

import java.util.Arrays;

// Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once.
// The relative order of the elements should be kept the same.
// Then return the number of unique elements in nums.
public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int uniqueElement = removeDuplicates(nums);
        System.out.println(uniqueElement);
    }

    private static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i-1])
                nums[k++] = nums[i];
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
