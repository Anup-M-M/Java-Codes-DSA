package main.java.org.anup.number;

import java.util.Scanner;

// Print the smallest number whose product of digit is number
// Given a positive integer n, return a string representing the smallest positive integer
// such that the product of its digits is equal to n, or "-1" if no such number exists.

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //input : 125, output : 555
        int n = sc.nextInt();
        System.out.println(smallestNum(n));
    }

    private static int smallestNum(int n) {
        String ans = "";
        for (int i = 9; i >= 2; i--) {
            while(n % i == 0){
                n = n / i;
                ans = i + ans ;
            }
        }
        if(n != 1)
            return -1;
        else
            return Integer.parseInt(ans);
    }
}
