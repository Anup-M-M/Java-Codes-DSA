package main.java.org.anup.bitmanipulation;

public class ReverseBits {
    public static void main(String[] args) {
        int num = 10;
        int revNum = reverseBits(num);
        System.out.println(revNum);
    }

    private static int reverseBits(int num) {
        int result = 0;
        //We use a for loop to iterate through all 32 bits of the input integer n
        for (int i = 0; i < 32; i++) {
            //we shift result left by 1 bit to make space for the next bit.
             result = result << 1;
             //We use the bitwise AND operator & to get the least significant bit of n -> (n & 1).
             //We then use the bitwise OR operator | to set this bit in result.
             result = result | (num & 1);
             // unsigned right shift operator >>> to shift n right by 1 bit, discarding the least significant bit we just processed.
             num = num >>> 1;
        }
        return result;
    }
}
