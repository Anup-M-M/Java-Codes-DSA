package main.java.org.anup.number;

//Armstrong number is a positive m-digit number that is equal to the sum of the mth powers of their digits.
public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        boolean bol = isArmstrongNumber(num);
        System.out.println(bol);
    }

    private static boolean isArmstrongNumber(int num) {
        int temp, digits = 0, last = 0, sum = 0;
        temp = num;

        while (temp > 0) {
            temp = temp / 10;
            digits++;
        }

        temp = num;

        while (temp > 0) {
            last = temp % 10;
            sum += (int) Math.pow(last, digits);
            temp = temp / 10;
        }

        return num == sum;
    }
}

