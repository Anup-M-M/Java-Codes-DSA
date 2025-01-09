package main.java.org.anup.staticc;

class Parent {
    // Static method in the parent class
    public static void staticMethod() {
        System.out.println("Static method in Parent class");
    }

    // Non-static (instance) method
    public void instanceMethod() {
        System.out.println("Instance method in Parent class");
    }
}

class Child extends Parent {
    // Static method in the child class (hides the parent class static method)
    public static void staticMethod() {
        System.out.println("Static method in Child class");
    }

    // Overriding instance method
    @Override
    public void instanceMethod() {
        System.out.println("Instance method in Child class");
    }
}

public class StaticMethodContOverride{
    public static void main(String[] args) {

        Parent p = new Child();

        Child c = new Child();

        // Calling the static method using the reference type its know as Method Hiding
        p.staticMethod(); // Output: Static method in Parent class (static method can't be overridden)
        c.staticMethod(); // Output: Static method in Parent class (static method can't be overridden)

        // Calling the instance method using the reference type
        p.instanceMethod(); // Output: Instance method in Child class (instance method is overridden)
    }
}
