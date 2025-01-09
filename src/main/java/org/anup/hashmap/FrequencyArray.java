package main.java.org.anup.hashmap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class FrequencyArray {

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(1);
        arr.add(2);
        arr.add(8);
        arr.add(3);
        arr.add(2);
        arr.add(2);
        arr.add(2);
        arr.add(5);
        arr.add(1);

        getFrequencyOfElementsByHashMapV2(arr);

        int[] array = new int [] {1, 2, 8, 3, 2, 2, 2, 5, 1};

       // getFrequencyOfElementsByHashMapV1(array);

    }

    private static void getFrequencyOfElementsByHashMapV2(ArrayList<Integer> arrList) {

        ArrayList<Integer> count = new ArrayList<>();

        System.out.println(arrList);

        for(int i=0;i<arrList.size();i++) {
            int elt = arrList.get(i);

            if(!count.contains(elt)) {
                int freq = Collections.frequency(arrList, elt);
                System.out.println("Element "+elt+" occurs "+freq+" times");
                count.add(elt);
            }
        }
    }

    private static void getFrequencyOfElementsByHashMapV1(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
//            if(freqMap.containsKey(arr[i]))
//                freqMap.put(arr[i], freqMap.get(arr[i])+1);
//            else
//                freqMap.put(arr[i], 1);

            //it gives value associated with a given key, or return a default value if the key is not present in the map
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0)+1);
        }

        for (Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            System.out.println(entry.getKey() + " : "+ entry.getValue());
        }
    }

}
