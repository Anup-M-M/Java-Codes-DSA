package main.java.org.anup.bitmanipulation;

//The "Sum of Two Integers" problem on LeetCode (Problem #371) asks you to find the sum of two integers without using the + or - operators.
public class SumOfTwoInt {
    public static void main(String[] args) {
        int num1 = 3, num2 = 5;
        int sum = getSum(num1, num2);
        System.out.println(sum);
    }

    private static int getSum(int a, int b) {
        while (b != 0) {
            // XOR gives the sum of two bits without carrying the overflow
            int sum = a ^ b;
            // The AND operation gives the carry bits. If both bits are 1.
            // result of the AND operation is then left-shifted (<< 1) to move the carry to the correct position.
            int carry = (a & b) << 1;

            // Update a and b
            a = sum;
            b = carry;
        }

        return a;
    }
}
