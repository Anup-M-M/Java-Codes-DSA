package main.java.org.anup.number;

// Factorial of n is the product of all positive descending integers.
public class FactorialOfNum {
    public static void main(String[] args) {
        int number = 5;
//        int result = fact(number);
        int result = factByRecursion(number);
        System.out.println(result);
    }

    private static int fact(int number) {
        int fact = 1;
        for (int i = number ; i > 0; i--){
            fact = i * fact;
        }
        return fact;
    }

    private static int factByRecursion(int number) {
        if(number == 1) return 1;
        return number * fact(number-1);
    }
}
