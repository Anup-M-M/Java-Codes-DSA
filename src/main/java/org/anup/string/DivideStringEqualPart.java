package main.java.org.anup.string;

import java.util.Arrays;

// divide a string in 'N' equal parts.
public class DivideStringEqualPart {
    public static void main(String[] args) {
        String str = "aaaabbbbcccc";
        int n = 3;

        divideStringEqualPartUsingSubString(str, n);

        divideStringEqualPart(str, n);
        
    }

    private static void divideStringEqualPart(String str, int n) {
        int len = str.length();
        int partSize = len / n;

        if (len % n != 0) {
            System.out.println("The string cannot be divided into " + n + " equal parts.");
        } else {
            char[] charArray = str.toCharArray();
            for (int i = 0; i < n; i++) {
                StringBuilder part = new StringBuilder();
                for (int j = 0; j < partSize; j++) {
                    part.append(charArray[i * partSize + j]);
                }
                System.out.println(part.toString());
            }
        }
    }

    private static void divideStringEqualPartUsingSubString(String str, int n) {
        int length = str.length();
        int temp = 0, numChars = length/n;

        String[] equalString = new String [n];

        if(length % n != 0)
            System.out.println("String cannot be divided into "+ n +" equal parts.");
        else {
            for (int i = 0; i < str.length(); i = i+numChars) {
                //Dividing string in n equal part using substring()
                String part = str.substring(i,i+numChars);
                equalString[temp] = part;
                temp++;
            }
        }
        System.out.println(Arrays.toString(equalString));
    }
}
