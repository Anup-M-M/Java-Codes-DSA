package main.java.org.anup.array;

// Java Program to Print each element and its index in an array.
public class CountArray {
    public static void main(String[] args) {
        int[] arr = new int [] {1, 2, 3, 4, 5};
        int count = 0;
        for(int i : arr){
            System.out.println("element is " + i + " at index " + count++);
        }
        System.out.println(count);
    }
}
