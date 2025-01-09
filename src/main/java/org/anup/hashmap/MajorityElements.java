package main.java.org.anup.hashmap;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class MajorityElements {
    public static void main(String[] args) {
        int[] arr = {2,2,3,6,6,6,2,2,8,2,2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is : " +ans);
    }

    //Time Complexity : O(n), as we only loop iterate over the array twice sequentially (not nested).
    //Space Complexity : O(n), because we use a hash map to store the array elements and their frequency, needing space that grows linearly with the input size.
    private static int majorityElement(int[] arr) {
        HashMap<Integer,Integer> freqMap = new HashMap<>();
        //storing the elements with its occurrence
        for (int i = 0; i < arr.length; i++) {
            int value = freqMap.getOrDefault(arr[i],0);
            freqMap.put(arr[i], value+1);
        }

        //searching for the majority element
        for (Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            if (entry.getValue() > (arr.length / 2))
                return entry.getKey();
        }
        return -1;
    }
}
