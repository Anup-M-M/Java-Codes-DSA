package main.java.org.anup.array;

import java.util.Arrays;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
       // pushZerosToEndV1(arr);

        //two pointer
        pushZerosToEndV2(arr);
    }

    //Two Pointer approch :
        // First Pointer (i): This pointer iterates through each element of the array.
        //Second Pointer (index): This pointer keeps track of the position where the next non-zero element should be placed.
    //Time Complexity: O(n), as we are traversing the array only once.
    //Auxiliary Space: O(1)
    private static void pushZerosToEndV2(int[] arr) {
        // Pointer to track the position for next non-zero element
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            // If the current element is non-zero
            if (arr[i] != 0) {
                // Swap the current element with the 0 at index 'j'
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                // Move 'j' pointer to the next position
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Time complexity: O(n), as we are traversing the array three times.
    //Auxiliary Space : O(n), as we are using a temp[] array to move all the zeros.
    private static void pushZerosToEndV1(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];

        // To keep track of the index in temp[] array
        int j = 0;

        // Copy non-zero elements to temp[]
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0)
                temp[j++] = arr[i];
        }

        // Fill remaining positions in temp[] with zeros
        while (j < n)
            temp[j++] = 0;

        // Copy all the elements from temp[] to arr[]
        for (int i = 0; i < n; i++)
            arr[i] = temp[i];

        System.out.println(Arrays.toString(arr));
    }
}
