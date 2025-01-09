package main.java.org.anup.stack;

import java.util.Stack;

//leetcode - 844
//Given two strings s and t, return true if they are equal when both are typed into empty text editors. '#' means a backspace character.
public class BackspaceStringCompare {
    public static void main(String[] args) {
        //System.out.println(backspaceCompareByTwoPointer("ab#c", "ad#c")); // true
        System.out.println(backspaceCompare("ab#c", "ad#c")); // true

        //System.out.println(backspaceCompareByTwoPointer("ab##", "c#d#")); // true
        //System.out.println(backspaceCompare("ab##", "c#d#")); // true

    }

    //By Stack
    public static boolean backspaceCompare(String s, String t) {
        return buildString(s).equals(buildString(t));
    }

    //Time Complexity: O(n + m), where n and m are the lengths of the two strings.
    //Space Complexity: O(n + m) due to stack usage.
    private static String buildString(String str){

        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()){
            if( ch != '#'){
                stack.push(ch);
            } else if (!stack.empty()) {
                stack.pop();  // Backspace: remove the last character
            }
        }


        System.out.println(stack.toString());

        // Convert stack to string
        StringBuilder result = new StringBuilder();
        for (char ch : stack) {
            result.append(ch);
        }
        return result.toString();
    }

    // By Two Pointer Approch
    //Time Complexity: O(n + m).
    //Space Complexity: O(1), as no additional data structures are used.
    public static boolean backspaceCompareByTwoPointer(String s, String t) {
        int i = s.length() - 1, j = t.length() - 1; // Start from the end
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) {
            // Process string `s`
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    skipS++;
                    i--;
                } else if (skipS > 0) {
                    skipS--;
                    i--;
                } else {
                    break;
                }
            }

            // Process string `t`
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    skipT++;
                    j--;
                } else if (skipT > 0) {
                    skipT--;
                    j--;
                } else {
                    break;
                }
            }

            // Compare characters
            if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) {
                return false;
            }

            // Check if one string has characters left (One string is finished, but the other isn't)
            if ((i >= 0) != (j >= 0)) {
                return false;
            }

            i--;
            j--;
        }

        return true;
    }
}
