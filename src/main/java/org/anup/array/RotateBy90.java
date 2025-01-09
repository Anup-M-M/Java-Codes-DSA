package main.java.org.anup.array;


// Given a matrix, your task is to rotate the matrix 90 degrees clockwise.
public class RotateBy90 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};

        rotateby90(arr);

        printArray(arr);
    }

    private static void printArray(int[][] arr) {
        for(int[] a : arr){
            for(int val : a){
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private static void rotateby90(int[][] arr) {
        // step 1 : Take transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length ; j++) {
                // swap a[i][j] with a[j][i]
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // step 2 : swap the column
        int left = 0, right = arr[0].length-1;
        while(left < right){
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right]=temp;
            }
            left++;
            right--;
        }
    }
}
