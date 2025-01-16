package main.java.org.anup.dsa.searchingalgorithms.que;

// leetcode 34
// Given a sorted array arr of n integers and a target value.
// Write a program to find the indices of the first and the last occurrences of the target value.
// If the target is not found then return -1 as indices.
public class FirstAndLastOccurrences {
    public static void main(String[] args) {
        int[] arr = {2,3,3,3,4,5,5,5,5,5,5,8};
        int target = 5;
        int[] ans = firstAndLastPositionLinearSearch(arr, target);
    //  int[] ans = firstAndLastPositionBinarySearch(arr, target);
        System.out.println("The first and last positions are: "
                + ans[0] + " " + ans[1]);
    }

    // Linear Search : Time Complexity: O(N), Space Complexity: O(1)
    private static int[] firstAndLastPositionLinearSearch(int[] arr, int target) {
        int first = -1, last = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                if (first == -1)
                    first = i;
                last = i;
            }
        }
        return new int[] {first, last};
    }

    // Binary search - Time Complexity : O(2*logN), Space Complexity : O(1)
    private static int[] firstAndLastPositionBinarySearch(int[] a, int target) {
        int left = 0, right = a.length-1;
        int first = -1;

        // find first position
        while(left <= right){
            int mid = (left+right)/2;
            if(a[mid] == target){
                first = mid; // Possible ans
                right = mid - 1;
            } else if (a[mid] < target) {
                left = mid +1;
            } else {
                right = mid -1;
            }
        }

        left = 0;
        right = a.length-1;
        int last = -1;

        // find last position
        while(left <= right){
            int mid = (left+right)/2;
            if(a[mid] == target){
                last = mid; // Possible ans
                left = mid + 1;
            } else if (a[mid] < target) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return new int[] {first, last};
    }
}
