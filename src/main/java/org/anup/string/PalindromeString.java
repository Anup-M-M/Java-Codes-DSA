package main.java.org.anup.string;

// A string is said to be palindrome if it is the same from both the ends.
// if we try to read it from backward, it is same as forward
public class PalindromeString  {
    public static void main(String[] args) {
        String name = "Kamak";
        name = name.toLowerCase();
        int len = name.length();
//        boolean bol = isPalindrome(name);
        boolean bol = isPalindromeByRecursion(name);
        System.out.println(bol);

    }

    private static boolean isPalindromeByRecursion(String str) {
        // Base case: if the string is empty or has only one character, it is a palindrome
        if (str == null || str.length() <= 1) {
            return true;
        }

        // Check the first and last characters
        if (str.charAt(0) != str.charAt(str.length() - 1)) {
            return false;
        }

        // Recursive case: check the substring excluding the first and last characters
        return isPalindromeByRecursion(str.substring(1, str.length() - 1));
    }

    private static boolean isPalindrome(String name) {
        int len = name.length();
        for (int i = 0; i < len/2; i++) {
            if(name.charAt(i) != name.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
}
