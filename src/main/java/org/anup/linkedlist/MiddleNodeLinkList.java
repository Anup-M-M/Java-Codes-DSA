package main.java.org.anup.linkedlist;

//leetcode - 876 Middle of the Linked List
//Given the head of a singly linked list, return the middle node of the linked list.
//If there are two middle nodes, return the second middle node.
//Input: head = [1,2,3,4,5] Output: [3,4,5]
//Input: head = [1,2,3,4,5,6] Output: [4,5,6]
public class MiddleNodeLinkList {
    public static void main(String[] args) {
        // Create the linked list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        ListNode middle = MiddleNodeLinkList.middleNode(head);

        // Print the value of the middle node
        System.out.println("The middle node value is: " + middle.val);

    }

    private static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next !=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // When fast pointer reaches the end, slow pointer will be at the middle
        return slow;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
