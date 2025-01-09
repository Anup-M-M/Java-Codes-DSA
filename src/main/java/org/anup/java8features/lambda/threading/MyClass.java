package main.java.org.anup.java8features.lambda.threading;

public class MyClass implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello : "+i);
        }
    }
}
