package main.java.org.anup;

import java.io.FileNotFoundException;

public class Whiz {
    public static void main(String[] args) {
        type(10);
        try{
            type();
        }catch (Exception e){
            System.out.println(e );
        }

    }

    public static void type(int x) {
        System.out.print("int");
    }

    public static void type() throws FileNotFoundException {
        System.out.print("double");
    }

    public static void type(byte x) {
        System.out.print("byte");
    }

    private static void type(float x) {
        System.out.print("float");
    }
}
