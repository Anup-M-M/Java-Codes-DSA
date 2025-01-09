package main.java.org.anup.string;

public class ReverseWord {
    public static void main(String[] args) {
        // input  - I Love Coding
        // output - Coding Love I
        String str = "I Love Coding";

        /*String[] strArray = str.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = strArray.length-1; i >=0 ; i--) {
            builder.append(strArray[i]).append(" ");
        }
        System.out.println(builder);*/

        StringBuilder sb = new StringBuilder();
        int end = str.length();
        for (int i = str.length()-1; i >= 0 ; i--) {
            if(str.charAt(i) == ' '){
                sb.append(str.substring(i+1 , end)).append(" ");
                end = i;
            }
        }
        if(end != 0){
            sb.append(str.substring(0, end));
        }
        System.out.println(sb);
    }
}
