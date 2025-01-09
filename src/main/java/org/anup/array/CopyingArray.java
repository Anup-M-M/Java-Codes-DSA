package main.java.org.anup.array;

import java.util.Arrays;

// Program to copy all elements of one array into another array
public class CopyingArray {

    public static void main(String[] args) {

        int[] array1 = {1,2,4,3,5};

        int[] array3 = array1;

        System.out.println(Arrays.toString(array3));

        int[] array2 = new int[array1.length];

        for(int i = 0; i<array1.length; i++){
            array2[i]= array1[i];
        }


        // or using array copy method
       System.arraycopy(array1, 0, array2, 0, array1.length);

        System.out.println(Arrays.toString(array1));

        System.out.println(Arrays.toString(array2));

       // System.out.println(Arrays.compare(array1, array2));
    }
}
