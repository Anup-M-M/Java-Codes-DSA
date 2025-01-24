package main.java.org.anup.java8features.excercise;

import java.util.function.Predicate;

// check string is Palindrome using lambda expression
public class CheckStringPalindrome {
    public static void main(String[] args) {

        String string = "madam";

        Predicate<String> isPalindrome = name -> {
            int len = name.length();
            for (int i = 0; i < len/2; i++) {
                if(name.charAt(i) != name.charAt(len-1-i)){
                    return false;
                }
            }
            return false;

            //String reversed = new StringBuffer(str).reverse().toString();
            //return name.equals(reversed);
        };

        boolean isPalindromeResult = isPalindrome.test(string);
        System.out.println(isPalindromeResult);

        if(isPalindromeResult)
            System.out.println(string + " is a palindrome");
        else
            System.out.println(string + " is a not palindrome");

/*
        Predicate<String> isPalindrome = new Predicate<String>() {
            @Override
            public boolean test(String str) {
                String reversed = new StringBuffer(str).reverse().toString();

                return str.equals(reversed);
            }
        };
*/

    }
}
