package main.java.org.anup.interviews;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MergeArray {
    public static void main(String[] args) {

        int[] arr1 = {1,3,5};
        int[] arr2 = {2,4,6};

        int[] mergeArray = new int[arr1.length + arr2.length];

        Integer[] merge= Stream.concat(Arrays.stream(arr1).boxed(), Arrays.stream(arr2).boxed()).toArray(Integer[]::new);

        mergeArray = IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).toArray();

        System.out.println(Arrays.toString(mergeArray));
    }
}
