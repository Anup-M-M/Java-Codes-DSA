package main.java.org.anup.stack;

import java.util.Stack;

//leetcode - 1047
//Remove All Adjacent Duplicates In String
public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {
        String str = "abbaca";  // output = ca
        //String s = removeDuplicates(str);
        String s = removeDuplicatesByTwoPointers(str);
        System.out.println(s);
    }

    // Time Complexity : O(n)
    // Space COmplexity : O(n) - as the stack may store all characters in the worst case (if there are no adjacent duplicates).
    public static String removeDuplicates(String str) {

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()){
            if(!stack.empty() && ch == stack.peek()){
                stack.pop();
            }else
                stack.push(ch);
        }
        // Convert stack to string
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            System.out.println(ch);
            result.append(ch);
        }
        return result.toString();
    }

    //Time Complexity: O(n), each character is processed once.
    //Space Complexity: O(n) additional space char array.
    public static String removeDuplicatesByTwoPointers(String s) {
        char[] chars = s.toCharArray(); // Convert the string to a character array
        int pointer = 0; // This pointer will act as the stack's top

        for (int i = 0; i < chars.length; i++) {
            // If the current character matches the top of the stack, pop it
            if (pointer > 0 && chars[pointer - 1] == chars[i]) {
                pointer--; // Remove the duplicate
            } else {
                // Push the current character onto the stack
                chars[pointer] = chars[i];
                pointer++;
            }
        }

        // Construct the result string from the valid part of the array
        return new String(chars, 0, pointer);
    }
}
