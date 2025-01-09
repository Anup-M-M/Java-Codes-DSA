package main.java.org.anup.string;

import java.util.HashSet;
import java.util.Set;

public class PermuteString {

    public static void main(String[] args)
    {
        String str = "ABC";
        int len = str.length();
        System.out.println("All the permutations of the string are: ");
        generatePermutationV1(str, 0, len);
     //   printPermutations(str, "");
    }

    public static String swapString(String a, int x, int y) {
        char[] b = a.toCharArray();
        char ch;
        ch = b[x];
        b[x] = b[y];
        b[y] = ch;
        return String.valueOf(b);
    }

    //Function for generating different permutations of the string
    public static void generatePermutationV1(String str, int start, int end)
    {
        //Prints the permutations
        if (start == end-1)
            System.out.println(str);
        else
        {
            for (int i = start; i < end; i++)
            {
                //Swapping the string by fixing a character
                str = swapString(str,start,i);
                //Recursively calling function generatePermutation() for rest of the characters
                generatePermutationV1(str,start+1,end);
                //Backtracking and swapping the characters again.
                str = swapString(str,start,i);
            }
        }
    }

    // To remove the duplicate permutation, if given string has same chars.
    public static void printPermutations(String str, String prefix) {
        int n = str.length();
        if (n == 0) {
            System.out.println(prefix);  // Base case: when no characters are left
        } else {
            Set<Character> appeared = new HashSet<>();  // To avoid duplicates
            for (int i = 0; i < n; i++) {
                char ch = str.charAt(i);
                if (!appeared.contains(ch)) {  // Check for duplicate characters
                    appeared.add(ch);
                    String rem = str.substring(0, i) + str.substring(i + 1);
                    printPermutations(rem, prefix + ch);
                }
            }
        }
    }
}





