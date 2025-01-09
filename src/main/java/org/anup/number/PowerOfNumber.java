package main.java.org.anup.number;

public class PowerOfNumber {
    public static void main(String[] args) {
        int x = 3;
        int n = 5;
//        int result = powerOfNumber(x,n);
      int result = powerOfNumberByRecursionV1(x,n);
       // long result = powerOfNumberByRecursionV2(x,n);
        System.out.println(result);
    }

    // Time complexity : O(log n)
    // Space complexity : O(log n)
    private static long powerOfNumberByRecursionV2(int x, int n) {
        if (n == 0) return 1;
//      recursion call
        long res = powerOfNumberByRecursionV2(x, n / 2);
        System.out.println(res);
//      if n is odd then we will have to multiply X
        if (n % 2 == 1) {
            System.out.println("Inside if : "+ (res * res * x));
            return res * res * x;
        }
        else{
            System.out.println("Inside else : "+ (res * res));
            return res * res;
        }
    }

    // Time Complexity :O(n) - n is number of nodes
    // Space complexity : O(n) - n is height of tree
    private static int powerOfNumberByRecursionV1(int x, int n) {
        if(n == 0) return 1;
        return x * powerOfNumberByRecursionV1(x, n-1);
    }

    private static int powerOfNumber(int x, int n) {
        int ans = 1;
        for (int i = 0; i < n; i++) {
            ans = ans * x;
        }
        return ans;
    }
}
