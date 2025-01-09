package main.java.org.anup.stack;

import java.util.Arrays;
import java.util.Stack;

// leetcode - 739
public class DailyTemp {

    public static int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>(); // Stack to store indices

        for (int i = 0; i < n; i++) {
            // Check if current temperature is greater than temperature at stack's top index
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int prevIndex = stack.pop();
                result[prevIndex] = i - prevIndex; // Calculate the difference
            }
            stack.push(i); // Push the current index
        }

        // Indices left in the stack will have 0 in the result array by default
        return result;
    }

    // Time Complexity : O(n^2)
    //Space Complexity: O(n) because we store the result for each day in an array
    public static int[] dailyTemperaturesbyBruteForce(int[] temperatures) {
        int n = temperatures.length;
        int[] result = new int[n];

        // For each day, check all subsequent days to find the next warmer day
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // If a warmer day is found
                if (temperatures[j] > temperatures[i]) {
                    result[i] = j - i; // Store the number of days to wait
                    break; // No need to check further once we find the warmer day
                }
            }
        }
        return result;
    }

    // Example Usage
    public static void main(String[] args) {
        int[] temperatures = {73, 74, 75, 71, 69, 72, 76, 73};
        //int[] result = DailyTemp.dailyTemperatures(temperatures);
        int[] result = DailyTemp.dailyTemperaturesbyBruteForce(temperatures);
        System.out.println(Arrays.toString(result));
    }
}
