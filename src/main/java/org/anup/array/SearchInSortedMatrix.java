package main.java.org.anup.array;

public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,4,6,8,10},
                {2,7,9,12,15},
                {3,11,20,22,24},
                {5,16,25,30,40}};

        int target = 16;

//        boolean bol = searchInMatrixByBinarySearch(arr, target);
        boolean bol = searchInMatrixByLinearSearch(arr, target);
        System.out.println(bol);
    }

    // Time Complexity: O(N X M), where N = given row number, M = given column number.
    // Space Complexity: O(1) as we are not using any extra space.
    private static boolean searchInMatrixByLinearSearch(int[][] arr, int target) {
        int n = arr.length-1;
        int m = arr[0].length-1;
        System.out.println(n + " "+ m);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == target)
                    return true;
            }
        }
        return false;
    }

    // Time Complexity: O(N+M), We are starting traversal from (0, M-1), and at most, we can end up being in the cell (M-1, 0). So, the total distance can be at most (N+M).
    // Space Complexity: O(1)
    private static boolean searchInMatrixByBinarySearch(int[][] arr, int target) {
        int i = 0 , j = arr.length-1;

        while(i < arr.length && j <= 0){
            if(arr[i][j] == target)
                return true;
            else if (arr[i][j] < target)
                i ++;
            else
                j--;
        }
        return false;
    }
}
