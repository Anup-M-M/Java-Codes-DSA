package main.java.org.anup;

import java.util.Arrays;

public class SmallestElement {
    public static void main(String[] args) {
        int[] arr = {4, 2, 7, 1, 5, 3, 6};

        int smalestElement = Arrays.stream(arr)
                .sorted()
                .skip(2)
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("Arrays has fewer elements"));

        System.out.println(smalestElement);
    }
}
