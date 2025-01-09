package main.java.org.anup.bitmanipulation;

import java.util.Arrays;

public class SIngleNumberIII {
    public static void main(String[] args) {
        int[] arr = {2,1,3,2,5,3};
        int[] ans = findSingleNumbers(arr);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] findSingleNumbers(int[] nums) {
        // Step 1: XOR all numbers to find XOR of the two unique numbers
        int xor = 0;
        for (int num : nums) {
            xor ^= num;
        }

        // Step 2: Find a differentiating bit (rightmost set bit)
        int diffBit = xor & (-xor);

        // Step 3: Separate numbers into two groups and find the unique numbers
        int num1 = 0, num2 = 0;
        for (int num : nums) {
            if ((num & diffBit) == 0) {
                num1 ^= num;
            } else {
                num2 ^= num;
            }
        }

        return new int[] {num1, num2};
    }
}
