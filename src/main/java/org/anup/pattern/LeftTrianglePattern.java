package main.java.org.anup.pattern;

//           *
//         * *
//       * * *
//     * * * *
//   * * * * *
// * * * * * *
public class LeftTrianglePattern
{
    public static void main(String args[])
    {
        int i, j, num=6;
        //outer loop for rows
        for(i=0; i<num; i++)
        {
            //inner loop for columns
            for(j=0; j<num; j++)
            {
                if(i+j >= (num-1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

/*        for(i=0; i<num; i++)
        {
            //inner loop for space
            for(j=i; j<num; j++)
            {
                System.out.print("  ");
            }
            //inner loops for star
            for (int k = 0; k <=i ; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/
    }
}
