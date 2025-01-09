package main.java.org.anup.string;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// find the duplicate words in a string
public class DuplicateWord {
    public static void main(String[] args) {
        String string = "Big black bug bit a big black dog on his big black nose";

     //   duplicateWordV1(string);

        duplicateWordV2(string);

     //   duplicateWordByHashMap(string);

    }

//      Time Complexity: O(n), where n is the number of words in the input string.
//      Space Complexity: O(k), where k is the number of unique words in the input string.
    private static void duplicateWordByHashMap(String string) {

        //Converts the string into lowercase for case-insensitive comparison
        string = string.toLowerCase();

        String[] words = string.split(" ");

        // Create a HashMap to store word frequencies
        HashMap<String, Integer> wordCountMap = new HashMap<>();

        // Iterate over the array of words
        for (String word : words) {
            //it gives value associated with a given key, or return a default value if the key is not present in the map
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        // Iterate over the HashMap to find words with a count greater than 1
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }

    private static void duplicateWordV2(String string) {
        //Converts the string into lowercase for case-insensitive comparison
        string = string.toLowerCase();
        String[] words = string.split(" ");

        for (int i = 0; i < words.length; i++) {
            boolean isDuplicate = false;

            for (int k = 0; k < i; k++) {
                if (words[i].equals(words[k])) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                for (int j = i + 1; j < words.length; j++) {
                    if (words[i].equals(words[j])) {
                        System.out.println( " Duplicate words : "+words[i]);
                        break;
                    }
                }
            }

        }

    }

    private static void duplicateWordV1(String string) {

        int count;
        //Converts the string into lowercase for case-insensitive comparison
        string = string.toLowerCase();

        String[] words = string.split(" ");

        System.out.println(Arrays.toString(words));

        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    //Set words[j] to 0 to avoid printing visited word
                    words[j] = "0";
                }
            }

            if (count > 1 && !words[i].equals("0"))
                System.out.println(words[i] + " repeats : " + count);
        }
    }
}
