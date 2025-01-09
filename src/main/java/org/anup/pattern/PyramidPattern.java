package main.java.org.anup.pattern;

public class PyramidPattern {
    public static void main(String[] args) {
        int n = 9;
        printPyramidPattern(n);
    }
//           0 1 2 3 4 5 6 7 8
//          0        *
//          1      * * *
//          2    * * * * *
//          3  * * * * * * *
//          4* * * * * * * * *
    private static void printPyramidPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if((i+j >= (n-1)/2 && i <=(n-1)/2 && j <=(n-1)/2) || (j-i <= (n-1)/2 && i <=(n-1)/2 && j >=(n-1)/2))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
