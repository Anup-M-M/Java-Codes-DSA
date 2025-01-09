package main.java.org.anup.array;

import java.util.Arrays;

public class MoveNegativeElementToStart {
    public static void main(String[] args) {

        int[] arr = { -12, 11, -13, -5, 6, -7, 5, -3, 11 };

        //pushNegativeElementToStartV1(arr);

        //maintain the orders positive elements only
        //pushNegativeElementToStartV2(arr);

        //maintain the orders all elements using temp array
        pushNegativeElementToStartV3(arr);

        //maintain the orders all elements
        //pushNegativeElementToStartV4(arr);

    }

    //Time Complexity: O(n) We traverse the array once to rearrange the elements.
    //Space Complexity: O(1)
    private static void pushNegativeElementToStartV4(int[] arr) {
        int n = arr.length;
        int insertPos = 0; // Tracks where the next negative number should go

        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                // Shift all positive elements from insertPos to i one step to the right
                int temp = arr[i];
                for (int j = i; j > insertPos; j--) {
                    arr[j] = arr[j - 1];
                }
                arr[insertPos] = temp; // Place the negative number at insertPos
                insertPos++; // Move the insertPos to the next slot
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    //Time Complexity: O(n) We traverse the array once to rearrange the elements.
    //Space Complexity: O(1)
    private static void pushNegativeElementToStartV3(int[] arr) {
        int n = arr.length;
        int posIndex = 0; // Tracks where the next negative number should go

        // Temporary array to store non-negative numbers to maintain their order
        int[] temp = new int[n];
        int tempIndex = 0;

        // First pass: Move all non-negative elements to the front
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr[posIndex] = arr[i];
                posIndex++;
            } else {
                temp[tempIndex++] = arr[i]; // Collect non-negatives in order
            }
        }

        // Second pass: Append the collected non-negative at the end
        for (int i = 0; i < tempIndex; i++) {
            arr[posIndex++] = temp[i];
        }

        System.out.println(Arrays.toString(arr));
    }

    //Time Complexity: O(n), n is number of elements in the input array.
    //Auxiliary Space: O(1)
    private static void pushNegativeElementToStartV2(int[] arr) {

        int n = arr.length;

        // find the index of last zero
        int end = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] < 0) {
                end = i;
                break;
            }
        }

        // Modifying the array by traversing from end-1 to 0
        for (int i = end - 1; i >= 0; i--) {
            // if element is a positive element,swap it with arr[end]
            if (arr[i] >= 0) {
                int temp = arr[i];
                arr[i] = arr[end];
                arr[end] = temp;
                end--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    private static void pushNegativeElementToStartV1(int[] arr) {
        int n = arr.length;

        int left = 0;
        int right = n-1;

        while (left <= right)
        {

            // Condition to check if the left and the right elements are negative
            if (arr[left] < 0 && arr[right] < 0)
                left++;

                // Condition to check if the left pointer element is positive and the right pointer element is negative
            else if (arr[left] > 0 && arr[right] < 0)
            {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

            // Condition to check if both the elements are positive
            else if (arr[left] > 0 && arr[right] > 0)
                right--;

            else
            {
                left++;
                right--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
