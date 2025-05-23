package main.java.org.anup.over.override;

class Parent1 {
    private void show() {  // Private method in parent
        System.out.println("Parent show method");
    }
}

class Child1 extends Parent1 {
    void show() {  // This is a new method, not an override
        System.out.println("Child show method");
    }
}

public class PrivateMethod {
    public static void main(String[] args) {
        Child1 obj = new Child1();
        obj.show();  // Calls Child's method
        //private method are not inherited by child calss so can't override.
    }
}

