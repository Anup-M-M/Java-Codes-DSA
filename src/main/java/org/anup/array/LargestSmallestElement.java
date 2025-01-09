package main.java.org.anup.array;

import java.util.Arrays;

public class LargestSmallestElement {
    public static void main(String[] args) {
        int arr[] = {100, 1, 25, 11, 7, 75, 56};

        int largest = getLargestElement(arr);
        int smallest = getSmallestElement(arr);
        System.out.println(largest + " - "+ smallest);
    }

    private static int getLargestElement(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max)
                max = arr[i];
        }
        return max;
    }

    private static int getSmallestElement(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min)
                min = arr[i];
        }
        return min;
    }
}
