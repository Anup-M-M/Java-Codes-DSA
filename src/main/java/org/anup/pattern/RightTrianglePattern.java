package main.java.org.anup.pattern;

// *
// * *
// * * *
// * * * *
// * * * * *
// * * * * * *
public class RightTrianglePattern
{
    public static void main(String args[])
    {
        int i, j, row=6;
        //outer loop for rows
        for(i=0; i<row; i++)
        {
            //inner loop for columns
            for(j=0; j<=i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
