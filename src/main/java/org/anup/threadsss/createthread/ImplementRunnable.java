package main.java.org.anup.threadsss.createthread;

//Create Thread by implements Runnable Interface
//Implementing Runnable is generally considered the better practice in real-world applications.
//Implementing Runnable allows you to separate the task (the logic you want to execute in a thread) from the thread itself. This improves the reusability and flexibility of your code.
//Java only allows multiple inheritance. If you extend Thread, your class cannot extend any other class. By implementing Runnable, your class can still extend another class if needed.
//With Runnable, you can use thread pooling (via ExecutorService) to manage threads more efficiently. This is critical for high-performance applications
class MyTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Task is running in thread: " + Thread.currentThread().getName());
    }
}

public class ImplementRunnable {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyTask()); // Pass task to thread
        thread.start();
    }
}
