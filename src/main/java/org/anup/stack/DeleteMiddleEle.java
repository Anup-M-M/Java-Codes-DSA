package main.java.org.anup.stack;

import java.util.Stack;
import java.util.Vector;

//Delete middle element of a stack without using any additional data structure.
public class DeleteMiddleEle {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();

        // push elements into the stack
        st.push('1');
        st.push('2');
        st.push('3');
        st.push('4');
        st.push('5');
        st.push('6');
        st.push('7');

       // deleteMidByBFV1(st, st.size());
        deleteMidByBFV2(st, st.size());
        deleteMiddle(st, st.size(),0);

        System.out.println("Stack after deleting middle: " + st);
    }

    private static void deleteMiddle(Stack<Character> stack, int size, int currentIndex) {
        // Base condition: If currentIndex reaches the middle index, remove the element
        if (currentIndex == size / 2) {
            stack.pop();
            return;
        }

        // Pop the top element and go deeper into the recursion
        char top = stack.pop();
        deleteMiddle(stack, size, currentIndex + 1);

        // Push the element back after handling the middle
        stack.push(top);
    }


    private static void deleteMidByBFV2(Stack<Character> stack, int size) {
        // Find the middle index
        int middleIndex = stack.size() / 2;

        // Use an auxiliary stack to temporarily hold elements
        Stack<Character> tempStack = new Stack<>();

        // Pop elements from the original stack until the middle index
        for (int i = 0; i < middleIndex; i++) {
            tempStack.push(stack.pop());
        }

        // Remove the middle element
        stack.pop();

        // Push the elements back from the temporary stack to the original stack
        while (!tempStack.isEmpty()) {
            stack.push(tempStack.pop());
        }

    }

    private static void deleteMidByBFV1(Stack<Character> st, int size) {

        // Use a vector to hold the elements temporarily
        Vector<Character> v = new Vector<>();
        while (!st.empty()) {
            v.add(st.pop());
        }

        System.out.println(v); //[7, 6, 5, 4, 3, 2, 1]

        // Calculate the size and middle index
        int n = v.size();
        int target = n / 2; // Middle index (works for both even and odd sizes)

        // Push all elements back except the middle one
        for (int i = 0; i < n; i++) {
            if (i == target) continue; // Skip the middle element
            st.push(v.get(i));
        }

        System.out.println(st); // [7, 6, 5, 3, 2, 1]

        // Print the stack after removing the middle element
        System.out.print("Printing stack after deletion of middle: ");
        while (!st.empty()) {
            char p = st.pop();
            System.out.print(p + " ");
        }
    }
}
