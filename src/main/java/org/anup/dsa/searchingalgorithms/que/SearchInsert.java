package main.java.org.anup.dsa.searchingalgorithms.que;

//leetcode - 35. Search Insert Position
//Given a sorted array of distinct integers and a target value, return the index if the target is found.
// If not, return the index where it would be if it were inserted in order.
public class SearchInsert {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 7;
        int index = searchInsert(arr, target);
        //int index = searchInsertByLS(arr, target);
        System.out.println(index);
    }

    public static int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length;

        while (left < right) {
            int mid = (left + right) / 2;
            // Check if the target is found at the mid index
            if (nums[mid] == target) {
                return mid; // Return the index of the target if found
            }
            // If the target is greater than nums[mid], search in the right half
            else if (nums[mid] < target) {
                left = mid + 1; // Move the left pointer to mid + 1
            }
            // If the target is smaller than nums[mid], search in the left half
            else {
                right = mid; // Move the right pointer to mid
            }
        }
        return left;
    }


    public static int searchInsertByLS(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }
}
