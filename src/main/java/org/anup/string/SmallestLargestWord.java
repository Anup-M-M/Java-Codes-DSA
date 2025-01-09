package main.java.org.anup.string;

// Java Program to find the largest and smallest word in a string.

import java.util.Arrays;
import java.util.HashMap;

public class SmallestLargestWord {
    public static void main(String[] args) {
        String string = "Hardships often prepare ordinary people for an extraordinary destiny";

        getSmallestLargestWord(string);

    }

    private static void getSmallestLargestWord(String string) {
        String  largestWord = "", smallestWord = "";
        String[] words = string.split(" ");
        System.out.println(words);

        smallestWord = largestWord = words[0];

        for (int i = 0; i < words.length; i++) {
            if (largestWord.length() < words[i].length()){
                largestWord = words[i];
            }

            if (smallestWord.length() > words[i].length()){
                smallestWord = words[i];
            }
        }
        System.out.println(largestWord + " : " + " of length : " + largestWord.length());
        System.out.println(smallestWord + " : " + " of length : " + smallestWord.length());
    }
}
