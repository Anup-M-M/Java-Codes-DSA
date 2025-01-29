package main.java.org.anup.threadsss.createthread;

//Create Thread by extending the Thread Class.
//If you are customizing the behavior of the Thread class itself.
//If your class needs to override other methods of the Thread class (e.g., start(), interrupt(), etc.).
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread is running in: " + this.getName());
    }
}

public class ExtendThread {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
