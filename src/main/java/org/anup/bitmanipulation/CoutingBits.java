package main.java.org.anup.bitmanipulation;

import java.util.Arrays;

//leetcode - 338
//Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
// ans[i] is the number of 1's in the binary representation of i
public class CoutingBits {
    public static void main(String[] args) {
        int num = 5;
        //int[] countingBits = counting1BitsV1(num);
        //int[] countingBits = counting1BitsV2(num);
        int[] countingBits = counting1BitsV3(num);
        System.out.println(Arrays.toString(countingBits));
    }

    private static int[] counting1BitsV1(int num) {
        int[] ans = new int[num+1];
        for (int i = 0; i < ans.length ; i++) {
            int index = i;
            int countOf1S = 0;
            while (index > 0){
                int rem = index % 2;
                if( rem == 1)  countOf1S++;
                index = index / 2;
            }
            ans[i] = countOf1S;
        }
        return ans;
    }

    private static int[] counting1BitsV2(int num){
        int[] ans = new int[num+1];
        for (int i = 1; i <= num; i++) {
            int count = 0;
            int index = i;
            while (index != 0) {
                //bitwise AND operator & to check if the least significant bit (rightmost bit) of n is '1'
                if ((index & 1) == 1) count++;
                //unsigned right shift operator >>> to shift all bits of n one position to the right.
                // This effectively removes the least significant bit we just checked.
                index = index >>> 1;
            }
            ans[i] = count;
        }
        return ans;
    }

    //Time Complexity: O(n) - We iterate through each number from 1 to ( n ) exactly once.
    //Space Complexity: O(n) - We use an array of size ( n + 1 ) to store the results.
    private static int[] counting1BitsV3(int num){
        int[] ans = new int[num+1];
        for (int i = 1; i <= num; i++) {
            //i >> 1 is equivalent to dividing ( i ) by 2 (right shift by 1 bit).
            //i & 1 checks if the least significant bit of ( i ) is '1'.
            //The number of '1' bits in ( i ) is the number of '1' bits in previously computed result for i / 2 (right shift)
            // plus the least significant bit of ( i )
            ans[i] = ans[i >>> 1 ] + (i & 1);
        }
        return ans;
    }
}
