package main.java.org.anup.hashmap;

import java.util.*;

public class DuplicateStringCollection {

    public static void main(String[] args) {

        String str = "Big black bug bit a big black dog on his big black nose";

        getDuplicateStringV1(str);

        getDuplicateStringV2(str);

    }

    private static void getDuplicateStringV2(String str) {
        String[] wordsArray = str.toLowerCase().split(" ");

        HashMap<String, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < wordsArray.length; i++) {
/*            if (freqMap.containsKey(wordsArray[i]))
                freqMap.put(wordsArray[i], freqMap.get(wordsArray[i])+1);
            else
                freqMap.put(wordsArray[i], 1);*/

            //it gives value associated with a given key, or return a default value if the key is not present in the map
            freqMap.put(wordsArray[i], freqMap.getOrDefault(wordsArray[i], 0)+1);
        }

        for (Map.Entry<String, Integer> entry : freqMap.entrySet()){
            if (entry.getValue() > 1)
                System.out.println(entry.getKey()+ " occurs "+entry.getValue()+" times");
        }
    }

    private static void getDuplicateStringV1(String str) {
        String[] wordsArray = str.toLowerCase().split(" ");

        ArrayList<String> duplicateList = new ArrayList<>();

        for(String word : wordsArray) {
            if(Collections.frequency(Arrays.asList(wordsArray), word) > 1 && !duplicateList.contains(word)) {
                System.out.println(word+ " occurs "+Collections.frequency(Arrays.asList(wordsArray), word)+" times");
                duplicateList.add(word);
            }
        }
    }

}

