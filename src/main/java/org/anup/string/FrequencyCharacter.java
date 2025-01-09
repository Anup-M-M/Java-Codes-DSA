package main.java.org.anup.string;

import java.util.HashMap;
import java.util.Map;

public class FrequencyCharacter {
    public static void main(String[] args) {
        String str = "Picture perfect";

        char[] charArray = str.toLowerCase().toCharArray();

//        printFrequencyCharacterV1(str, charArray);

//        printFrequencyCharacterV2(str, charArray);

        printFrequencyCharacterV3(str);

//        printFrequencyCharacterByHashMap(str, charArray);

    }

    private static void printFrequencyCharacterByHashMap(String str, char[] charArray) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : charArray)
            if(c != ' ')
            //getOrDefault(Object key, V defaultValue) method is used to get the value mapped with specified key.
            // If no value is mapped with the provided key then the default value is returned.
                freqMap.put(c, freqMap.getOrDefault(c, 0)+1);

        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()){
                System.out.println(entry.getKey() + " : "+ entry.getValue());
        }

     }

    private static void printFrequencyCharacterV3(String str) {
         str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            boolean isDuplicate = false;
            int count = 1;
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
                        count++;
                    }
                }
                    System.out.println(str.charAt(i) + " : "+ count);
            }

        }
    }


    private static void printFrequencyCharacterV2(String str, char[] charArray) {
        int[] freq = new int[str.length()];
        for(int i = 0; i <str.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (charArray[i] == charArray[j]) {
                    freq[i]++;

                    //Set string[j] to 0 to avoid printing visited character
                    charArray[j] = '0';
                }
            }
        }

        //Displays the each character and their corresponding frequency
        System.out.println("Characters and their corresponding frequencies");
        for(int i = 0; i <freq.length; i++) {
            if(charArray[i] != ' ' && charArray[i] != '0')
                System.out.println(charArray[i] + "-" + freq[i]);
        }
    }


    private static void printFrequencyCharacterV1(String str, char[] charArray) {
        for (int i = 0; i < str.length()-1; i++) {
            int count = 1;
            for (int j = i+1; j < str.length(); j++) {
                if(charArray[i] == charArray[j]){
                    count++;
                    // Set charArray[j] to 0 to avoid printing visited character
                    charArray[j] = '0';
                }
            }
            if (charArray[i] != ' ' && charArray[i] != '0'){
                System.out.println(charArray[i] + " : "+ count);
            }
        }
    }
}
