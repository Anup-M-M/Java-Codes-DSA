package main.java.org.anup.array;

public class FindMissingNumber {

    public static int findMissingNumber(int[] arr, int n) {
        // Calculate the expected sum of numbers from 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum of array elements
        int actualSum = 0;
        for (int num : arr) {
            actualSum += num;
        }

        // The missing number is the difference between expected and actual sums
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 4, 2, 6};
        int n = 6;

        int missingNumber = findMissingNumber(arr, n);
        System.out.println("The missing number is: " + missingNumber);
    }
}
