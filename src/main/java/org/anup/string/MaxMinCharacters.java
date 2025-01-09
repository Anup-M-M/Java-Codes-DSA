package main.java.org.anup.string;

import java.util.HashMap;
import java.util.Map;

//Java Program to find maximum and minimum occurring character in a string.
public class MaxMinCharacters {
    public static void main(String[] args) {
        String str = "grass is greener on the other side";

        //getMaxMinCharactersv1(str);

        getMaxMinCharactersV2(str);

       // getMaxMinCharactersByHashMap(str);
    }

    private static void getMaxMinCharactersByHashMap(String str) {

        str = str.replaceAll("\\s", "").toLowerCase();

        // Create a HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Calculate the frequency of each character
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Initialize min and max frequency variables
        int minFrequency = Integer.MAX_VALUE;
        int maxFrequency = Integer.MIN_VALUE;
        char minChar = ' ';
        char maxChar = ' ';

        // Iterate over the map to find min and max frequency characters
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            int frequency = entry.getValue();
            char character = entry.getKey();

            if (frequency < minFrequency) {
                minFrequency = frequency;
                minChar = character;
            }

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                maxChar = character;
            }
        }

        // Output the results
        System.out.println("Character with minimum occurrence: '" + minChar + "' occurs " + minFrequency + " times.");
        System.out.println("Character with maximum occurrence: '" + maxChar + "' occurs " + maxFrequency + " times.");

    }

    private static void getMaxMinCharactersV2(String str) {
        str = str.toLowerCase();
        int[] freq = new int[str.length()];
        // Initialize min and max frequency variables
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        char minChar = ' ';
        char maxChar = ' ';
        for (int i = 0; i < str.length(); i++) {
            boolean isDuplicate = false;
            freq[i] = 1;
            // Check if the element was already printed as a duplicate
            for (int k = 0; k < i; k++) {
                if(str.charAt(i) == str.charAt(k) && str.charAt(i) != ' '){
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate && str.charAt(i) != ' ') {
                for (int j = i + 1; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        freq[i]++;
                    }
                }
            }
        }

        for (int i = 0; i < freq.length; i++) {
            //If min is greater than frequency of a character
            //then, store frequency in min and corresponding character in minChar
            if(min > freq[i]  && freq[i] != '0') {
                min = freq[i];
                minChar = str.charAt(i);
            }
            //If max is less than frequency of a character
            //then, store frequency in max and corresponding character in maxChar
            if(max < freq[i]) {
                max = freq[i];
                maxChar = str.charAt(i);
            }
        }
        System.out.println("Minimum occurring character: " + minChar);
        System.out.println("Maximum occurring character: " + maxChar);
    }

    private static void getMaxMinCharactersv1(String str) {
        int[] freq = new int[str.length()];
        int min , max;
        char minChar = str.charAt(0), maxChar = str.charAt(0);
        //Converts given string into character array
        char[] string = str.toCharArray();

        for(int i = 0; i < str.length(); i++){
            freq[i] = 1;
            for (int j = i + 1; j < str.length(); j++){
                if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
                    freq[i]++;
                    string[j]='0';
                }
            }
        }

        //Determine minimum and maximum occurring characters
        min = max = freq[0];
        for (int i = 0; i < freq.length; i++) {
            //If min is greater than frequency of a character
            //then, store frequency in min and corresponding character in minChar
            if(min > freq[i]  && freq[i] != '0') {
                min = freq[i];
                minChar = string[i];
            }
            //If max is less than frequency of a character
            //then, store frequency in max and corresponding character in maxChar
            if(max < freq[i]) {
                max = freq[i];
                maxChar = string[i];
            }
        }
        System.out.println("Minimum occurring character: " + minChar);
        System.out.println("Maximum occurring character: " + maxChar);
    }
}
