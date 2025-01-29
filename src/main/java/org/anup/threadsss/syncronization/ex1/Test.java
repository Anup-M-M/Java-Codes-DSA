package main.java.org.anup.threadsss.syncronization.ex1;


public class Test {
    public static void main(String[] args){

        Counter counter = new Counter();
        MyThread myThread1 = new MyThread(counter);
        MyThread myThread2 = new MyThread(counter);

        myThread1.start();
        myThread2.start();

        try {
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println(counter.getCount());

    }
}
