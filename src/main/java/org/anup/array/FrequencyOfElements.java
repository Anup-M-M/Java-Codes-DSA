package main.java.org.anup.array;

import java.util.HashMap;
import java.util.Map;

// Program to find the frequency of each element in the array
public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr ={1,1,2,3,4,2, 2, 6};

     //   getFrequencyOfElementsV1(arr);
        getFrequencyOfDuplicateElementsV2(arr);
        getFrequencyOfElementsByHashMap(arr);
    }

    private static void getFrequencyOfDuplicateElementsV2(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            boolean isPrinted = false;
            int count = 1;
            // Check if the element was already printed as a duplicate
            for(int k = 0; k < i ; k++) {
                if(arr[i] == arr[k]) {
                    isPrinted = true;
                    break;
                }
            }

            if (!isPrinted) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " " + count);
            }
        }
    }

    private static void getFrequencyOfElementsByHashMap(int[] arr) {
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

    private static void getFrequencyOfElementsV1(int[] arr) {
        int[] frqArr = new int[arr.length];
        int visited = -1;
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j] && arr[i] != -1){
                    count++;
                    //Set arr[j] to -1 to avoid printing visited character
                    arr[j] = -1;
                }
            }
            frqArr[i] = count;
        }

        //Displays the frequency of each element present in array
        System.out.println(" Element | Frequency");
        System.out.println("---------------------------------------");
        for(int i = 0; i < frqArr.length; i++){
            if(arr[i] != visited)
                System.out.println("    " + arr[i] + "    |    " + frqArr[i]);
        }
    }
}
