package main.java.org.anup.array;

import java.util.Arrays;

// Program to left rotate the elements of an array by specified num of times.
public class RotateLeft {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int num = 2 ;

       int[] ans = rotateLeftByNumV1(arr, num);
      // int[] ans = rotateLeftByNumV2(arr, num);
        System.out.println(Arrays.toString(ans));
    }

    private static int[] rotateLeftByNumV2(int[] arr, int num) {
        int len = arr.length;
        int[] leftRotatedArr = new int[len];

        for (int i = 0; i < len; i++) {
            int newPos = (i + num) % len;
            leftRotatedArr[i] = arr[newPos];
        }
        return leftRotatedArr;
    }

    private static int[] rotateLeftByNumV1(int[] arr, int num) {
        int len = arr.length;
        //Rotate the given array by n times toward left
        for (int i = 0; i < num; i++) {
            int first, j;
            first = arr[0];
            for (j = 0; j < len-1; j++) {
                //Shift element of array by one
                arr[j] = arr[j+1];
            }
            arr[j] = first;
        }
        return arr;
    }
}
