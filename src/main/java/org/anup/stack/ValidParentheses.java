package main.java.org.anup.stack;

import java.util.Stack;

//leetCode 20th question
//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//An input string is valid if:
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
public class ValidParentheses {
    public static void main(String[] args) {
        // Test cases
        System.out.println(isValidParentheses("()")); // true
        System.out.println(isValidParentheses("()[]{}")); // true
        System.out.println(isValidParentheses("(]")); // false
        System.out.println(isValidParentheses("([)]")); // false
        System.out.println(isValidParentheses("{[]}")); // true
    }

    //O(n) time complexity and O(n) space complexity, where n is the length of the string.
    private static boolean isValidParentheses(String str) {
        // Stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char ch : str.toCharArray()) {
            // Push opening brackets onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // Check for matching closing brackets
            else if (ch == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (ch == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else if (ch == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
            // Invalid case
            else {
                return false;
            }
        }

        // Check if the stack is empty at the end
        return stack.isEmpty();
    }
}
