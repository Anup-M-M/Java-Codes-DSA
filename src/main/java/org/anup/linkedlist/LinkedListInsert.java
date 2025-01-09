package main.java.org.anup.linkedlist;

public class LinkedListInsert {

    // Definition for singly-linked list node
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert a node at a given position
    public static Node insertAtPosition(Node head, int data, int position) {
        Node newNode = new Node(data);

        // Insert at the head
        if (position == 0) {
            newNode.next = head;
            return newNode; // New node becomes the new head
        }

        // Traverse to the position - 1
        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }

        // Check if temp is null (position is out of bounds)
        if (temp == null) {
            System.out.println("Position out of bounds");
            return head; // Return unchanged list
        }

        // Insert the new node
        newNode.next = temp.next;
        temp.next = newNode;

        return head; // Return the unchanged head
    }

    // Print the list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create the linked list: 10 -> 20 -> 30
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Original List:");
        printList(head);

        // Insert 15 at position 1
        head = insertAtPosition(head, 15, 1);
        System.out.println("After inserting 15 at position 1:");
        printList(head);

        // Insert 5 at position 0 (new head)
        head = insertAtPosition(head, 5, 0);
        System.out.println("After inserting 5 at position 0:");
        printList(head);

        // Insert 35 at position 3 (end of the list)
        head = insertAtPosition(head, 35, 3);
        System.out.println("After inserting 35 at position 3:");
        printList(head);

        // Attempt to insert at position 6 (beyond the current length)
        head = insertAtPosition(head, 50, 7);
        System.out.println("After attempting to insert 50 at position 6:");
        printList(head);
    }
}