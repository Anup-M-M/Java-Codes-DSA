package main.java.org.anup.staticc;

//Static methods are hidden, not overridden.
//The method that gets called is determined by the type of the reference at compile time, not the actual object at runtime.
//Method hiding only applies to static methods. In contrast, instance methods can be overridden, and their behavior is determined at runtime.

class Parent1 {
    public static void staticMethod() {
        System.out.println("Static method in Parent class");
    }
}

class Child1 extends Parent1 {
    public static void staticMethod() {
        System.out.println("Static method in Child class");
    }
}

public class MethodHiding {
    public static void main(String[] args) {
        Parent1 p = new Child1();
        p.staticMethod(); // Output: Static method in Parent class

        Child1 c = new Child1();
        c.staticMethod(); // Output: Static method in Child class
    }
}
