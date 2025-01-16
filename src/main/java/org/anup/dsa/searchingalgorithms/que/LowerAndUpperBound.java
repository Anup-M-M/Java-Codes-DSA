package main.java.org.anup.dsa.searchingalgorithms.que;

//Given a sorted array of integers nums and a target value, find the upper and lower bound of the target value.
// If the target is not found, return [-1, -1].
public class LowerAndUpperBound {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 2, 2, 4, 4};
        int target = 2;
        int[] result = new int[2];
        //lower bound : it returns the index of the first occurrence of the target
        //upper bound : It returns the index of the first element greater than the target
        result = findUpperLowerBounds(arr, target);
        System.out.println("Lower Bound: " + result[0]); // Output: 1
        System.out.println("Upper Bound: " + result[1]); // Output: 6
    }

    public static int[] findUpperLowerBounds(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int lowerBound = -1;

        // Find lower bound
        while (left <= right) {
            int mid = (left + right) / 2;
            if(nums[mid] == target){
                lowerBound = mid; // Possible ans
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }

        left = 0;
        right = nums.length - 1;
        int upperBound = -1;

        // Find upper bound
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                upperBound = mid; // Possible answer
                right = mid - 1;
            }
        }

        return new int[] {lowerBound, upperBound};
    }
}

