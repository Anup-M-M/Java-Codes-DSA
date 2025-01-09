package main.java.org.anup.queue;

//A Queue is a linear data structure where elements are inserted at the rear (end) and removed from the front (beginning).
//Space Utilization: Once an element is removed from the front, the space it occupied cannot be reused, which can lead to inefficient space utilization.
public class QueueImplementation {
    private int[] queueArray;  // Array to hold queue elements
    private int front;         // Points to the front of the queue
    private int rear;          // Points to the rear of the queue
    private int capacity;      // Maximum capacity of the queue

    // Constructor to initialize the queue
    public QueueImplementation(int size) {
        queueArray = new int[size];
        capacity = size;
        front = 0;
        rear = -1;
    }

    // Method to add an element to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue " + value);
            return;
        }
        queueArray[++rear] = value;
    }

    // Method to remove and return the front element of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot dequeue.");
            return -1;
        }
        int value = queueArray[front++];
        System.out.println("value removed "+value);
        return value;
    }

    // Method to return the front element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! No element to peek.");
            return -1;
        }
        return queueArray[front];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front > rear;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return rear == capacity - 1;
    }

    // Method to display the elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Queue elements:");
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueImplementation queue = new QueueImplementation(5);

        // Enqueue elements
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();

        // Peek the front element
        System.out.println("Peek element: " + queue.peek());

        // Dequeue elements
        System.out.println("Dequeued element: " + queue.dequeue());
        queue.display();

        // Test queue underflow
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();

        // Test queue overflow
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.enqueue(80);
        queue.enqueue(90);
    }
}
