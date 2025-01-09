package main.java.org.anup.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

// leetcode - 1209
//Remove All Adjacent Duplicates in String by k times
public class RemoveAdjacentDuplicatesBykTimes {

    //Time Complexity: O(n) : Each character is processed once, and reconstructing the result involves at most n operations.
    //Space Complexity: O(n): //The stack can hold up to n entries in the worst case.
    public static String removeDuplicatesByStack(String s, int k) {
        // Stack to store pairs of characters and their counts
        Stack<Pair> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // If the stack is not empty and the top character matches the current character
            if (!stack.isEmpty() && stack.peek().character == ch) {
                stack.peek().count++;
                // If the count reaches 'k', pop the stack
                if (stack.peek().count == k) {
                    stack.pop();
                }
            } else {
                // Otherwise, push the character with a count of 1
                stack.push(new Pair(ch, 1));
            }
        }

        // Reconstruct the string from the stack
        StringBuilder result = new StringBuilder();
        for (Pair p : stack) {
            // Loop to append the character `count` times
            for (int i = 0; i < p.count; i++) {
                result.append(p.character);
            }
        }

        return result.toString();
    }
    // Helper class to store a character and its count
    private static class Pair {
        char character;
        int count;

        Pair(char character, int count) {
            this.character = character;
            this.count = count;
        }
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicatesByStack("deeedbbcccbdaa", 3)); // Output: "aa"
        System.out.println(removeDuplicatesByStack("pbbcggttciiippooaaisa", 2)); // Output: "psa"
        System.out.println(removeDuplicatesByStack("abcd", 2)); // Output: "abcd"
        System.out.println(removeDuplicatesByStack ("abcd", 2)); // Output: "abcd"
    }


}
