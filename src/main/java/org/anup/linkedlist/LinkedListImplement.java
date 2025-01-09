package main.java.org.anup.linkedlist;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListImplement {
    static Node head = null;// Initialize head of the list

    // Add a new node to the list
    public static Node add(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode; // Return the new node as the head
        }
        //temp is only used for traversing the list
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        return head; // Return the unchanged head
    }

    // Add node before head
    private static  Node addNodeBefore(Node head) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the data for adding before node : ");
        int data = sc.nextInt();
        Node newNode=new Node(data);
        newNode.next = head;
        head = newNode;
        return head;
    }

    // Delete node at the start
    public static Node deleteAtStart(Node head) {
        if (head == null) {
            System.out.println("List is empty!");
            return null;
        }
        return head.next; // Remove the first node by updating head
    }

    // Delete a node by value
    public static Node delete(Node head, int data) {
        if (head == null) {
            System.out.println("The list is empty. Cannot delete.");
            return null;
        }
        if (head.data == data) {
            return head.next; // Move the head pointer to the next node
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        if (temp.next != null) { // Node found
            temp.next = temp.next.next; // Remove the node
        }else {
            System.out.println("Value not found in the list.");
        }

        return head; // Return the unchanged head
    }

    // Delete node in the middle (e.g., value 40)
    public static Node deleteAtMiddle(Node head, int value) {
        if (head == null) return null;

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next != null) { // Node found
            temp.next = temp.next.next; // Remove the node
        }
        return head;
    }

    // Delete node without head
    public static void deleteNodeWithoutHead(Node node) {
        if (node == null || node.next == null) {
            System.out.println("Cannot delete this node!");
            return;
        }

        // Copy data from the next node to the current node and skip the next node
        node.data = node.next.data;
        node.next = node.next.next;
    }

    // Delete the last node without the head - Not possible in singly linked list
    public static void deleteLastWithoutHead() {
        System.out.println("Not possible to delete the last node without head in singly linked list!");
    }

    // Delete all nodes
    public static Node deleteAllNodes(Node head) {
        return null; // Simply return `null` to delete the entire list
    }

    // Delete two continuous nodes
    public static Node deleteTwoContinuous(Node head) {
        if (head == null || head.next == null) {
            System.out.println("List does not have two continuous nodes to delete!");
            return head;
        }
        return head.next.next; // Skip two nodes
    }

    // Delete two non-continuous nodes (e.g., at position 2 and 4)
    public static Node deleteTwoNonContinuous(Node head, int pos1, int pos2) {
        if (head == null || pos1 >= pos2) return head;

        head = deleteAtPosition(head, pos1); // Delete the first node at pos1
        head = deleteAtPosition(head, pos2 - 1); // position of the second node (pos2) shifts one step left because the list is now shorter.
        return head;
    }

    // Helper method to delete at a specific position
    public static Node deleteAtPosition(Node head, int position) {
        if (head == null || position < 0) return head;

        if (position == 0) { // Remove the first node
            return head.next;
        }

        Node temp = head;

        //The condition i < position - 1 ensures that:
        // You stop at the node just before the target. You can adjust its next pointer to bypass the target node.
        for (int i = 0; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp != null && temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }

    // Search for a value in the list
    public static boolean search(Node head, int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                return true; // Data found
            }
            temp = temp.next;
        }
        return false; // Data not found
    }

    // Display the linked list
    public static void display(Node head) {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Main method to test static methods
    public static void main(String[] args) {


        head = add(head, 10);
        head = add(head, 20);
        head = add(head, 30);
        head = add(head, 40);
        head = add(head, 50);

        System.out.println("Linked List:");
        display(head); // Output: 10 -> 20 -> 30 ->40 ->50 -> null

        System.out.println("Search 20: " + search(head, 20)); // Output: true
        System.out.println("Search 60: " + search(head, 60)); // Output: false

        head = delete(head, 20);
        System.out.println("After deleting 20:");
        display(head); // Output: 10 -> 30 ->40 ->50 -> null

        // Delete node at the start
        head = deleteAtStart(head);
        System.out.println("After deleting the start node:");
        display(head); // output: 30 -> 40 -> 50 -> null

        // Delete node in the middle
        head = deleteAtMiddle(head, 40);
        System.out.println("After deleting node with value 40:");
        display(head); // Output : 30 -> 50 -> null

        //add node before head - 10
        head = addNodeBefore(head);

        head = deleteAllNodes(head);

        head = add(head, 10);
        head = add(head, 20);
        head = add(head, 30);
        head = add(head, 40);
        head = add(head, 50);
        head = add(head, 60);
        head = add(head, 70);

        // Delete node without head
        System.out.println("After deleting node without head (value 20):");
        deleteNodeWithoutHead(head.next); // Deletes node with value 20
        display(head); // Output : 10 -> 30 -> 40 -> 50 -> 60 -> 70 -> null

        // Delete two continuous nodes
        head = deleteTwoContinuous(head);
        System.out.println("After deleting two continuous nodes:");
        display(head); // Output : 40 -> 50 -> 60 -> 70 -> null

        // Delete two non-continuous nodes
        head = deleteTwoNonContinuous(head, 1, 3); // Delete positions 1 and 3
        System.out.println("After deleting two non-continuous nodes:");
        display(head); // Output : 40 -> 60 -> null
    }
}


