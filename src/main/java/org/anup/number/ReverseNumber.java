package main.java.org.anup.number;

public class ReverseNumber {
    public static void main(String[] args) {
        int num= 123;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;  // Extract the last digit
            reversed = (reversed * 10) + digit;  // Append digit to reversed number
            num /= 10;  // Remove the last digit from number
        }

        System.out.println("The reverse of the given number is: "+ reversed);
    }
}
