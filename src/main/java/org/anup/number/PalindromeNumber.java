package main.java.org.anup.number;

// Palindrome number is a number that is same after reverse
public class PalindromeNumber {
    public static void main(String[] args) {
        int num=123, result=0 , rem= 0;
        int temp=num;
        while(num > 0){
            rem = num % 10;
            result = (result * 10) + rem;
            num=num/10;
        }
        if(temp == result){
            System.out.println("Number is Palindrome number");
        }else {
            System.out.println("Number is not Palindrome number");
        }

    }
}
