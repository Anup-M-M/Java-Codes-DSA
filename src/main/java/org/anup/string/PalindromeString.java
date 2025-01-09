package main.java.org.anup.string;

// A string is said to be palindrome if it is the same from both the ends.
// if we try to read it from backward, it is same as forward
public class PalindromeString  {
    public static void main(String[] args) {
        String name = "Kamak";
        name = name.toLowerCase();
        int len = name.length();
//        boolean bol = isPalindrome(name);
        boolean bol = isPalindromeByRecursion(0, len-1, name);
        System.out.println(bol);

    }

    private static boolean isPalindromeByRecursion(int l, int r, String s) {

        if(l>=r) return true;

        if(s.charAt(l)!=s.charAt(r)) return false;

        return isPalindromeByRecursion(l+1, r-1, s);
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
