package main.java.org.anup.linkedlistdoubly;

class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DoublyLinkedListImp {
    Node head;

    // Add node before the head
    public void addNodeBeforeHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // Add node after the head
    public void addNodeAfterHead(int data) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = head.next;
        if (head.next != null) {
            head.next.prev = newNode;
        }
        head.next = newNode;
        newNode.prev = head;
    }

    // Add node after a specific value
    public void addNodeAfterValue(int value, int data) {
        Node temp = head;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Value not found.");
            return;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        if (temp.next != null) {
            temp.next.prev = newNode;
        }
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Add node after the tail
    public void addNodeAfterTail(int data) {
        if (head == null) {
            head = new Node(data);
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        temp.next = newNode;
        newNode.prev = temp;
    }

    // Add node before the tail
    public void addNodeBeforeTail(int data) {
        if (head == null || head.next == null) {
            System.out.println("Cannot add before tail, list has less than two nodes.");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp;
        newNode.prev = temp.prev;
        if (temp.prev != null) {
            temp.prev.next = newNode;
        }
        temp.prev = newNode;
    }

    public void deleteLastNodeWithoutHead(Node tail) {
        if (tail == null) {
            System.out.println("List is empty. Nothing to delete.");
            return;
        }

        if (tail.prev == null) {
            // Case: Single node in the list
            System.out.println("Deleting the only node in the list.");
            tail = null;
            return;
        }

        // Case: More than one node
        Node beforeTail = tail.prev;
        beforeTail.next = null; // Update the next pointer of the second-last node
        tail.prev = null; // Remove the tail's reference to the previous node
    }


    // Delete a node at the middle (value 40)
    public void deleteNodeAtMiddle(int value) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }
        Node temp = head;
        while (temp != null && temp.data != value) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Value not found.");
            return;
        }
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }
        if (temp == head) {
            head = temp.next; // If the node to delete is the head
        }
    }

    // Delete a specific node (value 20)
    public void deleteSpecificNode(int value) {
        deleteNodeAtMiddle(value);
    }

    // Display the list forward
    public void displayForward() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Display the list from the end
    private void displayBackward() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        // Go to the last node
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        // Traverse backward
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedListImp dll = new DoublyLinkedListImp();

        // Add some initial nodes
        dll.addNodeAfterTail(10);
        dll.addNodeAfterTail(20);
        dll.addNodeAfterTail(30);
        dll.addNodeAfterTail(40);
        dll.addNodeAfterTail(50);

        System.out.println("Initial list:");
        dll.displayForward(); // Output: 10 20 30 40 50

        // Add node before head
        dll.addNodeBeforeHead(5);
        System.out.println("After adding before head:");
        dll.displayForward(); // Output: 5 10 20 30 40 50

        // Add node after head
        dll.addNodeAfterHead(15);
        System.out.println("After adding after head:");
        dll.displayForward(); // Output: 5 15 10 20 30 40 50

        // Add node after 20
        dll.addNodeAfterValue(20, 25);
        System.out.println("After adding after 20:");
        dll.displayForward(); // Output: 5 15 10 20 25 30 40 50

        // Add node after tail
        dll.addNodeAfterTail(60);
        System.out.println("After adding after tail:");
        dll.displayForward(); // Output: 5 15 10 20 25 30 40 50 60

        // Add node before tail
        dll.addNodeBeforeTail(55);
        System.out.println("After adding before tail:");
        dll.displayForward(); // Output: 5 15 10 20 25 30 40 50 55 60

        // Delete the last node without head
        dll.deleteLastNodeWithoutHead(dll.head);
        System.out.println("After deleting last node without head:");
        dll.displayForward(); // Output: 5 15 10 20 25 30 40 50 55

        // Delete node at middle (value 40)
        dll.deleteNodeAtMiddle(40);
        System.out.println("After deleting node with value 40:");
        dll.displayForward(); // Output: 5 15 10 20 25 30 50 55

        // Delete a specific node (value 20)
        dll.deleteSpecificNode(20);
        System.out.println("After deleting node with value 20:");
        dll.displayForward(); // Output: 5 15 10 25 30 50 55
    }
}
