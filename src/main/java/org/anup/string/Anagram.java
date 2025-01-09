package main.java.org.anup.string;

import java.util.Arrays;

// Two Strings are called the anagram if they contain the same characters.
// However, the order or sequence of the characters can be different.
public class Anagram {
    public static void main(String[] args) {
        String str1 = "Listen";
        String str2 = "Silent";

        boolean bol = areAnagrams(str1, str2);
        System.out.println(bol);
    }

    private static boolean areAnagrams(String str1, String str2) {
        // Remove spaces and convert strings to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s","").toLowerCase();

        // Check if lengths are the same
        if(str1.length() != str2.length())
            return false;
        else {
            // Convert strings to char arrays and sort them
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

//            for (int i = 0; i < charArray1.length; i++) {
//                if (charArray1[i] != charArray2[i]) {
//                    return false; // Return false if any character doesn't match
//                }
//            }
//            return true;

            return  Arrays.equals(charArray1,charArray2);
        }
    }
}
