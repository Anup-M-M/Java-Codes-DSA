package main.java.org.anup.string;

//Java Program to replace lower-case characters with upper-case and vice-versa.
public class ChangeCase {
    public static void main(String[] args) {
        String str="Great Power";
        StringBuffer newStr=new StringBuffer(str);
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i)))
                newStr.setCharAt(i,Character.toLowerCase(str.charAt(i)));
            else if(Character.isLowerCase(str.charAt(i)))
                newStr.setCharAt(i,Character.toUpperCase(str.charAt(i)));
        }

        System.out.println("String after case conversion : " + newStr);
    }
}
