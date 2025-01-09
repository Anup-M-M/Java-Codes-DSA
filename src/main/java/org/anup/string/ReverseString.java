package main.java.org.anup.string;

public class ReverseString {
    public static void main(String[] args) {
        String name= "Great Work";

        int len= name.length();

//        for(int i = len-1; i>=0; i-- ){
//            System.out.print(name.charAt(i));
//        }

//        char[] chars = name.toCharArray();
//        for (int i = len-1; i>=0; i--){
//            System.out.print(chars[i]);
//        }

        StringBuffer str= new StringBuffer();

        for (int i = len-1; i>=0; i--){
            str.append(name.charAt(i));
        }
        System.out.println(str);

     // StringBuffer sb= new StringBuffer(string);
     // System.out.println(sb.reverse().toString());


    }
}
