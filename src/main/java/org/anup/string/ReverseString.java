package main.java.org.anup.string;

public class ReverseString {
    public static void main(String[] args) {
        String name= "Hello";
        int len= name.length();
        String reversed = reverseString(name);
        System.out.println("Original String: " + name);
        System.out.println("Reversed String: " + reversed);

/*
       for(int i = len-1; i>=0; i-- ){
            System.out.print(name.charAt(i));
        }
*/

/*
        char[] chars = name.toCharArray();
        for (int i = len-1; i>=0; i--){
            System.out.print(chars[i]);
        }
*/


/*
        StringBuffer str= new StringBuffer();
        for (int i = len-1; i>=0; i--){
            str.append(name.charAt(i));
        }
        System.out.println(str);
*/

     // StringBuffer sb= new StringBuffer(string);
     // System.out.println(sb.reverse().toString());

    }

    public static String reverseString(String str) {
        // if the string is empty or has only one character, return the string itself
        if (str == null || str.length() <= 1) {
            return str;
        }

        // reverse the rest of the string except the first character,
        // and append the first character at the end
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
