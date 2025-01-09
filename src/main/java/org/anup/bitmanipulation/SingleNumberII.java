package main.java.org.anup.bitmanipulation;

// leetcode - 137

//Given an integer array nums where every element appears three times except for one,
// which appears exactly once. Find the single element and return it.
public class SingleNumberII {
    public static void main(String[] args) {
        int[] arr = {2,2,3,2};
        int ans = findSingleNumber(arr);
        System.out.println(ans);
    }

    private static int findSingleNumber(int[] nums) {
        //ones: Holds bits that have appeared once.
        //twos: Holds bits that have appeared twice.
        int ones = 0, twos = 0;
        for (int num : nums) {
            //Update ones to hold the bits that have appeared once but not in twos.
            ones = (ones ^ num) & ~twos;
            //Update twos to hold the bits that have appeared twice but not in ones.
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }
}
