package main.java.org.anup.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class CountPairs {
    public static void main(String[] args) {
        int arr[] = {1,1, 5, 7, -1, 5, 5};
        int target = 6;
        //int count = countPairsV1(arr, target);
        int count = countPairsV2(arr, target);
        System.out.println(count);
    }

    private static int countPairsV1(int[] arr, int target) {
        int count = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target)
                   count++;
            }
        }
        return count;
    }

    private static int countPairsV2(int[] arr, int target) {
        // Create a map to store the numbers and How many the number repeats.
        Map<Integer, Integer> freq = new HashMap<>();
        int cnt = 0;

        for (int i = 0; i < arr.length; i++) {
            int complement = (target - arr[i]);
            // exists in the map. If yes, increment count
            if (freq.containsKey(complement)) {
                cnt += freq.get(complement);
            }

            // Increment the frequency of arr[i]
            freq.put(arr[i], freq.getOrDefault(arr[i], 0) + 1);
        }
        return cnt;
    }
}
