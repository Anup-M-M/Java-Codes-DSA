package main.java.org.anup.generics.ex2;

public class Main {
//    public static void main(String[] args) {
//        Box box = new Box();// No Type safety
//        box.setValue(1);
//        // Manual Type Casting and no compile time checking and gives runtime ClassCastException error.
//        String str = (String)box.getValue();
//        System.out.println(str);
//    }

    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(1);
        int val = box.getValue();
        System.out.println(val);
    }

}
