package main.java.org.anup.array;

import java.util.*;

public class DuplicateElement {
    public static void main(String[] args) {
        int [] arr = new int [] {1, 2, 3, 4, 2, 3, 7, 8, 3, 8,3, 3};

          printDuplicateElementV1(arr);

         //printDuplicateElementV2(arr);

         /*List<Integer> list = findDuplicatesByList(arr);
           System.out.println(list);*/

        // printDuplicateElementByHashMap(arr);
        // printsDuplicateElementsWithSet(arr);
    }

    public static List<Integer> findDuplicatesByList(int[] nums){
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }
            else{
                i++;
            }
        }

        List<Integer> ans=new ArrayList<>();
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1){
                ans.add(nums[j]);
            }
        }
        return ans;

    }
    static void swap(int[] nums,int i,int correct){
        int temp=nums[i];
        nums[i]=nums[correct];
        nums[correct]=temp;
    }


    private static void printDuplicateElementV2(int[] arr) {
        int count;
        for (int i = 0; i < arr.length - 1; i++) {
            count = 1;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[i] == arr[j]){
                    count++;
                    arr[j] = 0;
                }
            }
            if(count > 1 && arr[i] != 0){
                System.out.println(arr[i] + " elements present at " + count + " times.");
            }

        }
    }

    private static void printDuplicateElementByHashMap(int[] arr) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
//            if(freqMap.containsKey(arr[i]))
//                freqMap.put(arr[i], freqMap.get(arr[i])+1);
//            else
//                freqMap.put(arr[i], 1);

            //it gives value associated with a given key, or return a default value if the key is not present in the map
            freqMap.put(arr[i], freqMap.getOrDefault(arr[i], 0)+1);
        }
        for(Map.Entry<Integer,Integer> entry : freqMap.entrySet()){
            if(entry.getValue()>1)
                System.out.println(entry.getKey());
        }
    }

    private static void printsDuplicateElementsWithSet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> duplicateElements = new HashSet<>();

        for (int n : arr) {
            if(!set.add(n)) {
                duplicateElements.add(n);
            }
        }
        System.out.println(duplicateElements);
    }

    private static void printDuplicateElementV1(int[] array) {

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicate = false;

            // Check if the element was already printed as a duplicate
            for (int k = 0; k < i; k++) {
                if (array[i] == array[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not already marked as duplicate, check for duplicates
            if (!isDuplicate) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        System.out.println(array[i]);
                        break;
                    }
                }
            }
        }
    }
}
