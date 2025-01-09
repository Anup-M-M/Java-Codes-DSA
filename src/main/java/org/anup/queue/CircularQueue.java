package main.java.org.anup.queue;

// A Circular Queue is a linear data structure where the last position is connected back to the first position, forming a circle.
// More efficient in space utilization because it reuses the space of removed elements. When the rear reaches the end of the queue, it wraps around to the beginning if there is space.
//The enqueue and dequeue operations use (index + 1) % capacity to manage the circular nature of the queue.
public class CircularQueue {
    private int[] queueArray;  // Array to hold queue elements
    private int front;         // Points to the front of the queue
    private int rear;          // Points to the rear of the queue
    private int capacity;      // Maximum capacity of the queue
    private int size;          // Current size of the queue

    // Constructor to initialize the queue
    public CircularQueue(int capacity) {
        queueArray = new int[capacity];
        this.capacity = capacity;
        front = 0;
        rear = -1;
        size = 0;
    }

    // Method to add an element to the queue
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot enqueue " + value);
            return;
        }
        rear = (rear + 1) % capacity; // Circular increment
        queueArray[rear] = value;
        size++;
    }

    // Method to remove and return the front element of the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot dequeue.");
            return -1;
        }
        int value = queueArray[front];
        front = (front + 1) % capacity; // Circular increment
        size--;
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
        return size == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Method to display the elements of the queue
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return;
        }
        System.out.println("Queue elements:");
        for (int i = 0; i < size; i++) {
            System.out.print(queueArray[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

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
