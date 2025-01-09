package main.java.org.anup.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// find the duplicate characters in a string
public class DuplicateCharacters {
    public static void main(String[] args) {

        String str = "Great responsibility";

        duplicateCharactersV1(str);

       //duplicateCharactersV2(str);

        //counting Algo
        //duplicateCharactersV3(str);

        //duplicateCharactersByHashMap(str);

    }

    //Time Complexity: (O(n))
    //Space Complexity: (O(1))
    private static void duplicateCharactersV3(String s) {
        s= s.toLowerCase();
        int arr[]=new int[26]; // 0 0 0 0 -------- 0
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) != ' ')
            {
                int charValue=s.charAt(i);
                int arrayIndex=charValue-97;
                arr[arrayIndex]++; //arr[0]++;==1 ++ ==>2
               // System.out.println(s.charAt(i)+"----------->"+"char Value ="+charValue+" Array index " +arrayIndex);
            }
        }
        //System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>1)
            {
                char c = (char) (97+i);
                System.out.println("duplicate value = " +c +" repeats "+ arr[i] + " times");
            }
        }
    }

    //Time Complexity: (O(n^2))
    //Space Complexity: (O(1))
    private static void duplicateCharactersV2(String str) {

        for (int i = 0; i < str.length(); i++) {
            boolean isDuplicate = false;
            // Check if the element was already printed as a duplicate
            for (int k = 0; k < i; k++) {
                if(str.charAt(i) == str.charAt(k) && str.charAt(i) != ' '){
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate && str.charAt(i) != ' '){
                for (int j = i+1; j < str.length(); j++) {
                    if(str.charAt(i) == str.charAt(j)){
                        System.out.println(str.charAt(i));
                        break;
                    }
                }
            }

        }
    }

    //Time Complexity: (O(n^2))
    //Space Complexity: (O(n)) : uses an array characters of size n to store the characters of the string.
    private static void duplicateCharactersV1(String str) {
        char[] characters = str.toCharArray(); // Convert string to character array
        boolean[] visited = new boolean[256]; // To track visited characters (assuming ASCII)

        System.out.println("Duplicate characters in the string are:");

        for (int i = 0; i < characters.length; i++) {
            if (!visited[characters[i]]) { // If character is not already visited
                int count = 1;
                for (int j = i + 1; j < characters.length; j++) {
                    if (characters[i] == characters[j]) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println(characters[i] + " - " + count + " times");
                }
                visited[characters[i]] = true; // Mark character as visited
            }
        }
    }

//      Time Complexity: O(n), where n is the number of char in the input string.
//      Space Complexity: O(n), The algorithm uses a HashMap to store the frequency of each character. In the worst case, this could store up to n entries if all characters are unique.
                //It also uses an array chars of size n to store the characters of the string
    private static void duplicateCharactersByHashMap(String str) {
        // Convert the string to a char array and iterate over it
        char[] chars = str.toCharArray();
        System.out.println(chars);

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        for (char c : chars) {
            if (charCountMap.containsKey(c)) {
                // If the character is already in the map, increment its count
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // If it's not in the map, add it with a count of 1
                charCountMap.put(c, 1);
            }
        }

        // Iterate over the HashMap to find characters with a count greater than 1
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
    }
}