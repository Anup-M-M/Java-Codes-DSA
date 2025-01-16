package main.java.org.anup.number;

// The n-th term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
//    F(n) = F(n - 1) + F(n - 2),
//    Where, F(1) = 1, F(2) = 1

//Provided N you have to find out the Nth Fibonacci Number
public class NthFibonacciNumber {
    public static void main(String[] args) {
        // Fibonacci sequence starts as: 0, 1, 1, 2, 3, 5, 8, 13, 21
        int nums = 3;
        int ans = printFibonacciByRecursion(nums);
        System.out.println(ans);
    }

    // Time Complexity : 2power(n) - n is number of nodes
    // Space complexity : O(n) - n is height of tree
     private static int printFibonacciByRecursion(int nums) {
        if (nums <= 1) return nums;
        return printFibonacciByRecursion(nums-1) + printFibonacciByRecursion(nums - 2);
    }
}
