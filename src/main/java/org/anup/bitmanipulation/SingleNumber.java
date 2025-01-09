package main.java.org.anup.bitmanipulation;

import java.util.HashMap;
import java.util.Map;

// leetcode 136
public class SingleNumber {
    public static void main(String[] args) {
        int arr[] = {4,1,2,1,2};
        //int uniqueNumber = findSingleUniqueNumber(arr);
        int uniqueNumber = singleNumber(arr);
        System.out.println(uniqueNumber);
    }

    //Time Complexity O(n), Space Complexity O(1)
    //Logical XOR operator - Gives 1 if both bits are different
    private static int findSingleUniqueNumber(int[] arr) {
        int result = 0;
        for (int number: arr) {
            result = result ^ number; // Logical XOR operator
        }
        return result;
    }

    //Time Complexity O(n), Space Complexity O(n)
    public static int singleNumber(int[] numbers) {
        //HashMap is created to store each number and a boolean value indicating whether it has been seen an odd number of times.
        Map<Integer, Boolean> map = new HashMap();

        for (int number: numbers) {
            map.put(number, !map.getOrDefault(number, false));
        }

        for (Map.Entry<Integer, Boolean> entry: map.entrySet()) {
            if (entry.getValue()) {
                return entry.getKey();
            }
        }
        return Integer.MIN_VALUE;
    }
}
