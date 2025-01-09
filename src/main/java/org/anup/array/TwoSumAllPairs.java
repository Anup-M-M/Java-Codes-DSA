package main.java.org.anup.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


public class TwoSumAllPairs {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15, 1, 8, 7};
        int target = 9;
        //List<List<Integer>> pairs = findAllPairsV1(nums, target);
        List<List<Integer>> pairs = findAllPairsByHashMap(nums, target);
        System.out.println("All Pairs: " + pairs);
    }

    public static List<List<Integer>> findAllPairsV1(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        // Iterate through all pairs (i, j) where i < j
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result.add(Arrays.asList(i, j));
                }
            }
        }

        return result;
    }

    public static List<List<Integer>> findAllPairsByHashMap(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        HashMap<Integer, List<Integer>> indexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If the complement exists in the map, add all pairs
            if (indexMap.containsKey(complement)) {
                for (int index : indexMap.get(complement)) {
                    result.add(Arrays.asList(index, i));
                }
            }

            // Add the current number to the map
            indexMap.putIfAbsent(nums[i], new ArrayList<>());
            System.out.println(indexMap);

            System.out.println("===========");

            indexMap.get(nums[i]).add(i);
            System.out.println(indexMap);
        }

        return result;
    }
}

