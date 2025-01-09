package main.java.org.anup.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// GFG Problem
// Write java code return sub array that match the given sum
public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int[] arr = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
       // List<int[]> result = subarraySumV1(arr, n, sum);

        List<int[]> result = subarraySumV2(arr, sum);

        for (int[] subarray : result) {
            System.out.println(Arrays.toString(subarray));
        }

        List<List<Integer>> subarrays = findSubarrayWithSum(arr, sum);
        subarrays.forEach(System.out::println);
    }

    //Sliding Window Technique (For Non-Negative Numbers)
    //Logic:
        //Maintain a window of elements whose sum is the target.
        //Use two pointers, start and end, to expand or shrink the window based on the sum.
        //If the sum exceeds the target, move the start pointer forward. If it is less, move the end pointer forward.
    //Time Complexity: O(n) (Each element is processed at most twice).
    //Space Complexity: O(k) (To store the subarray results where k is the number of subarrays).
    public static List<int[]> subarraySumV2(int[] arr, int target) {
        List<int[]> result = new ArrayList<>();

        for (int start = 0; start < arr.length; start++) {
            int currentSum = 0;
            for (int end = start; end < arr.length; end++) {
                currentSum += arr[end];
                if (currentSum == target) {
                    result.add(Arrays.copyOfRange(arr, start, end + 1));
                }
            }
        }
        return result;
    }

    //Brute force approch
    //Time Complexity: O(n^2) Two nested loops to compute all subarrays.
    //Space Complexity: O(k) To store the subarrays
    private static List<int[]> subarraySumV1(int[] arr, int n, int sum) {
        List<int[]> result = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum == sum) {
                    result.add(Arrays.copyOfRange(arr, i, j + 1));
                }
            }
        }
        return result;
    }

    public static List<List<Integer>> findSubarrayWithSum(int[] arr, int target) {
        List<List<Integer>> result = new ArrayList<>();

        for (int start = 0; start < arr.length; start++) {
            int currentSum = 0;
            List<Integer> subarray = new ArrayList<>();

            for (int end = start; end < arr.length; end++) {
                currentSum += arr[end];
                subarray.add(arr[end]);

                if (currentSum == target) {
                    result.add(new ArrayList<>(subarray));
                    break;
                }
            }
        }
        return result;
    }
}
