package main.java.org.anup.over.override;

class Parent {
    private void show() {
        System.out.println("Parent show method");
    }

    void print() {
        System.out.println("Parent print method");
    }

}

class Child extends Parent {
    void display() {  // Method only in Child class
        System.out.println("Child display method");
    }

    void show() {
        System.out.println("Child show method");
    }
}

public class MethodTest {
    public static void main(String[] args) {
        Parent obj = new Child(); // Upcasting
        //obj.display(); // Compilation Error: cannot find symbol
        // Method resolution determine at compile time based refence type so parent class doesn't have display methos so gives compile time error.
    }
}

