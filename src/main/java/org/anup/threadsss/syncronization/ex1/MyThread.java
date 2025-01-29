package main.java.org.anup.threadsss.syncronization.ex1;

public class MyThread extends Thread{

    private Counter counter;

    public MyThread(Counter counter){
        this.counter = counter;
    }

    public void run(){
        for (int i = 0; i < 10000000; i++) {
            counter.increment();
        }
    }

}
