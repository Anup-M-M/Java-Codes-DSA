package main.java.org.anup.array;

import java.util.Arrays;

public class RotateRight {
    public static void main(String[] args) {
        int arr[] =  new int [] {1, 2, 3, 4,5};
        int n = 2;

      //  int[] rightRotateArray = rotateRightByNumV1(arr, n);
        int[] rightRotateArray = rotateRightByNumV2(arr, n);
        System.out.println(Arrays.toString(rightRotateArray));
    }

    private static int[] rotateRightByNumV2(int[] arr, int n) {
        int len = arr.length;
        int[] rotatedArr = new int[len];

        for (int i = 0; i < len ; i++) {
            int newPos = (i + n) % len;
            rotatedArr[newPos] = arr[i];
        }
        return rotatedArr;
    }

    private static int[] rotateRightByNumV1(int[] arr, int num) {

        //Rotate the given array by n times toward right
        for (int i = 0; i < num; i++) {
            int last, j;
            last= arr[arr.length-1];
            for(j = arr.length-1; j > 0; j--){
                //Shift element of array by one
                arr[j] = arr[j-1];
            }
            //Last element of array will be added to the start of array.
            arr[0] = last;
        }
        return arr;
    }
}
