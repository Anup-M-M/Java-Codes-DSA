package main.java.org.anup.bitmanipulation;

// leetcode 201. Bitwise AND of Numbers Range

//Given two integers left and right that represent the range [left, right], return the bitwise AND of all numbers in this range, inclusive.
public class RangeBitwiseAnd {
    public static void main(String[] args) {
        int left = 5, right = 7;
        int ans = rangeBitwiseAnd(left, right);
        System.out.println(ans);
    }

    private static int rangeBitwiseAnd(int left, int right) {
        int shift = 0;

        // Find the common prefix
        while (left < right) {
            //Keep shifting left and right to the right (divide by 2) until they are the same.
            //This process effectively removes the differing bits.
            left >>= 1;
            right >>= 1;
            //Count the number of shifts performed to determine how many bits to shift back (left-shift) to get the result.
            shift++;
        }

        // shift it back to the left by the number of shifts performed to get the final result.
        return left << shift;
    }
}
