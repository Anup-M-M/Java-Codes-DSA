package main.java.org.anup.stack;

// Stack Implementation Using Array
public class StackImplementation {
    private int[] stackArray;  // Array to hold stack elements
    private int top;           // Points to the top of the stack
    private int size;          // Maximum capacity of the stack

    // Constructor to initialize the stack
    public StackImplementation(int size) {
        stackArray = new int[size];
        this.size = size;
        top = -1;  // Initially, the stack is empty
    }

    // Method to add an element to the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack Overflow! Cannot push " + value);
            return;
        }
        stackArray[++top] = value; // increase top then add element
    }

    // Method to remove and return the top element of the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow! Cannot pop.");
            return -1;
        }
        return stackArray[top--]; // remove the element then decrease the top
    }

    // Method to return the top element without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! No element to peek.");
            return -1;
        }
        return stackArray[top];
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == size - 1;
    }

    // Method to display the elements of the stack
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Stack elements:");
        for (int i = top; i >=0 ; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StackImplementation stack = new StackImplementation(5);

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.display();

        // Peek the top element
        System.out.println("Peek element: " + stack.peek());

        // Pop elements from the stack
        System.out.println("Popped element: " + stack.pop());

        stack.display();

        // Test stack underflow
        stack.pop();
        stack.pop();
        stack.pop();

        // Test stack overflow
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
    }
}