package main.java.org.anup.string;

// Determine whether one string is a rotation of another
public class StringRotation {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "deabc";

        if(str1.length() != str2.length())
            System.out.println("String 2 is not rotation of String 1");
        else{
            str1 = str1.concat(str1);
            if(str1.contains(str2))
                System.out.println("Second string is a rotation of first string");
            else
                System.out.println("Second string is not a rotation of first string");
        }
    }
}
