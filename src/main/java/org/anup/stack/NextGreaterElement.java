package main.java.org.anup.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

//leetcode - 496
public class NextGreaterElement {
    public static void main(String[] args) {
        int[] num1 = {4,1,2};
        int[] num2 = {1,3,2,4};

        int[] ans = nextGreaterElement(num1,num2);
        System.out.println(Arrays.toString(ans));
    }

    //Time Complexity: O(n+m) | Space Complexity: O(n)
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // Map to store next greater element for each number in nums2
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        // Traverse nums2 to find the next greater elements
        for (int num : nums2) {
            // Ensure stack elements are smaller than the current num
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreaterMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        // Fill -1 for elements in the stack with no greater element
        while (!stack.isEmpty()) {
            nextGreaterMap.put(stack.pop(), -1);
        }

        // Build the result array for nums1
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreaterMap.get(nums1[i]);
        }

        return result;
    }

    // Time Complexity : O(m*n) | Space Complexity : O(1)
    public static int[] nextGreaterElementWithoutStackMap(int[] nums1, int[] nums2) {
        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            int nextGreater = -1;
            boolean found = false;

            // Traverse nums2 to find the next greater element for nums1[i]
            for (int num : nums2) {
                if (num == nums1[i]) {
                    found = true;
                }
                if (found && num > nums1[i]) {
                    nextGreater = num;
                    break;
                }
            }
            result[i] = nextGreater;
        }

        return result;
    }

}
