package main.java.org.anup.number;

// Fibonacci series is a sequence of numbers where each number is the sum of the two preceding ones,
// starting with 0 and 1
public class FibonacciSeries {

    static int num1 = 1, num2=1, num3=0;

    public static void main(String[] args) {
        System.out.print(num1 + " "+ num2);
        int nums = 6;
//        printFibonacci(nums);
        printFibonacciByRecursionV1(nums-2);
    }

    private static void printFibonacciByRecursionV1(int nums) {
        if(nums>0){
            num3= num1+num2;
            num1=num2;
            num2=num3;

            System.out.print(" "+ num3);
            printFibonacciByRecursionV1(nums-1);
        }
    }

    private static void printFibonacci(int nums) {
        for (int i = 2; i <= nums ; i++) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(" "+ num3);
        }
    }
}
