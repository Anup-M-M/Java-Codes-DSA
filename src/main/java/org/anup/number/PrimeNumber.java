package main.java.org.anup.number;

//Prime number is a number that is greater than 1 and divided by 1 or itself only.
//In other words, prime numbers can't be divided by other numbers than itself or 1.
public class PrimeNumber {
    public static void main(String[] args) {
        int num = 7;
        boolean bol = isPrime(num);
        System.out.println(bol);
    }

    private static boolean isPrime(int num) {
        int sqNum = (int) Math.sqrt(num);
        if(num<=1)
            return false;
        else {
            for (int i = 2; i < sqNum; i++) {
                if (num % i == 0)
                    return false;
            }
            return true;
        }
    }
}
