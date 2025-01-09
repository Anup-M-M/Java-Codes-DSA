package main.java.org.anup.dsa.searchingalgorithms;

// Search key element from multiple elements and used in sorted array.
// It repeatedly compares the middle element of list with target element and narrow down search range by half based on comparison result.
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {-2,1,2,3,5,6};
        int target = -2;

        int left = 0;
        int right = arr.length-1;

//        int result = binarySearch(arr, target, left, right);

        int result = binarySearchWithRecursive(arr, target, left, right);

        if(result == -1)
            System.out.println("Element not found ");
        else
            System.out.println("Element found at index : " + result );
    }

    // Time Complexity : O(log(n))
    private static int binarySearch(int[] arr, int target, int left, int right) {
        while(left <= right){
            int mid = (left + right)/2;
            if(arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                right = mid - 1;
            else
                left = mid +1;
        }
        return -1;
    }

    private static int binarySearchWithRecursive(int[] arr, int target, int left, int right) {

        if(left <= right){
            int mid = (left+right)/2;
            if(arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                return binarySearchWithRecursive(arr, target, left, mid -1);
            else
                return binarySearchWithRecursive(arr,target,mid + 1, right);
        }
        return -1;
    }
}
