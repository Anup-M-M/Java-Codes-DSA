package main.java.org.anup.threadsss.syncronization.ex1;

public class Counter {

    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }

}
