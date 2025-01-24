package main.java.org.anup.java8features.methodref;

// Step 1: Functional Interface
interface Sayable {
    void say();  // Abstract method
}

// Step 2: Class with a non-static method
public class InstanceMethodReference {

    // Non-static method
    public void saySomething() {
        System.out.println("Hello, this is a non-static method.");
    }

    // Step 3: Main method demonstrating implicit implementation
    public static void main(String[] args) {
        InstanceMethodReference methodReference = new InstanceMethodReference();  // Create an instance

        // Step 4: Method reference (implicit implementation)
        Sayable sayable = methodReference::saySomething;  // Method reference
        sayable.say();  // Calls saySomething()

        // Step 5: Equivalent Lambda Implementation (manual implementation)
       // Sayable lambdaSayable = () -> methodReference.saySomething();  // Lambda expression

        Sayable lambdaSayable = new Sayable() {
            @Override
            public void say() {
                methodReference.saySomething();
            }
        };
        lambdaSayable.say();  // Calls saySomething()
    }
}

