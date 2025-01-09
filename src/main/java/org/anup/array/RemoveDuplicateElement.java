package main.java.org.anup.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        int[] result = removeDuplicates(arr);
      //  int[] result = removeDuplicatesBySet(arr);

        System.out.println(Arrays.toString(result));
    }

    private static int[] removeDuplicates(int[] arr) {
        Arrays.sort(arr);

        // Temporary array to store unique elements
        int[] temp = new int[arr.length];
/*        int j = 0;

        // Traverse the sorted array
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }

        // Add the last element
        temp[j++] = arr[arr.length - 1];*/

        int j = 1;
        // Add the first element
        temp[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1])
                temp[j++] = arr[i];
        }

        // Create the result array with the correct size
        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    private static int[] removeDuplicatesBySet(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        // Convert set back to array
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }
}
