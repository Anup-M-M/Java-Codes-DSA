package main.java.org.anup.string;

// find all subsets of a string

import java.util.Arrays;

// Subset of a string is the character or the group of characters that are present inside the string.
public class AllSubsetsOfString {

    public static void main(String[] args) {
        String str = "FUN";
        int len = str.length();
        int temp = 0;

        //Total possible subsets for string of size n is n*(n+1)/2
        String[] arr = new String[len*(len+1)/2];

        for(int i = 0; i < len; i++) {
            for(int j = i; j < len; j++) {
                arr[temp] = str.substring(i, j+1);
                temp++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
