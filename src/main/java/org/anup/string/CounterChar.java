package main.java.org.anup.string;

public class CounterChar {
    public static void main(String[] args) {
        // input - aaabbbccc, output - a3b3c3
        String str = "aaabbbccc";

        int counter = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i) == str.charAt(i-1)){
                counter++;
            }else{
                sb.append(str.charAt(i-1)).append(counter);
                counter = 1;
            }
        }
        sb.append(str.charAt(str.length()-1)).append(counter);
        System.out.println(sb);
    }
}
