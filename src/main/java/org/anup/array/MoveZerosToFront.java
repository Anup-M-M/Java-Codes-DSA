package main.java.org.anup.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZerosToFront {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 0, 3, 0 };
        
       // pushZerosToFrontV1(arr);
        pushZerosToFrontV2(arr);
    }

    //Time Complexity: O(n), n is number of elements in the input array.
    //Auxiliary Space: O(1)
    private static void pushZerosToFrontV2(int[] arr) {

        int n = arr.length;

        // find the index of last zero
        int end = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                end = i;
                break;
            }
        }

        // Modifying the array by traversing from end-1 to 0
        for (int i = end - 1; i >= 0; i--) {
            if (arr[i] != 0) { // if element is a non-zero element,
                // swap it with arr[end]
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Time Complexity: O(n), where n is number of elements in input array.
    //Auxiliary Space: O(1),The algorithm uses a constant amount of extra space,
    private static void pushZerosToFrontV1(int[] nums) {

        int n = nums.length;
        int index = n - 1; // Index to place the next non-zero element from the end

        // Traverse the array from the end
        for (int i = n - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                nums[index--] = nums[i];
            }
        }

        // Fill the remaining positions with zeros
        while (index >= 0) {
            nums[index--] = 0;
        }

        System.out.println(Arrays.toString(nums));
    }
}
