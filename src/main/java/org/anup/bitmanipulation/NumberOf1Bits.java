package main.java.org.anup.bitmanipulation;

public class NumberOf1Bits {
    public static void main(String[] args) {
        int number = 11;
       // int countof1s = findNumberof1bitsV1(number);
        int countof1s = findNumberof1bitsV2(number);
        System.out.println(countof1s);
    }

    //Bit Manipulation with Bit Shifting
    //Time Complexity: O(1) - The loop runs a fixed number of times (32 for a 32-bit integer), so the time complexity is constant.
    public static int findNumberof1bitsV2(int n) {
        int ans = 0;
        while (n != 0) {
            //bitwise AND operator & to check if the least significant bit (rightmost bit) of n is '1'
            if ((n & 1) == 1) ans++;
            //unsigned right shift operator >>> to shift all bits of n one position to the right.
            // This effectively removes the least significant bit we just checked.
            n = n >>> 1;
        }
        return ans;
    }

    // Time complexity is O(log n), where ( n ) is the value of the number.
    // This is because the algorithm repeatedly divides the number by 2
    private static int findNumberof1bitsV1(int number) {
        int countOf1s = 0;
        int quotient = number;
        while (quotient > 0) {
            int remainder = quotient % 2; // This operation checks the least significant bit.
            if (remainder == 1) countOf1s++;
            quotient = quotient / 2; //This shifts the bits to the right by one position.
        }
        return countOf1s;
    }
}
