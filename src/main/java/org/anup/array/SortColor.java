package main.java.org.anup.array;

import java.util.Arrays;

//Given an array nums with n objects colored red, white, or blue,
// sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
//We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
// solve by
public class SortColor {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

        int low = 0, mid = 0, high = nums.length-1;

        while(mid <=  high){
            if(nums[mid] == 0){
                // swap(nums[mid], nums[low])
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            }else if(nums[mid] == 2){
                // swap(nums[mid], nums[hign])
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}
