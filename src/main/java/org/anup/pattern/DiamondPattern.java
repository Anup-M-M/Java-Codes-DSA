package main.java.org.anup.pattern;

//012345678
//    *    0
//   ***   1
//  *****  2
// ******* 3
//*********4
// ******* 5
//  *****  6
//   ***   7
//    *    8
public class DiamondPattern {
    public static void main(String[] args) {
        int i, j, n = 9;
        for(i = 0; i < n ; i++){
            for (j = 0; j < n; j++) {
                if((i+j >= (n-1)/2 && i <=(n-1)/2 && j <=(n-1)/2) || (j-i <= (n-1)/2 && i <=(n-1)/2 && j >=(n-1)/2))
                    System.out.print("* ");
                else if(i-j <= (n-1)/2 && i >= (n-1)/2 && j<= (n-1)/2 ||  i + j <= ((n - 1) + (n - 1) / 2) && i >= (n-1)/2 && j>= (n-1)/2 )
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

    }
}
