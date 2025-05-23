package main.java.org.anup.threadsss.communication;


class SharedResource{

    private int data;
    private  boolean hasData;

    public synchronized void produce(int value){
        while(hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        data = value;
        hasData = true;
        System.out.println("Produced : "+value);
        notify();
    }

    public synchronized int consume(){
        while(!hasData){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        hasData = false;
        System.out.println("Consumed : "+ data);
        notify();
        return data;
    }

}

/*class Producer implements Runnable{

    private SharedResource resource ;

    public Producer(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            resource.produce(i);
        }
    }
}*/

class Consumer implements Runnable{

    public SharedResource resource ;

    public Consumer(SharedResource resource){
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            int value = resource.consume();
        }
    }
}

public class ThreadCommunication {
    public static void main(String[] args) {

        SharedResource resource = new SharedResource();

      //  Thread producerThread = new Thread(new Producer(resource), "ProducerThread");

        // Producer thread using lambda by replacing need of creating additional Producer Class.
        Thread producerThread = new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                resource.produce(i);
            }
        },"ProducerThread");


        Thread consumerThread = new Thread(new Consumer(resource), "ConsumerThread");


        producerThread.start();
        consumerThread.start();

    }

}
