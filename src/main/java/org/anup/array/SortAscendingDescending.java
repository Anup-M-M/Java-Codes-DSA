package main.java.org.anup.array;

import java.util.Arrays;

public class SortAscendingDescending {
    public static void main(String[] args) {
        int[] arr = {5,3,8,7,1,10,2};

        int[] sortedInAscending = sortInAscending(arr);
        System.out.println(Arrays.toString(sortedInAscending));
        int[] sortedInDescending = sortInDescending(arr);
        System.out.println(Arrays.toString(sortedInDescending));
    }

    private static int[] sortInDescending(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    private static int[] sortInAscending(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
