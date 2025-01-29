package main.java.org.anup.excepton;

public class ReturnInException {
    //In try: You can use return, but the execution of finally will still occur before the value is returned.
    //In catch: You can use return, and finally will also execute before the value is returned.
    //In finally: You can use return, but it can override the return value from try or catch.
    public static int testMethod() {
        try {
            System.out.println("In try block");
            return 1; // This value is initially returned
        } catch (Exception e) {
            System.out.println("In catch block");
            return 2; // Not executed in this example
        } finally {
            System.out.println("In finally block");
            return 3; // Overrides the return value from try
        }
    }

    public static void main(String[] args) {
        System.out.println("Return value: " + testMethod());
    }
}
