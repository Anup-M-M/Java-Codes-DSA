package main.java.org.anup.java8features.lambda.threading;

public class Main {
    public static void main(String[] args) {

//        MyClass myClass = new MyClass();
//        Thread thread = new Thread(myClass);
//        thread.run();

        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi - through lamba expression witout creating implementation class : "+i);
            }
        };

        runnable.run();
    }
}
