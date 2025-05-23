package main.java.org.anup.threadsss.lifecycle;

public class MyThreadLC extends Thread{

    @Override
    public void run(){
        System.out.println("RUNNING"); // Running State
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }


    public static void main(String[] args) throws InterruptedException {

        MyThreadLC myThread = new MyThreadLC();
        System.out.println(myThread.getState()); // NEW State

        myThread.start();
        System.out.println(myThread.getState()); // RUNNABLE State

        Thread.sleep(100); //Causes the currently executing thread to sleep for the specified number of milliseconds.
        System.out.println(myThread.getState()); // TIMED_WAITING State

        myThread.join(); // Caller thread(main) Waits for this thread(myThread) to die.
        System.out.println(myThread.getState()); // TERMINATED State

    }
}
