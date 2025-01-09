package main.java.org.anup.array;

import java.util.Arrays;

//Reverse an array and store it in a second array
public class ReverseArray {
    public static void main(String[] args) {
        // Original array
        int[] firstArray = {1, 2, 3, 4, 5};

        // Create a second array of the same length
        int[] secondArray = new int[firstArray.length];

        // Reverse the first array and store it in the second array
        for (int i = 0; i < firstArray.length; i++) {
            secondArray[i] = firstArray[firstArray.length - 1 - i];
        }

        System.out.println(Arrays.toString(firstArray));

        System.out.println(Arrays.toString(secondArray));


    }
}
