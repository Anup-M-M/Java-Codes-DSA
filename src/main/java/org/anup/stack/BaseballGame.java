package main.java.org.anup.stack;

import java.util.Stack;

//leetcode - 682
//Input: ops = ["5","2","C","D","+"]
//Output: 30
//Explanation:
//"5" - Add 5 to the record, record is now [5].
//"2" - Add 2 to the record, record is now [5, 2].
//"C" - Invalidate and remove the previous score, record is now [5]. //Invalidate the previous score, removing it from the record.
//"D" - Add 2 * 5 = 10 to the record, record is now [5, 10]. //Record a new score that is the double of the previous score
//"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15]. //Record a new score that is the sum of the previous two scores.
//The total sum is 5 + 10 + 15 = 30.
public class BaseballGame {
    public static void main(String[] args) {
        String[] strArray = {"5", "2", "C", "D", "+"};
        calPoints(strArray);
    }

    public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();

        for (String op : ops) {
            if (op.equals("+")) {
                // Add the last two scores
                int top = stack.pop();
                int newScore = top + stack.peek();
                stack.push(top); // Push the last score back
                stack.push(newScore);
            } else if (op.equals("D")) {
                // Double the last score
                stack.push(2 * stack.peek());
            } else if (op.equals("C")) {
                // Remove the last score
                stack.pop();
            } else {
                // Push the numeric score
                stack.push(Integer.parseInt(op));
            }
        }

        // Sum all the scores
        int totalScore = 0;
        for (int score : stack) {
            totalScore += score;
        }

        return totalScore;
    }


}
