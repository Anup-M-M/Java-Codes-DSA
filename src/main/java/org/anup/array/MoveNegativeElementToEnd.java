package main.java.org.anup.array;

import java.util.Arrays;

public class MoveNegativeElementToEnd {
    public static void main(String[] args) {

        int[] arr = {1, -1, 3, 0, 2, -7, -5, 11, 6};

        //mainatin order of the positive elements only
        //pushNegativeElementToEndV1(arr);

        //mainatin order of the all elements using temp array
        //pushNegativeElementToEndV2(arr);

        //mainatin order of the all elements
        pushNegativeElementToEndV3(arr);

    }

    //Time Complexity: O(n) We traverse the array once to rearrange the elements.
    //Space Complexity: O(1)
    private static void pushNegativeElementToEndV3(int[] arr) {
        int n = arr.length;
        int insertPos = 0; // Points to the next position to place non-negative numbers

        // Traverse the array
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                // Shift all negative elements from insertPos to i one step to the right
                // Place the non-negative number at the current insertPos position
                int temp = arr[i];
                // Shift elements between insertPos and i to the right
                for (int j = i; j > insertPos; j--) {
                    arr[j] = arr[j - 1];
                }
                // Place the non-negative number at the correct position
                arr[insertPos] = temp;
                insertPos++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Time Complexity: O(n) We traverse the array once to rearrange the elements.
    //Space Complexity: O(1)
    private static void pushNegativeElementToEndV2(int[] arr) {
        int n = arr.length;
        int posIndex = 0; // Tracks where the next non-negative number should go

        // Temporary array to store negative numbers to maintain their order
        int[] temp = new int[n];
        int tempIndex = 0;

        // First pass: Move all non-negative elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] >= 0) {
                arr[posIndex] = arr[i];
                posIndex++;
            } else {
                temp[tempIndex++] = arr[i]; // Collect negatives in order
            }
        }

        // Second pass: Append the collected negatives at the end
        for (int i = 0; i < tempIndex; i++) {
            arr[posIndex++] = temp[i];
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void pushNegativeElementToEndV1(int[] arr) {
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= 0){
                //swap
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
