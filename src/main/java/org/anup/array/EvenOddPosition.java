package main.java.org.anup.array;

public class EvenOddPosition {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        printEvenPositionElement(arr);
        System.out.println();
        printOddPositionElement(arr);
    }

    private static void printOddPositionElement(int[] arr) {
        System.out.print("Elements of given array present on Odd position : ");
        for (int i = 0; i < arr.length ; i = i+2) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void printEvenPositionElement(int[] arr) {
        System.out.print("Elements of given array present on even position : ");
        for (int i = 1; i < arr.length ; i = i+2) {
            System.out.print(arr[i] + " ");
        }
    }
}
