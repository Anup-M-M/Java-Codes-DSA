package main.java.org.anup.linkedlist;


public class ReverseLinkedList {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null; // This will eventually become the new head of the reversed list.
        ListNode current = head; // This pointer will traverse the list.
        ListNode next = null; //next is used to temporarily store the next node during the reversal process.

        while (current != null) {
            next = current.next; // Store next node
            current.next = prev; // Reverse current node's pointer
            prev = current; // Move pointers one position ahead
            current = next;
        }

        return prev; // New head of the reversed list
    }

    public static void main(String[] args) {
        // Create the linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode reversedHead = ReverseLinkedList.reverseList(head);

        // Print the reversed list
        ListNode temp = reversedHead;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
