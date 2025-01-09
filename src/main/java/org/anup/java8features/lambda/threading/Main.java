package main.java.org.anup.java8features.lambda.threading;

public class Main {
    public static void main(String[] args) {

//        MyClass myClass = new MyClass();
//        Thread childThread = new Thread(myClass);
//        childThread.run();

        Runnable runnable = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hi : "+i);
            }
        };

        runnable.run();
    }
}
